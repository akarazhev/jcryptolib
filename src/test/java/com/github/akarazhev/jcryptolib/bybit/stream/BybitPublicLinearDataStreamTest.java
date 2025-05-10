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

import com.github.akarazhev.jcryptolib.DataStreams;
import com.github.akarazhev.jcryptolib.bybit.BybitTestConfig;
import io.reactivex.rxjava3.disposables.Disposable;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

import static com.github.akarazhev.jcryptolib.bybit.BybitConfig.getPublicTestnetLinear;
import static com.github.akarazhev.jcryptolib.bybit.stream.BybitSubscribers.getSubscriber;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

final class BybitPublicLinearDataStreamTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(BybitPublicLinearDataStreamTest.class);
    private Disposable subscription;

    /**
     * Cleanup after each test.
     * <p>
     * Disposes the test subscription if it is not disposed yet.
     */
    @AfterEach
    void cleanup() {
        if (subscription != null && !subscription.isDisposed()) {
            subscription.dispose();
            LOGGER.info("Test subscription disposed");
        }
    }

    /**
     * Tests that the order book data stream is received properly.
     * <p>
     * Subscribes to the Bybit public order book data stream and verifies that at least one data item is received
     * within a 30 second timeout period. No errors should be encountered during the subscription.
     * The received data should contain a "topic" field.
     */
    @Test
    void shouldReceiveOrderBookDataStream() {
        final var latch = new CountDownLatch(1);
        final var receivedData = new ArrayList<Map<String, Object>>();
        final var hasError = new AtomicBoolean(false);
        final var topic = BybitTestConfig.getPublicOrderBook1BtcUsdt()[0];
        final var subscriber = getSubscriber(latch, receivedData);
        try {
            // Act
            subscription = DataStreams.ofBybit(getPublicTestnetLinear(), BybitTestConfig.getPublicOrderBook1BtcUsdt())
                    .map(BybitMapper.ofMap())
                    .filter(BybitFilter.ofFilter())
                    .subscribe(
                            subscriber.onNext(),
                            t -> {
                                LOGGER.error("Error in test subscription", t);
                                hasError.set(true);
                                latch.countDown();
                            },
                            subscriber.onComplete()
                    );
            // Assert
            assertTrue(latch.await(60, TimeUnit.SECONDS), "Should receive data within timeout period");
            assertFalse(hasError.get(), "Should not encounter errors during subscription");
            assertFalse(receivedData.isEmpty(), "Should receive at least one data item");
            // Verify data structure
            final var firstData = receivedData.getFirst();
            assertTrue(firstData.containsKey("topic"), "Data should contain 'topic' field");
            assertEquals(topic, firstData.get("topic"), "Data should contain '" + topic + "' topic");
            LOGGER.info("Integration test received valid data: {}", firstData);
        } catch (final Exception e) {
            LOGGER.error("Exception during test execution", e);
            fail("Test failed with exception: " + e.getMessage());
        }
    }

    /**
     * Tests that the trade data stream is received properly.
     * <p>
     * Subscribes to the Bybit public trade data stream and verifies that at least one data item is received
     * within a 30 second timeout period. No errors should be encountered during the subscription.
     * The received data should contain a "topic" field.
     */
    @Test
    void shouldReceiveTradeDataStream() {
        final var latch = new CountDownLatch(1);
        final var receivedData = new ArrayList<Map<String, Object>>();
        final var hasError = new AtomicBoolean(false);
        final var topic = BybitTestConfig.getPublicTradeBtcUsdt()[0];
        final var subscriber = getSubscriber(latch, receivedData);
        try {
            // Act
            subscription = DataStreams.ofBybit(getPublicTestnetLinear(), BybitTestConfig.getPublicTradeBtcUsdt())
                    .map(BybitMapper.ofMap())
                    .filter(BybitFilter.ofFilter())
                    .subscribe(
                            subscriber.onNext(),
                            t -> {
                                LOGGER.error("Error in test subscription", t);
                                hasError.set(true);
                                latch.countDown();
                            },
                            subscriber.onComplete()
                    );
            // Assert
            assertTrue(latch.await(60, TimeUnit.SECONDS), "Should receive data within timeout period");
            assertFalse(hasError.get(), "Should not encounter errors during subscription");
            assertFalse(receivedData.isEmpty(), "Should receive at least one data item");
            // Verify data structure
            final var firstData = receivedData.getFirst();
            assertTrue(firstData.containsKey("topic"), "Data should contain 'topic' field");
            assertEquals(topic, firstData.get("topic"), "Data should contain '" + topic + "' topic");
            LOGGER.info("Integration test received valid data: {}", firstData);
        } catch (final Exception e) {
            LOGGER.error("Exception during test execution", e);
            fail("Test failed with exception: " + e.getMessage());
        }
    }

    /**
     * Tests that the ticker data stream is received properly.
     * <p>
     * Subscribes to the Bybit public ticker data stream and verifies that at least one data item is received
     * within a 30 second timeout period. No errors should be encountered during the subscription.
     * The received data should contain a "topic" field.
     */
    @Test
    void shouldReceiveTickerDataStream() {
        final var latch = new CountDownLatch(1);
        final var receivedData = new ArrayList<Map<String, Object>>();
        final var hasError = new AtomicBoolean(false);
        final var topic = BybitTestConfig.getPublicTickersBtcUsdt()[0];
        final var subscriber = getSubscriber(latch, receivedData);
        try {
            // Act
            subscription = DataStreams.ofBybit(getPublicTestnetLinear(), BybitTestConfig.getPublicTickersBtcUsdt())
                    .map(BybitMapper.ofMap())
                    .filter(BybitFilter.ofFilter())
                    .subscribe(
                            subscriber.onNext(),
                            t -> {
                                LOGGER.error("Error in test subscription", t);
                                hasError.set(true);
                                latch.countDown();
                            },
                            subscriber.onComplete()
                    );
            // Assert
            assertTrue(latch.await(60, TimeUnit.SECONDS), "Should receive data within timeout period");
            assertFalse(hasError.get(), "Should not encounter errors during subscription");
            assertFalse(receivedData.isEmpty(), "Should receive at least one data item");
            // Verify data structure
            final var firstData = receivedData.getFirst();
            assertTrue(firstData.containsKey("topic"), "Data should contain 'topic' field");
            assertEquals(topic, firstData.get("topic"), "Data should contain '" + topic + "' topic");
            LOGGER.info("Integration test received valid data: {}", firstData);
        } catch (final Exception e) {
            LOGGER.error("Exception during test execution", e);
            fail("Test failed with exception: " + e.getMessage());
        }
    }

    /**
     * Tests that the kline data stream is received properly.
     * <p>
     * Subscribes to the Bybit public kline data stream and verifies that at least one data item is received
     * within a 30 second timeout period. No errors should be encountered during the subscription.
     * The received data should contain a "topic" field.
     */
    @Test
    void shouldReceiveKlineDataStream() {
        final var latch = new CountDownLatch(1);
        final var receivedData = new ArrayList<Map<String, Object>>();
        final var hasError = new AtomicBoolean(false);
        final var topic = BybitTestConfig.getPublicKlineBtcUsdt()[0];
        final var subscriber = getSubscriber(latch, receivedData);
        try {
            // Act
            subscription = DataStreams.ofBybit(getPublicTestnetLinear(), BybitTestConfig.getPublicKlineBtcUsdt())
                    .map(BybitMapper.ofMap())
                    .filter(BybitFilter.ofFilter())
                    .subscribe(
                            subscriber.onNext(),
                            t -> {
                                LOGGER.error("Error in test subscription", t);
                                hasError.set(true);
                                latch.countDown();
                            },
                            subscriber.onComplete()
                    );
            // Assert
            assertTrue(latch.await(60, TimeUnit.SECONDS), "Should receive data within timeout period");
            assertFalse(hasError.get(), "Should not encounter errors during subscription");
            assertFalse(receivedData.isEmpty(), "Should receive at least one data item");
            // Verify data structure
            final var firstData = receivedData.getFirst();
            assertTrue(firstData.containsKey("topic"), "Data should contain 'topic' field");
            assertEquals(topic, firstData.get("topic"), "Data should contain '" + topic + "' topic");
            LOGGER.info("Integration test received valid data: {}", firstData);
        } catch (final Exception e) {
            LOGGER.error("Exception during test execution", e);
            fail("Test failed with exception: " + e.getMessage());
        }
    }
}
