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

import com.github.akarazhev.jcryptolib.bybit.BybitConstants;
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

import static com.github.akarazhev.jcryptolib.bybit.BybitConfig.getPublicTestnetSpot;
import static com.github.akarazhev.jcryptolib.bybit.BybitTestConfig.getPublicKlineBtcUsdt;
import static com.github.akarazhev.jcryptolib.bybit.BybitTestConfig.getPublicKlineLt5Eos3lUsdt;
import static com.github.akarazhev.jcryptolib.bybit.BybitTestConfig.getPublicLtEos3lUsdt;
import static com.github.akarazhev.jcryptolib.bybit.BybitTestConfig.getPublicOrderBook1BtcUsdt;
import static com.github.akarazhev.jcryptolib.bybit.BybitTestConfig.getPublicTickersBtcUsdt;
import static com.github.akarazhev.jcryptolib.bybit.BybitTestConfig.getPublicTickersLtEos3lUsdt;
import static com.github.akarazhev.jcryptolib.bybit.BybitTestConfig.getPublicTradeBtcUsdt;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

final class BybitPublicSpotDataStreamTest {
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
    public void shouldReceiveOrderBookDataStream() {
        final var stream = BybitDataStream.create(client, getPublicTestnetSpot(), getPublicOrderBook1BtcUsdt());
        final var testSubscriber = new TestSubscriber<Map<String, Object>>();
        Flowable.create(stream, BackpressureStrategy.BUFFER).subscribe(testSubscriber);
        assertFalse(TestUtils.await(testSubscriber, 3, TimeUnit.SECONDS), "Should not receive any messages");

        testSubscriber.assertNoErrors();
        assertFalse(testSubscriber.values().isEmpty(), "Should receive at least one message");

        testSubscriber.cancel();
        TestUtils.sleep(1000);
        final var countAfterCancel = testSubscriber.values().size();
        TestUtils.sleep(1000);

        assertEquals(countAfterCancel, testSubscriber.values().size(), "No new messages after cancel");
        for (final var value : testSubscriber.values()) {
            assertEquals(getPublicOrderBook1BtcUsdt()[0], value.get(BybitConstants.TOPIC_FIELD));
        }
    }

    @Test
    public void shouldReceiveTradeDataStream() {
        final var stream = BybitDataStream.create(client, getPublicTestnetSpot(), getPublicTradeBtcUsdt());
        final var testSubscriber = new TestSubscriber<Map<String, Object>>();
        Flowable.create(stream, BackpressureStrategy.BUFFER).subscribe(testSubscriber);
        assertFalse(TestUtils.await(testSubscriber, 5, TimeUnit.MINUTES), "Should not receive any messages");

        testSubscriber.assertNoErrors();
        assertFalse(testSubscriber.values().isEmpty(), "Should receive at least one message");

        testSubscriber.cancel();
        TestUtils.sleep(1000);
        final var countAfterCancel = testSubscriber.values().size();
        TestUtils.sleep(1000);

        assertEquals(countAfterCancel, testSubscriber.values().size(), "No new messages after cancel");
        for (final var value : testSubscriber.values()) {
            assertEquals(getPublicTradeBtcUsdt()[0], value.get(BybitConstants.TOPIC_FIELD));
        }
    }

    @Test
    public void shouldReceiveTickerDataStream() {
        final var stream = BybitDataStream.create(client, getPublicTestnetSpot(), getPublicTickersBtcUsdt());
        final var testSubscriber = new TestSubscriber<Map<String, Object>>();
        Flowable.create(stream, BackpressureStrategy.BUFFER).subscribe(testSubscriber);
        assertFalse(TestUtils.await(testSubscriber, 3, TimeUnit.SECONDS), "Should not receive any messages");

        testSubscriber.assertNoErrors();
        assertFalse(testSubscriber.values().isEmpty(), "Should receive at least one message");

        testSubscriber.cancel();
        TestUtils.sleep(1000);
        final var countAfterCancel = testSubscriber.values().size();
        TestUtils.sleep(1000);

        assertEquals(countAfterCancel, testSubscriber.values().size(), "No new messages after cancel");
        for (final var value : testSubscriber.values()) {
            assertEquals(getPublicTickersBtcUsdt()[0], value.get(BybitConstants.TOPIC_FIELD));
        }
    }

    @Test
    public void shouldReceiveKlineDataStream() {
        final var stream = BybitDataStream.create(client, getPublicTestnetSpot(), getPublicKlineBtcUsdt());
        final var testSubscriber = new TestSubscriber<Map<String, Object>>();
        Flowable.create(stream, BackpressureStrategy.BUFFER).subscribe(testSubscriber);
        assertFalse(TestUtils.await(testSubscriber, 3, TimeUnit.SECONDS), "Should not receive any messages");

        testSubscriber.assertNoErrors();
        assertFalse(testSubscriber.values().isEmpty(), "Should receive at least one message");

        testSubscriber.cancel();
        TestUtils.sleep(1000);
        final var countAfterCancel = testSubscriber.values().size();
        TestUtils.sleep(1000);

        assertEquals(countAfterCancel, testSubscriber.values().size(), "No new messages after cancel");
        for (final var value : testSubscriber.values()) {
            assertEquals(getPublicKlineBtcUsdt()[0], value.get(BybitConstants.TOPIC_FIELD));
        }
    }

    @Test
    public void shouldReceiveLTKlineDataStream() {
        final var stream = BybitDataStream.create(client, getPublicTestnetSpot(), getPublicKlineLt5Eos3lUsdt());
        final var testSubscriber = new TestSubscriber<Map<String, Object>>();
        Flowable.create(stream, BackpressureStrategy.BUFFER).subscribe(testSubscriber);
        assertFalse(TestUtils.await(testSubscriber, 3, TimeUnit.SECONDS), "Should not receive any messages");

        testSubscriber.assertNoErrors();
        assertFalse(testSubscriber.values().isEmpty(), "Should receive at least one message");

        testSubscriber.cancel();
        TestUtils.sleep(1000);
        final var countAfterCancel = testSubscriber.values().size();
        TestUtils.sleep(1000);

        assertEquals(countAfterCancel, testSubscriber.values().size(), "No new messages after cancel");
        for (final var value : testSubscriber.values()) {
            assertEquals(getPublicKlineLt5Eos3lUsdt()[0], value.get(BybitConstants.TOPIC_FIELD));
        }
    }

    @Test
    public void shouldReceiveLTTickerDataStream() {
        final var stream = BybitDataStream.create(client, getPublicTestnetSpot(), getPublicTickersLtEos3lUsdt());
        final var testSubscriber = new TestSubscriber<Map<String, Object>>();
        Flowable.create(stream, BackpressureStrategy.BUFFER).subscribe(testSubscriber);
        assertFalse(TestUtils.await(testSubscriber, 3, TimeUnit.SECONDS), "Should not receive any messages");

        testSubscriber.assertNoErrors();
        assertFalse(testSubscriber.values().isEmpty(), "Should receive at least one message");

        testSubscriber.cancel();
        TestUtils.sleep(1000);
        final var countAfterCancel = testSubscriber.values().size();
        TestUtils.sleep(1000);

        assertEquals(countAfterCancel, testSubscriber.values().size(), "No new messages after cancel");
        for (final var value : testSubscriber.values()) {
            assertEquals(getPublicTickersLtEos3lUsdt()[0], value.get(BybitConstants.TOPIC_FIELD));
        }
    }

    @Test
    public void shouldReceiveLTNavDataStream() {
        final var stream = BybitDataStream.create(client, getPublicTestnetSpot(), getPublicLtEos3lUsdt());
        final var testSubscriber = new TestSubscriber<Map<String, Object>>();
        Flowable.create(stream, BackpressureStrategy.BUFFER).subscribe(testSubscriber);
        assertFalse(TestUtils.await(testSubscriber, 3, TimeUnit.SECONDS), "Should not receive any messages");

        testSubscriber.assertNoErrors();
        assertFalse(testSubscriber.values().isEmpty(), "Should receive at least one message");

        testSubscriber.cancel();
        TestUtils.sleep(1000);
        final var countAfterCancel = testSubscriber.values().size();
        TestUtils.sleep(1000);

        assertEquals(countAfterCancel, testSubscriber.values().size(), "No new messages after cancel");
        for (final var value : testSubscriber.values()) {
            assertEquals(getPublicLtEos3lUsdt()[0], value.get(BybitConstants.TOPIC_FIELD));
        }
    }
}
