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

import com.github.akarazhev.jcryptolib.util.JsonUtils;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableEmitter;
import io.reactivex.rxjava3.disposables.Disposable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

final class ApiDataFetcher {
    private static final Logger LOGGER = LoggerFactory.getLogger(ApiDataFetcher.class);
    private final AtomicReference<Disposable> fetcherRef = new AtomicReference<>();
    private final HttpClient client;
    private final DataConfig config;
    private final FlowableEmitter<Map<String, Object>> emitter;

    public static ApiDataFetcher create(final HttpClient client, final DataConfig config,
                                        final FlowableEmitter<Map<String, Object>> emitter) {
        return new ApiDataFetcher(client, config, emitter);
    }

    private ApiDataFetcher(final HttpClient client, final DataConfig config,
                           final FlowableEmitter<Map<String, Object>> emitter) {
        this.client = Objects.requireNonNull(client, "Client must be not null");
        this.config = Objects.requireNonNull(config, "Config must be not null");
        this.emitter = Objects.requireNonNull(emitter, "Emitter must be not null");
    }

    public void fetch() {
        fetcherRef.set(Flowable.interval(0, config.getFetchIntervalMs(), TimeUnit.MILLISECONDS)
                .subscribe(_ -> fetchData(), t -> LOGGER.error("Fetcher error", t)));
    }

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
        if (config.getAnnouncementTypes() != null && config.getAnnouncementTypes().length > 0) {
            fetchByParam("type", config.getAnnouncementTypes());
        } else if (config.getAnnouncementTags() != null && config.getAnnouncementTags().length > 0) {
            fetchByParam("tag", config.getAnnouncementTags());
        } else {
            fetchByUri();
        }
    }

    private void fetchByParam(final String param, final String[] arguments) {
        if (!emitter.isCancelled()) {
            Arrays.stream(arguments).forEach(arg -> {
                if (!arg.isEmpty()) {
                    var page = 1;
                    var limit = 1000;
                    var isMoreAvailable = true;
                    while (isMoreAvailable && !emitter.isCancelled()) {
                        try {
                            final var request = createRequest(getUri(param, arg, page, limit));
                            final var response = client.send(request, HttpResponse.BodyHandlers.ofString());
                            if (response.statusCode() == 200) {
                                final var result = getResult(response.body());
                                if (result == null || result.isEmpty()) {
                                    isMoreAvailable = false;
                                } else {
                                    result.forEach(value -> {
                                        LOGGER.debug("Fetched message by param: {}", value);
                                        emitter.onNext(value);
                                    });
                                    if (result.size() < limit) {
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
            });
        }
    }

    private void fetchByUri() {
        if (!emitter.isCancelled()) {
            try {
                final var request = createRequest(URI.create(config.getUrl()));
                final var response = client.send(request, HttpResponse.BodyHandlers.ofString());
                if (response.statusCode() == 200) {
                    final var result = getResult(response.body());
                    if (result != null && !result.isEmpty()) {
                        result.forEach(value -> {
                            LOGGER.debug("Fetched message by uri: {}", value);
                            emitter.onNext(value);
                        });
                    }
                } else {
                    LOGGER.error("Failed to fetch data by uri: HTTP {}", response.statusCode());
                }
            } catch (final Exception e) {
                LOGGER.error("Failed to fetch data by uri", e);
                emitter.onError(e);
            }
        }
    }

    private URI getUri(final String param, final String arg, final int page, final int limit) {
        return URI.create(config.getUrl() + "?locale=" + config.getAnnouncementLocale() + "&" + param + "=" + arg +
                "&page=" + page + "&limit=" + limit);
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
            return (List<Map<String, Object>>) ((Map<String, Object>) data.get("result")).get("list");
        }

        return List.of();
    }

    private boolean isRetCodeOk(final Map<String, Object> data) {
        return (data.containsKey("retCode") && (int) data.get("retCode") == 0) ||
                (data.containsKey("ret_code") && (int) data.get("ret_code") == 0);
    }
}
