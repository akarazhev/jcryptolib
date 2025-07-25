# Crypto Market Cycle Indicators

## Crypto Market Cycle Top Indicators (IND)

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

## Market Cycle Latest (MCL)

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

## Puell Multiple (PM)

Request URL with curl:

```bash
curl 'https://api.coinmarketcap.com/data-api/v3/market-cycles/puell-multiple?range=30d&convertId=2781' \
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
  -H 'x-request-id: d3f4d09fa1eb4efd8a8e5857a9f5b5aa'
```

The response is a JSON object with the following structure:

```json
{
  "data": {
    "points": [
      {
        "puellMultiple": 1.1939571467490602,
        "btcUsdPrice": 105464.84,
        "timestamp": "1749945600000"
      },
      ...
      {
        "puellMultiple": 1.3026878687829473,
        "btcUsdPrice": 117432.20,
        "timestamp": "1752364800000"
      }
    ]
  },
  "status": {
    "timestamp": "2025-07-15T17:38:13.769Z",
    "error_code": "0",
    "error_message": "SUCCESS",
    "elapsed": "2",
    "credit_count": 0
  }
}
```

## Pi Cycle Top Indicator (PCT)

Request URL with curl:

```bash
curl 'https://api.coinmarketcap.com/data-api/v3/market-cycles/pi-cycle-top?range=30d&convertId=2781' \
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
  -H 'x-request-id: bce869ca3182435aadd71835e87672ce'
```

The response is a JSON object with the following structure:

```json
{
  "data": {
    "points": [
      {
        "ma110": 93465.40,
        "ma350mu2": 166262.31,
        "price": 105464.84,
        "timestamp": "1749945600000"
      },
      ...
      {
        "ma110": 98997.22,
        "ma350mu2": 173280.53,
        "price": 117432.20,
        "timestamp": "1752364800000"
      }
    ]
  },
  "status": {
    "timestamp": "2025-07-15T17:38:17.811Z",
    "error_code": "0",
    "error_message": "SUCCESS",
    "elapsed": "1",
    "credit_count": 0
  }
}
```

## Bitcoin Rainbow Price Chart Indicator (BRPC)

Request URL with curl:

```bash
curl 'https://api.coinmarketcap.com/data-api/v3/market-cycles/rainbow?range=30d&convertId=2781' \
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
  -H 'x-request-id: 98e1902933444d1db7c65f7c6d6b30d5'
```

The response is a JSON object with the following structure:

```json
{
  "data": {
    "points": [
      {
        "layers": [
          51501.30,
          68633.77,
          93286.93,
          128064.28,
          172886.78,
          233397.16,
          320653.62,
          441506.01,
          592703.28,
          806250.47
        ],
        "btcUsdPrice": 105464.84,
        "timestamp": "1749945600000"
      },
      ...
      {
        "layers": [
          53099.32,
          70763.39,
          96181.51,
          132037.96,
          178251.25,
          240639.18,
          330603.10,
          455205.40,
          611094.13,
          831267.44
        ],
        "timestamp": "1752537600000"
      }
    ]
  },
  "status": {
    "timestamp": "2025-07-15T17:43:15.742Z",
    "error_code": "0",
    "error_message": "SUCCESS",
    "elapsed": "2",
    "credit_count": 0
  }
}
```