package com.github.akarazhev.jcryptolib.cmc.stream;

import com.github.akarazhev.jcryptolib.cmc.config.Type;

import java.net.URI;
import java.net.http.HttpRequest;
import java.util.UUID;

final class CmcRequestBuilder {

    public static HttpRequest buildCryptoMarketCapRequest() {
        return buildRequest(URI.create(Type.CMC.getUrl() + "?range=all&convertId=2781"), UUID.randomUUID());
    }

    public static HttpRequest buildCryptoEftNetFlowRequest() {
        return buildRequest(URI.create(Type.ETF_NF.getUrl() + "?category=all&range=30d"), UUID.randomUUID());
    }

    public static HttpRequest buildFearGreedChartRequest(final long start, final long end) {
        return buildRequest(URI.create(String.format(Type.FGI.getUrl() + "?start=%d&end=%d&convertId=2781", start, end)),
                UUID.randomUUID());
    }

    public static HttpRequest buildAltcoinSeasonIndexRequest(final long start, final long end) {
        return buildRequest(URI.create(String.format(Type.ASI.getUrl() + "?start=%d&end=%d&convertId=2781", start, end)),
                UUID.randomUUID());
    }

    public static HttpRequest buildBitcoinDominanceNowRequest() {
        return buildRequest(URI.create(Type.BDN.getUrl()), UUID.randomUUID());
    }

    public static HttpRequest buildBitcoinDominanceAllRequest() {
        return buildRequest(URI.create(Type.BDA.getUrl() + "?range=all"), UUID.randomUUID());
    }

    public static HttpRequest buildPuellMultipleNowRequest() {
        return buildRequest(URI.create(Type.PMN.getUrl() + "?convertId=2781"), UUID.randomUUID());
    }

    public static HttpRequest buildPuellMultipleAllRequest() {
        return buildRequest(URI.create(Type.PMA.getUrl() + "?range=ALL&convertId=2781"), UUID.randomUUID());
    }

    public static HttpRequest buildIndicatorsRequest() {
        return buildRequest(URI.create(Type.IND.getUrl() + "?convertId=2781&sortBy=index&sortType=asc"), UUID.randomUUID());
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
