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

package com.github.akarazhev.jcryptolib.cmc.stream;

import com.github.akarazhev.jcryptolib.cmc.config.Type;
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
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

import static com.github.akarazhev.jcryptolib.cmc.Constants.FGI.FGI_START_DATE;
import static com.github.akarazhev.jcryptolib.cmc.Constants.Response.DATA;
import static com.github.akarazhev.jcryptolib.cmc.Constants.Response.ERROR_CODE;
import static com.github.akarazhev.jcryptolib.cmc.Constants.Response.ERROR_CODE_OK;
import static com.github.akarazhev.jcryptolib.cmc.Constants.Response.ERROR_MESSAGE;
import static com.github.akarazhev.jcryptolib.cmc.Constants.Response.ERROR_MESSAGE_SUCCESS;
import static com.github.akarazhev.jcryptolib.cmc.Constants.Response.STATUS;
import static com.github.akarazhev.jcryptolib.cmc.config.Type.ASI;
import static com.github.akarazhev.jcryptolib.cmc.config.Type.FGI;

final class CmcDataFetcher implements DataFetcher {
    private static final Logger LOGGER = LoggerFactory.getLogger(CmcDataFetcher.class);
    private final AtomicReference<Disposable> fetcherRef = new AtomicReference<>();
    private final HttpClient client;
    private final DataConfig config;
    private final FlowableEmitter<Payload<Map<String, Object>>> emitter;

    public static CmcDataFetcher create(final HttpClient client, final DataConfig config,
                                        final FlowableEmitter<Payload<Map<String, Object>>> emitter) {
        return new CmcDataFetcher(client, config, emitter);
    }

    private CmcDataFetcher(final HttpClient client, final DataConfig config,
                           final FlowableEmitter<Payload<Map<String, Object>>> emitter) {
        this.client = Objects.requireNonNull(client, "Client must be not null");
        this.config = Objects.requireNonNull(config, "Config must be not null");
        this.emitter = Objects.requireNonNull(emitter, "Emitter must be not null");
    }

    @Override
    public void fetch() {
        final var now = LocalDateTime.now();
        var nextFetch = now.with(config.getFetchAtTime());
        if (now.isAfter(nextFetch)) {
            nextFetch = nextFetch.plusDays(1);
        }

        final var initialDelay = Duration.between(now, nextFetch).toMillis();
        if (initialDelay > 0) {
            fetchData();
        }

        fetcherRef.set(
                Flowable.timer(initialDelay, TimeUnit.MILLISECONDS)
                        .flatMap(_ ->
                                Flowable.interval(0, TimeUnit.DAYS.toMillis(1), TimeUnit.MILLISECONDS)
                                        .doOnNext(_ -> fetchData())
                        )
                        .subscribe(_ -> {
                        }, t -> LOGGER.error("Fetcher error", t))
        );
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
            if (FGI.equals(type)) {
                final var startOfDay = LocalDate.now().plusDays(1).atStartOfDay(ZoneId.systemDefault());
                final var end = startOfDay.withZoneSameInstant(ZoneOffset.UTC).toEpochSecond();
                fetch(CmcRequestBuilder.buildFearGreedChartRequest(FGI_START_DATE, end), Source.FGI);
            } else if (ASI.equals(type)) {
                final var startOfDay = LocalDate.now().plusDays(1).atStartOfDay(ZoneId.systemDefault());
                final var end = startOfDay.withZoneSameInstant(ZoneOffset.UTC).toEpochSecond();
                final var start = end - TimeUnit.DAYS.toSeconds(90); // TODO: move to config?
                fetch(CmcRequestBuilder.buildAltcoinSeasonIndexRequest(start, end), Source.ASI);
            } else if (Type.BDN.equals(type)) {
                fetch(CmcRequestBuilder.buildBitcoinDominanceNowRequest(), Source.BDN);
            } else if (Type.BDA.equals(type)) {
                fetch(CmcRequestBuilder.buildBitcoinDominanceAllRequest(), Source.BDA);
            }
        });
    }

    private void fetch(final HttpRequest request, final Source source) {
        if (!emitter.isCancelled()) {
            try {
                final var response = client.send(request, HttpResponse.BodyHandlers.ofString());
                if (response.statusCode() == 200) {
                    final var result = getResult(response.uri(), response.body());
                    if (result != null && !result.isEmpty()) {
                        LOGGER.debug("Fetched message: {}", result);
                        emitter.onNext(Payload.of(Provider.CMC, source, result));
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
    private Map<String, Object> getResult(final URI uri, final String json) throws IOException {
        final var data = JsonUtils.jsonToMap(json);
        if (isStatusOk(uri, data)) {
            return (Map<String, Object>) data.get(DATA);
        }

        return Map.of();
    }

    @SuppressWarnings("unchecked")
    private boolean isStatusOk(final URI uri, final Map<String, Object> data) throws IOException {
        final var status = (Map<String, Object>) data.get(STATUS);
        if (status != null) {
            return (status.containsKey(ERROR_CODE) && ERROR_CODE_OK.equals(status.get(ERROR_CODE))) &&
                    (status.containsKey(ERROR_MESSAGE) && ERROR_MESSAGE_SUCCESS.equals(status.get(ERROR_MESSAGE)));
        } else {
            throw new IOException("Failed to fetch data by uri: " + uri);
        }
    }
}
