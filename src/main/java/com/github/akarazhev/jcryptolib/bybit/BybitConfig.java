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
    // Public topics are defined in application.properties
    private static final String[] PUBLIC_SUBSCRIBE_TOPICS = AppConfig.getAsString("bybit.public.subscribe.topics").split(",");
    // Private topics are defined in application.properties
    private static final String[] PRIVATE_SUBSCRIBE_TOPICS = AppConfig.getAsString("bybit.private.subscribe.topics").split(",");
    // Ping interval is defined in application.properties
    private static final long PING_INTERVAL = AppConfig.getAsLong("bybit.ping.interval");
    // Reconnect interval are defined in application.properties
    private static final long RECONNECT_INTERVAL = AppConfig.getAsLong("bybit.reconnect.interval");

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

    public static String[] getPublicSubscribeTopics() {
        return PUBLIC_SUBSCRIBE_TOPICS;
    }

    public static String[] getPrivateSubscribeTopics() {
        return PRIVATE_SUBSCRIBE_TOPICS;
    }

    public static long getPingInterval() {
        return PING_INTERVAL;
    }

    public static long getReconnectInterval() {
        return RECONNECT_INTERVAL;
    }

    public static String print() {
        return "Bybit Config {" +
                "publicTestnetSpot=" + getPublicTestnetSpot() +
                ", publicTestnetLinear=" + getPublicTestnetLinear() +
                ", publicTestnetInverse=" + getPublicTestnetInverse() +
                ", publicTestnetOption=" + getPublicTestnetOption() +
                ", publicTestnetSpread=" + getPublicTestnetSpread() +
                ", publicSubscribeTopics=" + Arrays.toString(getPublicSubscribeTopics()) +
                ", privateSubscribeTopics=" + Arrays.toString(getPrivateSubscribeTopics()) +
                ", pingInterval=" + getPingInterval() +
                ", reconnectInterval=" + getReconnectInterval() +
                '}';
    }
}

