# Crypto Market Cycle Indicators

## Crypto Market Cycle Top Indicators

Request URL with curl:

```bash
curl 'https://api.coinmarketcap.com/data-api/v3/market-cycles/indicators?convertId=2781&sortBy=index&sortType=asc' \
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
  -H 'x-request-id: 1cc828a6d49a4a8e98e299e658ea4b3f'
```

The response is a JSON object with the following structure:

```json
{
  "data": {
    "indicators": [
      {
        "indicatorName": "Bitcoin Ahr999 Index",
        "time": "1752516000000",
        "currentValue": "1.26",
        "targetValue": "4",
        "comparisonType": ">=",
        "percentChange24h": 3.27868852459000,
        "hitStatus": false,
        "index": 1
      },
      ...
      {
        "indicatorName": "Smithson's Bitcoin Price Forecast",
        "time": "1752516000000",
        "currentValue": "123020.55",
        "targetValue": "175000.00",
        "comparisonType": ">=",
        "percentChange24h": 4.44616737682400,
        "hitStatus": false,
        "index": 30
      }
    ],
    "totalHitCount": 30,
    "triggeredCount": 0
  },
  "status": {
    "timestamp": "2025-07-14T18:25:28.156Z",
    "error_code": "0",
    "error_message": "SUCCESS",
    "elapsed": "2",
    "credit_count": 0
  }
}
```

## Market Cycle Latest

Request URL with curl:

```bash
curl 'https://api.coinmarketcap.com/data-api/v3/market-cycles/latest?convertId=2781' \
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
  -H 'x-request-id: ceaff5b5c71b4feebb2b8909385dfd07'
```

The response is a JSON object with the following structure:

```json
{
  "data": {
    "puellMultiple": 1.398919650302141,
    "piCycleTop": {
      "ma110": 98696.95,
      "ma350mu2": 172988.74
    },
    "likelihood": {
      "totalCount": 30,
      "holdCount": 30,
      "sellCount": 0
    }
  },
  "status": {
    "timestamp": "2025-07-14T18:23:14.813Z",
    "error_code": "0",
    "error_message": "SUCCESS",
    "elapsed": "1",
    "credit_count": 0
  }
}
```

## Puell Multiple All

Request URL with curl:

```bash
curl 'https://api.coinmarketcap.com/data-api/v3/market-cycles/puell-multiple?range=ALL&convertId=2781' \
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
  -H 'x-request-id: 21afe356b46c4fabbe801a353b9d1e43'
```

The response is a JSON object with the following structure:

```json
{
  "data": {
    "points": [
      {
        "puellMultiple": 1,
        "btcUsdPrice": 0.09,
        "timestamp": "1282003200000"
      },
      ...
      {
        "puellMultiple": 1.2454655306221762,
        "btcUsdPrice": 108298.23,
        "timestamp": "1751932800000"
      }
    ]
  },
  "status": {
    "timestamp": "2025-07-14T18:25:28.181Z",
    "error_code": "0",
    "error_message": "SUCCESS",
    "elapsed": "2",
    "credit_count": 0
  }
}
```

## Pi Cycle Top Indicator

Request URL with curl:

```bash
curl 'https://api.coinmarketcap.com/data-api/v3/market-cycles/pi-cycle-top?range=ALL&convertId=2781' \
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
  -H 'x-request-id: e1427cc59eeb40e69b066268c04c1fb9'
```

The response is a JSON object with the following structure:

```json
{
  "data": {
    "points": [
      {
        "ma110": 0.07,
        "ma350mu2": 0.14,
        "price": 0.09,
        "timestamp": "1282003200000"
      },
      ...
      {
        "ma110": 97863.14,
        "ma350mu2": 172157.01,
        "price": 108298.23,
        "timestamp": "1751932800000"
      }
    ]
  },
  "status": {
    "timestamp": "2025-07-14T18:23:15.191Z",
    "error_code": "0",
    "error_message": "SUCCESS",
    "elapsed": "3",
    "credit_count": 0
  }
}
```

## Bitcoin Rainbow Price Chart Indicator

Request URL with curl:

```bash
curl 'https://api.coinmarketcap.com/data-api/v3/market-cycles/rainbow?range=all&convertId=2781' \
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
  -H 'x-request-id: e7debb8ba3b44c0c90f2baf4fa46895f'
```

The response is a JSON object with the following structure:

```json
{
  "data": {
    "points": [
      {
        "layers": [
          0.03,
          0.04,
          0.06,
          0.08,
          0.11,
          0.15,
          0.21,
          0.28,
          0.38,
          0.52
        ],
        "btcUsdPrice": 0.09,
        "timestamp": "1282003200000"
      },
      ...
      {
        "layers": [
          67773.43,
          90319.01,
          122761.48,
          168526.94,
          227511.37,
          307140.35,
          421966.00,
          581002.42,
          779971.35,
          1060990.03
        ],
        "timestamp": "1773705600000"
      }
    ]
  },
  "status": {
    "timestamp": "2025-07-14T18:26:44.159Z",
    "error_code": "0",
    "error_message": "SUCCESS",
    "elapsed": "3",
    "credit_count": 0
  }
}
```