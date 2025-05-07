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

package com.github.akarazhev.jcryptolib.config;

import java.io.IOException;
import java.util.Properties;

public final class AppConfig {
    private static final Properties PROPERTIES = new Properties();

    static {
        try (final var input = AppConfig.class.getClassLoader().getResourceAsStream("application.properties")) {
            if (input == null) {
                throw new RuntimeException("application.properties not found in classpath");
            }

            PROPERTIES.load(input);
        } catch (IOException ex) {
            throw new RuntimeException("Failed to load application.properties", ex);
        }
    }

    private AppConfig() {
        throw new UnsupportedOperationException();
    }

    public static String getAsString(final String key) {
        return get(key);
    }

    public static boolean getAsBoolean(final String key) {
        return Boolean.parseBoolean(get(key));
    }

    public static int getAsInt(final String key) {
        return Integer.parseInt(get(key));
    }

    public static long getAsLong(final String key) {
        return Long.parseLong(get(key));
    }

    private static String get(final String key) {
        var value = System.getenv(key);
        if (value != null) {
            return value;
        }

        value = PROPERTIES.getProperty(key);
        if (value != null) {
            return value;
        }

        throw new RuntimeException("Property " + key + " not found");
    }
}
