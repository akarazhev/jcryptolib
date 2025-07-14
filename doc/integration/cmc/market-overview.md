# Crypto Market Overview

## Crypto Market Cap (CMC)

Request URL with curl:
```bash
curl 'https://api.coinmarketcap.com/data-api/v4/global-metrics/quotes/historical?convertId=2781&range=all' \
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
  -H 'x-request-id: 01b6e9f1c6bb43158cfc36004f3e5901'
```

The response is a JSON object with the following structure:
```json
{
  "data": {
    "points": [
      {
        "marketCap": 901399351176.46,
        "volume": 79134402796.83,
        "btcValue": 392646879629.14,
        "ethValue": 137002970321.63,
        "stableValue": 152579705252.97,
        "otherValue": 219169795972.72,
        "timestamp": "1655683200"
      },
      ...
      {
        "marketCap": 3735990911394.18,
        "volume": 293159139635.51,
        "btcValue": 2381762961466.73,
        "ethValue": 361184974943.06,
        "stableValue": 240339901964.65,
        "otherValue": 752703073019.74,
        "timestamp": "1752519805"
      }
    ],
    "historicalValues": {
      "now": {
        "marketCap": 3735990911394.175106405016889012
      },
      "yesterday": {
        "marketCap": 3659383301005.780000000000000000
      },
      "lastWeek": {
        "marketCap": 3368903740745.580000000000000000
      },
      "lastMonth": {
        "marketCap": 3303513358182.010000000000000000
      }
    },
    "yearlyPerformance": {
      "high": {
        "marketCap": 3721464308632.090000000000000000,
        "timestamp": "1734393600"
      },
      "low": {
        "marketCap": 1900955521605.020000000000000000,
        "timestamp": "1725667200"
      }
    },
    "thirtyDaysPercentage": 13.09
  },
  "status": {
    "timestamp": "2025-07-14T19:04:49.634Z",
    "error_code": "0",
    "error_message": "SUCCESS",
    "elapsed": "4",
    "credit_count": 0
  }
}
```

## Crypto ETFs Net Flow (ETF_NF)

Request URL with curl:
```bash
curl 'https://api.coinmarketcap.com/data-api/v3/etf/overview/netflow/chart?category=all&range=all' \
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
  -H 'x-request-id: 661b05cd9aa04971897da3ed0c59bda7'
```

The response is a JSON object with the following structure:
```json
{
  "data": {
    "points": [
      {
        "value": 6036200000,
        "btcValue": 6036200000,
        "ethValue": 0,
        "timestamp": "1706745600000"
      },
      ...
      {
        "value": 4459333000,
        "btcValue": 3363933000,
        "ethValue": 1095400000,
        "timestamp": "1751328000000"
      }
    ],
    "aggregation": "monthly",
    "total": 4459333000,
    "totalBtcValue": 3363933000,
    "totalEthValue": 1095400000
  },
  "status": {
    "timestamp": "2025-07-14T19:05:18.331Z",
    "error_code": "0",
    "error_message": "SUCCESS",
    "elapsed": "2",
    "credit_count": 0
  }
}
```
