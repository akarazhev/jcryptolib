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

import static com.github.akarazhev.jcryptolib.cmc.stream.Constants.GetRequestHeader.ACCEPT;
import static com.github.akarazhev.jcryptolib.cmc.stream.Constants.GetRequestHeader.ACCEPT_JSON_VALUE;
import static com.github.akarazhev.jcryptolib.cmc.stream.Constants.GetRequestHeader.ACCEPT_LANGUAGE;
import static com.github.akarazhev.jcryptolib.cmc.stream.Constants.GetRequestHeader.ACCEPT_LANGUAGE_VALUE;
import static com.github.akarazhev.jcryptolib.cmc.stream.Constants.GetRequestHeader.ACCEPT_VALUE;
import static com.github.akarazhev.jcryptolib.cmc.stream.Constants.GetRequestHeader.CACHE_CONTROL;
import static com.github.akarazhev.jcryptolib.cmc.stream.Constants.GetRequestHeader.CACHE_CONTROL_VALUE;
import static com.github.akarazhev.jcryptolib.cmc.stream.Constants.GetRequestHeader.ORIGIN;
import static com.github.akarazhev.jcryptolib.cmc.stream.Constants.GetRequestHeader.ORIGIN_VALUE;
import static com.github.akarazhev.jcryptolib.cmc.stream.Constants.GetRequestHeader.PLATFORM;
import static com.github.akarazhev.jcryptolib.cmc.stream.Constants.GetRequestHeader.PLATFORM_VALUE;
import static com.github.akarazhev.jcryptolib.cmc.stream.Constants.GetRequestHeader.PRIORITY;
import static com.github.akarazhev.jcryptolib.cmc.stream.Constants.GetRequestHeader.PRIORITY_VALUE;
import static com.github.akarazhev.jcryptolib.cmc.stream.Constants.GetRequestHeader.REFERER;
import static com.github.akarazhev.jcryptolib.cmc.stream.Constants.GetRequestHeader.REFERER_VALUE;
import static com.github.akarazhev.jcryptolib.cmc.stream.Constants.GetRequestHeader.SEC_FETCH_DEST;
import static com.github.akarazhev.jcryptolib.cmc.stream.Constants.GetRequestHeader.SEC_FETCH_DEST_VALUE;
import static com.github.akarazhev.jcryptolib.cmc.stream.Constants.GetRequestHeader.SEC_FETCH_MODE;
import static com.github.akarazhev.jcryptolib.cmc.stream.Constants.GetRequestHeader.SEC_FETCH_MODE_VALUE;
import static com.github.akarazhev.jcryptolib.cmc.stream.Constants.GetRequestHeader.SEC_FETCH_SITE;
import static com.github.akarazhev.jcryptolib.cmc.stream.Constants.GetRequestHeader.SEC_FETCH_SITE_VALUE;
import static com.github.akarazhev.jcryptolib.cmc.stream.Constants.GetRequestHeader.SEC_FETCH_USER;
import static com.github.akarazhev.jcryptolib.cmc.stream.Constants.GetRequestHeader.SEC_FETCH_USER_VALUE;
import static com.github.akarazhev.jcryptolib.cmc.stream.Constants.GetRequestHeader.TE;
import static com.github.akarazhev.jcryptolib.cmc.stream.Constants.GetRequestHeader.TE_VALUE;
import static com.github.akarazhev.jcryptolib.cmc.stream.Constants.GetRequestHeader.UPGRADE_INSECURE_REQUESTS;
import static com.github.akarazhev.jcryptolib.cmc.stream.Constants.GetRequestHeader.UPGRADE_INSECURE_REQUESTS_VALUE;
import static com.github.akarazhev.jcryptolib.cmc.stream.Constants.GetRequestHeader.USER_AGENT;
import static com.github.akarazhev.jcryptolib.cmc.stream.Constants.GetRequestHeader.USER_AGENT_VALUE;
import static com.github.akarazhev.jcryptolib.cmc.stream.Constants.GetRequestHeader.X_CMC_PRO_API_KEY;
import static com.github.akarazhev.jcryptolib.cmc.stream.Constants.GetRequestHeader.X_REQUEST_ID;
import static com.github.akarazhev.jcryptolib.cmc.stream.Constants.Request.CATEGORY;
import static com.github.akarazhev.jcryptolib.cmc.stream.Constants.Request.CATEGORY_ALL;
import static com.github.akarazhev.jcryptolib.cmc.stream.Constants.Request.CONVERT_ID;
import static com.github.akarazhev.jcryptolib.cmc.stream.Constants.Request.CONVERT_ID_API;
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

    public static HttpRequest buildFearGreedLatestRequest(final String apiKey) {
        return buildRequest(URI.create(Type.FGL.getUrl()), apiKey);
    }

    public static HttpRequest buildGlobalMetricsLatestRequest(final String apiKey, final int convertId) {
        final var url = String.format("?" + CONVERT_ID_API + "=%d", convertId);
        return buildRequest(URI.create(Type.GML.getUrl() + url), apiKey);
    }

    private static HttpRequest buildRequest(final URI uri, final String apiKey) {
        return HttpRequest.newBuilder()
                .uri(uri)
                .header(ACCEPT, ACCEPT_JSON_VALUE)
                .header(X_CMC_PRO_API_KEY, apiKey)
                .GET()
                .build();
    }

    private static HttpRequest buildRequest(final URI uri, final UUID xRequestId) {
        return HttpRequest.newBuilder()
                .uri(uri)
                .header(ACCEPT, ACCEPT_VALUE)
                .header(ACCEPT_LANGUAGE, ACCEPT_LANGUAGE_VALUE)
                .header(CACHE_CONTROL, CACHE_CONTROL_VALUE)
                .header(ORIGIN, ORIGIN_VALUE)
                .header(PLATFORM, PLATFORM_VALUE)
                .header(PRIORITY, PRIORITY_VALUE)
                .header(REFERER, REFERER_VALUE)
                .header(SEC_FETCH_DEST, SEC_FETCH_DEST_VALUE)
                .header(SEC_FETCH_MODE, SEC_FETCH_MODE_VALUE)
                .header(SEC_FETCH_SITE, SEC_FETCH_SITE_VALUE)
                .header(SEC_FETCH_USER, SEC_FETCH_USER_VALUE)
                .header(TE, TE_VALUE)
                .header(UPGRADE_INSECURE_REQUESTS, UPGRADE_INSECURE_REQUESTS_VALUE)
                .header(USER_AGENT, USER_AGENT_VALUE)
                .header(X_REQUEST_ID, xRequestId.toString().replace("-", ""))
                .GET()
                .build();
    }
}
