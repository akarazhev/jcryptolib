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

package com.github.akarazhev.jcryptolib.bybit.stream;

import com.github.akarazhev.jcryptolib.bybit.BybitConfig;

import java.util.Arrays;

public final class BybitDataConfig {
    private final String key;
    private final String secret;
    private final String url;
    private final String[] topics;
    private final float backoffMultiplier;
    private final int connectTimeoutMs;
    private final int initialReconnectIntervalMs;
    private final int maxReconnectAttempts;
    private final int maxReconnectIntervalMs;
    private final int pingIntervalMs;

    private BybitDataConfig(final Builder builder) {
        this.key = builder.key;
        this.secret = builder.secret;
        this.url = builder.url;
        this.topics = builder.topics;
        this.backoffMultiplier = builder.backoffMultiplier;
        this.connectTimeoutMs = builder.connectTimeoutMs;
        this.initialReconnectIntervalMs = builder.initialReconnectIntervalMs;
        this.maxReconnectAttempts = builder.maxReconnectAttempts;
        this.maxReconnectIntervalMs = builder.maxReconnectIntervalMs;
        this.pingIntervalMs = builder.pingIntervalMs;
    }

    public String getKey() {
        return key;
    }
    public String getSecret() {
        return secret;
    }
    public String getUrl() {
        return url;
    }
    public String[] getTopics() {
        return topics;
    }

    public float getBackoffMultiplier() {
        return backoffMultiplier;
    }

    public int getConnectTimeoutMs() {
        return connectTimeoutMs;
    }

    public int getInitialReconnectIntervalMs() {
        return initialReconnectIntervalMs;
    }

    public int getMaxReconnectAttempts() {
        return maxReconnectAttempts;
    }

    public int getMaxReconnectIntervalMs() {
        return maxReconnectIntervalMs;
    }

    public int getPingIntervalMs() {
        return pingIntervalMs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String print() {
        return "\nBybit Data Config {" +
                "\n\tkey='" + key + '\'' +
                "\n\tsecret='" + secret + '\'' +
                "\n\turl='" + url + '\'' +
                "\n\ttopics='" + Arrays.toString(topics) + '\'' +
                "\n\tbackoffMultiplier=" + backoffMultiplier +
                "\n\tconnectTimeoutMs=" + connectTimeoutMs +
                "\n\tinitialReconnectIntervalMs=" + initialReconnectIntervalMs +
                "\n\tmaxReconnectAttempts=" + maxReconnectAttempts +
                "\n\tmaxReconnectIntervalMs=" + maxReconnectIntervalMs +
                "\n\tpingIntervalMs=" + pingIntervalMs +
                "\n}";
    }

    public static final class Builder {
        private String key;
        private String secret;
        private String url;
        private String[] topics;
        private float backoffMultiplier = BybitConfig.getBackoffMultiplier();
        private int connectTimeoutMs = BybitConfig.getConnectTimeoutMs();
        private int initialReconnectIntervalMs = BybitConfig.getInitialReconnectIntervalMs();
        private int maxReconnectAttempts = BybitConfig.getMaxReconnectAttempts();
        private int maxReconnectIntervalMs = BybitConfig.getMaxReconnectIntervalMs();
        private int pingIntervalMs = BybitConfig.getPingIntervalMs();

        public Builder key(final String key) {
            this.key = key;
            return this;
        }
        public Builder secret(final String secret) {
            this.secret = secret;
            return this;
        }
        public Builder url(final String url) {
            this.url = url;
            return this;
        }
        public Builder topics(final String[] topics) {
            this.topics = topics;
            return this;
        }

        public Builder backoffMultiplier(float backoffMultiplier) {
            this.backoffMultiplier = backoffMultiplier;
            return this;
        }

        public Builder connectTimeoutMs(int connectTimeoutMs) {
            this.connectTimeoutMs = connectTimeoutMs;
            return this;
        }

        public Builder initialReconnectIntervalMs(int initialReconnectIntervalMs) {
            this.initialReconnectIntervalMs = initialReconnectIntervalMs;
            return this;
        }

        public Builder maxReconnectAttempts(int maxReconnectAttempts) {
            this.maxReconnectAttempts = maxReconnectAttempts;
            return this;
        }

        public Builder maxReconnectIntervalMs(int maxReconnectIntervalMs) {
            this.maxReconnectIntervalMs = maxReconnectIntervalMs;
            return this;
        }

        public Builder pingIntervalMs(int pingIntervalMs) {
            this.pingIntervalMs = pingIntervalMs;
            return this;
        }

        public BybitDataConfig build() {
            return new BybitDataConfig(this);
        }
    }
}