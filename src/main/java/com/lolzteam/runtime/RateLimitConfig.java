package com.lolzteam.runtime;

import java.time.Duration;

/**
 * Configuration for client-side rate limiting.
 */
public class RateLimitConfig {

    /** Default: 3 requests per second (Lolzteam API default). */
    public static final RateLimitConfig DEFAULT = new RateLimitConfig(3, Duration.ofSeconds(1));

    /** No rate limiting. */
    public static final RateLimitConfig DISABLED = new RateLimitConfig(Integer.MAX_VALUE, Duration.ofSeconds(1));

    private final int maxRequests;
    private final Duration window;

    public RateLimitConfig(int maxRequests, Duration window) {
        if (maxRequests <= 0) throw new IllegalArgumentException("maxRequests must be > 0");
        this.maxRequests = maxRequests;
        this.window = window;
    }

    public int getMaxRequests() { return maxRequests; }
    public Duration getWindow() { return window; }
    public boolean isEnabled() { return maxRequests != Integer.MAX_VALUE; }

    /**
     * Minimum interval between requests to respect the rate limit.
     */
    public Duration getMinInterval() {
        if (!isEnabled()) return Duration.ZERO;
        return Duration.ofMillis(window.toMillis() / maxRequests);
    }

    @Override
    public String toString() {
        return "RateLimitConfig{maxRequests=" + maxRequests + ", window=" + window + "}";
    }
}
