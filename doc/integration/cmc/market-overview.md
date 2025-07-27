# Crypto Market Overview

## Crypto Market Cap (CMC)

Request URL with curl:

```text
GET /data-api/v4/global-metrics/quotes/historical?convertId=2781&range=30d HTTP/2

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
        "marketCap": 2377311440200.79,
        "volume": 85500455679.31,
        "btcValue": 1277947163756.47,
        "ethValue": 419097090855.90,
        "stableValue": 155925212458.86,
        "otherValue": 524341973129.56,
        "timestamp": "1721088000"
      },
      ...
      {
        "marketCap": 3691550334463.82,
        "volume": 197037346658.03,
        "btcValue": 2329966374244.93,
        "ethValue": 368117038843.11,
        "stableValue": 239674273814.08,
        "otherValue": 753792647561.70,
        "timestamp": "1752598893"
      }
    ],
    "historicalValues": {
      "now": {
        "marketCap": 3691550334463.821052669948852872
      },
      "yesterday": {
        "marketCap": 3716211159114.990000000000000000
      },
      "lastWeek": {
        "marketCap": 3340490469840.170000000000000000
      },
      "lastMonth": {
        "marketCap": 3275383864728.550000000000000000
      }
    },
    "yearlyPerformance": {
      "high": {
        "marketCap": 3745815779140.900000000000000000,
        "timestamp": "1752537600"
      },
      "low": {
        "marketCap": 1900955521605.020000000000000000,
        "timestamp": "1725667200"
      }
    },
    "thirtyDaysPercentage": 12.71
  },
  "status": {
    "timestamp": "2025-07-15T17:01:33.444Z",
    "error_code": "0",
    "error_message": "SUCCESS",
    "elapsed": "125",
    "credit_count": 0
  }
}
```

## Crypto ETFs Net Flow (ETF_NF)

Request URL with curl:

```text
GET /data-api/v3/etf/overview/netflow/chart?category=all&range=30d HTTP/2

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
        "value": 455300000,
        "btcValue": 433900000,
        "ethValue": 21400000,
        "timestamp": "1750032000000"
      },
      ...
      {
        "value": 556400000,
        "btcValue": 297400000,
        "ethValue": 259000000,
        "timestamp": "1752451200000"
      }
    ],
    "aggregation": "daily",
    "total": 556400000,
    "totalBtcValue": 297400000,
    "totalEthValue": 259000000
  },
  "status": {
    "timestamp": "2025-07-15T17:01:19.357Z",
    "error_code": "0",
    "error_message": "SUCCESS",
    "elapsed": "1",
    "credit_count": 0
  }
}
```
