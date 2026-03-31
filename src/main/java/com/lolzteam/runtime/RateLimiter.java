package com.lolzteam.runtime;

import java.util.concurrent.locks.ReentrantLock;

/**
 * Token bucket rate limiter with sliding window.
 */
public class RateLimiter {

    private final RateLimitConfig config;
    private final ReentrantLock lock = new ReentrantLock();
    private long[] timestamps;
    private int index;
    private int count;

    public RateLimiter(RateLimitConfig config) {
        this.config = config;
        if (config.isEnabled()) {
            this.timestamps = new long[config.getMaxRequests()];
        }
        this.index = 0;
        this.count = 0;
    }

    public RateLimitConfig getConfig() {
        return config;
    }

    /**
     * Wait until a request can be made within the rate limit.
     *
     * @throws InterruptedException if the thread is interrupted while waiting
     */
    public void acquire() throws InterruptedException {
        if (!config.isEnabled()) return;

        lock.lock();
        try {
            long now = System.currentTimeMillis();
            long windowMs = config.getWindow().toMillis();

            if (count < config.getMaxRequests()) {
                // Bucket not full yet
                timestamps[index] = now;
                index = (index + 1) % timestamps.length;
                count++;
                return;
            }

            // Bucket is full — find the oldest timestamp
            int oldestIndex = index; // next to be overwritten = oldest
            long oldest = timestamps[oldestIndex];
            long waitUntil = oldest + windowMs;

            if (now < waitUntil) {
                long waitMs = waitUntil - now;
                lock.unlock();
                try {
                    Thread.sleep(waitMs);
                } finally {
                    lock.lock();
                }
                now = System.currentTimeMillis();
            }

            timestamps[index] = now;
            index = (index + 1) % timestamps.length;
        } finally {
            lock.unlock();
        }
    }

    /**
     * Check if a request can be made immediately without waiting.
     */
    public boolean tryAcquire() {
        if (!config.isEnabled()) return true;

        lock.lock();
        try {
            long now = System.currentTimeMillis();
            long windowMs = config.getWindow().toMillis();

            if (count < config.getMaxRequests()) {
                timestamps[index] = now;
                index = (index + 1) % timestamps.length;
                count++;
                return true;
            }

            int oldestIndex = index;
            long oldest = timestamps[oldestIndex];
            if (now - oldest >= windowMs) {
                timestamps[index] = now;
                index = (index + 1) % timestamps.length;
                return true;
            }

            return false;
        } finally {
            lock.unlock();
        }
    }
}
