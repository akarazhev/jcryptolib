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
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

import static com.github.akarazhev.jcryptolib.cmc.config.Range.DAYS_30;
import static com.github.akarazhev.jcryptolib.cmc.config.Range.HOURS_24;
import static com.github.akarazhev.jcryptolib.cmc.config.Type.AS;
import static com.github.akarazhev.jcryptolib.cmc.config.Type.CMC;
import static com.github.akarazhev.jcryptolib.cmc.config.Type.ETF_NF;
import static com.github.akarazhev.jcryptolib.cmc.config.Type.FG;
import static com.github.akarazhev.jcryptolib.cmc.stream.Constants.CMC.AS_PERIOD_DAYS;
import static com.github.akarazhev.jcryptolib.cmc.stream.Constants.CMC.FG_PERIOD_DAYS;
import static com.github.akarazhev.jcryptolib.cmc.stream.Constants.CMC.MAX_CMC_100_INDEX_ITEMS;
import static com.github.akarazhev.jcryptolib.cmc.stream.Constants.CMC.MAX_FEAR_GREED_ITEMS;
import static com.github.akarazhev.jcryptolib.cmc.stream.Constants.CMC.USD_ID;
import static com.github.akarazhev.jcryptolib.cmc.stream.Constants.Response.DATA;
import static com.github.akarazhev.jcryptolib.cmc.stream.Constants.Response.ERROR_CODE;
import static com.github.akarazhev.jcryptolib.cmc.stream.Constants.Response.ERROR_CODE_OK_INT;
import static com.github.akarazhev.jcryptolib.cmc.stream.Constants.Response.ERROR_CODE_OK_STR;
import static com.github.akarazhev.jcryptolib.cmc.stream.Constants.Response.ERROR_MESSAGE;
import static com.github.akarazhev.jcryptolib.cmc.stream.Constants.Response.ERROR_MESSAGE_EMPTY;
import static com.github.akarazhev.jcryptolib.cmc.stream.Constants.Response.ERROR_MESSAGE_SUCCESS;
import static com.github.akarazhev.jcryptolib.cmc.stream.Constants.Response.STATUS;
import static com.github.akarazhev.jcryptolib.cmc.stream.Constants.Response.STATUS_CODE_OK;
import static com.github.akarazhev.jcryptolib.util.TimeUtils.todayInUtc;
import static com.github.akarazhev.jcryptolib.util.TimeUtils.tomorrowInUtc;

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
            if (CMC.equals(type)) {
                fetch(CmcRequestBuilder.buildCryptoMarketCapRequest(USD_ID, DAYS_30), type, Source.CMC);
            } else if (ETF_NF.equals(type)) {
                fetch(CmcRequestBuilder.buildCryptoEftNetFlowRequest(DAYS_30), type, Source.ETF_NF);
            } else if (FG.equals(type)) {
                final var end = tomorrowInUtc();
                final var start = end - TimeUnit.DAYS.toSeconds(FG_PERIOD_DAYS);
                fetch(CmcRequestBuilder.buildFearGreedRequest(USD_ID, start, end), type, Source.FG);
            } else if (AS.equals(type)) {
                final var end = tomorrowInUtc();
                final var start = end - TimeUnit.DAYS.toSeconds(AS_PERIOD_DAYS);
                fetch(CmcRequestBuilder.buildAltcoinSeasonRequest(USD_ID, start, end), type, Source.AS);
            } else if (Type.BDO.equals(type)) {
                fetch(CmcRequestBuilder.buildBitcoinDominanceOverviewRequest(), type, Source.BDO);
            } else if (Type.BD.equals(type)) {
                fetch(CmcRequestBuilder.buildBitcoinDominanceRequest(DAYS_30), type, Source.BD);
            } else if (Type.MCL.equals(type)) {
                fetch(CmcRequestBuilder.buildMarketCycleLatestRequest(USD_ID), type, Source.MCL);
            } else if (Type.PM.equals(type)) {
                fetch(CmcRequestBuilder.buildPuellMultipleRequest(USD_ID, DAYS_30), type, Source.PM);
            } else if (Type.IND.equals(type)) {
                fetch(CmcRequestBuilder.buildIndicatorsRequest(USD_ID), type, Source.IND);
            } else if (Type.PCT.equals(type)) {
                fetch(CmcRequestBuilder.buildPiCycleTopIndicatorRequest(USD_ID, DAYS_30), type, Source.PCT);
            } else if (Type.BRP.equals(type)) {
                fetch(CmcRequestBuilder.buildBitcoinRainbowPriceRequest(USD_ID, DAYS_30), type, Source.BRP);
            } else if (Type.CMC100_API_PRO_L.equals(type)) {
                fetch(CmcRequestBuilder.buildCoinMarketCap100IndexApiProLatestRequest(config.getApiKey()), type,
                        Source.CMC100_API_PRO_L);
            } else if (Type.CMC100L.equals(type)) {
                fetch(CmcRequestBuilder.buildCoinMarketCap100IndexLatestRequest(HOURS_24), type, Source.CMC100L);
            } else if (Type.CMC100H.equals(type)) {
                fetch(CmcRequestBuilder.buildCoinMarketCap100IndexHistoryRequest(HOURS_24), type, Source.CMC100H);
            } else if (Type.CMC100_API_PRO_H.equals(type)) {
                fetchCmc100IndexHistorical();
            } else if (Type.CSV.equals(type)) {
                fetch(CmcRequestBuilder.buildCryptoSpotVolumeRequest(USD_ID, HOURS_24), type, Source.CSV);
            } else if (Type.OIO.equals(type)) {
                fetch(CmcRequestBuilder.buildOpenInterestOverviewRequest(USD_ID), type, Source.OIO);
            } else if (Type.OI.equals(type)) {
                fetch(CmcRequestBuilder.buildOpenInterestRequest(USD_ID, HOURS_24), type, Source.OI);
            } else if (Type.DV.equals(type)) {
                fetch(CmcRequestBuilder.buildDerivativesVolumeRequest(USD_ID, HOURS_24), type, Source.DV);
            } else if (Type.FR.equals(type)) {
                fetch(CmcRequestBuilder.buildFundingRatesRequest(USD_ID, HOURS_24), type, Source.FR);
            } else if (Type.VIV.equals(type)) {
                fetch(CmcRequestBuilder.buildVolmexImpliedVolatilityRequest(USD_ID, HOURS_24), type, Source.VIV);
            } else if (Type.FG_API_PRO_L.equals(type)) {
                fetch(CmcRequestBuilder.buildFearGreedApiProLatestRequest(config.getApiKey()), type, Source.FG_API_PRO_L);
            } else if (Type.FG_API_PRO_H.equals(type)) {
                fetchFearGreedHistorical();
            } else if (Type.GM_API_PRO_L.equals(type)) {
                fetch(CmcRequestBuilder.buildGlobalMetricsApiProLatestRequest(config.getApiKey(), USD_ID), type,
                        Source.GM_API_PRO_L);
            }
        });
    }

    private void fetchCmc100IndexHistorical() {
        if (!emitter.isCancelled()) {
            var isMoreAvailable = true;
            var timeEnd = todayInUtc();
            while (isMoreAvailable && !emitter.isCancelled()) {
                try {
                    final var request = CmcRequestBuilder.buildCoinMarketCap100IndexApiProHistoricalRequest(config.getApiKey(),
                            timeEnd, MAX_CMC_100_INDEX_ITEMS);
                    final var response = client.send(request, HttpResponse.BodyHandlers.ofString());
                    if (response.statusCode() == STATUS_CODE_OK) {
                        final var result = getResultAsList(response.uri(), response.body());
                        if (result == null || result.isEmpty()) {
                            isMoreAvailable = false;
                        } else {
                            result.forEach(value -> {
                                LOGGER.debug("Fetched '{}' message: {}", Type.CMC100_API_PRO_H.getType(), value);
                                emitter.onNext(Payload.of(Provider.CMC, Source.CMC100_API_PRO_H, value));
                            });

                            if (result.size() < MAX_CMC_100_INDEX_ITEMS) {
                                isMoreAvailable = false;
                            } else {
                                timeEnd -= TimeUnit.DAYS.toSeconds(MAX_CMC_100_INDEX_ITEMS);
                            }
                        }
                    } else {
                        LOGGER.error("Failed to fetch '{}' data: HTTP {}", Type.CMC100_API_PRO_H.getType(), response.statusCode());
                        isMoreAvailable = false;
                    }
                } catch (final Exception e) {
                    LOGGER.error("Failed to fetch '{}' data", Type.CMC100_API_PRO_H.getType(), e);
                    emitter.onError(e);
                    isMoreAvailable = false;
                }
            }
        }
    }

    private void fetchFearGreedHistorical() {
        if (!emitter.isCancelled()) {
            var start = 1;
            var isMoreAvailable = true;
            while (isMoreAvailable && !emitter.isCancelled()) {
                try {
                    final var request = CmcRequestBuilder.buildFearGreedApiProHistoricalRequest(config.getApiKey(), start,
                            MAX_FEAR_GREED_ITEMS);
                    final var response = client.send(request, HttpResponse.BodyHandlers.ofString());
                    if (response.statusCode() == STATUS_CODE_OK) {
                        final var result = getResultAsList(response.uri(), response.body());
                        if (result == null || result.isEmpty()) {
                            isMoreAvailable = false;
                        } else {
                            result.forEach(value -> {
                                LOGGER.debug("Fetched '{}' message: {}", Type.FG_API_PRO_H.getType(), value);
                                emitter.onNext(Payload.of(Provider.CMC, Source.FG_API_PRO_H, value));
                            });

                            if (result.size() < MAX_FEAR_GREED_ITEMS) {
                                isMoreAvailable = false;
                            } else {
                                start += MAX_FEAR_GREED_ITEMS;
                            }
                        }
                    } else {
                        LOGGER.error("Failed to fetch '{}' data: HTTP {}", Type.FG_API_PRO_H.getType(), response.statusCode());
                        isMoreAvailable = false;
                    }
                } catch (final Exception e) {
                    LOGGER.error("Failed to fetch '{}' data", Type.FG_API_PRO_H.getType(), e);
                    emitter.onError(e);
                    isMoreAvailable = false;
                }
            }
        }
    }

    private void fetch(final HttpRequest request, final Type type, final Source source) {
        if (!emitter.isCancelled()) {
            try {
                final var response = client.send(request, HttpResponse.BodyHandlers.ofString());
                if (response.statusCode() == STATUS_CODE_OK) {
                    final var result = getResult(response.uri(), response.body());
                    if (result != null && !result.isEmpty()) {
                        LOGGER.debug("Fetched '{}' message: {}", type.getType(), result);
                        emitter.onNext(Payload.of(Provider.CMC, source, result));
                    }
                } else {
                    LOGGER.error("Failed to fetch '{}' data: HTTP {}", type.getType(), response.statusCode());
                }
            } catch (final Exception e) {
                LOGGER.error("Failed to fetch '{}' data", type.getType(), e);
                emitter.onError(e);
            }
        }
    }

    @SuppressWarnings("unchecked")
    private List<Map<String, Object>> getResultAsList(final URI uri, final String json) throws IOException {
        final var data = JsonUtils.jsonToMap(json);
        if (isStatusOk(uri, data)) {
            return (List<Map<String, Object>>) data.get(DATA);
        }

        return List.of();
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
            return ((status.containsKey(ERROR_CODE)) &&
                    (ERROR_CODE_OK_STR.equals(status.get(ERROR_CODE)) ||
                            ERROR_CODE_OK_INT == (Integer) status.get(ERROR_CODE))) &&
                    ((status.containsKey(ERROR_MESSAGE)) &&
                            (ERROR_MESSAGE_SUCCESS.equals(status.get(ERROR_MESSAGE)) ||
                                    ERROR_MESSAGE_EMPTY.equals(status.get(ERROR_MESSAGE)) ||
                                    (status.get(ERROR_MESSAGE) == null)));
        } else {
            throw new IOException("Failed to fetch data by uri: " + uri);
        }
    }
}
