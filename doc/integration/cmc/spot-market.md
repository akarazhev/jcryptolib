# Spot Market

## Crypto Spot Volume (24h)

Request URL with curl:

```bash
curl 'https://api.coinmarketcap.com/data-api/v3/global-metrics/spot/chart?range=ALL&convertId=2781' \
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
  -H 'x-request-id: d6ee9f6d2fda46cca1d71c485a899c56'
```

The response is a JSON object with the following structure:

```json
{
  "data": {
    "points": [
      {
        "totalVolume": 28786726352.22,
        "cexVolume": 27900359182.27,
        "cexPercentage": 97.00,
        "dexVolume": 886367169.95,
        "dexPercentage": 3.00,
        "timestamp": "1690156800"
      },
      ...
      {
        "totalVolume": 355234988342.78,
        "cexVolume": 345776382847.13,
        "cexPercentage": 97.00,
        "dexVolume": 9458605495.65,
        "dexPercentage": 3.00,
        "timestamp": "1752451200"
      }
    ],
    "overView": {
      "cexVolume": 345776382847.13,
      "cexChg": 1139.00,
      "cexPercentage": 97.00,
      "dexVolume": 9458605495.65,
      "dexChg": 967.00,
      "dexPercentage": 3.00
    }
  },
  "status": {
    "timestamp": "2025-07-14T19:21:37.017Z",
    "error_code": "0",
    "error_message": "SUCCESS",
    "elapsed": "2",
    "credit_count": 0
  }
}
```

## CEX Spot Volume (24h)

Request URL with curl:

```bash
curl 'https://api.coinmarketcap.com/data-api/v3/global-metrics/exchange-spot/chart?range=ALL&convertId=2781&exchangeType=cex' \
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
  -H 'x-request-id: f97ffc2c11aa483cbf8030f5783a45c8'
```

The response is a JSON object with the following structure:

```json
{
  "data": {
    "points": [
      {
        "timestamp": "1690156800",
        "details": [
          {
            "name": "Binance",
            "volume": 4586915577.62,
            "percentage": 36.00
          },
          {
            "name": "Coinbase Exchange",
            "volume": 568034576.70,
            "percentage": 4.00
          },
          {
            "name": "Bybit",
            "volume": 441527111.35,
            "percentage": 3.00
          },
          {
            "name": "OKX",
            "volume": 532041802.57,
            "percentage": 4.00
          },
          {
            "name": "Crypto.com Exchange",
            "volume": 50802949.51,
            "percentage": 0.00
          },
          {
            "name": "Upbit",
            "volume": 2281555624.59,
            "percentage": 18.00
          },
          {
            "name": "MEXC",
            "volume": 378425047.48,
            "percentage": 3.00
          },
          {
            "name": "Gate",
            "volume": 369900911.86,
            "percentage": 3.00
          },
          {
            "name": "Bitfinex",
            "volume": 41791597.81,
            "percentage": 0.00
          },
          {
            "name": "KuCoin",
            "volume": 304003910.79,
            "percentage": 2.00
          },
          {
            "name": "Bitget",
            "volume": 392986183.60,
            "percentage": 3.00
          },
          {
            "name": "BingX",
            "volume": 172516346.12,
            "percentage": 1.00
          },
          {
            "name": "HTX",
            "volume": 937664030.60,
            "percentage": 7.00
          },
          {
            "name": "Binance TR",
            "volume": 88078472.22,
            "percentage": 1.00
          },
          {
            "name": "Bitstamp",
            "volume": 58266450.67,
            "percentage": 0.00
          },
          {
            "name": "BitMart",
            "volume": 395139428.71,
            "percentage": 3.00
          },
          {
            "name": "Kraken",
            "volume": 158894608.52,
            "percentage": 1.00
          },
          {
            "name": "LBank",
            "volume": 445506220.12,
            "percentage": 3.00
          },
          {
            "name": "Bithumb",
            "volume": 166723130.84,
            "percentage": 1.00
          },
          {
            "name": "XT.COM",
            "volume": 463694859.78,
            "percentage": 7.00
          }
        ]
      },
      ...
      {
        "timestamp": "1752451200",
        "details": [
          {
            "name": "Binance",
            "volume": 15555646527.67,
            "percentage": 30.00
          },
          {
            "name": "Coinbase Exchange",
            "volume": 2352311439.74,
            "percentage": 4.00
          },
          {
            "name": "Bybit",
            "volume": 2881777362.88,
            "percentage": 6.00
          },
          {
            "name": "OKX",
            "volume": 2372446889.87,
            "percentage": 5.00
          },
          {
            "name": "Crypto.com Exchange",
            "volume": 1789400368.43,
            "percentage": 3.00
          },
          {
            "name": "Upbit",
            "volume": 3544393413.51,
            "percentage": 7.00
          },
          {
            "name": "MEXC",
            "volume": 3829066315.95,
            "percentage": 7.00
          },
          {
            "name": "Gate",
            "volume": 3231332562.78,
            "percentage": 6.00
          },
          {
            "name": "Bitfinex",
            "volume": 114063995.55,
            "percentage": 0.00
          },
          {
            "name": "KuCoin",
            "volume": 1382959876.33,
            "percentage": 3.00
          },
          {
            "name": "Bitget",
            "volume": 2728649539.27,
            "percentage": 5.00
          },
          {
            "name": "BingX",
            "volume": 339877836.73,
            "percentage": 1.00
          },
          {
            "name": "HTX",
            "volume": 3038952092.49,
            "percentage": 6.00
          },
          {
            "name": "Binance TR",
            "volume": 305139295.24,
            "percentage": 1.00
          },
          {
            "name": "Bitstamp",
            "volume": 276066448.77,
            "percentage": 1.00
          },
          {
            "name": "BitMart",
            "volume": 1648023707.34,
            "percentage": 3.00
          },
          {
            "name": "Kraken",
            "volume": 968537858.79,
            "percentage": 2.00
          },
          {
            "name": "LBank",
            "volume": 3026648978.13,
            "percentage": 6.00
          },
          {
            "name": "Bithumb",
            "volume": 1562722190.79,
            "percentage": 3.00
          },
          {
            "name": "XT.COM",
            "volume": 1355160692.58,
            "percentage": 1.00
          }
        ]
      }
    ]
  },
  "status": {
    "timestamp": "2025-07-14T19:21:37.017Z",
    "error_code": "0",
    "error_message": "SUCCESS",
    "elapsed": "4",
    "credit_count": 0
  }
}
```

## DEX Spot Volume (24h)

Request URL with curl:

```bash
curl 'https://api.coinmarketcap.com/data-api/v3/global-metrics/exchange-spot/chart?range=ALL&convertId=2781&exchangeType=dex' \
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
  -H 'x-request-id: 06d7c5ccc74a4352a63e27316c371c25'
```

The response is a JSON object with the following structure:

```json
{
  "data": {
    "points": [
      {
        "timestamp": "1690156800",
        "details": [
          {
            "name": "Uniswap v2",
            "volume": 111763915.55,
            "percentage": 17.00
          },
          {
            "name": "Raydium",
            "volume": 1673226.47,
            "percentage": 0.00
          },
          {
            "name": "Uniswap v3 (Ethereum)",
            "volume": 244489570.50,
            "percentage": 38.00
          },
          {
            "name": "PancakeSwap v3 (BSC)",
            "volume": 37182975.18,
            "percentage": 6.00
          },
          {
            "name": "Curve (Ethereum)",
            "volume": 34514405.42,
            "percentage": 5.00
          },
          {
            "name": "Uniswap v3 (Arbitrum)",
            "volume": 104397875.32,
            "percentage": 16.00
          },
          {
            "name": "Uniswap v3 (Polygon)",
            "volume": 26160165.64,
            "percentage": 4.00
          },
          {
            "name": "Uniswap v3 (Optimism)",
            "volume": 19678225.07,
            "percentage": 3.00
          },
          {
            "name": "Osmosis",
            "volume": 1808534.90,
            "percentage": 0.00
          },
          {
            "name": "PancakeSwap v2 (BSC)",
            "volume": 27857943.07,
            "percentage": 4.00
          },
          {
            "name": "Orca",
            "volume": 8418451.55,
            "percentage": 1.00
          },
          {
            "name": "Balancer v2 (Ethereum)",
            "volume": 5630148.06,
            "percentage": 1.00
          },
          {
            "name": "THORChain",
            "volume": 4729607.71,
            "percentage": 1.00
          },
          {
            "name": "SushiSwap (Ethereum)",
            "volume": 3124822.69,
            "percentage": 0.00
          },
          {
            "name": "Bancor Network",
            "volume": 129134.99,
            "percentage": 0.00
          },
          {
            "name": "LFJ (Avalanche)",
            "volume": 1087034.07,
            "percentage": 0.00
          },
          {
            "name": "LFJ v2.1 (Avalanche)",
            "volume": 13987792.60,
            "percentage": 2.00
          },
          {
            "name": "SpookySwap",
            "volume": 1686497.19,
            "percentage": 0.00
          },
          {
            "name": "Pangolin",
            "volume": 306513.19,
            "percentage": 0.00
          },
          {
            "name": "SushiSwap (Polygon)",
            "volume": 1004490.99,
            "percentage": 2.00
          }
        ]
      },
      ...
      {
        "timestamp": "1752451200",
        "details": [
          {
            "name": "Uniswap v2",
            "volume": 72419154.89,
            "percentage": 1.00
          },
          {
            "name": "Raydium",
            "volume": 66102178.30,
            "percentage": 1.00
          },
          {
            "name": "Uniswap v3 (Ethereum)",
            "volume": 161150070.43,
            "percentage": 3.00
          },
          {
            "name": "PancakeSwap v3 (BSC)",
            "volume": 5299779810.09,
            "percentage": 85.00
          },
          {
            "name": "Curve (Ethereum)",
            "volume": 97498792.30,
            "percentage": 2.00
          },
          {
            "name": "Uniswap v3 (Arbitrum)",
            "volume": 78177664.65,
            "percentage": 1.00
          },
          {
            "name": "Uniswap v3 (Polygon)",
            "volume": 12298786.77,
            "percentage": 0.00
          },
          {
            "name": "Uniswap v3 (Optimism)",
            "volume": 3424743.11,
            "percentage": 0.00
          },
          {
            "name": "Osmosis",
            "volume": 5198991.77,
            "percentage": 0.00
          },
          {
            "name": "PancakeSwap v2 (BSC)",
            "volume": 44799067.57,
            "percentage": 1.00
          },
          {
            "name": "Orca",
            "volume": 365242381.17,
            "percentage": 6.00
          },
          {
            "name": "Balancer v2 (Ethereum)",
            "volume": 5973387.69,
            "percentage": 0.00
          },
          {
            "name": "THORChain",
            "volume": 43736189.71,
            "percentage": 1.00
          },
          {
            "name": "SushiSwap (Ethereum)",
            "volume": 1123165.42,
            "percentage": 0.00
          },
          {
            "name": "Bancor Network",
            "volume": 149186.86,
            "percentage": 0.00
          },
          {
            "name": "LFJ (Avalanche)",
            "volume": 847279.97,
            "percentage": 0.00
          },
          {
            "name": "LFJ v2.1 (Avalanche)",
            "volume": 3674138.71,
            "percentage": 0.00
          },
          {
            "name": "SpookySwap",
            "volume": 11759.04,
            "percentage": 0.00
          },
          {
            "name": "Pangolin",
            "volume": 153697.94,
            "percentage": 0.00
          },
          {
            "name": "SushiSwap (Polygon)",
            "volume": 79395.82,
            "percentage": -1.00
          }
        ]
      }
    ]
  },
  "status": {
    "timestamp": "2025-07-14T19:21:49.635Z",
    "error_code": "0",
    "error_message": "SUCCESS",
    "elapsed": "4",
    "credit_count": 0
  }
}
```