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
import com.github.akarazhev.jcryptolib.stream.Payload;
import com.github.akarazhev.jcryptolib.stream.Provider;
import com.github.akarazhev.jcryptolib.stream.Source;
import com.github.akarazhev.jcryptolib.util.TestUtils;
import io.reactivex.rxjava3.core.BackpressureStrategy;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.subscribers.TestSubscriber;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.net.http.HttpClient;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import static com.github.akarazhev.jcryptolib.cmc.Constants.Response.CONFIGS;
import static com.github.akarazhev.jcryptolib.cmc.Constants.Response.DATA_LIST;
import static com.github.akarazhev.jcryptolib.cmc.Constants.Response.DIAL_CONFIG;
import static com.github.akarazhev.jcryptolib.cmc.Constants.Response.DIAL_CONFIGS;
import static com.github.akarazhev.jcryptolib.cmc.Constants.Response.DOMINANCE;
import static com.github.akarazhev.jcryptolib.cmc.Constants.Response.DOMINANCE_LAST_MONTH;
import static com.github.akarazhev.jcryptolib.cmc.Constants.Response.DOMINANCE_LAST_WEEK;
import static com.github.akarazhev.jcryptolib.cmc.Constants.Response.DOMINANCE_YEARLY_HIGH;
import static com.github.akarazhev.jcryptolib.cmc.Constants.Response.DOMINANCE_YEARLY_LOW;
import static com.github.akarazhev.jcryptolib.cmc.Constants.Response.DOMINANCE_YESTERDAY;
import static com.github.akarazhev.jcryptolib.cmc.Constants.Response.HISTORICAL_VALUES;
import static com.github.akarazhev.jcryptolib.cmc.Constants.Response.POINTS;
import static com.github.akarazhev.jcryptolib.cmc.Constants.Response.TOP_CRYPTOS;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

final class CmcDataFetcherTest {
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
    public void shouldReceiveFearAndGreedIndex() {
        final var config = new DataConfig.Builder()
                .type(Type.FGI)
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
            assertEquals(Provider.CMC, value.getProvider());
            assertEquals(Source.FGI, value.getSource());
            assertTrue(value.getData().containsKey(DATA_LIST));
            assertFalse(((List) value.getData().get(DATA_LIST)).isEmpty());
            assertTrue(value.getData().containsKey(DIAL_CONFIG));
            assertFalse(((List) value.getData().get(DIAL_CONFIG)).isEmpty());
            assertTrue(value.getData().containsKey(HISTORICAL_VALUES));
            assertFalse(((Map) value.getData().get(HISTORICAL_VALUES)).isEmpty());
        }
    }

    @Test
    public void shouldReceiveAltcoinSeasonIndex() {
        final var config = new DataConfig.Builder()
                .type(Type.ASI)
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
            assertEquals(Provider.CMC, value.getProvider());
            assertEquals(Source.ASI, value.getSource());
            assertTrue(value.getData().containsKey(POINTS));
            assertFalse(((List) value.getData().get(POINTS)).isEmpty());
            assertTrue(value.getData().containsKey(HISTORICAL_VALUES));
            assertFalse(((Map) value.getData().get(HISTORICAL_VALUES)).isEmpty());
            assertTrue(value.getData().containsKey(DIAL_CONFIGS));
            assertFalse(((List) value.getData().get(DIAL_CONFIGS)).isEmpty());
            assertTrue(value.getData().containsKey(TOP_CRYPTOS));
            assertFalse(((List) value.getData().get(TOP_CRYPTOS)).isEmpty());
        }
    }

    @Test
    public void shouldReceiveBitcoinDominanceNow() {
        final var config = new DataConfig.Builder()
                .type(Type.BDN)
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
            assertEquals(Provider.CMC, value.getProvider());
            assertEquals(Source.BDN, value.getSource());
            assertTrue(value.getData().containsKey(CONFIGS));
            assertFalse(((List) value.getData().get(CONFIGS)).isEmpty());
            assertTrue(value.getData().containsKey(DOMINANCE));
            assertFalse(((List) value.getData().get(DOMINANCE)).isEmpty());
            assertTrue(value.getData().containsKey(DOMINANCE_LAST_MONTH));
            assertFalse(((List) value.getData().get(DOMINANCE_LAST_MONTH)).isEmpty());
            assertTrue(value.getData().containsKey(DOMINANCE_LAST_WEEK));
            assertFalse(((List) value.getData().get(DOMINANCE_LAST_WEEK)).isEmpty());
            assertTrue(value.getData().containsKey(DOMINANCE_YEARLY_HIGH));
            assertFalse(((List) value.getData().get(DOMINANCE_YEARLY_HIGH)).isEmpty());
            assertTrue(value.getData().containsKey(DOMINANCE_YEARLY_LOW));
            assertFalse(((List) value.getData().get(DOMINANCE_YEARLY_LOW)).isEmpty());
            assertTrue(value.getData().containsKey(DOMINANCE_YESTERDAY));
            assertFalse(((List) value.getData().get(DOMINANCE_YESTERDAY)).isEmpty());
        }
    }

    @Test
    public void shouldReceiveBitcoinDominanceAll() {
        final var config = new DataConfig.Builder()
                .type(Type.BDA)
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
            assertEquals(Provider.CMC, value.getProvider());
            assertEquals(Source.BDA, value.getSource());
            assertTrue(value.getData().containsKey(CONFIGS));
            assertFalse(((List) value.getData().get(CONFIGS)).isEmpty());
            assertTrue(value.getData().containsKey(POINTS));
            assertFalse(((List) value.getData().get(POINTS)).isEmpty());
        }
    }
}
