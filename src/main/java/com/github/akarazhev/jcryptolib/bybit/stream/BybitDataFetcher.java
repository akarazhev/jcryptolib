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

import com.github.akarazhev.jcryptolib.bybit.config.Type;
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

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

import static com.github.akarazhev.jcryptolib.bybit.config.Type.ADH;
import static com.github.akarazhev.jcryptolib.bybit.config.Type.ADH_PAST;
import static com.github.akarazhev.jcryptolib.bybit.config.Type.BYS;
import static com.github.akarazhev.jcryptolib.bybit.config.Type.BYV;
import static com.github.akarazhev.jcryptolib.bybit.config.Type.LPD;
import static com.github.akarazhev.jcryptolib.bybit.config.Type.LPL;
import static com.github.akarazhev.jcryptolib.bybit.config.Type.MD;
import static com.github.akarazhev.jcryptolib.bybit.stream.Constants.Response.LIST;
import static com.github.akarazhev.jcryptolib.bybit.stream.Constants.Response.OK;
import static com.github.akarazhev.jcryptolib.bybit.stream.Constants.Response.PROJECTS;
import static com.github.akarazhev.jcryptolib.bybit.stream.Constants.Response.RESULT;
import static com.github.akarazhev.jcryptolib.bybit.stream.Constants.Response.RET_CODE;
import static com.github.akarazhev.jcryptolib.bybit.stream.Constants.Response.RET_MSG2;
import static com.github.akarazhev.jcryptolib.bybit.stream.Constants.Response.STATUS_CODE_OK;
import static com.github.akarazhev.jcryptolib.bybit.stream.Constants.Response.SUCCESS;
import static com.github.akarazhev.jcryptolib.bybit.stream.Constants.Response.TOTAL_PROJECTS;

final class BybitDataFetcher implements DataFetcher {
    private static final Logger LOGGER = LoggerFactory.getLogger(BybitDataFetcher.class);
    private final AtomicReference<Disposable> fetcherRef = new AtomicReference<>();
    private final HttpClient client;
    private final DataConfig config;
    private final FlowableEmitter<Payload<Map<String, Object>>> emitter;

    public static BybitDataFetcher create(final HttpClient client, final DataConfig config,
                                          final FlowableEmitter<Payload<Map<String, Object>>> emitter) {
        return new BybitDataFetcher(client, config, emitter);
    }

    private BybitDataFetcher(final HttpClient client, final DataConfig config,
                             final FlowableEmitter<Payload<Map<String, Object>>> emitter) {
        this.client = Objects.requireNonNull(client, "Client must be not null");
        this.config = Objects.requireNonNull(config, "Config must be not null");
        this.emitter = Objects.requireNonNull(emitter, "Emitter must be not null");
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
        config.getTypes().forEach(type -> {
            if (LPD.equals(type)) {
                fetchLaunchPads();
            } else if (MD.equals(type)) {
                fetch(BybitRequestBuilder.buildMegaDropRequest(), Source.MD);
            } else if (LPL.equals(type)) {
                fetchLaunchPools();
            } else if (BYV.equals(type)) {
                fetch(BybitRequestBuilder.buildByVotesRequest(), Source.BYV);
            } else if (BYS.equals(type)) {
                fetch(BybitRequestBuilder.buildByStarterRequest(), Source.BYS);
            } else if (ADH_PAST.equals(type) || ADH.equals(type)) {
                fetchAirdropHunt(type);
            }
        });
    }

    private void fetchLaunchPads() {
        if (!emitter.isCancelled()) {
            try {
                final var response = client.send(BybitRequestBuilder.buildLaunchPadRequest(),
                        HttpResponse.BodyHandlers.ofString());
                if (response.statusCode() == STATUS_CODE_OK) {
                    final var result = getResultAsMap(response.uri(), response.body());
                    if (result != null && !result.isEmpty()) {
                        final var totalProjects = (Integer) result.get(TOTAL_PROJECTS);
                        fetchBySize(BybitRequestBuilder.buildLaunchPadRequest(totalProjects), Source.LPD);
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

    private void fetchLaunchPools() {
        if (!emitter.isCancelled()) {
            try {
                final var response = client.send(BybitRequestBuilder.buildLaunchPoolRequest(),
                        HttpResponse.BodyHandlers.ofString());
                if (response.statusCode() == STATUS_CODE_OK) {
                    final var result = getResultAsMap(response.uri(), response.body());
                    if (result != null && !result.isEmpty()) {
                        final var totalProjects = (Integer) result.get(TOTAL_PROJECTS);
                        fetchBySize(BybitRequestBuilder.buildLaunchPoolRequest(totalProjects), Source.LPL);
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

    @SuppressWarnings("unchecked")
    private void fetchBySize(final HttpRequest request, final Source source) {
        try {
            final var response = client.send(request, HttpResponse.BodyHandlers.ofString());
            if (response.statusCode() == STATUS_CODE_OK) {
                final var result = getResultAsMap(response.uri(), response.body());
                if (result != null && !result.isEmpty()) {
                    final var data = ((List<Map<String, Object>>) result.get(LIST));
                    if (data != null && !data.isEmpty()) {
                        LOGGER.debug("Fetched message: {}", data);
                        data.forEach(r -> emitter.onNext(Payload.of(Provider.BYBIT, source, r)));
                    }
                }
            } else {
                LOGGER.error("Failed to fetch data by uri: HTTP {}", response.statusCode());
            }
        } catch (final Exception e) {
            LOGGER.error("Failed to fetch data by uri", e);
            emitter.onError(e);
        }
    }

    private void fetch(final HttpRequest request, final Source source) {
        if (!emitter.isCancelled()) {
            try {
                final var response = client.send(request, HttpResponse.BodyHandlers.ofString());
                if (response.statusCode() == STATUS_CODE_OK) {
                    final var result = getResultAsList(response.uri(), response.body());
                    if (result != null && !result.isEmpty()) {
                        LOGGER.debug("Fetched message: {}", result);
                        result.forEach(r -> emitter.onNext(Payload.of(Provider.BYBIT, source, r)));
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

    private void fetchAirdropHunt(final Type type) {
        if (!emitter.isCancelled()) {
            try {
                final var response = client.send(BybitRequestBuilder.buildAirdropHuntRequest(),
                        HttpResponse.BodyHandlers.ofString());
                if (response.statusCode() == STATUS_CODE_OK) {
                    final var result = getResultAsMap(response.uri(), response.body());
                    if (result != null && !result.isEmpty()) {
                        final var projects = (Integer) result.get(PROJECTS);
                        fetchBySize(BybitRequestBuilder.buildAirdropHuntRequest(type, projects), Source.ADH);
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

    @SuppressWarnings("unchecked")
    private List<Map<String, Object>> getResultAsList(final URI uri, final String json) throws IOException {
        final var data = JsonUtils.jsonToMap(json);
        if (isRetCodeOk(uri, data)) {
            return (List<Map<String, Object>>) data.get(RESULT);
        }

        return List.of();
    }

    @SuppressWarnings("unchecked")
    private Map<String, Object> getResultAsMap(final URI uri, final String json) throws IOException {
        final var data = JsonUtils.jsonToMap(json);
        if (isRetCodeOk(uri, data)) {
            return (Map<String, Object>) data.get(RESULT);
        }

        return Map.of();
    }

    private boolean isRetCodeOk(final URI uri, final Map<String, Object> data) throws IOException {
        if (data != null) {
            if ((data.containsKey(RET_CODE) && (Integer) data.get(RET_CODE) == 0)) {
                return (data.containsKey(RET_MSG2) && OK.equals(data.get(RET_MSG2))) ||
                        (data.containsKey(SUCCESS) && (Boolean) data.get(SUCCESS));
            } else {
                return false;
            }
        } else {
            throw new IOException("Failed to fetch data by uri: " + uri);
        }
    }
}
