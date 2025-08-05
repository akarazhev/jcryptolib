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

import com.github.akarazhev.jcryptolib.bybit.Constants;
import com.github.akarazhev.jcryptolib.bybit.config.StreamType;
import com.github.akarazhev.jcryptolib.bybit.config.Topic;
import com.github.akarazhev.jcryptolib.stream.Payload;
import com.github.akarazhev.jcryptolib.util.TestUtils;
import io.reactivex.rxjava3.core.BackpressureStrategy;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.subscribers.TestSubscriber;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.net.http.HttpClient;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

final class BybitPublicLinearDataConsumerTest {
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
    public void shouldReceiveOrderBook1DataConsumer() {
        final var config = new DataConfig.Builder()
                .streamType(StreamType.PTL)
                .topic(Topic.ORDER_BOOK_1_BTC_USDT)
                .topic(Topic.ORDER_BOOK_1_ETH_USDT)
                .build();
        final var consumer = DataConsumer.create(client, config);
        final var testSubscriber = new TestSubscriber<Payload<Map<String, Object>>>();
        Flowable.create(consumer, BackpressureStrategy.BUFFER).subscribe(testSubscriber);
        assertFalse(TestUtils.await(testSubscriber, 3, TimeUnit.SECONDS), "Should not receive any messages");

        testSubscriber.assertNoErrors();
        assertFalse(testSubscriber.values().isEmpty(), "Should receive at least one message");

        testSubscriber.cancel();
        TestUtils.sleep(1000);
        final var countAfterCancel = testSubscriber.values().size();
        TestUtils.sleep(1000);

        assertEquals(countAfterCancel, testSubscriber.values().size(), "No new messages after cancel");
        for (final var value : testSubscriber.values()) {
            final var topic = value.getData().get(Constants.TOPIC_FIELD);
            assertTrue(Topic.ORDER_BOOK_1_BTC_USDT.toString().equals(topic) ||
                    Topic.ORDER_BOOK_1_ETH_USDT.toString().equals(topic));
        }
    }

    @Test
    public void shouldReceiveOrderBook50DataConsumer() {
        final var config = new DataConfig.Builder()
                .streamType(StreamType.PTL)
                .topic(Topic.ORDER_BOOK_50_BTC_USDT)
                .topic(Topic.ORDER_BOOK_50_ETH_USDT)
                .build();
        final var consumer = DataConsumer.create(client, config);
        final var testSubscriber = new TestSubscriber<Payload<Map<String, Object>>>();
        Flowable.create(consumer, BackpressureStrategy.BUFFER).subscribe(testSubscriber);
        assertFalse(TestUtils.await(testSubscriber, 3, TimeUnit.SECONDS), "Should not receive any messages");

        testSubscriber.assertNoErrors();
        assertFalse(testSubscriber.values().isEmpty(), "Should receive at least one message");

        testSubscriber.cancel();
        TestUtils.sleep(1000);
        final var countAfterCancel = testSubscriber.values().size();
        TestUtils.sleep(1000);

        assertEquals(countAfterCancel, testSubscriber.values().size(), "No new messages after cancel");
        for (final var value : testSubscriber.values()) {
            final var topic = value.getData().get(Constants.TOPIC_FIELD);
            assertTrue(Topic.ORDER_BOOK_50_BTC_USDT.toString().equals(topic) ||
                    Topic.ORDER_BOOK_50_ETH_USDT.toString().equals(topic));
        }
    }

    @Test
    public void shouldReceiveOrderBook200DataConsumer() {
        final var config = new DataConfig.Builder()
                .streamType(StreamType.PTL)
                .topic(Topic.ORDER_BOOK_200_BTC_USDT)
                .topic(Topic.ORDER_BOOK_200_ETH_USDT)
                .build();
        final var consumer = DataConsumer.create(client, config);
        final var testSubscriber = new TestSubscriber<Payload<Map<String, Object>>>();
        Flowable.create(consumer, BackpressureStrategy.BUFFER).subscribe(testSubscriber);
        assertFalse(TestUtils.await(testSubscriber, 3, TimeUnit.SECONDS), "Should not receive any messages");

        testSubscriber.assertNoErrors();
        assertFalse(testSubscriber.values().isEmpty(), "Should receive at least one message");

        testSubscriber.cancel();
        TestUtils.sleep(1000);
        final var countAfterCancel = testSubscriber.values().size();
        TestUtils.sleep(1000);

        assertEquals(countAfterCancel, testSubscriber.values().size(), "No new messages after cancel");
        for (final var value : testSubscriber.values()) {
            final var topic = value.getData().get(Constants.TOPIC_FIELD);
            assertTrue(Topic.ORDER_BOOK_200_BTC_USDT.toString().equals(topic) ||
                    Topic.ORDER_BOOK_200_ETH_USDT.toString().equals(topic));
        }
    }

    @Test
    public void shouldReceiveOrderBook500DataConsumer() {
        final var config = new DataConfig.Builder()
                .streamType(StreamType.PTL)
                .topic(Topic.ORDER_BOOK_500_BTC_USDT)
                .topic(Topic.ORDER_BOOK_500_ETH_USDT)
                .build();
        final var consumer = DataConsumer.create(client, config);
        final var testSubscriber = new TestSubscriber<Payload<Map<String, Object>>>();
        Flowable.create(consumer, BackpressureStrategy.BUFFER).subscribe(testSubscriber);
        assertFalse(TestUtils.await(testSubscriber, 3, TimeUnit.SECONDS), "Should not receive any messages");

        testSubscriber.assertNoErrors();
        assertFalse(testSubscriber.values().isEmpty(), "Should receive at least one message");

        testSubscriber.cancel();
        TestUtils.sleep(1000);
        final var countAfterCancel = testSubscriber.values().size();
        TestUtils.sleep(1000);

        assertEquals(countAfterCancel, testSubscriber.values().size(), "No new messages after cancel");
        for (final var value : testSubscriber.values()) {
            final var topic = value.getData().get(Constants.TOPIC_FIELD);
            assertTrue(Topic.ORDER_BOOK_500_BTC_USDT.toString().equals(topic) ||
                    Topic.ORDER_BOOK_500_ETH_USDT.toString().equals(topic));
        }
    }

    @Test
    public void shouldReceiveOrderBookRpiDataConsumer() {
        final var config = new DataConfig.Builder()
                .streamType(StreamType.PTL)
                .topic(Topic.ORDER_BOOK_RPI_BTC_USDT)
                .topic(Topic.ORDER_BOOK_RPI_ETH_USDT)
                .build();
        final var consumer = DataConsumer.create(client, config);
        final var testSubscriber = new TestSubscriber<Payload<Map<String, Object>>>();
        Flowable.create(consumer, BackpressureStrategy.BUFFER).subscribe(testSubscriber);
        assertFalse(TestUtils.await(testSubscriber, 3, TimeUnit.SECONDS), "Should not receive any messages");

        testSubscriber.assertNoErrors();
        assertFalse(testSubscriber.values().isEmpty(), "Should receive at least one message");

        testSubscriber.cancel();
        TestUtils.sleep(1000);
        final var countAfterCancel = testSubscriber.values().size();
        TestUtils.sleep(1000);

        assertEquals(countAfterCancel, testSubscriber.values().size(), "No new messages after cancel");
        for (final var value : testSubscriber.values()) {
            final var topic = value.getData().get(Constants.TOPIC_FIELD);
            assertTrue(Topic.ORDER_BOOK_RPI_BTC_USDT.toString().equals(topic) ||
                    Topic.ORDER_BOOK_RPI_ETH_USDT.toString().equals(topic));
        }
    }

    @Test
    public void shouldReceiveTradeDataConsumer() {
        final var config = new DataConfig.Builder()
                .streamType(StreamType.PTST)
                .topic(Topic.PUBLIC_TRADE_BTC_USDT)
                .topic(Topic.PUBLIC_TRADE_ETH_USDT)
                .build();
        final var consumer = DataConsumer.create(client, config);
        final var testSubscriber = new TestSubscriber<Payload<Map<String, Object>>>();
        Flowable.create(consumer, BackpressureStrategy.BUFFER).subscribe(testSubscriber);
        // Trade can happen at any time
        assertFalse(TestUtils.await(testSubscriber, 10, TimeUnit.MINUTES), "Should not receive any messages");

        testSubscriber.assertNoErrors();
        assertFalse(testSubscriber.values().isEmpty(), "Should receive at least one message");

        testSubscriber.cancel();
        TestUtils.sleep(1000);
        final var countAfterCancel = testSubscriber.values().size();
        TestUtils.sleep(1000);

        assertEquals(countAfterCancel, testSubscriber.values().size(), "No new messages after cancel");
        for (final var value : testSubscriber.values()) {
            final var topic = value.getData().get(Constants.TOPIC_FIELD);
            assertTrue(Topic.PUBLIC_TRADE_BTC_USDT.toString().equals(topic) ||
                    Topic.PUBLIC_TRADE_ETH_USDT.toString().equals(topic));
        }
    }

    @Test
    public void shouldReceiveTickerDataConsumer() {
        final var config = new DataConfig.Builder()
                .streamType(StreamType.PTST)
                .topic(Topic.TICKERS_BTC_USDT)
                .topic(Topic.TICKERS_ETH_USDT)
                .build();
        final var consumer = DataConsumer.create(client, config);
        final var testSubscriber = new TestSubscriber<Payload<Map<String, Object>>>();
        Flowable.create(consumer, BackpressureStrategy.BUFFER).subscribe(testSubscriber);
        assertFalse(TestUtils.await(testSubscriber, 3, TimeUnit.SECONDS), "Should not receive any messages");

        testSubscriber.assertNoErrors();
        assertFalse(testSubscriber.values().isEmpty(), "Should receive at least one message");

        testSubscriber.cancel();
        TestUtils.sleep(1000);
        final var countAfterCancel = testSubscriber.values().size();
        TestUtils.sleep(1000);

        assertEquals(countAfterCancel, testSubscriber.values().size(), "No new messages after cancel");
        for (final var value : testSubscriber.values()) {
            final var topic = value.getData().get(Constants.TOPIC_FIELD);
            assertTrue(Topic.TICKERS_BTC_USDT.toString().equals(topic) ||
                    Topic.TICKERS_ETH_USDT.toString().equals(topic));
        }
    }

    @Test
    public void shouldReceiveKlineDataConsumer() {
        final var config = new DataConfig.Builder()
                .streamType(StreamType.PTL)
                .topic(Topic.KLINE_1_BTC_USDT)
                .build();
        final var consumer = DataConsumer.create(client, config);
        final var testSubscriber = new TestSubscriber<Payload<Map<String, Object>>>();
        Flowable.create(consumer, BackpressureStrategy.BUFFER).subscribe(testSubscriber);
        assertFalse(TestUtils.await(testSubscriber, 3, TimeUnit.SECONDS), "Should not receive any messages");

        testSubscriber.assertNoErrors();
        assertFalse(testSubscriber.values().isEmpty(), "Should receive at least one message");

        testSubscriber.cancel();
        TestUtils.sleep(1000);
        final var countAfterCancel = testSubscriber.values().size();
        TestUtils.sleep(1000);

        assertEquals(countAfterCancel, testSubscriber.values().size(), "No new messages after cancel");
        for (final var value : testSubscriber.values()) {
            assertEquals(Topic.KLINE_1_BTC_USDT.toString(), value.getData().get(Constants.TOPIC_FIELD));
        }
    }

    @Test
    public void shouldReceiveAllLiquidationDataConsumer() {
        final var config = new DataConfig.Builder()
                .streamType(StreamType.PTL)
                .topic(Topic.ALL_LIQUIDATION_BTC_USDT)
                .build();
        final var consumer = DataConsumer.create(client, config);
        final var testSubscriber = new TestSubscriber<Payload<Map<String, Object>>>();
        Flowable.create(consumer, BackpressureStrategy.BUFFER).subscribe(testSubscriber);
        // Liquidation can happen at any time
        assertFalse(TestUtils.await(testSubscriber, 10, TimeUnit.MINUTES), "Should not receive any messages");

        testSubscriber.assertNoErrors();
        assertFalse(testSubscriber.values().isEmpty(), "Should receive at least one message");

        testSubscriber.cancel();
        TestUtils.sleep(1000);
        final var countAfterCancel = testSubscriber.values().size();
        TestUtils.sleep(1000);

        assertEquals(countAfterCancel, testSubscriber.values().size(), "No new messages after cancel");
        for (final var value : testSubscriber.values()) {
            assertEquals(Topic.ALL_LIQUIDATION_BTC_USDT.toString(), value.getData().get(Constants.TOPIC_FIELD));
        }
    }

    @Test
    public void shouldReceiveInsurancePoolDataConsumer() {
        final var config = new DataConfig.Builder()
                .streamType(StreamType.PTL)
                .topic(Topic.INSURANCE_USDT)
                .build();
        final var consumer = DataConsumer.create(client, config);
        final var testSubscriber = new TestSubscriber<Payload<Map<String, Object>>>();
        Flowable.create(consumer, BackpressureStrategy.BUFFER).subscribe(testSubscriber);
        assertFalse(TestUtils.await(testSubscriber, 3, TimeUnit.SECONDS), "Should not receive any messages");

        testSubscriber.assertNoErrors();
        assertFalse(testSubscriber.values().isEmpty(), "Should receive at least one message");

        testSubscriber.cancel();
        TestUtils.sleep(1000);
        final var countAfterCancel = testSubscriber.values().size();
        TestUtils.sleep(1000);

        assertEquals(countAfterCancel, testSubscriber.values().size(), "No new messages after cancel");
        for (final var value : testSubscriber.values()) {
            assertEquals(Topic.INSURANCE_USDT.toString(), value.getData().get(Constants.TOPIC_FIELD));
        }
    }
}
