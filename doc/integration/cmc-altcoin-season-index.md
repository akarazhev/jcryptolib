# CMC Altcoin Season Index

The CMC Altcoin Season Index page provides real-time insights into whether the cryptocurrency market is currently in 
Altcoin Season, based on the performance of the top 100 altcoins relative to Bitcoin over the past 90 days, 
with detailed charts and metrics for tracking market trends and altcoin dominance.

Request URL with curl:
```bash
curl 'https://api.coinmarketcap.com/data-api/v3/altcoin-season/chart?start=1751876700&end=1752481500&convertId=2781' \
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
  -H 'x-request-id: c9e5b69b625d427db753b28d2052b662'
```
The response is a JSON object with the following structure:
```json
{
  "data": {
    "points": [
      {
        "name": "Bitcoin Season",
        "altcoinIndex": "22",
        "altcoinMarketcap": "1186712659110.31",
        "timestamp": "1751932800"
      },
      {
        "name": "",
        "altcoinIndex": "28",
        "altcoinMarketcap": "1205096162295.70",
        "timestamp": "1752019200"
      },
      {
        "name": "",
        "altcoinIndex": "30",
        "altcoinMarketcap": "1248645269979.66",
        "timestamp": "1752105600"
      },
      {
        "name": "",
        "altcoinIndex": "28",
        "altcoinMarketcap": "1306629291502.13",
        "timestamp": "1752192000"
      },
      {
        "name": "",
        "altcoinIndex": "27",
        "altcoinMarketcap": "1327826391037.82",
        "timestamp": "1752278400"
      },
      {
        "name": "",
        "altcoinIndex": "29",
        "altcoinMarketcap": "1323262354393.94",
        "timestamp": "1752364800"
      },
      {
        "name": "",
        "altcoinIndex": "33",
        "altcoinMarketcap": "1346736387703.65",
        "timestamp": "1752451200"
      },
      {
        "name": "",
        "altcoinIndex": "32",
        "altcoinMarketcap": "1375537966954.25",
        "timestamp": "1752481331"
      }
    ],
    "historicalValues": {
      "now": {
        "name": "",
        "altcoinIndex": "32",
        "altcoinMarketcap": "1375537966954.25",
        "timestamp": "1752481331"
      },
      "yesterday": {
        "name": "",
        "altcoinIndex": "29",
        "altcoinMarketcap": "1323262354393.94",
        "timestamp": "1752364800"
      },
      "lastWeek": {
        "name": "",
        "altcoinIndex": "26",
        "altcoinMarketcap": "1196432472712.21",
        "timestamp": "1751846400"
      },
      "lastMonth": {
        "name": "",
        "altcoinIndex": "27",
        "altcoinMarketcap": "1194283064489.16",
        "timestamp": "1749859200"
      },
      "yearlyHigh": {
        "name": "Altcoin Season",
        "altcoinIndex": "87",
        "altcoinMarketcap": "0",
        "timestamp": "1733270400"
      },
      "yearlyLow": {
        "name": "Bitcoin Season",
        "altcoinIndex": "12",
        "altcoinMarketcap": "0",
        "timestamp": "1745625600"
      }
    },
    "dialConfigs": [
      {
        "start": 0,
        "end": 25,
        "name": "Bitcoin Season"
      },
      {
        "start": 26,
        "end": 74,
        "name": ""
      },
      {
        "start": 75,
        "end": 100,
        "name": "Altcoin Season"
      }
    ],
    "topCryptos": [
      {
        "id": 35491,
        "name": "MemeCore",
        "symbol": "M",
        "slug": "memecore",
        "percentChange": 729.23844435
      },
      {
        "id": 34466,
        "name": "Pudgy Penguins",
        "symbol": "PENGU",
        "slug": "pudgy-penguins",
        "percentChange": 496.51164828
      },
      {
        "id": 27659,
        "name": "Mog Coin",
        "symbol": "MOG",
        "slug": "mog-coin",
        "percentChange": 284.61232058
      },
      {
        "id": 28081,
        "name": "SPX6900",
        "symbol": "SPX",
        "slug": "spx6900",
        "percentChange": 207.81254190
      },
      {
        "id": 32196,
        "name": "Hyperliquid",
        "symbol": "HYPE",
        "slug": "hyperliquid",
        "percentChange": 197.36054629
      },
      {
        "id": 29420,
        "name": "Virtuals Protocol",
        "symbol": "VIRTUAL",
        "slug": "virtual-protocol",
        "percentChange": 191.75887370
      },
      {
        "id": 28752,
        "name": "dogwifhat",
        "symbol": "WIF",
        "slug": "dogwifhat",
        "percentChange": 146.89621623
      },
      {
        "id": 33391,
        "name": "DeepBook Protocol",
        "symbol": "DEEP",
        "slug": "deepbook-protocol",
        "percentChange": 138.56129867
      },
      {
        "id": 7278,
        "name": "Aave",
        "symbol": "AAVE",
        "slug": "aave",
        "percentChange": 129.67160279
      },
      {
        "id": 23095,
        "name": "Bonk",
        "symbol": "BONK",
        "slug": "bonk1",
        "percentChange": 102.36399747
      },
      {
        "id": 512,
        "name": "Stellar",
        "symbol": "XLM",
        "slug": "stellar",
        "percentChange": 97.91113162
      },
      {
        "id": 34104,
        "name": "Morpho",
        "symbol": "MORPHO",
        "slug": "morpho",
        "percentChange": 97.63826599
      },
      {
        "id": 29270,
        "name": "Aerodrome Finance",
        "symbol": "AERO",
        "slug": "aerodrome-finance",
        "percentChange": 95.70354056
      },
      {
        "id": 23149,
        "name": "Sei",
        "symbol": "SEI",
        "slug": "sei",
        "percentChange": 87.00847525
      },
      {
        "id": 1027,
        "name": "Ethereum",
        "symbol": "ETH",
        "slug": "ethereum",
        "percentChange": 84.23882971
      },
      {
        "id": 22974,
        "name": "Bittensor",
        "symbol": "TAO",
        "slug": "bittensor",
        "percentChange": 77.79432350
      },
      {
        "id": 20947,
        "name": "Sui",
        "symbol": "SUI",
        "slug": "sui",
        "percentChange": 76.69251449
      },
      {
        "id": 10804,
        "name": "FLOKI",
        "symbol": "FLOKI",
        "slug": "floki-inu",
        "percentChange": 75.92504148
      },
      {
        "id": 3155,
        "name": "Quant",
        "symbol": "QNT",
        "slug": "quant",
        "percentChange": 75.70532798
      },
      {
        "id": 7083,
        "name": "Uniswap",
        "symbol": "UNI",
        "slug": "uniswap",
        "percentChange": 71.20237033
      },
      {
        "id": 24478,
        "name": "Pepe",
        "symbol": "PEPE",
        "slug": "pepe",
        "percentChange": 68.55743190
      },
      {
        "id": 23635,
        "name": "Four",
        "symbol": "FORM",
        "slug": "binaryx-new",
        "percentChange": 64.86651759
      },
      {
        "id": 328,
        "name": "Monero",
        "symbol": "XMR",
        "slug": "monero",
        "percentChange": 63.86128328
      },
      {
        "id": 7226,
        "name": "Injective",
        "symbol": "INJ",
        "slug": "injective",
        "percentChange": 59.54395931
      },
      {
        "id": 32880,
        "name": "Kaia",
        "symbol": "KAIA",
        "slug": "kaia",
        "percentChange": 56.34343899
      },
      {
        "id": 13855,
        "name": "Ethereum Name Service",
        "symbol": "ENS",
        "slug": "ethereum-name-service",
        "percentChange": 54.86591374
      },
      {
        "id": 1831,
        "name": "Bitcoin Cash",
        "symbol": "BCH",
        "slug": "bitcoin-cash",
        "percentChange": 53.81749613
      },
      {
        "id": 3773,
        "name": "Artificial Superintelligence Alliance",
        "symbol": "FET",
        "slug": "artificial-superintelligence-alliance",
        "percentChange": 53.42109225
      },
      {
        "id": 4642,
        "name": "Hedera",
        "symbol": "HBAR",
        "slug": "hedera",
        "percentChange": 49.19622345
      },
      {
        "id": 4030,
        "name": "Algorand",
        "symbol": "ALGO",
        "slug": "algorand",
        "percentChange": 47.84412884
      },
      {
        "id": 33597,
        "name": "Fartcoin",
        "symbol": "FARTCOIN",
        "slug": "fartcoin",
        "percentChange": 46.93409298
      },
      {
        "id": 13502,
        "name": "Worldcoin",
        "symbol": "WLD",
        "slug": "worldcoin-org",
        "percentChange": 44.50488538
      },
      {
        "id": 1,
        "name": "Bitcoin",
        "symbol": "BTC",
        "slug": "bitcoin",
        "percentChange": 42.54297415
      },
      {
        "id": 11841,
        "name": "Arbitrum",
        "symbol": "ARB",
        "slug": "arbitrum",
        "percentChange": 42.32127174
      },
      {
        "id": 1437,
        "name": "Zcash",
        "symbol": "ZEC",
        "slug": "zcash",
        "percentChange": 40.53705644
      },
      {
        "id": 1720,
        "name": "IOTA",
        "symbol": "IOTA",
        "slug": "iota",
        "percentChange": 38.07819943
      },
      {
        "id": 52,
        "name": "XRP",
        "symbol": "XRP",
        "slug": "xrp",
        "percentChange": 36.36247219
      },
      {
        "id": 3635,
        "name": "Cronos",
        "symbol": "CRO",
        "slug": "cronos",
        "percentChange": 36.14526935
      },
      {
        "id": 4847,
        "name": "Stacks",
        "symbol": "STX",
        "slug": "stacks",
        "percentChange": 35.85227289
      },
      {
        "id": 8526,
        "name": "Raydium",
        "symbol": "RAY",
        "slug": "raydium",
        "percentChange": 35.31541167
      },
      {
        "id": 33038,
        "name": "Sky",
        "symbol": "SKY",
        "slug": "sky",
        "percentChange": 35.18302167
      },
      {
        "id": 29210,
        "name": "Jupiter",
        "symbol": "JUP",
        "slug": "jupiter-ag",
        "percentChange": 35.03639998
      },
      {
        "id": 10603,
        "name": "Immutable",
        "symbol": "IMX",
        "slug": "immutable-x",
        "percentChange": 33.78737833
      },
      {
        "id": 7186,
        "name": "PancakeSwap",
        "symbol": "CAKE",
        "slug": "pancakeswap",
        "percentChange": 32.21468684
      },
      {
        "id": 2011,
        "name": "Tezos",
        "symbol": "XTZ",
        "slug": "tezos",
        "percentChange": 30.53168702
      },
      {
        "id": 74,
        "name": "Dogecoin",
        "symbol": "DOGE",
        "slug": "dogecoin",
        "percentChange": 28.28792563
      },
      {
        "id": 9481,
        "name": "Pendle",
        "symbol": "PENDLE",
        "slug": "pendle",
        "percentChange": 28.07646698
      },
      {
        "id": 28321,
        "name": "POL (prev. MATIC)",
        "symbol": "POL",
        "slug": "polygon-ecosystem-token",
        "percentChange": 27.74508987
      },
      {
        "id": 6719,
        "name": "The Graph",
        "symbol": "GRT",
        "slug": "the-graph",
        "percentChange": 27.58113780
      },
      {
        "id": 2694,
        "name": "Nexo",
        "symbol": "NEXO",
        "slug": "nexo",
        "percentChange": 27.06221304
      },
      {
        "id": 5426,
        "name": "Solana",
        "symbol": "SOL",
        "slug": "solana",
        "percentChange": 26.30727844
      },
      {
        "id": 1975,
        "name": "Chainlink",
        "symbol": "LINK",
        "slug": "chainlink",
        "percentChange": 25.51474918
      },
      {
        "id": 6210,
        "name": "The Sandbox",
        "symbol": "SAND",
        "slug": "the-sandbox",
        "percentChange": 25.48533130
      },
      {
        "id": 6535,
        "name": "NEAR Protocol",
        "symbol": "NEAR",
        "slug": "near-protocol",
        "percentChange": 24.60855409
      },
      {
        "id": 1321,
        "name": "Ethereum Classic",
        "symbol": "ETC",
        "slug": "ethereum-classic",
        "percentChange": 23.41023563
      },
      {
        "id": 2,
        "name": "Litecoin",
        "symbol": "LTC",
        "slug": "litecoin",
        "percentChange": 23.27283602
      },
      {
        "id": 35336,
        "name": "OFFICIAL TRUMP",
        "symbol": "TRUMP",
        "slug": "official-trump",
        "percentChange": 20.97190491
      },
      {
        "id": 2416,
        "name": "Theta Network",
        "symbol": "THETA",
        "slug": "theta-network",
        "percentChange": 20.83630886
      },
      {
        "id": 8000,
        "name": "Lido DAO",
        "symbol": "LDO",
        "slug": "lido-dao",
        "percentChange": 20.77186290
      },
      {
        "id": 1958,
        "name": "TRON",
        "symbol": "TRX",
        "slug": "tron",
        "percentChange": 20.52385753
      },
      {
        "id": 7080,
        "name": "Gala",
        "symbol": "GALA",
        "slug": "gala",
        "percentChange": 19.87562574
      },
      {
        "id": 1839,
        "name": "BNB",
        "symbol": "BNB",
        "slug": "bnb",
        "percentChange": 19.65561467
      },
      {
        "id": 1966,
        "name": "Decentraland",
        "symbol": "MANA",
        "slug": "decentraland",
        "percentChange": 18.97233663
      },
      {
        "id": 28541,
        "name": "Jito",
        "symbol": "JTO",
        "slug": "jito",
        "percentChange": 16.96299470
      },
      {
        "id": 2010,
        "name": "Cardano",
        "symbol": "ADA",
        "slug": "cardano",
        "percentChange": 16.39774284
      },
      {
        "id": 30171,
        "name": "Ethena",
        "symbol": "ENA",
        "slug": "ethena",
        "percentChange": 16.10949820
      },
      {
        "id": 3794,
        "name": "Cosmos",
        "symbol": "ATOM",
        "slug": "cosmos",
        "percentChange": 14.63785781
      },
      {
        "id": 5994,
        "name": "Shiba Inu",
        "symbol": "SHIB",
        "slug": "shiba-inu",
        "percentChange": 14.62916812
      },
      {
        "id": 6538,
        "name": "Curve DAO Token",
        "symbol": "CRV",
        "slug": "curve-dao-token",
        "percentChange": 14.26274109
      },
      {
        "id": 20396,
        "name": "Kaspa",
        "symbol": "KAS",
        "slug": "kaspa",
        "percentChange": 13.96055755
      },
      {
        "id": 8916,
        "name": "Internet Computer",
        "symbol": "ICP",
        "slug": "internet-computer",
        "percentChange": 13.15941678
      },
      {
        "id": 16086,
        "name": "BitTorrent [New]",
        "symbol": "BTT",
        "slug": "bittorrent-new",
        "percentChange": 12.24808894
      },
      {
        "id": 4558,
        "name": "Flow",
        "symbol": "FLOW",
        "slug": "flow",
        "percentChange": 11.97391020
      },
      {
        "id": 6636,
        "name": "Polkadot",
        "symbol": "DOT",
        "slug": "polkadot-new",
        "percentChange": 10.98155920
      },
      {
        "id": 2087,
        "name": "KuCoin Token",
        "symbol": "KCS",
        "slug": "kucoin-token",
        "percentChange": 10.21860700
      },
      {
        "id": 2634,
        "name": "XDC Network",
        "symbol": "XDC",
        "slug": "xdc-network",
        "percentChange": 9.97342435
      },
      {
        "id": 35626,
        "name": "Story",
        "symbol": "IP",
        "slug": "story-protocol",
        "percentChange": 9.46329859
      },
      {
        "id": 5805,
        "name": "Avalanche",
        "symbol": "AVAX",
        "slug": "avalanche",
        "percentChange": 8.45842608
      },
      {
        "id": 8425,
        "name": "JasmyCoin",
        "symbol": "JASMY",
        "slug": "jasmy",
        "percentChange": 8.06326257
      },
      {
        "id": 21794,
        "name": "Aptos",
        "symbol": "APT",
        "slug": "aptos",
        "percentChange": 7.60130108
      },
      {
        "id": 7950,
        "name": "Flare",
        "symbol": "FLR",
        "slug": "flare",
        "percentChange": 7.53592818
      },
      {
        "id": 21159,
        "name": "Ondo",
        "symbol": "ONDO",
        "slug": "ondo-finance",
        "percentChange": 5.96039884
      },
      {
        "id": 2280,
        "name": "Filecoin",
        "symbol": "FIL",
        "slug": "filecoin",
        "percentChange": 4.49169200
      },
      {
        "id": 3077,
        "name": "VeChain",
        "symbol": "VET",
        "slug": "vechain",
        "percentChange": 4.38224544
      },
      {
        "id": 5176,
        "name": "Tether Gold",
        "symbol": "XAUt",
        "slug": "tether-gold",
        "percentChange": 4.08367563
      },
      {
        "id": 4705,
        "name": "PAX Gold",
        "symbol": "PAXG",
        "slug": "pax-gold",
        "percentChange": 3.75197611
      },
      {
        "id": 11840,
        "name": "Optimism",
        "symbol": "OP",
        "slug": "optimism-ethereum",
        "percentChange": 2.36481860
      },
      {
        "id": 11419,
        "name": "Toncoin",
        "symbol": "TON",
        "slug": "toncoin",
        "percentChange": 2.31241837
      },
      {
        "id": 11092,
        "name": "Bitget Token",
        "symbol": "BGB",
        "slug": "bitget-token-new",
        "percentChange": 1.96350759
      },
      {
        "id": 27075,
        "name": "Mantle",
        "symbol": "MNT",
        "slug": "mantle",
        "percentChange": 0.76119574
      },
      {
        "id": 5690,
        "name": "Render",
        "symbol": "RENDER",
        "slug": "render",
        "percentChange": -2.85012150
      },
      {
        "id": 3957,
        "name": "UNUS SED LEO",
        "symbol": "LEO",
        "slug": "unus-sed-leo",
        "percentChange": -4.16481119
      },
      {
        "id": 3897,
        "name": "OKB",
        "symbol": "OKB",
        "slug": "okb",
        "percentChange": -5.86569275
      },
      {
        "id": 28177,
        "name": "Pyth Network",
        "symbol": "PYTH",
        "slug": "pyth-network",
        "percentChange": -8.14479720
      },
      {
        "id": 22861,
        "name": "Celestia",
        "symbol": "TIA",
        "slug": "celestia",
        "percentChange": -22.68662620
      },
      {
        "id": 36462,
        "name": "Vaulta",
        "symbol": "A",
        "slug": "vaulta",
        "percentChange": -27.43795566
      },
      {
        "id": 32684,
        "name": "Sonic",
        "symbol": "S",
        "slug": "sonic",
        "percentChange": -28.99388184
      },
      {
        "id": 4269,
        "name": "GateToken",
        "symbol": "GT",
        "slug": "gatetoken",
        "percentChange": -29.79277546
      },
      {
        "id": 35697,
        "name": "Pi",
        "symbol": "PI",
        "slug": "pi",
        "percentChange": -36.87444074
      },
      {
        "id": 7326,
        "name": "DeXe",
        "symbol": "DEXE",
        "slug": "dexe",
        "percentChange": -48.58659484
      }
    ]
  },
  "status": {
    "timestamp": "2025-07-14T08:25:32.677Z",
    "error_code": "0",
    "error_message": "SUCCESS",
    "elapsed": "2",
    "credit_count": 0
  }
}
```