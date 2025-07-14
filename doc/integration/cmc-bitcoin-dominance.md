# CMC Bitcoin Dominance

Bitcoin (BTC) dominance is a metric used to measure the relative market share or dominance of Bitcoin in the overall 
cryptocurrency sector. It represents the percentage of Bitcoin's total market capitalization compared to the total market 
capitalization of all cryptocurrencies combined.

## CMC Bitcoin Dominance Now

Request URL with curl:
```bash
curl 'https://api.coinmarketcap.com/data-api/v3/global-metrics/dominance/overview' \
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
  -H 'x-request-id: 1f6078a666e04cc3a8ea6d5da6cfeb15'
```
The response is a JSON object with the following structure:
```json
{
  "data": {
    "configs": [
      {
        "id": 1,
        "name": "Bitcoin",
        "symbol": "BTC"
      },
      {
        "id": 1027,
        "name": "Ethereum",
        "symbol": "ETH"
      },
      {
        "name": "Others"
      }
    ],
    "dominance": [
      {
        "mcChangePct30d": -0.24793219193500,
        "mcProportion": 63.67386780806500
      },
      {
        "mcChangePct30d": 0.38114974520100,
        "mcProportion": 9.70824974520100
      },
      {
        "mcChangePct30d": -0.13321755326600,
        "mcProportion": 26.61788244673400
      }
    ],
    "dominanceLastMonth": [
      {
        "mcProportion": 63.8481
      },
      {
        "mcProportion": 9.4273
      },
      {
        "mcProportion": 26.7246
      }
    ],
    "dominanceLastWeek": [
      {
        "mcProportion": 64.486
      },
      {
        "mcProportion": 9.2134
      },
      {
        "mcProportion": 26.3006
      }
    ],
    "dominanceYearlyHigh": [
      {
        "timestamp": "1750982400",
        "mcProportion": 65.1177
      },
      {
        "timestamp": "1750982400",
        "mcProportion": 8.9298
      },
      {
        "timestamp": "1750982400",
        "mcProportion": 25.9525
      }
    ],
    "dominanceYearlyLow": [
      {
        "timestamp": "1720915200",
        "mcProportion": 53.4629
      },
      {
        "timestamp": "1720915200",
        "mcProportion": 17.4813
      },
      {
        "timestamp": "1720915200",
        "mcProportion": 29.0558
      }
    ],
    "dominanceYesterday": [
      {
        "mcProportion": 63.8392
      },
      {
        "mcProportion": 9.7087
      },
      {
        "mcProportion": 26.4521
      }
    ]
  },
  "status": {
    "timestamp": "2025-07-14T16:09:14.970Z",
    "error_code": "0",
    "error_message": "SUCCESS",
    "elapsed": "2",
    "credit_count": 0
  }
}
```
## CMC Bitcoin Dominance All

Request URL with curl:
```bash
curl 'https://api.coinmarketcap.com/data-api/v3/global-metrics/dominance/chart?range=30d' \
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
  -H 'x-request-id: dd3def21d52a4f5fb5f4e7d2e8bec021'
```
The response is a JSON object with the following structure:
```json
{
  "data": {
    "configs": [
      {
        "name": "Bitcoin Dominance"
      },
      {
        "name": "Ethereum Dominance"
      },
      {
        "name": "Others"
      }
    ],
    "points": [
      {
        "dominance": [
          63.848510369541419000,
          9.427412796027225500,
          26.724076834431355500
        ],
        "timestamp": "1749859200"
      },
      {
        "dominance": [
          64.015646085693666200,
          9.335034658280523900,
          26.649319256025809900
        ],
        "timestamp": "1749945600"
      },
      {
        "dominance": [
          63.838248025953367500,
          9.355717529334891100,
          26.806034444711741400
        ],
        "timestamp": "1750032000"
      },
      {
        "dominance": [
          64.037817778025087000,
          9.259004493346014600,
          26.703177728628898400
        ],
        "timestamp": "1750118400"
      },
      {
        "dominance": [
          63.971210745219332700,
          9.324009005204425000,
          26.704780249576242300
        ],
        "timestamp": "1750204800"
      },
      {
        "dominance": [
          64.025684392044256200,
          9.358221394517301400,
          26.616094213438442400
        ],
        "timestamp": "1750291200"
      },
      {
        "dominance": [
          63.992268638191824800,
          9.360048489832913000,
          26.647682871975262200
        ],
        "timestamp": "1750377600"
      },
      {
        "dominance": [
          64.314549940111539100,
          9.097652025144721000,
          26.587798034743739900
        ],
        "timestamp": "1750464000"
      },
      {
        "dominance": [
          64.720573376298159900,
          8.834140567525107600,
          26.445286056176732500
        ],
        "timestamp": "1750550400"
      },
      {
        "dominance": [
          64.943320961050718400,
          8.699125647241504900,
          26.357553391707776700
        ],
        "timestamp": "1750636800"
      },
      {
        "dominance": [
          64.463148442841844000,
          8.958179289451979200,
          26.578672267706176800
        ],
        "timestamp": "1750723200"
      },
      {
        "dominance": [
          64.464151757248522900,
          9.036522613627929500,
          26.499325629123547600
        ],
        "timestamp": "1750809600"
      },
      {
        "dominance": [
          64.916599811498408100,
          8.880504001215048300,
          26.202896187286543600
        ],
        "timestamp": "1750896000"
      },
      {
        "dominance": [
          65.125707787416964300,
          8.930315026883562600,
          25.943977185699473100
        ],
        "timestamp": "1750982400"
      },
      {
        "dominance": [
          64.949774268206954800,
          8.924701465556015400,
          26.125524266237029800
        ],
        "timestamp": "1751068800"
      },
      {
        "dominance": [
          64.710592391904140000,
          8.920504702903953800,
          26.368902905191906200
        ],
        "timestamp": "1751155200"
      },
      {
        "dominance": [
          64.518998661321667500,
          9.036753354180480100,
          26.444247984497852400
        ],
        "timestamp": "1751241600"
      },
      {
        "dominance": [
          64.389390732523372500,
          9.071692441474319200,
          26.538916826002308300
        ],
        "timestamp": "1751328000"
      },
      {
        "dominance": [
          64.691718383579721900,
          8.937844744922811100,
          26.370436871497467000
        ],
        "timestamp": "1751414400"
      },
      {
        "dominance": [
          64.439994147778677300,
          9.238016297009959500,
          26.321989555211363200
        ],
        "timestamp": "1751500800"
      },
      {
        "dominance": [
          64.449570185210994100,
          9.246254843672317000,
          26.304174971116688900
        ],
        "timestamp": "1751587200"
      },
      {
        "dominance": [
          64.663979012264991500,
          9.114820016087965500,
          26.221200971647043000
        ],
        "timestamp": "1751673600"
      },
      {
        "dominance": [
          64.655402749417649800,
          9.127424414641703600,
          26.217172835940646600
        ],
        "timestamp": "1751760000"
      },
      {
        "dominance": [
          64.483926306494756600,
          9.212804936594828700,
          26.303268756910414700
        ],
        "timestamp": "1751846400"
      },
      {
        "dominance": [
          64.469584940333491500,
          9.188316314473000700,
          26.342098745193507800
        ],
        "timestamp": "1751932800"
      },
      {
        "dominance": [
          64.265405569671389000,
          9.363358478180874000,
          26.371235952147737000
        ],
        "timestamp": "1752019200"
      },
      {
        "dominance": [
          63.932411875602270700,
          9.658038851356515900,
          26.409549273041213400
        ],
        "timestamp": "1752105600"
      },
      {
        "dominance": [
          63.841183170109544400,
          9.856918231018484500,
          26.301898598871971100
        ],
        "timestamp": "1752192000"
      },
      {
        "dominance": [
          63.773931863412998000,
          9.741515254359849900,
          26.484552882227152100
        ],
        "timestamp": "1752278400"
      },
      {
        "dominance": [
          63.845083778215223700,
          9.709513991448660800,
          26.445402230336115500
        ],
        "timestamp": "1752364800"
      },
      {
        "dominance": [
          63.761304954956073700,
          9.657625101802532100,
          26.581069943241394200
        ],
        "timestamp": "1752451200"
      },
      {
        "dominance": [
          63.59150000,
          9.72430000,
          26.68420000
        ],
        "timestamp": "1752510900"
      }
    ]
  },
  "status": {
    "timestamp": "2025-07-14T16:43:04.073Z",
    "error_code": "0",
    "error_message": "SUCCESS",
    "elapsed": "2",
    "credit_count": 0
  }
}
```