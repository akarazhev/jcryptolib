# Spot Market

## Crypto Spot Volume (24h) (CSV)

Request URL with curl:

```bash
curl 'https://api.coinmarketcap.com/data-api/v3/global-metrics/spot/chart?range=24h&convertId=2781' \
  -H 'accept: application/json, text/plain, */*' \
  -H 'accept-language: en-US,en;q=0.9' \
  -H 'cache-control: no-cache' \
  -H 'origin: https://coinmarketcap.com' \
  -H 'platform: web' \
  -H 'priority: u=1, i' \
  -H 'referer: https://coinmarketcap.com/' \
  -H 'sec-ch-ua: "Not)A;Brand";v="8", "Chromium";v="138", "Google Chrome";v="138"' \
  -H 'sec-ch-ua-mobile: ?0' \
  -H 'sec-ch-ua-platform: "macOS"' \
  -H 'sec-fetch-dest: empty' \
  -H 'sec-fetch-mode: cors' \
  -H 'sec-fetch-site: same-site' \
  -H 'user-agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/138.0.0.0 Safari/537.36' \
  -H 'x-request-id: a9b3c736c69c4a87a9ba65f779441785'
```

The response is a JSON object with the following structure:

```json
{
  "data": {
    "points": [
      {
        "totalVolume": 827756819225.76,
        "cexVolume": 815370962488.68,
        "cexPercentage": 99.00,
        "dexVolume": 12385856737.08,
        "dexPercentage": 1.00,
        "timestamp": "1752526200"
      },
      ...
      {
        "totalVolume": 866029794170.38,
        "cexVolume": 842640106191.90,
        "cexPercentage": 97.00,
        "dexVolume": 23389687978.48,
        "dexPercentage": 3.00,
        "timestamp": "1752612600"
      }
    ],
    "overView": {
      "cexVolume": 842640106191.90,
      "cexChg": 3.00,
      "cexPercentage": 97.00,
      "dexVolume": 23389687978.48,
      "dexChg": 89.00,
      "dexPercentage": 3.00
    }
  },
  "status": {
    "timestamp": "2025-07-15T20:53:00.680Z",
    "error_code": "0",
    "error_message": "SUCCESS",
    "elapsed": "25",
    "credit_count": 0
  }
}
```