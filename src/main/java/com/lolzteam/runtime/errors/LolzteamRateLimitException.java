package com.lolzteam.runtime.errors;

import java.time.Duration;

/**
 * Exception for rate limit (429) responses.
 */
public class LolzteamRateLimitException extends LolzteamApiException {

    private final Duration retryAfter;

    public LolzteamRateLimitException(String message, String responseBody, Duration retryAfter) {
        super(message, 429, responseBody);
        this.retryAfter = retryAfter;
    }

    public Duration getRetryAfter() { return retryAfter; }

    @Override
    public String toString() {
        return "LolzteamRateLimitException{retryAfter=" + retryAfter +
                ", message='" + getMessage() + "'}";
    }
}
