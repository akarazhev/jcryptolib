# Findings

- __JPMS exports missing__: [module-info.java](cci:7://file:///Users/andrey.karazhev/Developer/github/jcryptolib/src/main/java/module-info.java:0:0-0:0) does not export any packages. Public API classes like [com.github.akarazhev.jcryptolib.DataStreams](cci:2://file:///Users/andrey.karazhev/Developer/github/jcryptolib/src/main/java/com/github/akarazhev/jcryptolib/DataStreams.java:35:0-57:1), [Clients](cci:2://file:///Users/andrey.karazhev/Developer/github/jcryptolib/src/main/java/com/github/akarazhev/jcryptolib/Clients.java:34:0-57:1), [bybit.stream.DataConfig](cci:2://file:///Users/andrey.karazhev/Developer/github/jcryptolib/src/main/java/com/github/akarazhev/jcryptolib/bybit/stream/DataConfig.java:40:0-315:1), [bybit.stream.BybitSubscriber](cci:2://file:///Users/andrey.karazhev/Developer/github/jcryptolib/src/main/java/com/github/akarazhev/jcryptolib/bybit/stream/BybitSubscriber.java:36:0-71:1), core stream types (`stream.Payload`, [stream.Subscriber](cci:2://file:///Users/andrey.karazhev/Developer/github/jcryptolib/src/main/java/com/github/akarazhev/jcryptolib/bybit/stream/BybitSubscriber.java:36:0-71:1), `stream.DataHandler`) will not be usable on the module path without `exports`.
- __Emitter concurrency and cancellation issues__:
    - [DataStreams.ofBybit()](cci:1://file:///Users/andrey.karazhev/Developer/github/jcryptolib/src/main/java/com/github/akarazhev/jcryptolib/DataStreams.java:42:4-48:5)/[ofCmc()](cci:1://file:///Users/andrey.karazhev/Developer/github/jcryptolib/src/main/java/com/github/akarazhev/jcryptolib/DataStreams.java:50:4-56:5) pass the raw `FlowableEmitter` to multiple producers via [com.github.akarazhev.jcryptolib.bybit.stream.DataConsumer.subscribe(...)](cci:1://file:///Users/andrey.karazhev/Developer/github/jcryptolib/src/main/java/com/github/akarazhev/jcryptolib/bybit/stream/DataConsumer.java:67:4-98:5) without serializing the emitter. This can cause concurrency violations when multiple threads call [onNext](cci:1://file:///Users/andrey.karazhev/Developer/github/jcryptolib/src/main/java/com/github/akarazhev/jcryptolib/bybit/stream/BybitSubscriber.java:48:4-54:5) on the same emitter.
    - [com.github.akarazhev.jcryptolib.bybit.stream.DataConsumer.subscribe()](cci:1://file:///Users/andrey.karazhev/Developer/github/jcryptolib/src/main/java/com/github/akarazhev/jcryptolib/bybit/stream/DataConsumer.java:67:4-98:5) calls `emitter.setCancellable(...)` up to three times (REST types, REST API, WebSocket) which overwrites the prior cancellable; earlier fetchers/listeners won’t be cancelled, leaking resources.
- __Pre-release dependencies__: [pom.xml](cci:7://file:///Users/andrey.karazhev/Developer/github/jcryptolib/pom.xml:0:0-0:0) pins RC/alpha versions (Jackson 2.20.0-rc1, SLF4J 2.1.0-alpha1, JUnit 6.0.0-RC1). These are not production-grade.
- __Logging config__: [src/main/resources/logback.xml](cci:7://file:///Users/andrey.karazhev/Developer/github/jcryptolib/src/main/resources/logback.xml:0:0-0:0) sets root level to DEBUG globally; no async appender; no separate test config.
- __Configuration coupling__: [AppConfig](cci:2://file:///Users/andrey.karazhev/Developer/github/jcryptolib/src/main/java/com/github/akarazhev/jcryptolib/config/AppConfig.java:29:0-85:1) eagerly loads [application.properties](cci:7://file:///Users/andrey.karazhev/Developer/github/jcryptolib/src/main/resources/application.properties:0:0-0:0) at class load and throws if not present, and reads env vars by dotted keys like [client.connect.timeout.ms](cci:1://file:///Users/andrey.karazhev/Developer/github/jcryptolib/src/main/java/com/github/akarazhev/jcryptolib/bybit/stream/DataConfig.java:111:4-113:5) ([AppConfig.getAsInt()](cci:1://file:///Users/andrey.karazhev/Developer/github/jcryptolib/src/main/java/com/github/akarazhev/jcryptolib/config/AppConfig.java:64:4-66:5) used in [Clients.newHttpClient()](cci:1://file:///Users/andrey.karazhev/Developer/github/jcryptolib/src/main/java/com/github/akarazhev/jcryptolib/Clients.java:41:4-47:5)). This is brittle for libraries and makes environment variable usage impractical. Also, connect timeout exists both in [AppConfig](cci:2://file:///Users/andrey.karazhev/Developer/github/jcryptolib/src/main/java/com/github/akarazhev/jcryptolib/config/AppConfig.java:29:0-85:1) and provider configs ([bybit.stream.DataConfig](cci:2://file:///Users/andrey.karazhev/Developer/github/jcryptolib/src/main/java/com/github/akarazhev/jcryptolib/bybit/stream/DataConfig.java:40:0-315:1)), causing duplication.
- __HTTP robustness__:
    - Blocking `HttpClient#send` is used in fetchers without per-request timeouts; a stalled response can hang a fetch loop. Rate limiter blocks with `Thread.sleep()` on IO scheduler.
    - No retries/backoff around REST requests (circuit breaker prevents storms but does not retry a one-off transient error).
- __Unfinished component__: [bybit.stream.DataPublisher](cci:2://file:///Users/andrey.karazhev/Developer/github/jcryptolib/src/main/java/com/github/akarazhev/jcryptolib/bybit/stream/DataPublisher.java:46:0-184:1) is marked TODO and uses [URI.create("")](cci:1://file:///Users/andrey.karazhev/Developer/github/jcryptolib/src/main/java/com/github/akarazhev/jcryptolib/bybit/stream/BybitSubscriber.java:44:4-46:5). Should not ship in a production library as-is.
- __Error handling strategy__: Fetchers often call [emitter.onError(e)](cci:1://file:///Users/andrey.karazhev/Developer/github/jcryptolib/src/main/java/com/github/akarazhev/jcryptolib/bybit/stream/DataPublisher.java:171:8-175:9) on a single request failure ([BybitDataFetcher](cci:2://file:///Users/andrey.karazhev/Developer/github/jcryptolib/src/main/java/com/github/akarazhev/jcryptolib/bybit/stream/BybitDataFetcher.java:73:0-376:1), [CmcDataFetcher](cci:2://file:///Users/andrey.karazhev/Developer/github/jcryptolib/src/main/java/com/github/akarazhev/jcryptolib/cmc/stream/CmcDataFetcher.java:76:0-350:1)), terminating the entire stream; that’s usually undesirable for continuous data pipelines.
- __Observability__: Project lacks metrics/tracing; resilience state not exported; logs are unstructured.

# Critical fixes (highest priority)

1. __Export API packages__ in [module-info.java](cci:7://file:///Users/andrey.karazhev/Developer/github/jcryptolib/src/main/java/module-info.java:0:0-0:0).
    - Export at least: `com.github.akarazhev.jcryptolib`, [com.github.akarazhev.jcryptolib.stream](cci:1://file:///Users/andrey.karazhev/Developer/github/jcryptolib/src/main/java/com/github/akarazhev/jcryptolib/bybit/stream/DataConfig.java:216:8-219:9), [com.github.akarazhev.jcryptolib.bybit.stream](cci:1://file:///Users/andrey.karazhev/Developer/github/jcryptolib/src/main/java/com/github/akarazhev/jcryptolib/bybit/stream/DataConfig.java:216:8-219:9), and [com.github.akarazhev.jcryptolib.cmc.stream](cci:1://file:///Users/andrey.karazhev/Developer/github/jcryptolib/src/main/java/com/github/akarazhev/jcryptolib/bybit/stream/DataConfig.java:216:8-219:9).
    - Keep internals non-exported. Keep Jackson reflective access minimal via `opens` to specific DTO packages if needed.

2. __Make emitter thread-safe and fix cancellation__.
    - In [DataStreams.ofBybit()](cci:1://file:///Users/andrey.karazhev/Developer/github/jcryptolib/src/main/java/com/github/akarazhev/jcryptolib/DataStreams.java:42:4-48:5) and [ofCmc()](cci:1://file:///Users/andrey.karazhev/Developer/github/jcryptolib/src/main/java/com/github/akarazhev/jcryptolib/DataStreams.java:50:4-56:5), wrap the emitter with `emitter.serialize()` before passing into [DataConsumer.subscribe(...)](cci:1://file:///Users/andrey.karazhev/Developer/github/jcryptolib/src/main/java/com/github/akarazhev/jcryptolib/bybit/stream/DataConsumer.java:67:4-98:5).
    - In [bybit.stream.DataConsumer.subscribe()](cci:1://file:///Users/andrey.karazhev/Developer/github/jcryptolib/src/main/java/com/github/akarazhev/jcryptolib/bybit/stream/DataConsumer.java:67:4-98:5), don’t call `setCancellable()` multiple times. Use a single composite cancel action (or `CompositeDisposable` via `emitter.setDisposable(...)`) that cancels all started components (REST types fetcher, REST API fetcher, WebSocket listener).

3. __Move to stable dependency versions__ in [pom.xml](cci:7://file:///Users/andrey.karazhev/Developer/github/jcryptolib/pom.xml:0:0-0:0).
    - Jackson: latest stable 2.17.x.
    - SLF4J: 2.0.x (stable).
    - JUnit: 5.11.x (JUnit Jupiter), not 6 RC.
    - Keep Logback 1.5.x (stable), RxJava3 latest stable 3.1.x.

4. __Harden HTTP requests__.
    - Add per-request timeouts via `HttpRequest.Builder.timeout(Duration)`.
    - Add retry with exponential backoff for transient failures around [client.send(...)](cci:1://file:///Users/andrey.karazhev/Developer/github/jcryptolib/src/main/java/com/github/akarazhev/jcryptolib/bybit/stream/DataPublisher.java:94:4-101:5) (at least a bounded retry count).
    - Consider `sendAsync()` or virtual threads (Java 21+/24) to avoid blocking IO threads; otherwise keep clear scheduler isolation.

5. __Adjust logging defaults__.
    - Default log level INFO in [logback.xml](cci:7://file:///Users/andrey.karazhev/Developer/github/jcryptolib/src/main/resources/logback.xml:0:0-0:0).
    - Add `AsyncAppender` for console; create `logback-test.xml` with DEBUG for tests.
    - Avoid logging large payloads at DEBUG within hot paths unless guarded.

# High-priority improvements

- __Config design__:
    - Avoid static, failing [AppConfig](cci:2://file:///Users/andrey.karazhev/Developer/github/jcryptolib/src/main/java/com/github/akarazhev/jcryptolib/config/AppConfig.java:29:0-85:1) in a library. Prefer passing config values via builders ([DataConfig](cci:2://file:///Users/andrey.karazhev/Developer/github/jcryptolib/src/main/java/com/github/akarazhev/jcryptolib/bybit/stream/DataConfig.java:40:0-315:1), [Clients](cci:2://file:///Users/andrey.karazhev/Developer/github/jcryptolib/src/main/java/com/github/akarazhev/jcryptolib/Clients.java:34:0-57:1)) or a pluggable `ConfigProvider`.
    - Support environment variables mapping (e.g., map [client.connect.timeout.ms](cci:1://file:///Users/andrey.karazhev/Developer/github/jcryptolib/src/main/java/com/github/akarazhev/jcryptolib/bybit/stream/DataConfig.java:111:4-113:5) to `CLIENT_CONNECT_TIMEOUT_MS`) and system properties.
    - Remove timeout duplication: let [Clients.newHttpClient(Duration)](cci:1://file:///Users/andrey.karazhev/Developer/github/jcryptolib/src/main/java/com/github/akarazhev/jcryptolib/Clients.java:41:4-47:5) be constructed from calling code’s config; keep [Clients.newHttpClient()](cci:1://file:///Users/andrey.karazhev/Developer/github/jcryptolib/src/main/java/com/github/akarazhev/jcryptolib/Clients.java:41:4-47:5) as a convenience with a safe default.

- __Resilience library__:
    - Replace custom [CircuitBreaker](cci:2://file:///Users/andrey.karazhev/Developer/github/jcryptolib/src/main/java/com/github/akarazhev/jcryptolib/resilience/CircuitBreaker.java:29:0-97:1), [RateLimiter](cci:2://file:///Users/andrey.karazhev/Developer/github/jcryptolib/src/main/java/com/github/akarazhev/jcryptolib/resilience/RateLimiter.java:28:0-67:1), and ad-hoc retry with Resilience4j (circuitBreaker, rateLimiter, retry, timeLimiter) to get proven semantics and metrics integration.
    - If staying custom, add: jittered backoff, half-open trial limits, and metrics.

- __Stream error strategy__:
    - Don’t terminate the Flowable for recoverable single-call failures. Prefer logging + health status, and keep the loop going. Emit errors to a side-channel or as an error payload envelope if needed by clients.

- __Backpressure__:
    - [Flowable.create(..., BackpressureStrategy.BUFFER)](cci:1://file:///Users/andrey.karazhev/Developer/github/jcryptolib/src/main/java/com/github/akarazhev/jcryptolib/bybit/stream/BybitSubscriber.java:44:4-46:5) is unbounded. Provide a bounded buffer and overflow strategy or use `onBackpressureBuffer(capacity, ..., DROP_OLDEST)` downstream.

- __Request timeouts and headers__:
    - Add read timeout per request as above.
    - Ensure sensitive headers/keys are never logged.

- __Finish or isolate [DataPublisher](cci:2://file:///Users/andrey.karazhev/Developer/github/jcryptolib/src/main/java/com/github/akarazhev/jcryptolib/bybit/stream/DataPublisher.java:46:0-184:1)__:
    - Either complete it with real URI and auth/subscription handling or move it to an `internal`/experimental package excluded from release artifacts.

# Medium-term improvements

- __Typed DTOs vs raw maps__:
    - Replace [Map<String, Object>](cci:1://file:///Users/andrey.karazhev/Developer/github/jcryptolib/src/main/java/com/github/akarazhev/jcryptolib/util/JsonUtils.java:68:4-74:5) with records/POJOs for stable endpoints; keep a fallback dynamic parser for volatile payloads. Improves type-safety and reduces runtime casting.

- __Observability__:
    - Micrometer metrics: per-endpoint success/failure, breaker state, rate limit waits, latencies.
    - MDC correlation and structured JSON logs for downstream ingestion (optional).

- __Build and QA__:
    - Maven Enforcer plugin, OWASP dep-check, SpotBugs, Checkstyle/Formatter.
    - Surefire/FailSafe on latest stable; Reproducible builds flags.
    - GitHub Actions CI: build, test matrix for Java 21 and 24, vulnerability scanning.

- __Testing__:
    - WireMock-based integration tests for [BybitDataFetcher](cci:2://file:///Users/andrey.karazhev/Developer/github/jcryptolib/src/main/java/com/github/akarazhev/jcryptolib/bybit/stream/BybitDataFetcher.java:73:0-376:1)/[CmcDataFetcher](cci:2://file:///Users/andrey.karazhev/Developer/github/jcryptolib/src/main/java/com/github/akarazhev/jcryptolib/cmc/stream/CmcDataFetcher.java:76:0-350:1).
    - Concurrency/cancellation tests to ensure no leaks and correct `CompositeDisposable` behavior.
    - Contract tests for [module-info.java](cci:7://file:///Users/andrey.karazhev/Developer/github/jcryptolib/src/main/java/module-info.java:0:0-0:0) exports.

# Java version policy

- Target __Java 21 LTS__ as baseline for production. Keep Java 24 compatibility tested via CI matrix.
- If you require 24-only features, clearly document and keep a separate branch or profile.

# Concrete code change recommendations

- __module-info.java__
    - Add exports:
        - `exports com.github.akarazhev.jcryptolib;`
        - `exports com.github.akarazhev.jcryptolib.stream;`
        - `exports com.github.akarazhev.jcryptolib.bybit.stream;`
        - `exports com.github.akarazhev.jcryptolib.cmc.stream;`
    - Keep [opens ...bybit.stream](cci:1://file:///Users/andrey.karazhev/Developer/github/jcryptolib/src/main/java/com/github/akarazhev/jcryptolib/bybit/stream/DataConfig.java:216:8-219:9) only if Jackson needs reflection for request/response DTOs.

- __DataStreams.java__
    - Serialize emitter:
        - Create Flowable with [emitter -> DataConsumer.create(...).subscribe(emitter.serialize())](cci:1://file:///Users/andrey.karazhev/Developer/github/jcryptolib/src/main/java/com/github/akarazhev/jcryptolib/bybit/stream/BybitSubscriber.java:44:4-46:5).

- __bybit.stream.DataConsumer.subscribe()__
    - Build a composite cancel:
        - Start zero-to-three components (types fetcher, REST API fetcher, WebSocket listener).
        - Use a single `setDisposable(Disposables.fromAction(() -> { cancel all }))` or `CompositeDisposable`.
        - Ensure each component’s cancel does not depend on `emitter.isCancelled()` being true before disposing.

- __Fetchers ([BybitDataFetcher](cci:2://file:///Users/andrey.karazhev/Developer/github/jcryptolib/src/main/java/com/github/akarazhev/jcryptolib/bybit/stream/BybitDataFetcher.java:73:0-376:1), [CmcDataFetcher](cci:2://file:///Users/andrey.karazhev/Developer/github/jcryptolib/src/main/java/com/github/akarazhev/jcryptolib/cmc/stream/CmcDataFetcher.java:76:0-350:1))__
    - Add request-level timeout on every built request.
    - Wrap [client.send(...)](cci:1://file:///Users/andrey.karazhev/Developer/github/jcryptolib/src/main/java/com/github/akarazhev/jcryptolib/bybit/stream/DataPublisher.java:94:4-101:5) with bounded retries + backoff.
    - Replace [emitter.onError(e)](cci:1://file:///Users/andrey.karazhev/Developer/github/jcryptolib/src/main/java/com/github/akarazhev/jcryptolib/bybit/stream/DataPublisher.java:171:8-175:9) with non-terminal behavior for transient errors.

- __pom.xml__
    - Replace RC/alpha deps with stable versions (Jackson 2.17.x, SLF4J 2.0.x, JUnit 5.11.x).
    - Add Maven Enforcer; add versions plugin; optional Resilience4j and Micrometer.

- __logback.xml__
    - Root level INFO + async appender; add `src/test/resources/logback-test.xml` with DEBUG.

- __AppConfig/Clients__
    - Decouple default config loading from static initializer; accept injected values.
    - Support env var mapping to underscores; avoid hard failure if file missing.

# Questions

- Do you want to target Java 21 LTS baseline, with CI testing on Java 24?
- Are you open to adding Resilience4j and Micrometer (adds small dependencies but big reliability/observability gains)?
- Should we keep Map-based payloads for maximum flexibility, or move to typed DTOs for key endpoints?
- Any preference for JSON logging (structured) vs plain text?

# Next steps

If you’d like, I can implement the top three items (module exports, emitter/cancellation fix, dependency hardening + logging defaults) in small, reviewable PRs. Say the word and I’ll propose precise patches.

Summary: I reviewed the core architecture and identified critical production gaps in module exports, RxJava emitter/cancellation, and dependency/logging hardening. I provided prioritized actions to make the library robust, maintainable, and production-ready.