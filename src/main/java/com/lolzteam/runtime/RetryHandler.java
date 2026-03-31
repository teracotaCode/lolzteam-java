package com.lolzteam.runtime;

import com.lolzteam.runtime.errors.LolzteamApiException;
import com.lolzteam.runtime.errors.LolzteamNetworkException;
import com.lolzteam.runtime.errors.LolzteamRateLimitException;

import java.time.Duration;
import java.util.Set;
import java.util.concurrent.Callable;

/**
 * Handles automatic retries with exponential backoff.
 */
public class RetryHandler {

    private static final Set<Integer> RETRYABLE_STATUS_CODES = Set.of(429, 502, 503, 504);

    private final RetryConfig config;

    public RetryHandler(RetryConfig config) {
        this.config = config;
    }

    public RetryConfig getConfig() {
        return config;
    }

    /**
     * Execute a callable with retry logic.
     *
     * @param <T>      return type
     * @param callable the operation to execute
     * @return the result
     * @throws Exception if all retries are exhausted
     */
    public <T> T execute(Callable<T> callable) throws Exception {
        if (!config.isEnabled()) {
            return callable.call();
        }

        Exception lastException = null;
        for (int attempt = 0; attempt <= config.getMaxRetries(); attempt++) {
            try {
                return callable.call();
            } catch (Exception e) {
                lastException = e;
                if (!isRetryable(e) || attempt >= config.getMaxRetries()) {
                    throw e;
                }
                Duration delay = getDelay(e, attempt);
                try {
                    Thread.sleep(delay.toMillis());
                } catch (InterruptedException ie) {
                    Thread.currentThread().interrupt();
                    throw e;
                }
            }
        }
        throw lastException;
    }

    /**
     * Check if an exception is retryable.
     */
    public boolean isRetryable(Exception e) {
        if (e instanceof LolzteamRateLimitException) {
            return true;
        }
        if (e instanceof LolzteamNetworkException) {
            return true;
        }
        if (e instanceof LolzteamApiException apiEx) {
            return RETRYABLE_STATUS_CODES.contains(apiEx.getStatusCode());
        }
        if (e instanceof java.net.SocketTimeoutException || e instanceof java.net.ConnectException) {
            return true;
        }
        return false;
    }

    private Duration getDelay(Exception e, int attempt) {
        if (e instanceof LolzteamRateLimitException rle && rle.getRetryAfter() != null) {
            return rle.getRetryAfter();
        }
        return config.getDelayForAttempt(attempt);
    }
}
