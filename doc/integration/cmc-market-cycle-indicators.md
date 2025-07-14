# Crypto Market Cycle Indicators

Does the Bitcoin 4 year cycle exist? Discover the crypto market cycle indicators to help you spot the top of a crypto 
bull run. This is a collection of publicly available signals, including Pi Cycle and Puell Multiple data. There is no 
guarantee that these signals will accurately call crypto market movements. Please DYOR!

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
  -H 'x-request-id: 4a1a6b52f6304e0b9b53767d24eba4ff'
```
The response is a JSON object with the following structure:
```json
{
  "data": {
    "indicators": [
      {
        "indicatorName": "Bitcoin Ahr999 Index",
        "time": "1752508800000",
        "currentValue": "1.26",
        "targetValue": "4",
        "comparisonType": ">=",
        "percentChange24h": 3.27868852459000,
        "hitStatus": false,
        "index": 1
      },
      {
        "indicatorName": "Pi Cycle Top Indicator",
        "time": "1752508800000",
        "currentValue": "98696.95",
        "targetValue": "173281.00",
        "comparisonType": ">=",
        "percentChange24h": 0.30788459582000,
        "hitStatus": false,
        "index": 2
      },
      {
        "indicatorName": "Puell Multiple",
        "time": "1752508800000",
        "currentValue": "1.30",
        "targetValue": "2.2",
        "comparisonType": ">=",
        "percentChange24h": -7.14285714285700,
        "hitStatus": false,
        "index": 3
      },
      {
        "indicatorName": "Bitcoin Rainbow Chart",
        "time": "1752508800000",
        "currentValue": "3",
        "targetValue": "5",
        "comparisonType": ">=",
        "percentChange24h": 0,
        "hitStatus": false,
        "index": 4
      },
      {
        "indicatorName": "Days of ETF Net Outflows",
        "time": "1752508800000",
        "currentValue": "1",
        "targetValue": "10",
        "comparisonType": ">=",
        "percentChange24h": 0,
        "hitStatus": false,
        "index": 5
      },
      {
        "indicatorName": "ETF-to-BTC Ratio",
        "time": "1752508800000",
        "currentValue": "4.63%",
        "targetValue": "3.5%",
        "comparisonType": "<=",
        "percentChange24h": -0.85653104925100,
        "hitStatus": false,
        "index": 6
      },
      {
        "indicatorName": "2-Year MA Multiplier",
        "time": "1752508800000",
        "currentValue": "123020.55",
        "targetValue": "331411.00",
        "comparisonType": ">=",
        "percentChange24h": 4.44616737682400,
        "hitStatus": false,
        "index": 7
      },
      {
        "indicatorName": "MVRV Z-Score",
        "time": "1752508800000",
        "currentValue": "2.75",
        "targetValue": "5",
        "comparisonType": ">=",
        "percentChange24h": 2.23048327137500,
        "hitStatus": false,
        "index": 8
      },
      {
        "indicatorName": "Bitcoin Bubble Index",
        "time": "1752508800000",
        "currentValue": "13.48",
        "targetValue": "80",
        "comparisonType": ">=",
        "percentChange24h": 0,
        "hitStatus": false,
        "index": 9
      },
      {
        "indicatorName": "USDT Flexible Savings",
        "time": "1752508800000",
        "currentValue": "7.35%",
        "targetValue": "29%",
        "comparisonType": ">=",
        "percentChange24h": -1.20967741935500,
        "hitStatus": false,
        "index": 10
      },
      {
        "indicatorName": "RSI - 22 Day ",
        "time": "1752508800000",
        "currentValue": "69.770",
        "targetValue": "80",
        "comparisonType": ">=",
        "percentChange24h": 1.79011715273600,
        "hitStatus": false,
        "index": 11
      },
      {
        "indicatorName": "CMC Altcoin Season Index",
        "time": "1752508800000",
        "currentValue": "32",
        "targetValue": "75",
        "comparisonType": ">=",
        "percentChange24h": 6.66666666666700,
        "hitStatus": false,
        "index": 12
      },
      {
        "indicatorName": "Bitcoin Dominance",
        "time": "1752508800000",
        "currentValue": "63.68%",
        "targetValue": "65%",
        "comparisonType": ">=",
        "percentChange24h": 0.11004559031600,
        "hitStatus": false,
        "index": 13
      },
      {
        "indicatorName": "Bitcoin Long Term Holder Supply",
        "time": "1752508800000",
        "currentValue": "15.83M",
        "targetValue": "13.5M",
        "comparisonType": "<=",
        "percentChange24h": 0,
        "hitStatus": false,
        "index": 14
      },
      {
        "indicatorName": "Bitcoin Short Term Holder Supply (%)",
        "time": "1752508800000",
        "currentValue": "20.42%",
        "targetValue": "30%",
        "comparisonType": ">=",
        "percentChange24h": 0.04899559039700,
        "hitStatus": false,
        "index": 15
      },
      {
        "indicatorName": "Bitcoin Reserve Risk",
        "time": "1752508800000",
        "currentValue": "0.0027",
        "targetValue": "0.005",
        "comparisonType": ">=",
        "percentChange24h": 3.84615384615400,
        "hitStatus": false,
        "index": 16
      },
      {
        "indicatorName": "Bitcoin Net Unrealized P&L (NUPL)",
        "time": "1752508800000",
        "currentValue": "58.42%",
        "targetValue": "70%",
        "comparisonType": ">=",
        "percentChange24h": 0.89810017271200,
        "hitStatus": false,
        "index": 17
      },
      {
        "indicatorName": "Bitcoin RHODL Ratio",
        "time": "1752508800000",
        "currentValue": "3237",
        "targetValue": "10000",
        "comparisonType": ">=",
        "percentChange24h": 1.88857412653400,
        "hitStatus": false,
        "index": 18
      },
      {
        "indicatorName": "Bitcoin Macro Oscillator (BMO)",
        "time": "1752508800000",
        "currentValue": "1.13",
        "targetValue": "1.4",
        "comparisonType": ">=",
        "percentChange24h": 2.72727272727300,
        "hitStatus": false,
        "index": 19
      },
      {
        "indicatorName": "Bitcoin MVRV Ratio",
        "time": "1752508800000",
        "currentValue": "2.41",
        "targetValue": "3",
        "comparisonType": ">=",
        "percentChange24h": 1.26050420168100,
        "hitStatus": false,
        "index": 20
      },
      {
        "indicatorName": "Bitcoin 4-Year Moving Average",
        "time": "1752508800000",
        "currentValue": "2.40",
        "targetValue": "3.5",
        "comparisonType": ">=",
        "percentChange24h": 1.26582278481000,
        "hitStatus": false,
        "index": 21
      },
      {
        "indicatorName": "Crypto Bitcoin Bull Run Index (CBBI)",
        "time": "1752508800000",
        "currentValue": "80",
        "targetValue": "90",
        "comparisonType": ">=",
        "percentChange24h": 1.26582278481000,
        "hitStatus": false,
        "index": 22
      },
      {
        "indicatorName": "Mayer Multiple",
        "time": "1752508800000",
        "currentValue": "1.22",
        "targetValue": "2.2",
        "comparisonType": ">=",
        "percentChange24h": 0,
        "hitStatus": false,
        "index": 23
      },
      {
        "indicatorName": "Bitcoin AHR999x Top Escape Indicator",
        "time": "1752508800000",
        "currentValue": "2.40",
        "targetValue": "0.45",
        "comparisonType": "<=",
        "percentChange24h": -2.43902439024400,
        "hitStatus": false,
        "index": 24
      },
      {
        "indicatorName": "MicroStrategy's Avg Bitcoin Cost",
        "time": "1752508800000",
        "currentValue": "70681.00",
        "targetValue": "155655.00",
        "comparisonType": ">=",
        "percentChange24h": 0,
        "hitStatus": false,
        "index": 25
      },
      {
        "indicatorName": "Bitcoin Trend Indicator",
        "time": "1752508800000",
        "currentValue": "6.14",
        "targetValue": "7",
        "comparisonType": ">=",
        "percentChange24h": 0,
        "hitStatus": false,
        "index": 26
      },
      {
        "indicatorName": "3-Month Annualized Ratio",
        "time": "1752508800000",
        "currentValue": "9.95%",
        "targetValue": "30%",
        "comparisonType": ">=",
        "percentChange24h": 0,
        "hitStatus": false,
        "index": 27
      },
      {
        "indicatorName": "Bitcoin Terminal Price",
        "time": "1752508800000",
        "currentValue": "123020.55",
        "targetValue": "187702.00",
        "comparisonType": ">=",
        "percentChange24h": 4.44616737682400,
        "hitStatus": false,
        "index": 28
      },
      {
        "indicatorName": "Golden Ratio Multiplier",
        "time": "1752508800000",
        "currentValue": "123020.55",
        "targetValue": "135522.00",
        "comparisonType": ">=",
        "percentChange24h": 4.44616737682400,
        "hitStatus": false,
        "index": 29
      },
      {
        "indicatorName": "Smithson's Bitcoin Price Forecast",
        "time": "1752508800000",
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
    "timestamp": "2025-07-14T16:21:03.977Z",
    "error_code": "0",
    "error_message": "SUCCESS",
    "elapsed": "2",
    "credit_count": 0
  }
}
```

## Market Cycle Latest Indicators

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
  -H 'x-request-id: 7f0c32197a6446f6bd794d6502601a25'
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
        "timestamp": "2025-07-14T16:19:21.579Z",
        "error_code": "0",
        "error_message": "SUCCESS",
        "elapsed": "3",
        "credit_count": 0
    }
}
```

## Puell Multiple All

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
  -H 'x-request-id: 1162c027d13d46a29b708c32d39c3b71'
```
The response is a JSON object with the following structure:
```json
{
  "data": {
    "points": [
      {
        "puellMultiple": 1.326409998442744,
        "btcUsdPrice": 106108.09,
        "timestamp": "1749859200000"
      },
      {
        "puellMultiple": 1.1939571467490602,
        "btcUsdPrice": 105464.84,
        "timestamp": "1749945600000"
      },
      {
        "puellMultiple": 1.2973058938188349,
        "btcUsdPrice": 105555.59,
        "timestamp": "1750032000000"
      },
      {
        "puellMultiple": 1.0255613141790496,
        "btcUsdPrice": 106794.12,
        "timestamp": "1750118400000"
      },
      {
        "puellMultiple": 1.215914808955784,
        "btcUsdPrice": 104602.07,
        "timestamp": "1750204800000"
      },
      {
        "puellMultiple": 1.1015692167341806,
        "btcUsdPrice": 104886.77,
        "timestamp": "1750291200000"
      },
      {
        "puellMultiple": 1.290170621067029,
        "btcUsdPrice": 104681.03,
        "timestamp": "1750377600000"
      },
      {
        "puellMultiple": 1.182802921027282,
        "btcUsdPrice": 103315.08,
        "timestamp": "1750464000000"
      },
      {
        "puellMultiple": 0.8913694161595193,
        "btcUsdPrice": 102212.03,
        "timestamp": "1750550400000"
      },
      {
        "puellMultiple": 0.9316596466125161,
        "btcUsdPrice": 100987.47,
        "timestamp": "1750636800000"
      },
      {
        "puellMultiple": 1.0224653268828972,
        "btcUsdPrice": 105571.52,
        "timestamp": "1750723200000"
      },
      {
        "puellMultiple": 1.2623841385989059,
        "btcUsdPrice": 106047.40,
        "timestamp": "1750809600000"
      },
      {
        "puellMultiple": 1.3797392405102626,
        "btcUsdPrice": 107375.07,
        "timestamp": "1750896000000"
      },
      {
        "puellMultiple": 1.0105540309476588,
        "btcUsdPrice": 106954.92,
        "timestamp": "1750982400000"
      },
      {
        "puellMultiple": 1.2750601184227353,
        "btcUsdPrice": 107090.55,
        "timestamp": "1751068800000"
      },
      {
        "puellMultiple": 1.4979039474978897,
        "btcUsdPrice": 107327.82,
        "timestamp": "1751155200000"
      },
      {
        "puellMultiple": 1.267941239179263,
        "btcUsdPrice": 108383.44,
        "timestamp": "1751241600000"
      },
      {
        "puellMultiple": 1.1537617778634734,
        "btcUsdPrice": 107144.38,
        "timestamp": "1751328000000"
      },
      {
        "puellMultiple": 1.3551466589866055,
        "btcUsdPrice": 105703.10,
        "timestamp": "1751414400000"
      },
      {
        "puellMultiple": 1.3446507909153012,
        "btcUsdPrice": 108845.01,
        "timestamp": "1751500800000"
      },
      {
        "puellMultiple": 1.3930134056135612,
        "btcUsdPrice": 109635.66,
        "timestamp": "1751587200000"
      },
      {
        "puellMultiple": 1.3746399078901659,
        "btcUsdPrice": 108015.84,
        "timestamp": "1751673600000"
      },
      {
        "puellMultiple": 1.4113653287068486,
        "btcUsdPrice": 108231.18,
        "timestamp": "1751760000000"
      },
      {
        "puellMultiple": 1.3183567631537791,
        "btcUsdPrice": 109235.33,
        "timestamp": "1751846400000"
      },
      {
        "puellMultiple": 1.2454655306221762,
        "btcUsdPrice": 108298.23,
        "timestamp": "1751932800000"
      },
      {
        "puellMultiple": 1.466762857688781,
        "btcUsdPrice": 108950.28,
        "timestamp": "1752019200000"
      },
      {
        "puellMultiple": 1.5877194994213188,
        "btcUsdPrice": 111329.20,
        "timestamp": "1752105600000"
      },
      {
        "puellMultiple": 1.398919650302141,
        "btcUsdPrice": 117530.71,
        "timestamp": "1752278400000"
      }
    ]
  },
  "status": {
    "timestamp": "2025-07-14T16:45:44.731Z",
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
  -H 'x-request-id: e770e2a98bc444d384f77e1986e36995'
```
The response is a JSON object with the following structure:
```json
{
    "data": {
        "points": [
            {
                "ma110": 93337.86,
                "ma350mu2": 166017.62,
                "price": 106108.09,
                "timestamp": "1749859200000"
            },
            {
                "ma110": 93465.40,
                "ma350mu2": 166262.31,
                "price": 105464.84,
                "timestamp": "1749945600000"
            },
            {
                "ma110": 93629.32,
                "ma350mu2": 166514.49,
                "price": 105555.59,
                "timestamp": "1750032000000"
            },
            {
                "ma110": 93816.55,
                "ma350mu2": 166758.14,
                "price": 106794.12,
                "timestamp": "1750118400000"
            },
            {
                "ma110": 93996.86,
                "ma350mu2": 167012.30,
                "price": 104602.07,
                "timestamp": "1750204800000"
            },
            {
                "ma110": 94179.28,
                "ma350mu2": 167266.28,
                "price": 104886.77,
                "timestamp": "1750291200000"
            },
            {
                "ma110": 94335.00,
                "ma350mu2": 167532.28,
                "price": 104681.03,
                "timestamp": "1750377600000"
            },
            {
                "ma110": 94400.50,
                "ma350mu2": 167779.73,
                "price": 103315.08,
                "timestamp": "1750464000000"
            },
            {
                "ma110": 94533.19,
                "ma350mu2": 168036.71,
                "price": 102212.03,
                "timestamp": "1750550400000"
            },
            {
                "ma110": 94697.16,
                "ma350mu2": 168315.84,
                "price": 100987.47,
                "timestamp": "1750636800000"
            },
            {
                "ma110": 94835.65,
                "ma350mu2": 168590.06,
                "price": 105571.52,
                "timestamp": "1750723200000"
            },
            {
                "ma110": 94990.95,
                "ma350mu2": 168873.11,
                "price": 106047.40,
                "timestamp": "1750809600000"
            },
            {
                "ma110": 95173.03,
                "ma350mu2": 169156.52,
                "price": 107375.07,
                "timestamp": "1750896000000"
            },
            {
                "ma110": 95361.64,
                "ma350mu2": 169437.55,
                "price": 106954.92,
                "timestamp": "1750982400000"
            },
            {
                "ma110": 95601.11,
                "ma350mu2": 169712.86,
                "price": 107090.55,
                "timestamp": "1751068800000"
            },
            {
                "ma110": 95867.89,
                "ma350mu2": 169984.03,
                "price": 107327.82,
                "timestamp": "1751155200000"
            },
            {
                "ma110": 96087.12,
                "ma350mu2": 170225.73,
                "price": 108383.44,
                "timestamp": "1751241600000"
            },
            {
                "ma110": 96282.87,
                "ma350mu2": 170456.88,
                "price": 107144.38,
                "timestamp": "1751328000000"
            },
            {
                "ma110": 96532.65,
                "ma350mu2": 170712.24,
                "price": 105703.10,
                "timestamp": "1751414400000"
            },
            {
                "ma110": 96763.55,
                "ma350mu2": 170973.05,
                "price": 108845.01,
                "timestamp": "1751500800000"
            },
            {
                "ma110": 96976.60,
                "ma350mu2": 171209.34,
                "price": 109635.66,
                "timestamp": "1751587200000"
            },
            {
                "ma110": 97207.29,
                "ma350mu2": 171443.69,
                "price": 108015.84,
                "timestamp": "1751673600000"
            },
            {
                "ma110": 97433.77,
                "ma350mu2": 171678.70,
                "price": 108231.18,
                "timestamp": "1751760000000"
            },
            {
                "ma110": 97663.69,
                "ma350mu2": 171911.23,
                "price": 109235.33,
                "timestamp": "1751846400000"
            },
            {
                "ma110": 97863.14,
                "ma350mu2": 172157.01,
                "price": 108298.23,
                "timestamp": "1751932800000"
            },
            {
                "ma110": 98106.89,
                "ma350mu2": 172419.43,
                "price": 108950.28,
                "timestamp": "1752019200000"
            },
            {
                "ma110": 98394.01,
                "ma350mu2": 172705.89,
                "price": 111329.20,
                "timestamp": "1752105600000"
            },
            {
                "ma110": 98696.95,
                "ma350mu2": 172988.74,
                "price": 117530.71,
                "timestamp": "1752278400000"
            }
        ]
    },
    "status": {
        "timestamp": "2025-07-14T16:51:20.881Z",
        "error_code": "0",
        "error_message": "SUCCESS",
        "elapsed": "2",
        "credit_count": 0
    }
}
```

## Bitcoin Rainbow Price Chart Indicator

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
  -H 'x-request-id: 6265586ce99e44a5a9b15209fefbd231'
```
The response is a JSON object with the following structure:
```json
{
    "data": {
        "points": [
            {
                "layers": [
                    51448.73,
                    68563.72,
                    93191.71,
                    127933.57,
                    172710.32,
                    233158.93,
                    320326.33,
                    441055.38,
                    592098.32,
                    805427.55
                ],
                "btcUsdPrice": 106108.09,
                "timestamp": "1749859200000"
            },
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
            {
                "layers": [
                    51553.91,
                    68703.89,
                    93382.23,
                    128195.11,
                    173063.39,
                    233635.58,
                    320981.18,
                    441957.03,
                    593308.76,
                    807074.10
                ],
                "btcUsdPrice": 105555.59,
                "timestamp": "1750032000000"
            },
            {
                "layers": [
                    51606.56,
                    68774.06,
                    93477.61,
                    128326.04,
                    173240.16,
                    233874.21,
                    321309.02,
                    442408.44,
                    593914.75,
                    807898.43
                ],
                "btcUsdPrice": 106794.12,
                "timestamp": "1750118400000"
            },
            {
                "layers": [
                    51659.26,
                    68844.29,
                    93573.07,
                    128457.09,
                    173417.07,
                    234113.05,
                    321637.15,
                    442860.23,
                    594521.26,
                    808723.46
                ],
                "btcUsdPrice": 104602.07,
                "timestamp": "1750204800000"
            },
            {
                "layers": [
                    51712.01,
                    68914.58,
                    93668.61,
                    128588.25,
                    173594.14,
                    234352.09,
                    321965.55,
                    443312.41,
                    595128.29,
                    809549.20
                ],
                "btcUsdPrice": 104886.77,
                "timestamp": "1750291200000"
            },
            {
                "layers": [
                    51764.80,
                    68984.94,
                    93764.23,
                    128719.52,
                    173771.36,
                    234591.33,
                    322294.24,
                    443764.97,
                    595735.84,
                    810375.65
                ],
                "btcUsdPrice": 104681.03,
                "timestamp": "1750377600000"
            },
            {
                "layers": [
                    51817.64,
                    69055.35,
                    93859.94,
                    128850.91,
                    173948.72,
                    234830.78,
                    322623.20,
                    444217.92,
                    596343.91,
                    811202.80
                ],
                "btcUsdPrice": 103315.08,
                "timestamp": "1750464000000"
            },
            {
                "layers": [
                    51870.52,
                    69125.82,
                    93955.72,
                    128982.40,
                    174126.24,
                    235070.43,
                    322952.45,
                    444671.26,
                    596952.49,
                    812030.65
                ],
                "btcUsdPrice": 102212.03,
                "timestamp": "1750550400000"
            },
            {
                "layers": [
                    51923.45,
                    69196.36,
                    94051.59,
                    129114.01,
                    174303.92,
                    235310.29,
                    323281.98,
                    445124.98,
                    597561.60,
                    812859.22
                ],
                "btcUsdPrice": 100987.47,
                "timestamp": "1750636800000"
            },
            {
                "layers": [
                    51976.42,
                    69266.95,
                    94147.54,
                    129245.73,
                    174481.74,
                    235550.35,
                    323611.79,
                    445579.10,
                    598171.23,
                    813688.49
                ],
                "btcUsdPrice": 105571.52,
                "timestamp": "1750723200000"
            },
            {
                "layers": [
                    52029.43,
                    69337.60,
                    94243.57,
                    129377.57,
                    174659.71,
                    235790.61,
                    323941.88,
                    446033.60,
                    598781.37,
                    814518.47
                ],
                "btcUsdPrice": 106047.40,
                "timestamp": "1750809600000"
            },
            {
                "layers": [
                    52082.50,
                    69408.32,
                    94339.69,
                    129509.51,
                    174837.84,
                    236031.08,
                    324272.25,
                    446488.48,
                    599392.04,
                    815349.15
                ],
                "btcUsdPrice": 107375.07,
                "timestamp": "1750896000000"
            },
            {
                "layers": [
                    52135.60,
                    69479.09,
                    94435.89,
                    129641.57,
                    175016.12,
                    236271.76,
                    324602.90,
                    446943.76,
                    600003.23,
                    816180.55
                ],
                "btcUsdPrice": 106954.92,
                "timestamp": "1750982400000"
            },
            {
                "layers": [
                    52188.76,
                    69549.93,
                    94532.16,
                    129773.74,
                    175194.55,
                    236512.64,
                    324933.84,
                    447399.42,
                    600614.94,
                    817012.65
                ],
                "btcUsdPrice": 107090.55,
                "timestamp": "1751068800000"
            },
            {
                "layers": [
                    52241.96,
                    69620.82,
                    94628.52,
                    129906.02,
                    175373.13,
                    236753.73,
                    325265.06,
                    447855.48,
                    601227.17,
                    817845.47
                ],
                "btcUsdPrice": 107327.82,
                "timestamp": "1751155200000"
            },
            {
                "layers": [
                    52295.20,
                    69691.78,
                    94724.97,
                    130038.42,
                    175551.87,
                    236995.02,
                    325596.56,
                    448311.92,
                    601839.92,
                    818678.99
                ],
                "btcUsdPrice": 108383.44,
                "timestamp": "1751241600000"
            },
            {
                "layers": [
                    52348.49,
                    69762.79,
                    94821.49,
                    130170.93,
                    175730.76,
                    237236.52,
                    325928.34,
                    448768.75,
                    602453.20,
                    819513.23
                ],
                "btcUsdPrice": 107144.38,
                "timestamp": "1751328000000"
            },
            {
                "layers": [
                    52401.82,
                    69833.87,
                    94918.10,
                    130303.55,
                    175909.80,
                    237478.22,
                    326260.41,
                    449225.97,
                    603067.00,
                    820348.18
                ],
                "btcUsdPrice": 105703.10,
                "timestamp": "1751414400000"
            },
            {
                "layers": [
                    52455.20,
                    69905.01,
                    95014.79,
                    130436.29,
                    176088.99,
                    237720.14,
                    326592.76,
                    449683.58,
                    603681.32,
                    821183.83
                ],
                "btcUsdPrice": 108845.01,
                "timestamp": "1751500800000"
            },
            {
                "layers": [
                    52508.63,
                    69976.20,
                    95111.56,
                    130569.14,
                    176268.33,
                    237962.25,
                    326925.39,
                    450141.58,
                    604296.17,
                    822020.21
                ],
                "btcUsdPrice": 109635.66,
                "timestamp": "1751587200000"
            },
            {
                "layers": [
                    52562.10,
                    70047.46,
                    95208.42,
                    130702.10,
                    176447.83,
                    238204.57,
                    327258.31,
                    450599.97,
                    604911.54,
                    822857.29
                ],
                "btcUsdPrice": 108015.84,
                "timestamp": "1751673600000"
            },
            {
                "layers": [
                    52615.61,
                    70118.78,
                    95305.35,
                    130835.17,
                    176627.48,
                    238447.10,
                    327591.51,
                    451058.75,
                    605527.43,
                    823695.09
                ],
                "btcUsdPrice": 108231.18,
                "timestamp": "1751760000000"
            },
            {
                "layers": [
                    52669.18,
                    70190.16,
                    95402.37,
                    130968.36,
                    176807.29,
                    238689.84,
                    327924.99,
                    451517.92,
                    606143.85,
                    824533.60
                ],
                "btcUsdPrice": 109235.33,
                "timestamp": "1751846400000"
            },
            {
                "layers": [
                    52722.78,
                    70261.60,
                    95499.47,
                    131101.66,
                    176987.25,
                    238932.78,
                    328258.76,
                    451977.49,
                    606760.80,
                    825372.82
                ],
                "btcUsdPrice": 108298.23,
                "timestamp": "1751932800000"
            },
            {
                "layers": [
                    52776.44,
                    70333.10,
                    95596.66,
                    131235.08,
                    177167.36,
                    239175.93,
                    328592.81,
                    452437.44,
                    607378.26,
                    826212.76
                ],
                "btcUsdPrice": 108950.28,
                "timestamp": "1752019200000"
            },
            {
                "layers": [
                    52830.14,
                    70404.67,
                    95693.93,
                    131368.61,
                    177347.62,
                    239419.29,
                    328927.15,
                    452897.79,
                    607996.26,
                    827053.42
                ],
                "btcUsdPrice": 111329.20,
                "timestamp": "1752105600000"
            },
            {
                "layers": [
                    52883.88,
                    70476.29,
                    95791.28,
                    131502.25,
                    177528.04,
                    239662.85,
                    329261.77,
                    453358.52,
                    608614.78,
                    827894.79
                ],
                "btcUsdPrice": 115986.23,
                "timestamp": "1752192000000"
            },
            {
                "layers": [
                    52937.67,
                    70547.97,
                    95888.71,
                    131636.01,
                    177708.61,
                    239906.62,
                    329596.68,
                    453819.65,
                    609233.83,
                    828736.87
                ],
                "btcUsdPrice": 117530.71,
                "timestamp": "1752278400000"
            },
            {
                "layers": [
                    52991.51,
                    70619.72,
                    95986.23,
                    131769.88,
                    177889.34,
                    240150.60,
                    329931.87,
                    454281.18,
                    609853.40,
                    829579.68
                ],
                "btcUsdPrice": 117432.20,
                "timestamp": "1752364800000"
            },
            {
                "layers": [
                    53045.39,
                    70691.53,
                    96083.83,
                    131903.86,
                    178070.21,
                    240394.79,
                    330267.34,
                    454743.09,
                    610473.51,
                    830423.20
                ],
                "timestamp": "1752451200000"
            }
        ]
    },
    "status": {
        "timestamp": "2025-07-14T16:52:43.082Z",
        "error_code": "0",
        "error_message": "SUCCESS",
        "elapsed": "2",
        "credit_count": 0
    }
}
```