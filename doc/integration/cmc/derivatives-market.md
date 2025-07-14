# Derivatives Market

## Open Interest

Request URL with curl:

```bash
curl 'https://api.coinmarketcap.com/data-api/v4/open-interest/chart?range=ALL&convertId=2781' \
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
  -H 'x-request-id: fa8b824cb40541ea908d3dfb50298819'
```

The response is a JSON object with the following structure:

```json
{
  "data": {
    "points": [
      {
        "futures": 1282534429.93,
        "perpetuals": 111650166618.06,
        "marketcap": 1054114116355.40,
        "timestamp": "1694995200"
      },
      ...
      {
        "futures": 4233937628.19,
        "perpetuals": 753700393736.02,
        "cex": 49.60,
        "dex": 50.40,
        "marketcap": 3716211159114.99,
        "timestamp": "1752451200"
      }
    ],
    "overview": {
      "cex": {
        "value": 779926171347.20,
        "percentage": 49.60,
        "chg": -1.72
      },
      "dex": {
        "value": 800799454722.32,
        "percentage": 50.40,
        "chg": 1.76
      },
      "marketcap": {
        "value": 3738538091884.00,
        "chg": 252.54
      }
    }
  },
  "status": {
    "timestamp": "2025-07-14T20:08:44.482Z",
    "error_code": "0",
    "error_message": "SUCCESS",
    "elapsed": "2",
    "credit_count": 0
  }
}
```

## Derivatives Volume

Request URL with curl:

```bash
curl 'https://api.coinmarketcap.com/data-api/v4/derivatives/chart?range=ALL&convertId=2781' \
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
  -H 'x-request-id: 1591fac10b884b17b716c1ee4b36665f'
```

The response is a JSON object with the following structure:

```json
{
  "data": {
    "overview": {
      "futures": {
        "value": 1401568943.85,
        "chg": -14.58
      },
      "perpetuals": {
        "value": 1830281197964.13,
        "chg": 758.02
      },
      "marketcap": {
        "value": 3734182401874.80,
        "chg": 208.89
      },
      "cex": {
        "value": 808833016728.26,
        "percentage": 97.34,
        "chg": 0.43
      },
      "dex": {
        "value": 12306420995.58,
        "percentage": 2.66,
        "chg": -13.64
      }
    },
    "points": [
      {
        "futures": 544987382.95,
        "perpetuals": 121438904268.40,
        "cex": 96.92,
        "dex": 3.08,
        "marketcap": 1203080973493.21,
        "timestamp": "1690156800"
      },
      ...
      {
        "futures": 465535977.34,
        "perpetuals": 1041964134203.85,
        "cex": 97.34,
        "dex": 2.66,
        "marketcap": 3716211159114.99,
        "timestamp": "1752451200"
      }
    ]
  },
  "status": {
    "timestamp": "2025-07-14T20:14:59.089Z",
    "error_code": "0",
    "error_message": "SUCCESS",
    "elapsed": "2",
    "credit_count": 0
  }
}
```

## Funding Rates

Request URL with curl:

```bash
curl 'https://api.coinmarketcap.com/data-api/v3/funding-rate/chart?range=30d&convertId=2781' \
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
  -H 'x-request-id: 2825a91f4f03438b9ebadff55003f35e'
```

The response is a JSON object with the following structure:

```json
{
  "data": {
    "coins": [
      {
        "coinId": 1,
        "coinName": "Bitcoin",
        "coinSlug": "bitcoin"
      },
      ...
      {
        "coinId": 1376,
        "coinName": "Neo",
        "coinSlug": "neo"
      }
    ],
    "points": [
      {
        "marketcap": 3252593398321.96,
        "marketFundingRate": 0.003735854538514300,
        "cryptoFundingRate": 0.003231241107527500,
        "timestamp": "1749931200"
      },
      ...
      {
        "marketcap": 3740916444455.31,
        "marketFundingRate": 0.010321448040446700,
        "cryptoFundingRate": 0.010672866751565400,
        "timestamp": "1752523200"
      }
    ]
  },
  "status": {
    "timestamp": "2025-07-14T20:11:07.582Z",
    "error_code": "0",
    "error_message": "SUCCESS",
    "elapsed": "3",
    "credit_count": 0
  }
}
```

## Funding Rates

Request URL with curl:

```bash
curl 'https://api.coinmarketcap.com/data-api/v3/funding-rate/top-coins' \
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
  -H 'x-request-id: 15c8c8bc9b4e4e72a1d4d492ac608ce1'
```

The response is a JSON object with the following structure:

```json
{
  "data": {
    "topCoins": [
      {
        "coinId": 2087,
        "coinName": "KuCoin Token",
        "coinSlug": "kucoin-token",
        "coinSymbol": "KCS",
        "fundingRate": 0.062600
      },
      ...
      {
        "coinId": 32196,
        "coinName": "Hyperliquid",
        "coinSlug": "hyperliquid",
        "coinSymbol": "HYPE",
        "fundingRate": 0.023199869627480600
      }
    ],
    "bottomCoins": [
      {
        "coinId": 16086,
        "coinName": "BitTorrent [New]",
        "coinSlug": "bittorrent-new",
        "coinSymbol": "BTT",
        "fundingRate": -0.073639024532008600
      },
      ...
      {
        "coinId": 1839,
        "coinName": "BNB",
        "coinSlug": "bnb",
        "coinSymbol": "BNB",
        "fundingRate": 0.00100922245061600
      }
    ],
    "allCoins": [
      {
        "coinId": 1027,
        "coinName": "Ethereum",
        "coinSlug": "ethereum",
        "coinSymbol": "ETH",
        "fundingRate": 0.008620346332209400
      },
      ...
      {
        "coinId": 23095,
        "coinName": "Bonk",
        "coinSlug": "bonk1",
        "coinSymbol": "BONK",
        "fundingRate": 0.058775135229671800
      }
    ],
    "time": "1752523500"
  },
  "status": {
    "timestamp": "2025-07-14T20:16:07.789Z",
    "error_code": "0",
    "error_message": "SUCCESS",
    "elapsed": "3",
    "credit_count": 0
  }
}
```

## Volmex Implied Volatility

Request URL with curl:

```bash
curl 'https://api.coinmarketcap.com/data-api/v4/volmex-implied-volatility/chart?range=ALL&convertId=2781' \
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
  -H 'x-request-id: 97934df027ad4f9ba3420e2b72783c9d'
```

The response is a JSON object with the following structure:

```json
{
  "data": {
    "overview": {
      "marketcap": {
        "value": 3732598821777.54,
        "chg": 314.09
      },
      "bitcoin": {
        "value": 42.41083340935447,
        "chg": -44.45
      },
      "ethereum": {
        "value": 70.73556222191311,
        "chg": -28.50
      }
    },
    "points": [
      {
        "marketcap": 901399351176.46,
        "timestamp": "1655683200"
      },
      ...
      {
        "marketcap": 3732598821777.54,
        "bitcoin": 42.41083340935447,
        "ethereum": 70.73556222191311,
        "timestamp": "1752524262"
      }
    ]
  },
  "status": {
    "timestamp": "2025-07-14T20:17:42.710Z",
    "error_code": "0",
    "error_message": "SUCCESS",
    "elapsed": "150",
    "credit_count": 0
  }
}
```

## CEX/DEX Derivatives Volume (24h)

Request URL with curl:

```bash
curl 'https://api.coinmarketcap.com/data-api/v4/derivatives/chart?range=ALL&convertId=2781' \
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
  -H 'x-request-id: 1471ef86a4484b1fa91358b9ec0d0a3d'
```

The response is a JSON object with the following structure:

```json
{
  "data": {
    "overview": {
      "futures": {
        "value": 1401568943.85,
        "chg": -14.58
      },
      "perpetuals": {
        "value": 1830281197964.13,
        "chg": 758.02
      },
      "marketcap": {
        "value": 3734182401874.80,
        "chg": 208.89
      },
      "cex": {
        "value": 808833016728.26,
        "percentage": 97.34,
        "chg": 0.43
      },
      "dex": {
        "value": 12306420995.58,
        "percentage": 2.66,
        "chg": -13.64
      }
    },
    "points": [
      {
        "futures": 544987382.95,
        "perpetuals": 121438904268.40,
        "cex": 96.92,
        "dex": 3.08,
        "marketcap": 1203080973493.21,
        "timestamp": "1690156800"
      },
      ...
      {
        "futures": 465535977.34,
        "perpetuals": 1041964134203.85,
        "cex": 97.34,
        "dex": 2.66,
        "marketcap": 3716211159114.99,
        "timestamp": "1752451200"
      }
    ]
  },
  "status": {
    "timestamp": "2025-07-14T20:14:59.089Z",
    "error_code": "0",
    "error_message": "SUCCESS",
    "elapsed": "2",
    "credit_count": 0
  }
}
```