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

import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;

public final class HealthCheck {
    public enum Status {HEALTHY, DEGRADED, UNHEALTHY}

    private final AtomicReference<Status> status = new AtomicReference<>(Status.HEALTHY);
    private final Consumer<Status> onStatusChange;

    public HealthCheck(final Consumer<Status> onStatusChange) {
        this.onStatusChange = onStatusChange;
    }

    /**
     * Updates the health status and triggers a callback if the status changes.
     *
     * <p>This method sets the current health status to the specified {@code newStatus}.
     * If the new status is different from the previous status and a status change
     * consumer is provided, it calls the consumer with the new status.</p>
     *
     * @param newStatus the new health status to be set
     */
    public void setStatus(final Status newStatus) {
        final var prev = status.getAndSet(newStatus);
        if (prev != newStatus && onStatusChange != null) {
            onStatusChange.accept(newStatus);
        }
    }

    /**
     * Get the current status of the health check.
     *
     * @return the status
     */
    public Status getStatus() {
        return status.get();
    }
}
