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

package com.github.akarazhev.jcryptolib.bybit.config;

import com.github.akarazhev.jcryptolib.config.AppConfig;

import static com.github.akarazhev.jcryptolib.bybit.config.Constants.Config.API_KEY;
import static com.github.akarazhev.jcryptolib.bybit.config.Constants.Config.API_SECRET;
import static com.github.akarazhev.jcryptolib.bybit.config.Constants.Config.BACKOFF_MULTIPLIER;
import static com.github.akarazhev.jcryptolib.bybit.config.Constants.Config.CIRCUIT_BREAKER_THRESHOLD;
import static com.github.akarazhev.jcryptolib.bybit.config.Constants.Config.CIRCUIT_BREAKER_TIMEOUT_MS;
import static com.github.akarazhev.jcryptolib.bybit.config.Constants.Config.CONNECT_TIMEOUT_MS;
import static com.github.akarazhev.jcryptolib.bybit.config.Constants.Config.FETCH_INTERVAL_MS;
import static com.github.akarazhev.jcryptolib.bybit.config.Constants.Config.INITIAL_RECONNECT_INTERVAL_MS;
import static com.github.akarazhev.jcryptolib.bybit.config.Constants.Config.MAX_RECONNECT_ATTEMPTS;
import static com.github.akarazhev.jcryptolib.bybit.config.Constants.Config.MAX_RECONNECT_INTERVAL_MS;
import static com.github.akarazhev.jcryptolib.bybit.config.Constants.Config.PING_INTERVAL_MS;
import static com.github.akarazhev.jcryptolib.bybit.config.Constants.Config.RECONNECT_RATE_LIMIT_MS;
import static com.github.akarazhev.jcryptolib.bybit.config.Constants.Config.REST_RATE_LIMIT_MS;

public final class Config {
    private Config() {
        throw new UnsupportedOperationException();
    }

    public static int getConnectTimeoutMs() {
        return AppConfig.getAsInt(CONNECT_TIMEOUT_MS);
    }

    public static int getInitialReconnectIntervalMs() {
        return AppConfig.getAsInt(INITIAL_RECONNECT_INTERVAL_MS);
    }

    public static int getMaxReconnectIntervalMs() {
        return AppConfig.getAsInt(MAX_RECONNECT_INTERVAL_MS);
    }

    public static int getMaxReconnectAttempts() {
        return AppConfig.getAsInt(MAX_RECONNECT_ATTEMPTS);
    }

    public static float getBackoffMultiplier() {
        return AppConfig.getAsFloat(BACKOFF_MULTIPLIER);
    }

    public static int getPingIntervalMs() {
        return AppConfig.getAsInt(PING_INTERVAL_MS);
    }

    public static int getFetchIntervalMs() {
        return AppConfig.getAsInt(FETCH_INTERVAL_MS);
    }

    public static int getCircuitBreakerThreshold() {
        return AppConfig.getAsInt(CIRCUIT_BREAKER_THRESHOLD);
    }

    public static int getCircuitBreakerTimeoutMs() {
        return AppConfig.getAsInt(CIRCUIT_BREAKER_TIMEOUT_MS);
    }

    public static int getReconnectRateLimitMs() {
        return AppConfig.getAsInt(RECONNECT_RATE_LIMIT_MS);
    }

    public static int getRestRateLimitMs() {
        return AppConfig.getAsInt(REST_RATE_LIMIT_MS);
    }

    public static String getApiKey() {
        return AppConfig.getAsString(API_KEY);
    }

    public static String getApiSecret() {
        return AppConfig.getAsString(API_SECRET);
    }
}

