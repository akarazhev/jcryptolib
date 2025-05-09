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

package com.github.akarazhev.jcryptolib;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import static org.junit.jupiter.api.Assertions.fail;

public class DataStreamsTest {

    /**
     * Testing private constructor for code coverage.
     * <p>
     * Use reflection to access the private constructor, and assert that it throws an exception.
     * <p>
     * When using reflection, the UnsupportedOperationException is wrapped in an InvocationTargetException.
     */
    @Test
    void constructorShouldThrowException() {
        // Testing private constructor for code coverage
        try {
            // Use reflection to access the private constructor
            final var constructor = DataStreams.class.getDeclaredConstructor();
            constructor.setAccessible(true);
            constructor.newInstance();
            fail("Constructor should have thrown an exception");
        } catch (final Exception e) {
            // When using reflection, the UnsupportedOperationException is wrapped in an InvocationTargetException
            final var cause = e.getCause();
            assertInstanceOf(UnsupportedOperationException.class, cause,
                    "Root cause should be UnsupportedOperationException, but was: " + cause.getClass().getName());
        }
    }
}
