package com.github.akarazhev.jcryptolib.cmc.stream;

import com.github.akarazhev.jcryptolib.cmc.config.Url;

import java.net.URI;
import java.net.http.HttpRequest;
import java.util.UUID;

final class CmcRequestBuilder {

    public static HttpRequest buildFearGreedChartRequest(final long start, final long end) {
        return buildRequest(URI.create(String.format(Url.FGI + "?start=%d&end=%d&convertId=2781", start, end)),
                UUID.randomUUID());
    }

    public static HttpRequest buildAltcoinSeasonIndexRequest(final long start, final long end) {
        return buildRequest(URI.create(String.format(Url.ASI + "?start=%d&end=%d&convertId=2781", start, end)),
                UUID.randomUUID());
    }

    public static HttpRequest buildBitcoinDominanceNowRequest() {
        return buildRequest(URI.create(Url.BDN.toString()), UUID.randomUUID());
    }

    public static HttpRequest buildBitcoinDominanceAllRequest() {
        return buildRequest(URI.create(String.format(Url.BDA + "?range=all")), UUID.randomUUID());
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
                .header("sec-ch-ua", "\"Google Chrome\";v=\"137\", \"Chromium\";v=\"137\", " +
                        "\"Not/A)Brand\";v=\"24\"")
                .header("sec-ch-ua-mobile", "?0")
                .header("sec-ch-ua-platform", "\"macOS\"")
                .header("sec-fetch-dest", "empty")
                .header("sec-fetch-mode", "cors")
                .header("sec-fetch-site", "same-site")
                .header("user-agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) " +
                        "AppleWebKit/537.36 (KHTML, like Gecko) Chrome/137.0.0.0 Safari/537.36")
                .header("x-request-id", xRequestId.toString().replace("-", ""))
                .GET()
                .build();
    }
}
