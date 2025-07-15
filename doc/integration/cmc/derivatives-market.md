# Derivatives Market

## Open Interest Overview (OIO)

Request URL with curl:

```bash
curl 'https://api.coinmarketcap.com/data-api/v4/open-interest/overview?convertId=2781' \
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
  -H 'x-request-id: e33193aee68d4b7b89d8a33bcd475267'
```

The response is a JSON object with the following structure:

```json
{
  "data": {
    "now": {
      "futures": {
        "openInterest": 3291345102.49,
        "chg": -22.26
      },
      "perpetuals": {
        "openInterest": 744043897453.33,
        "chg": -1.28
      }
    },
    "yesterday": {
      "futures": {
        "openInterest": 4233937628.19
      },
      "perpetuals": {
        "openInterest": 753700393736.02
      }
    },
    "lastWeek": {
      "futures": {
        "openInterest": 2672331393.56
      },
      "perpetuals": {
        "openInterest": 792536984870.91
      }
    },
    "lastMonth": {
      "futures": {
        "openInterest": 3670451633.94
      },
      "perpetuals": {
        "openInterest": 641534795132.09
      }
    },
    "yearlyHigh": {
      "futures": {
        "openInterest": 1071662508142.54,
        "timestamp": "1752192000"
      },
      "perpetuals": {
        "openInterest": 802725003382.59,
        "timestamp": "1751500800"
      }
    },
    "yearlyLow": {
      "futures": {
        "openInterest": 2328278814.33,
        "timestamp": "1751155200"
      },
      "perpetuals": {
        "openInterest": 2261040757.41,
        "timestamp": "1751068800"
      }
    }
  },
  "status": {
    "timestamp": "2025-07-15T20:23:45.140Z",
    "error_code": "0",
    "error_message": "SUCCESS",
    "elapsed": "2",
    "credit_count": 0
  }
}
```

## Open Interest (OI)

Request URL with curl:

```bash
curl 'https://api.coinmarketcap.com/data-api/v4/open-interest/chart?range=24h&convertId=2781' \
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
  -H 'x-request-id: 58bd1114e51a43ebb7a73787fc4cebec'
```

The response is a JSON object with the following structure:

```json
{
  "data": {
    "points": [
      {
        "futures": 4364123435.18,
        "perpetuals": 789492386016.47,
        "cex": 49.36,
        "dex": 50.64,
        "marketcap": 3735044507334.04,
        "timestamp": "1752524700"
      },
      ...
      {
        "futures": 4445516196.50,
        "perpetuals": 744118660594.53,
        "cex": 49.40,
        "dex": 50.60,
        "marketcap": 3672471755080.34,
        "timestamp": "1752611100"
      }
    ],
    "overview": {
      "cex": {
        "value": 734706194793.04,
        "percentage": 49.40,
        "chg": 0.08
      },
      "dex": {
        "value": 752638536363.88,
        "percentage": 50.60,
        "chg": -0.08
      },
      "marketcap": {
        "value": 3673794977237.06,
        "chg": -1.68
      }
    }
  },
  "status": {
    "timestamp": "2025-07-15T20:28:03.140Z",
    "error_code": "0",
    "error_message": "SUCCESS",
    "elapsed": "7",
    "credit_count": 0
  }
}
```

## Derivatives Volume (DV)

Request URL with curl:

```bash
curl 'https://api.coinmarketcap.com/data-api/v4/derivatives/chart?range=24h&convertId=2781' \
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
  -H 'x-request-id: 07d248d6589c4a38b406197f039f6210'
```

The response is a JSON object with the following structure:

```json
{
  "data": {
    "overview": {
      "futures": {
        "value": 1157781594.10,
        "chg": -17.50
      },
      "perpetuals": {
        "value": 1821114728089.31,
        "chg": -1.06
      },
      "marketcap": {
        "value": 3673289880643.17,
        "chg": -1.69
      },
      "cex": {
        "value": 840572449807.69,
        "percentage": 97.29,
        "chg": -1.23
      },
      "dex": {
        "value": 23386363475.96,
        "percentage": 2.71,
        "chg": 80.67
      }
    },
    "points": [
      {
        "futures": 1403455567.62,
        "perpetuals": 1840686348555.00,
        "cex": 98.50,
        "dex": 1.50,
        "marketcap": 3739240537405.96,
        "timestamp": "1752525000"
      },
      ...
      {
        "futures": 1157781594.10,
        "perpetuals": 1821114728089.31,
        "cex": 97.29,
        "dex": 2.71,
        "marketcap": 3676195436352.57,
        "timestamp": "1752611400"
      }
    ]
  },
  "status": {
    "timestamp": "2025-07-15T20:32:57.966Z",
    "error_code": "0",
    "error_message": "SUCCESS",
    "elapsed": "38",
    "credit_count": 0
  }
}
```

## Funding Rates (FR)

Request URL with curl:

```bash
curl 'https://api.coinmarketcap.com/data-api/v3/funding-rate/chart?range=24h&convertId=2781' \
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
  -H 'x-request-id: c368e83c4c2d494daef73d3cff78f501'
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
        "marketcap": 3735044507334.04,
        "marketFundingRate": 0.010084518327938900,
        "cryptoFundingRate": 0.010470880664575400,
        "timestamp": "1752524700"
      },
      ...
      {
        "marketcap": 3672471755080.34,
        "marketFundingRate": 0.010620139540791500,
        "cryptoFundingRate": 0.01186108389899900,
        "timestamp": "1752611100"
      }
    ]
  },
  "status": {
    "timestamp": "2025-07-15T20:33:04.839Z",
    "error_code": "0",
    "error_message": "SUCCESS",
    "elapsed": "3",
    "credit_count": 0
  }
}
```

## Volmex Implied Volatility (VIV)

Request URL with curl:

```bash
curl 'https://api.coinmarketcap.com/data-api/v4/volmex-implied-volatility/chart?range=24h&convertId=2781' \
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
  -H 'x-request-id: 1a3939786c7c4c61a4689db451e51c0e'
```

The response is a JSON object with the following structure:

```json
{
  "data": {
    "overview": {
      "marketcap": {
        "value": 3674709854355.57,
        "chg": -1.91
      },
      "bitcoin": {
        "value": 42.78914746905205,
        "chg": 0.82
      },
      "ethereum": {
        "value": 71.30246838773229,
        "chg": 0.77
      }
    },
    "points": [
      {
        "marketcap": 3746329035989.14,
        "bitcoin": 42.44,
        "ethereum": 70.76,
        "timestamp": "1752525600"
      },
      ...
      {
        "marketcap": 3674709854355.57,
        "bitcoin": 42.78914746905205,
        "ethereum": 71.30246838773229,
        "timestamp": "1752612122"
      }
    ]
  },
  "status": {
    "timestamp": "2025-07-15T20:42:02.619Z",
    "error_code": "0",
    "error_message": "SUCCESS",
    "elapsed": "49",
    "credit_count": 0
  }
}
```