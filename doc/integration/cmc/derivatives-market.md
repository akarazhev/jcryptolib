# Derivatives Market

## Open Interest Overview (OIO)

Request URL with curl:

```text
GET /data-api/v4/open-interest/overview?convertId=2781 HTTP/2

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

List of parameters to parse:

- `now`: an object with the following structure:
    - `futures`: an object with the following structure:
        - `openInterest`: the open interest of futures
        - `chg`: the change of open interest of futures
    - `perpetuals`: an object with the following structure:
        - `openInterest`: the open interest of perpetuals
        - `chg`: the change of open interest of perpetuals
- `yesterday`: an object with the following structure:
    - `futures`: an object with the following structure:
        - `openInterest`: the open interest of futures
    - `perpetuals`: an object with the following structure:
        - `openInterest`: the open interest of perpetuals
- `lastWeek`: an object with the following structure:
    - `futures`: an object with the following structure:
        - `openInterest`: the open interest of futures
    - `perpetuals`: an object with the following structure:
        - `openInterest`: the open interest of perpetuals
- `lastMonth`: an object with the following structure:
    - `futures`: an object with the following structure:
        - `openInterest`: the open interest of futures
    - `perpetuals`: an object with the following structure:
        - `openInterest`: the open interest of perpetuals
- `yearlyHigh`: an object with the following structure:
    - `futures`: an object with the following structure:
        - `openInterest`: the open interest of futures
        - `timestamp`: the timestamp of the open interest of futures
    - `perpetuals`: an object with the following structure:
        - `openInterest`: the open interest of perpetuals
        - `timestamp`: the timestamp of the open interest of perpetuals
- `yearlyLow`: an object with the following structure:
    - `futures`: an object with the following structure:
        - `openInterest`: the open interest of futures
        - `timestamp`: the timestamp of the open interest of futures
    - `perpetuals`: an object with the following structure:
        - `openInterest`: the open interest of perpetuals
        - `timestamp`: the timestamp of the open interest of perpetuals

## Open Interest (OI)

Request URL with curl:

```text
GET /data-api/v4/open-interest/chart?range=24h&convertId=2781 HTTP/2

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

List of parameters to parse:

- `points`: an array of objects with the following structure:
    - `futures`: the open interest of futures
    - `perpetuals`: the open interest of perpetuals
    - `cex`: the open interest of cex
    - `dex`: the open interest of dex
    - `marketcap`: the open interest of marketcap
    - `timestamp`: the timestamp of the data point
- `overview`: an object with the following structure:
    - `cex`: an object with the following structure:
        - `value`: the open interest of cex
        - `percentage`: the percentage of cex
        - `chg`: the change of cex
    - `dex`: an object with the following structure:
        - `value`: the open interest of dex
        - `percentage`: the percentage of dex
        - `chg`: the change of dex
    - `marketcap`: an object with the following structure:
        - `value`: the open interest of marketcap
        - `chg`: the change of marketcap

## Derivatives Volume (DV)

Request URL with curl:

```text
GET /data-api/v4/derivatives/chart?range=24h&convertId=2781 HTTP/2

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

List of parameters to parse:

- `points`: an array of objects with the following structure:
    - `futures`: the volume of futures
    - `perpetuals`: the volume of perpetuals
    - `cex`: the volume of cex
    - `dex`: the volume of dex
    - `marketcap`: the volume of marketcap
    - `timestamp`: the timestamp of the data point
- `overview`: an object with the following structure:
    - `futures`: an object with the following structure:
        - `value`: the volume of futures
        - `chg`: the change of futures
    - `perpetuals`: an object with the following structure:
        - `value`: the volume of perpetuals
        - `chg`: the change of perpetuals
    - `marketcap`: an object with the following structure:
        - `value`: the volume of marketcap
        - `chg`: the change of marketcap
    - `cex`: an object with the following structure:
        - `value`: the volume of cex
        - `percentage`: the percentage of cex
        - `chg`: the change of cex
    - `dex`: an object with the following structure:
        - `value`: the volume of dex
        - `percentage`: the percentage of dex
        - `chg`: the change of dex

## Funding Rates (FR)

Request URL with curl:

```text
GET /data-api/v3/funding-rate/chart?range=24h&convertId=2781 HTTP/2

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

List of parameters to parse:

- `coins`: an array of objects with the following structure:
    - `coinId`: the coin id
    - `coinName`: the coin name
    - `coinSlug`: the coin slug
- `points`: an array of objects with the following structure:
    - `marketcap`: the marketcap
    - `marketFundingRate`: the market funding rate
    - `cryptoFundingRate`: the crypto funding rate
    - `timestamp`: the timestamp of the data point

## Volmex Implied Volatility (VIV)

Request URL with curl:

```text
GET /data-api/v4/volmex-implied-volatility/chart?range=24h&convertId=2781 HTTP/2

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

List of parameters to parse:

- `overview`: an object with the following structure:
    - `marketcap`: an object with the following structure:
        - `value`: the marketcap
        - `chg`: the change in the marketcap
    - `bitcoin`: an object with the following structure:
        - `value`: the bitcoin price
        - `chg`: the change in the bitcoin price
    - `ethereum`: an object with the following structure:
        - `value`: the ethereum price
        - `chg`: the change in the ethereum price
- `points`: an array of objects with the following structure:
    - `marketcap`: the marketcap
    - `bitcoin`: the bitcoin price
    - `ethereum`: the ethereum price
    - `timestamp`: the timestamp of the data point