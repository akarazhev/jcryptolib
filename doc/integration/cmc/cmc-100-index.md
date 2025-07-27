# CMC100 Index

API endpoints for CoinMarketCap100 Index. This category currently includes 2 endpoints:

- /v3/index/cmc100-latest - Latest CoinMarketCap 100 Index
- /v3/index/cmc100-historical - Historical CoinMarketCap 100 Index

## CoinMarketCap 100 Index Historical (CMC100H)

## CoinMarketCap 100 Index Latest (CMC100L)

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

## CoinMarketCap 100 Index (CMC100)

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
        {
          "id": 1027,
          "name": "Ethereum",
          "slug": "ethereum",
          "symbol": "ETH"
        },
        {
          "id": 52,
          "name": "XRP",
          "slug": "xrp",
          "symbol": "XRP"
        },
        {
          "id": 1839,
          "name": "BNB",
          "slug": "bnb",
          "symbol": "BNB"
        },
        {
          "id": 5426,
          "name": "Solana",
          "slug": "solana",
          "symbol": "SOL"
        },
        {
          "id": 74,
          "name": "Dogecoin",
          "slug": "dogecoin",
          "symbol": "DOGE"
        },
        {
          "id": 1958,
          "name": "TRON",
          "slug": "tron",
          "symbol": "TRX"
        },
        {
          "id": 2010,
          "name": "Cardano",
          "slug": "cardano",
          "symbol": "ADA"
        },
        {
          "id": 32196,
          "name": "Hyperliquid",
          "slug": "hyperliquid",
          "symbol": "HYPE"
        },
        {
          "id": 512,
          "name": "Stellar",
          "slug": "stellar",
          "symbol": "XLM"
        },
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
            {
              "cryptoId": 1027,
              "name": "Ethereum",
              "slug": "ethereum",
              "symbol": "ETH",
              "weight": 10.51
            },
            {
              "cryptoId": 52,
              "name": "XRP",
              "slug": "xrp",
              "symbol": "XRP",
              "weight": 5.03
            },
            {
              "cryptoId": 1839,
              "name": "BNB",
              "slug": "bnb",
              "symbol": "BNB",
              "weight": 2.79
            },
            {
              "cryptoId": 5426,
              "name": "Solana",
              "slug": "solana",
              "symbol": "SOL",
              "weight": 2.55
            },
            {
              "cryptoId": 74,
              "name": "Dogecoin",
              "slug": "dogecoin",
              "symbol": "DOGE",
              "weight": 0.86
            },
            {
              "cryptoId": 1958,
              "name": "TRON",
              "slug": "tron",
              "symbol": "TRX",
              "weight": 0.83
            },
            {
              "cryptoId": 2010,
              "name": "Cardano",
              "slug": "cardano",
              "symbol": "ADA",
              "weight": 0.75
            },
            {
              "cryptoId": 32196,
              "name": "Hyperliquid",
              "slug": "hyperliquid",
              "symbol": "HYPE",
              "weight": 0.45
            },
            {
              "cryptoId": 512,
              "name": "Stellar",
              "slug": "stellar",
              "symbol": "XLM",
              "weight": 0.41
            },
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
            {
              "cryptoId": 1027,
              "name": "Ethereum",
              "slug": "ethereum",
              "symbol": "ETH",
              "weight": 10.94
            },
            {
              "cryptoId": 52,
              "name": "XRP",
              "slug": "xrp",
              "symbol": "XRP",
              "weight": 5.08
            },
            {
              "cryptoId": 1839,
              "name": "BNB",
              "slug": "bnb",
              "symbol": "BNB",
              "weight": 2.82
            },
            {
              "cryptoId": 5426,
              "name": "Solana",
              "slug": "solana",
              "symbol": "SOL",
              "weight": 2.56
            },
            {
              "cryptoId": 74,
              "name": "Dogecoin",
              "slug": "dogecoin",
              "symbol": "DOGE",
              "weight": 0.86
            },
            {
              "cryptoId": 1958,
              "name": "TRON",
              "slug": "tron",
              "symbol": "TRX",
              "weight": 0.84
            },
            {
              "cryptoId": 2010,
              "name": "Cardano",
              "slug": "cardano",
              "symbol": "ADA",
              "weight": 0.77
            },
            {
              "cryptoId": 32196,
              "name": "Hyperliquid",
              "slug": "hyperliquid",
              "symbol": "HYPE",
              "weight": 0.47
            },
            {
              "cryptoId": 512,
              "name": "Stellar",
              "slug": "stellar",
              "symbol": "XLM",
              "weight": 0.41
            },
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