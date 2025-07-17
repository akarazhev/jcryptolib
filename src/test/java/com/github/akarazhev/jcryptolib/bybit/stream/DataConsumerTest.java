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
import com.github.akarazhev.jcryptolib.bybit.config.Topic;
import com.github.akarazhev.jcryptolib.bybit.config.Type;
import com.github.akarazhev.jcryptolib.stream.Payload;
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

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

final class DataConsumerTest {
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
    void testBasicWebSocketDataConsumingAndCleanup() {
        final var config = new DataConfig.Builder()
                .type(Type.PTST)
                .topic(Topic.TICKERS_BTC_USDT)
                .build();
        final var consumer = DataConsumer.create(client, config);
        final var testSubscriber = new TestSubscriber<Payload<Map<String, Object>>>();
        Flowable.create(consumer, BackpressureStrategy.BUFFER).subscribe(testSubscriber);
        TestUtils.await(testSubscriber, 3, TimeUnit.SECONDS);

        testSubscriber.assertNoErrors();
        assertFalse(testSubscriber.values().isEmpty(), "Should receive at least one message");

        testSubscriber.cancel();
        TestUtils.sleep(1000);
        final var countAfterCancel = testSubscriber.values().size();
        TestUtils.sleep(1000);

        assertEquals(countAfterCancel, testSubscriber.values().size(), "No new messages after cancel");
    }

    @Test
    void testBasicRestApiDataConsumingAndCleanup() {
        final var config = new DataConfig.Builder()
                .type(Type.ANMT)
                .param(RequestKey.LOCALE, RequestValue.EN_US)
                .param(RequestKey.TAG, RequestValue.LAUNCH_POOL)
                .build();
        final var consumer = DataConsumer.create(client, config);
        final var testSubscriber = new TestSubscriber<Payload<Map<String, Object>>>();
        Flowable.create(consumer, BackpressureStrategy.BUFFER).subscribe(testSubscriber);
        TestUtils.await(testSubscriber, 3, TimeUnit.SECONDS);

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
        final var config = new DataConfig.Builder()
                .type(Type.PTST)
                .topic(Topic.TICKERS_BTC_USDT)
                .build();
        final var consumer = DataConsumer.create(client, config);
        final var testSubscriber = new TestSubscriber<Payload<Map<String, Object>>>();
        Flowable.create(consumer, BackpressureStrategy.BUFFER).subscribe(testSubscriber);
        TestUtils.await(testSubscriber, 3, TimeUnit.SECONDS);

        assertFalse(testSubscriber.values().isEmpty(), "Should receive at least one message");
        testSubscriber.cancel();
        TestUtils.sleep(1000);

        final var testSubscriber2 = new TestSubscriber<Payload<Map<String, Object>>>();
        Flowable.create(consumer, BackpressureStrategy.BUFFER).subscribe(testSubscriber2);
        TestUtils.await(testSubscriber2, 3, TimeUnit.SECONDS);

        assertFalse(testSubscriber2.values().isEmpty(), "Should receive messages after reconnect");
        testSubscriber2.cancel();
    }

    @Test
    void testMultipleConcurrentConsumers() {
        final var consumerCount = 10;
        final var config = new DataConfig.Builder()
                .type(Type.PTST)
                .topic(Topic.TICKERS_BTC_USDT)
                .build();
        final var subscribers = new ArrayList<TestSubscriber<Payload<Map<String, Object>>>>(consumerCount);
        for (var i = 0; i < consumerCount; i++) {
            final var consumer = DataConsumer.create(client, config);
            subscribers.add(i, new TestSubscriber<>());
            Flowable.create(consumer, BackpressureStrategy.BUFFER).subscribe(subscribers.get(i));
        }

        for (final var sub : subscribers) {
            TestUtils.await(sub, 3, TimeUnit.SECONDS);
            assertFalse(sub.values().isEmpty(), "Each consumer should receive at least one message");
        }

        for (final var sub : subscribers) {
            sub.cancel();
        }
    }

    @Test
    void testRapidConnectDisconnect() {
        final var config = new DataConfig.Builder()
                .type(Type.PTST)
                .topic(Topic.TICKERS_BTC_USDT)
                .build();
        for (var i = 0; i < 20; i++) {
            final var consumer = DataConsumer.create(client, config);
            final var testSubscriber = new TestSubscriber<Payload<Map<String, Object>>>();
            Flowable.create(consumer, BackpressureStrategy.BUFFER).subscribe(testSubscriber);
            TestUtils.await(testSubscriber, 3, TimeUnit.SECONDS);

            testSubscriber.cancel();
            TestUtils.sleep(200);
        }
    }
}