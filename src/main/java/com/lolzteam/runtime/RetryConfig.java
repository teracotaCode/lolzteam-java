package com.lolzteam.runtime;

import java.time.Duration;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Configuration for request retry behavior.
 */
public class RetryConfig {

    public static final RetryConfig DEFAULT = new RetryConfig(3, Duration.ofSeconds(1), 2.0, Duration.ofSeconds(30));
    public static final RetryConfig DISABLED = new RetryConfig(0, Duration.ZERO, 1.0, Duration.ZERO);

    private final int maxRetries;
    private final Duration initialDelay;
    private final double backoffMultiplier;
    private final Duration maxDelay;

    public RetryConfig(int maxRetries, Duration initialDelay, double backoffMultiplier, Duration maxDelay) {
        if (maxRetries < 0) throw new IllegalArgumentException("maxRetries must be >= 0");
        if (backoffMultiplier < 1.0) throw new IllegalArgumentException("backoffMultiplier must be >= 1.0");
        this.maxRetries = maxRetries;
        this.initialDelay = initialDelay;
        this.backoffMultiplier = backoffMultiplier;
        this.maxDelay = maxDelay;
    }

    public int getMaxRetries() { return maxRetries; }
    public Duration getInitialDelay() { return initialDelay; }
    public double getBackoffMultiplier() { return backoffMultiplier; }
    public Duration getMaxDelay() { return maxDelay; }
    public boolean isEnabled() { return maxRetries > 0; }

    /**
     * Compute delay for the given attempt (0-based) with jitter.
     * Applies ±25% random jitter to the exponential backoff delay.
     */
    public Duration getDelayForAttempt(int attempt) {
        long baseDelayMs;
        if (attempt <= 0) {
            baseDelayMs = initialDelay.toMillis();
        } else {
            baseDelayMs = (long) (initialDelay.toMillis() * Math.pow(backoffMultiplier, attempt));
        }
        // Apply ±25% jitter
        double jitter = (ThreadLocalRandom.current().nextDouble() * 0.5 - 0.25) * baseDelayMs;
        long delayMs = Math.max(0, (long) (baseDelayMs + jitter));
        return Duration.ofMillis(Math.min(delayMs, maxDelay.toMillis()));
    }

    @Override
    public String toString() {
        return "RetryConfig{maxRetries=" + maxRetries +
                ", initialDelay=" + initialDelay +
                ", backoffMultiplier=" + backoffMultiplier +
                ", maxDelay=" + maxDelay + "}";
    }
}
