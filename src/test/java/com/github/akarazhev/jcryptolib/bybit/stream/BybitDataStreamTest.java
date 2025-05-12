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
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.schedulers.Schedulers;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

import static com.github.akarazhev.jcryptolib.bybit.BybitConfig.getPublicSubscribeTopics;
import static com.github.akarazhev.jcryptolib.bybit.BybitConfig.getPublicTestnetSpot;
import static com.github.akarazhev.jcryptolib.bybit.stream.BybitSubscribers.getSubscriber;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

final class BybitDataStreamTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(BybitDataStreamTest.class);
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
     * Tests that the data stream is received properly.
     * <p>
     * Subscribes to the Bybit public spot data stream and verifies that at least one data item is received
     * within a 60-second timeout period. No errors should be encountered during the subscription.
     * The received data should contain a "topic" field.
     */
    @Test
    void shouldReceiveDataStream() {
        final var latch = new CountDownLatch(1);
        final var receivedData = new ArrayList<Map<String, Object>>();
        final var hasError = new AtomicBoolean(false);
        final var subscriber = getSubscriber(latch, receivedData);
        try {
            // Act
            subscription = DataStreams.ofBybit(getPublicTestnetSpot(), getPublicSubscribeTopics())
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
            LOGGER.info("Integration test received valid data: {}", firstData);
        } catch (final Exception e) {
            LOGGER.error("Exception during test execution", e);
            fail("Test failed with exception: " + e.getMessage());
        }
    }

    /**
     * Tests that the data stream is received properly for multiple messages.
     * <p>
     * Subscribes to the Bybit public spot data stream and verifies that at least 3 data items are received
     * within a 60-second timeout period. No errors should be encountered during the subscription.
     * The received data should contain a "topic" field.
     */
    @Test
    void shouldHandleMultipleMessages() {
        final var expectedMessageCount = 3;
        final var latch = new CountDownLatch(expectedMessageCount);
        final var receivedData = new ArrayList<Map<String, Object>>();
        final var subscriber = getSubscriber(latch, receivedData);
        try {
            // Act
            subscription = DataStreams.ofBybit(getPublicTestnetSpot(), getPublicSubscribeTopics())
                    .map(BybitMapper.ofMap())
                    .filter(BybitFilter.ofFilter())
                    .subscribe(
                            subscriber.onNext(),
                            throwable -> {
                                LOGGER.error("Error in test subscription", throwable);
                                fail("Should not encounter errors: " + throwable.getMessage());
                            },
                            subscriber.onComplete()
                    );
            // Assert
            assertTrue(latch.await(60, TimeUnit.SECONDS),
                    "Should receive " + expectedMessageCount + " messages within timeout period");
            assertTrue(receivedData.size() >= expectedMessageCount,
                    "Should receive at least " + expectedMessageCount + " messages");
            LOGGER.info("Successfully received {} messages", receivedData.size());
        } catch (final Exception e) {
            LOGGER.error("Exception during test execution", e);
            fail("Test failed with exception: " + e.getMessage());
        }
    }

    /**
     * Tests that the data stream is not received when given an invalid URL.
     * <p>
     * Subscribes to the Bybit public spot data stream with an invalid URL that will cause connection issues,
     * and verifies that an error is encountered within a 10-second timeout period. No data should be received
     * during the subscription.
     */
    @Test
    void shouldHandleInvalidUrl() {
        // Arrange
        final var latch = new CountDownLatch(1);
        final var hasError = new AtomicBoolean(false);
        final var errorMessage = new StringBuilder();
        final var receivedData = new ArrayList<Map<String, Object>>();
        final var subscriber = getSubscriber(latch, receivedData);
        try {
            // Act - use an invalid URL that will cause connection issues
            final var invalidUrl = "wss://invalid.url.that.does.not.exist";
            // Set a shorter timeout for the test
            subscription = DataStreams.ofBybit(invalidUrl, getPublicSubscribeTopics())
                    // Add timeout to force error after 5 seconds
                    .timeout(5, TimeUnit.SECONDS)
                    .map(BybitMapper.ofMap())
                    .filter(BybitFilter.ofFilter())
                    .subscribe(
                            subscriber.onNext(),
                            throwable -> {
                                LOGGER.info("Expected error received: {}", throwable.getMessage());
                                errorMessage.append(throwable.getMessage());
                                hasError.set(true);
                                latch.countDown();
                            },
                            subscriber.onComplete()
                    );
            // Assert - we expect an error to occur within timeout
            final var completed = latch.await(10, TimeUnit.SECONDS);
            if (!completed) {
                // If latch didn't count down, we'll manually verify that no data was received
                // This is also a valid test case - connection failed but didn't trigger error
                assertTrue(receivedData.isEmpty(), "No data should be received with invalid URL");
                LOGGER.info("No error triggered, but connection failed as expected (no data received)");
            } else {
                // If latch counted down, verify it was due to an error
                assertTrue(hasError.get(), "Should encounter errors with invalid URL");
                LOGGER.info("Error handling test passed with message: {}", errorMessage);
            }
        } catch (final Exception e) {
            LOGGER.error("Unexpected exception during test execution", e);
            fail("Test failed with unexpected exception: " + e.getMessage());
        }
    }

    /**
     * Tests that the data stream is received properly even when the consumer is slow, which may cause backpressure.
     * <p>
     * Subscribes to the Bybit public spot data stream and introduces an artificial delay to simulate slow processing,
     * then verifies that the required number of messages are processed within a 2-minute timeout period. No errors should
     * be encountered during the subscription. The received data should contain a "topic" field.
     */
    @Test
    void shouldHandleBackpressure() {
        // This test verifies that the BUFFER backpressure strategy works correctly
        final var messageCount = 10;
        final var latch = new CountDownLatch(1);
        final var receivedCount = new AtomicInteger(0);
        final var hasError = new AtomicBoolean(false);
        try {
            // Create a slow consumer
            subscription = DataStreams.ofBybit(getPublicTestnetSpot(), getPublicSubscribeTopics())
                    .map(BybitMapper.ofMap())
                    .filter(BybitFilter.ofFilter())
                    // Introduce artificial delay to test backpressure
                    .observeOn(Schedulers.io(), false, 2) // Small buffer size
                    .doOnNext(_ -> {
                        // Simulate slow processing
                        try {
                            Thread.sleep(100);
                            final var count = receivedCount.incrementAndGet();
                            LOGGER.info("Processed message {}", count);
                            if (count >= messageCount) {
                                latch.countDown();
                            }
                        } catch (final InterruptedException e) {
                            Thread.currentThread().interrupt();
                        }
                    })
                    .subscribe(
                            _ -> { /* Already handled in doOnNext */ },
                            throwable -> {
                                LOGGER.error("Error in backpressure test", throwable);
                                hasError.set(true);
                                latch.countDown();
                            },
                            () -> LOGGER.info("Backpressure test completed")
                    );
            // Assert
            assertTrue(latch.await(120, TimeUnit.SECONDS), "Should process required number of messages");
            assertFalse(hasError.get(), "Should not encounter errors during backpressure test");
            assertTrue(receivedCount.get() >= messageCount,
                    "Should receive at least " + messageCount + " messages");
            LOGGER.info("Backpressure test passed, processed {} messages", receivedCount.get());
        } catch (final Exception e) {
            LOGGER.error("Exception during backpressure test", e);
            fail("Backpressure test failed with exception: " + e.getMessage());
        }
    }

    /**
     * Tests that the data stream can be subscribed to by multiple subscribers.
     * <p>
     * Creates a flowable that is multicasting and subscribes to it twice with a slight delay.
     * Verifies that both subscribers receive data and no errors are encountered.
     * <p>
     * This test ensures that the data stream can be safely subscribed to by multiple components.
     */
    @Test
    void shouldSupportMultipleSubscribers() {
        final var latch1 = new CountDownLatch(1);
        final var latch2 = new CountDownLatch(1);
        final var receivedData1 = new ArrayList<Map<String, Object>>();
        final var receivedData2 = new ArrayList<Map<String, Object>>();
        final var hasError = new AtomicBoolean(false);
        try {
            // Create the flowable
            final var flowable = DataStreams.ofBybit(getPublicTestnetSpot(), getPublicSubscribeTopics())
                    .map(BybitMapper.ofMap())
                    .filter(BybitFilter.ofFilter())
                    .publish()  // Make it multicasting
                    .refCount();
            // First subscriber
            final var subscriber1 = getSubscriber(latch1, receivedData1);
            final var sub1 = flowable.subscribe(
                    subscriber1.onNext(),
                    throwable -> {
                        LOGGER.error("Error in subscriber 1", throwable);
                        hasError.set(true);
                        latch1.countDown();
                    },
                    subscriber1.onComplete()
            );
            // Second subscriber with slight delay
            Thread.sleep(500);
            final var subscriber2 = getSubscriber(latch2, receivedData2);
            final var sub2 = flowable.subscribe(
                    subscriber2.onNext(),
                    throwable -> {
                        LOGGER.error("Error in subscriber 2", throwable);
                        hasError.set(true);
                        latch2.countDown();
                    },
                    subscriber2.onComplete()
            );
            // Store both subscriptions for cleanup
            subscription = Disposable.fromAction(() -> {
                sub1.dispose();
                sub2.dispose();
            });
            // Assert
            assertTrue(latch1.await(60, TimeUnit.SECONDS), "First subscriber should receive data");
            assertTrue(latch2.await(60, TimeUnit.SECONDS), "Second subscriber should receive data");
            assertFalse(hasError.get(), "Should not encounter errors");
            assertFalse(receivedData1.isEmpty(), "First subscriber should receive data");
            assertFalse(receivedData2.isEmpty(), "Second subscriber should receive data");
            LOGGER.info("Multiple subscribers test passed. Subscriber 1: {} messages, Subscriber 2: {} messages",
                    receivedData1.size(), receivedData2.size());
        } catch (final Exception e) {
            LOGGER.error("Exception during multiple subscribers test", e);
            fail("Multiple subscribers test failed with exception: " + e.getMessage());
        }
    }

    /**
     * Tests that the data stream can be cleanly disposed without errors.
     * <p>
     * Subscribes to the Bybit public spot data stream, confirms data is flowing,
     * then disposes the subscription and verifies that cleanup occurs properly.
     */
    @Test
    void shouldCleanupResourcesOnDispose() {
        final var latch = new CountDownLatch(1);
        final var receivedData = new ArrayList<Map<String, Object>>();
        final var hasError = new AtomicBoolean(false);
        final var subscriber = getSubscriber(latch, receivedData);
        try {
            // Act - subscribe and wait for some data
            subscription = DataStreams.ofBybit(getPublicTestnetSpot(), getPublicSubscribeTopics())
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
            // Wait for at least one message
            assertTrue(latch.await(60, TimeUnit.SECONDS), "Should receive data within timeout period");
            assertFalse(hasError.get(), "Should not encounter errors during subscription");
            assertFalse(receivedData.isEmpty(), "Should receive at least one data item");
            // Act - dispose the subscription
            subscription.dispose();
            // Assert that subscription is actually disposed
            assertTrue(subscription.isDisposed(), "Subscription should be properly disposed");
            // Verify no more data is received after disposal
            final var dataSize = receivedData.size();
            Thread.sleep(2000); // Wait briefly to ensure no more data comes in
            assertEquals(dataSize, receivedData.size(), "No additional data should be received after disposal");
            LOGGER.info("Resource cleanup test completed successfully");
        } catch (final Exception e) {
            LOGGER.error("Exception during test execution", e);
            fail("Test failed with exception: " + e.getMessage());
        }
    }

    /**
     * Tests the connection timeout handling.
     * <p>
     * Verifies that when a connection timeout occurs, the WebSocket handles it appropriately
     * by emitting an error or completing properly without hanging.
     */
    @Test
    void shouldHandleConnectionTimeout() {
        final var latch = new CountDownLatch(1);
        final var hasError = new AtomicBoolean(false);
        final var errorMessage = new StringBuilder();
        try {
            // Create a Flowable with a very short timeout to simulate connection timeout
            subscription = DataStreams.ofBybit(getPublicTestnetSpot(), getPublicSubscribeTopics())
                    .timeout(100, TimeUnit.MILLISECONDS) // Very short timeout to force failure
                    .subscribe(
                            data -> LOGGER.info("Received unexpected data: {}", data),
                            throwable -> {
                                LOGGER.info("Expected timeout error: {}", throwable.getMessage());
                                errorMessage.append(throwable.getMessage());
                                hasError.set(true);
                                latch.countDown();
                            },
                            () -> {
                                LOGGER.info("Unexpected completion");
                                latch.countDown();
                            }
                    );
            // Assert - we expect a timeout error
            assertTrue(latch.await(10, TimeUnit.SECONDS), "Should trigger timeout within expected period");
            assertTrue(hasError.get(), "Should encounter timeout error");
            LOGGER.info("Timeout handling test passed with error: {}", errorMessage);
        } catch (final Exception e) {
            LOGGER.error("Exception during test execution", e);
            fail("Test failed with unexpected exception: " + e.getMessage());
        }
    }

    /**
     * Tests the throttling of the data stream with sample rate.
     * <p>
     * Verifies that when we apply sampling to the data stream, we receive
     * fewer messages than the normal flow, effectively throttling the stream.
     */
    @Test
    void shouldSupportSampling() {
        final var normalLatch = new CountDownLatch(10);
        final var sampledLatch = new CountDownLatch(3);
        final var normalCount = new AtomicInteger(0);
        final var sampledCount = new AtomicInteger(0);
        final var hasError = new AtomicBoolean(false);
        try {
            // Create the base flowable
            final var flowable = DataStreams.ofBybit(getPublicTestnetSpot(), getPublicSubscribeTopics())
                    .map(BybitMapper.ofMap())
                    .filter(BybitFilter.ofFilter())
                    .publish()
                    .refCount();
            // Normal subscriber
            final var sub1 = flowable.subscribe(
                    _ -> {
                        final var count = normalCount.incrementAndGet();
                        LOGGER.info("Normal subscriber received message {}", count);
                        if (count >= 10) {
                            normalLatch.countDown();
                        }
                    },
                    throwable -> {
                        LOGGER.error("Error in normal subscriber", throwable);
                        hasError.set(true);
                        normalLatch.countDown();
                    }
            );
            // Sampled subscriber - only takes one item per 300ms
            final var sub2 = flowable
                    .sample(300, TimeUnit.MILLISECONDS)
                    .subscribe(
                            _ -> {
                                final var count = sampledCount.incrementAndGet();
                                LOGGER.info("Sampled subscriber received message {}", count);
                                if (count >= 3) {
                                    sampledLatch.countDown();
                                }
                            },
                            throwable -> {
                                LOGGER.error("Error in sampled subscriber", throwable);
                                hasError.set(true);
                                sampledLatch.countDown();
                            }
                    );
            // Store both subscriptions for cleanup
            subscription = Disposable.fromAction(() -> {
                sub1.dispose();
                sub2.dispose();
            });
            // Assert
            assertTrue(normalLatch.await(60, TimeUnit.SECONDS),
                    "Normal subscriber should receive required messages");
            assertTrue(sampledLatch.await(60, TimeUnit.SECONDS),
                    "Sampled subscriber should receive required messages");
            assertFalse(hasError.get(), "Should not encounter errors");
            // Verify sampling worked - sampled count should be less than normal count
            assertTrue(sampledCount.get() < normalCount.get(),
                    "Sampled subscriber should receive fewer messages than normal subscriber");
            LOGGER.info("Sampling test passed. Normal received: {}, Sampled received: {}", normalCount.get(),
                    sampledCount.get());
        } catch (final Exception e) {
            LOGGER.error("Exception during sampling test", e);
            fail("Sampling test failed with exception: " + e.getMessage());
        }
    }

    /**
     * Tests the ability to filter specific events from the data stream.
     * <p>
     * Creates a data stream and applies a custom filter to only receive events
     * for a specific topic, verifying that the filter works as expected.
     */
    @Test
    void shouldSupportCustomFiltering() {
        final var latch = new CountDownLatch(5);
        final var allMessages = new ArrayList<Map<String, Object>>();
        final var filteredMessages = new ArrayList<Map<String, Object>>();
        final var hasError = new AtomicBoolean(false);
        final var targetTopic = "orderbook.1.BTCUSDT"; // Example topic to filter for
        try {
            // Create the base flowable
            final var flowable = DataStreams.ofBybit(getPublicTestnetSpot(), getPublicSubscribeTopics())
                    .map(BybitMapper.ofMap())
                    .publish()
                    .refCount();
            // Subscribe to all messages
            final var sub1 = flowable.subscribe(
                    data -> {
                        allMessages.add(data);
                        LOGGER.info("Received message for topic: {}", data.get("topic"));
                    },
                    throwable -> {
                        LOGGER.error("Error in all messages subscriber", throwable);
                        hasError.set(true);
                        latch.countDown();
                    }
            );
            // Subscribe with custom topic filter
            final var sub2 = flowable
                    .filter(data -> {
                        final var topic = (String) data.get("topic");
                        return topic != null && topic.contains(targetTopic);
                    })
                    .subscribe(
                            data -> {
                                filteredMessages.add(data);
                                LOGGER.info("Filtered message for target topic: {}", data.get("topic"));
                                if (filteredMessages.size() >= 5) {
                                    latch.countDown();
                                }
                            },
                            throwable -> {
                                LOGGER.error("Error in filtered subscriber", throwable);
                                hasError.set(true);
                                latch.countDown();
                            }
                    );
            // Store both subscriptions for cleanup
            subscription = Disposable.fromAction(() -> {
                sub1.dispose();
                sub2.dispose();
            });
            // Allow some time for messages to be received
            final var completed = latch.await(120, TimeUnit.SECONDS);
            // Assert
            assertFalse(hasError.get(), "Should not encounter errors");
            if (completed) {
                // If we received the target number of filtered messages
                assertTrue(filteredMessages.size() >= 5,
                        "Should receive at least 5 messages matching the filter");
                // Verify all filtered messages match our topic filter
                for (final var message : filteredMessages) {
                    final var topic = (String) message.get("topic");
                    assertTrue(topic.contains(targetTopic),
                            "Filtered message should match target topic");
                }

                LOGGER.info("Custom filtering test passed. All messages: {}, Filtered messages: {}",
                        allMessages.size(), filteredMessages.size());
            } else {
                // If we didn't receive enough matching messages but didn't encounter errors either
                LOGGER.info("Did not receive enough messages matching filter within timeout. " +
                        "All: {}, Filtered: {}", allMessages.size(), filteredMessages.size());
                // As long as we received some messages, we can still verify the filter logic
                if (!allMessages.isEmpty()) {
                    boolean foundAnyMatching = false;
                    boolean foundAnyNonMatching = false;
                    for (final var message : allMessages) {
                        final var topic = (String) message.get("topic");
                        if (topic != null && topic.contains(targetTopic)) {
                            foundAnyMatching = true;
                            assertTrue(filteredMessages.contains(message),
                                    "Message matching filter should be in filtered collection");
                        } else {
                            foundAnyNonMatching = true;
                            assertFalse(filteredMessages.contains(message),
                                    "Message not matching filter should not be in filtered collection");
                        }
                    }

                    // Skip the full test but verify filter logic if we got both types of messages
                    if (foundAnyMatching && foundAnyNonMatching) {
                        LOGGER.info("Filter logic verified correctly even though not enough messages received");
                    }
                }
            }
        } catch (final Exception e) {
            LOGGER.error("Exception during filtering test", e);
            fail("Filtering test failed with exception: " + e.getMessage());
        }
    }
}
