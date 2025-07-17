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

import static com.github.akarazhev.jcryptolib.bybit.Constants.Response.ACTIVITY_ID;
import static com.github.akarazhev.jcryptolib.bybit.Constants.Response.ACTIVITY_STATUS;
import static com.github.akarazhev.jcryptolib.bybit.Constants.Response.AWARD_INTERVAL;
import static com.github.akarazhev.jcryptolib.bybit.Constants.Response.CLAIM_END_TIME;
import static com.github.akarazhev.jcryptolib.bybit.Constants.Response.CLAIM_START_TIME;
import static com.github.akarazhev.jcryptolib.bybit.Constants.Response.END_TIME;
import static com.github.akarazhev.jcryptolib.bybit.Constants.Response.MIN_REWARD_AMOUNT;
import static com.github.akarazhev.jcryptolib.bybit.Constants.Response.START_TIME;
import static com.github.akarazhev.jcryptolib.bybit.Constants.Response.TOKEN_ICON;
import static com.github.akarazhev.jcryptolib.bybit.Constants.Response.TOKEN_INFO_LIST;
import static com.github.akarazhev.jcryptolib.bybit.Constants.Response.TOKEN_NAME;
import static com.github.akarazhev.jcryptolib.bybit.Constants.Response.TOTAL_NUMBER_AWARDS;
import static com.github.akarazhev.jcryptolib.bybit.Constants.Response.TOTAL_PRIZE_POOL;
import static com.github.akarazhev.jcryptolib.bybit.Constants.Response.USER_MAX_NUM;
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
            assertTrue(value.getData().containsKey(ACTIVITY_ID));
            assertTrue(value.getData().containsKey(TOKEN_NAME));
            assertTrue(value.getData().containsKey(TOKEN_ICON));
            assertTrue(value.getData().containsKey(TOKEN_INFO_LIST));
            assertTrue(value.getData().containsKey(START_TIME));
            assertTrue(value.getData().containsKey(END_TIME));
            assertTrue(value.getData().containsKey(CLAIM_START_TIME));
            assertTrue(value.getData().containsKey(CLAIM_END_TIME));
            assertTrue(value.getData().containsKey(TOTAL_PRIZE_POOL));
            assertTrue(value.getData().containsKey(ACTIVITY_STATUS));
            assertTrue(value.getData().containsKey(USER_MAX_NUM));
            assertTrue(value.getData().containsKey(TOTAL_NUMBER_AWARDS));
            assertTrue(value.getData().containsKey(AWARD_INTERVAL));
            assertTrue(value.getData().containsKey(MIN_REWARD_AMOUNT));
        }
    }
}
