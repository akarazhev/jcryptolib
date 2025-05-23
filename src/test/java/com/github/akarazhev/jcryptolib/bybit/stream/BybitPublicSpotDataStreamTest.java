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

import org.junit.jupiter.api.Test;

import static com.github.akarazhev.jcryptolib.bybit.BybitConfig.getPublicTestnetSpot;
import static com.github.akarazhev.jcryptolib.bybit.BybitTestConfig.getPublicKlineBtcUsdt;
import static com.github.akarazhev.jcryptolib.bybit.BybitTestConfig.getPublicOrderBook1BtcUsdt;
import static com.github.akarazhev.jcryptolib.bybit.BybitTestConfig.getPublicTickersBtcUsdt;
import static com.github.akarazhev.jcryptolib.bybit.BybitTestConfig.getPublicTradeBtcUsdt;

final class BybitPublicSpotDataStreamTest extends BybitPublicDataStreamTest {

    @Test
    @Override
    public void shouldReceiveOrderBookDataStream() {
        assertTest(getPublicTestnetSpot(), getPublicOrderBook1BtcUsdt());
    }

    @Test
    @Override
    public void shouldReceiveTradeDataStream() {
        assertTest(getPublicTestnetSpot(), getPublicTradeBtcUsdt());
    }

    @Test
    @Override
    public void shouldReceiveTickerDataStream() {
        assertTest(getPublicTestnetSpot(), getPublicTickersBtcUsdt());
    }

    @Test
    @Override
    public void shouldReceiveKlineDataStream() {
        assertTest(getPublicTestnetSpot(), getPublicKlineBtcUsdt());
    }

    @Test
    @Override
    public void shouldReceiveAllLiquidationDataStream() {
        // Implement the test here
    }

    @Test
    @Override
    public void shouldReceiveLtKlineDataStream() {
        // Implement the test here
    }

    @Test
    @Override
    public void shouldReceiveLtTickerDataStream() {
        // Implement the test here
    }

    @Test
    @Override
    public void shouldReceiveLtNavDataStream() {
        // Implement the test here
    }
}
