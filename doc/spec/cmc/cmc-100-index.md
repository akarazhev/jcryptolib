# CoinMarketCap100 Index

API endpoints for CoinMarketCap100 Index. This category currently includes 2 endpoints:

- /v3/index/cmc100-latest - Latest CoinMarketCap 100 Index
- /v3/index/cmc100-historical - Historical CoinMarketCap 100 Index

## CoinMarketCap 100 Index Api Pro Latest (CMC100_API_PRO_L)

Request API with headers:

```text
GET /v3/index/cmc100-latest HTTP/3

Accept: application/json
X-CMC_PRO_API_KEY: API_KEY
```

The response is a JSON object with the following structure:

```json
{
  "data": {
    "value": 240.28,
    "constituents": [
      {
        "weight": 65.81,
        "id": 1,
        "name": "Bitcoin",
        "symbol": "BTC",
        "url": "https://coinmarketcap.com/currencies/bitcoin"
      },
      ...
      {
        "weight": 0.02,
        "id": 8425,
        "name": "JasmyCoin",
        "symbol": "JASMY",
        "url": "https://coinmarketcap.com/currencies/jasmy"
      }
    ],
    "value_24h_percentage_change": 2.52,
    "last_update": "2025-07-26T15:20:00Z",
    "next_update": "2025-07-26T15:25:00Z"
  },
  "status": {
    "timestamp": "2025-07-26T15:23:11.465Z",
    "error_code": "0",
    "error_message": "",
    "elapsed": 3,
    "credit_count": 1
  }
}
```

List of parameters to parse:

- `value`: the value of the index
- `constituents`: an array of objects with the following structure:
    - `weight`: the weight of the constituent
    - `id`: the id of the constituent
    - `name`: the name of the constituent
    - `symbol`: the symbol of the constituent
    - `url`: the url of the constituent
- `value_24h_percentage_change`: the value of the index change in the last 24 hours
- `last_update`: the last update of the index
- `next_update`: the next update of the index

## CoinMarketCap 100 Index Api Pro Historical (CMC100_API_PRO_H)

Request API with headers:

```text
GET /v3/index/cmc100-historical HTTP/3

Accept: application/json
X-CMC_PRO_API_KEY: API_KEY
```

The response is a JSON object with the following structure:

```json
{
  "data": [
    {
      "value": 239.42,
      "constituents": [
        {
          "weight": 66.02,
          "id": 1,
          "name": "Bitcoin",
          "symbol": "BTC",
          "url": "https://coinmarketcap.com/currencies/bitcoin"
        },
        ...
        {
          "weight": 0.01,
          "id": 33824,
          "name": "Maple Finance",
          "symbol": "SYRUP",
          "url": "https://coinmarketcap.com/currencies/maple-finance"
        }
      ],
      "update_time": "2025-07-20T00:00:00Z"
    },
    ...
    {
      "value": 240.18,
      "constituents": [
        {
          "weight": 65.83,
          "id": 1,
          "name": "Bitcoin",
          "symbol": "BTC",
          "url": "https://coinmarketcap.com/currencies/bitcoin"
        },
        ...
        {
          "weight": 0.02,
          "id": 8425,
          "name": "JasmyCoin",
          "symbol": "JASMY",
          "url": "https://coinmarketcap.com/currencies/jasmy"
        }
      ],
      "update_time": "2025-07-29T00:00:00Z"
    }
  ],
  "status": {
    "timestamp": "2025-07-29T10:22:25.389Z",
    "error_code": "0",
    "error_message": "",
    "elapsed": 7,
    "credit_count": 1
  }
}
```

List of parameters to parse:

- `value`: the value of the index
- `constituents`: an array of objects with the following structure:
    - `weight`: the weight of the constituent
    - `id`: the id of the constituent
    - `name`: the name of the constituent (can be null)
    - `symbol`: the symbol of the constituent (can be null)
    - `url`: the url of the constituent (can be null)
- `update_time`: the last update of the index

## CoinMarketCap 100 Index Latest (CMC100L)

Request URL with curl:

```text
GET https://api.coinmarketcap.com/data-api/v3/top100/supplement HTTP/2

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
    "summaryData": {
      "lastRebalancingDate": "1751328000",
      "lastUpdateTimestamp": "1753864500",
      "nextUpdateTimestamp": "1753864800",
      "factsheetURL": "https://s3.coinmarketcap.com/uploads/CoinMarketCap_100_Index_Factsheet.pdf",
      "methodologyURL": "https://s3.coinmarketcap.com/uploads/CoinMarketCap_100_Index_Methodology.pdf",
      "apiDetailsURL": "https://coinmarketcap.com/api/documentation/v1/#tag/CMC100-Index",
      "moreAboutCMC100": "https://coinmarketcap.com/cmc100/",
      "description": "CMC Top100 Index",
      "currentValue": {
        "name": "Current Value",
        "value": 240.01,
        "percentChange": -1.23
      },
      "historicalValues": {
        "name": "Historical Values",
        "yesterday": 243.00,
        "lastWeek": 243.22,
        "lastMonth": 203.92
      },
      "yearlyPerformance": {
        "name": "Yearly Performance",
        "high": 246.99,
        "highTimestamp": "1753227000",
        "low": 104.86,
        "lowTimestamp": "1722839100"
      }
    }
  },
  "status": {
    "timestamp": "2025-07-30T08:41:22.290Z",
    "error_code": "0",
    "error_message": "SUCCESS",
    "elapsed": "2",
    "credit_count": 0
  }
}
```

List of parameters to parse:

- `summaryData`: an object with the following structure:
    - `currentValue`: an object with the following structure:
        - `name`: the name of the current value
        - `value`: the value of the current value
        - `percentChange`: the percent change of the current value
    - `historicalValues`: an object with the following structure:
        - `name`: the name of the historical values
        - `yesterday`: the yesterday value of the historical values
        - `lastWeek`: the last week value of the historical values
        - `lastMonth`: the last month value of the historical values
    - `yearlyPerformance`: an object with the following structure:
        - `name`: the name of the yearly performance
        - `high`: the high value of the yearly performance
        - `highTimestamp`: the high timestamp of the yearly performance
        - `low`: the low value of the yearly performance
        - `lowTimestamp`: the low timestamp of the yearly performance

## CoinMarketCap 100 Index Historical (CMC100H)

Request URL with curl:

```text
GET /data-api/v3/top100/historical/chart?range=24h HTTP/2

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
    "constituents": {
      "configs": [
        {
          "id": 1,
          "name": "Bitcoin",
          "slug": "bitcoin",
          "symbol": "BTC"
        },
        ...
        {
          "id": 0,
          "name": "Others",
          "slug": "others",
          "symbol": "OTHERS"
        }
      ],
      "points": [
        {
          "timestamp": "1752521100",
          "points": [
            {
              "cryptoId": 1,
              "name": "Bitcoin",
              "slug": "bitcoin",
              "symbol": "BTC",
              "weight": 69.25
            },
            ...
            {
              "cryptoId": 0,
              "name": "Others",
              "slug": "others",
              "symbol": "OTHERS",
              "weight": 6.57
            }
          ]
        },
        ...
        {
          "timestamp": "1752607500",
          "points": [
            {
              "cryptoId": 1,
              "name": "Bitcoin",
              "slug": "bitcoin",
              "symbol": "BTC",
              "weight": 68.51
            },
            ...
            {
              "cryptoId": 0,
              "name": "Others",
              "slug": "others",
              "symbol": "OTHERS",
              "weight": 6.74
            }
          ]
        }
      ]
    },
    "values": [
      {
        "timestamp": "1752521100",
        "value": 231.70
      },
      ...
      {
        "timestamp": "1752607500",
        "value": 228.85
      }
    ]
  },
  "status": {
    "timestamp": "2025-07-15T19:28:53.941Z",
    "error_code": "0",
    "error_message": "SUCCESS",
    "elapsed": "5",
    "credit_count": 0
  }
}
```

List of parameters to parse:

- `constituents`: an object with the following structure:
    - `configs`: an array of objects with the following structure:
        - `id`: the ID of the crypto
        - `name`: the name of the crypto
        - `slug`: the slug of the crypto
        - `symbol`: the symbol of the crypto
    - `points`: an array of objects with the following structure:
        - `timestamp`: the timestamp of the data point
        - `points`: an array of objects with the following structure:
            - `cryptoId`: the crypto ID
            - `name`: the name of the crypto
            - `slug`: the slug of the crypto
            - `symbol`: the symbol of the crypto
            - `weight`: the weight of the crypto
- `values`: an array of objects with the following structure:
    - `timestamp`: the timestamp of the data point
    - `value`: the value of the data point