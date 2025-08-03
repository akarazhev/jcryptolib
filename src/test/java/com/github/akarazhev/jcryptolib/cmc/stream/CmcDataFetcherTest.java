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

import static com.github.akarazhev.jcryptolib.cmc.Constants.Response.AGGREGATION;
import static com.github.akarazhev.jcryptolib.cmc.Constants.Response.ALTCOIN_INDEX;
import static com.github.akarazhev.jcryptolib.cmc.Constants.Response.ALTCOIN_MARKET_CAP;
import static com.github.akarazhev.jcryptolib.cmc.Constants.Response.ALTCOIN_MARKET_CAP2;
import static com.github.akarazhev.jcryptolib.cmc.Constants.Response.ALTCOIN_VOLUME_24H;
import static com.github.akarazhev.jcryptolib.cmc.Constants.Response.ALTCOIN_VOLUME_24H_REPORTED;
import static com.github.akarazhev.jcryptolib.cmc.Constants.Response.BITCOIN;
import static com.github.akarazhev.jcryptolib.cmc.Constants.Response.BTC_DOMINANCE;
import static com.github.akarazhev.jcryptolib.cmc.Constants.Response.BTC_DOMINANCE_24H_PERCENTAGE_CHANGE;
import static com.github.akarazhev.jcryptolib.cmc.Constants.Response.BTC_DOMINANCE_YESTERDAY;
import static com.github.akarazhev.jcryptolib.cmc.Constants.Response.BTC_PRICE;
import static com.github.akarazhev.jcryptolib.cmc.Constants.Response.BTC_VOLUME;
import static com.github.akarazhev.jcryptolib.cmc.Constants.Response.CEX;
import static com.github.akarazhev.jcryptolib.cmc.Constants.Response.CHG;
import static com.github.akarazhev.jcryptolib.cmc.Constants.Response.CMC_USD_ID;
import static com.github.akarazhev.jcryptolib.cmc.Constants.Response.COINS;
import static com.github.akarazhev.jcryptolib.cmc.Constants.Response.COIN_ID;
import static com.github.akarazhev.jcryptolib.cmc.Constants.Response.COIN_NAME;
import static com.github.akarazhev.jcryptolib.cmc.Constants.Response.COIN_SLUG;
import static com.github.akarazhev.jcryptolib.cmc.Constants.Response.CONFIGS;
import static com.github.akarazhev.jcryptolib.cmc.Constants.Response.CONSTITUENTS;
import static com.github.akarazhev.jcryptolib.cmc.Constants.Response.CRYPTO_FUNDING_RATE;
import static com.github.akarazhev.jcryptolib.cmc.Constants.Response.CRYPTO_ID;
import static com.github.akarazhev.jcryptolib.cmc.Constants.Response.CURRENT_VALUE;
import static com.github.akarazhev.jcryptolib.cmc.Constants.Response.DATA_LIST;
import static com.github.akarazhev.jcryptolib.cmc.Constants.Response.DEFI_24H_PERCENTAGE_CHANGE;
import static com.github.akarazhev.jcryptolib.cmc.Constants.Response.DEFI_MARKET_CAP;
import static com.github.akarazhev.jcryptolib.cmc.Constants.Response.DEFI_VOLUME_24H;
import static com.github.akarazhev.jcryptolib.cmc.Constants.Response.DEFI_VOLUME_24H_REPORTED;
import static com.github.akarazhev.jcryptolib.cmc.Constants.Response.DERIVATIVES_24H_PERCENTAGE_CHANGE;
import static com.github.akarazhev.jcryptolib.cmc.Constants.Response.DERIVATIVES_VOLUME_24H;
import static com.github.akarazhev.jcryptolib.cmc.Constants.Response.DERIVATIVES_VOLUME_24H_REPORTED;
import static com.github.akarazhev.jcryptolib.cmc.Constants.Response.DEX;
import static com.github.akarazhev.jcryptolib.cmc.Constants.Response.DIAL_CONFIG;
import static com.github.akarazhev.jcryptolib.cmc.Constants.Response.DIAL_CONFIGS;
import static com.github.akarazhev.jcryptolib.cmc.Constants.Response.DOMINANCE;
import static com.github.akarazhev.jcryptolib.cmc.Constants.Response.DOMINANCE_LAST_MONTH;
import static com.github.akarazhev.jcryptolib.cmc.Constants.Response.DOMINANCE_LAST_WEEK;
import static com.github.akarazhev.jcryptolib.cmc.Constants.Response.DOMINANCE_YEARLY_HIGH;
import static com.github.akarazhev.jcryptolib.cmc.Constants.Response.DOMINANCE_YEARLY_LOW;
import static com.github.akarazhev.jcryptolib.cmc.Constants.Response.DOMINANCE_YESTERDAY;
import static com.github.akarazhev.jcryptolib.cmc.Constants.Response.ETHEREUM;
import static com.github.akarazhev.jcryptolib.cmc.Constants.Response.FUTURES;
import static com.github.akarazhev.jcryptolib.cmc.Constants.Response.HIGH;
import static com.github.akarazhev.jcryptolib.cmc.Constants.Response.HIGH_TIMESTAMP;
import static com.github.akarazhev.jcryptolib.cmc.Constants.Response.ID;
import static com.github.akarazhev.jcryptolib.cmc.Constants.Response.LOW;
import static com.github.akarazhev.jcryptolib.cmc.Constants.Response.LOW_TIMESTAMP;
import static com.github.akarazhev.jcryptolib.cmc.Constants.Response.MARKET_CAP;
import static com.github.akarazhev.jcryptolib.cmc.Constants.Response.MARKET_FUNDING_RATE;
import static com.github.akarazhev.jcryptolib.cmc.Constants.Response.MC_CHANGE_PCT_30D;
import static com.github.akarazhev.jcryptolib.cmc.Constants.Response.MC_PROPORTION;
import static com.github.akarazhev.jcryptolib.cmc.Constants.Response.OPEN_INTEREST;
import static com.github.akarazhev.jcryptolib.cmc.Constants.Response.PERCENTAGE;
import static com.github.akarazhev.jcryptolib.cmc.Constants.Response.PERCENT_CHANGE;
import static com.github.akarazhev.jcryptolib.cmc.Constants.Response.PERPETUALS;
import static com.github.akarazhev.jcryptolib.cmc.Constants.Response.SCORE;
import static com.github.akarazhev.jcryptolib.cmc.Constants.Response.SLUG;
import static com.github.akarazhev.jcryptolib.cmc.Constants.Response.START;
import static com.github.akarazhev.jcryptolib.cmc.Constants.Response.END;
import static com.github.akarazhev.jcryptolib.cmc.Constants.Response.ETH_DOMINANCE;
import static com.github.akarazhev.jcryptolib.cmc.Constants.Response.ETH_DOMINANCE_24H_PERCENTAGE_CHANGE;
import static com.github.akarazhev.jcryptolib.cmc.Constants.Response.ETH_DOMINANCE_YESTERDAY;
import static com.github.akarazhev.jcryptolib.cmc.Constants.Response.HISTORICAL_VALUES;
import static com.github.akarazhev.jcryptolib.cmc.Constants.Response.INDICATORS;
import static com.github.akarazhev.jcryptolib.cmc.Constants.Response.LAST_MONTH;
import static com.github.akarazhev.jcryptolib.cmc.Constants.Response.LAST_UPDATE;
import static com.github.akarazhev.jcryptolib.cmc.Constants.Response.LAST_UPDATED;
import static com.github.akarazhev.jcryptolib.cmc.Constants.Response.LAST_WEEK;
import static com.github.akarazhev.jcryptolib.cmc.Constants.Response.LIKELIHOOD;
import static com.github.akarazhev.jcryptolib.cmc.Constants.Response.NAME;
import static com.github.akarazhev.jcryptolib.cmc.Constants.Response.NEXT_UPDATE;
import static com.github.akarazhev.jcryptolib.cmc.Constants.Response.NOW;
import static com.github.akarazhev.jcryptolib.cmc.Constants.Response.OVERVIEW;
import static com.github.akarazhev.jcryptolib.cmc.Constants.Response.OVER_VIEW;
import static com.github.akarazhev.jcryptolib.cmc.Constants.Response.PI_CYCLE_TOP;
import static com.github.akarazhev.jcryptolib.cmc.Constants.Response.POINTS;
import static com.github.akarazhev.jcryptolib.cmc.Constants.Response.PUELL_MULTIPLE;
import static com.github.akarazhev.jcryptolib.cmc.Constants.Response.QUOTE;
import static com.github.akarazhev.jcryptolib.cmc.Constants.Response.STABLECOIN_24H_PERCENTAGE_CHANGE;
import static com.github.akarazhev.jcryptolib.cmc.Constants.Response.STABLECOIN_MARKET_CAP;
import static com.github.akarazhev.jcryptolib.cmc.Constants.Response.STABLECOIN_VOLUME_24H;
import static com.github.akarazhev.jcryptolib.cmc.Constants.Response.STABLECOIN_VOLUME_24H_REPORTED;
import static com.github.akarazhev.jcryptolib.cmc.Constants.Response.SUMMARY_DATA;
import static com.github.akarazhev.jcryptolib.cmc.Constants.Response.SYMBOL;
import static com.github.akarazhev.jcryptolib.cmc.Constants.Response.THIRTY_DAYS_PERCENTAGE;
import static com.github.akarazhev.jcryptolib.cmc.Constants.Response.TIMESTAMP;
import static com.github.akarazhev.jcryptolib.cmc.Constants.Response.TOTAL;
import static com.github.akarazhev.jcryptolib.cmc.Constants.Response.TOTAL_BTC_VALUE;
import static com.github.akarazhev.jcryptolib.cmc.Constants.Response.TOTAL_ETH_VALUE;
import static com.github.akarazhev.jcryptolib.cmc.Constants.Response.TOTAL_HIT_COUNT;
import static com.github.akarazhev.jcryptolib.cmc.Constants.Response.TOTAL_MARKET_CAP;
import static com.github.akarazhev.jcryptolib.cmc.Constants.Response.TOTAL_MARKET_CAP_YESTERDAY;
import static com.github.akarazhev.jcryptolib.cmc.Constants.Response.TOTAL_MARKET_CAP_YESTERDAY_PERCENTAGE_CHANGE;
import static com.github.akarazhev.jcryptolib.cmc.Constants.Response.TOTAL_VOLUME_24H;
import static com.github.akarazhev.jcryptolib.cmc.Constants.Response.TOTAL_VOLUME_24H_REPORTED;
import static com.github.akarazhev.jcryptolib.cmc.Constants.Response.TOTAL_VOLUME_24H_YESTERDAY;
import static com.github.akarazhev.jcryptolib.cmc.Constants.Response.TOTAL_VOLUME_24H_YESTERDAY_PERCENTAGE_CHANGE;
import static com.github.akarazhev.jcryptolib.cmc.Constants.Response.TRIGGERED_COUNT;
import static com.github.akarazhev.jcryptolib.cmc.Constants.Response.UPDATE_TIME;
import static com.github.akarazhev.jcryptolib.cmc.Constants.Response.URL;
import static com.github.akarazhev.jcryptolib.cmc.Constants.Response.VALUE;
import static com.github.akarazhev.jcryptolib.cmc.Constants.Response.VALUES;
import static com.github.akarazhev.jcryptolib.cmc.Constants.Response.VALUE_24H_PERCENTAGE_CHANGE;
import static com.github.akarazhev.jcryptolib.cmc.Constants.Response.VALUE_CLASSIFICATION;
import static com.github.akarazhev.jcryptolib.cmc.Constants.Response.WEIGHT;
import static com.github.akarazhev.jcryptolib.cmc.Constants.Response.YEARLY_HIGH;
import static com.github.akarazhev.jcryptolib.cmc.Constants.Response.YEARLY_LOW;
import static com.github.akarazhev.jcryptolib.cmc.Constants.Response.YEARLY_PERFORMANCE;
import static com.github.akarazhev.jcryptolib.cmc.Constants.Response.YESTERDAY;
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
    public void shouldReceiveCryptoMarketCap() {
        final var dataConfig = new DataConfig.Builder()
                .type(Type.CMC)
                .build();
        final var consumer = DataConsumer.create(client, dataConfig);
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
            assertEquals(Source.CMC, value.getSource());
            assertTrue(value.getData().containsKey(POINTS));
            assertFalse(((List) value.getData().get(POINTS)).isEmpty());
            assertTrue(value.getData().containsKey(HISTORICAL_VALUES));
            assertFalse(((Map) value.getData().get(HISTORICAL_VALUES)).isEmpty());
            assertTrue(value.getData().containsKey(YEARLY_PERFORMANCE));
            assertFalse(((Map) value.getData().get(YEARLY_PERFORMANCE)).isEmpty());
            assertTrue(value.getData().containsKey(THIRTY_DAYS_PERCENTAGE));
        }
    }

    @Test
    public void shouldReceiveCryptoEFTsNetFlow() {
        final var dataConfig = new DataConfig.Builder()
                .type(Type.ETF_NF)
                .build();
        final var consumer = DataConsumer.create(client, dataConfig);
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
            assertEquals(Source.ETF_NF, value.getSource());
            assertTrue(value.getData().containsKey(POINTS));
            assertFalse(((List) value.getData().get(POINTS)).isEmpty());
            assertTrue(value.getData().containsKey(AGGREGATION));
            assertTrue(value.getData().containsKey(TOTAL));
            assertTrue(value.getData().containsKey(TOTAL_BTC_VALUE));
            assertTrue(value.getData().containsKey(TOTAL_ETH_VALUE));
        }
    }

    @Test
    public void shouldReceiveAltcoinSeason() {
        final var dataConfig = new DataConfig.Builder()
                .type(Type.AS)
                .build();
        final var consumer = DataConsumer.create(client, dataConfig);
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
            assertEquals(Source.AS, value.getSource());

            assertTrue(value.getData().containsKey(POINTS));
            final var points = (List<Map<String, Object>>) value.getData().get(POINTS);
            assertFalse(points.isEmpty());
            for (final var point : points) {
                assertAltcoinSeason(point);
            }

            assertTrue(value.getData().containsKey(HISTORICAL_VALUES));
            final var historicalValues = (Map<String, Object>) value.getData().get(HISTORICAL_VALUES);
            assertTrue(historicalValues.containsKey(NOW));
            assertAltcoinSeason((Map<String, Object>) historicalValues.get(NOW));
            assertTrue(historicalValues.containsKey(YESTERDAY));
            assertAltcoinSeason((Map<String, Object>) historicalValues.get(YESTERDAY));
            assertTrue(historicalValues.containsKey(LAST_WEEK));
            assertAltcoinSeason((Map<String, Object>) historicalValues.get(LAST_WEEK));
            assertTrue(historicalValues.containsKey(LAST_MONTH));
            assertAltcoinSeason((Map<String, Object>) historicalValues.get(LAST_MONTH));
            assertTrue(historicalValues.containsKey(YEARLY_HIGH));
            assertAltcoinSeason((Map<String, Object>) historicalValues.get(YEARLY_HIGH));
            assertTrue(historicalValues.containsKey(YEARLY_LOW));
            assertAltcoinSeason((Map<String, Object>) historicalValues.get(YEARLY_LOW));

            assertTrue(value.getData().containsKey(DIAL_CONFIGS));
            final var dialConfigs = (List<Map<String, Object>>) value.getData().get(DIAL_CONFIGS);
            assertFalse(dialConfigs.isEmpty());
            for (final var dialConfig : dialConfigs) {
                assertAltcoinSeasonConfig(dialConfig);
            }
        }
    }

    @Test
    public void shouldReceiveBitcoinDominanceOverview() {
        final var dataConfig = new DataConfig.Builder()
                .type(Type.BDO)
                .build();
        final var consumer = DataConsumer.create(client, dataConfig);
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
            assertEquals(Source.BDO, value.getSource());

            assertTrue(value.getData().containsKey(CONFIGS));
            final var configs = (List<Map<String, Object>>) value.getData().get(CONFIGS);
            assertFalse(configs.isEmpty());
            for (final var config : configs) {
                assertBitcoinDominanceConfig(config);
            }

            assertTrue(value.getData().containsKey(DOMINANCE));
            final var dominance = (List<Map<String, Object>>) value.getData().get(DOMINANCE);
            assertFalse(dominance.isEmpty());
            for (final var dominanceValue : dominance) {
                assertBitcoinDominance(dominanceValue);
            }

            assertTrue(value.getData().containsKey(DOMINANCE_LAST_MONTH));
            final var dominanceLastMonth = (List<Map<String, Object>>) value.getData().get(DOMINANCE_LAST_MONTH);
            assertFalse(dominanceLastMonth.isEmpty());
            for (final var dominanceValue : dominanceLastMonth) {
                assertBitcoinDominanceLast(dominanceValue);
            }

            assertTrue(value.getData().containsKey(DOMINANCE_LAST_WEEK));
            final var dominanceLastWeek = (List<Map<String, Object>>) value.getData().get(DOMINANCE_LAST_WEEK);
            assertFalse(dominanceLastWeek.isEmpty());
            for (final var dominanceValue : dominanceLastWeek) {
                assertBitcoinDominanceLast(dominanceValue);
            }

            assertTrue(value.getData().containsKey(DOMINANCE_YEARLY_HIGH));
            final var dominanceYearlyHigh = (List<Map<String, Object>>) value.getData().get(DOMINANCE_YEARLY_HIGH);
            assertFalse(dominanceYearlyHigh.isEmpty());
            for (final var dominanceValue : dominanceYearlyHigh) {
                assertBitcoinDominanceYearly(dominanceValue);
            }

            assertTrue(value.getData().containsKey(DOMINANCE_YEARLY_LOW));
            final var dominanceYearlyLow = (List<Map<String, Object>>) value.getData().get(DOMINANCE_YEARLY_LOW);
            assertFalse(dominanceYearlyLow.isEmpty());
            for (final var dominanceValue : dominanceYearlyLow) {
                assertBitcoinDominanceYearly(dominanceValue);
            }

            assertTrue(value.getData().containsKey(DOMINANCE_YESTERDAY));
            final var dominanceYesterday = (List<Map<String, Object>>) value.getData().get(DOMINANCE_YESTERDAY);
            assertFalse(dominanceYesterday.isEmpty());
            for (final var dominanceValue : dominanceYesterday) {
                assertBitcoinDominanceLast(dominanceValue);
            }
        }
    }

    @Test
    public void shouldReceiveBitcoinDominance() {
        final var dataConfig = new DataConfig.Builder()
                .type(Type.BD)
                .build();
        final var consumer = DataConsumer.create(client, dataConfig);
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
            assertEquals(Source.BD, value.getSource());

            assertTrue(value.getData().containsKey(CONFIGS));
            final var configs = (List<Map<String, Object>>) value.getData().get(CONFIGS);
            assertFalse(configs.isEmpty());
            for (final var config : configs) {
                assertBitcoinDominanceConfig(config);
            }

            assertTrue(value.getData().containsKey(POINTS));
            final var points = (List<Map<String, Object>>) value.getData().get(POINTS);
            assertFalse(points.isEmpty());
            for (final var point : points) {
                assertBitcoinDominancePoint(point);
            }
        }
    }

    @Test
    public void shouldReceiveMarketCycleLatest() {
        final var dataConfig = new DataConfig.Builder()
                .type(Type.MCL)
                .build();
        final var consumer = DataConsumer.create(client, dataConfig);
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
            assertEquals(Source.MCL, value.getSource());
            assertTrue(value.getData().containsKey(PUELL_MULTIPLE));
            assertTrue(value.getData().containsKey(PI_CYCLE_TOP));
            assertFalse(((Map) value.getData().get(PI_CYCLE_TOP)).isEmpty());
            assertTrue(value.getData().containsKey(LIKELIHOOD));
            assertFalse(((Map) value.getData().get(LIKELIHOOD)).isEmpty());
        }
    }

    @Test
    public void shouldReceivePuellMultiple() {
        final var dataConfig = new DataConfig.Builder()
                .type(Type.PM)
                .build();
        final var consumer = DataConsumer.create(client, dataConfig);
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
            assertEquals(Source.PM, value.getSource());
            assertTrue(value.getData().containsKey(POINTS));
            assertFalse(((List) value.getData().get(POINTS)).isEmpty());
        }
    }

    @Test
    public void shouldReceiveIndicators() {
        final var dataConfig = new DataConfig.Builder()
                .type(Type.IND)
                .build();
        final var consumer = DataConsumer.create(client, dataConfig);
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
            assertEquals(Source.IND, value.getSource());
            assertTrue(value.getData().containsKey(INDICATORS));
            assertFalse(((List) value.getData().get(INDICATORS)).isEmpty());
            assertTrue(value.getData().containsKey(TOTAL_HIT_COUNT));
            assertTrue(value.getData().containsKey(TRIGGERED_COUNT));
        }
    }

    @Test
    public void shouldReceivePiCycleTop() {
        final var dataConfig = new DataConfig.Builder()
                .type(Type.PCT)
                .build();
        final var consumer = DataConsumer.create(client, dataConfig);
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
            assertEquals(Source.PCT, value.getSource());
            assertTrue(value.getData().containsKey(POINTS));
            assertFalse(((List) value.getData().get(POINTS)).isEmpty());
        }
    }

    @Test
    public void shouldReceiveBitcoinRainbowPrice() {
        final var dataConfig = new DataConfig.Builder()
                .type(Type.BRP)
                .build();
        final var consumer = DataConsumer.create(client, dataConfig);
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
            assertEquals(Source.BRP, value.getSource());
            assertTrue(value.getData().containsKey(POINTS));
            assertFalse(((List) value.getData().get(POINTS)).isEmpty());
        }
    }

    @Test
    public void shouldReceiveCoinMarketCap100IndexApiProLatest() {
        final var dataConfig = new DataConfig.Builder()
                .type(Type.CMC100_API_PRO_L)
                .build();
        final var consumer = DataConsumer.create(client, dataConfig);
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
            assertEquals(Source.CMC100_API_PRO_L, value.getSource());

            assertTrue(value.getData().containsKey(VALUE_24H_PERCENTAGE_CHANGE));
            assertTrue(value.getData().containsKey(LAST_UPDATE));
            assertTrue(value.getData().containsKey(NEXT_UPDATE));
            assertTrue(value.getData().containsKey(VALUE));

            assertTrue(value.getData().containsKey(CONSTITUENTS));
            final var constituents = (List<Map<String, Object>>) value.getData().get(CONSTITUENTS);
            assertFalse(constituents.isEmpty());
            for (final var constituent : constituents) {
                assertCoinMarketCap100Index(constituent);
            }
        }
    }

    @Test
    public void shouldReceiveCoinMarketCap100IndexLatest() {
        final var dataConfig = new DataConfig.Builder()
                .type(Type.CMC100L)
                .build();
        final var consumer = DataConsumer.create(client, dataConfig);
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
            assertEquals(Source.CMC100L, value.getSource());

            assertTrue(value.getData().containsKey(SUMMARY_DATA));
            final var summaryData = (Map<String, Object>) value.getData().get(SUMMARY_DATA);
            assertFalse(summaryData.isEmpty());

            assertTrue(summaryData.containsKey(CURRENT_VALUE));
            final var currentValue = (Map<String, Object>) summaryData.get(CURRENT_VALUE);
            assertFalse(currentValue.isEmpty());
            assertTrue(currentValue.containsKey(NAME));
            assertTrue(currentValue.containsKey(VALUE));
            assertTrue(currentValue.containsKey(PERCENT_CHANGE));

            assertTrue(summaryData.containsKey(HISTORICAL_VALUES));
            final var historicalValues = (Map<String, Object>) summaryData.get(HISTORICAL_VALUES);
            assertFalse(historicalValues.isEmpty());
            assertTrue(historicalValues.containsKey(NAME));
            assertTrue(historicalValues.containsKey(YESTERDAY));
            assertTrue(historicalValues.containsKey(LAST_WEEK));
            assertTrue(historicalValues.containsKey(LAST_MONTH));

            assertTrue(summaryData.containsKey(YEARLY_PERFORMANCE));
            final var yearlyPerformance = (Map<String, Object>) summaryData.get(YEARLY_PERFORMANCE);
            assertFalse(yearlyPerformance.isEmpty());
            assertTrue(yearlyPerformance.containsKey(NAME));
            assertTrue(yearlyPerformance.containsKey(HIGH));
            assertTrue(yearlyPerformance.containsKey(HIGH_TIMESTAMP));
            assertTrue(yearlyPerformance.containsKey(LOW));
            assertTrue(yearlyPerformance.containsKey(LOW_TIMESTAMP));
        }
    }

    @Test
    public void shouldReceiveCoinMarketCap100IndexHistory() {
        final var dataConfig = new DataConfig.Builder()
                .type(Type.CMC100H)
                .build();
        final var consumer = DataConsumer.create(client, dataConfig);
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
            assertEquals(Source.CMC100H, value.getSource());

            assertTrue(value.getData().containsKey(CONSTITUENTS));
            final var constituents = ((Map<String, List<Map<String, Object>>>) value.getData().get(CONSTITUENTS));
            assertTrue(constituents.containsKey(CONFIGS));
            final var configs = constituents.get(CONFIGS);
            assertFalse(configs.isEmpty());
            for (final var config : configs) {
                assertTrue(config.containsKey(ID));
                assertCoinMarketCap100Config(config);
            }

            assertTrue(constituents.containsKey(POINTS));
            final var points = constituents.get(POINTS);
            assertFalse(points.isEmpty());
            for (final var point : points) {
                assertCoinMarketCap100Point(point);
            }

            assertTrue(value.getData().containsKey(VALUES));
            final var vals = (List<Map<String, Object>>) value.getData().get(VALUES);
            assertFalse(vals.isEmpty());
            for (final var val : vals) {
                assertCoinMarketCap100Value(val);
            }
        }
    }

    // @Test
    public void shouldReceiveCoinMarketCap100IndexApiProHistorical() {
        final var dataConfig = new DataConfig.Builder()
                .type(Type.CMC100_API_PRO_H)
                .build();
        final var consumer = DataConsumer.create(client, dataConfig);
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
            assertEquals(Source.CMC100_API_PRO_H, value.getSource());

            assertTrue(value.getData().containsKey(UPDATE_TIME));
            assertTrue(value.getData().containsKey(VALUE));

            assertTrue(value.getData().containsKey(CONSTITUENTS));
            final var constituents = (List<Map<String, Object>>) value.getData().get(CONSTITUENTS);
            assertFalse(constituents.isEmpty());
            for (final var constituent : constituents) {
                assertCoinMarketCap100IndexHistory(constituent);
            }
        }
    }

    @Test
    public void shouldReceiveCryptoSpotVolume() {
        final var dataConfig = new DataConfig.Builder()
                .type(Type.CSV)
                .build();
        final var consumer = DataConsumer.create(client, dataConfig);
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
            assertEquals(Source.CSV, value.getSource());
            assertTrue(value.getData().containsKey(OVER_VIEW));
            assertFalse(((Map) value.getData().get(OVER_VIEW)).isEmpty());
            assertTrue(value.getData().containsKey(POINTS));
            assertFalse(((List) value.getData().get(POINTS)).isEmpty());
        }
    }

    @Test
    public void shouldReceiveOpenInterestOverview() {
        final var dataConfig = new DataConfig.Builder()
                .type(Type.OIO)
                .build();
        final var consumer = DataConsumer.create(client, dataConfig);
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
            assertEquals(Source.OIO, value.getSource());

            assertTrue(value.getData().containsKey(NOW));
            final var now = (Map<String, Object>) value.getData().get(NOW);
            assertFalse(now.isEmpty());

            assertTrue(now.containsKey(FUTURES));
            var futures = (Map<String, Object>) now.get(FUTURES);
            assertFalse(futures.isEmpty());
            assertTrue(futures.containsKey(OPEN_INTEREST));
            assertTrue(futures.containsKey(CHG));

            assertTrue(now.containsKey(PERPETUALS));
            var perpetuals = (Map<String, Object>) now.get(PERPETUALS);
            assertFalse(perpetuals.isEmpty());
            assertTrue(perpetuals.containsKey(OPEN_INTEREST));
            assertTrue(perpetuals.containsKey(CHG));

            assertTrue(value.getData().containsKey(YESTERDAY));
            final var yesterday = (Map<String, Object>) value.getData().get(YESTERDAY);
            assertFalse(yesterday.isEmpty());

            assertTrue(yesterday.containsKey(FUTURES));
            futures = (Map<String, Object>) yesterday.get(FUTURES);
            assertFalse(futures.isEmpty());
            assertTrue(futures.containsKey(OPEN_INTEREST));

            assertTrue(yesterday.containsKey(PERPETUALS));
            perpetuals = (Map<String, Object>) yesterday.get(PERPETUALS);
            assertFalse(perpetuals.isEmpty());
            assertTrue(perpetuals.containsKey(OPEN_INTEREST));

            assertTrue(value.getData().containsKey(LAST_WEEK));
            final var lastWeek = (Map<String, Object>) value.getData().get(LAST_WEEK);
            assertFalse(lastWeek.isEmpty());

            assertTrue(lastWeek.containsKey(FUTURES));
            futures = (Map<String, Object>) lastWeek.get(FUTURES);
            assertFalse(futures.isEmpty());
            assertTrue(futures.containsKey(OPEN_INTEREST));

            assertTrue(lastWeek.containsKey(PERPETUALS));
            perpetuals = (Map<String, Object>) lastWeek.get(PERPETUALS);
            assertFalse(perpetuals.isEmpty());
            assertTrue(perpetuals.containsKey(OPEN_INTEREST));

            assertTrue(value.getData().containsKey(LAST_MONTH));
            final var lastMonth = (Map<String, Object>) value.getData().get(LAST_MONTH);
            assertFalse(lastMonth.isEmpty());

            assertTrue(lastMonth.containsKey(FUTURES));
            futures = (Map<String, Object>) lastMonth.get(FUTURES);
            assertFalse(futures.isEmpty());
            assertTrue(futures.containsKey(OPEN_INTEREST));

            assertTrue(lastMonth.containsKey(PERPETUALS));
            perpetuals = (Map<String, Object>) lastMonth.get(PERPETUALS);
            assertFalse(perpetuals.isEmpty());
            assertTrue(perpetuals.containsKey(OPEN_INTEREST));

            assertTrue(value.getData().containsKey(YEARLY_HIGH));
            final var yearlyHigh = (Map<String, Object>) value.getData().get(YEARLY_HIGH);
            assertFalse(yearlyHigh.isEmpty());

            assertTrue(yearlyHigh.containsKey(FUTURES));
            futures = (Map<String, Object>) yearlyHigh.get(FUTURES);
            assertFalse(futures.isEmpty());
            assertTrue(futures.containsKey(OPEN_INTEREST));
            assertTrue(futures.containsKey(TIMESTAMP));

            assertTrue(yearlyHigh.containsKey(PERPETUALS));
            perpetuals = (Map<String, Object>) yearlyHigh.get(PERPETUALS);
            assertFalse(perpetuals.isEmpty());
            assertTrue(perpetuals.containsKey(OPEN_INTEREST));
            assertTrue(perpetuals.containsKey(TIMESTAMP));

            assertTrue(value.getData().containsKey(YEARLY_LOW));
            final var yearlyLow = (Map<String, Object>) value.getData().get(YEARLY_LOW);
            assertFalse(yearlyLow.isEmpty());

            assertTrue(yearlyLow.containsKey(FUTURES));
            futures = (Map<String, Object>) yearlyLow.get(FUTURES);
            assertFalse(futures.isEmpty());
            assertTrue(futures.containsKey(OPEN_INTEREST));
            assertTrue(futures.containsKey(TIMESTAMP));

            assertTrue(yearlyLow.containsKey(PERPETUALS));
            perpetuals = (Map<String, Object>) yearlyLow.get(PERPETUALS);
            assertFalse(perpetuals.isEmpty());
            assertTrue(perpetuals.containsKey(OPEN_INTEREST));
            assertTrue(perpetuals.containsKey(TIMESTAMP));
        }
    }

    @Test
    public void shouldReceiveOpenInterest() {
        final var dataConfig = new DataConfig.Builder()
                .type(Type.OI)
                .build();
        final var consumer = DataConsumer.create(client, dataConfig);
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
            assertEquals(Source.OI, value.getSource());

            assertTrue(value.getData().containsKey(POINTS));
            final var points = (List<Map<String, Object>>) value.getData().get(POINTS);
            assertFalse(points.isEmpty());
            for (final var point : points) {
                assertTrue(point.containsKey(FUTURES));
                assertTrue(point.containsKey(PERPETUALS));
                assertTrue(point.containsKey(CEX));
                assertTrue(point.containsKey(DEX));
                assertTrue(point.containsKey(MARKET_CAP));
                assertTrue(point.containsKey(TIMESTAMP));
            }

            assertTrue(value.getData().containsKey(OVERVIEW));
            final var overview = (Map<String, Object>) value.getData().get(OVERVIEW);
            assertFalse(overview.isEmpty());

            assertTrue(overview.containsKey(CEX));
            final var cex = (Map<String, Object>) overview.get(CEX);
            assertFalse(cex.isEmpty());
            assertTrue(cex.containsKey(VALUE));
            assertTrue(cex.containsKey(PERCENTAGE));
            assertTrue(cex.containsKey(CHG));

            assertTrue(overview.containsKey(DEX));
            final var dex = (Map<String, Object>) overview.get(DEX);
            assertFalse(dex.isEmpty());
            assertTrue(dex.containsKey(VALUE));
            assertTrue(dex.containsKey(PERCENTAGE));
            assertTrue(dex.containsKey(CHG));

            assertTrue(overview.containsKey(MARKET_CAP));
            final var marketcap = (Map<String, Object>) overview.get(MARKET_CAP);
            assertFalse(marketcap.isEmpty());
            assertTrue(marketcap.containsKey(VALUE));
            assertTrue(marketcap.containsKey(CHG));
        }
    }

    @Test
    public void shouldReceiveDerivativesVolume() {
        final var dataConfig = new DataConfig.Builder()
                .type(Type.DV)
                .build();
        final var consumer = DataConsumer.create(client, dataConfig);
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
            assertEquals(Source.DV, value.getSource());

            assertTrue(value.getData().containsKey(POINTS));
            final var points = (List<Map<String, Object>>) value.getData().get(POINTS);
            assertFalse(points.isEmpty());
            for (final var point : points) {
                assertTrue(point.containsKey(FUTURES));
                assertTrue(point.containsKey(PERPETUALS));
                assertTrue(point.containsKey(CEX));
                assertTrue(point.containsKey(DEX));
                assertTrue(point.containsKey(MARKET_CAP));
                assertTrue(point.containsKey(TIMESTAMP));
            }

            assertTrue(value.getData().containsKey(OVERVIEW));
            final var overview = (Map<String, Object>) value.getData().get(OVERVIEW);
            assertFalse(overview.isEmpty());

            assertTrue(overview.containsKey(CEX));
            final var cex = (Map<String, Object>) overview.get(CEX);
            assertFalse(cex.isEmpty());
            assertTrue(cex.containsKey(VALUE));
            assertTrue(cex.containsKey(PERCENTAGE));
            assertTrue(cex.containsKey(CHG));

            assertTrue(overview.containsKey(DEX));
            final var dex = (Map<String, Object>) overview.get(DEX);
            assertFalse(dex.isEmpty());
            assertTrue(dex.containsKey(VALUE));
            assertTrue(dex.containsKey(PERCENTAGE));
            assertTrue(dex.containsKey(CHG));

            assertTrue(overview.containsKey(MARKET_CAP));
            final var marketcap = (Map<String, Object>) overview.get(MARKET_CAP);
            assertFalse(marketcap.isEmpty());
            assertTrue(marketcap.containsKey(VALUE));
            assertTrue(marketcap.containsKey(CHG));

            assertTrue(overview.containsKey(FUTURES));
            final var futures = (Map<String, Object>) overview.get(FUTURES);
            assertFalse(futures.isEmpty());
            assertTrue(futures.containsKey(VALUE));
            assertTrue(futures.containsKey(CHG));

            assertTrue(overview.containsKey(PERPETUALS));
            final var perpetuals = (Map<String, Object>) overview.get(PERPETUALS);
            assertFalse(perpetuals.isEmpty());
            assertTrue(perpetuals.containsKey(VALUE));
            assertTrue(perpetuals.containsKey(CHG));
        }
    }

    @Test
    public void shouldReceiveFundingRates() {
        final var dataConfig = new DataConfig.Builder()
                .type(Type.FR)
                .build();
        final var consumer = DataConsumer.create(client, dataConfig);
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
            assertEquals(Source.FR, value.getSource());

            assertTrue(value.getData().containsKey(COINS));
            final var coins = (List<Map<String, Object>>) value.getData().get(COINS);
            assertFalse(coins.isEmpty());
            for (final var coin : coins) {
                assertTrue(coin.containsKey(COIN_ID));
                assertTrue(coin.containsKey(COIN_NAME));
                assertTrue(coin.containsKey(COIN_SLUG));
            }

            assertTrue(value.getData().containsKey(POINTS));
            final var points = (List<Map<String, Object>>) value.getData().get(POINTS);
            assertFalse(points.isEmpty());
            for (final var point : points) {
                assertTrue(point.containsKey(MARKET_CAP));
                assertTrue(point.containsKey(MARKET_FUNDING_RATE));
                assertTrue(point.containsKey(CRYPTO_FUNDING_RATE));
                assertTrue(point.containsKey(TIMESTAMP));
            }
        }
    }

    @Test
    public void shouldReceiveVolmexImpliedVolatility() {
        final var dataConfig = new DataConfig.Builder()
                .type(Type.VIV)
                .build();
        final var consumer = DataConsumer.create(client, dataConfig);
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
            assertEquals(Source.VIV, value.getSource());

            assertTrue(value.getData().containsKey(OVERVIEW));
            final var overview = (Map<String, Object>) value.getData().get(OVERVIEW);
            assertFalse(overview.isEmpty());

            assertTrue(overview.containsKey(MARKET_CAP));
            final var marketcap = (Map<String, Object>) overview.get(MARKET_CAP);
            assertFalse(marketcap.isEmpty());
            assertTrue(marketcap.containsKey(VALUE));
            assertTrue(marketcap.containsKey(CHG));

            assertTrue(overview.containsKey(BITCOIN));
            final var bitcoin = (Map<String, Object>) overview.get(BITCOIN);
            assertFalse(bitcoin.isEmpty());
            assertTrue(bitcoin.containsKey(VALUE));
            assertTrue(bitcoin.containsKey(CHG));

            assertTrue(overview.containsKey(ETHEREUM));
            final var ethereum = (Map<String, Object>) overview.get(ETHEREUM);
            assertFalse(ethereum.isEmpty());
            assertTrue(ethereum.containsKey(VALUE));
            assertTrue(ethereum.containsKey(CHG));

            assertTrue(value.getData().containsKey(POINTS));
            final var points = (List<Map<String, Object>>) value.getData().get(POINTS);
            assertFalse(points.isEmpty());
            for (final var point : points) {
                assertTrue(point.containsKey(MARKET_CAP));
                assertTrue(point.containsKey(BITCOIN));
                assertTrue(point.containsKey(ETHEREUM));
                assertTrue(point.containsKey(TIMESTAMP));
            }
        }
    }

    @Test
    public void shouldReceiveFearAndGreedApiProLatest() {
        final var dataConfig = new DataConfig.Builder()
                .type(Type.FG_API_PRO_L)
                .build();
        final var consumer = DataConsumer.create(client, dataConfig);
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
            assertEquals(Source.FG_API_PRO_L, value.getSource());

            assertTrue(value.getData().containsKey(VALUE));
            assertTrue(value.getData().containsKey(UPDATE_TIME));
            assertTrue(value.getData().containsKey(VALUE_CLASSIFICATION));
        }
    }

    @Test
    public void shouldReceiveFearAndGreedApiProHistory() {
        final var dataConfig = new DataConfig.Builder()
                .type(Type.FG_API_PRO_H)
                .build();
        final var consumer = DataConsumer.create(client, dataConfig);
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
            assertEquals(Source.FG_API_PRO_H, value.getSource());

            assertTrue(value.getData().containsKey(VALUE));
            assertTrue(value.getData().containsKey(TIMESTAMP));
            assertTrue(value.getData().containsKey(VALUE_CLASSIFICATION));
        }
    }

    @Test
    public void shouldReceiveFearAndGreed() {
        final var dataConfig = new DataConfig.Builder()
                .type(Type.FG)
                .build();
        final var consumer = DataConsumer.create(client, dataConfig);
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
            assertEquals(Source.FG, value.getSource());

            assertTrue(value.getData().containsKey(DATA_LIST));
            final var dataList = (List<Map<String, Object>>) value.getData().get(DATA_LIST);
            assertFalse(dataList.isEmpty());
            for (final var point : dataList) {
                assertFearAndGreedIndex(point);
                assertTrue(point.containsKey(BTC_PRICE));
                assertTrue(point.containsKey(BTC_VOLUME));
            }

            assertTrue(value.getData().containsKey(DIAL_CONFIG));
            final var dialConfig = (List<Map<String, Object>>) value.getData().get(DIAL_CONFIG);
            assertFalse(dialConfig.isEmpty());
            for (final var point : dialConfig) {
                assertTrue(point.containsKey(START));
                assertTrue(point.containsKey(END));
                assertTrue(point.containsKey(NAME));
            }

            assertTrue(value.getData().containsKey(HISTORICAL_VALUES));
            final var historicalValues = (Map<String, Object>) value.getData().get(HISTORICAL_VALUES);
            assertFalse(historicalValues.isEmpty());

            assertTrue(historicalValues.containsKey(NOW));
            final var now = (Map<String, Object>) historicalValues.get(NOW);
            assertFalse(now.isEmpty());
            assertFearAndGreedIndex(now);

            assertTrue(historicalValues.containsKey(YESTERDAY));
            final var yesterday = (Map<String, Object>) historicalValues.get(YESTERDAY);
            assertFalse(yesterday.isEmpty());
            assertFearAndGreedIndex(yesterday);

            assertTrue(historicalValues.containsKey(LAST_WEEK));
            final var lastWeek = (Map<String, Object>) historicalValues.get(LAST_WEEK);
            assertFalse(lastWeek.isEmpty());
            assertFearAndGreedIndex(lastWeek);

            assertTrue(historicalValues.containsKey(LAST_MONTH));
            final var lastMonth = (Map<String, Object>) historicalValues.get(LAST_MONTH);
            assertFalse(lastMonth.isEmpty());
            assertFearAndGreedIndex(lastMonth);

            assertTrue(historicalValues.containsKey(YEARLY_HIGH));
            final var yearlyHigh = (Map<String, Object>) historicalValues.get(YEARLY_HIGH);
            assertFalse(yearlyHigh.isEmpty());
            assertFearAndGreedIndex(yearlyHigh);

            assertTrue(historicalValues.containsKey(YEARLY_LOW));
            final var yearlyLow = (Map<String, Object>) historicalValues.get(YEARLY_LOW);
            assertFalse(yearlyLow.isEmpty());
            assertFearAndGreedIndex(yearlyLow);
        }
    }

    @Test
    public void shouldReceiveGlobalMetricsApiProLatest() {
        final var dataConfig = new DataConfig.Builder()
                .type(Type.GM_API_PRO_L)
                .build();
        final var consumer = DataConsumer.create(client, dataConfig);
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
            assertEquals(Source.GM_API_PRO_L, value.getSource());

            assertTrue(value.getData().containsKey(BTC_DOMINANCE));
            assertTrue(value.getData().containsKey(ETH_DOMINANCE));
            assertTrue(value.getData().containsKey(ETH_DOMINANCE_YESTERDAY));
            assertTrue(value.getData().containsKey(BTC_DOMINANCE_YESTERDAY));
            assertTrue(value.getData().containsKey(ETH_DOMINANCE_24H_PERCENTAGE_CHANGE));
            assertTrue(value.getData().containsKey(BTC_DOMINANCE_24H_PERCENTAGE_CHANGE));
            assertTrue(value.getData().containsKey(DEFI_VOLUME_24H));
            assertTrue(value.getData().containsKey(DEFI_VOLUME_24H_REPORTED));
            assertTrue(value.getData().containsKey(DEFI_MARKET_CAP));
            assertTrue(value.getData().containsKey(DEFI_24H_PERCENTAGE_CHANGE));
            assertTrue(value.getData().containsKey(STABLECOIN_VOLUME_24H));
            assertTrue(value.getData().containsKey(STABLECOIN_VOLUME_24H_REPORTED));
            assertTrue(value.getData().containsKey(STABLECOIN_MARKET_CAP));
            assertTrue(value.getData().containsKey(STABLECOIN_24H_PERCENTAGE_CHANGE));
            assertTrue(value.getData().containsKey(DERIVATIVES_VOLUME_24H));
            assertTrue(value.getData().containsKey(DERIVATIVES_VOLUME_24H_REPORTED));
            assertTrue(value.getData().containsKey(DERIVATIVES_24H_PERCENTAGE_CHANGE));
            assertTrue(value.getData().containsKey(LAST_UPDATED));

            assertTrue(value.getData().containsKey(QUOTE));
            final var quote = (Map<String, Object>) value.getData().get(QUOTE);
            assertFalse(quote.isEmpty());
            assertTrue(quote.containsKey(CMC_USD_ID));
            Map<String, Object> usdQuote = (Map<String, Object>) quote.get(CMC_USD_ID);
            assertFalse(usdQuote.isEmpty());
            assertTrue(usdQuote.containsKey(TOTAL_MARKET_CAP));
            assertTrue(usdQuote.containsKey(TOTAL_MARKET_CAP_YESTERDAY));
            assertTrue(usdQuote.containsKey(TOTAL_MARKET_CAP_YESTERDAY_PERCENTAGE_CHANGE));
            assertTrue(usdQuote.containsKey(TOTAL_VOLUME_24H));
            assertTrue(usdQuote.containsKey(TOTAL_VOLUME_24H_REPORTED));
            assertTrue(usdQuote.containsKey(TOTAL_VOLUME_24H_YESTERDAY));
            assertTrue(usdQuote.containsKey(TOTAL_VOLUME_24H_YESTERDAY_PERCENTAGE_CHANGE));
            assertTrue(usdQuote.containsKey(ALTCOIN_VOLUME_24H));
            assertTrue(usdQuote.containsKey(ALTCOIN_VOLUME_24H_REPORTED));
            assertTrue(usdQuote.containsKey(ALTCOIN_MARKET_CAP));
        }
    }

    private void assertAltcoinSeason(final Map<String, Object> value) {
        assertTrue(value.containsKey(NAME));
        assertTrue(value.containsKey(ALTCOIN_INDEX));
        assertTrue(value.containsKey(ALTCOIN_MARKET_CAP2));
        assertTrue(value.containsKey(TIMESTAMP));
    }

    private void assertAltcoinSeasonConfig(final Map<String, Object> value) {
        assertTrue(value.containsKey(START));
        assertTrue(value.containsKey(END));
        assertTrue(value.containsKey(NAME));
    }

    private void assertBitcoinDominanceConfig(final Map<String, Object> value) {
        assertTrue(value.containsKey(NAME));
    }

    private void assertBitcoinDominancePoint(final Map<String, Object> value) {
        assertTrue(value.containsKey(DOMINANCE));
        assertTrue(value.containsKey(TIMESTAMP));
    }

    private void assertBitcoinDominance(final Map<String, Object> value) {
        assertTrue(value.containsKey(MC_CHANGE_PCT_30D));
        assertTrue(value.containsKey(MC_PROPORTION));
    }

    private void assertBitcoinDominanceLast(final Map<String, Object> value) {
        assertTrue(value.containsKey(MC_PROPORTION));
    }

    private void assertBitcoinDominanceYearly(final Map<String, Object> value) {
        assertTrue(value.containsKey(TIMESTAMP));
        assertTrue(value.containsKey(MC_PROPORTION));
    }

    private void assertCoinMarketCap100Index(final Map<String, Object> value) {
        assertTrue(value.containsKey(WEIGHT));
        assertTrue(value.containsKey(ID));
        assertTrue(value.containsKey(NAME));
        assertTrue(value.containsKey(SYMBOL));
        assertTrue(value.containsKey(URL));
    }

    private void assertCoinMarketCap100IndexHistory(final Map<String, Object> value) {
        assertTrue(value.containsKey(WEIGHT));
        assertTrue(value.containsKey(ID));
    }

    private void assertCoinMarketCap100Point(final Map<String, Object> value) {
        assertTrue(value.containsKey(TIMESTAMP));
        final var points = ((List<Map<String, Object>>) value.get(POINTS));
        assertFalse(points.isEmpty());
        for (final var point : points) {
            assertTrue(point.containsKey(CRYPTO_ID));
            assertCoinMarketCap100Config(point);
            assertTrue(point.containsKey(WEIGHT));
        }
    }

    private void assertCoinMarketCap100Config(final Map<String, Object> value) {
        assertTrue(value.containsKey(NAME));
        assertTrue(value.containsKey(SLUG));
        assertTrue(value.containsKey(SYMBOL));
    }

    private void assertCoinMarketCap100Value(final Map<String, Object> value) {
        assertTrue(value.containsKey(TIMESTAMP));
        assertTrue(value.containsKey(VALUE));
    }

    private void assertFearAndGreedIndex(final Map<String, Object> value) {
        assertTrue(value.containsKey(SCORE));
        assertTrue(value.containsKey(NAME));
        assertTrue(value.containsKey(TIMESTAMP));
    }
}
