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

import com.github.akarazhev.jcryptolib.cmc.config.Range;
import com.github.akarazhev.jcryptolib.cmc.config.Type;

import java.net.URI;
import java.net.http.HttpRequest;
import java.util.UUID;

import static com.github.akarazhev.jcryptolib.cmc.stream.Constants.Request.CATEGORY;
import static com.github.akarazhev.jcryptolib.cmc.stream.Constants.Request.CATEGORY_ALL;
import static com.github.akarazhev.jcryptolib.cmc.stream.Constants.Request.CONVERT_ID;
import static com.github.akarazhev.jcryptolib.cmc.stream.Constants.Request.END;
import static com.github.akarazhev.jcryptolib.cmc.stream.Constants.Request.RANGE;
import static com.github.akarazhev.jcryptolib.cmc.stream.Constants.Request.SORT_BY;
import static com.github.akarazhev.jcryptolib.cmc.stream.Constants.Request.SORT_BY_INDEX;
import static com.github.akarazhev.jcryptolib.cmc.stream.Constants.Request.SORT_TYPE;
import static com.github.akarazhev.jcryptolib.cmc.stream.Constants.Request.SORT_TYPE_ASC;
import static com.github.akarazhev.jcryptolib.cmc.stream.Constants.Request.START;

final class CmcRequestBuilder {

    public static HttpRequest buildCryptoMarketCapRequest(final int convertId, final Range range) {
        final var url = String.format("?" + RANGE + "=%s&" + CONVERT_ID + "=%d", range.getValue(), convertId);
        return buildRequest(URI.create(Type.CMC.getUrl() + url), UUID.randomUUID());
    }

    public static HttpRequest buildCryptoEftNetFlowRequest(final Range range) {
        final var url = String.format("?" + CATEGORY + "=" + CATEGORY_ALL + "&" + RANGE + "=%s", range.getValue());
        return buildRequest(URI.create(Type.ETF_NF.getUrl() + url), UUID.randomUUID());
    }

    public static HttpRequest buildFearGreedRequest(final int convertId, final long start, final long end) {
        final var url = String.format("?" + START + "=%d&" + END + "=%d&" + CONVERT_ID + "=%d", start, end, convertId);
        return buildRequest(URI.create(Type.FG.getUrl() + url), UUID.randomUUID());
    }

    public static HttpRequest buildAltcoinSeasonRequest(final int convertId, final long start, final long end) {
        final var url = String.format("?" + START + "=%d&" + END + "=%d&" + CONVERT_ID + "=%d", start, end, convertId);
        return buildRequest(URI.create(Type.AS.getUrl() + url), UUID.randomUUID());
    }

    public static HttpRequest buildBitcoinDominanceOverviewRequest() {
        return buildRequest(URI.create(Type.BDO.getUrl()), UUID.randomUUID());
    }

    public static HttpRequest buildBitcoinDominanceRequest(final Range range) {
        final var url = String.format("?" + RANGE + "=%s", range.getValue());
        return buildRequest(URI.create(Type.BD.getUrl() + url), UUID.randomUUID());
    }

    public static HttpRequest buildMarketCycleLatestRequest(final int convertId) {
        final var url = String.format("?" + CONVERT_ID + "=%d", convertId);
        return buildRequest(URI.create(Type.MCL.getUrl() + url), UUID.randomUUID());
    }

    public static HttpRequest buildPuellMultipleRequest(final int convertId, final Range range) {
        final var url = String.format("?" + RANGE + "=%s&" + CONVERT_ID + "=%d", range.getValue(), convertId);
        return buildRequest(URI.create(Type.PM.getUrl() + url), UUID.randomUUID());
    }

    public static HttpRequest buildIndicatorsRequest(final int convertId) {
        final var url = String.format("?" + CONVERT_ID + "=%d&" + SORT_BY + "=" + SORT_BY_INDEX + "&" + SORT_TYPE + "=" +
                SORT_TYPE_ASC, convertId);
        return buildRequest(URI.create(Type.IND.getUrl() + url), UUID.randomUUID());
    }

    public static HttpRequest buildPiCycleTopIndicatorRequest(final int convertId, final Range range) {
        final var url = String.format("?" + RANGE + "=%s&" + CONVERT_ID + "=%d", range.getValue(), convertId);
        return buildRequest(URI.create(Type.PCT.getUrl() + url), UUID.randomUUID());
    }

    public static HttpRequest buildBitcoinRainbowPriceRequest(final int convertId, final Range range) {
        final var url = String.format("?" + RANGE + "=%s&" + CONVERT_ID + "=%d", range.getValue(), convertId);
        return buildRequest(URI.create(Type.BRP.getUrl() + url), UUID.randomUUID());
    }

    public static HttpRequest buildCoinMarketCap100IndexRequest(final Range range) {
        final var url = String.format("?" + RANGE + "=%s", range.getValue());
        return buildRequest(URI.create(Type.CMC100.getUrl() + url), UUID.randomUUID());
    }

    public static HttpRequest buildCryptoSpotVolumeRequest(final int convertId, final Range range) {
        final var url = String.format("?" + RANGE + "=%s&" + CONVERT_ID + "=%d", range.getValue(), convertId);
        return buildRequest(URI.create(Type.CSV.getUrl() + url), UUID.randomUUID());
    }

    public static HttpRequest buildOpenInterestOverviewRequest(final int convertId) {
        final var url = String.format("?" + CONVERT_ID + "=%d", convertId);
        return buildRequest(URI.create(Type.OIO.getUrl() + url), UUID.randomUUID());
    }

    public static HttpRequest buildOpenInterestRequest(final int convertId, final Range range) {
        final var url = String.format("?" + RANGE + "=%s&" + CONVERT_ID + "=%d", range.getValue(), convertId);
        return buildRequest(URI.create(Type.OI.getUrl() + url), UUID.randomUUID());
    }

    public static HttpRequest buildDerivativesVolumeRequest(final int convertId, final Range range) {
        final var url = String.format("?" + RANGE + "=%s&" + CONVERT_ID + "=%d", range.getValue(), convertId);
        return buildRequest(URI.create(Type.DV.getUrl() + url), UUID.randomUUID());
    }

    public static HttpRequest buildFundingRatesRequest(final int convertId, final Range range) {
        final var url = String.format("?" + RANGE + "=%s&" + CONVERT_ID + "=%d", range.getValue(), convertId);
        return buildRequest(URI.create(Type.FR.getUrl() + url), UUID.randomUUID());
    }

    public static HttpRequest buildVolmexImpliedVolatilityRequest(final int convertId, final Range range) {
        final var url = String.format("?" + RANGE + "=%s&" + CONVERT_ID + "=%d", range.getValue(), convertId);
        return buildRequest(URI.create(Type.VIV.getUrl() + url), UUID.randomUUID());
    }

    private static HttpRequest buildRequest(final URI uri, final UUID xRequestId) {
        return HttpRequest.newBuilder()
                .uri(uri)
                .header("accept", "application/json, text/plain, */*")
                .header("accept-language", "en-US,en;q=0.9")
                .header("cache-control", "no-cache")
                .header("origin", "https://coinmarketcap.com")
                .header("platform", "web")
                .header("priority", "u=1, i")
                .header("referer", "https://coinmarketcap.com/")
                .header("sec-ch-ua", "\"Not)A;Brand\";v=\"8\", \"Chromium\";v=\"138\", \"Google Chrome\";" +
                        "v=\"138\"")
                .header("sec-ch-ua-mobile", "?0")
                .header("sec-ch-ua-platform", "\"macOS\"")
                .header("sec-fetch-dest", "empty")
                .header("sec-fetch-mode", "cors")
                .header("sec-fetch-site", "same-site")
                .header("user-agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 " +
                        "(KHTML, like Gecko) Chrome/138.0.0.0 Safari/537.36")
                .header("x-request-id", xRequestId.toString().replace("-", ""))
                .GET()
                .build();
    }
}
