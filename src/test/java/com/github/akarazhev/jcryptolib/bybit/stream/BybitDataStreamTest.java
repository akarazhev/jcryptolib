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

import com.github.akarazhev.jcryptolib.util.TestUtils;
import io.reactivex.rxjava3.core.BackpressureStrategy;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.subscribers.TestSubscriber;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.net.http.HttpClient;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import static com.github.akarazhev.jcryptolib.bybit.BybitConfig.getPublicTestnetSpot;
import static com.github.akarazhev.jcryptolib.bybit.BybitTestConfig.getPublicTickersBtcUsdt;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

final class BybitDataStreamTest {
    private static HttpClient client;

    @BeforeAll
    static void setup() {
        client = HttpClient.newHttpClient();
    }

    @AfterAll
    static void cleanup() {
        client.close();
    }

    @Test
    void testBasicDataStreamingAndCleanup() {
        final var stream = BybitDataStream.create(client, getPublicTestnetSpot(), getPublicTickersBtcUsdt());
        final var testSubscriber = new TestSubscriber<Map<String, Object>>();
        Flowable.create(stream, BackpressureStrategy.BUFFER).subscribe(testSubscriber);
        TestUtils.await(testSubscriber, 30, TimeUnit.SECONDS);

        testSubscriber.assertNoErrors();
        assertFalse(testSubscriber.values().isEmpty(), "Should receive at least one message");

        testSubscriber.cancel();
        TestUtils.sleep(1000);
        final var countAfterCancel = testSubscriber.values().size();
        TestUtils.sleep(1000);

        assertEquals(countAfterCancel, testSubscriber.values().size(), "No new messages after cancel");
    }

    @Test
    void testReconnectionOnSocketDrop() {
        final var stream = BybitDataStream.create(client, getPublicTestnetSpot(), getPublicTickersBtcUsdt());
        final var testSubscriber = new TestSubscriber<Map<String, Object>>();
        Flowable.create(stream, BackpressureStrategy.BUFFER).subscribe(testSubscriber);
        TestUtils.await(testSubscriber, 30, TimeUnit.SECONDS);

        assertFalse(testSubscriber.values().isEmpty(), "Should receive at least one message");
        testSubscriber.cancel();
        TestUtils.sleep(1000);

        final var testSubscriber2 = new TestSubscriber<Map<String, Object>>();
        Flowable.create(stream, BackpressureStrategy.BUFFER).subscribe(testSubscriber2);
        TestUtils.await(testSubscriber2, 30, TimeUnit.SECONDS);

        assertFalse(testSubscriber2.values().isEmpty(), "Should receive messages after reconnect");
        testSubscriber2.cancel();
    }

    @Test
    void testMultipleConcurrentStreams() {
        final var streamCount = 10;
        final var subscribers = new ArrayList<TestSubscriber<Map<String, Object>>>(streamCount);
        for (var i = 0; i < streamCount; i++) {
            final var stream = BybitDataStream.create(client, getPublicTestnetSpot(), getPublicTickersBtcUsdt());
            subscribers.set(i, new TestSubscriber<>());
            Flowable.create(stream, BackpressureStrategy.BUFFER).subscribe(subscribers.get(i));
        }

        for (final var sub : subscribers) {
            TestUtils.await(sub, 30, TimeUnit.SECONDS);
            assertFalse(sub.values().isEmpty(), "Each stream should receive at least one message");
        }

        for (final var sub : subscribers) {
            sub.cancel();
        }
    }

    @Test
    void testRapidConnectDisconnect() {
        for (var i = 0; i < 20; i++) {
            final var stream = BybitDataStream.create(client, getPublicTestnetSpot(), getPublicTickersBtcUsdt());
            final var testSubscriber = new TestSubscriber<Map<String, Object>>();
            Flowable.create(stream, BackpressureStrategy.BUFFER).subscribe(testSubscriber);
            TestUtils.await(testSubscriber, 10, TimeUnit.SECONDS);

            testSubscriber.cancel();
            TestUtils.sleep(200);
        }
    }
}