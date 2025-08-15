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
import com.github.akarazhev.jcryptolib.resilience.CircuitBreaker;
import com.github.akarazhev.jcryptolib.resilience.RateLimiter;
import com.github.akarazhev.jcryptolib.resilience.HealthCheck;
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
import static com.github.akarazhev.jcryptolib.bybit.config.Type.ADHP;
import static com.github.akarazhev.jcryptolib.bybit.config.Type.BYS;
import static com.github.akarazhev.jcryptolib.bybit.config.Type.BYSP;
import static com.github.akarazhev.jcryptolib.bybit.config.Type.BYV;
import static com.github.akarazhev.jcryptolib.bybit.config.Type.BYVP;
import static com.github.akarazhev.jcryptolib.bybit.config.Type.LPD;
import static com.github.akarazhev.jcryptolib.bybit.config.Type.LPL;
import static com.github.akarazhev.jcryptolib.bybit.config.Type.MD;
import static com.github.akarazhev.jcryptolib.bybit.stream.Constants.Response.LIST;
import static com.github.akarazhev.jcryptolib.bybit.stream.Constants.Response.OK;
import static com.github.akarazhev.jcryptolib.bybit.stream.Constants.Response.PROJECTS;
import static com.github.akarazhev.jcryptolib.bybit.stream.Constants.Response.PROJECT_COUNT;
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
    private final CircuitBreaker circuitBreaker;
    private final RateLimiter rateLimiter;
    private final HealthCheck healthCheck;

    public static BybitDataFetcher create(final HttpClient client, final DataConfig config,
                                          final FlowableEmitter<Payload<Map<String, Object>>> emitter) {
        return new BybitDataFetcher(client, config, emitter);
    }

    private BybitDataFetcher(final HttpClient client, final DataConfig config,
                             final FlowableEmitter<Payload<Map<String, Object>>> emitter) {
        this.client = Objects.requireNonNull(client, "Client must be not null");
        this.config = Objects.requireNonNull(config, "Config must be not null");
        this.emitter = Objects.requireNonNull(emitter, "Emitter must be not null");
        this.circuitBreaker = new CircuitBreaker(config.getCircuitBreakerThreshold(), config.getCircuitBreakerTimeoutMs());
        this.rateLimiter = new RateLimiter(config.getRestRateLimitMs());
        this.healthCheck = new HealthCheck(status -> LOGGER.info("Bybit Health: {}", status));
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
                fetchLaunchPadsWithResilience();
            } else if (MD.equals(type)) {
                fetchAsListWithResilience(BybitRequestBuilder.buildMegaDropRequest(), type, Source.MD);
            } else if (LPL.equals(type)) {
                fetchLaunchPoolsWithResilience();
            } else if (BYV.equals(type) || BYVP.equals(type)) {
                fetchAsListWithResilience(BybitRequestBuilder.buildByVotesRequest(type), type, Source.BYV);
            } else if (BYS.equals(type) || BYSP.equals(type)) {
                fetchByStarterWithResilience(type);
            } else if (ADH.equals(type) || ADHP.equals(type)) {
                fetchAirdropHuntWithResilience(type);
            }
        });
    }

    private void fetchLaunchPadsWithResilience() {
        if (!emitter.isCancelled()) {
            if (!circuitBreaker.allowRequest()) {
                LOGGER.warn("Circuit breaker OPEN for '{}', skipping fetch", Type.LPD.getType());
                healthCheck.setStatus(HealthCheck.Status.UNHEALTHY);
                return;
            }

            if (!rateLimiter.tryAcquire()) {
                LOGGER.warn("Rate limit exceeded for '{}', skipping fetch", Type.LPD.getType());
                return;
            }

            try {
                final var response = client.send(BybitRequestBuilder.buildLaunchPadRequest(),
                        HttpResponse.BodyHandlers.ofString());
                if (response.statusCode() == STATUS_CODE_OK) {
                    final var result = getResultAsMap(response.uri(), response.body());
                    if (result != null && !result.isEmpty()) {
                        final var totalProjects = (Integer) result.get(TOTAL_PROJECTS);
                        fetchAsMapWithResilience(BybitRequestBuilder.buildLaunchPadRequest(totalProjects), Type.LPD,
                                Source.LPD);
                        circuitBreaker.recordSuccess();
                        healthCheck.setStatus(HealthCheck.Status.HEALTHY);
                    }
                } else {
                    LOGGER.error("Failed to fetch '{}' data: HTTP {}", Type.LPD.getType(), response.statusCode());
                    circuitBreaker.recordFailure();
                    healthCheck.setStatus(HealthCheck.Status.UNHEALTHY);
                }
            } catch (final Exception e) {
                LOGGER.error("Failed to fetch '{}' data", Type.LPD.getType(), e);
                circuitBreaker.recordFailure();
                healthCheck.setStatus(HealthCheck.Status.UNHEALTHY);
                emitter.onError(e);
            }
        }
    }

    private void fetchLaunchPoolsWithResilience() {
        if (!emitter.isCancelled()) {
            if (!circuitBreaker.allowRequest()) {
                LOGGER.warn("Circuit breaker OPEN for '{}', skipping fetch", Type.LPL.getType());
                healthCheck.setStatus(HealthCheck.Status.UNHEALTHY);
                return;
            }

            if (!rateLimiter.tryAcquire()) {
                LOGGER.warn("Rate limit exceeded for '{}', skipping fetch", Type.LPL.getType());
                return;
            }

            try {
                final var response = client.send(BybitRequestBuilder.buildLaunchPoolRequest(),
                        HttpResponse.BodyHandlers.ofString());
                if (response.statusCode() == STATUS_CODE_OK) {
                    final var result = getResultAsMap(response.uri(), response.body());
                    if (result != null && !result.isEmpty()) {
                        final var totalProjects = (Integer) result.get(TOTAL_PROJECTS);
                        fetchAsMapWithResilience(BybitRequestBuilder.buildLaunchPoolRequest(totalProjects), Type.LPL,
                                Source.LPL);
                        circuitBreaker.recordSuccess();
                        healthCheck.setStatus(HealthCheck.Status.HEALTHY);
                    }
                } else {
                    LOGGER.error("Failed to fetch '{}' data: HTTP {}", Type.LPL.getType(), response.statusCode());
                    circuitBreaker.recordFailure();
                    healthCheck.setStatus(HealthCheck.Status.UNHEALTHY);
                }
            } catch (final Exception e) {
                LOGGER.error("Failed to fetch '{}' data", Type.LPL.getType(), e);
                circuitBreaker.recordFailure();
                healthCheck.setStatus(HealthCheck.Status.UNHEALTHY);
                emitter.onError(e);
            }
        }
    }

    @SuppressWarnings("unchecked")
    private void fetchAsMapWithResilience(final HttpRequest request, final Type type, final Source source) {
        if (!emitter.isCancelled()) {
            if (!circuitBreaker.allowRequest()) {
                LOGGER.warn("Circuit breaker OPEN for '{}', skipping fetch", type.getType());
                healthCheck.setStatus(HealthCheck.Status.UNHEALTHY);
                return;
            }

            if (!rateLimiter.tryAcquire()) {
                LOGGER.warn("Rate limit exceeded for '{}', skipping fetch", type.getType());
                return;
            }

            try {
                final var response = client.send(request, HttpResponse.BodyHandlers.ofString());
                if (response.statusCode() == STATUS_CODE_OK) {
                    final var result = getResultAsMap(response.uri(), response.body());
                    if (result != null && !result.isEmpty()) {
                        final var data = ((List<Map<String, Object>>) result.get(LIST));
                        if (data != null && !data.isEmpty()) {
                            LOGGER.debug("Fetched '{}' message: {}", type.getType(), data);
                            data.forEach(d -> emitter.onNext(Payload.of(Provider.BYBIT, source, d)));
                        }

                        circuitBreaker.recordSuccess();
                        healthCheck.setStatus(HealthCheck.Status.HEALTHY);
                    }
                } else {
                    LOGGER.error("Failed to fetch '{}' data: HTTP {}", type.getType(), response.statusCode());
                    circuitBreaker.recordFailure();
                    healthCheck.setStatus(HealthCheck.Status.UNHEALTHY);
                }
            } catch (final Exception e) {
                LOGGER.error("Failed to fetch '{}' data", type.getType(), e);
                circuitBreaker.recordFailure();
                healthCheck.setStatus(HealthCheck.Status.UNHEALTHY);
                emitter.onError(e);
            }
        }
    }

    private void fetchAsListWithResilience(final HttpRequest request, final Type type, final Source source) {
        if (!emitter.isCancelled()) {
            if (!circuitBreaker.allowRequest()) {
                LOGGER.warn("Circuit breaker OPEN for '{}', skipping fetch", type.getType());
                healthCheck.setStatus(HealthCheck.Status.UNHEALTHY);
                return;
            }

            if (!rateLimiter.tryAcquire()) {
                LOGGER.warn("Rate limit exceeded for '{}', skipping fetch", type.getType());
                return;
            }

            try {
                final var response = client.send(request, HttpResponse.BodyHandlers.ofString());
                if (response.statusCode() == STATUS_CODE_OK) {
                    final var data = getResultAsList(response.uri(), response.body());
                    if (data != null && !data.isEmpty()) {
                        LOGGER.debug("Fetched '{}' message: {}", type.getType(), data);
                        data.forEach(d -> emitter.onNext(Payload.of(Provider.BYBIT, source, d)));
                        circuitBreaker.recordSuccess();
                        healthCheck.setStatus(HealthCheck.Status.HEALTHY);
                    }
                } else {
                    LOGGER.error("Failed to fetch '{}' data: HTTP {}", type.getType(), response.statusCode());
                    circuitBreaker.recordFailure();
                    healthCheck.setStatus(HealthCheck.Status.UNHEALTHY);
                }
            } catch (final Exception e) {
                LOGGER.error("Failed to fetch '{}' data", type.getType(), e);
                circuitBreaker.recordFailure();
                healthCheck.setStatus(HealthCheck.Status.UNHEALTHY);
                emitter.onError(e);
            }
        }
    }

    private void fetchByStarterWithResilience(final Type type) {
        if (!emitter.isCancelled()) {
            if (!circuitBreaker.allowRequest()) {
                LOGGER.warn("Circuit breaker OPEN for '{}', skipping fetch", type.getType());
                healthCheck.setStatus(HealthCheck.Status.UNHEALTHY);
                return;
            }

            if (!rateLimiter.tryAcquire()) {
                LOGGER.warn("Rate limit exceeded for '{}', skipping fetch", type.getType());
                return;
            }

            try {
                final var response = client.send(BybitRequestBuilder.buildByStarterRequest(),
                        HttpResponse.BodyHandlers.ofString());
                if (response.statusCode() == STATUS_CODE_OK) {
                    final var result = getResultAsMap(response.uri(), response.body());
                    if (result != null && !result.isEmpty()) {
                        final var projectCount = (Integer) result.get(PROJECT_COUNT);
                        fetchAsListWithResilience(BybitRequestBuilder.buildByStarterRequest(type, projectCount), type,
                                Source.BYS);
                        circuitBreaker.recordSuccess();
                        healthCheck.setStatus(HealthCheck.Status.HEALTHY);
                    }
                } else {
                    LOGGER.error("Failed to fetch '{}' data: HTTP {}", type.getType(), response.statusCode());
                    circuitBreaker.recordFailure();
                    healthCheck.setStatus(HealthCheck.Status.UNHEALTHY);
                }
            } catch (final Exception e) {
                LOGGER.error("Failed to fetch '{}' data", type.getType(), e);
                circuitBreaker.recordFailure();
                healthCheck.setStatus(HealthCheck.Status.UNHEALTHY);
                emitter.onError(e);
            }
        }
    }

    private void fetchAirdropHuntWithResilience(final Type type) {
        if (!emitter.isCancelled()) {
            if (!circuitBreaker.allowRequest()) {
                LOGGER.warn("Circuit breaker OPEN for '{}', skipping fetch", type.getType());
                healthCheck.setStatus(HealthCheck.Status.UNHEALTHY);
                return;
            }

            if (!rateLimiter.tryAcquire()) {
                LOGGER.warn("Rate limit exceeded for '{}', skipping fetch", type.getType());
                return;
            }

            try {
                final var response = client.send(BybitRequestBuilder.buildAirdropHuntRequest(),
                        HttpResponse.BodyHandlers.ofString());
                if (response.statusCode() == STATUS_CODE_OK) {
                    final var result = getResultAsMap(response.uri(), response.body());
                    if (result != null && !result.isEmpty()) {
                        final var projects = (Integer) result.get(PROJECTS);
                        fetchAsMapWithResilience(BybitRequestBuilder.buildAirdropHuntRequest(type, projects), type,
                                Source.ADH);
                        circuitBreaker.recordSuccess();
                        healthCheck.setStatus(HealthCheck.Status.HEALTHY);
                    }
                } else {
                    LOGGER.error("Failed to fetch '{}' data: HTTP {}", type.getType(), response.statusCode());
                    circuitBreaker.recordFailure();
                    healthCheck.setStatus(HealthCheck.Status.UNHEALTHY);
                }
            } catch (final Exception e) {
                LOGGER.error("Failed to fetch '{}' data", type.getType(), e);
                circuitBreaker.recordFailure();
                healthCheck.setStatus(HealthCheck.Status.UNHEALTHY);
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
