# CMC Crypto Fear and Greed Index

Discover our Fear and Greed Index, a powerful tool that analyzes market sentiment to help you make informed crypto 
investment decisions.

Request URL with curl:
```bash
curl 'https://api.coinmarketcap.com/data-api/v3/fear-greed/chart?start=1749888180&end=1752480180&convertId=2781' \
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
  -H 'x-request-id: ef171a03d9a74b0e96b8471a873c4621'
```
Request URL with node-fetch:
```javascript
fetch("https://api.coinmarketcap.com/data-api/v3/fear-greed/chart?start=1749888180&end=1752480180&convertId=2781", {
  "headers": {
    "accept": "application/json, text/plain, */*",
    "accept-language": "en-US,en;q=0.9",
    "cache-control": "no-cache",
    "platform": "web",
    "priority": "u=1, i",
    "sec-ch-ua": "\"Not)A;Brand\";v=\"8\", \"Chromium\";v=\"138\", \"Google Chrome\";v=\"138\"",
    "sec-ch-ua-mobile": "?0",
    "sec-ch-ua-platform": "\"macOS\"",
    "sec-fetch-dest": "empty",
    "sec-fetch-mode": "cors",
    "sec-fetch-site": "same-site",
    "x-request-id": "ef171a03d9a74b0e96b8471a873c4621"
  },
  "referrer": "https://coinmarketcap.com/",
  "body": null,
  "method": "GET",
  "mode": "cors",
  "credentials": "omit"
});
```
The response is a JSON object with the following structure:
```json
{
  "data": {
    "dataList": [
      {
        "score": 50,
        "name": "Neutral",
        "timestamp": "1749945600",
        "btcPrice": "105464.84",
        "btcVolume": "36744307741.93"
      },
      {
        "score": 51,
        "name": "Neutral",
        "timestamp": "1750032000",
        "btcPrice": "105555.59",
        "btcVolume": "50366626944.57"
      },
      {
        "score": 53,
        "name": "Neutral",
        "timestamp": "1750118400",
        "btcPrice": "106794.12",
        "btcVolume": "55964092175.52"
      },
      {
        "score": 48,
        "name": "Neutral",
        "timestamp": "1750204800",
        "btcPrice": "104602.07",
        "btcVolume": "47318089133.08"
      },
      {
        "score": 48,
        "name": "Neutral",
        "timestamp": "1750291200",
        "btcPrice": "104886.77",
        "btcVolume": "37333806919.54"
      },
      {
        "score": 48,
        "name": "Neutral",
        "timestamp": "1750377600",
        "btcPrice": "104681.03",
        "btcVolume": "50951862476.19"
      },
      {
        "score": 43,
        "name": "Neutral",
        "timestamp": "1750464000",
        "btcPrice": "103315.08",
        "btcVolume": "38360555117.77"
      },
      {
        "score": 40,
        "name": "Neutral",
        "timestamp": "1750550400",
        "btcPrice": "102212.03",
        "btcVolume": "65536997200.85"
      },
      {
        "score": 37,
        "name": "Fear",
        "timestamp": "1750636800",
        "btcPrice": "100987.47",
        "btcVolume": "65237759656.41"
      },
      {
        "score": 47,
        "name": "Neutral",
        "timestamp": "1750723200",
        "btcPrice": "105571.52",
        "btcVolume": "48822986421.13"
      },
      {
        "score": 48,
        "name": "Neutral",
        "timestamp": "1750809600",
        "btcPrice": "106047.40",
        "btcVolume": "51624120283.34"
      },
      {
        "score": 50,
        "name": "Neutral",
        "timestamp": "1750896000",
        "btcPrice": "107375.07",
        "btcVolume": "43891990612.71"
      },
      {
        "score": 49,
        "name": "Neutral",
        "timestamp": "1750982400",
        "btcPrice": "106954.92",
        "btcVolume": "45353692674.51"
      },
      {
        "score": 49,
        "name": "Neutral",
        "timestamp": "1751068800",
        "btcPrice": "107090.55",
        "btcVolume": "30037708334.64"
      },
      {
        "score": 50,
        "name": "Neutral",
        "timestamp": "1751155200",
        "btcPrice": "107327.82",
        "btcVolume": "35534874438.25"
      },
      {
        "score": 52,
        "name": "Neutral",
        "timestamp": "1751241600",
        "btcPrice": "108383.44",
        "btcVolume": "42064804589.76"
      },
      {
        "score": 50,
        "name": "Neutral",
        "timestamp": "1751328000",
        "btcPrice": "107144.38",
        "btcVolume": "44110692246.89"
      },
      {
        "score": 46,
        "name": "Neutral",
        "timestamp": "1751414400",
        "btcPrice": "105703.10",
        "btcVolume": "56248657736.96"
      },
      {
        "score": 54,
        "name": "Neutral",
        "timestamp": "1751500800",
        "btcPrice": "108845.01",
        "btcVolume": "50494742269.78"
      },
      {
        "score": 55,
        "name": "Neutral",
        "timestamp": "1751587200",
        "btcPrice": "109635.66",
        "btcVolume": "42616442655.90"
      },
      {
        "score": 51,
        "name": "Neutral",
        "timestamp": "1751673600",
        "btcPrice": "108015.84",
        "btcVolume": "30615537519.57"
      },
      {
        "score": 50,
        "name": "Neutral",
        "timestamp": "1751760000",
        "btcPrice": "108231.18",
        "btcVolume": "36746020463.25"
      },
      {
        "score": 52,
        "name": "Neutral",
        "timestamp": "1751846400",
        "btcPrice": "109235.33",
        "btcVolume": "45415696597.48"
      },
      {
        "score": 50,
        "name": "Neutral",
        "timestamp": "1751932800",
        "btcPrice": "108298.23",
        "btcVolume": "44282204126.95"
      },
      {
        "score": 52,
        "name": "Neutral",
        "timestamp": "1752019200",
        "btcPrice": "108950.28",
        "btcVolume": "57927418064.83"
      },
      {
        "score": 58,
        "name": "Neutral",
        "timestamp": "1752105600",
        "btcPrice": "111329.20",
        "btcVolume": "95911605727.89"
      },
      {
        "score": 67,
        "name": "Greed",
        "timestamp": "1752192000",
        "btcPrice": "115986.23",
        "btcVolume": "86928361084.93"
      },
      {
        "score": 69,
        "name": "Greed",
        "timestamp": "1752278400",
        "btcPrice": "117530.71",
        "btcVolume": "45524560304.01"
      },
      {
        "score": 68,
        "name": "Greed",
        "timestamp": "1752364800",
        "btcPrice": "117432.20",
        "btcVolume": "49021091807.15"
      },
      {
        "score": 70,
        "name": "Greed",
        "timestamp": "1752479590",
        "btcPrice": "122795.71",
        "btcVolume": "104446561825.70"
      }
    ],
    "dialConfig": [
      {
        "start": 0,
        "end": 20,
        "name": "Extreme fear"
      },
      {
        "start": 20,
        "end": 40,
        "name": "Fear"
      },
      {
        "start": 40,
        "end": 60,
        "name": "Neutral"
      },
      {
        "start": 60,
        "end": 80,
        "name": "Greed"
      },
      {
        "start": 80,
        "end": 100,
        "name": "Extreme greed"
      }
    ],
    "historicalValues": {
      "now": {
        "score": 70,
        "name": "Greed",
        "timestamp": "1752479590"
      },
      "yesterday": {
        "score": 68,
        "name": "Greed",
        "timestamp": "1752364800"
      },
      "lastWeek": {
        "score": 52,
        "name": "Neutral",
        "timestamp": "1751846400"
      },
      "lastMonth": {
        "score": 52,
        "name": "Neutral",
        "timestamp": "1749859200"
      },
      "yearlyHigh": {
        "score": 88,
        "name": "Extreme greed",
        "timestamp": "1732147200"
      },
      "yearlyLow": {
        "score": 15,
        "name": "Extreme fear",
        "timestamp": "1741651200"
      }
    }
  },
  "status": {
    "timestamp": "2025-07-14T08:03:08.867Z",
    "error_code": "0",
    "error_message": "SUCCESS",
    "elapsed": "25",
    "credit_count": 0
  }
}
```