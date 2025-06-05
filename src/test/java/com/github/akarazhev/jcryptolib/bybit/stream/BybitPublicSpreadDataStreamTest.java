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

import static com.github.akarazhev.jcryptolib.bybit.BybitConfig.getPublicTestnetSpread;
import static com.github.akarazhev.jcryptolib.bybit.BybitTestConfig.getPublicOrderBook25SolUsdt;
import static com.github.akarazhev.jcryptolib.bybit.BybitTestConfig.getPublicTickersSolUsdt;
import static com.github.akarazhev.jcryptolib.bybit.BybitTestConfig.getPublicTradeSolUsdt;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

final class BybitPublicSpreadDataStreamTest {
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
        final var config = new BybitDataConfig.Builder()
                .url(getPublicTestnetSpread())
                .topics(getPublicOrderBook25SolUsdt())
                .build();
        final var stream = BybitDataStream.create(client, config);
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
            assertEquals(getPublicOrderBook25SolUsdt()[0], value.get(BybitConstants.TOPIC_FIELD));
        }
    }

    @Test
    public void shouldReceiveTradeDataStream() {
        final var config = new BybitDataConfig.Builder()
                .url(getPublicTestnetSpread())
                .topics(getPublicTradeSolUsdt())
                .build();
        final var stream = BybitDataStream.create(client, config);
        final var testSubscriber = new TestSubscriber<Map<String, Object>>();
        Flowable.create(stream, BackpressureStrategy.BUFFER).subscribe(testSubscriber);
        assertFalse(TestUtils.await(testSubscriber, 1, TimeUnit.MINUTES), "Should not receive any messages");

        testSubscriber.assertNoErrors();
        assertFalse(testSubscriber.values().isEmpty(), "Should receive at least one message");

        testSubscriber.cancel();
        TestUtils.sleep(1000);
        final var countAfterCancel = testSubscriber.values().size();
        TestUtils.sleep(1000);

        assertEquals(countAfterCancel, testSubscriber.values().size(), "No new messages after cancel");
        for (final var value : testSubscriber.values()) {
            assertEquals(getPublicTradeSolUsdt()[0], value.get(BybitConstants.TOPIC_FIELD));
        }
    }

    @Test
    public void shouldReceiveTickerDataStream() {
        final var config = new BybitDataConfig.Builder()
                .url(getPublicTestnetSpread())
                .topics(getPublicTickersSolUsdt())
                .build();
        final var stream = BybitDataStream.create(client, config);
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
            assertEquals(getPublicTickersSolUsdt()[0], value.get(BybitConstants.TOPIC_FIELD));
        }
    }
}
