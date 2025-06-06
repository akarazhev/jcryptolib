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

public final class BybitConfig {
    private BybitConfig() {
        throw new UnsupportedOperationException();
    }
    public static String getAnnouncementLocale() {
        return AppConfig.getAsString("bybit.announcement.locale");
    }

    public static String[] getAnnouncementTags() {
        return AppConfig.getAsArray("bybit.announcement.tags");
    }

    public static String[] getAnnouncementTypes() {
        return AppConfig.getAsArray("bybit.announcement.types");
    }

    public static String getPublicTestnetSpot() {
        return AppConfig.getAsString("bybit.public.testnet.spot");
    }

    public static String getPublicTestnetLinear() {
        return AppConfig.getAsString("bybit.public.testnet.linear");
    }

    public static String getPublicTestnetInverse() {
        return AppConfig.getAsString("bybit.public.testnet.inverse");
    }

    public static String getPublicTestnetOption() {
        return AppConfig.getAsString("bybit.public.testnet.option");
    }

    public static String getPublicTestnetSpread() {
        return AppConfig.getAsString("bybit.public.testnet.spread");
    }

    public static String getPrivateTestnet() {
        return AppConfig.getAsString("bybit.private.testnet");
    }

    public static String getOrderTestnet() {
        return AppConfig.getAsString("bybit.order.testnet");
    }

    public static String[] getPublicSubscribeTopics() {
        return AppConfig.getAsArray("bybit.public.subscribe.topics");
    }

    public static String[] getPrivateSubscribeTopics() {
        return AppConfig.getAsArray("bybit.private.subscribe.topics");
    }

    public static int getConnectTimeoutMs() {
        return AppConfig.getAsInt("bybit.connect.timeout.ms");
    }

    public static int getInitialReconnectIntervalMs() {
        return AppConfig.getAsInt("bybit.initial.reconnect.interval.ms");
    }

    public static int getMaxReconnectIntervalMs() {
        return AppConfig.getAsInt("bybit.max.reconnect.interval.ms");
    }

    public static int getMaxReconnectAttempts() {
        return AppConfig.getAsInt("bybit.max.reconnect.attempts");
    }

    public static float getBackoffMultiplier() {
        return AppConfig.getAsFloat("bybit.backoff.multiplier");
    }

    public static int getPingIntervalMs() {
        return AppConfig.getAsInt("bybit.ping.interval.ms");
    }

    public static String getApiKey() {
        return AppConfig.getAsString("bybit.api.key");
    }

    public static String getApiSecret() {
        return AppConfig.getAsString("bybit.api.secret");
    }
}

