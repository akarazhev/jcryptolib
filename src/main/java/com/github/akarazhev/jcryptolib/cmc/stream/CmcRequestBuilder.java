package com.github.akarazhev.jcryptolib.cmc.stream;

import com.github.akarazhev.jcryptolib.cmc.config.Range;
import com.github.akarazhev.jcryptolib.cmc.config.Type;

import java.net.URI;
import java.net.http.HttpRequest;
import java.util.UUID;

final class CmcRequestBuilder {

    public static HttpRequest buildCryptoMarketCapRequest(final int convertId, final Range range) {
        final var url = String.format("?range=%s&convertId=%d", range.getValue(), convertId);
        return buildRequest(URI.create(Type.CMC.getUrl() + url), UUID.randomUUID());
    }

    public static HttpRequest buildCryptoEftNetFlowRequest(final Range range) {
        final var url = String.format("?category=all&range=%s", range.getValue());
        return buildRequest(URI.create(Type.ETF_NF.getUrl() + url), UUID.randomUUID());
    }

    public static HttpRequest buildFearGreedRequest(final int convertId, final long start, final long end) {
        final var url = String.format("?start=%d&end=%d&convertId=%d", start, end, convertId);
        return buildRequest(URI.create(Type.FG.getUrl() + url), UUID.randomUUID());
    }

    public static HttpRequest buildAltcoinSeasonRequest(final int convertId, final long start, final long end) {
        final var url = String.format("?start=%d&end=%d&convertId=%d", start, end, convertId);
        return buildRequest(URI.create(Type.AS.getUrl() + url), UUID.randomUUID());
    }

    public static HttpRequest buildBitcoinDominanceOverviewRequest() {
        return buildRequest(URI.create(Type.BDO.getUrl()), UUID.randomUUID());
    }

    public static HttpRequest buildBitcoinDominanceRequest(final Range range) {
        final var url = String.format("?range=%s", range.getValue());
        return buildRequest(URI.create(Type.BD.getUrl() + url), UUID.randomUUID());
    }

    public static HttpRequest buildPuellMultipleLatestRequest(final int convertId) {
        final var url = String.format("?convertId=%d", convertId);
        return buildRequest(URI.create(Type.PML.getUrl() + url), UUID.randomUUID());
    }

    public static HttpRequest buildPuellMultipleRequest() {
        return buildRequest(URI.create(Type.PM.getUrl() + "?range=ALL&convertId=2781"), UUID.randomUUID());
    }

    public static HttpRequest buildIndicatorsRequest(final int convertId) {
        final var url = String.format("?convertId=%d&sortBy=index&sortType=asc", convertId);
        return buildRequest(URI.create(Type.IND.getUrl() + url), UUID.randomUUID());
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
