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

import com.github.akarazhev.jcryptolib.bybit.config.RequestKey;
import com.github.akarazhev.jcryptolib.bybit.config.RequestValue;
import com.github.akarazhev.jcryptolib.resilience.CircuitBreaker;
import com.github.akarazhev.jcryptolib.resilience.HealthCheck;
import com.github.akarazhev.jcryptolib.resilience.RateLimiter;
import com.github.akarazhev.jcryptolib.stream.DataFetcher;
import com.github.akarazhev.jcryptolib.stream.Payload;
import com.github.akarazhev.jcryptolib.stream.Provider;
import com.github.akarazhev.jcryptolib.stream.Source;
import com.github.akarazhev.jcryptolib.util.JsonUtils;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableEmitter;
import io.reactivex.rxjava3.disposables.Disposable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

import static com.github.akarazhev.jcryptolib.bybit.stream.Constants.Request.LIMIT;
import static com.github.akarazhev.jcryptolib.bybit.stream.Constants.Request.PAGE;
import static com.github.akarazhev.jcryptolib.bybit.stream.Constants.Response.LIST;
import static com.github.akarazhev.jcryptolib.bybit.stream.Constants.Response.OK;
import static com.github.akarazhev.jcryptolib.bybit.stream.Constants.Response.RESULT;
import static com.github.akarazhev.jcryptolib.bybit.stream.Constants.Response.RET_CODE_CAMEL_CASE;
import static com.github.akarazhev.jcryptolib.bybit.stream.Constants.Response.RET_MSG;
import static com.github.akarazhev.jcryptolib.bybit.stream.Constants.Response.STATUS_CODE_OK;
import static com.github.akarazhev.jcryptolib.bybit.stream.Constants.RestApi.MAX_LIMIT;

final class RestApiDataFetcher implements DataFetcher {
    private static final Logger LOGGER = LoggerFactory.getLogger(RestApiDataFetcher.class);
    private final AtomicReference<Disposable> fetcherRef = new AtomicReference<>();
    private final HttpClient client;
    private final DataConfig config;
    private final FlowableEmitter<Payload<Map<String, Object>>> emitter;
    private final CircuitBreaker circuitBreaker;
    private final RateLimiter rateLimiter;
    private final HealthCheck healthCheck;

    public static RestApiDataFetcher create(final HttpClient client, final DataConfig config,
                                            final FlowableEmitter<Payload<Map<String, Object>>> emitter) {
        return new RestApiDataFetcher(client, config, emitter);
    }

    private RestApiDataFetcher(final HttpClient client, final DataConfig config,
                               final FlowableEmitter<Payload<Map<String, Object>>> emitter) {
        this.client = Objects.requireNonNull(client, "Client must be not null");
        this.config = Objects.requireNonNull(config, "Config must be not null");
        this.emitter = Objects.requireNonNull(emitter, "Emitter must be not null");
        this.circuitBreaker = new CircuitBreaker(config.getCircuitBreakerThreshold(), config.getCircuitBreakerTimeoutMs());
        this.rateLimiter = new RateLimiter(config.getRestRateLimitMs());
        this.healthCheck = new HealthCheck(status -> LOGGER.info("RestApi Health: {}", status));
    }

    @Override
    public void fetch() {
        fetcherRef.set(Flowable.interval(0, config.getFetchIntervalMs(), TimeUnit.MILLISECONDS)
                .subscribe(_ -> fetchData(), t -> LOGGER.error("Fetcher error", t)));
    }

    @Override
    public void cancel() {
        if (emitter.isCancelled()) {
            final var fetcher = fetcherRef.getAndSet(null);
            if (fetcher != null && !fetcher.isDisposed()) {
                LOGGER.debug("Stopping fetcher");
                fetcher.dispose();
            }
        }
    }

    private void fetchData() {
        final var url = getUrl();
        if (!config.getParams().isEmpty()) {
            fetch(url, config.getParams());
        } else {
            fetchWithResilience(url);
        }
    }

    private void fetch(final String url, final Map<RequestKey, RequestValue> params) {
        if (!emitter.isCancelled()) {
            var page = 1;
            var isMoreAvailable = true;
            while (isMoreAvailable && !emitter.isCancelled()) {
                try {
                    final var request = createRequest(getUri(url, params, page));
                    final var response = client.send(request, HttpResponse.BodyHandlers.ofString());
                    if (response.statusCode() == STATUS_CODE_OK) {
                        final var result = getResult(response.body());
                        if (result == null || result.isEmpty()) {
                            isMoreAvailable = false;
                        } else {
                            result.forEach(value -> {
                                LOGGER.debug("Fetched message: {}", value);
                                emitter.onNext(Payload.of(Provider.BYBIT, Source.RAPI, value));
                            });
                            if (result.size() < MAX_LIMIT) {
                                isMoreAvailable = false;
                            } else {
                                page++;
                            }
                        }
                    } else {
                        LOGGER.error("Failed to fetch data by param: HTTP {}", response.statusCode());
                        isMoreAvailable = false;
                    }
                } catch (final Exception e) {
                    LOGGER.error("Failed to fetch data by param", e);
                    emitter.onError(e);
                    isMoreAvailable = false;
                }
            }
        }
    }

    private void fetchWithResilience(final String url) {
        if (!emitter.isCancelled()) {
            if (!circuitBreaker.allowRequest()) {
                LOGGER.warn("Circuit breaker OPEN for RestApi, skipping fetch");
                healthCheck.setStatus(HealthCheck.Status.UNHEALTHY);
                return;
            }
            if (!rateLimiter.tryAcquire()) {
                LOGGER.warn("Rate limit exceeded for RestApi, skipping fetch");
                return;
            }
            try {
                final var response = client.send(createRequest(getUri(url)), HttpResponse.BodyHandlers.ofString());
                if (response.statusCode() == STATUS_CODE_OK) {
                    final var result = getResult(response.body());
                    if (result != null && !result.isEmpty()) {
                        result.forEach(value -> {
                            LOGGER.debug("Fetched message: {}", value);
                            emitter.onNext(Payload.of(Provider.BYBIT, Source.RAPI, value));
                        });
                        circuitBreaker.recordSuccess();
                        healthCheck.setStatus(HealthCheck.Status.HEALTHY);
                    }
                } else {
                    LOGGER.error("Failed to fetch data by uri: HTTP {}", response.statusCode());
                    circuitBreaker.recordFailure();
                    healthCheck.setStatus(HealthCheck.Status.UNHEALTHY);
                }
            } catch (final Exception e) {
                LOGGER.error("Failed to fetch data by uri", e);
                circuitBreaker.recordFailure();
                healthCheck.setStatus(HealthCheck.Status.UNHEALTHY);
                emitter.onError(e);
            }
        }
    }

    private URI getUri(final String url) {
        return URI.create(url);
    }

    private URI getUri(final String url, final Map<RequestKey, RequestValue> params, final int page) {
        if (params == null || params.isEmpty()) {
            return URI.create(url);
        }

        final var urlString = new StringBuilder(url);
        if (!url.contains("?")) {
            urlString.append("?");
        } else if (!url.endsWith("&") && !url.endsWith("?")) {
            urlString.append("&");
        }

        setUrlParams(urlString, params);
        if (page >= 0) {
            urlString.append("&").append(PAGE).append("=").append(page);
        }

        if (MAX_LIMIT >= 0) {
            urlString.append("&").append(LIMIT).append("=").append(MAX_LIMIT);
        }

        return URI.create(urlString.toString());
    }

    private void setUrlParams(final StringBuilder url, final Map<RequestKey, RequestValue> params) {
        for (final var iterator = params.entrySet().iterator(); iterator.hasNext(); ) {
            final var entry = iterator.next();
            url.append(URLEncoder.encode(entry.getKey().toString(), StandardCharsets.UTF_8));
            url.append("=");
            url.append(URLEncoder.encode(entry.getValue().toString(), StandardCharsets.UTF_8));
            if (iterator.hasNext()) {
                url.append("&");
            }
        }
    }

    private HttpRequest createRequest(final URI uri) {
        return HttpRequest.newBuilder()
                .uri(uri)
                .timeout(Duration.ofMillis(config.getConnectTimeoutMs()))
                .GET()
                .build();
    }

    @SuppressWarnings("unchecked")
    private List<Map<String, Object>> getResult(final String json) {
        final var data = JsonUtils.jsonToMap(json);
        if (isRetCodeOk(data)) {
            return (List<Map<String, Object>>) ((Map<String, Object>) data.get(RESULT)).get(LIST);
        }

        return List.of();
    }

    private boolean isRetCodeOk(final Map<String, Object> data) {
        return (data.containsKey(RET_MSG) && OK.equals(data.get(RET_MSG)) &&
                (data.containsKey(RET_CODE_CAMEL_CASE) && (Integer) data.get(RET_CODE_CAMEL_CASE) == 0));
    }

    private String getUrl() {
        return config.getRestApiType().getUrl();
    }
}
