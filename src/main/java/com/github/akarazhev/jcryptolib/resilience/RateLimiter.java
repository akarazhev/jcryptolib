/*
 * MIT License
 *
 * Copyright (c) 2025 Andrey Karazhev
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.github.akarazhev.jcryptolib.resilience;

import java.util.concurrent.atomic.AtomicLong;

public final class RateLimiter {
    private final int intervalMs;
    private final AtomicLong lastAcquired = new AtomicLong(0);

    public RateLimiter(final int intervalMs) {
        this.intervalMs = intervalMs;
    }

    /**
     * Acquires a permit if the time elapsed since the last acquired permit
     * exceeds the specified interval. Otherwise, the method returns false.
     *
     * @return true if the permit was acquired, false otherwise
     */
    public synchronized boolean tryAcquire() {
        final var now = System.currentTimeMillis();
        if (now - lastAcquired.get() >= intervalMs) {
            lastAcquired.set(now);
            return true;
        }

        return false;
    }
}
