# CoinMarketCap 100 Index (CMC100)

Request URL with curl:

```bash
curl 'https://api.coinmarketcap.com/data-api/v3/top100/historical/chart?range=24h' \
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
  -H 'x-request-id: 84728ca380b840dda5501e24d9460948'
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