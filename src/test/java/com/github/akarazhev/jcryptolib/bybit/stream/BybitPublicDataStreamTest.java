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

import com.github.akarazhev.jcryptolib.Clients;
import com.github.akarazhev.jcryptolib.DataStreams;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

import static com.github.akarazhev.jcryptolib.bybit.stream.BybitSubscribers.getSubscriber;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

abstract class BybitPublicDataStreamTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(BybitPublicDataStreamTest.class);

    abstract void shouldReceiveOrderBookDataStream();

    abstract void shouldReceiveTradeDataStream();

    abstract void shouldReceiveTickerDataStream();

    abstract void shouldReceiveKlineDataStream();

    abstract void shouldReceiveAllLiquidationDataStream();

    abstract void shouldReceiveLtKlineDataStream();

    abstract void shouldReceiveLtTickerDataStream();

    abstract void shouldReceiveLtNavDataStream();

    /**
     * Asserts that the given data stream is received properly.
     * <p>
     * Subscribes to the given data stream, verifies that at least one data item is received
     * within a 60-second timeout period, and that the received data is valid. No errors should
     * be encountered during the subscription.
     * <p>
     * The received data should contain a "topic" field and should have the given topic.
     *
     * @param url    the data stream URL
     * @param topics the topics to subscribe to
     */
    void assertTest(final String url, final String[] topics) {
        final var latch = new CountDownLatch(1);
        final var receivedData = new ArrayList<Map<String, Object>>();
        final var hasError = new AtomicBoolean(false);
        final var subscriber = getSubscriber(latch, receivedData);
        try (final var client = Clients.newHttpClient()) {
            // Act
            final var subscription = DataStreams.ofBybit(client, url, topics)
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
            subscription.dispose();
            assertFalse(hasError.get(), "Should not encounter errors during subscription");
            assertFalse(receivedData.isEmpty(), "Should receive at least one data item");
            // Verify data structure
            final var firstData = receivedData.getFirst();
            assertTrue(firstData.containsKey("topic"), "Data should contain 'topic' field");
            assertEquals(topics[0], firstData.get("topic"), "Data should contain '" + topics[0] + "' topic");
            LOGGER.info("Integration test received valid data: {}", firstData);
        } catch (final Exception e) {
            LOGGER.error("Exception during test execution", e);
            fail("Test failed with exception: " + e.getMessage());
        }
    }
}
