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

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

public final class CircuitBreaker {
    public enum State {CLOSED, OPEN, HALF_OPEN}

    private final int failureThreshold;
    private final long openTimeoutMs;
    private final AtomicInteger failureCount = new AtomicInteger(0);
    private final AtomicLong lastFailureTime = new AtomicLong(0);
    private volatile State state = State.CLOSED;

    public CircuitBreaker(final int failureThreshold, final long openTimeoutMs) {
        this.failureThreshold = failureThreshold;
        this.openTimeoutMs = openTimeoutMs;
    }

    /**
     * Determines if a request is allowed based on the current state of the circuit breaker.
     * <p>
     * If the circuit breaker is in the OPEN state, it checks whether the open timeout period
     * has elapsed since the last failure. If so, it transitions to the HALF_OPEN state and
     * allows the request. Otherwise, it denies the request.
     * <p>
     * If the circuit breaker is in the CLOSED or HALF_OPEN state, it allows the request.
     *
     * @return true if the request is allowed, false otherwise
     */
    public synchronized boolean allowRequest() {
        if (state == State.OPEN) {
            if (System.currentTimeMillis() - lastFailureTime.get() > openTimeoutMs) {
                state = State.HALF_OPEN;
                return true;
            }

            return false;
        }

        return true;
    }

    /**
     * Records a successful operation, resetting the failure count to zero
     * and changing the circuit breaker state to CLOSED.
     */
    public synchronized void recordSuccess() {
        failureCount.set(0);
        state = State.CLOSED;
    }

    /**
     * Records a failure event in the circuit breaker. If the number of
     * consecutive failures exceeds the failure threshold, the breaker is
     * transitioned to the {@link State#OPEN} state and the timestamp of the
     * last failure is recorded.
     */
    public synchronized void recordFailure() {
        if (failureCount.incrementAndGet() >= failureThreshold) {
            state = State.OPEN;
            lastFailureTime.set(System.currentTimeMillis());
        }
    }

    /**
     * Gets the current state of the circuit breaker.
     *
     * @return the state of the circuit breaker
     */
    public State getState() {
        return state;
    }
}