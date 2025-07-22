package com.github.akarazhev.jcryptolib.bybit.stream;

import com.github.akarazhev.jcryptolib.bybit.config.Type;
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
import java.util.Map;
import java.util.concurrent.TimeUnit;

import static com.github.akarazhev.jcryptolib.bybit.Constants.Response.AIRDROP_END_TIME;
import static com.github.akarazhev.jcryptolib.bybit.Constants.Response.ALLOCATION_END_TIME;
import static com.github.akarazhev.jcryptolib.bybit.Constants.Response.ALLOCATION_START_TIME;
import static com.github.akarazhev.jcryptolib.bybit.Constants.Response.CLAIM_END_TIME;
import static com.github.akarazhev.jcryptolib.bybit.Constants.Response.CLAIM_START_TIME;
import static com.github.akarazhev.jcryptolib.bybit.Constants.Response.COIN;
import static com.github.akarazhev.jcryptolib.bybit.Constants.Response.COIN_ICON;
import static com.github.akarazhev.jcryptolib.bybit.Constants.Response.COIN_NAME;
import static com.github.akarazhev.jcryptolib.bybit.Constants.Response.DESC;
import static com.github.akarazhev.jcryptolib.bybit.Constants.Response.END_TIME;
import static com.github.akarazhev.jcryptolib.bybit.Constants.Response.ICON;
import static com.github.akarazhev.jcryptolib.bybit.Constants.Response.INTRODUCE_CONTENT;
import static com.github.akarazhev.jcryptolib.bybit.Constants.Response.NAME;
import static com.github.akarazhev.jcryptolib.bybit.Constants.Response.POOL_END;
import static com.github.akarazhev.jcryptolib.bybit.Constants.Response.POOL_START;
import static com.github.akarazhev.jcryptolib.bybit.Constants.Response.PROJECT_START_TIME;
import static com.github.akarazhev.jcryptolib.bybit.Constants.Response.RETURN_COIN;
import static com.github.akarazhev.jcryptolib.bybit.Constants.Response.RETURN_COIN_ICON;
import static com.github.akarazhev.jcryptolib.bybit.Constants.Response.REWARD_END_TIME;
import static com.github.akarazhev.jcryptolib.bybit.Constants.Response.REWARD_START_TIME;
import static com.github.akarazhev.jcryptolib.bybit.Constants.Response.RULES;
import static com.github.akarazhev.jcryptolib.bybit.Constants.Response.SNAPSHOT_END_TIME;
import static com.github.akarazhev.jcryptolib.bybit.Constants.Response.SNAPSHOT_START_TIME;
import static com.github.akarazhev.jcryptolib.bybit.Constants.Response.STAKE_BEGIN_TIME;
import static com.github.akarazhev.jcryptolib.bybit.Constants.Response.STAKE_END_TIME;
import static com.github.akarazhev.jcryptolib.bybit.Constants.Response.STAKE_POOL_LIST;
import static com.github.akarazhev.jcryptolib.bybit.Constants.Response.START_TIME;
import static com.github.akarazhev.jcryptolib.bybit.Constants.Response.SYSTEM_TIME;
import static com.github.akarazhev.jcryptolib.bybit.Constants.Response.TITLE;
import static com.github.akarazhev.jcryptolib.bybit.Constants.Response.TOKEN_ICON;
import static com.github.akarazhev.jcryptolib.bybit.Constants.Response.TOKEN_ID;
import static com.github.akarazhev.jcryptolib.bybit.Constants.Response.TOKEN_NAME;
import static com.github.akarazhev.jcryptolib.bybit.Constants.Response.TRADE_BEGIN_TIME;
import static com.github.akarazhev.jcryptolib.bybit.Constants.Response.VOTE_END_TIME;
import static com.github.akarazhev.jcryptolib.bybit.Constants.Response.VOTE_START_TIME;
import static com.github.akarazhev.jcryptolib.bybit.Constants.Response.WEBSITE;
import static com.github.akarazhev.jcryptolib.bybit.Constants.Response.WHITE_PAPER;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

final class BybitDataFetcherTest {
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
    public void shouldReceiveMegaDrop() {
        final var config = new DataConfig.Builder()
                .type(Type.MD)
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
            assertEquals(Provider.BYBIT, value.getProvider());
            assertEquals(Source.MD, value.getSource());
            assertTrue(value.getData().containsKey(TOKEN_NAME));
            assertTrue(value.getData().containsKey(TOKEN_ICON));
            assertTrue(value.getData().containsKey(START_TIME));
            assertTrue(value.getData().containsKey(END_TIME));
            assertTrue(value.getData().containsKey(CLAIM_START_TIME));
            assertTrue(value.getData().containsKey(CLAIM_END_TIME));
        }
    }

    @Test
    public void shouldReceiveLaunchPool() {
        final var config = new DataConfig.Builder()
                .type(Type.LPL)
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
            assertEquals(Provider.BYBIT, value.getProvider());
            assertEquals(Source.LPL, value.getSource());
            assertTrue(value.getData().containsKey(RETURN_COIN));
            assertTrue(value.getData().containsKey(RETURN_COIN_ICON));
            assertTrue(value.getData().containsKey(DESC));
            assertTrue(value.getData().containsKey(WEBSITE));
            assertTrue(value.getData().containsKey(WHITE_PAPER));
            assertTrue(value.getData().containsKey(RULES));
            assertTrue(value.getData().containsKey(STAKE_BEGIN_TIME));
            assertTrue(value.getData().containsKey(STAKE_END_TIME));
            assertTrue(value.getData().containsKey(TRADE_BEGIN_TIME));
            assertTrue(value.getData().containsKey(STAKE_POOL_LIST));
        }
    }

    @Test
    public void shouldReceiveLaunchPad() {
        final var config = new DataConfig.Builder()
                .type(Type.LPD)
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
            assertEquals(Provider.BYBIT, value.getProvider());
            assertEquals(Source.LPD, value.getSource());
            assertTrue(value.getData().containsKey(NAME));
            assertTrue(value.getData().containsKey(TITLE));
            assertTrue(value.getData().containsKey(ICON));
            assertTrue(value.getData().containsKey(START_TIME));
            assertTrue(value.getData().containsKey(END_TIME));
            assertTrue(value.getData().containsKey(SNAPSHOT_START_TIME));
            assertTrue(value.getData().containsKey(SNAPSHOT_END_TIME));
            assertTrue(value.getData().containsKey(ALLOCATION_START_TIME));
            assertTrue(value.getData().containsKey(ALLOCATION_END_TIME));
            assertTrue(value.getData().containsKey(PROJECT_START_TIME));
        }
    }

    @Test
    public void shouldReceiveByVotesPast() {
        final var config = new DataConfig.Builder()
                .type(Type.BYV_PAST)
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
            assertEquals(Provider.BYBIT, value.getProvider());
            assertEquals(Source.BYV, value.getSource());
            assertTrue(value.getData().containsKey(COIN));
            assertTrue(value.getData().containsKey(ICON));
            assertTrue(value.getData().containsKey(VOTE_START_TIME));
            assertTrue(value.getData().containsKey(VOTE_END_TIME));
            assertTrue(value.getData().containsKey(REWARD_START_TIME));
            assertTrue(value.getData().containsKey(REWARD_END_TIME));
            assertTrue(value.getData().containsKey(INTRODUCE_CONTENT));
        }
    }

    @Test
    public void shouldReceiveByStarterPast() {
        final var config = new DataConfig.Builder()
                .type(Type.BYS_PAST)
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
            assertEquals(Provider.BYBIT, value.getProvider());
            assertEquals(Source.BYS, value.getSource());
            assertTrue(value.getData().containsKey(COIN_ICON));
            assertTrue(value.getData().containsKey(COIN_NAME));
        }
    }

    @Test
    public void shouldReceiveAirdropHuntPast() {
        final var config = new DataConfig.Builder()
                .type(Type.ADH_PAST)
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
            assertEquals(Provider.BYBIT, value.getProvider());
            assertEquals(Source.ADH, value.getSource());
            assertTrue(value.getData().containsKey(AIRDROP_END_TIME));
            assertTrue(value.getData().containsKey(POOL_END));
            assertTrue(value.getData().containsKey(POOL_START));
            assertTrue(value.getData().containsKey(SYSTEM_TIME));
            assertTrue(value.getData().containsKey(TOKEN_ICON));
            assertTrue(value.getData().containsKey(TOKEN_ID));
        }
    }
}
