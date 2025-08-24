# Spot Market

## Crypto Spot Volume (24h) (CSV)

Request URL with curl:

```text
GET /data-api/v3/global-metrics/spot/chart?range=24h&convertId=2781 HTTP/2

Accept: text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8
Accept-Language: en-US,en;q=0.5
Cache-Control: no-cache
Origin: https://coinmarketcap.com/
Platform: web
Priority: u=0, i
Referer: https://coinmarketcap.com/
Sec-Fetch-Dest: document
Sec-Fetch-Mode: navigate
Sec-Fetch-Site: none
Sec-Fetch-User: ?1
TE: trailers
Upgrade-Insecure-Requests: 1
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10.15; rv:140.0) "Gecko/20100101 Firefox/140.0
x-request-id: [X-Request-ID]
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

List of parameters to parse:

- `points` - an array of objects with the following structure:
    - `timestamp` - the timestamp of the data point
    - `totalVolume` - the total volume of the data point
    - `cexVolume` - the CEX volume of the data point
    - `cexPercentage` - the CEX percentage of the data point
    - `dexVolume` - the DEX volume of the data point
    - `dexPercentage` - the DEX percentage of the data point
- `overView` - an object with the following structure:
    - `cexVolume` - the CEX volume of the data point
    - `cexChg` - the CEX change of the data point
    - `cexPercentage` - the CEX percentage of the data point
    - `dexVolume` - the DEX volume of the data point
    - `dexChg` - the DEX change of the data point
    - `dexPercentage` - the DEX percentage of the data point