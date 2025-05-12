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

interface BybitPublicDataStreamTest {

    /**
     * Tests that the order book data stream is received properly.
     * <p>
     * Subscribes to the Bybit public order book data stream and verifies that at least one data item is received
     * within a 60-second timeout period. No errors should be encountered during the subscription.
     * The received data should contain a "topic" field.
     */
    void shouldReceiveOrderBookDataStream();

    /**
     * Tests that the trade data stream is received properly.
     * <p>
     * Subscribes to the Bybit public trade data stream and verifies that at least one data item is received
     * within a 60-second timeout period. No errors should be encountered during the subscription.
     * The received data should contain a "topic" field.
     */
    void shouldReceiveTradeDataStream();

    /**
     * Tests that the ticker data stream is received properly.
     * <p>
     * Subscribes to the Bybit public ticker data stream and verifies that at least one data item is received
     * within a 60-second timeout period. No errors should be encountered during the subscription.
     * The received data should contain a "topic" field.
     */
    void shouldReceiveTickerDataStream();

    /**
     * Tests that the kline data stream is received properly.
     * <p>
     * Subscribes to the Bybit public kline data stream and verifies that at least one data item is received
     * within a 60-second timeout period. No errors should be encountered during the subscription.
     * The received data should contain a "topic" field.
     */
    void shouldReceiveKlineDataStream();

    /**
     * Tests that the all liquidation data stream is received properly.
     * <p>
     * Subscribes to the Bybit public all liquidation data stream and verifies that at least one data item is received
     * within a 60-second timeout period. No errors should be encountered during the subscription.
     * The received data should contain a "topic" field.
     */
    void shouldReceiveAllLiquidationDataStream();

    /**
     * Tests that the leveraged token kline data stream is received properly.
     * <p>
     * Subscribes to the Bybit public leveraged token kline data stream and verifies that at least one data item is received
     * within a 60-second timeout period. No errors should be encountered during the subscription.
     * The received data should contain a "topic" field.
     */
    void shouldReceiveLtKlineDataStream();

    /**
     * Tests that the leveraged token ticker data stream is received properly.
     * <p>
     * Subscribes to the Bybit public leveraged token ticker data stream and verifies that at least one data item is received
     * within a 60-second timeout period. No errors should be encountered during the subscription.
     * The received data should contain a "topic" field.
     */
    void shouldReceiveLtTickerDataStream();

    /**
     * Tests that the leveraged token navigation data stream is received properly.
     * <p>
     * Subscribes to the Bybit public leveraged token navigation data stream and verifies that at least one data item is received
     * within a 60-second timeout period. No errors should be encountered during the subscription.
     * The received data should contain a "topic" field.
     */
    void shouldReceiveLtNavDataStream();
}
