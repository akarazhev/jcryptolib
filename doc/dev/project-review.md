# Changes Proposed (blocking rate limiter + safe scheduling)

I proposed targeted edits to implement blocking rate limiting and avoid starvation, and to move blocking work to IO threads. Here’s what I updated:

- __[resilience/RateLimiter.java](cci:7://file:///Users/andrey.karazhev/Developer/github/jcryptolib/src/main/java/com/github/akarazhev/jcryptolib/resilience/RateLimiter.java:0:0-0:0)__
    - Added a blocking `acquire()` that sleeps for the remaining interval if needed.
    - Kept existing [tryAcquire()](cci:1://file:///Users/andrey.karazhev/Developer/github/jcryptolib/src/main/java/com/github/akarazhev/jcryptolib/resilience/RateLimiter.java:36:4-50:5) for non-blocking scenarios (e.g., WebSocket ping/reconnect).
- __[bybit/stream/BybitDataFetcher.java](cci:7://file:///Users/andrey.karazhev/Developer/github/jcryptolib/src/main/java/com/github/akarazhev/jcryptolib/bybit/stream/BybitDataFetcher.java:0:0-0:0)__
    - Switched `Flowable.interval(...)` to `Schedulers.io()` to allow safe blocking.
    - Replaced all [rateLimiter.tryAcquire()](cci:1://file:///Users/andrey.karazhev/Developer/github/jcryptolib/src/main/java/com/github/akarazhev/jcryptolib/resilience/RateLimiter.java:36:4-50:5) checks with `rateLimiter.acquire()` before each HTTP call to prevent skipping endpoints within a cycle.
- __[cmc/stream/CmcDataFetcher.java](cci:7://file:///Users/andrey.karazhev/Developer/github/jcryptolib/src/main/java/com/github/akarazhev/jcryptolib/cmc/stream/CmcDataFetcher.java:0:0-0:0)__
    - Switched periodic interval to `Schedulers.io()`.
    - Replaced [tryAcquire()](cci:1://file:///Users/andrey.karazhev/Developer/github/jcryptolib/src/main/java/com/github/akarazhev/jcryptolib/resilience/RateLimiter.java:36:4-50:5) with `acquire()` in:
        - Paginated/historical loops (no more early breaks due to temporary rate pressure).
        - Single-request flows.
- __[bybit/stream/RestApiDataFetcher.java](cci:7://file:///Users/andrey.karazhev/Developer/github/jcryptolib/src/main/java/com/github/akarazhev/jcryptolib/bybit/stream/RestApiDataFetcher.java:0:0-0:0)__
    - Switched periodic interval to `Schedulers.io()`.
    - Replaced [tryAcquire()](cci:1://file:///Users/andrey.karazhev/Developer/github/jcryptolib/src/main/java/com/github/akarazhev/jcryptolib/resilience/RateLimiter.java:36:4-50:5) with `acquire()` in [fetchWithResilience()](cci:1://file:///Users/andrey.karazhev/Developer/github/jcryptolib/src/main/java/com/github/akarazhev/jcryptolib/cmc/stream/CmcDataFetcher.java:289:4-324:5).

- __Left intentionally unchanged: [bybit/stream/DataConsumerListener.java](cci:7://file:///Users/andrey.karazhev/Developer/github/jcryptolib/src/main/java/com/github/akarazhev/jcryptolib/bybit/stream/DataConsumerListener.java:0:0-0:0)__
    - WebSocket reconnect limiter and ping limiter continue using [tryAcquire()](cci:1://file:///Users/andrey.karazhev/Developer/github/jcryptolib/src/main/java/com/github/akarazhev/jcryptolib/resilience/RateLimiter.java:36:4-50:5) (non-blocking). This avoids blocking listener threads and preserves responsiveness for ping/pong and reconnect.

# Why this helps

- __Prevents starvation__: `acquire()` ensures every configured endpoint gets a fair chance to execute rather than being skipped when multiple are attempted in the same cycle.
- __Threading safety__: Moving interval scheduling to `Schedulers.io()` allows the blocking acquisition and HTTP I/O to run without impacting Rx computation threads.
- __Backwards-compatible__: Existing non-blocking rate-limited flows (ping/reconnect) remain unchanged.

# What you need to do

- Apply the proposed patches I provided to:
    - [resilience/RateLimiter.java](cci:7://file:///Users/andrey.karazhev/Developer/github/jcryptolib/src/main/java/com/github/akarazhev/jcryptolib/resilience/RateLimiter.java:0:0-0:0)
    - [bybit/stream/BybitDataFetcher.java](cci:7://file:///Users/andrey.karazhev/Developer/github/jcryptolib/src/main/java/com/github/akarazhev/jcryptolib/bybit/stream/BybitDataFetcher.java:0:0-0:0)
    - [cmc/stream/CmcDataFetcher.java](cci:7://file:///Users/andrey.karazhev/Developer/github/jcryptolib/src/main/java/com/github/akarazhev/jcryptolib/cmc/stream/CmcDataFetcher.java:0:0-0:0)
    - [bybit/stream/RestApiDataFetcher.java](cci:7://file:///Users/andrey.karazhev/Developer/github/jcryptolib/src/main/java/com/github/akarazhev/jcryptolib/bybit/stream/RestApiDataFetcher.java:0:0-0:0)

- Build and run tests:
    - mvn -q -DskipTests=false test
    - Optionally run any Bybit/WS integration tests you have to confirm listener behavior is unaffected.

# Notes and minor considerations

- __Cancellation timing__: If a tick fires and enters `acquire()`, cancellation may be delayed by up to one interval due to `Thread.sleep`. This is typically acceptable. If you want immediate interruption, we can refactor `acquire()` to be interruptible and check `Thread.interrupted()` in callers.
- __Double-rate limiting__: Some flows make multiple consecutive requests (e.g., initial “count” followed by a detail list). Each request rightfully acquires a permit, ensuring compliance.

# Summary of Status

- Proposed edits are ready and targeted to prevent request starvation and move blocking work off computation threads. Please apply the patches and run the build/tests. If you’d like, I can add a small unit test for `RateLimiter.acquire()` timing and update any docs.