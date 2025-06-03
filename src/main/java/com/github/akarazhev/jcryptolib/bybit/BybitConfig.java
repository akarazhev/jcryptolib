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

package com.github.akarazhev.jcryptolib.bybit;

import com.github.akarazhev.jcryptolib.config.AppConfig;

import java.util.Arrays;

public final class BybitConfig {
    // Public endpoints are defined in application.properties
    private static final String PUBLIC_TESTNET_SPOT = AppConfig.getAsString("bybit.public.testnet.spot");
    private static final String PUBLIC_TESTNET_LINEAR = AppConfig.getAsString("bybit.public.testnet.linear");
    private static final String PUBLIC_TESTNET_INVERSE = AppConfig.getAsString("bybit.public.testnet.inverse");
    private static final String PUBLIC_TESTNET_OPTION = AppConfig.getAsString("bybit.public.testnet.option");
    private static final String PUBLIC_TESTNET_SPREAD = AppConfig.getAsString("bybit.public.testnet.spread");
    private static final String PRIVATE_TESTNET = AppConfig.getAsString("bybit.private.testnet");
    private static final String ORDER_TESTNET = AppConfig.getAsString("bybit.order.testnet");
    // Public topics are defined in application.properties
    private static final String[] PUBLIC_SUBSCRIBE_TOPICS = AppConfig.getAsArray("bybit.public.subscribe.topics");
    // Private topics are defined in application.properties
    private static final String[] PRIVATE_SUBSCRIBE_TOPICS = AppConfig.getAsArray("bybit.private.subscribe.topics");
    // Connection settings are defined in application.properties
    private static final int CONNECT_TIMEOUT_MS = AppConfig.getAsInt("bybit.connect.timeout.ms");
    private static final int INITIAL_RECONNECT_INTERVAL_MS = AppConfig.getAsInt("bybit.initial.reconnect.interval.ms");
    private static final int MAX_RECONNECT_INTERVAL_MS = AppConfig.getAsInt("bybit.max.reconnect.interval.ms");
    private static final int MAX_RECONNECT_ATTEMPTS = AppConfig.getAsInt("bybit.max.reconnect.attempts");
    private static final float BACKOFF_MULTIPLIER = AppConfig.getAsFloat("bybit.backoff.multiplier");
    private static final int PING_INTERVAL_MS = AppConfig.getAsInt("bybit.ping.interval.ms");
    // Private settings are defined in application.properties
    private static final String API_KEY = AppConfig.getAsString("bybit.api.key");
    private static final String API_SECRET = AppConfig.getAsString("bybit.api.secret");

    private BybitConfig() {
        throw new UnsupportedOperationException();
    }

    public static String getPublicTestnetSpot() {
        return PUBLIC_TESTNET_SPOT;
    }

    public static String getPublicTestnetLinear() {
        return PUBLIC_TESTNET_LINEAR;
    }

    public static String getPublicTestnetInverse() {
        return PUBLIC_TESTNET_INVERSE;
    }

    public static String getPublicTestnetOption() {
        return PUBLIC_TESTNET_OPTION;
    }

    public static String getPublicTestnetSpread() {
        return PUBLIC_TESTNET_SPREAD;
    }

    public static String getPrivateTestnet() {
        return PRIVATE_TESTNET;
    }

    public static String getOrderTestnet() {
        return ORDER_TESTNET;
    }

    public static String[] getPublicSubscribeTopics() {
        return PUBLIC_SUBSCRIBE_TOPICS;
    }

    public static String[] getPrivateSubscribeTopics() {
        return PRIVATE_SUBSCRIBE_TOPICS;
    }

    public static int getConnectTimeoutMs() {
        return CONNECT_TIMEOUT_MS;
    }

    public static int getInitialReconnectIntervalMs() {
        return INITIAL_RECONNECT_INTERVAL_MS;
    }

    public static int getMaxReconnectIntervalMs() {
        return MAX_RECONNECT_INTERVAL_MS;
    }

    public static int getMaxReconnectAttempts() {
        return MAX_RECONNECT_ATTEMPTS;
    }

    public static float getBackoffMultiplier() {
        return BACKOFF_MULTIPLIER;
    }

    public static int getPingIntervalMs() {
        return PING_INTERVAL_MS;
    }

    public static String getApiKey() {
        return API_KEY;
    }

    public static String getApiSecret() {
        return API_SECRET;
    }

    public static String print() {
        return "\nBybit Config {" +
                "\n\tpublicTestnetSpot = " + getPublicTestnetSpot() +
                ", \n\tpublicTestnetLinear = " + getPublicTestnetLinear() +
                ", \n\tpublicTestnetInverse = " + getPublicTestnetInverse() +
                ", \n\tpublicTestnetOption = " + getPublicTestnetOption() +
                ", \n\tpublicTestnetSpread = " + getPublicTestnetSpread() +
                ", \n\tprivateTestnet = " + getPrivateTestnet() +
                ", \n\torderTestnet = " + getOrderTestnet() +
                ", \n\tpublicSubscribeTopics = " + Arrays.toString(getPublicSubscribeTopics()) +
                ", \n\tprivateSubscribeTopics = " + Arrays.toString(getPrivateSubscribeTopics()) +
                ", \n\tconnectTimeoutMs = " + getConnectTimeoutMs() +
                ", \n\tinitialReconnectIntervalMs = " + getInitialReconnectIntervalMs() +
                ", \n\tmaxReconnectIntervalMs = " + getMaxReconnectIntervalMs() +
                ", \n\tmaxReconnectAttempts = " + getMaxReconnectAttempts() +
                ", \n\tbackoffMultiplier = " + getBackoffMultiplier() +
                ", \n\tpingIntervalMs = " + getPingIntervalMs() +
                "\n}";
    }
}

