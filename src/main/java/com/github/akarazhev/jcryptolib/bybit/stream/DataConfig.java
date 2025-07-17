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

import com.github.akarazhev.jcryptolib.bybit.config.Config;
import com.github.akarazhev.jcryptolib.bybit.config.RequestKey;
import com.github.akarazhev.jcryptolib.bybit.config.RequestValue;
import com.github.akarazhev.jcryptolib.bybit.config.Topic;
import com.github.akarazhev.jcryptolib.bybit.config.Type;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public final class DataConfig {
    private final Set<Type> types;
    private final boolean isUseAuth;
    private final String key;
    private final String secret;
    private final String[] topics;
    private final Map<RequestKey, RequestValue> params;
    private final float backoffMultiplier;
    private final int connectTimeoutMs;
    private final int initialReconnectIntervalMs;
    private final int maxReconnectAttempts;
    private final int maxReconnectIntervalMs;
    private final int pingIntervalMs;
    private final int fetchIntervalMs;

    private DataConfig(final Builder builder) {
        if (builder.types.isEmpty()) {
            throw new IllegalArgumentException("Types is empty");
        }

        this.types = builder.types;
        this.isUseAuth = builder.isUseAuth;
        this.key = builder.key;
        this.secret = builder.secret;
        this.topics = builder.getTopics();
        this.params = builder.params;
        this.backoffMultiplier = builder.backoffMultiplier;
        this.connectTimeoutMs = builder.connectTimeoutMs;
        this.initialReconnectIntervalMs = builder.initialReconnectIntervalMs;
        this.maxReconnectAttempts = builder.maxReconnectAttempts;
        this.maxReconnectIntervalMs = builder.maxReconnectIntervalMs;
        this.pingIntervalMs = builder.pingIntervalMs;
        this.fetchIntervalMs = builder.fetchIntervalMs;
    }

    public Set<Type> getTypes() {
        return types;
    }

    public boolean isUseAuth() {
        return isUseAuth;
    }

    public String getKey() {
        return key;
    }

    public String getSecret() {
        return secret;
    }

    public String[] getTopics() {
        return topics;
    }

    public Map<RequestKey, RequestValue> getParams() {
        return params;
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

    public int getFetchIntervalMs() {
        return fetchIntervalMs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String print() {
        return "\nBybit Data Config {" +
                "\n\ttypes=" + types +
                "\n\tisUseAuth=" + isUseAuth +
                "\n\ttopics='" + Arrays.toString(topics) + '\'' +
                "\n\tparams=" + params +
                "\n\tbackoffMultiplier=" + backoffMultiplier +
                "\n\tconnectTimeoutMs=" + connectTimeoutMs +
                "\n\tinitialReconnectIntervalMs=" + initialReconnectIntervalMs +
                "\n\tmaxReconnectAttempts=" + maxReconnectAttempts +
                "\n\tmaxReconnectIntervalMs=" + maxReconnectIntervalMs +
                "\n\tpingIntervalMs=" + pingIntervalMs +
                "\n\tfetchIntervalMs=" + fetchIntervalMs +
                "\n}";
    }

    public static final class Builder {
        private final Set<Type> types = new HashSet<>();
        private boolean isUseAuth;
        private String key;
        private String secret;
        private final Set<Topic> topics = new HashSet<>();
        private final Map<RequestKey, RequestValue> params = new HashMap<>();
        private float backoffMultiplier = Config.getBackoffMultiplier();
        private int connectTimeoutMs = Config.getConnectTimeoutMs();
        private int initialReconnectIntervalMs = Config.getInitialReconnectIntervalMs();
        private int maxReconnectAttempts = Config.getMaxReconnectAttempts();
        private int maxReconnectIntervalMs = Config.getMaxReconnectIntervalMs();
        private int pingIntervalMs = Config.getPingIntervalMs();
        private int fetchIntervalMs = Config.getFetchIntervalMs();

        public Builder type(final Type type) {
            this.types.add(type);
            return this;
        }

        public Builder isUseAuth(final boolean isUseAuth) {
            this.isUseAuth = isUseAuth;
            return this;
        }

        public Builder key(final String key) {
            this.key = key;
            return this;
        }

        public Builder secret(final String secret) {
            this.secret = secret;
            return this;
        }

        public Builder topic(final Topic topic) {
            this.topics.add(topic);
            return this;
        }

        public Builder param(final RequestKey key, RequestValue value) {
            this.params.put(key, value);
            return this;
        }

        public Builder backoffMultiplier(float backoffMultiplier) {
            this.backoffMultiplier = backoffMultiplier;
            return this;
        }

        public Builder connectTimeoutMs(final int connectTimeoutMs) {
            this.connectTimeoutMs = connectTimeoutMs;
            return this;
        }

        public Builder initialReconnectIntervalMs(final int initialReconnectIntervalMs) {
            this.initialReconnectIntervalMs = initialReconnectIntervalMs;
            return this;
        }

        public Builder maxReconnectAttempts(final int maxReconnectAttempts) {
            this.maxReconnectAttempts = maxReconnectAttempts;
            return this;
        }

        public Builder maxReconnectIntervalMs(final int maxReconnectIntervalMs) {
            this.maxReconnectIntervalMs = maxReconnectIntervalMs;
            return this;
        }

        public Builder pingIntervalMs(final int pingIntervalMs) {
            this.pingIntervalMs = pingIntervalMs;
            return this;
        }

        public Builder fetchIntervalMs(final int fetchIntervalMs) {
            this.fetchIntervalMs = fetchIntervalMs;
            return this;
        }

        private String[] getTopics() {
            var i = 0;
            final var topics = new String[this.topics.size()];
            for (final Topic topic : this.topics) {
                topics[i++] = topic.toString();
            }

            return topics;
        }

        public DataConfig build() {
            return new DataConfig(this);
        }
    }
}