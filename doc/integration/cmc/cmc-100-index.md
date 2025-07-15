# CoinMarketCap 100 Index

Request URL with curl:

```bash
curl 'https://api.coinmarketcap.com/data-api/v3/top100/historical/chart?range=all' \
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
  -H 'x-request-id: 819d85ca4c5b48f6b7a16c1fe2164599'
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
          "timestamp": "1704067200",
          "points": [
            {
              "cryptoId": 1,
              "name": "Bitcoin",
              "slug": "bitcoin",
              "symbol": "BTC",
              "weight": 56.38
            },
            {
              "cryptoId": 1027,
              "name": "Ethereum",
              "slug": "ethereum",
              "symbol": "ETH",
              "weight": 18.67
            },
            {
              "cryptoId": 52,
              "name": "XRP",
              "slug": "xrp",
              "symbol": "XRP",
              "weight": 2.27
            },
            {
              "cryptoId": 1839,
              "name": "BNB",
              "slug": "bnb",
              "symbol": "BNB",
              "weight": 3.23
            },
            {
              "cryptoId": 5426,
              "name": "Solana",
              "slug": "solana",
              "symbol": "SOL",
              "weight": 2.97
            },
            {
              "cryptoId": 74,
              "name": "Dogecoin",
              "slug": "dogecoin",
              "symbol": "DOGE",
              "weight": 0.87
            },
            {
              "cryptoId": 1958,
              "name": "TRON",
              "slug": "tron",
              "symbol": "TRX",
              "weight": 0.65
            },
            {
              "cryptoId": 2010,
              "name": "Cardano",
              "slug": "cardano",
              "symbol": "ADA",
              "weight": 1.43
            },
            {
              "cryptoId": 32196,
              "name": "Hyperliquid",
              "slug": "hyperliquid",
              "symbol": "HYPE"
            },
            {
              "cryptoId": 512,
              "name": "Stellar",
              "slug": "stellar",
              "symbol": "XLM",
              "weight": 0.25
            },
            {
              "cryptoId": 0,
              "name": "Others",
              "slug": "others",
              "symbol": "OTHERS",
              "weight": 13.28
            }
          ]
        },
        ...
        {
          "timestamp": "1752519000",
          "points": [
            {
              "cryptoId": 1,
              "name": "Bitcoin",
              "slug": "bitcoin",
              "symbol": "BTC",
              "weight": 69.18
            },
            {
              "cryptoId": 1027,
              "name": "Ethereum",
              "slug": "ethereum",
              "symbol": "ETH",
              "weight": 10.52
            },
            {
              "cryptoId": 52,
              "name": "XRP",
              "slug": "xrp",
              "symbol": "XRP",
              "weight": 5.04
            },
            {
              "cryptoId": 1839,
              "name": "BNB",
              "slug": "bnb",
              "symbol": "BNB",
              "weight": 2.80
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
              "weight": 0.87
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
              "weight": 0.76
            },
            {
              "cryptoId": 32196,
              "name": "Hyperliquid",
              "slug": "hyperliquid",
              "symbol": "HYPE",
              "weight": 0.46
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
              "weight": 6.58
            }
          ]
        }
      ]
    },
    "values": [
      {
        "timestamp": "1704067200",
        "value": 100.00
      },
      ...
      {
        "timestamp": "1752519000",
        "value": 232.05
      }
    ]
  },
  "status": {
    "timestamp": "2025-07-14T18:50:59.840Z",
    "error_code": "0",
    "error_message": "SUCCESS",
    "elapsed": "98",
    "credit_count": 0
  }
}
```