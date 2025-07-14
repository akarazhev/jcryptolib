# Crypto Market Overview

Stay updated on the latest cryptocurrency market trends, including Bitcoin dominance, altcoin season, ETF net flows, 
and real-time market sentiment, all conveniently accessible in one place on CoinMarketCap.

## Crypto Market Cap

Request URL with curl:
```bash
curl 'https://api.coinmarketcap.com/data-api/v4/global-metrics/quotes/historical?convertId=2781&range=30d' \
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
  -H 'x-request-id: 8093c71c9e664211851a7c4da068f88e'
```
The response is a JSON object with the following structure:
```json
{
    "data": {
        "points": [
            {
                "marketCap": 2235487391543.43,
                "volume": 53155204337.20,
                "btcValue": 1199300594768.74,
                "ethValue": 390236078923.90,
                "stableValue": 155821101431.56,
                "otherValue": 490129616419.23,
                "timestamp": "1721001600"
            },
            {
                "marketCap": 2377311440200.79,
                "volume": 85500455679.31,
                "btcValue": 1277947163756.47,
                "ethValue": 419097090855.90,
                "stableValue": 155925212458.86,
                "otherValue": 524341973129.56,
                "timestamp": "1721088000"
            },
            {
                "marketCap": 2378159542460.70,
                "volume": 97327557230.80,
                "btcValue": 1284039661465.02,
                "ethValue": 414365244596.79,
                "stableValue": 156326006908.41,
                "otherValue": 523428629490.48,
                "timestamp": "1721174400"
            },
            {
                "marketCap": 2347458349055.82,
                "volume": 79356242246.10,
                "btcValue": 1264599544994.46,
                "ethValue": 407313101455.05,
                "stableValue": 156453348064.38,
                "otherValue": 519092354541.93,
                "timestamp": "1721260800"
            },
            {
                "marketCap": 2345729682270.61,
                "volume": 69864805150.35,
                "btcValue": 1262012835811.78,
                "ethValue": 411872103619.38,
                "stableValue": 156778212028.45,
                "otherValue": 515066530811.00,
                "timestamp": "1721347200"
            },
            {
                "marketCap": 2429223937336.48,
                "volume": 83941976631.53,
                "btcValue": 1316006474713.73,
                "ethValue": 421464608502.71,
                "stableValue": 157177272324.00,
                "otherValue": 534575581796.04,
                "timestamp": "1721433600"
            },
            {
                "marketCap": 2446305800507.15,
                "volume": 52190548965.31,
                "btcValue": 1325092360130.92,
                "ethValue": 423065798383.95,
                "stableValue": 157487051727.11,
                "otherValue": 540660590265.17,
                "timestamp": "1721520000"
            },
            {
                "marketCap": 2480571182912.81,
                "volume": 66252880041.53,
                "btcValue": 1344886440697.34,
                "ethValue": 425141773318.00,
                "stableValue": 157495222483.54,
                "otherValue": 553047746413.93,
                "timestamp": "1721606400"
            },
            {
                "marketCap": 2438970748615.08,
                "volume": 87254785296.84,
                "btcValue": 1333191162053.18,
                "ethValue": 413690218133.77,
                "stableValue": 157551873033.70,
                "otherValue": 534537495394.43,
                "timestamp": "1721692800"
            },
            {
                "marketCap": 2400619048326.51,
                "volume": 88025406742.96,
                "btcValue": 1301087494886.02,
                "ethValue": 418805641262.43,
                "stableValue": 157852061403.23,
                "otherValue": 522873850774.83,
                "timestamp": "1721779200"
            },
            {
                "marketCap": 2367659644777.78,
                "volume": 67222812469.39,
                "btcValue": 1289790622534.07,
                "ethValue": 401045335708.34,
                "stableValue": 157875910581.04,
                "otherValue": 518947775954.33,
                "timestamp": "1721865600"
            },
            {
                "marketCap": 2345393393057.63,
                "volume": 91814770075.53,
                "btcValue": 1297980330651.31,
                "ethValue": 381702816141.80,
                "stableValue": 157820692769.49,
                "otherValue": 507889553495.03,
                "timestamp": "1721952000"
            },
            {
                "marketCap": 2420506209109.66,
                "volume": 68626009679.17,
                "btcValue": 1340053857090.10,
                "ethValue": 393878487064.55,
                "stableValue": 158079936861.63,
                "otherValue": 528493928093.38,
                "timestamp": "1722038400"
            },
            {
                "marketCap": 2415371874133.68,
                "volume": 72217674805.18,
                "btcValue": 1339754523213.76,
                "ethValue": 390687433420.75,
                "stableValue": 158138314102.44,
                "otherValue": 526791603396.73,
                "timestamp": "1722124800"
            },
            {
                "marketCap": 2422253724674.67,
                "volume": 44175426500.64,
                "btcValue": 1346681406569.31,
                "ethValue": 393287469052.01,
                "stableValue": 158212051415.08,
                "otherValue": 524072797638.27,
                "timestamp": "1722211200"
            },
            {
                "marketCap": 2396120180016.28,
                "volume": 83123679325.34,
                "btcValue": 1317903495415.17,
                "ethValue": 399010520474.52,
                "stableValue": 157805497360.56,
                "otherValue": 521400666766.03,
                "timestamp": "1722297600"
            },
            {
                "marketCap": 2374705242028.52,
                "volume": 67083108766.82,
                "btcValue": 1306115246523.99,
                "ethValue": 394176899881.75,
                "stableValue": 157566251458.88,
                "otherValue": 516846844163.90,
                "timestamp": "1722384000"
            },
            {
                "marketCap": 2326133820855.18,
                "volume": 69922216071.80,
                "btcValue": 1275422250667.84,
                "ethValue": 388643007441.56,
                "stableValue": 157465994450.71,
                "otherValue": 504602568295.07,
                "timestamp": "1722470400"
            },
            {
                "marketCap": 2329935456276.36,
                "volume": 88361161096.01,
                "btcValue": 1288780991444.60,
                "ethValue": 384967651889.65,
                "stableValue": 157048828272.51,
                "otherValue": 499137984669.60,
                "timestamp": "1722556800"
            },
            {
                "marketCap": 2191214261815.97,
                "volume": 91751031090.08,
                "btcValue": 1212036648289.33,
                "ethValue": 359068651251.17,
                "stableValue": 157044563703.23,
                "otherValue": 463064398572.24,
                "timestamp": "1722643200"
            },
            {
                "marketCap": 2149874157221.39,
                "volume": 72872986825.29,
                "btcValue": 1197457967147.30,
                "ethValue": 348993488641.78,
                "stableValue": 157297141149.51,
                "otherValue": 446125560282.80,
                "timestamp": "1722729600"
            },
            {
                "marketCap": 2051299308403.97,
                "volume": 77898599707.53,
                "btcValue": 1147492155378.04,
                "ethValue": 323256625180.84,
                "stableValue": 157438549945.66,
                "otherValue": 423111977899.43,
                "timestamp": "1722816000"
            },
            {
                "marketCap": 1907676295786.55,
                "volume": 246974908798.03,
                "btcValue": 1065836772642.36,
                "ethValue": 290892442721.26,
                "stableValue": 157920706938.44,
                "otherValue": 393026373484.49,
                "timestamp": "1722902400"
            },
            {
                "marketCap": 1977319473550.58,
                "volume": 107967649668.85,
                "btcValue": 1106462539809.60,
                "ethValue": 296150815313.79,
                "stableValue": 158337380232.12,
                "otherValue": 416368738195.07,
                "timestamp": "1722988800"
            },
            {
                "marketCap": 1940974262187.04,
                "volume": 97698170607.20,
                "btcValue": 1088287156996.77,
                "ethValue": 281805014617.28,
                "stableValue": 158710443115.36,
                "otherValue": 412171647457.63,
                "timestamp": "1723075200"
            },
            {
                "marketCap": 2158778820012.68,
                "volume": 98283397437.81,
                "btcValue": 1217991840173.89,
                "ethValue": 322852467992.16,
                "stableValue": 159228722837.21,
                "otherValue": 458705789009.42,
                "timestamp": "1723161600"
            },
            {
                "marketCap": 2122501571994.94,
                "volume": 73806306977.20,
                "btcValue": 1201321317159.22,
                "ethValue": 312657935346.44,
                "stableValue": 159578594369.81,
                "otherValue": 448943725119.47,
                "timestamp": "1723248000"
            },
            {
                "marketCap": 2129065315217.66,
                "volume": 41055786152.73,
                "btcValue": 1202910428521.78,
                "ethValue": 313940060628.88,
                "stableValue": 159786411498.63,
                "otherValue": 452428414568.37,
                "timestamp": "1723334400"
            },
            {
                "marketCap": 2053476248580.97,
                "volume": 55406204698.30,
                "btcValue": 1159157943748.57,
                "ethValue": 307305881529.69,
                "stableValue": 159736666875.01,
                "otherValue": 427275756427.70,
                "timestamp": "1723420800"
            },
            {
                "marketCap": 2103681579522.86,
                "volume": 83445264713.66,
                "btcValue": 1171675170015.89,
                "ethValue": 327565204827.79,
                "stableValue": 159818694278.53,
                "otherValue": 444622510400.65,
                "timestamp": "1723507200"
            },
            {
                "marketCap": 2130183445477.85,
                "volume": 66930736870.33,
                "btcValue": 1196282313967.27,
                "ethValue": 325121258584.36,
                "stableValue": 159937332887.67,
                "otherValue": 448842540038.55,
                "timestamp": "1723593600"
            },
            {
                "marketCap": 2082894307755.60,
                "volume": 67731750970.01,
                "btcValue": 1158992678093.88,
                "ethValue": 320270860807.05,
                "stableValue": 160552541104.90,
                "otherValue": 443078227749.77,
                "timestamp": "1723680000"
            },
            {
                "marketCap": 2039663236575.86,
                "volume": 75051382920.64,
                "btcValue": 1136210643397.16,
                "ethValue": 309123530174.20,
                "stableValue": 161114627918.43,
                "otherValue": 433214435086.07,
                "timestamp": "1723766400"
            },
            {
                "marketCap": 2068776806213.30,
                "volume": 63712908469.27,
                "btcValue": 1162689042472.07,
                "ethValue": 311922035144.58,
                "stableValue": 161771246433.45,
                "otherValue": 432394482163.20,
                "timestamp": "1723852800"
            },
            {
                "marketCap": 2090410011920.08,
                "volume": 35539366618.54,
                "btcValue": 1174339921385.28,
                "ethValue": 314473966503.52,
                "stableValue": 161881238786.98,
                "otherValue": 439714885244.30,
                "timestamp": "1723939200"
            },
            {
                "marketCap": 2068731558937.02,
                "volume": 44999813865.25,
                "btcValue": 1153999695447.26,
                "ethValue": 314284314499.10,
                "stableValue": 161967057522.95,
                "otherValue": 438480491467.71,
                "timestamp": "1724025600"
            },
            {
                "marketCap": 2104286209496.39,
                "volume": 60162454865.44,
                "btcValue": 1174076376738.89,
                "ethValue": 317245493550.13,
                "stableValue": 162106656589.36,
                "otherValue": 450857682618.01,
                "timestamp": "1724112000"
            },
            {
                "marketCap": 2092105964420.92,
                "volume": 68034564199.90,
                "btcValue": 1165233482103.65,
                "ethValue": 309541262976.21,
                "stableValue": 162472438398.64,
                "otherValue": 454858780942.42,
                "timestamp": "1724198400"
            },
            {
                "marketCap": 2151071214186.33,
                "volume": 67910483910.16,
                "btcValue": 1207657640770.94,
                "ethValue": 316504970147.23,
                "stableValue": 162780776709.64,
                "otherValue": 464127826558.52,
                "timestamp": "1724284800"
            },
            {
                "marketCap": 2140944615895.16,
                "volume": 58968878566.52,
                "btcValue": 1192223491449.86,
                "ethValue": 315559973042.13,
                "stableValue": 162914293475.09,
                "otherValue": 470246857928.08,
                "timestamp": "1724371200"
            },
            {
                "marketCap": 2257815451085.00,
                "volume": 86574458625.64,
                "btcValue": 1265397346264.95,
                "ethValue": 332557084837.34,
                "stableValue": 163801465282.40,
                "otherValue": 496059554700.31,
                "timestamp": "1724457600"
            },
            {
                "marketCap": 2264200294830.60,
                "volume": 59245728073.15,
                "btcValue": 1267190099322.85,
                "ethValue": 333216888126.05,
                "stableValue": 163956598108.48,
                "otherValue": 499836709273.22,
                "timestamp": "1724544000"
            },
            {
                "marketCap": 2256397901581.43,
                "volume": 52031370392.99,
                "btcValue": 1269431486630.42,
                "ethValue": 330615750563.22,
                "stableValue": 163942441473.28,
                "otherValue": 492408222914.51,
                "timestamp": "1724630400"
            },
            {
                "marketCap": 2201246509885.14,
                "volume": 65549489892.15,
                "btcValue": 1241137007954.82,
                "ethValue": 322526021657.15,
                "stableValue": 163633276959.31,
                "otherValue": 473950203313.86,
                "timestamp": "1724716800"
            },
            {
                "marketCap": 2085987150563.27,
                "volume": 82868246537.20,
                "btcValue": 1174155355535.04,
                "ethValue": 295791688221.66,
                "stableValue": 163571018678.03,
                "otherValue": 452469088128.54,
                "timestamp": "1724803200"
            },
            {
                "marketCap": 2082152431598.38,
                "volume": 89070808304.89,
                "btcValue": 1165647331703.66,
                "ethValue": 304160110325.83,
                "stableValue": 163605968552.09,
                "otherValue": 448739021016.80,
                "timestamp": "1724889600"
            },
            {
                "marketCap": 2086431434871.71,
                "volume": 66675177391.47,
                "btcValue": 1172461357993.09,
                "ethValue": 304155888134.07,
                "stableValue": 163712395333.52,
                "otherValue": 446101793411.03,
                "timestamp": "1724976000"
            },
            {
                "marketCap": 2080581815978.75,
                "volume": 68724335066.25,
                "btcValue": 1167448354334.76,
                "ethValue": 303880962232.65,
                "stableValue": 163735823389.98,
                "otherValue": 445516676021.36,
                "timestamp": "1725062400"
            },
            {
                "marketCap": 2070839343078.55,
                "volume": 31551858910.74,
                "btcValue": 1164453239825.33,
                "ethValue": 302331119564.15,
                "stableValue": 163708302391.31,
                "otherValue": 440346681297.76,
                "timestamp": "1725148800"
            },
            {
                "marketCap": 2009407868097.39,
                "volume": 52493141460.48,
                "btcValue": 1131888700144.89,
                "ethValue": 292007974354.57,
                "stableValue": 163749154053.37,
                "otherValue": 421762039544.56,
                "timestamp": "1725235200"
            },
            {
                "marketCap": 2074078109093.68,
                "volume": 58240498392.40,
                "btcValue": 1167750594988.94,
                "ethValue": 305379716126.99,
                "stableValue": 163787812213.84,
                "otherValue": 437159985763.91,
                "timestamp": "1725321600"
            },
            {
                "marketCap": 2010418670748.81,
                "volume": 56374571440.89,
                "btcValue": 1135297552047.36,
                "ethValue": 291706644841.46,
                "stableValue": 163453358332.74,
                "otherValue": 419961115527.25,
                "timestamp": "1725408000"
            },
            {
                "marketCap": 2027297100460.60,
                "volume": 74639685004.29,
                "btcValue": 1144883593522.03,
                "ethValue": 294791604665.28,
                "stableValue": 163681558192.17,
                "otherValue": 423940344081.12,
                "timestamp": "1725494400"
            },
            {
                "marketCap": 1974526271998.48,
                "volume": 62228922504.72,
                "btcValue": 1109191834389.67,
                "ethValue": 284879107408.90,
                "stableValue": 163644019170.72,
                "otherValue": 416811311029.19,
                "timestamp": "1725580800"
            },
            {
                "marketCap": 1900955521605.02,
                "volume": 99458218322.36,
                "btcValue": 1065590652902.61,
                "ethValue": 267653837991.00,
                "stableValue": 163465412043.84,
                "otherValue": 404245618667.57,
                "timestamp": "1725667200"
            },
            {
                "marketCap": 1918138161150.91,
                "volume": 44499826402.31,
                "btcValue": 1069501667742.82,
                "ethValue": 273565837167.53,
                "stableValue": 163632996867.17,
                "otherValue": 411437659373.39,
                "timestamp": "1725753600"
            },
            {
                "marketCap": 1944195134890.39,
                "volume": 43214527636.73,
                "btcValue": 1083672106308.31,
                "ethValue": 276407776866.05,
                "stableValue": 163709181621.16,
                "otherValue": 420406070094.87,
                "timestamp": "1725840000"
            },
            {
                "marketCap": 2010843076815.53,
                "volume": 70315200668.07,
                "btcValue": 1126940620867.77,
                "ethValue": 283944460125.18,
                "stableValue": 163829707865.28,
                "otherValue": 436128287957.30,
                "timestamp": "1725926400"
            },
            {
                "marketCap": 2031024882697.50,
                "volume": 59090233312.37,
                "btcValue": 1138429830578.89,
                "ethValue": 287393581043.55,
                "stableValue": 164129870542.98,
                "otherValue": 441071600532.08,
                "timestamp": "1726012800"
            },
            {
                "marketCap": 2015741646724.72,
                "volume": 71269216639.14,
                "btcValue": 1132709855571.99,
                "ethValue": 281658104082.73,
                "stableValue": 164180801079.23,
                "otherValue": 437192885990.77,
                "timestamp": "1726099200"
            },
            {
                "marketCap": 2045329928450.00,
                "volume": 64939814943.97,
                "btcValue": 1148246321832.44,
                "ethValue": 284188568681.08,
                "stableValue": 164152378665.20,
                "otherValue": 448742659271.28,
                "timestamp": "1726185600"
            },
            {
                "marketCap": 2113952597260.69,
                "volume": 66228812902.73,
                "btcValue": 1195974551011.04,
                "ethValue": 293746839134.70,
                "stableValue": 164535599915.30,
                "otherValue": 459695607199.65,
                "timestamp": "1726272000"
            },
            {
                "marketCap": 2097498134906.21,
                "volume": 40424402431.71,
                "btcValue": 1185403637822.48,
                "ethValue": 291023899905.04,
                "stableValue": 164711492995.09,
                "otherValue": 456359104183.60,
                "timestamp": "1726358400"
            },
            {
                "marketCap": 2057410658749.32,
                "volume": 44625319169.99,
                "btcValue": 1168327910639.66,
                "ethValue": 278833592648.56,
                "stableValue": 164893639499.56,
                "otherValue": 445355515961.54,
                "timestamp": "1726444800"
            },
            {
                "marketCap": 2027558160819.87,
                "volume": 69121026054.71,
                "btcValue": 1149823848759.03,
                "ethValue": 276215227226.48,
                "stableValue": 164684425590.94,
                "otherValue": 436834659243.42,
                "timestamp": "1726531200"
            },
            {
                "marketCap": 2083060693121.40,
                "volume": 73883273105.33,
                "btcValue": 1191580457308.77,
                "ethValue": 281828242729.24,
                "stableValue": 164962085225.44,
                "otherValue": 444689907857.95,
                "timestamp": "1726617600"
            },
            {
                "marketCap": 2124664753083.19,
                "volume": 82919461803.23,
                "btcValue": 1220128622210.57,
                "ethValue": 285764490745.94,
                "stableValue": 165122959160.14,
                "otherValue": 453648680966.54,
                "timestamp": "1726704000"
            },
            {
                "marketCap": 2175120212584.88,
                "volume": 89480599725.66,
                "btcValue": 1243825074489.61,
                "ethValue": 296739289868.60,
                "stableValue": 165246461945.42,
                "otherValue": 469309386281.25,
                "timestamp": "1726790400"
            },
            {
                "marketCap": 2198584340003.10,
                "volume": 82776052273.18,
                "btcValue": 1248618210011.46,
                "ethValue": 308229481635.04,
                "stableValue": 165664613658.55,
                "otherValue": 476072034698.05,
                "timestamp": "1726876800"
            },
            {
                "marketCap": 2221582367264.55,
                "volume": 44991499938.85,
                "btcValue": 1252135801597.87,
                "ethValue": 314616715294.25,
                "stableValue": 165756947724.27,
                "otherValue": 489072902648.16,
                "timestamp": "1726963200"
            },
            {
                "marketCap": 2213827759436.73,
                "volume": 54294134911.53,
                "btcValue": 1256863079284.18,
                "ethValue": 310760665967.98,
                "stableValue": 165817914018.93,
                "otherValue": 480386100165.64,
                "timestamp": "1727049600"
            },
            {
                "marketCap": 2225346983560.31,
                "volume": 78541441823.87,
                "btcValue": 1251253199132.80,
                "ethValue": 318675256412.81,
                "stableValue": 165883189739.50,
                "otherValue": 489535338275.20,
                "timestamp": "1727136000"
            },
            {
                "marketCap": 2257772231906.25,
                "volume": 74595604528.25,
                "btcValue": 1269879658213.68,
                "ethValue": 319377900243.85,
                "stableValue": 166006902798.59,
                "otherValue": 502507770650.13,
                "timestamp": "1727222400"
            },
            {
                "marketCap": 2216998201365.29,
                "volume": 65767791465.29,
                "btcValue": 1247572253833.27,
                "ethValue": 310464690082.90,
                "stableValue": 166115190123.38,
                "otherValue": 492846067325.74,
                "timestamp": "1727308800"
            },
            {
                "marketCap": 2284040590283.76,
                "volume": 86584923851.30,
                "btcValue": 1287912160712.73,
                "ethValue": 316851766924.78,
                "stableValue": 166292832143.06,
                "otherValue": 512983830503.19,
                "timestamp": "1727395200"
            },
            {
                "marketCap": 2315963922823.78,
                "volume": 79968173618.25,
                "btcValue": 1299979541906.26,
                "ethValue": 324423915003.68,
                "stableValue": 166238913123.09,
                "otherValue": 525321552790.75,
                "timestamp": "1727481600"
            },
            {
                "marketCap": 2312128500905.48,
                "volume": 50097117212.17,
                "btcValue": 1301974989113.77,
                "ethValue": 322207979513.65,
                "stableValue": 166294534441.08,
                "otherValue": 521650997836.98,
                "timestamp": "1727568000"
            },
            {
                "marketCap": 2306181620068.54,
                "volume": 50991304060.36,
                "btcValue": 1296512017138.36,
                "ethValue": 319955773329.94,
                "stableValue": 166368975558.25,
                "otherValue": 523344854041.99,
                "timestamp": "1727654400"
            },
            {
                "marketCap": 2229803903919.32,
                "volume": 83851176981.74,
                "btcValue": 1251279186201.71,
                "ethValue": 313201119391.98,
                "stableValue": 165739591438.04,
                "otherValue": 499584006887.59,
                "timestamp": "1727740800"
            },
            {
                "marketCap": 2136953003242.00,
                "volume": 115557490185.56,
                "btcValue": 1201995208541.89,
                "ethValue": 294730613086.59,
                "stableValue": 165693553838.92,
                "otherValue": 474533627774.60,
                "timestamp": "1727827200"
            },
            {
                "marketCap": 2110770733745.94,
                "volume": 92194673765.61,
                "btcValue": 1198297869858.95,
                "ethValue": 284549365472.23,
                "stableValue": 165677125506.59,
                "otherValue": 462246372908.17,
                "timestamp": "1727913600"
            },
            {
                "marketCap": 2106577056233.18,
                "volume": 83022148305.14,
                "btcValue": 1200530325072.76,
                "ethValue": 282821939134.76,
                "stableValue": 165612006933.75,
                "otherValue": 457612785091.91,
                "timestamp": "1728000000"
            },
            {
                "marketCap": 2157919831897.52,
                "volume": 69968058267.29,
                "btcValue": 1226637879720.17,
                "ethValue": 290637552488.97,
                "stableValue": 165578991713.61,
                "otherValue": 475065407974.77,
                "timestamp": "1728086400"
            },
            {
                "marketCap": 2156377087100.65,
                "volume": 39134337819.86,
                "btcValue": 1226653976134.63,
                "ethValue": 290677675552.23,
                "stableValue": 165623153667.16,
                "otherValue": 473422281746.63,
                "timestamp": "1728172800"
            },
            {
                "marketCap": 2184731052744.70,
                "volume": 41910520986.21,
                "btcValue": 1241520281341.04,
                "ethValue": 293699424107.37,
                "stableValue": 165655824365.10,
                "otherValue": 483855522931.19,
                "timestamp": "1728259200"
            },
            {
                "marketCap": 2165360275189.33,
                "volume": 82089206773.05,
                "btcValue": 1229901187905.92,
                "ethValue": 291599234461.10,
                "stableValue": 165397811504.90,
                "otherValue": 478462041317.41,
                "timestamp": "1728345600"
            },
            {
                "marketCap": 2165508168659.59,
                "volume": 69453100745.22,
                "btcValue": 1227862241344.49,
                "ethValue": 293674972028.93,
                "stableValue": 165525749195.17,
                "otherValue": 478445206091.00,
                "timestamp": "1728432000"
            },
            {
                "marketCap": 2114888906888.61,
                "volume": 67754785718.21,
                "btcValue": 1197408414370.49,
                "ethValue": 285067411095.46,
                "stableValue": 165487138315.03,
                "otherValue": 466925943107.63,
                "timestamp": "1728518400"
            },
            {
                "marketCap": 2110603716102.60,
                "volume": 69535965779.63,
                "btcValue": 1191496898169.95,
                "ethValue": 286999556149.26,
                "stableValue": 165437799212.69,
                "otherValue": 466669462570.70,
                "timestamp": "1728604800"
            },
            {
                "marketCap": 2177354952137.50,
                "volume": 66984621163.97,
                "btcValue": 1235636337803.66,
                "ethValue": 293544246591.01,
                "stableValue": 165639942841.35,
                "otherValue": 482534424901.48,
                "timestamp": "1728691200"
            },
            {
                "marketCap": 2203077262237.06,
                "volume": 46712687173.65,
                "btcValue": 1249080869411.31,
                "ethValue": 298062702760.75,
                "stableValue": 165687220387.66,
                "otherValue": 490246469677.34,
                "timestamp": "1728777600"
            },
            {
                "marketCap": 2192108898362.88,
                "volume": 48214149945.94,
                "btcValue": 1242246471591.07,
                "ethValue": 297029702699.28,
                "stableValue": 165638966479.84,
                "otherValue": 487193757592.69,
                "timestamp": "1728864000"
            },
            {
                "marketCap": 2297371509584.36,
                "volume": 94910845937.04,
                "btcValue": 1305935159477.39,
                "ethValue": 316517991215.87,
                "stableValue": 165461813357.50,
                "otherValue": 509456545533.60,
                "timestamp": "1728950400"
            },
            {
                "marketCap": 2309078971392.39,
                "volume": 107860187482.33,
                "btcValue": 1325518193982.50,
                "ethValue": 313840261642.63,
                "stableValue": 165359537799.74,
                "otherValue": 504360977967.52,
                "timestamp": "1729036800"
            },
            {
                "marketCap": 2320316457139.61,
                "volume": 83302455868.67,
                "btcValue": 1336508358871.79,
                "ethValue": 314297289634.12,
                "stableValue": 165381650884.46,
                "otherValue": 504129157749.24,
                "timestamp": "1729123200"
            },
            {
                "marketCap": 2307153529591.12,
                "volume": 72531164513.99,
                "btcValue": 1332660367738.83,
                "ethValue": 313637018087.05,
                "stableValue": 165225361522.80,
                "otherValue": 495630782242.44,
                "timestamp": "1729209600"
            },
            {
                "marketCap": 2344156786785.66,
                "volume": 77926074159.80,
                "btcValue": 1352661409959.53,
                "ethValue": 318036591438.51,
                "stableValue": 165428409138.92,
                "otherValue": 508030376248.70,
                "timestamp": "1729296000"
            },
            {
                "marketCap": 2347331543282.18,
                "volume": 42781991001.28,
                "btcValue": 1351610945209.76,
                "ethValue": 318881846580.38,
                "stableValue": 165618558403.17,
                "otherValue": 511220193088.87,
                "timestamp": "1729382400"
            },
            {
                "marketCap": 2385197146408.51,
                "volume": 59020517699.49,
                "btcValue": 1364358362851.68,
                "ethValue": 330615502050.91,
                "stableValue": 165603090507.78,
                "otherValue": 524620190998.14,
                "timestamp": "1729468800"
            },
            {
                "marketCap": 2332371897529.42,
                "volume": 85994754374.60,
                "btcValue": 1331760569704.64,
                "ethValue": 320917705839.61,
                "stableValue": 165318740581.03,
                "otherValue": 514374881404.14,
                "timestamp": "1729555200"
            },
            {
                "marketCap": 2324261428376.11,
                "volume": 75808949173.77,
                "btcValue": 1332128157662.48,
                "ethValue": 315503945741.91,
                "stableValue": 165146643916.14,
                "otherValue": 511482681055.58,
                "timestamp": "1729641600"
            },
            {
                "marketCap": 2291131104177.58,
                "volume": 79420720703.49,
                "btcValue": 1317558352731.68,
                "ethValue": 303785346509.40,
                "stableValue": 164869451020.44,
                "otherValue": 504917953916.06,
                "timestamp": "1729728000"
            },
            {
                "marketCap": 2332504889688.17,
                "volume": 75114637983.59,
                "btcValue": 1347710426692.71,
                "ethValue": 305148551776.55,
                "stableValue": 164972271776.91,
                "otherValue": 514673639442.00,
                "timestamp": "1729814400"
            },
            {
                "marketCap": 2256518029813.26,
                "volume": 100281080763.84,
                "btcValue": 1316862373406.30,
                "ethValue": 293280013917.46,
                "stableValue": 165082374058.11,
                "otherValue": 481293268431.39,
                "timestamp": "1729900800"
            },
            {
                "marketCap": 2280149860475.13,
                "volume": 56721880610.26,
                "btcValue": 1325153824581.87,
                "ethValue": 298584019719.67,
                "stableValue": 165155633174.76,
                "otherValue": 491256382998.83,
                "timestamp": "1729987200"
            },
            {
                "marketCap": 2310213765382.02,
                "volume": 45717624593.94,
                "btcValue": 1343433228790.56,
                "ethValue": 301690250569.96,
                "stableValue": 165204826081.95,
                "otherValue": 499885459939.55,
                "timestamp": "1730073600"
            },
            {
                "marketCap": 2364036805535.51,
                "volume": 87291939750.03,
                "btcValue": 1382467666749.74,
                "ethValue": 308922550131.26,
                "stableValue": 165257725896.85,
                "otherValue": 507388862757.66,
                "timestamp": "1730160000"
            },
            {
                "marketCap": 2442274861588.49,
                "volume": 113292026883.57,
                "btcValue": 1437789441566.72,
                "ethValue": 317600339125.91,
                "stableValue": 165320300395.57,
                "otherValue": 521564780500.29,
                "timestamp": "1730246400"
            },
            {
                "marketCap": 2430682184963.43,
                "volume": 89825655386.71,
                "btcValue": 1430452394776.31,
                "ethValue": 320071870633.88,
                "stableValue": 165724441700.14,
                "otherValue": 514433477853.10,
                "timestamp": "1730332800"
            },
            {
                "marketCap": 2351531452195.02,
                "volume": 87209654078.96,
                "btcValue": 1388330357809.74,
                "ethValue": 302874894978.64,
                "stableValue": 165368819197.46,
                "otherValue": 494957380209.18,
                "timestamp": "1730419200"
            },
            {
                "marketCap": 2331728462827.88,
                "volume": 97906599389.80,
                "btcValue": 1374004902912.01,
                "ethValue": 302416309213.69,
                "stableValue": 165506180133.89,
                "otherValue": 489801070568.29,
                "timestamp": "1730505600"
            },
            {
                "marketCap": 2319882521470.87,
                "volume": 46462654022.78,
                "btcValue": 1371463537156.30,
                "ethValue": 300154490633.18,
                "stableValue": 165566964686.47,
                "otherValue": 482697528994.92,
                "timestamp": "1730592000"
            },
            {
                "marketCap": 2291490609534.01,
                "volume": 75138196433.71,
                "btcValue": 1359627803938.65,
                "ethValue": 295797388114.79,
                "stableValue": 165573896782.96,
                "otherValue": 470491520697.61,
                "timestamp": "1730678400"
            },
            {
                "marketCap": 2256274212685.71,
                "volume": 83405813335.08,
                "btcValue": 1340642876859.36,
                "ethValue": 288539521124.72,
                "stableValue": 165628234805.57,
                "otherValue": 461463579896.06,
                "timestamp": "1730764800"
            },
            {
                "marketCap": 2309804334194.16,
                "volume": 90880961605.68,
                "btcValue": 1372041534018.54,
                "ethValue": 291711703221.37,
                "stableValue": 166016299997.13,
                "otherValue": 480034796957.12,
                "timestamp": "1730851200"
            },
            {
                "marketCap": 2518854265967.66,
                "volume": 222983220758.89,
                "btcValue": 1495960865515.87,
                "ethValue": 328072201138.30,
                "stableValue": 167401410786.82,
                "otherValue": 527419788526.67,
                "timestamp": "1730937600"
            },
            {
                "marketCap": 2504380105336.88,
                "volume": 139745495385.64,
                "btcValue": 1501242527891.43,
                "ethValue": 348743396933.85,
                "stableValue": 168305386130.29,
                "otherValue": 486088794381.31,
                "timestamp": "1731024000"
            },
            {
                "marketCap": 2585834661831.96,
                "volume": 130499317033.60,
                "btcValue": 1514115477766.01,
                "ethValue": 356817817569.83,
                "stableValue": 169176323509.45,
                "otherValue": 545725042986.67,
                "timestamp": "1731110400"
            },
            {
                "marketCap": 2633943829411.79,
                "volume": 101921587558.60,
                "btcValue": 1517547763081.84,
                "ethValue": 376781439687.11,
                "stableValue": 170125410249.97,
                "otherValue": 569489216392.87,
                "timestamp": "1731196800"
            },
            {
                "marketCap": 2722276314514.16,
                "volume": 219211722905.84,
                "btcValue": 1591228226396.62,
                "ethValue": 383858288522.65,
                "stableValue": 164908951149.68,
                "otherValue": 582280848445.21,
                "timestamp": "1731283200"
            },
            {
                "marketCap": 2985151619830.18,
                "volume": 280407001794.18,
                "btcValue": 1755399081732.78,
                "ethValue": 406561414634.62,
                "stableValue": 170443282594.56,
                "otherValue": 652747840868.22,
                "timestamp": "1731369600"
            },
            {
                "marketCap": 2942242979132.74,
                "volume": 333939286102.43,
                "btcValue": 1741405642058.68,
                "ethValue": 391012866341.80,
                "stableValue": 170590577913.24,
                "otherValue": 639233892819.02,
                "timestamp": "1731456000"
            },
            {
                "marketCap": 2986605300921.90,
                "volume": 311292374594.49,
                "btcValue": 1790207618596.95,
                "ethValue": 384290664267.45,
                "stableValue": 171965085462.56,
                "otherValue": 640141932594.94,
                "timestamp": "1731542400"
            },
            {
                "marketCap": 2893265721238.15,
                "volume": 235694371502.32,
                "btcValue": 1727103585647.06,
                "ethValue": 368271336037.79,
                "stableValue": 173360405369.04,
                "otherValue": 624530394184.26,
                "timestamp": "1731628800"
            },
            {
                "marketCap": 3010795419540.48,
                "volume": 200300090611.36,
                "btcValue": 1801052948223.01,
                "ethValue": 372049844952.80,
                "stableValue": 174463985453.36,
                "otherValue": 663228640911.31,
                "timestamp": "1731715200"
            },
            {
                "marketCap": 3037660380460.84,
                "volume": 164930220643.88,
                "btcValue": 1791572281192.63,
                "ethValue": 377324590135.60,
                "stableValue": 174754593780.17,
                "otherValue": 694008915352.44,
                "timestamp": "1731801600"
            },
            {
                "marketCap": 3013295825375.71,
                "volume": 163656874217.17,
                "btcValue": 1777557883644.15,
                "ethValue": 370369822887.12,
                "stableValue": 174908191346.80,
                "otherValue": 690459927497.64,
                "timestamp": "1731888000"
            },
            {
                "marketCap": 3067134588352.30,
                "volume": 198877120789.96,
                "btcValue": 1790250104723.60,
                "ethValue": 386350865350.31,
                "stableValue": 175268796157.08,
                "otherValue": 715264822121.31,
                "timestamp": "1731974400"
            },
            {
                "marketCap": 3086246487333.64,
                "volume": 180916284295.85,
                "btcValue": 1827731677224.17,
                "ethValue": 374679093831.16,
                "stableValue": 175748998410.01,
                "otherValue": 708086717868.30,
                "timestamp": "1732060800"
            },
            {
                "marketCap": 3106477817930.27,
                "volume": 176093678179.13,
                "btcValue": 1866746177460.33,
                "ethValue": 369934244759.14,
                "stableValue": 176691336070.53,
                "otherValue": 693106059640.27,
                "timestamp": "1732147200"
            },
            {
                "marketCap": 3266768156800.32,
                "volume": 246628621638.45,
                "btcValue": 1947967025189.31,
                "ethValue": 404565574217.26,
                "stableValue": 178381712895.51,
                "otherValue": 735853844498.24,
                "timestamp": "1732233600"
            },
            {
                "marketCap": 3316915399425.73,
                "volume": 214064299641.84,
                "btcValue": 1958926044597.80,
                "ethValue": 401221015477.85,
                "stableValue": 179598071342.40,
                "otherValue": 777170268007.68,
                "timestamp": "1732320000"
            },
            {
                "marketCap": 3334036945276.56,
                "volume": 217655597975.19,
                "btcValue": 1934511431784.57,
                "ethValue": 409110259395.45,
                "stableValue": 181126275897.99,
                "otherValue": 809288978198.55,
                "timestamp": "1732406400"
            },
            {
                "marketCap": 3340351384919.09,
                "volume": 200087860671.33,
                "btcValue": 1937919789263.11,
                "ethValue": 405047057940.65,
                "stableValue": 181407832763.88,
                "otherValue": 815976704951.45,
                "timestamp": "1732492800"
            },
            {
                "marketCap": 3213127046331.37,
                "volume": 239757942129.01,
                "btcValue": 1840778407676.23,
                "ethValue": 411166849288.62,
                "stableValue": 181089570934.12,
                "otherValue": 780092218432.40,
                "timestamp": "1732579200"
            },
            {
                "marketCap": 3172467328924.79,
                "volume": 225248765213.47,
                "btcValue": 1819265591049.97,
                "ethValue": 400446570144.49,
                "stableValue": 181064054566.28,
                "otherValue": 771691113164.05,
                "timestamp": "1732665600"
            },
            {
                "marketCap": 3333668213375.94,
                "volume": 198431982649.16,
                "btcValue": 1898651934782.39,
                "ethValue": 440447917924.47,
                "stableValue": 181985082858.37,
                "otherValue": 812583277810.71,
                "timestamp": "1732752000"
            },
            {
                "marketCap": 3323287594018.09,
                "volume": 158595961980.78,
                "btcValue": 1893302761455.39,
                "ethValue": 431108182070.55,
                "stableValue": 182338444667.99,
                "otherValue": 816538205824.16,
                "timestamp": "1732838400"
            },
            {
                "marketCap": 3400297194886.94,
                "volume": 166450714186.02,
                "btcValue": 1929166842378.06,
                "ethValue": 432812932361.09,
                "stableValue": 182900161255.89,
                "otherValue": 855417258891.90,
                "timestamp": "1732924800"
            },
            {
                "marketCap": 3411190371140.16,
                "volume": 150960273480.18,
                "btcValue": 1909211750371.18,
                "ethValue": 446345250889.81,
                "stableValue": 183624404399.06,
                "otherValue": 872008965480.11,
                "timestamp": "1733011200"
            },
            {
                "marketCap": 3466836003440.10,
                "volume": 162612250061.35,
                "btcValue": 1925186260749.53,
                "ethValue": 446979515742.75,
                "stableValue": 183773265801.45,
                "otherValue": 910896961146.37,
                "timestamp": "1733097600"
            },
            {
                "marketCap": 3465724388227.53,
                "volume": 288571014779.49,
                "btcValue": 1897038202449.66,
                "ethValue": 438947906610.70,
                "stableValue": 183532882776.72,
                "otherValue": 946205396390.45,
                "timestamp": "1733184000"
            },
            {
                "marketCap": 3506787309735.75,
                "volume": 286682251140.98,
                "btcValue": 1898630055340.58,
                "ethValue": 435735278632.81,
                "stableValue": 184332082164.33,
                "otherValue": 988089893598.03,
                "timestamp": "1733270400"
            },
            {
                "marketCap": 3590416779173.57,
                "volume": 284778253625.48,
                "btcValue": 1954349763870.79,
                "ethValue": 462938381276.00,
                "stableValue": 190102632592.24,
                "otherValue": 983026001434.54,
                "timestamp": "1733356800"
            },
            {
                "marketCap": 3541356395514.92,
                "volume": 369472452977.86,
                "btcValue": 1920888760576.11,
                "ethValue": 456486344839.57,
                "stableValue": 190791155774.57,
                "otherValue": 973190134324.67,
                "timestamp": "1733443200"
            },
            {
                "marketCap": 3666504425640.29,
                "volume": 261810071573.16,
                "btcValue": 1976483606738.56,
                "ethValue": 482430894303.81,
                "stableValue": 192758422110.82,
                "otherValue": 1014831502487.10,
                "timestamp": "1733529600"
            },
            {
                "marketCap": 3651323373496.61,
                "volume": 159075270544.96,
                "btcValue": 1977246727372.30,
                "ethValue": 481730670505.75,
                "stableValue": 188396126781.42,
                "otherValue": 1003949848837.14,
                "timestamp": "1733616000"
            },
            {
                "marketCap": 3712940445460.34,
                "volume": 148776448356.94,
                "btcValue": 2003052361415.77,
                "ethValue": 482722188901.50,
                "stableValue": 193997866787.33,
                "otherValue": 1033168028355.74,
                "timestamp": "1733702400"
            },
            {
                "marketCap": 3465642120589.85,
                "volume": 319454957155.61,
                "btcValue": 1927525985562.86,
                "ethValue": 447706061926.72,
                "stableValue": 193696158474.73,
                "otherValue": 896713914625.54,
                "timestamp": "1733788800"
            },
            {
                "marketCap": 3438231342620.71,
                "volume": 312088874555.66,
                "btcValue": 1913160348634.19,
                "ethValue": 437363957781.25,
                "stableValue": 194152568810.31,
                "otherValue": 893554467394.96,
                "timestamp": "1733875200"
            },
            {
                "marketCap": 3610480945066.78,
                "volume": 220977476583.03,
                "btcValue": 2002981231520.34,
                "ethValue": 461790881785.72,
                "stableValue": 195241715640.47,
                "otherValue": 950467116120.25,
                "timestamp": "1733961600"
            },
            {
                "marketCap": 3598529706326.72,
                "volume": 213049922021.37,
                "btcValue": 1980127741374.45,
                "ethValue": 467608288161.66,
                "stableValue": 196272041441.84,
                "otherValue": 954521635348.77,
                "timestamp": "1734048000"
            },
            {
                "marketCap": 3641265145505.97,
                "volume": 171591397120.84,
                "btcValue": 2007957753595.14,
                "ethValue": 470577504923.93,
                "stableValue": 197474249392.39,
                "otherValue": 965255637594.51,
                "timestamp": "1734134400"
            },
            {
                "marketCap": 3607060533474.70,
                "volume": 136169357033.68,
                "btcValue": 2007207361357.62,
                "ethValue": 466030580529.27,
                "stableValue": 197491098916.50,
                "otherValue": 936331492671.31,
                "timestamp": "1734220800"
            },
            {
                "marketCap": 3699070084343.39,
                "volume": 136660841482.76,
                "btcValue": 2067710839352.28,
                "ethValue": 476669292078.71,
                "stableValue": 197733269442.36,
                "otherValue": 956956683470.04,
                "timestamp": "1734307200"
            },
            {
                "marketCap": 3721464308632.09,
                "volume": 220584859417.92,
                "btcValue": 2099523990532.68,
                "ethValue": 480219131319.53,
                "stableValue": 197909520149.70,
                "otherValue": 943811666630.18,
                "timestamp": "1734393600"
            },
            {
                "marketCap": 3702886479765.24,
                "volume": 189223390430.57,
                "btcValue": 2101407608758.43,
                "ethValue": 468968137753.41,
                "stableValue": 198263094103.15,
                "otherValue": 934247639150.25,
                "timestamp": "1734480000"
            },
            {
                "marketCap": 3478746478546.05,
                "volume": 246563049128.49,
                "btcValue": 1982772426046.39,
                "ethValue": 436702844236.27,
                "stableValue": 198142869534.64,
                "otherValue": 861128338728.75,
                "timestamp": "1734566400"
            },
            {
                "marketCap": 3347912807432.93,
                "volume": 279695999868.50,
                "btcValue": 1928494924162.39,
                "ethValue": 411347426388.95,
                "stableValue": 198177069220.82,
                "otherValue": 809893387660.77,
                "timestamp": "1734652800"
            },
            {
                "marketCap": 3392045025205.56,
                "volume": 307342602622.51,
                "btcValue": 1935717580789.96,
                "ethValue": 418195373475.68,
                "stableValue": 198523060659.34,
                "otherValue": 839609010280.58,
                "timestamp": "1734739200"
            },
            {
                "marketCap": 3333161232578.76,
                "volume": 173182352206.17,
                "btcValue": 1925010849002.78,
                "ethValue": 401902602597.00,
                "stableValue": 197967302853.28,
                "otherValue": 808280478125.70,
                "timestamp": "1734825600"
            },
            {
                "marketCap": 3275157665449.97,
                "volume": 135225799058.13,
                "btcValue": 1882818286846.41,
                "ethValue": 394841311784.02,
                "stableValue": 197933899834.58,
                "otherValue": 799564166984.96,
                "timestamp": "1734912000"
            },
            {
                "marketCap": 3330204205477.62,
                "volume": 172395017699.65,
                "btcValue": 1876261143580.50,
                "ethValue": 411746002775.28,
                "stableValue": 198212313725.48,
                "otherValue": 843984745396.36,
                "timestamp": "1734998400"
            },
            {
                "marketCap": 3443448784766.45,
                "volume": 133676217490.55,
                "btcValue": 1952814140136.64,
                "ethValue": 420558062247.38,
                "stableValue": 198480993342.42,
                "otherValue": 871595589040.01,
                "timestamp": "1735084800"
            },
            {
                "marketCap": 3448687737498.91,
                "volume": 116542518215.12,
                "btcValue": 1967760612737.27,
                "ethValue": 420960108237.50,
                "stableValue": 198024517525.75,
                "otherValue": 861942498998.39,
                "timestamp": "1735171200"
            },
            {
                "marketCap": 3315007830548.19,
                "volume": 125826857466.03,
                "btcValue": 1894069728707.37,
                "ethValue": 401239168117.60,
                "stableValue": 198454599764.22,
                "otherValue": 821244333959.00,
                "timestamp": "1735257600"
            },
            {
                "marketCap": 3283624827657.58,
                "volume": 132212632436.62,
                "btcValue": 1864271835655.36,
                "ethValue": 400943777882.74,
                "stableValue": 198505379392.52,
                "otherValue": 819903834726.96,
                "timestamp": "1735344000"
            },
            {
                "marketCap": 3337384190449.78,
                "volume": 83146890356.37,
                "btcValue": 1884071539653.78,
                "ethValue": 409398997847.54,
                "stableValue": 198077245043.81,
                "otherValue": 845836407904.65,
                "timestamp": "1735430400"
            },
            {
                "marketCap": 3267393362606.53,
                "volume": 85913433776.13,
                "btcValue": 1852662380608.51,
                "ethValue": 403548390424.25,
                "stableValue": 198064615003.17,
                "otherValue": 813117976570.60,
                "timestamp": "1735516800"
            },
            {
                "marketCap": 3247898394633.62,
                "volume": 140202669025.15,
                "btcValue": 1834187843183.13,
                "ethValue": 404260910759.75,
                "stableValue": 198141660837.72,
                "otherValue": 811307979853.02,
                "timestamp": "1735603200"
            },
            {
                "marketCap": 3258746507343.04,
                "volume": 115220336975.45,
                "btcValue": 1849607585941.80,
                "ethValue": 401328214313.46,
                "stableValue": 196990437235.20,
                "otherValue": 810820269852.58,
                "timestamp": "1735689600"
            },
            {
                "marketCap": 3320489672657.69,
                "volume": 85537859519.70,
                "btcValue": 1869335002878.01,
                "ethValue": 403972041829.51,
                "stableValue": 196478985610.22,
                "otherValue": 850703642339.95,
                "timestamp": "1735776000"
            },
            {
                "marketCap": 3405927430240.98,
                "volume": 129650628919.13,
                "btcValue": 1918894036878.97,
                "ethValue": 415850328694.18,
                "stableValue": 197209951400.25,
                "otherValue": 873973113267.58,
                "timestamp": "1735862400"
            },
            {
                "marketCap": 3495925745929.80,
                "volume": 121703354054.28,
                "btcValue": 1944239428144.59,
                "ethValue": 434606684062.32,
                "stableValue": 197932746299.18,
                "otherValue": 919146887423.71,
                "timestamp": "1735948800"
            },
            {
                "marketCap": 3504945338235.71,
                "volume": 92573950200.45,
                "btcValue": 1945149879164.86,
                "ethValue": 440506048628.76,
                "stableValue": 198205828728.14,
                "otherValue": 921083581713.95,
                "timestamp": "1736035200"
            },
            {
                "marketCap": 3498617459363.75,
                "volume": 82666431723.72,
                "btcValue": 1947670206110.55,
                "ethValue": 437918809796.91,
                "stableValue": 198247731696.73,
                "otherValue": 914780711759.56,
                "timestamp": "1736121600"
            },
            {
                "marketCap": 3595363765063.57,
                "volume": 133216589657.54,
                "btcValue": 2025915357020.33,
                "ethValue": 444442434152.16,
                "stableValue": 198507122153.90,
                "otherValue": 926498851737.18,
                "timestamp": "1736208000"
            },
            {
                "marketCap": 3380563758123.90,
                "volume": 161158751592.35,
                "btcValue": 1920076892632.19,
                "ethValue": 407294133744.52,
                "stableValue": 198217278149.54,
                "otherValue": 854975453597.65,
                "timestamp": "1736294400"
            },
            {
                "marketCap": 3324489803269.58,
                "volume": 169993862959.69,
                "btcValue": 1882465264531.82,
                "ethValue": 400779626435.56,
                "stableValue": 198028500091.35,
                "otherValue": 843216412210.85,
                "timestamp": "1736380800"
            },
            {
                "marketCap": 3229618490789.13,
                "volume": 154724842219.34,
                "btcValue": 1832830499848.09,
                "ethValue": 387842901336.09,
                "stableValue": 198137047626.34,
                "otherValue": 810808041978.61,
                "timestamp": "1736467200"
            },
            {
                "marketCap": 3301102095312.17,
                "volume": 147522058703.68,
                "btcValue": 1875755122474.95,
                "ethValue": 393548155462.96,
                "stableValue": 198226111646.64,
                "otherValue": 833572705727.62,
                "timestamp": "1736553600"
            },
            {
                "marketCap": 3318364500460.98,
                "volume": 73388446370.39,
                "btcValue": 1873275767840.60,
                "ethValue": 395435104310.04,
                "stableValue": 198224537086.34,
                "otherValue": 851429091224.00,
                "timestamp": "1736640000"
            },
            {
                "marketCap": 3300218680026.26,
                "volume": 68690226545.90,
                "btcValue": 1871784432965.67,
                "ethValue": 393471389539.68,
                "stableValue": 198244651577.21,
                "otherValue": 836718205943.70,
                "timestamp": "1736726400"
            },
            {
                "marketCap": 3270257202523.72,
                "volume": 177509424097.33,
                "btcValue": 1872198480786.59,
                "ethValue": 377919819915.64,
                "stableValue": 198127886681.56,
                "otherValue": 822011015139.93,
                "timestamp": "1736812800"
            },
            {
                "marketCap": 3350823804176.30,
                "volume": 122357249180.36,
                "btcValue": 1912424834088.09,
                "ethValue": 388462878201.80,
                "stableValue": 198001111934.63,
                "otherValue": 851934979951.78,
                "timestamp": "1736899200"
            },
            {
                "marketCap": 3535019661394.52,
                "volume": 154399593950.83,
                "btcValue": 1990980150095.05,
                "ethValue": 415777620991.72,
                "stableValue": 198618523035.77,
                "otherValue": 929643367271.98,
                "timestamp": "1736985600"
            },
            {
                "marketCap": 3510134503065.26,
                "volume": 155841184441.28,
                "btcValue": 1980737331619.21,
                "ethValue": 398561758451.39,
                "stableValue": 199125256000.00,
                "otherValue": 931710156994.66,
                "timestamp": "1737072000"
            },
            {
                "marketCap": 3655480693951.43,
                "volume": 169046953341.92,
                "btcValue": 2062668302903.62,
                "ethValue": 418627106735.76,
                "stableValue": 200124705581.55,
                "otherValue": 974060578730.50,
                "timestamp": "1737158400"
            },
            {
                "marketCap": 3638190132866.74,
                "volume": 194132968104.80,
                "btcValue": 2068930617067.11,
                "ethValue": 398278787453.36,
                "stableValue": 200855390683.46,
                "otherValue": 970125337662.81,
                "timestamp": "1737244800"
            },
            {
                "marketCap": 3491688992644.81,
                "volume": 307337808886.32,
                "btcValue": 2004339974992.24,
                "ethValue": 387163379313.27,
                "stableValue": 201476196778.90,
                "otherValue": 898709441560.40,
                "timestamp": "1737331200"
            },
            {
                "marketCap": 3527959268473.60,
                "volume": 341184847367.11,
                "btcValue": 2023506137386.78,
                "ethValue": 395290265921.23,
                "stableValue": 201487027662.55,
                "otherValue": 907675837503.04,
                "timestamp": "1737417600"
            },
            {
                "marketCap": 3643530974678.86,
                "volume": 219618822937.04,
                "btcValue": 2103259663415.01,
                "ethValue": 401009318873.41,
                "stableValue": 204393222434.98,
                "otherValue": 934868769955.46,
                "timestamp": "1737504000"
            },
            {
                "marketCap": 3575509686929.14,
                "volume": 142586785230.31,
                "btcValue": 2053794427123.84,
                "ethValue": 390575039284.34,
                "stableValue": 205087151588.77,
                "otherValue": 926053068932.19,
                "timestamp": "1737590400"
            },
            {
                "marketCap": 3583557277067.62,
                "volume": 205681930796.46,
                "btcValue": 2059205427617.87,
                "ethValue": 402309147999.92,
                "stableValue": 205654074786.23,
                "otherValue": 916388626663.60,
                "timestamp": "1737676800"
            },
            {
                "marketCap": 3588317671694.16,
                "volume": 136527614559.24,
                "btcValue": 2077357700120.66,
                "ethValue": 398841465805.09,
                "stableValue": 206184648600.62,
                "otherValue": 905933857167.79,
                "timestamp": "1737763200"
            },
            {
                "marketCap": 3593420557034.11,
                "volume": 85025501839.14,
                "btcValue": 2075045976761.53,
                "ethValue": 399751505798.79,
                "stableValue": 206569625032.45,
                "otherValue": 912053449441.34,
                "timestamp": "1737849600"
            },
            {
                "marketCap": 3512866013502.11,
                "volume": 83743654722.68,
                "btcValue": 2033347887766.09,
                "ethValue": 389650499729.10,
                "stableValue": 206565481231.73,
                "otherValue": 883302144775.19,
                "timestamp": "1737936000"
            },
            {
                "marketCap": 3489061617847.85,
                "volume": 209574891215.78,
                "btcValue": 2023157922326.01,
                "ethValue": 383426410083.91,
                "stableValue": 206719413332.52,
                "otherValue": 875757872105.41,
                "timestamp": "1738022400"
            },
            {
                "marketCap": 3431419006241.10,
                "volume": 120238304379.87,
                "btcValue": 2007151081266.88,
                "ethValue": 370667474289.72,
                "stableValue": 207030324079.36,
                "otherValue": 846570126605.14,
                "timestamp": "1738108800"
            },
            {
                "marketCap": 3497403781609.53,
                "volume": 121632400444.78,
                "btcValue": 2055372495752.95,
                "ethValue": 375317199525.70,
                "stableValue": 207237124721.82,
                "otherValue": 859476961609.06,
                "timestamp": "1738195200"
            },
            {
                "marketCap": 3568224709032.81,
                "volume": 108621722338.67,
                "btcValue": 2076037692387.09,
                "ethValue": 391409276247.02,
                "stableValue": 207791239554.02,
                "otherValue": 892986500844.68,
                "timestamp": "1738281600"
            },
            {
                "marketCap": 3516993057788.09,
                "volume": 124232182849.05,
                "btcValue": 2029446543679.28,
                "ethValue": 397581064227.30,
                "stableValue": 208037672570.63,
                "otherValue": 881927777310.88,
                "timestamp": "1738368000"
            },
            {
                "marketCap": 3404785947219.02,
                "volume": 93296537496.34,
                "btcValue": 1994217234838.44,
                "ethValue": 375650721494.97,
                "stableValue": 208093681623.05,
                "otherValue": 826824309262.56,
                "timestamp": "1738454400"
            },
            {
                "marketCap": 3237065223245.08,
                "volume": 185765968881.16,
                "btcValue": 1934691941923.76,
                "ethValue": 345816076223.90,
                "stableValue": 208142211596.17,
                "otherValue": 748414993501.25,
                "timestamp": "1738540800"
            },
            {
                "marketCap": 3347044150619.95,
                "volume": 362153467660.01,
                "btcValue": 2011060555197.99,
                "ethValue": 347498979713.28,
                "stableValue": 209257209380.87,
                "otherValue": 779227406327.81,
                "timestamp": "1738627200"
            },
            {
                "marketCap": 3211896616067.22,
                "volume": 195093120103.87,
                "btcValue": 1938530081175.72,
                "ethValue": 329271549008.07,
                "stableValue": 210822962695.11,
                "otherValue": 733272023188.32,
                "timestamp": "1738713600"
            },
            {
                "marketCap": 3170964823563.68,
                "volume": 126642637235.32,
                "btcValue": 1913586528855.77,
                "ethValue": 336062664201.44,
                "stableValue": 212103419028.95,
                "otherValue": 709212211477.52,
                "timestamp": "1738800000"
            },
            {
                "marketCap": 3140898658992.51,
                "volume": 123101971873.01,
                "btcValue": 1915614545447.24,
                "ethValue": 323987807060.82,
                "stableValue": 212342312576.58,
                "otherValue": 688953993907.87,
                "timestamp": "1738886400"
            },
            {
                "marketCap": 3137762374344.57,
                "volume": 134727100912.36,
                "btcValue": 1913568542255.34,
                "ethValue": 316156754093.57,
                "stableValue": 213055931404.51,
                "otherValue": 694981146591.15,
                "timestamp": "1738972800"
            },
            {
                "marketCap": 3156658483674.17,
                "volume": 74665088014.43,
                "btcValue": 1912273688747.42,
                "ethValue": 317356640418.25,
                "stableValue": 213163346723.59,
                "otherValue": 713864807784.91,
                "timestamp": "1739059200"
            },
            {
                "marketCap": 3152772812294.35,
                "volume": 86622684004.34,
                "btcValue": 1912609205392.55,
                "ethValue": 316769412489.33,
                "stableValue": 213374075341.41,
                "otherValue": 710020119071.06,
                "timestamp": "1739145600"
            },
            {
                "marketCap": 3187922451217.23,
                "volume": 104552607006.16,
                "btcValue": 1931575936889.31,
                "ethValue": 320810850605.85,
                "stableValue": 213325416662.70,
                "otherValue": 722210247059.37,
                "timestamp": "1739232000"
            },
            {
                "marketCap": 3148688017432.79,
                "volume": 106623221698.39,
                "btcValue": 1898171209647.39,
                "ethValue": 313722704139.89,
                "stableValue": 212599254069.73,
                "otherValue": 724194849575.78,
                "timestamp": "1739318400"
            },
            {
                "marketCap": 3234606452886.70,
                "volume": 129889869725.47,
                "btcValue": 1940065937683.83,
                "ethValue": 330021518345.79,
                "stableValue": 212943091544.38,
                "otherValue": 751575905312.70,
                "timestamp": "1739404800"
            },
            {
                "marketCap": 3195309929461.84,
                "volume": 105357730234.84,
                "btcValue": 1915369790376.03,
                "ethValue": 322604095759.02,
                "stableValue": 212994783580.01,
                "otherValue": 744341259746.78,
                "timestamp": "1739491200"
            },
            {
                "marketCap": 3242462500405.79,
                "volume": 106165408802.33,
                "btcValue": 1932922284487.39,
                "ethValue": 328577459859.57,
                "stableValue": 213118613562.42,
                "otherValue": 767844142496.41,
                "timestamp": "1739577600"
            },
            {
                "marketCap": 3232035644670.51,
                "volume": 63674622511.77,
                "btcValue": 1934636915716.84,
                "ethValue": 324705097235.58,
                "stableValue": 213342720810.04,
                "otherValue": 759350910908.05,
                "timestamp": "1739664000"
            },
            {
                "marketCap": 3191800094884.11,
                "volume": 59069779871.13,
                "btcValue": 1905964458616.11,
                "ethValue": 320938569037.55,
                "stableValue": 213391127905.54,
                "otherValue": 751505939324.91,
                "timestamp": "1739750400"
            },
            {
                "marketCap": 3182099475264.11,
                "volume": 93806021817.89,
                "btcValue": 1898796047859.04,
                "ethValue": 330777315560.02,
                "stableValue": 213460876990.01,
                "otherValue": 739065234855.04,
                "timestamp": "1739836800"
            },
            {
                "marketCap": 3141277235758.08,
                "volume": 107293420731.05,
                "btcValue": 1895540657961.18,
                "ethValue": 321874593661.27,
                "stableValue": 212899831416.14,
                "otherValue": 710962152719.49,
                "timestamp": "1739923200"
            },
            {
                "marketCap": 3186823379381.67,
                "volume": 83182996218.10,
                "btcValue": 1915812562714.66,
                "ethValue": 327365795981.25,
                "stableValue": 213054811708.21,
                "otherValue": 730590208977.55,
                "timestamp": "1740009600"
            },
            {
                "marketCap": 3237095123386.73,
                "volume": 91726482162.05,
                "btcValue": 1949761179566.86,
                "ethValue": 330274598921.64,
                "stableValue": 213070943161.30,
                "otherValue": 743988401736.93,
                "timestamp": "1740096000"
            },
            {
                "marketCap": 3157246552852.82,
                "volume": 138640600154.03,
                "btcValue": 1905750118569.57,
                "ethValue": 320783535457.72,
                "stableValue": 214289743108.77,
                "otherValue": 716423155716.76,
                "timestamp": "1740182400"
            },
            {
                "marketCap": 3194694521035.13,
                "volume": 73024001412.15,
                "btcValue": 1914794911062.21,
                "ethValue": 333244148834.72,
                "stableValue": 214559947878.04,
                "otherValue": 732095513260.16,
                "timestamp": "1740268800"
            },
            {
                "marketCap": 3189407296499.41,
                "volume": 68801769380.76,
                "btcValue": 1908822096813.35,
                "ethValue": 339984644801.49,
                "stableValue": 214620951618.36,
                "otherValue": 725979603266.21,
                "timestamp": "1740355200"
            },
            {
                "marketCap": 2977207640155.26,
                "volume": 129521943878.71,
                "btcValue": 1814243536834.51,
                "ethValue": 303115082739.24,
                "stableValue": 213955769068.60,
                "otherValue": 645893251512.91,
                "timestamp": "1740441600"
            },
            {
                "marketCap": 2926200617553.67,
                "volume": 205145277845.51,
                "btcValue": 1756255267506.73,
                "ethValue": 300510959698.96,
                "stableValue": 213287097248.08,
                "otherValue": 656147293099.90,
                "timestamp": "1740528000"
            },
            {
                "marketCap": 2799523154088.58,
                "volume": 149767870583.33,
                "btcValue": 1668386501249.60,
                "ethValue": 281247253424.93,
                "stableValue": 212858596077.78,
                "otherValue": 637030803336.27,
                "timestamp": "1740614400"
            },
            {
                "marketCap": 2810724469054.45,
                "volume": 122483345874.72,
                "btcValue": 1679033746496.41,
                "ethValue": 278004986983.37,
                "stableValue": 212701089638.09,
                "otherValue": 640984645936.58,
                "timestamp": "1740700800"
            },
            {
                "marketCap": 2794952485170.98,
                "volume": 182228469930.84,
                "btcValue": 1672328156358.91,
                "ethValue": 269596332010.44,
                "stableValue": 213261461632.89,
                "otherValue": 639766535168.74,
                "timestamp": "1740787200"
            },
            {
                "marketCap": 2833440231117.95,
                "volume": 80110155957.23,
                "btcValue": 1705946216120.46,
                "ethValue": 267248237822.61,
                "stableValue": 212951630207.33,
                "otherValue": 647294146967.55,
                "timestamp": "1740873600"
            },
            {
                "marketCap": 3145935962311.20,
                "volume": 173165786091.94,
                "btcValue": 1869946560971.97,
                "ethValue": 303765396867.88,
                "stableValue": 213300804407.19,
                "otherValue": 758923200064.16,
                "timestamp": "1740960000"
            },
            {
                "marketCap": 2822210600612.19,
                "volume": 174173054036.15,
                "btcValue": 1708268515757.04,
                "ethValue": 258986412336.03,
                "stableValue": 213040115414.59,
                "otherValue": 641915557104.53,
                "timestamp": "1741046400"
            },
            {
                "marketCap": 2868032589798.71,
                "volume": 167966722251.23,
                "btcValue": 1730096802766.86,
                "ethValue": 261764986393.12,
                "stableValue": 213402322663.14,
                "otherValue": 662768477975.59,
                "timestamp": "1741132800"
            },
            {
                "marketCap": 2963845654848.98,
                "volume": 117722066115.90,
                "btcValue": 1797107707483.65,
                "ethValue": 270356834253.46,
                "stableValue": 213961395290.62,
                "otherValue": 682419717821.25,
                "timestamp": "1741219200"
            },
            {
                "marketCap": 2942575723599.91,
                "volume": 112154884668.33,
                "btcValue": 1784183438615.13,
                "ethValue": 265585952266.16,
                "stableValue": 214500670003.87,
                "otherValue": 678305662714.75,
                "timestamp": "1741305600"
            },
            {
                "marketCap": 2846132338534.98,
                "volume": 141763100984.79,
                "btcValue": 1719058667626.54,
                "ethValue": 258104169956.21,
                "stableValue": 215363331774.06,
                "otherValue": 653606169178.17,
                "timestamp": "1741392000"
            },
            {
                "marketCap": 2833093956356.32,
                "volume": 57434908422.42,
                "btcValue": 1709437646412.60,
                "ethValue": 265654700816.54,
                "stableValue": 215393672411.45,
                "otherValue": 642607936715.73,
                "timestamp": "1741478400"
            },
            {
                "marketCap": 2649816819071.97,
                "volume": 84995818327.10,
                "btcValue": 1601985158222.56,
                "ethValue": 243415175181.61,
                "stableValue": 215392175485.67,
                "otherValue": 589024310182.13,
                "timestamp": "1741564800"
            },
            {
                "marketCap": 2558936833651.42,
                "volume": 141377442955.02,
                "btcValue": 1558686862001.79,
                "ethValue": 224779546768.52,
                "stableValue": 215180436707.13,
                "otherValue": 560289988173.98,
                "timestamp": "1741651200"
            },
            {
                "marketCap": 2679998804426.44,
                "volume": 139197309906.61,
                "btcValue": 1644422960616.88,
                "ethValue": 231782678688.31,
                "stableValue": 215543895294.22,
                "otherValue": 588249269827.03,
                "timestamp": "1741737600"
            },
            {
                "marketCap": 2711966393587.14,
                "volume": 104520277857.92,
                "btcValue": 1659585089669.83,
                "ethValue": 230133703153.33,
                "stableValue": 215874951933.61,
                "otherValue": 606372648830.37,
                "timestamp": "1741824000"
            },
            {
                "marketCap": 2647509050533.26,
                "volume": 91985857464.15,
                "btcValue": 1608549313774.42,
                "ethValue": 224757112615.78,
                "stableValue": 216135445962.72,
                "otherValue": 598067178180.34,
                "timestamp": "1741910400"
            },
            {
                "marketCap": 2733771554175.94,
                "volume": 78843180040.93,
                "btcValue": 1666101485497.86,
                "ethValue": 230476767572.60,
                "stableValue": 216568531262.85,
                "otherValue": 620624769842.63,
                "timestamp": "1741996800"
            },
            {
                "marketCap": 2760351361704.98,
                "volume": 48616098191.60,
                "btcValue": 1673371395699.00,
                "ethValue": 233645570731.44,
                "stableValue": 216759694594.77,
                "otherValue": 636574700679.77,
                "timestamp": "1742083200"
            },
            {
                "marketCap": 2693217623381.76,
                "volume": 61942728952.92,
                "btcValue": 1638032801086.13,
                "ethValue": 227632740536.00,
                "stableValue": 216708311324.37,
                "otherValue": 610843770435.26,
                "timestamp": "1742169600"
            },
            {
                "marketCap": 2745435274756.97,
                "volume": 72841625966.58,
                "btcValue": 1667074768488.62,
                "ethValue": 232386665707.72,
                "stableValue": 216790916496.73,
                "otherValue": 629182924063.90,
                "timestamp": "1742256000"
            },
            {
                "marketCap": 2711707476050.95,
                "volume": 71974205496.23,
                "btcValue": 1640716288284.04,
                "ethValue": 233016673144.77,
                "stableValue": 216737829446.67,
                "otherValue": 621236685175.47,
                "timestamp": "1742342400"
            },
            {
                "marketCap": 2842050798568.89,
                "volume": 101927386774.99,
                "btcValue": 1723447634016.96,
                "ethValue": 248211323534.75,
                "stableValue": 217208817749.89,
                "otherValue": 653183023267.29,
                "timestamp": "1742428800"
            },
            {
                "marketCap": 2760879877591.82,
                "volume": 80447534922.29,
                "btcValue": 1670006426572.77,
                "ethValue": 239134285495.02,
                "stableValue": 217612632732.02,
                "otherValue": 634126532792.01,
                "timestamp": "1742515200"
            },
            {
                "marketCap": 2750368289836.87,
                "volume": 63264973923.65,
                "btcValue": 1667487614930.48,
                "ethValue": 237076996763.01,
                "stableValue": 218098728881.23,
                "otherValue": 627704949262.15,
                "timestamp": "1742601600"
            },
            {
                "marketCap": 2750136299498.24,
                "volume": 42190220694.49,
                "btcValue": 1663270238818.88,
                "ethValue": 238877612015.15,
                "stableValue": 218053941289.77,
                "otherValue": 629934507374.44,
                "timestamp": "1742688000"
            },
            {
                "marketCap": 2805913365720.63,
                "volume": 50244017968.01,
                "btcValue": 1707260126753.02,
                "ethValue": 242000414890.81,
                "stableValue": 218180941580.59,
                "otherValue": 638471882496.21,
                "timestamp": "1742774400"
            },
            {
                "marketCap": 2863279147575.78,
                "volume": 88560197889.71,
                "btcValue": 1736344196169.94,
                "ethValue": 251148202043.81,
                "stableValue": 218105280376.53,
                "otherValue": 657681468985.50,
                "timestamp": "1742860800"
            },
            {
                "marketCap": 2867131763166.54,
                "volume": 77205197848.88,
                "btcValue": 1735352342765.54,
                "ethValue": 249383332136.56,
                "stableValue": 218785602711.17,
                "otherValue": 663610485553.27,
                "timestamp": "1742947200"
            },
            {
                "marketCap": 2834782213887.99,
                "volume": 78152467350.18,
                "btcValue": 1724479452010.64,
                "ethValue": 242426550579.39,
                "stableValue": 218997921512.02,
                "otherValue": 648878289785.94,
                "timestamp": "1743033600"
            },
            {
                "marketCap": 2845132366870.99,
                "volume": 73445897846.59,
                "btcValue": 1730341644564.71,
                "ethValue": 241613201209.88,
                "stableValue": 219146191780.44,
                "otherValue": 654031329315.96,
                "timestamp": "1743120000"
            },
            {
                "marketCap": 2741206846571.80,
                "volume": 92252224980.42,
                "btcValue": 1674204696498.66,
                "ethValue": 228734630118.25,
                "stableValue": 219183744086.61,
                "otherValue": 619083775868.28,
                "timestamp": "1743206400"
            },
            {
                "marketCap": 2675468576833.92,
                "volume": 59166242655.19,
                "btcValue": 1639461201365.15,
                "ethValue": 220484352826.75,
                "stableValue": 219193547176.31,
                "otherValue": 596329475465.71,
                "timestamp": "1743292800"
            },
            {
                "marketCap": 2665255723028.77,
                "volume": 49336236680.84,
                "btcValue": 1634252144636.24,
                "ethValue": 217987290293.80,
                "stableValue": 219167257052.48,
                "otherValue": 593849031046.25,
                "timestamp": "1743379200"
            },
            {
                "marketCap": 2667542682341.72,
                "volume": 80330493308.13,
                "btcValue": 1637912230775.18,
                "ethValue": 219878449622.25,
                "stableValue": 218765745061.67,
                "otherValue": 590986256882.62,
                "timestamp": "1743465600"
            },
            {
                "marketCap": 2742142137874.53,
                "volume": 77583995300.02,
                "btcValue": 1690202458156.32,
                "ethValue": 229894896096.82,
                "stableValue": 218825119592.66,
                "otherValue": 603219664028.73,
                "timestamp": "1743552000"
            },
            {
                "marketCap": 2644295755496.96,
                "volume": 119528382473.49,
                "btcValue": 1637374908065.61,
                "ethValue": 216573465056.24,
                "stableValue": 219409256142.85,
                "otherValue": 570938126232.26,
                "timestamp": "1743638400"
            },
            {
                "marketCap": 2662216496096.46,
                "volume": 95277013760.04,
                "btcValue": 1650033063576.05,
                "ethValue": 219176703454.89,
                "stableValue": 219603973757.09,
                "otherValue": 573402755308.43,
                "timestamp": "1743724800"
            },
            {
                "marketCap": 2685795066701.58,
                "volume": 104369755311.03,
                "btcValue": 1664205945139.17,
                "ethValue": 219064734486.78,
                "stableValue": 218959709788.71,
                "otherValue": 583564677286.92,
                "timestamp": "1743811200"
            },
            {
                "marketCap": 2674309952996.06,
                "volume": 43141876234.49,
                "btcValue": 1657288785506.45,
                "ethValue": 217940089410.88,
                "stableValue": 218894430859.37,
                "otherValue": 580186647219.36,
                "timestamp": "1743897600"
            },
            {
                "marketCap": 2485869405665.09,
                "volume": 94826732931.77,
                "btcValue": 1554827722324.36,
                "ethValue": 190552059349.25,
                "stableValue": 218595034057.26,
                "otherValue": 521894589934.22,
                "timestamp": "1743984000"
            },
            {
                "marketCap": 2506456117484.03,
                "volume": 206668712171.19,
                "btcValue": 1570798971009.38,
                "ethValue": 187288946880.17,
                "stableValue": 218622871552.48,
                "otherValue": 529745328042.00,
                "timestamp": "1744070400"
            },
            {
                "marketCap": 2420957450085.37,
                "volume": 110196076629.14,
                "btcValue": 1513678443403.30,
                "ethValue": 177628596173.19,
                "stableValue": 218211153490.94,
                "otherValue": 511439257017.94,
                "timestamp": "1744156800"
            },
            {
                "marketCap": 2626946878705.57,
                "volume": 178875382658.79,
                "btcValue": 1639126737617.11,
                "ethValue": 201395407162.20,
                "stableValue": 218098753587.90,
                "otherValue": 568325980338.36,
                "timestamp": "1744243200"
            },
            {
                "marketCap": 2533574147525.09,
                "volume": 104565632309.52,
                "btcValue": 1579091788146.92,
                "ethValue": 183615603649.29,
                "stableValue": 218333100850.19,
                "otherValue": 552533654878.69,
                "timestamp": "1744329600"
            },
            {
                "marketCap": 2635035024204.48,
                "volume": 92244811444.01,
                "btcValue": 1655336362383.71,
                "ethValue": 189008192268.74,
                "stableValue": 218449507008.17,
                "otherValue": 572240962543.86,
                "timestamp": "1744416000"
            },
            {
                "marketCap": 2710025730557.76,
                "volume": 71748018243.30,
                "btcValue": 1692721333397.31,
                "ethValue": 198382660240.89,
                "stableValue": 218518922148.17,
                "otherValue": 600402814771.39,
                "timestamp": "1744502400"
            },
            {
                "marketCap": 2651914257272.77,
                "volume": 78157302792.06,
                "btcValue": 1661800908934.46,
                "ethValue": 192719168737.17,
                "stableValue": 218462701649.70,
                "otherValue": 578931477951.44,
                "timestamp": "1744588800"
            },
            {
                "marketCap": 2671852379559.01,
                "volume": 86678407608.93,
                "btcValue": 1678662146062.75,
                "ethValue": 195895290857.34,
                "stableValue": 218493847087.44,
                "otherValue": 578801095551.48,
                "timestamp": "1744675200"
            },
            {
                "marketCap": 2637947431994.90,
                "volume": 73697600984.96,
                "btcValue": 1660492618184.32,
                "ethValue": 191760506885.76,
                "stableValue": 218899266689.58,
                "otherValue": 566795040235.24,
                "timestamp": "1744761600"
            },
            {
                "marketCap": 2645449093617.80,
                "volume": 80926101688.44,
                "btcValue": 1668168327825.21,
                "ethValue": 190365827350.88,
                "stableValue": 218959521577.10,
                "otherValue": 567955416864.61,
                "timestamp": "1744848000"
            },
            {
                "marketCap": 2669373250053.47,
                "volume": 63159296202.41,
                "btcValue": 1685922377106.90,
                "ethValue": 191062691084.01,
                "stableValue": 219484944771.98,
                "otherValue": 572903237090.58,
                "timestamp": "1744934400"
            },
            {
                "marketCap": 2663370088681.14,
                "volume": 44678551821.39,
                "btcValue": 1676609959708.76,
                "ethValue": 191760411502.59,
                "stableValue": 219456545397.46,
                "otherValue": 575543172072.33,
                "timestamp": "1745020800"
            },
            {
                "marketCap": 2689723413368.20,
                "volume": 45722679255.57,
                "btcValue": 1688977295227.47,
                "ethValue": 194708756374.53,
                "stableValue": 219503658299.61,
                "otherValue": 586533703466.59,
                "timestamp": "1745107200"
            },
            {
                "marketCap": 2686531790539.74,
                "volume": 48855810605.29,
                "btcValue": 1690961388192.23,
                "ethValue": 191599473222.44,
                "stableValue": 219350228569.87,
                "otherValue": 584620700555.20,
                "timestamp": "1745193600"
            },
            {
                "marketCap": 2735184068666.69,
                "volume": 91989075518.69,
                "btcValue": 1737541829954.32,
                "ethValue": 190657751813.31,
                "stableValue": 219398099951.36,
                "otherValue": 587586386947.70,
                "timestamp": "1745280000"
            },
            {
                "marketCap": 2915705611165.02,
                "volume": 123404933206.55,
                "btcValue": 1855762749849.95,
                "ethValue": 212076891832.87,
                "stableValue": 220311615687.29,
                "otherValue": 627554353794.91,
                "timestamp": "1745366400"
            },
            {
                "marketCap": 2931025902543.43,
                "volume": 117181690985.54,
                "btcValue": 1860503271511.05,
                "ethValue": 216809056187.97,
                "stableValue": 220945318768.56,
                "otherValue": 632768256075.85,
                "timestamp": "1745452800"
            },
            {
                "marketCap": 2940262416387.24,
                "volume": 91245031507.94,
                "btcValue": 1866176977037.38,
                "ethValue": 213668126711.58,
                "stableValue": 221543996255.73,
                "otherValue": 638873316382.55,
                "timestamp": "1745539200"
            },
            {
                "marketCap": 2959859067146.07,
                "volume": 106549580116.03,
                "btcValue": 1880543929561.48,
                "ethValue": 215625679991.35,
                "stableValue": 222159366270.11,
                "otherValue": 641530091323.13,
                "timestamp": "1745625600"
            },
            {
                "marketCap": 2969192395640.96,
                "volume": 65632317925.63,
                "btcValue": 1879670459759.45,
                "ethValue": 219923178580.74,
                "stableValue": 223213739150.82,
                "otherValue": 646385018149.95,
                "timestamp": "1745712000"
            },
            {
                "marketCap": 2941512672805.80,
                "volume": 60650412067.82,
                "btcValue": 1862267050542.45,
                "ethValue": 216334375039.47,
                "stableValue": 222964445981.73,
                "otherValue": 639946801242.15,
                "timestamp": "1745798400"
            },
            {
                "marketCap": 2975175235909.15,
                "volume": 92205023614.91,
                "btcValue": 1887429549045.41,
                "ethValue": 217329659058.20,
                "stableValue": 222927676748.99,
                "otherValue": 647488351056.55,
                "timestamp": "1745884800"
            },
            {
                "marketCap": 2950185417932.73,
                "volume": 77052797594.85,
                "btcValue": 1872107301400.34,
                "ethValue": 217147581737.57,
                "stableValue": 223701405356.87,
                "otherValue": 637229129437.95,
                "timestamp": "1745971200"
            },
            {
                "marketCap": 2944967064868.37,
                "volume": 79492511052.04,
                "btcValue": 1870544456470.16,
                "ethValue": 216596975612.95,
                "stableValue": 223517436984.28,
                "otherValue": 634308195800.98,
                "timestamp": "1746057600"
            },
            {
                "marketCap": 3005742722444.40,
                "volume": 82928583117.08,
                "btcValue": 1916200863758.41,
                "ethValue": 221997840711.95,
                "stableValue": 223766018015.27,
                "otherValue": 643777999958.77,
                "timestamp": "1746144000"
            },
            {
                "marketCap": 3016087433285.38,
                "volume": 71226465132.69,
                "btcValue": 1924515887487.80,
                "ethValue": 222474199296.08,
                "stableValue": 226223103254.93,
                "otherValue": 642874243246.57,
                "timestamp": "1746230400"
            },
            {
                "marketCap": 2981403745766.67,
                "volume": 48550366119.12,
                "btcValue": 1903982909777.86,
                "ethValue": 221402754880.14,
                "stableValue": 226480293578.41,
                "otherValue": 629537787530.26,
                "timestamp": "1746316800"
            },
            {
                "marketCap": 2935729267530.39,
                "volume": 51135034066.92,
                "btcValue": 1872836815196.98,
                "ethValue": 218370949979.71,
                "stableValue": 226621755193.96,
                "otherValue": 617899747159.74,
                "timestamp": "1746403200"
            },
            {
                "marketCap": 2947183238128.65,
                "volume": 67273959173.21,
                "btcValue": 1881724392081.67,
                "ethValue": 219725774696.37,
                "stableValue": 226820378267.01,
                "otherValue": 618912693083.60,
                "timestamp": "1746489600"
            },
            {
                "marketCap": 2989982517103.93,
                "volume": 73774396334.84,
                "btcValue": 1923136994984.80,
                "ethValue": 219338305875.52,
                "stableValue": 226143382021.10,
                "otherValue": 621363834222.51,
                "timestamp": "1746576000"
            },
            {
                "marketCap": 2993482192419.78,
                "volume": 124043409424.15,
                "btcValue": 1927326491424.66,
                "ethValue": 218713623173.98,
                "stableValue": 226158746110.39,
                "otherValue": 621283331710.75,
                "timestamp": "1746662400"
            },
            {
                "marketCap": 3228661003151.70,
                "volume": 162228657312.15,
                "btcValue": 2050888881930.83,
                "ethValue": 266488969553.14,
                "stableValue": 226458379575.21,
                "otherValue": 684824772092.52,
                "timestamp": "1746748800"
            },
            {
                "marketCap": 3265491894823.65,
                "volume": 174637758130.18,
                "btcValue": 2045382646988.02,
                "ethValue": 283153398325.79,
                "stableValue": 226215804991.49,
                "otherValue": 710740044518.35,
                "timestamp": "1746835200"
            },
            {
                "marketCap": 3371555312987.71,
                "volume": 131504788923.11,
                "btcValue": 2081646645631.29,
                "ethValue": 311897414589.98,
                "stableValue": 226474455960.47,
                "otherValue": 751536796805.97,
                "timestamp": "1746921600"
            },
            {
                "marketCap": 3327829196151.48,
                "volume": 129065852332.33,
                "btcValue": 2068320913281.17,
                "ethValue": 303604566568.44,
                "stableValue": 226490788934.20,
                "otherValue": 729412927367.67,
                "timestamp": "1747008000"
            },
            {
                "marketCap": 3315483887226.43,
                "volume": 180686917309.45,
                "btcValue": 2042204747554.84,
                "ethValue": 301350747420.78,
                "stableValue": 226790309164.30,
                "otherValue": 745138083086.51,
                "timestamp": "1747094400"
            },
            {
                "marketCap": 3384993704659.26,
                "volume": 148864262004.06,
                "btcValue": 2069071665763.48,
                "ethValue": 323582207392.24,
                "stableValue": 226741037893.64,
                "otherValue": 765598793609.90,
                "timestamp": "1747180800"
            },
            {
                "marketCap": 3341132865123.04,
                "volume": 127575048510.14,
                "btcValue": 2056638846923.36,
                "ethValue": 315113264611.56,
                "stableValue": 227102638666.27,
                "otherValue": 742278114921.85,
                "timestamp": "1747267200"
            },
            {
                "marketCap": 3306851935866.14,
                "volume": 133125570906.25,
                "btcValue": 2061068560996.81,
                "ethValue": 307625719307.28,
                "stableValue": 227257883762.41,
                "otherValue": 710899771799.64,
                "timestamp": "1747353600"
            },
            {
                "marketCap": 3296202571544.31,
                "volume": 109018019744.93,
                "btcValue": 2055973755945.50,
                "ethValue": 306381127333.73,
                "stableValue": 228116565884.24,
                "otherValue": 705731122380.84,
                "timestamp": "1747440000"
            },
            {
                "marketCap": 3269729880656.18,
                "volume": 93708649277.60,
                "btcValue": 2049360063130.52,
                "ethValue": 298888378981.75,
                "stableValue": 228279385696.90,
                "otherValue": 693202052847.01,
                "timestamp": "1747526400"
            },
            {
                "marketCap": 3365862234590.21,
                "volume": 122440977924.21,
                "btcValue": 2115974489238.74,
                "ethValue": 301782532947.64,
                "stableValue": 228345572081.83,
                "otherValue": 719759640322.00,
                "timestamp": "1747612800"
            },
            {
                "marketCap": 3334929360512.02,
                "volume": 138337288635.66,
                "btcValue": 2098354512189.89,
                "ethValue": 305271892356.01,
                "stableValue": 228189705461.58,
                "otherValue": 703113250504.54,
                "timestamp": "1747699200"
            },
            {
                "marketCap": 3361605784601.77,
                "volume": 107062008254.79,
                "btcValue": 2122923298621.08,
                "ethValue": 304805572715.86,
                "stableValue": 228454926289.63,
                "otherValue": 705421986975.20,
                "timestamp": "1747785600"
            },
            {
                "marketCap": 3441643763241.35,
                "volume": 172915877576.77,
                "btcValue": 2178848742410.50,
                "ethValue": 308076653021.67,
                "stableValue": 229336620890.05,
                "otherValue": 725381746919.13,
                "timestamp": "1747872000"
            },
            {
                "marketCap": 3521198923414.85,
                "volume": 163241461699.66,
                "btcValue": 2219308502946.71,
                "ethValue": 321701272269.77,
                "stableValue": 230021149043.65,
                "otherValue": 750167999154.72,
                "timestamp": "1747958400"
            },
            {
                "marketCap": 3375353066586.07,
                "volume": 172245079173.61,
                "btcValue": 2132625289723.37,
                "ethValue": 305018329465.52,
                "stableValue": 230716423849.42,
                "otherValue": 706993023547.76,
                "timestamp": "1748044800"
            },
            {
                "marketCap": 3394107202665.36,
                "volume": 95962508702.49,
                "btcValue": 2141720300419.25,
                "ethValue": 305452794761.45,
                "stableValue": 230988776866.43,
                "otherValue": 715945330618.23,
                "timestamp": "1748131200"
            },
            {
                "marketCap": 3425272030195.48,
                "volume": 103453439172.30,
                "btcValue": 2166229936752.01,
                "ethValue": 308086603417.06,
                "stableValue": 230977613540.85,
                "otherValue": 719977876485.56,
                "timestamp": "1748217600"
            },
            {
                "marketCap": 3429916633449.51,
                "volume": 103370553748.48,
                "btcValue": 2174991072697.38,
                "ethValue": 309601600498.26,
                "stableValue": 230862670067.78,
                "otherValue": 714461290186.09,
                "timestamp": "1748304000"
            },
            {
                "marketCap": 3441420258700.16,
                "volume": 132560042498.69,
                "btcValue": 2165541690599.97,
                "ethValue": 321387342322.62,
                "stableValue": 230684822055.73,
                "otherValue": 723806403721.84,
                "timestamp": "1748390400"
            },
            {
                "marketCap": 3411688276306.90,
                "volume": 116705882803.11,
                "btcValue": 2142047485621.43,
                "ethValue": 323777568253.27,
                "stableValue": 230703908348.90,
                "otherValue": 715159314083.30,
                "timestamp": "1748476800"
            },
            {
                "marketCap": 3344158837150.71,
                "volume": 135572077211.01,
                "btcValue": 2098028675807.85,
                "ethValue": 317708959397.64,
                "stableValue": 230652009161.79,
                "otherValue": 697769192783.43,
                "timestamp": "1748563200"
            },
            {
                "marketCap": 3257644725323.91,
                "volume": 150209766209.61,
                "btcValue": 2066866683699.84,
                "ethValue": 305565313666.31,
                "stableValue": 230856355719.93,
                "otherValue": 654356372237.83,
                "timestamp": "1748649600"
            },
            {
                "marketCap": 3275399283271.81,
                "volume": 102369694163.04,
                "btcValue": 2079585565169.79,
                "ethValue": 305332955546.78,
                "stableValue": 230829262817.66,
                "otherValue": 659651499737.58,
                "timestamp": "1748736000"
            },
            {
                "marketCap": 3302646623160.53,
                "volume": 88111607455.88,
                "btcValue": 2099807690532.75,
                "ethValue": 306514728789.75,
                "stableValue": 230837427289.18,
                "otherValue": 665486776548.85,
                "timestamp": "1748822400"
            },
            {
                "marketCap": 3322372941727.33,
                "volume": 105318828902.31,
                "btcValue": 2104230548925.71,
                "ethValue": 314799385706.68,
                "stableValue": 231436326940.83,
                "otherValue": 671906680154.11,
                "timestamp": "1748908800"
            },
            {
                "marketCap": 3313020619377.92,
                "volume": 111737129534.39,
                "btcValue": 2095466174820.73,
                "ethValue": 313214063868.16,
                "stableValue": 232030821406.26,
                "otherValue": 672309559282.77,
                "timestamp": "1748995200"
            },
            {
                "marketCap": 3290728491343.64,
                "volume": 104637725601.77,
                "btcValue": 2081845328378.56,
                "ethValue": 314923636157.68,
                "stableValue": 232537099776.96,
                "otherValue": 661422427030.44,
                "timestamp": "1749081600"
            },
            {
                "marketCap": 3171640219646.37,
                "volume": 137030274449.34,
                "btcValue": 2018890530915.29,
                "ethValue": 291694839515.09,
                "stableValue": 232342699127.82,
                "otherValue": 628712150088.17,
                "timestamp": "1749168000"
            },
            {
                "marketCap": 3250773613241.06,
                "volume": 111686175096.30,
                "btcValue": 2074816005757.94,
                "ethValue": 299156880836.03,
                "stableValue": 232823115689.92,
                "otherValue": 643977610957.17,
                "timestamp": "1749254400"
            },
            {
                "marketCap": 3295079839234.35,
                "volume": 85348922273.22,
                "btcValue": 2099669236592.94,
                "ethValue": 304981651772.91,
                "stableValue": 233148958437.72,
                "otherValue": 657279992430.78,
                "timestamp": "1749340800"
            },
            {
                "marketCap": 3301947743973.64,
                "volume": 89177750002.44,
                "btcValue": 2102735565663.25,
                "ethValue": 303124422897.57,
                "stableValue": 233422922015.24,
                "otherValue": 662664833397.58,
                "timestamp": "1749427200"
            },
            {
                "marketCap": 3440137021406.84,
                "volume": 122300615404.95,
                "btcValue": 2192423919451.82,
                "ethValue": 323690539334.99,
                "stableValue": 233360139442.54,
                "otherValue": 690662423177.49,
                "timestamp": "1749513600"
            },
            {
                "marketCap": 3469534860205.16,
                "volume": 144905293680.90,
                "btcValue": 2191474784151.42,
                "ethValue": 339814539943.45,
                "stableValue": 233608036587.25,
                "otherValue": 704637499523.04,
                "timestamp": "1749600000"
            },
            {
                "marketCap": 3417060495421.26,
                "volume": 133670615315.03,
                "btcValue": 2160452097401.00,
                "ethValue": 334743875645.41,
                "stableValue": 233768582389.70,
                "otherValue": 688095939985.15,
                "timestamp": "1749686400"
            },
            {
                "marketCap": 3316178396809.45,
                "volume": 127160863010.93,
                "btcValue": 2101699962617.61,
                "ethValue": 319162949334.35,
                "stableValue": 233813651540.75,
                "otherValue": 661501833316.74,
                "timestamp": "1749772800"
            },
            {
                "marketCap": 3303513358182.01,
                "volume": 167117046235.32,
                "btcValue": 2109244069058.03,
                "ethValue": 311435841047.72,
                "stableValue": 234381618752.89,
                "otherValue": 648451829323.37,
                "timestamp": "1749859200"
            },
            {
                "marketCap": 3261087226533.01,
                "volume": 90939374569.75,
                "btcValue": 2084547602849.62,
                "ethValue": 304291399794.38,
                "stableValue": 234663297479.38,
                "otherValue": 637584926409.63,
                "timestamp": "1749916800"
            },
            {
                "marketCap": 3245373667162.80,
                "volume": 88370371861.46,
                "btcValue": 2077185303326.76,
                "ethValue": 301697822216.81,
                "stableValue": 234659525284.45,
                "otherValue": 631831016334.78,
                "timestamp": "1749920400"
            },
            {
                "marketCap": 3253769061049.50,
                "volume": 87779069844.38,
                "btcValue": 2080444723264.64,
                "ethValue": 303314093493.73,
                "stableValue": 234674539115.49,
                "otherValue": 635335705175.64,
                "timestamp": "1749924000"
            },
            {
                "marketCap": 3256716064308.50,
                "volume": 84714388191.44,
                "btcValue": 2086018266965.55,
                "ethValue": 302919601443.26,
                "stableValue": 234676206799.83,
                "otherValue": 633101989099.86,
                "timestamp": "1749927600"
            },
            {
                "marketCap": 3252593398321.96,
                "volume": 83663510664.91,
                "btcValue": 2081513010084.77,
                "ethValue": 302918088006.40,
                "stableValue": 234641813601.74,
                "otherValue": 633520486629.05,
                "timestamp": "1749931200"
            },
            {
                "marketCap": 3255580615735.85,
                "volume": 83938436149.76,
                "btcValue": 2086060131989.16,
                "ethValue": 303030383133.08,
                "stableValue": 234655989706.49,
                "otherValue": 631834110907.12,
                "timestamp": "1749934800"
            },
            {
                "marketCap": 3273002383642.20,
                "volume": 82685250749.64,
                "btcValue": 2094920505141.56,
                "ethValue": 305284479620.23,
                "stableValue": 234691337755.38,
                "otherValue": 638106061125.03,
                "timestamp": "1749938400"
            },
            {
                "marketCap": 3272975459246.65,
                "volume": 83594866704.06,
                "btcValue": 2096225276080.55,
                "ethValue": 305111273680.19,
                "stableValue": 234635886382.74,
                "otherValue": 637003023103.17,
                "timestamp": "1749942000"
            },
            {
                "marketCap": 3275383864728.55,
                "volume": 82538151594.87,
                "btcValue": 2096758142792.54,
                "ethValue": 305758218964.14,
                "stableValue": 234667878750.70,
                "otherValue": 638199624221.17,
                "timestamp": "1749945600"
            },
            {
                "marketCap": 3283007022587.59,
                "volume": 80549360247.03,
                "btcValue": 2101081993284.53,
                "ethValue": 306434346559.66,
                "stableValue": 234628519833.60,
                "otherValue": 640862162909.80,
                "timestamp": "1749949200"
            },
            {
                "marketCap": 3275949272418.26,
                "volume": 78163079780.11,
                "btcValue": 2096517802609.91,
                "ethValue": 305451829485.65,
                "stableValue": 234626616049.56,
                "otherValue": 639353024273.14,
                "timestamp": "1749952800"
            },
            {
                "marketCap": 3278348775960.98,
                "volume": 78283994474.37,
                "btcValue": 2097862146818.62,
                "ethValue": 305438670048.64,
                "stableValue": 234616630697.14,
                "otherValue": 640431328396.58,
                "timestamp": "1749956400"
            },
            {
                "marketCap": 3278922092279.57,
                "volume": 76838206074.90,
                "btcValue": 2097654074873.48,
                "ethValue": 305608828758.03,
                "stableValue": 234636106857.07,
                "otherValue": 641023081790.99,
                "timestamp": "1749960000"
            },
            {
                "marketCap": 3283722440299.68,
                "volume": 76360176993.23,
                "btcValue": 2099348435260.10,
                "ethValue": 307154669423.09,
                "stableValue": 234632065209.89,
                "otherValue": 642587270406.60,
                "timestamp": "1749963600"
            },
            {
                "marketCap": 3296449173098.68,
                "volume": 76819050179.18,
                "btcValue": 2109345902069.00,
                "ethValue": 308092920149.25,
                "stableValue": 234626344202.06,
                "otherValue": 644384006678.37,
                "timestamp": "1749967200"
            },
            {
                "marketCap": 3280305832364.72,
                "volume": 78568416135.13,
                "btcValue": 2097311316360.36,
                "ethValue": 306228233205.16,
                "stableValue": 234638149957.37,
                "otherValue": 642128132841.83,
                "timestamp": "1749970800"
            },
            {
                "marketCap": 3277685444044.68,
                "volume": 77896627394.80,
                "btcValue": 2096612020093.79,
                "ethValue": 305456789059.00,
                "stableValue": 234601675751.28,
                "otherValue": 641014959140.61,
                "timestamp": "1749974400"
            },
            {
                "marketCap": 3269669652069.80,
                "volume": 77971227031.18,
                "btcValue": 2091498290322.62,
                "ethValue": 304422495265.07,
                "stableValue": 234584263331.18,
                "otherValue": 639164603150.93,
                "timestamp": "1749978000"
            },
            {
                "marketCap": 3261547068768.28,
                "volume": 77613240576.31,
                "btcValue": 2086487031495.13,
                "ethValue": 303141574508.50,
                "stableValue": 234610642111.38,
                "otherValue": 637307820653.27,
                "timestamp": "1749981600"
            },
            {
                "marketCap": 3269791061202.39,
                "volume": 78650787272.10,
                "btcValue": 2090490804788.82,
                "ethValue": 304336674227.85,
                "stableValue": 234601592768.48,
                "otherValue": 640361989417.24,
                "timestamp": "1749985200"
            },
            {
                "marketCap": 3265881168650.02,
                "volume": 78765439131.72,
                "btcValue": 2087110696754.80,
                "ethValue": 303791450798.49,
                "stableValue": 234572301029.42,
                "otherValue": 640406720067.31,
                "timestamp": "1749988800"
            },
            {
                "marketCap": 3276083165221.14,
                "volume": 78234524610.18,
                "btcValue": 2093598714129.80,
                "ethValue": 305029830703.95,
                "stableValue": 234585417747.41,
                "otherValue": 642869202639.98,
                "timestamp": "1749992400"
            },
            {
                "marketCap": 3283657120139.25,
                "volume": 79024231514.26,
                "btcValue": 2098394727030.96,
                "ethValue": 307022019297.99,
                "stableValue": 234572279081.60,
                "otherValue": 643668094728.70,
                "timestamp": "1749996000"
            },
            {
                "marketCap": 3291408362826.24,
                "volume": 81074585300.26,
                "btcValue": 2100772326889.62,
                "ethValue": 307774227379.56,
                "stableValue": 234554016120.13,
                "otherValue": 648307792436.93,
                "timestamp": "1749999600"
            },
            {
                "marketCap": 3285191599895.38,
                "volume": 80282319860.36,
                "btcValue": 2098938313124.84,
                "ethValue": 306884209591.83,
                "stableValue": 234559527146.71,
                "otherValue": 644809550032.00,
                "timestamp": "1750003200"
            },
            {
                "marketCap": 3286731929023.83,
                "volume": 78838422416.88,
                "btcValue": 2098988840587.48,
                "ethValue": 308026300444.88,
                "stableValue": 234567078443.50,
                "otherValue": 645149709547.97,
                "timestamp": "1750006800"
            },
            {
                "marketCap": 3290628311707.62,
                "volume": 79343026615.93,
                "btcValue": 2101335346854.70,
                "ethValue": 308333518896.50,
                "stableValue": 234555575663.23,
                "otherValue": 646403870293.19,
                "timestamp": "1750010400"
            },
            {
                "marketCap": 3285504827604.01,
                "volume": 77832605814.16,
                "btcValue": 2097558407296.12,
                "ethValue": 307742685997.08,
                "stableValue": 234577023809.49,
                "otherValue": 645626710501.32,
                "timestamp": "1750014000"
            },
            {
                "marketCap": 3277623580678.26,
                "volume": 75476805557.81,
                "btcValue": 2093424825051.21,
                "ethValue": 306318050160.22,
                "stableValue": 234578469964.19,
                "otherValue": 643302235502.64,
                "timestamp": "1750017600"
            },
            {
                "marketCap": 3255607918259.63,
                "volume": 78719179281.29,
                "btcValue": 2081882026905.19,
                "ethValue": 302078012737.54,
                "stableValue": 234546646968.82,
                "otherValue": 637101231648.08,
                "timestamp": "1750021200"
            },
            {
                "marketCap": 3262049986701.58,
                "volume": 77537338995.06,
                "btcValue": 2083328706799.56,
                "ethValue": 303878548296.45,
                "stableValue": 234516158190.02,
                "otherValue": 640326573415.55,
                "timestamp": "1750024800"
            },
            {
                "marketCap": 3280286296270.24,
                "volume": 79732962834.60,
                "btcValue": 2092766084574.21,
                "ethValue": 307201426763.66,
                "stableValue": 234539235177.86,
                "otherValue": 645779549754.51,
                "timestamp": "1750028400"
            },
            {
                "marketCap": 3287463042469.71,
                "volume": 81507637580.79,
                "btcValue": 2098658810813.37,
                "ethValue": 307565756134.74,
                "stableValue": 234536284727.67,
                "otherValue": 646702190793.93,
                "timestamp": "1750032000"
            },
            {
                "marketCap": 3282757702077.87,
                "volume": 82211555104.76,
                "btcValue": 2096153825249.22,
                "ethValue": 307222993863.47,
                "stableValue": 234543192448.20,
                "otherValue": 644837690516.98,
                "timestamp": "1750035600"
            },
            {
                "marketCap": 3297353878739.65,
                "volume": 83408580043.02,
                "btcValue": 2103901059216.22,
                "ethValue": 308485454517.94,
                "stableValue": 234583690848.89,
                "otherValue": 650383674156.60,
                "timestamp": "1750039200"
            },
            {
                "marketCap": 3300764656934.53,
                "volume": 87485278786.28,
                "btcValue": 2103416248576.44,
                "ethValue": 310839144221.69,
                "stableValue": 234591679036.20,
                "otherValue": 651917585100.20,
                "timestamp": "1750042800"
            },
            {
                "marketCap": 3301275063258.98,
                "volume": 88352258331.85,
                "btcValue": 2105565698777.12,
                "ethValue": 310138539321.70,
                "stableValue": 234509100854.71,
                "otherValue": 651061724305.45,
                "timestamp": "1750046400"
            },
            {
                "marketCap": 3313624642212.87,
                "volume": 90145849044.68,
                "btcValue": 2115043162178.49,
                "ethValue": 311012321347.72,
                "stableValue": 234499319713.60,
                "otherValue": 653069838973.06,
                "timestamp": "1750050000"
            },
            {
                "marketCap": 3324170304487.17,
                "volume": 92029401660.90,
                "btcValue": 2118602639284.40,
                "ethValue": 314780735268.22,
                "stableValue": 234513688996.50,
                "otherValue": 656273240938.05,
                "timestamp": "1750053600"
            },
            {
                "marketCap": 3325551251792.18,
                "volume": 92092609684.41,
                "btcValue": 2118987438065.77,
                "ethValue": 314828064672.12,
                "stableValue": 234529420076.33,
                "otherValue": 657206328977.96,
                "timestamp": "1750057200"
            },
            {
                "marketCap": 3340664112738.90,
                "volume": 95958869319.47,
                "btcValue": 2128485257377.85,
                "ethValue": 317315152444.00,
                "stableValue": 234522745155.17,
                "otherValue": 660340957761.88,
                "timestamp": "1750060800"
            },
            {
                "marketCap": 3342874964629.85,
                "volume": 97541284257.17,
                "btcValue": 2130860689764.14,
                "ethValue": 317512588289.92,
                "stableValue": 234540713072.45,
                "otherValue": 659960973503.34,
                "timestamp": "1750064400"
            },
            {
                "marketCap": 3336594592671.14,
                "volume": 98091925966.93,
                "btcValue": 2126218262617.07,
                "ethValue": 316492151910.34,
                "stableValue": 234523914516.28,
                "otherValue": 659360263627.45,
                "timestamp": "1750068000"
            },
            {
                "marketCap": 3332248475213.39,
                "volume": 97783513083.04,
                "btcValue": 2123740775332.94,
                "ethValue": 315991348015.53,
                "stableValue": 234542500478.33,
                "otherValue": 657973851386.59,
                "timestamp": "1750071600"
            },
            {
                "marketCap": 3336927501854.25,
                "volume": 102227843438.99,
                "btcValue": 2124837511181.28,
                "ethValue": 315947398276.78,
                "stableValue": 234531725268.03,
                "otherValue": 661610867128.16,
                "timestamp": "1750075200"
            },
            {
                "marketCap": 3333310359015.91,
                "volume": 104071187446.57,
                "btcValue": 2121123653892.14,
                "ethValue": 315747747236.18,
                "stableValue": 234531949929.02,
                "otherValue": 661907007958.57,
                "timestamp": "1750078800"
            },
            {
                "marketCap": 3348484184905.61,
                "volume": 104925705355.30,
                "btcValue": 2130598446357.29,
                "ethValue": 318820498115.44,
                "stableValue": 234553926517.78,
                "otherValue": 664511313915.10,
                "timestamp": "1750082400"
            },
            {
                "marketCap": 3359726994245.05,
                "volume": 108712523167.15,
                "btcValue": 2138148773552.39,
                "ethValue": 318775918118.05,
                "stableValue": 234622794816.45,
                "otherValue": 668179507758.16,
                "timestamp": "1750086000"
            },
            {
                "marketCap": 3356431936866.08,
                "volume": 110936536979.02,
                "btcValue": 2136611392261.53,
                "ethValue": 317902058767.21,
                "stableValue": 234606605132.38,
                "otherValue": 667311880704.96,
                "timestamp": "1750089600"
            },
            {
                "marketCap": 3367365961308.55,
                "volume": 111993542347.41,
                "btcValue": 2143181712953.33,
                "ethValue": 318379328215.09,
                "stableValue": 234623230706.64,
                "otherValue": 671181689433.49,
                "timestamp": "1750093200"
            },
            {
                "marketCap": 3364021539065.06,
                "volume": 111839514620.83,
                "btcValue": 2142568369146.49,
                "ethValue": 318030594747.78,
                "stableValue": 234635505429.29,
                "otherValue": 668787069741.50,
                "timestamp": "1750096800"
            },
            {
                "marketCap": 3379774108703.97,
                "volume": 114243137866.67,
                "btcValue": 2152972866497.71,
                "ethValue": 320531462071.89,
                "stableValue": 234639659721.27,
                "otherValue": 671630120413.10,
                "timestamp": "1750100400"
            },
            {
                "marketCap": 3386636541105.90,
                "volume": 118129197411.38,
                "btcValue": 2160103277315.08,
                "ethValue": 321242721619.13,
                "stableValue": 234602216069.79,
                "otherValue": 670688326101.90,
                "timestamp": "1750104000"
            },
            {
                "marketCap": 3392917838733.45,
                "volume": 118392246366.85,
                "btcValue": 2163611974005.27,
                "ethValue": 322434045784.57,
                "stableValue": 234604756669.06,
                "otherValue": 672267062274.55,
                "timestamp": "1750107600"
            },
            {
                "marketCap": 3382450817171.93,
                "volume": 119039458626.83,
                "btcValue": 2158114243777.23,
                "ethValue": 319901193467.81,
                "stableValue": 234610036842.44,
                "otherValue": 669825343084.45,
                "timestamp": "1750111200"
            },
            {
                "marketCap": 3346110639611.73,
                "volume": 120629002540.66,
                "btcValue": 2142165352778.23,
                "ethValue": 310543893206.44,
                "stableValue": 234653698236.04,
                "otherValue": 658747695391.02,
                "timestamp": "1750114800"
            },
            {
                "marketCap": 3315140978188.43,
                "volume": 123693969818.42,
                "btcValue": 2122943938696.95,
                "ethValue": 306949052131.22,
                "stableValue": 234630957926.61,
                "otherValue": 650617029433.65,
                "timestamp": "1750118400"
            },
            {
                "marketCap": 3333271474635.07,
                "volume": 131548173257.35,
                "btcValue": 2132541802284.05,
                "ethValue": 312401847969.15,
                "stableValue": 234624034865.86,
                "otherValue": 653703789516.01,
                "timestamp": "1750122000"
            },
            {
                "marketCap": 3332230954189.84,
                "volume": 133042254368.09,
                "btcValue": 2131264614013.19,
                "ethValue": 311661890609.16,
                "stableValue": 234644512264.49,
                "otherValue": 654659937303.00,
                "timestamp": "1750125600"
            },
            {
                "marketCap": 3344058361640.84,
                "volume": 131632398455.44,
                "btcValue": 2137457157682.29,
                "ethValue": 315044349998.49,
                "stableValue": 234626881462.90,
                "otherValue": 656929972497.16,
                "timestamp": "1750129200"
            },
            {
                "marketCap": 3345588371436.81,
                "volume": 135060567113.11,
                "btcValue": 2139422294445.21,
                "ethValue": 314752386491.04,
                "stableValue": 234597112149.09,
                "otherValue": 656816578351.47,
                "timestamp": "1750132800"
            },
            {
                "marketCap": 3337287090276.75,
                "volume": 133571491380.91,
                "btcValue": 2134067825290.48,
                "ethValue": 313099650550.54,
                "stableValue": 234598208352.73,
                "otherValue": 655521406083.00,
                "timestamp": "1750136400"
            },
            {
                "marketCap": 3329721831856.19,
                "volume": 132519490268.24,
                "btcValue": 2129932599976.40,
                "ethValue": 311524560047.51,
                "stableValue": 234563644322.28,
                "otherValue": 653701027510.00,
                "timestamp": "1750140000"
            },
            {
                "marketCap": 3322827710983.93,
                "volume": 133111594844.25,
                "btcValue": 2124194917378.70,
                "ethValue": 311737024313.94,
                "stableValue": 234591767840.76,
                "otherValue": 652304001450.53,
                "timestamp": "1750143600"
            },
            {
                "marketCap": 3322254695341.88,
                "volume": 130652906839.08,
                "btcValue": 2122982093282.31,
                "ethValue": 311900391742.78,
                "stableValue": 234549654575.56,
                "otherValue": 652822555741.23,
                "timestamp": "1750147200"
            },
            {
                "marketCap": 3312173554030.28,
                "volume": 130714378411.69,
                "btcValue": 2118802866364.34,
                "ethValue": 310512039630.84,
                "stableValue": 234553778369.68,
                "otherValue": 648304869665.42,
                "timestamp": "1750150800"
            },
            {
                "marketCap": 3302284581758.69,
                "volume": 130377996469.83,
                "btcValue": 2110834944394.77,
                "ethValue": 309877180411.94,
                "stableValue": 234529478627.19,
                "otherValue": 647042978324.79,
                "timestamp": "1750154400"
            },
            {
                "marketCap": 3295934698809.92,
                "volume": 131361979790.77,
                "btcValue": 2106686736531.16,
                "ethValue": 308717671935.61,
                "stableValue": 234489983912.50,
                "otherValue": 646040306430.65,
                "timestamp": "1750158000"
            },
            {
                "marketCap": 3285869087368.80,
                "volume": 130879037067.39,
                "btcValue": 2100155437310.74,
                "ethValue": 308131001817.26,
                "stableValue": 234463281443.33,
                "otherValue": 643119366797.47,
                "timestamp": "1750161600"
            },
            {
                "marketCap": 3282952602313.33,
                "volume": 130199957622.86,
                "btcValue": 2097764076744.67,
                "ethValue": 307637754887.40,
                "stableValue": 234475484375.95,
                "otherValue": 643075286305.31,
                "timestamp": "1750165200"
            },
            {
                "marketCap": 3282286729389.64,
                "volume": 130856650510.70,
                "btcValue": 2094755334908.53,
                "ethValue": 308366146369.96,
                "stableValue": 234523638316.08,
                "otherValue": 644641609795.07,
                "timestamp": "1750168800"
            },
            {
                "marketCap": 3268869241930.77,
                "volume": 128193846872.25,
                "btcValue": 2084922855045.09,
                "ethValue": 305876612826.20,
                "stableValue": 234584128303.21,
                "otherValue": 643485645756.27,
                "timestamp": "1750172400"
            },
            {
                "marketCap": 3242874504611.18,
                "volume": 132085145577.94,
                "btcValue": 2072306575460.46,
                "ethValue": 301666161210.12,
                "stableValue": 234537767385.45,
                "otherValue": 634364000555.15,
                "timestamp": "1750176000"
            },
            {
                "marketCap": 3218736557912.90,
                "volume": 134824917650.82,
                "btcValue": 2059803550465.53,
                "ethValue": 297313322740.92,
                "stableValue": 234527568662.44,
                "otherValue": 627092116044.01,
                "timestamp": "1750179600"
            },
            {
                "marketCap": 3226512275096.95,
                "volume": 138743132116.45,
                "btcValue": 2064503391430.85,
                "ethValue": 298074140077.71,
                "stableValue": 234524980983.49,
                "otherValue": 629409762604.90,
                "timestamp": "1750183200"
            },
            {
                "marketCap": 3245621146915.09,
                "volume": 139184915394.32,
                "btcValue": 2075889655423.34,
                "ethValue": 301449804893.90,
                "stableValue": 234521876897.91,
                "otherValue": 633759809699.94,
                "timestamp": "1750186800"
            },
            {
                "marketCap": 3263013570868.15,
                "volume": 139945151032.50,
                "btcValue": 2081967896049.50,
                "ethValue": 305390219937.80,
                "stableValue": 234583904381.79,
                "otherValue": 641071550499.06,
                "timestamp": "1750190400"
            },
            {
                "marketCap": 3249030826586.80,
                "volume": 140723232169.80,
                "btcValue": 2075380027856.02,
                "ethValue": 303158629029.62,
                "stableValue": 234567890654.07,
                "otherValue": 635924279047.09,
                "timestamp": "1750194000"
            },
            {
                "marketCap": 3251075503110.73,
                "volume": 142222445666.57,
                "btcValue": 2079056259238.64,
                "ethValue": 304322819626.57,
                "stableValue": 234558447620.93,
                "otherValue": 633137976624.59,
                "timestamp": "1750197600"
            },
            {
                "marketCap": 3238808395758.23,
                "volume": 136343695640.56,
                "btcValue": 2072176833339.98,
                "ethValue": 301155758866.56,
                "stableValue": 234496197767.27,
                "otherValue": 630979605784.42,
                "timestamp": "1750201200"
            },
            {
                "marketCap": 3250011514831.32,
                "volume": 132023219344.45,
                "btcValue": 2079071715396.64,
                "ethValue": 303031366313.05,
                "stableValue": 234507301547.63,
                "otherValue": 633401131574.00,
                "timestamp": "1750204800"
            },
            {
                "marketCap": 3258902957411.33,
                "volume": 126896347150.97,
                "btcValue": 2084214197441.52,
                "ethValue": 304956747233.98,
                "stableValue": 234478439762.15,
                "otherValue": 635253572973.68,
                "timestamp": "1750208400"
            },
            {
                "marketCap": 3256821840259.87,
                "volume": 125834570152.84,
                "btcValue": 2083180746795.41,
                "ethValue": 304208180073.28,
                "stableValue": 234525540751.10,
                "otherValue": 634907372640.08,
                "timestamp": "1750212000"
            },
            {
                "marketCap": 3259415772384.19,
                "volume": 125199417622.11,
                "btcValue": 2085188002646.29,
                "ethValue": 303850706883.85,
                "stableValue": 234519878887.93,
                "otherValue": 635857183966.12,
                "timestamp": "1750215600"
            },
            {
                "marketCap": 3267651889896.97,
                "volume": 122977200024.68,
                "btcValue": 2091149956010.68,
                "ethValue": 305210379597.63,
                "stableValue": 234469355974.94,
                "otherValue": 636822198313.72,
                "timestamp": "1750219200"
            },
            {
                "marketCap": 3276580748036.83,
                "volume": 123188222637.26,
                "btcValue": 2096755772473.89,
                "ethValue": 306255649121.29,
                "stableValue": 234468841537.95,
                "otherValue": 639100484903.70,
                "timestamp": "1750222800"
            },
            {
                "marketCap": 3275357825959.43,
                "volume": 122039339892.29,
                "btcValue": 2095857309054.11,
                "ethValue": 306335155947.27,
                "stableValue": 234434425337.76,
                "otherValue": 638730935620.29,
                "timestamp": "1750226400"
            },
            {
                "marketCap": 3261836584864.34,
                "volume": 121076211132.06,
                "btcValue": 2087435496866.06,
                "ethValue": 304823288695.53,
                "stableValue": 234460310774.41,
                "otherValue": 635117488528.34,
                "timestamp": "1750230000"
            },
            {
                "marketCap": 3263339287855.55,
                "volume": 121390023038.28,
                "btcValue": 2087220644711.17,
                "ethValue": 305836557686.36,
                "stableValue": 234568477253.54,
                "otherValue": 635713608204.48,
                "timestamp": "1750233600"
            },
            {
                "marketCap": 3261304681432.49,
                "volume": 119895697439.24,
                "btcValue": 2087103366102.80,
                "ethValue": 305869060664.17,
                "stableValue": 234591732137.71,
                "otherValue": 633740522527.81,
                "timestamp": "1750237200"
            },
            {
                "marketCap": 3252413048178.86,
                "volume": 119447050025.96,
                "btcValue": 2081470367326.80,
                "ethValue": 305020677416.30,
                "stableValue": 234497534710.76,
                "otherValue": 631424468725.00,
                "timestamp": "1750240800"
            },
            {
                "marketCap": 3231758073905.27,
                "volume": 118003968710.77,
                "btcValue": 2073234025260.11,
                "ethValue": 301239993564.97,
                "stableValue": 234498498993.48,
                "otherValue": 622785556086.71,
                "timestamp": "1750244400"
            },
            {
                "marketCap": 3249839972051.42,
                "volume": 118393313072.09,
                "btcValue": 2084495279962.36,
                "ethValue": 303451638614.75,
                "stableValue": 234490602894.19,
                "otherValue": 627402450580.12,
                "timestamp": "1750248000"
            },
            {
                "marketCap": 3236988822692.91,
                "volume": 117259835628.36,
                "btcValue": 2077955873528.66,
                "ethValue": 301097164751.02,
                "stableValue": 234449592126.99,
                "otherValue": 623486192286.24,
                "timestamp": "1750251600"
            },
            {
                "marketCap": 3236964980678.11,
                "volume": 117976779059.59,
                "btcValue": 2076513065562.29,
                "ethValue": 302105099728.03,
                "stableValue": 234496640221.95,
                "otherValue": 623850175165.84,
                "timestamp": "1750255200"
            },
            {
                "marketCap": 3242961385434.09,
                "volume": 121604137477.72,
                "btcValue": 2080147091749.18,
                "ethValue": 302578159038.00,
                "stableValue": 234517840095.07,
                "otherValue": 625718294551.84,
                "timestamp": "1750258800"
            },
            {
                "marketCap": 3249026212566.68,
                "volume": 118090549437.83,
                "btcValue": 2083879024063.87,
                "ethValue": 302943463564.34,
                "stableValue": 234482695658.75,
                "otherValue": 627721029279.72,
                "timestamp": "1750262400"
            },
            {
                "marketCap": 3238036802272.50,
                "volume": 114074370202.93,
                "btcValue": 2076936857506.48,
                "ethValue": 301944493645.82,
                "stableValue": 234474358123.17,
                "otherValue": 624681092997.03,
                "timestamp": "1750266000"
            },
            {
                "marketCap": 3237322427543.93,
                "volume": 109541272056.02,
                "btcValue": 2074437416611.64,
                "ethValue": 301419446717.07,
                "stableValue": 234508982576.39,
                "otherValue": 626956581638.83,
                "timestamp": "1750269600"
            },
            {
                "marketCap": 3217016764958.29,
                "volume": 112050781473.08,
                "btcValue": 2061395800542.79,
                "ethValue": 299128744376.60,
                "stableValue": 234562600723.78,
                "otherValue": 621929619315.12,
                "timestamp": "1750273200"
            },
            {
                "marketCap": 3225642600778.03,
                "volume": 109949986028.79,
                "btcValue": 2064111392209.44,
                "ethValue": 300839407261.47,
                "stableValue": 234441906430.68,
                "otherValue": 626249894876.44,
                "timestamp": "1750276800"
            },
            {
                "marketCap": 3257909355341.71,
                "volume": 111661918881.94,
                "btcValue": 2084272278167.07,
                "ethValue": 305318496946.60,
                "stableValue": 234456385840.73,
                "otherValue": 633862194387.31,
                "timestamp": "1750280400"
            },
            {
                "marketCap": 3263205774580.31,
                "volume": 112073252722.10,
                "btcValue": 2089360444982.80,
                "ethValue": 305450849042.16,
                "stableValue": 234376424213.53,
                "otherValue": 634018056341.82,
                "timestamp": "1750284000"
            },
            {
                "marketCap": 3257796851446.22,
                "volume": 112424305077.05,
                "btcValue": 2084545314920.62,
                "ethValue": 304904038770.43,
                "stableValue": 234402712219.46,
                "otherValue": 633944785535.71,
                "timestamp": "1750287600"
            },
            {
                "marketCap": 3257429809184.11,
                "volume": 110796480712.41,
                "btcValue": 2085591728920.59,
                "ethValue": 304837493314.45,
                "stableValue": 234350808540.41,
                "otherValue": 632649778408.66,
                "timestamp": "1750291200"
            },
            {
                "marketCap": 3262122731842.80,
                "volume": 112433253792.08,
                "btcValue": 2087072255632.82,
                "ethValue": 305417272169.25,
                "stableValue": 234348483434.27,
                "otherValue": 635284720606.46,
                "timestamp": "1750294800"
            },
            {
                "marketCap": 3248263856593.32,
                "volume": 111933153986.41,
                "btcValue": 2079673637016.02,
                "ethValue": 303603456231.69,
                "stableValue": 234277550981.17,
                "otherValue": 630709212364.44,
                "timestamp": "1750298400"
            },
            {
                "marketCap": 3251435332258.06,
                "volume": 111006189423.22,
                "btcValue": 2082391250626.38,
                "ethValue": 303602616210.45,
                "stableValue": 234308995984.71,
                "otherValue": 631132469436.52,
                "timestamp": "1750302000"
            },
            {
                "marketCap": 3261854708672.21,
                "volume": 110942698001.43,
                "btcValue": 2089809109922.26,
                "ethValue": 304936754916.46,
                "stableValue": 234258218930.40,
                "otherValue": 632850624903.09,
                "timestamp": "1750305600"
            },
            {
                "marketCap": 3261538492532.95,
                "volume": 111150450936.45,
                "btcValue": 2089408566482.73,
                "ethValue": 304819492453.20,
                "stableValue": 234243318827.21,
                "otherValue": 633067114769.81,
                "timestamp": "1750309200"
            },
            {
                "marketCap": 3258019592311.23,
                "volume": 111696986003.10,
                "btcValue": 2085810925317.25,
                "ethValue": 304545717017.43,
                "stableValue": 234264575523.53,
                "otherValue": 633398374453.02,
                "timestamp": "1750312800"
            },
            {
                "marketCap": 3250569569120.25,
                "volume": 111356789577.90,
                "btcValue": 2082153328229.08,
                "ethValue": 304148980304.92,
                "stableValue": 234189840644.77,
                "otherValue": 630077419941.48,
                "timestamp": "1750316400"
            },
            {
                "marketCap": 3249516287295.31,
                "volume": 109868008576.88,
                "btcValue": 2080800683305.71,
                "ethValue": 304131810961.06,
                "stableValue": 234339363817.19,
                "otherValue": 630244429211.35,
                "timestamp": "1750320000"
            },
            {
                "marketCap": 3252556683743.91,
                "volume": 109649340431.64,
                "btcValue": 2082645179003.30,
                "ethValue": 304701879199.35,
                "stableValue": 234323419247.23,
                "otherValue": 630886206294.03,
                "timestamp": "1750323600"
            },
            {
                "marketCap": 3261949972419.44,
                "volume": 109690233393.13,
                "btcValue": 2087865356702.89,
                "ethValue": 306540949145.32,
                "stableValue": 234336817670.48,
                "otherValue": 633206848900.75,
                "timestamp": "1750327200"
            },
            {
                "marketCap": 3259252696348.90,
                "volume": 107447918867.83,
                "btcValue": 2086145105575.64,
                "ethValue": 306497777062.04,
                "stableValue": 234317439603.33,
                "otherValue": 632292374107.89,
                "timestamp": "1750330800"
            },
            {
                "marketCap": 3253096088255.55,
                "volume": 106517696541.32,
                "btcValue": 2083646409857.49,
                "ethValue": 305733448674.88,
                "stableValue": 234276688936.69,
                "otherValue": 629439540786.49,
                "timestamp": "1750334400"
            },
            {
                "marketCap": 3251571142802.81,
                "volume": 101374993124.05,
                "btcValue": 2083003562536.07,
                "ethValue": 304948618734.17,
                "stableValue": 234286733046.89,
                "otherValue": 629332228485.68,
                "timestamp": "1750338000"
            },
            {
                "marketCap": 3238198650310.76,
                "volume": 100836458726.96,
                "btcValue": 2074000905752.30,
                "ethValue": 303072846430.41,
                "stableValue": 234295407830.07,
                "otherValue": 626829490297.98,
                "timestamp": "1750341600"
            },
            {
                "marketCap": 3232300466235.66,
                "volume": 96689258099.67,
                "btcValue": 2071207124078.55,
                "ethValue": 301603980078.26,
                "stableValue": 234308389913.55,
                "otherValue": 625180972165.30,
                "timestamp": "1750345200"
            },
            {
                "marketCap": 3230440495048.01,
                "volume": 96154680291.75,
                "btcValue": 2070032957047.81,
                "ethValue": 301037118419.15,
                "stableValue": 234299111467.24,
                "otherValue": 625071308113.81,
                "timestamp": "1750348800"
            },
            {
                "marketCap": 3226307565523.69,
                "volume": 94644690426.22,
                "btcValue": 2068136929620.20,
                "ethValue": 300398320588.76,
                "stableValue": 234272473108.39,
                "otherValue": 623499842206.34,
                "timestamp": "1750352400"
            },
            {
                "marketCap": 3244879318230.11,
                "volume": 93646708182.39,
                "btcValue": 2078358078456.99,
                "ethValue": 302871377460.91,
                "stableValue": 234267104991.25,
                "otherValue": 629382757320.96,
                "timestamp": "1750356000"
            },
            {
                "marketCap": 3240814917918.89,
                "volume": 91410073496.88,
                "btcValue": 2075945266660.00,
                "ethValue": 302413816157.37,
                "stableValue": 234271437176.31,
                "otherValue": 628184397925.21,
                "timestamp": "1750359600"
            },
            {
                "marketCap": 3240535681763.11,
                "volume": 87682899054.16,
                "btcValue": 2073124660712.69,
                "ethValue": 302515425315.33,
                "stableValue": 234248198415.41,
                "otherValue": 630647397319.68,
                "timestamp": "1750363200"
            },
            {
                "marketCap": 3239551573969.67,
                "volume": 85736212092.32,
                "btcValue": 2073385748455.76,
                "ethValue": 302717959863.58,
                "stableValue": 234240015301.40,
                "otherValue": 629207850348.93,
                "timestamp": "1750366800"
            },
            {
                "marketCap": 3241041341642.41,
                "volume": 84379095225.27,
                "btcValue": 2074447939251.09,
                "ethValue": 303051451293.23,
                "stableValue": 234236573278.27,
                "otherValue": 629305377819.82,
                "timestamp": "1750370400"
            },
            {
                "marketCap": 3252137203631.54,
                "volume": 84551503853.17,
                "btcValue": 2080267449322.45,
                "ethValue": 304784685788.72,
                "stableValue": 234259901148.02,
                "otherValue": 632825167372.35,
                "timestamp": "1750374000"
            },
            {
                "marketCap": 3252118162853.55,
                "volume": 84905800849.17,
                "btcValue": 2081104191204.67,
                "ethValue": 304399836989.76,
                "stableValue": 234273933138.36,
                "otherValue": 632340201520.76,
                "timestamp": "1750377600"
            },
            {
                "marketCap": 3254128356455.87,
                "volume": 83423115539.02,
                "btcValue": 2081768119548.69,
                "ethValue": 304952441623.29,
                "stableValue": 234421014067.86,
                "otherValue": 632986781216.03,
                "timestamp": "1750381200"
            },
            {
                "marketCap": 3255631696580.57,
                "volume": 82165654957.74,
                "btcValue": 2083593314118.22,
                "ethValue": 305158256964.95,
                "stableValue": 234441288909.32,
                "otherValue": 632438836588.08,
                "timestamp": "1750384800"
            },
            {
                "marketCap": 3248762555403.73,
                "volume": 82502707491.96,
                "btcValue": 2080304172188.83,
                "ethValue": 303989472092.00,
                "stableValue": 234284119394.63,
                "otherValue": 630184791728.27,
                "timestamp": "1750388400"
            },
            {
                "marketCap": 3248171701151.46,
                "volume": 82166787907.77,
                "btcValue": 2080483017744.00,
                "ethValue": 303993518698.44,
                "stableValue": 234285451031.05,
                "otherValue": 629409713677.97,
                "timestamp": "1750392000"
            },
            {
                "marketCap": 3235122751137.13,
                "volume": 80930606438.71,
                "btcValue": 2073289521411.94,
                "ethValue": 302426741511.14,
                "stableValue": 234303914654.17,
                "otherValue": 625102573559.88,
                "timestamp": "1750395600"
            },
            {
                "marketCap": 3245007056294.20,
                "volume": 80625620060.80,
                "btcValue": 2079451227057.19,
                "ethValue": 303741016015.06,
                "stableValue": 234279683519.18,
                "otherValue": 627535129702.77,
                "timestamp": "1750399200"
            },
            {
                "marketCap": 3249366523211.77,
                "volume": 81297697531.88,
                "btcValue": 2082355556287.60,
                "ethValue": 304406954053.53,
                "stableValue": 234285821269.49,
                "otherValue": 628318191601.15,
                "timestamp": "1750402800"
            },
            {
                "marketCap": 3281012143687.42,
                "volume": 82996718543.82,
                "btcValue": 2103761973772.18,
                "ethValue": 307741107653.48,
                "stableValue": 234275026832.55,
                "otherValue": 635234035429.21,
                "timestamp": "1750406400"
            },
            {
                "marketCap": 3285450785335.11,
                "volume": 85730251425.49,
                "btcValue": 2107683183484.47,
                "ethValue": 308348315625.68,
                "stableValue": 234307144017.03,
                "otherValue": 635112142207.93,
                "timestamp": "1750410000"
            },
            {
                "marketCap": 3284995782216.26,
                "volume": 87507470429.45,
                "btcValue": 2107155796601.57,
                "ethValue": 308364331981.69,
                "stableValue": 234268284670.78,
                "otherValue": 635207368962.22,
                "timestamp": "1750413600"
            },
            {
                "marketCap": 3285556732729.94,
                "volume": 88111794705.21,
                "btcValue": 2107227911749.76,
                "ethValue": 308283016405.42,
                "stableValue": 234258124842.38,
                "otherValue": 635787679732.38,
                "timestamp": "1750417200"
            },
            {
                "marketCap": 3285629350006.50,
                "volume": 88118834384.77,
                "btcValue": 2107375328230.42,
                "ethValue": 307866808969.09,
                "stableValue": 234244551400.20,
                "otherValue": 636142661406.79,
                "timestamp": "1750420800"
            },
            {
                "marketCap": 3286032808180.43,
                "volume": 87813027448.82,
                "btcValue": 2107322446813.62,
                "ethValue": 308115102774.59,
                "stableValue": 234248809404.45,
                "otherValue": 636346449187.77,
                "timestamp": "1750424400"
            },
            {
                "marketCap": 3274889394004.64,
                "volume": 89205818715.18,
                "btcValue": 2101159128835.28,
                "ethValue": 306197630215.74,
                "stableValue": 234270276259.03,
                "otherValue": 633262358694.59,
                "timestamp": "1750428000"
            },
            {
                "marketCap": 3227170061446.76,
                "volume": 90095176397.02,
                "btcValue": 2067258741825.78,
                "ethValue": 300755788343.19,
                "stableValue": 234265867326.43,
                "otherValue": 624889663951.36,
                "timestamp": "1750431600"
            },
            {
                "marketCap": 3230982225984.18,
                "volume": 95642323443.01,
                "btcValue": 2072204154408.62,
                "ethValue": 301090225410.55,
                "stableValue": 234242926358.77,
                "otherValue": 623444919806.24,
                "timestamp": "1750435200"
            },
            {
                "marketCap": 3215190090602.60,
                "volume": 98008102190.17,
                "btcValue": 2061471709384.46,
                "ethValue": 299689366024.32,
                "stableValue": 234320028577.88,
                "otherValue": 619708986615.94,
                "timestamp": "1750438800"
            },
            {
                "marketCap": 3191356761353.32,
                "volume": 106026047770.94,
                "btcValue": 2053680824990.88,
                "ethValue": 292367993326.78,
                "stableValue": 234382407477.41,
                "otherValue": 610925535558.25,
                "timestamp": "1750442400"
            },
            {
                "marketCap": 3193935705429.58,
                "volume": 110667616885.61,
                "btcValue": 2051352544175.60,
                "ethValue": 292120404016.70,
                "stableValue": 234427309993.02,
                "otherValue": 616035447244.26,
                "timestamp": "1750446000"
            },
            {
                "marketCap": 3198729074038.79,
                "volume": 111676105344.51,
                "btcValue": 2055028215383.62,
                "ethValue": 291729585226.63,
                "stableValue": 234316990382.92,
                "otherValue": 617654283045.62,
                "timestamp": "1750449600"
            },
            {
                "marketCap": 3209417146150.68,
                "volume": 113907307480.01,
                "btcValue": 2062182821421.26,
                "ethValue": 293027017288.29,
                "stableValue": 234343570542.69,
                "otherValue": 619863736898.44,
                "timestamp": "1750453200"
            },
            {
                "marketCap": 3201350762979.96,
                "volume": 113466104856.87,
                "btcValue": 2058522131518.05,
                "ethValue": 291739016091.65,
                "stableValue": 234314776519.77,
                "otherValue": 616774838850.49,
                "timestamp": "1750456800"
            },
            {
                "marketCap": 3185419234212.18,
                "volume": 113291563607.37,
                "btcValue": 2050358832462.40,
                "ethValue": 288595620968.43,
                "stableValue": 234374735042.98,
                "otherValue": 612090045738.37,
                "timestamp": "1750460400"
            },
            {
                "marketCap": 3193619333281.39,
                "volume": 115295735404.15,
                "btcValue": 2053961901000.32,
                "ethValue": 290544373949.69,
                "stableValue": 234386900298.11,
                "otherValue": 614726158033.27,
                "timestamp": "1750464000"
            },
            {
                "marketCap": 3193285216761.27,
                "volume": 114991821501.07,
                "btcValue": 2053037171046.93,
                "ethValue": 291162649585.37,
                "stableValue": 234339129593.51,
                "otherValue": 614746266535.46,
                "timestamp": "1750467600"
            },
            {
                "marketCap": 3203238874804.56,
                "volume": 115508504613.47,
                "btcValue": 2058229275109.10,
                "ethValue": 293418907479.39,
                "stableValue": 234355608643.77,
                "otherValue": 617235083572.30,
                "timestamp": "1750471200"
            },
            {
                "marketCap": 3202330871960.15,
                "volume": 115343767918.01,
                "btcValue": 2057918245435.10,
                "ethValue": 292565104754.99,
                "stableValue": 234352559924.39,
                "otherValue": 617494961845.67,
                "timestamp": "1750474800"
            },
            {
                "marketCap": 3204896576921.37,
                "volume": 115357998718.59,
                "btcValue": 2058601728778.31,
                "ethValue": 292919487350.43,
                "stableValue": 234340400786.13,
                "otherValue": 619034960006.50,
                "timestamp": "1750478400"
            },
            {
                "marketCap": 3199951197468.65,
                "volume": 114718578253.34,
                "btcValue": 2055940370554.88,
                "ethValue": 292487073855.01,
                "stableValue": 234352962361.64,
                "otherValue": 617170790697.12,
                "timestamp": "1750482000"
            },
            {
                "marketCap": 3201570976582.99,
                "volume": 114122083468.64,
                "btcValue": 2056648751530.60,
                "ethValue": 292652927928.68,
                "stableValue": 234343997700.39,
                "otherValue": 617925299423.32,
                "timestamp": "1750485600"
            },
            {
                "marketCap": 3205982108809.95,
                "volume": 113229642971.15,
                "btcValue": 2059726127888.64,
                "ethValue": 292788144448.76,
                "stableValue": 234355674605.82,
                "otherValue": 619112161866.73,
                "timestamp": "1750489200"
            },
            {
                "marketCap": 3202747792268.37,
                "volume": 110958390788.44,
                "btcValue": 2057277137621.65,
                "ethValue": 292984012968.18,
                "stableValue": 234349753671.78,
                "otherValue": 618136888006.76,
                "timestamp": "1750492800"
            },
            {
                "marketCap": 3212382709459.55,
                "volume": 105729789841.24,
                "btcValue": 2064318755151.31,
                "ethValue": 294760885824.90,
                "stableValue": 234330660831.59,
                "otherValue": 618972407651.75,
                "timestamp": "1750496400"
            },
            {
                "marketCap": 3214888502968.35,
                "volume": 106572832455.28,
                "btcValue": 2065043680489.00,
                "ethValue": 295158554825.84,
                "stableValue": 234364883007.44,
                "otherValue": 620321384646.07,
                "timestamp": "1750500000"
            },
            {
                "marketCap": 3213057584812.32,
                "volume": 105809861219.12,
                "btcValue": 2064918548511.47,
                "ethValue": 294448011023.37,
                "stableValue": 234343785355.39,
                "otherValue": 619347239922.09,
                "timestamp": "1750503600"
            },
            {
                "marketCap": 3214737627281.67,
                "volume": 105050874813.58,
                "btcValue": 2065665940609.22,
                "ethValue": 294876643341.58,
                "stableValue": 234320635036.35,
                "otherValue": 619874408294.52,
                "timestamp": "1750507200"
            },
            {
                "marketCap": 3209766960356.17,
                "volume": 104281111766.82,
                "btcValue": 2064248191266.84,
                "ethValue": 294105510563.76,
                "stableValue": 234328533115.60,
                "otherValue": 617084725409.97,
                "timestamp": "1750510800"
            },
            {
                "marketCap": 3198019790307.00,
                "volume": 101855076564.06,
                "btcValue": 2059614304899.05,
                "ethValue": 292256183705.83,
                "stableValue": 234358727390.39,
                "otherValue": 611790574311.73,
                "timestamp": "1750514400"
            },
            {
                "marketCap": 3196339038245.26,
                "volume": 98621894839.08,
                "btcValue": 2058478462089.09,
                "ethValue": 292143305930.42,
                "stableValue": 234347043035.17,
                "otherValue": 611370227190.58,
                "timestamp": "1750518000"
            },
            {
                "marketCap": 3197646338445.30,
                "volume": 94833347003.83,
                "btcValue": 2059880961694.85,
                "ethValue": 292672983393.48,
                "stableValue": 234356037891.23,
                "otherValue": 610736355465.74,
                "timestamp": "1750521600"
            },
            {
                "marketCap": 3195510064950.57,
                "volume": 92649763216.43,
                "btcValue": 2058322016776.82,
                "ethValue": 291940795755.33,
                "stableValue": 234340191398.67,
                "otherValue": 610907061019.75,
                "timestamp": "1750525200"
            },
            {
                "marketCap": 3181320190505.92,
                "volume": 81972146156.33,
                "btcValue": 2052021371011.40,
                "ethValue": 289687958554.81,
                "stableValue": 234334817637.97,
                "otherValue": 605276043301.74,
                "timestamp": "1750528800"
            },
            {
                "marketCap": 3167060156708.73,
                "volume": 76889940512.35,
                "btcValue": 2041659262987.63,
                "ethValue": 288256538084.64,
                "stableValue": 234344577626.20,
                "otherValue": 602799778010.26,
                "timestamp": "1750532400"
            },
            {
                "marketCap": 3155953994344.39,
                "volume": 78448052382.58,
                "btcValue": 2033601638706.75,
                "ethValue": 287946940280.32,
                "stableValue": 234338914234.14,
                "otherValue": 600066501123.18,
                "timestamp": "1750536000"
            },
            {
                "marketCap": 3173804543942.53,
                "volume": 78710259679.50,
                "btcValue": 2044289279359.87,
                "ethValue": 290217573368.34,
                "stableValue": 234339371243.36,
                "otherValue": 604958319970.96,
                "timestamp": "1750539600"
            },
            {
                "marketCap": 3119130588718.72,
                "volume": 85522496266.26,
                "btcValue": 2017732598780.56,
                "ethValue": 275544903875.97,
                "stableValue": 234344420044.13,
                "otherValue": 591508666018.06,
                "timestamp": "1750543200"
            },
            {
                "marketCap": 3128508773891.55,
                "volume": 88166200681.97,
                "btcValue": 2024381055785.05,
                "ethValue": 276156450107.06,
                "stableValue": 234345489545.91,
                "otherValue": 593625778453.53,
                "timestamp": "1750546800"
            },
            {
                "marketCap": 3138352601451.89,
                "volume": 92339334420.25,
                "btcValue": 2031159798229.63,
                "ethValue": 277246480316.84,
                "stableValue": 234399279724.44,
                "otherValue": 595547043180.98,
                "timestamp": "1750550400"
            },
            {
                "marketCap": 3157707970906.06,
                "volume": 99814327784.66,
                "btcValue": 2045276419312.59,
                "ethValue": 277053420652.86,
                "stableValue": 234267036131.97,
                "otherValue": 601111094808.64,
                "timestamp": "1750554000"
            },
            {
                "marketCap": 3139728668199.70,
                "volume": 101246635815.16,
                "btcValue": 2036347190716.55,
                "ethValue": 273689463486.83,
                "stableValue": 234268660712.92,
                "otherValue": 595423353283.40,
                "timestamp": "1750557600"
            },
            {
                "marketCap": 3138654726216.06,
                "volume": 104069739400.93,
                "btcValue": 2036435181293.79,
                "ethValue": 273773791018.19,
                "stableValue": 234314427327.66,
                "otherValue": 594131326576.42,
                "timestamp": "1750561200"
            },
            {
                "marketCap": 3135339309439.08,
                "volume": 106870215259.95,
                "btcValue": 2036060122029.98,
                "ethValue": 273430018530.20,
                "stableValue": 234269030030.05,
                "otherValue": 591580138848.85,
                "timestamp": "1750564800"
            },
            {
                "marketCap": 3147727268816.09,
                "volume": 108035189796.53,
                "btcValue": 2040377187516.94,
                "ethValue": 275700047934.32,
                "stableValue": 234296209648.55,
                "otherValue": 597353823716.28,
                "timestamp": "1750568400"
            },
            {
                "marketCap": 3153253720780.08,
                "volume": 108798134737.87,
                "btcValue": 2045724947102.34,
                "ethValue": 276465699747.32,
                "stableValue": 234276675889.52,
                "otherValue": 596786398040.90,
                "timestamp": "1750572000"
            },
            {
                "marketCap": 3152256485240.34,
                "volume": 109501090904.93,
                "btcValue": 2043261802302.36,
                "ethValue": 276099950802.17,
                "stableValue": 234279223381.96,
                "otherValue": 598615508753.85,
                "timestamp": "1750575600"
            },
            {
                "marketCap": 3141447468227.96,
                "volume": 110723212123.14,
                "btcValue": 2037383265583.47,
                "ethValue": 274157972357.47,
                "stableValue": 234273024360.95,
                "otherValue": 595633205926.07,
                "timestamp": "1750579200"
            },
            {
                "marketCap": 3145861460776.66,
                "volume": 110783295175.10,
                "btcValue": 2042552539391.77,
                "ethValue": 274678466495.90,
                "stableValue": 234286137903.66,
                "otherValue": 594344316985.33,
                "timestamp": "1750582800"
            },
            {
                "marketCap": 3125170111966.38,
                "volume": 110986380608.59,
                "btcValue": 2032417067976.96,
                "ethValue": 270745773819.04,
                "stableValue": 234273453065.54,
                "otherValue": 587733817104.84,
                "timestamp": "1750586400"
            },
            {
                "marketCap": 3135098088217.92,
                "volume": 113206545530.51,
                "btcValue": 2038085599545.39,
                "ethValue": 272849403485.30,
                "stableValue": 234235670935.86,
                "otherValue": 589927414251.37,
                "timestamp": "1750590000"
            },
            {
                "marketCap": 3141169012415.31,
                "volume": 114762491067.56,
                "btcValue": 2043648008828.02,
                "ethValue": 274477828417.46,
                "stableValue": 234301735875.09,
                "otherValue": 588741439294.74,
                "timestamp": "1750593600"
            },
            {
                "marketCap": 3141293481721.06,
                "volume": 115536201944.18,
                "btcValue": 2043495480033.78,
                "ethValue": 275287492048.75,
                "stableValue": 234259312928.57,
                "otherValue": 588251196709.96,
                "timestamp": "1750597200"
            },
            {
                "marketCap": 3078066720257.57,
                "volume": 124917760907.06,
                "btcValue": 2005987532010.49,
                "ethValue": 265646330197.71,
                "stableValue": 234264109228.64,
                "otherValue": 572168748820.73,
                "timestamp": "1750600800"
            },
            {
                "marketCap": 3052748021754.10,
                "volume": 134793249951.59,
                "btcValue": 1981370755444.46,
                "ethValue": 265823099496.91,
                "stableValue": 234260814866.05,
                "otherValue": 571293351946.68,
                "timestamp": "1750604400"
            },
            {
                "marketCap": 3032722988406.04,
                "volume": 139681057333.67,
                "btcValue": 1967288142730.24,
                "ethValue": 262537455394.64,
                "stableValue": 234278260851.49,
                "otherValue": 568619129429.67,
                "timestamp": "1750608000"
            },
            {
                "marketCap": 3047701916309.57,
                "volume": 145192683837.65,
                "btcValue": 1982062349149.62,
                "ethValue": 265287025020.56,
                "stableValue": 234233542063.75,
                "otherValue": 566119000075.64,
                "timestamp": "1750611600"
            },
            {
                "marketCap": 3051235622990.15,
                "volume": 147802343550.23,
                "btcValue": 1978719390474.70,
                "ethValue": 264720166451.44,
                "stableValue": 234224456821.04,
                "otherValue": 573571609242.97,
                "timestamp": "1750615200"
            },
            {
                "marketCap": 3045742162608.89,
                "volume": 147312787795.04,
                "btcValue": 1977519270753.24,
                "ethValue": 263543861776.48,
                "stableValue": 234215612767.53,
                "otherValue": 570463417311.64,
                "timestamp": "1750618800"
            },
            {
                "marketCap": 3031882630994.25,
                "volume": 147196261938.49,
                "btcValue": 1966743055966.86,
                "ethValue": 263682763265.94,
                "stableValue": 234213630621.15,
                "otherValue": 567243181140.30,
                "timestamp": "1750622400"
            },
            {
                "marketCap": 3047564824087.31,
                "volume": 151291312209.42,
                "btcValue": 1979462062062.57,
                "ethValue": 264047432116.58,
                "stableValue": 234221136707.39,
                "otherValue": 569834193200.77,
                "timestamp": "1750626000"
            },
            {
                "marketCap": 3036847796322.97,
                "volume": 145806133540.55,
                "btcValue": 1972067104037.44,
                "ethValue": 262939033858.87,
                "stableValue": 234211116258.23,
                "otherValue": 567630542168.43,
                "timestamp": "1750629600"
            },
            {
                "marketCap": 3091736911768.24,
                "volume": 146758968370.32,
                "btcValue": 2008094343461.32,
                "ethValue": 269742445617.53,
                "stableValue": 234279001297.13,
                "otherValue": 579621121392.26,
                "timestamp": "1750633200"
            },
            {
                "marketCap": 3092059833701.08,
                "volume": 144566501365.38,
                "btcValue": 2008086342108.22,
                "ethValue": 268982170021.54,
                "stableValue": 234225222354.88,
                "otherValue": 580766099216.44,
                "timestamp": "1750636800"
            },
            {
                "marketCap": 3096447432918.84,
                "volume": 140782939704.47,
                "btcValue": 2007339881891.36,
                "ethValue": 270569868985.90,
                "stableValue": 234409106387.92,
                "otherValue": 584128575653.66,
                "timestamp": "1750640400"
            },
            {
                "marketCap": 3101519629945.90,
                "volume": 139086826950.21,
                "btcValue": 2010781461467.91,
                "ethValue": 271291077320.83,
                "stableValue": 234402864334.22,
                "otherValue": 585044226822.94,
                "timestamp": "1750644000"
            },
            {
                "marketCap": 3104585475915.86,
                "volume": 137509887155.55,
                "btcValue": 2014989552326.04,
                "ethValue": 270537613025.22,
                "stableValue": 234408673412.05,
                "otherValue": 584649637152.55,
                "timestamp": "1750647600"
            },
            {
                "marketCap": 3099751720288.71,
                "volume": 136543917796.51,
                "btcValue": 2011886643118.79,
                "ethValue": 269784519750.76,
                "stableValue": 234391839305.24,
                "otherValue": 583688718113.92,
                "timestamp": "1750651200"
            },
            {
                "marketCap": 3101375174633.94,
                "volume": 135793219226.36,
                "btcValue": 2012383724936.56,
                "ethValue": 269772196306.04,
                "stableValue": 234389252509.20,
                "otherValue": 584830000882.14,
                "timestamp": "1750654800"
            },
            {
                "marketCap": 3119549552033.60,
                "volume": 136015679544.97,
                "btcValue": 2024199158892.88,
                "ethValue": 271358527182.14,
                "stableValue": 234404112185.52,
                "otherValue": 589587753773.06,
                "timestamp": "1750658400"
            },
            {
                "marketCap": 3122122551874.61,
                "volume": 137430306374.88,
                "btcValue": 2027584309970.94,
                "ethValue": 271829372019.29,
                "stableValue": 234406165691.38,
                "otherValue": 588302704193.00,
                "timestamp": "1750662000"
            },
            {
                "marketCap": 3123887430038.71,
                "volume": 139071547870.50,
                "btcValue": 2027504616176.68,
                "ethValue": 272797224500.81,
                "stableValue": 234417353565.16,
                "otherValue": 589168235796.06,
                "timestamp": "1750665600"
            },
            {
                "marketCap": 3122827636581.59,
                "volume": 139039647702.01,
                "btcValue": 2026440970769.33,
                "ethValue": 273200013660.10,
                "stableValue": 234463892403.91,
                "otherValue": 588722759748.25,
                "timestamp": "1750669200"
            },
            {
                "marketCap": 3113698777419.91,
                "volume": 137990142709.44,
                "btcValue": 2019999282778.99,
                "ethValue": 271993030349.73,
                "stableValue": 234455397421.60,
                "otherValue": 587251066869.59,
                "timestamp": "1750672800"
            },
            {
                "marketCap": 3108783386899.20,
                "volume": 137505468353.82,
                "btcValue": 2018256405610.56,
                "ethValue": 271350822889.83,
                "stableValue": 234439844689.58,
                "otherValue": 584736313709.23,
                "timestamp": "1750676400"
            },
            {
                "marketCap": 3106459045855.48,
                "volume": 137720137667.06,
                "btcValue": 2014938914186.96,
                "ethValue": 272106333598.03,
                "stableValue": 234441447908.50,
                "otherValue": 584972350161.99,
                "timestamp": "1750680000"
            },
            {
                "marketCap": 3118323016070.18,
                "volume": 138831421661.59,
                "btcValue": 2021919649836.37,
                "ethValue": 273631050063.14,
                "stableValue": 234438777618.87,
                "otherValue": 588333538551.80,
                "timestamp": "1750683600"
            },
            {
                "marketCap": 3142002556477.88,
                "volume": 130146839800.79,
                "btcValue": 2036390340923.66,
                "ethValue": 277175340396.85,
                "stableValue": 234437508806.17,
                "otherValue": 593999366351.20,
                "timestamp": "1750687200"
            },
            {
                "marketCap": 3120370889246.12,
                "volume": 124705647607.05,
                "btcValue": 2021509299985.59,
                "ethValue": 274686888445.20,
                "stableValue": 234444071215.67,
                "otherValue": 589730629599.66,
                "timestamp": "1750690800"
            },
            {
                "marketCap": 3110097007800.25,
                "volume": 121524319046.19,
                "btcValue": 2017561197768.62,
                "ethValue": 271713281311.22,
                "stableValue": 234445683761.38,
                "otherValue": 586376844959.03,
                "timestamp": "1750694400"
            },
            {
                "marketCap": 3082725168589.45,
                "volume": 121986708110.41,
                "btcValue": 2002930022594.25,
                "ethValue": 268308485622.93,
                "stableValue": 234592661689.53,
                "otherValue": 576893998682.74,
                "timestamp": "1750698000"
            },
            {
                "marketCap": 3141591125090.48,
                "volume": 128581477866.92,
                "btcValue": 2039000358893.60,
                "ethValue": 274925703121.03,
                "stableValue": 234749984333.07,
                "otherValue": 592915078742.78,
                "timestamp": "1750701600"
            },
            {
                "marketCap": 3162585880720.34,
                "volume": 132255628896.54,
                "btcValue": 2048896028301.71,
                "ethValue": 278538837760.14,
                "stableValue": 234700508328.89,
                "otherValue": 600450506329.60,
                "timestamp": "1750705200"
            },
            {
                "marketCap": 3170856712780.06,
                "volume": 134566436134.06,
                "btcValue": 2052611227437.88,
                "ethValue": 279431035693.05,
                "stableValue": 234711871316.62,
                "otherValue": 604102578332.51,
                "timestamp": "1750708800"
            },
            {
                "marketCap": 3191193683795.76,
                "volume": 133896698762.33,
                "btcValue": 2063556432192.70,
                "ethValue": 283442631744.89,
                "stableValue": 234768577410.49,
                "otherValue": 609426042447.68,
                "timestamp": "1750712400"
            },
            {
                "marketCap": 3190595103157.09,
                "volume": 135202527217.46,
                "btcValue": 2063110085252.04,
                "ethValue": 282817235850.38,
                "stableValue": 234749419185.49,
                "otherValue": 609918362869.18,
                "timestamp": "1750716000"
            },
            {
                "marketCap": 3253097723717.83,
                "volume": 141802210856.27,
                "btcValue": 2101178500525.15,
                "ethValue": 291235809306.18,
                "stableValue": 234787823570.80,
                "otherValue": 625895590315.70,
                "timestamp": "1750719600"
            },
            {
                "marketCap": 3251422984478.75,
                "volume": 145370532299.99,
                "btcValue": 2095969624989.22,
                "ethValue": 291268300408.06,
                "stableValue": 234792784965.86,
                "otherValue": 629392274115.61,
                "timestamp": "1750723200"
            },
            {
                "marketCap": 3240855847184.49,
                "volume": 145638188794.10,
                "btcValue": 2091635489583.40,
                "ethValue": 290257799319.03,
                "stableValue": 234911283324.33,
                "otherValue": 624051274957.73,
                "timestamp": "1750726800"
            },
            {
                "marketCap": 3250315698232.32,
                "volume": 144915800020.88,
                "btcValue": 2098212062144.14,
                "ethValue": 291617399510.81,
                "stableValue": 234919765413.77,
                "otherValue": 625566471163.60,
                "timestamp": "1750730400"
            },
            {
                "marketCap": 3230346852913.08,
                "volume": 147125008944.19,
                "btcValue": 2084615183584.57,
                "ethValue": 288949558661.53,
                "stableValue": 234924753617.09,
                "otherValue": 621857357049.89,
                "timestamp": "1750734000"
            },
            {
                "marketCap": 3237019555840.27,
                "volume": 146869184812.89,
                "btcValue": 2087912821456.37,
                "ethValue": 289814339180.42,
                "stableValue": 234877045557.16,
                "otherValue": 624415349646.32,
                "timestamp": "1750737600"
            },
            {
                "marketCap": 3235002172446.33,
                "volume": 147737391922.35,
                "btcValue": 2085714683573.09,
                "ethValue": 290374398412.52,
                "stableValue": 234820718321.38,
                "otherValue": 624092372139.34,
                "timestamp": "1750741200"
            },
            {
                "marketCap": 3258404428883.86,
                "volume": 149767087684.03,
                "btcValue": 2097170908127.45,
                "ethValue": 292466060664.95,
                "stableValue": 234848664083.14,
                "otherValue": 633918796008.32,
                "timestamp": "1750744800"
            },
            {
                "marketCap": 3266705119615.50,
                "volume": 149978064464.48,
                "btcValue": 2103312154330.36,
                "ethValue": 293358401965.01,
                "stableValue": 234903208566.19,
                "otherValue": 635131354753.94,
                "timestamp": "1750748400"
            },
            {
                "marketCap": 3239957755212.16,
                "volume": 151143401185.25,
                "btcValue": 2088384743921.05,
                "ethValue": 289238911786.74,
                "stableValue": 234882539485.64,
                "otherValue": 627451560018.73,
                "timestamp": "1750752000"
            },
            {
                "marketCap": 3241187444168.69,
                "volume": 153550988921.92,
                "btcValue": 2089316808724.41,
                "ethValue": 290231456193.78,
                "stableValue": 234911123516.70,
                "otherValue": 626728055733.80,
                "timestamp": "1750755600"
            },
            {
                "marketCap": 3248645836204.89,
                "volume": 155153761053.32,
                "btcValue": 2093301706858.10,
                "ethValue": 291838278894.35,
                "stableValue": 235178170418.60,
                "otherValue": 628327680033.84,
                "timestamp": "1750759200"
            },
            {
                "marketCap": 3249807379482.32,
                "volume": 155283252366.38,
                "btcValue": 2095142542492.28,
                "ethValue": 291606102020.77,
                "stableValue": 235243503306.67,
                "otherValue": 627815231662.60,
                "timestamp": "1750762800"
            },
            {
                "marketCap": 3247272165269.56,
                "volume": 155617660961.74,
                "btcValue": 2093296606584.97,
                "ethValue": 291070299074.39,
                "stableValue": 235222964887.08,
                "otherValue": 627682294723.12,
                "timestamp": "1750766400"
            },
            {
                "marketCap": 3247487997720.63,
                "volume": 155693269749.61,
                "btcValue": 2092963998856.25,
                "ethValue": 291541892942.95,
                "stableValue": 235212661328.86,
                "otherValue": 627769444592.57,
                "timestamp": "1750770000"
            },
            {
                "marketCap": 3244509403665.98,
                "volume": 153651732686.34,
                "btcValue": 2090188522640.08,
                "ethValue": 292472575792.52,
                "stableValue": 235260656579.90,
                "otherValue": 626587648653.48,
                "timestamp": "1750773600"
            },
            {
                "marketCap": 3257743729427.46,
                "volume": 152471964807.64,
                "btcValue": 2098938914936.62,
                "ethValue": 293534497193.31,
                "stableValue": 235275682614.77,
                "otherValue": 629994634682.76,
                "timestamp": "1750777200"
            },
            {
                "marketCap": 3251867087916.29,
                "volume": 152187797374.85,
                "btcValue": 2093374466116.89,
                "ethValue": 294483866710.38,
                "stableValue": 235291721294.55,
                "otherValue": 628717033794.47,
                "timestamp": "1750780800"
            },
            {
                "marketCap": 3280838239899.78,
                "volume": 146929132891.03,
                "btcValue": 2113155865693.45,
                "ethValue": 299425357926.80,
                "stableValue": 235323321087.60,
                "otherValue": 632933695191.93,
                "timestamp": "1750784400"
            },
            {
                "marketCap": 3273893674412.73,
                "volume": 143659335677.25,
                "btcValue": 2109756713372.45,
                "ethValue": 296805639362.46,
                "stableValue": 235355098452.76,
                "otherValue": 631976223225.06,
                "timestamp": "1750788000"
            },
            {
                "marketCap": 3259827548156.11,
                "volume": 138276219508.82,
                "btcValue": 2099683201467.40,
                "ethValue": 294321583534.65,
                "stableValue": 235386904730.15,
                "otherValue": 630435858423.91,
                "timestamp": "1750791600"
            },
            {
                "marketCap": 3257983163964.95,
                "volume": 136872126133.43,
                "btcValue": 2101572918921.50,
                "ethValue": 294100458038.07,
                "stableValue": 235391751345.77,
                "otherValue": 626918035659.61,
                "timestamp": "1750795200"
            },
            {
                "marketCap": 3273733650690.28,
                "volume": 131884633347.32,
                "btcValue": 2110068254180.03,
                "ethValue": 295814378385.64,
                "stableValue": 235450664909.88,
                "otherValue": 632400353214.73,
                "timestamp": "1750798800"
            },
            {
                "marketCap": 3271559178336.36,
                "volume": 130618518785.53,
                "btcValue": 2108441354178.76,
                "ethValue": 295307575008.53,
                "stableValue": 235442421542.88,
                "otherValue": 632367827606.19,
                "timestamp": "1750802400"
            },
            {
                "marketCap": 3270442483872.88,
                "volume": 119866290253.92,
                "btcValue": 2109058265447.44,
                "ethValue": 294894138934.78,
                "stableValue": 235476813592.12,
                "otherValue": 631013265898.54,
                "timestamp": "1750806000"
            },
            {
                "marketCap": 3272564487406.99,
                "volume": 115907633538.93,
                "btcValue": 2109630937515.86,
                "ethValue": 295726029950.09,
                "stableValue": 235437017230.60,
                "otherValue": 631770502710.44,
                "timestamp": "1750809600"
            },
            {
                "marketCap": 3282723170584.30,
                "volume": 114019857287.83,
                "btcValue": 2116391211095.95,
                "ethValue": 296935703891.38,
                "stableValue": 235452238900.63,
                "otherValue": 633944016696.34,
                "timestamp": "1750813200"
            },
            {
                "marketCap": 3282273884318.97,
                "volume": 115258916536.98,
                "btcValue": 2116122259181.33,
                "ethValue": 297182405160.29,
                "stableValue": 235445454825.08,
                "otherValue": 633523765152.27,
                "timestamp": "1750816800"
            },
            {
                "marketCap": 3283881549574.61,
                "volume": 115115082882.20,
                "btcValue": 2118019124375.25,
                "ethValue": 296107901788.68,
                "stableValue": 235432149165.39,
                "otherValue": 634322374245.29,
                "timestamp": "1750820400"
            },
            {
                "marketCap": 3277631545757.45,
                "volume": 112420908976.47,
                "btcValue": 2113524755530.51,
                "ethValue": 295254982744.24,
                "stableValue": 235435876577.20,
                "otherValue": 633415930905.50,
                "timestamp": "1750824000"
            },
            {
                "marketCap": 3273769445753.39,
                "volume": 114060841332.16,
                "btcValue": 2112667007161.79,
                "ethValue": 294154388151.43,
                "stableValue": 235408638712.70,
                "otherValue": 631539411727.47,
                "timestamp": "1750827600"
            },
            {
                "marketCap": 3273661894046.65,
                "volume": 112551575925.80,
                "btcValue": 2113040855548.64,
                "ethValue": 293499954192.23,
                "stableValue": 235404995968.54,
                "otherValue": 631716088337.24,
                "timestamp": "1750831200"
            },
            {
                "marketCap": 3280014530822.24,
                "volume": 110410247230.64,
                "btcValue": 2116530616068.28,
                "ethValue": 295252626272.26,
                "stableValue": 235363049975.82,
                "otherValue": 632868238505.88,
                "timestamp": "1750834800"
            },
            {
                "marketCap": 3285889854820.40,
                "volume": 108005707420.59,
                "btcValue": 2120870566786.37,
                "ethValue": 295309147840.14,
                "stableValue": 235578260181.27,
                "otherValue": 634131880012.62,
                "timestamp": "1750838400"
            },
            {
                "marketCap": 3280528092296.90,
                "volume": 104323488794.26,
                "btcValue": 2120117815236.96,
                "ethValue": 294437745640.21,
                "stableValue": 235518855388.08,
                "otherValue": 630453676031.65,
                "timestamp": "1750842000"
            },
            {
                "marketCap": 3278344318734.82,
                "volume": 102959048210.62,
                "btcValue": 2121045731707.67,
                "ethValue": 292269294762.54,
                "stableValue": 235588400652.54,
                "otherValue": 629440891612.07,
                "timestamp": "1750845600"
            },
            {
                "marketCap": 3289011713786.65,
                "volume": 106216966138.84,
                "btcValue": 2130013289587.44,
                "ethValue": 292956625356.37,
                "stableValue": 235577705776.43,
                "otherValue": 630464093066.41,
                "timestamp": "1750849200"
            },
            {
                "marketCap": 3294850436782.37,
                "volume": 105996063380.67,
                "btcValue": 2132423816620.76,
                "ethValue": 293356848723.98,
                "stableValue": 235585077263.01,
                "otherValue": 633484694174.62,
                "timestamp": "1750852800"
            },
            {
                "marketCap": 3293104462293.26,
                "volume": 106365518795.11,
                "btcValue": 2132144640036.84,
                "ethValue": 293135739369.49,
                "stableValue": 235511822975.54,
                "otherValue": 632312259911.39,
                "timestamp": "1750856400"
            },
            {
                "marketCap": 3314690998678.75,
                "volume": 107669317787.75,
                "btcValue": 2147066862717.02,
                "ethValue": 294165646125.13,
                "stableValue": 235648896585.16,
                "otherValue": 637809593251.44,
                "timestamp": "1750860000"
            },
            {
                "marketCap": 3303170802727.83,
                "volume": 110377354948.65,
                "btcValue": 2141300244364.03,
                "ethValue": 293754127329.57,
                "stableValue": 235627095020.74,
                "otherValue": 632489336013.49,
                "timestamp": "1750863600"
            },
            {
                "marketCap": 3280311854928.88,
                "volume": 112178956389.90,
                "btcValue": 2128956758852.58,
                "ethValue": 290563050479.76,
                "stableValue": 235687070586.23,
                "otherValue": 625104975010.31,
                "timestamp": "1750867200"
            },
            {
                "marketCap": 3282665131814.23,
                "volume": 111384122372.07,
                "btcValue": 2131635328954.47,
                "ethValue": 291193321036.76,
                "stableValue": 235673831550.11,
                "otherValue": 624162650272.89,
                "timestamp": "1750870800"
            },
            {
                "marketCap": 3291761872063.13,
                "volume": 109074383353.13,
                "btcValue": 2136271382694.49,
                "ethValue": 292602421242.28,
                "stableValue": 235659667370.08,
                "otherValue": 627228400756.28,
                "timestamp": "1750874400"
            },
            {
                "marketCap": 3290514299055.75,
                "volume": 108913630895.19,
                "btcValue": 2136304106984.14,
                "ethValue": 291975867230.67,
                "stableValue": 235665150308.55,
                "otherValue": 626569174532.39,
                "timestamp": "1750878000"
            },
            {
                "marketCap": 3301244040398.62,
                "volume": 109849493891.62,
                "btcValue": 2142484199864.84,
                "ethValue": 293688016340.57,
                "stableValue": 235590234521.93,
                "otherValue": 629481589671.28,
                "timestamp": "1750881600"
            },
            {
                "marketCap": 3305484336055.65,
                "volume": 108891760510.93,
                "btcValue": 2144343956033.64,
                "ethValue": 294741899123.68,
                "stableValue": 235616286406.05,
                "otherValue": 630782194492.28,
                "timestamp": "1750885200"
            },
            {
                "marketCap": 3295028583350.57,
                "volume": 109344058133.68,
                "btcValue": 2138953351633.19,
                "ethValue": 293412651661.40,
                "stableValue": 235502940819.85,
                "otherValue": 627159639236.13,
                "timestamp": "1750888800"
            },
            {
                "marketCap": 3286929949261.59,
                "volume": 109253834562.71,
                "btcValue": 2134185059065.32,
                "ethValue": 291886817531.48,
                "stableValue": 235542859624.76,
                "otherValue": 625315213040.03,
                "timestamp": "1750892400"
            },
            {
                "marketCap": 3288731370968.22,
                "volume": 109154726645.23,
                "btcValue": 2134932582966.64,
                "ethValue": 292055920988.05,
                "stableValue": 235401077278.48,
                "otherValue": 626341789735.05,
                "timestamp": "1750896000"
            },
            {
                "marketCap": 3290749265892.14,
                "volume": 108945876726.51,
                "btcValue": 2135109277067.07,
                "ethValue": 293085626210.77,
                "stableValue": 235462969743.60,
                "otherValue": 627091392870.70,
                "timestamp": "1750899600"
            },
            {
                "marketCap": 3303583241913.19,
                "volume": 109367409295.78,
                "btcValue": 2141083652117.88,
                "ethValue": 296990937252.77,
                "stableValue": 235396430949.46,
                "otherValue": 630112221593.08,
                "timestamp": "1750903200"
            },
            {
                "marketCap": 3317540691211.53,
                "volume": 106732952455.45,
                "btcValue": 2147113458809.04,
                "ethValue": 301161913058.74,
                "stableValue": 235388589110.95,
                "otherValue": 633876730232.80,
                "timestamp": "1750906800"
            },
            {
                "marketCap": 3312840630015.50,
                "volume": 111989670827.18,
                "btcValue": 2145642459677.48,
                "ethValue": 300540847987.84,
                "stableValue": 235364270536.02,
                "otherValue": 631293051814.16,
                "timestamp": "1750910400"
            },
            {
                "marketCap": 3309363937014.77,
                "volume": 111856781245.51,
                "btcValue": 2145046034012.40,
                "ethValue": 299474320941.89,
                "stableValue": 235319829338.76,
                "otherValue": 629523752721.72,
                "timestamp": "1750914000"
            },
            {
                "marketCap": 3302553337820.93,
                "volume": 110521982053.95,
                "btcValue": 2140897824202.02,
                "ethValue": 298938852456.98,
                "stableValue": 235346014267.14,
                "otherValue": 627370646894.79,
                "timestamp": "1750917600"
            },
            {
                "marketCap": 3308172204060.03,
                "volume": 111029621431.20,
                "btcValue": 2143952841684.01,
                "ethValue": 300439091522.82,
                "stableValue": 235366059709.24,
                "otherValue": 628414211143.96,
                "timestamp": "1750921200"
            },
            {
                "marketCap": 3311215839107.20,
                "volume": 111062983729.41,
                "btcValue": 2144568349312.57,
                "ethValue": 300753024359.59,
                "stableValue": 235334311156.33,
                "otherValue": 630560154278.71,
                "timestamp": "1750924800"
            },
            {
                "marketCap": 3308975665954.45,
                "volume": 112018784667.49,
                "btcValue": 2143878624952.25,
                "ethValue": 300308250154.84,
                "stableValue": 235366826743.75,
                "otherValue": 629421964103.61,
                "timestamp": "1750928400"
            },
            {
                "marketCap": 3292700299460.49,
                "volume": 110590641625.51,
                "btcValue": 2135169779729.15,
                "ethValue": 297583326170.27,
                "stableValue": 235355245183.21,
                "otherValue": 624591948377.86,
                "timestamp": "1750932000"
            },
            {
                "marketCap": 3291707520998.68,
                "volume": 110842020418.73,
                "btcValue": 2135919148113.08,
                "ethValue": 295964837332.80,
                "stableValue": 235297660380.28,
                "otherValue": 624525875172.52,
                "timestamp": "1750935600"
            },
            {
                "marketCap": 3289720073427.31,
                "volume": 109283489172.51,
                "btcValue": 2134967570892.14,
                "ethValue": 295930654738.97,
                "stableValue": 235331790404.27,
                "otherValue": 623490057391.93,
                "timestamp": "1750939200"
            },
            {
                "marketCap": 3280466843203.24,
                "volume": 109678644979.50,
                "btcValue": 2130750616647.58,
                "ethValue": 294656211347.65,
                "stableValue": 235312076166.27,
                "otherValue": 619747939041.74,
                "timestamp": "1750942800"
            },
            {
                "marketCap": 3270657360923.75,
                "volume": 107847281822.44,
                "btcValue": 2127303027356.44,
                "ethValue": 293849600069.43,
                "stableValue": 235828980316.71,
                "otherValue": 613675753181.17,
                "timestamp": "1750946400"
            },
            {
                "marketCap": 3286520181422.34,
                "volume": 105639326265.58,
                "btcValue": 2137225086595.81,
                "ethValue": 295398829328.00,
                "stableValue": 235824750240.53,
                "otherValue": 618071515258.00,
                "timestamp": "1750950000"
            },
            {
                "marketCap": 3280008997662.61,
                "volume": 102573595502.41,
                "btcValue": 2134200974431.71,
                "ethValue": 293869297895.50,
                "stableValue": 235789712384.10,
                "otherValue": 616149012951.30,
                "timestamp": "1750953600"
            },
            {
                "marketCap": 3273518226773.63,
                "volume": 102467738941.99,
                "btcValue": 2131530863465.55,
                "ethValue": 292967239956.22,
                "stableValue": 235804093331.56,
                "otherValue": 613216030020.30,
                "timestamp": "1750957200"
            },
            {
                "marketCap": 3274954521075.35,
                "volume": 100331054956.63,
                "btcValue": 2132020925383.98,
                "ethValue": 292352826836.51,
                "stableValue": 235803458741.43,
                "otherValue": 614777310113.43,
                "timestamp": "1750960800"
            },
            {
                "marketCap": 3278992488212.96,
                "volume": 101840189264.94,
                "btcValue": 2135775500422.78,
                "ethValue": 292898231249.06,
                "stableValue": 235820473434.85,
                "otherValue": 614498283106.27,
                "timestamp": "1750964400"
            },
            {
                "marketCap": 3288092466434.30,
                "volume": 100603519022.37,
                "btcValue": 2139042391171.60,
                "ethValue": 294131652953.02,
                "stableValue": 235830955652.06,
                "otherValue": 619087466657.62,
                "timestamp": "1750968000"
            },
            {
                "marketCap": 3294637758809.63,
                "volume": 102200041389.58,
                "btcValue": 2143227291192.43,
                "ethValue": 295267864896.83,
                "stableValue": 235849098420.27,
                "otherValue": 620293504300.10,
                "timestamp": "1750971600"
            },
            {
                "marketCap": 3270383487571.42,
                "volume": 101953852068.47,
                "btcValue": 2128919894585.64,
                "ethValue": 291590244486.83,
                "stableValue": 235815222537.83,
                "otherValue": 614058125961.12,
                "timestamp": "1750975200"
            },
            {
                "marketCap": 3267930907567.80,
                "volume": 102009921153.04,
                "btcValue": 2128144340362.58,
                "ethValue": 291473196448.94,
                "stableValue": 235830467997.24,
                "otherValue": 612482902759.04,
                "timestamp": "1750978800"
            },
            {
                "marketCap": 3266323067177.36,
                "volume": 102512696862.55,
                "btcValue": 2127216016122.92,
                "ethValue": 291692939694.70,
                "stableValue": 235794848173.12,
                "otherValue": 611619263186.62,
                "timestamp": "1750982400"
            },
            {
                "marketCap": 3256453806262.75,
                "volume": 98104910068.13,
                "btcValue": 2122487847945.61,
                "ethValue": 289941078750.47,
                "stableValue": 235830373249.15,
                "otherValue": 608194506317.52,
                "timestamp": "1750986000"
            },
            {
                "marketCap": 3273851793068.08,
                "volume": 102919932549.62,
                "btcValue": 2131005632731.15,
                "ethValue": 292986966726.62,
                "stableValue": 236084796844.87,
                "otherValue": 613774396765.44,
                "timestamp": "1750989600"
            },
            {
                "marketCap": 3280573990796.12,
                "volume": 101387383865.63,
                "btcValue": 2133431375151.06,
                "ethValue": 294388396027.30,
                "stableValue": 236072066176.95,
                "otherValue": 616682153440.81,
                "timestamp": "1750993200"
            },
            {
                "marketCap": 3287082160537.47,
                "volume": 98088196439.20,
                "btcValue": 2138138151780.64,
                "ethValue": 295467605223.88,
                "stableValue": 236094045949.47,
                "otherValue": 617382357583.48,
                "timestamp": "1750996800"
            },
            {
                "marketCap": 3288190948908.45,
                "volume": 98741120161.91,
                "btcValue": 2138659607598.64,
                "ethValue": 295846862708.55,
                "stableValue": 236078703798.18,
                "otherValue": 617605774803.08,
                "timestamp": "1751000400"
            },
            {
                "marketCap": 3279148309782.37,
                "volume": 98914412290.89,
                "btcValue": 2134044744052.45,
                "ethValue": 294611065032.31,
                "stableValue": 236068588765.55,
                "otherValue": 614423911932.06,
                "timestamp": "1751004000"
            },
            {
                "marketCap": 3282549183660.07,
                "volume": 98953231008.96,
                "btcValue": 2134688219870.29,
                "ethValue": 295751785682.28,
                "stableValue": 236071434658.98,
                "otherValue": 616037743448.52,
                "timestamp": "1751007600"
            },
            {
                "marketCap": 3270168004350.33,
                "volume": 96108097677.13,
                "btcValue": 2126692439377.95,
                "ethValue": 294910983485.42,
                "stableValue": 236062167612.06,
                "otherValue": 612502413874.90,
                "timestamp": "1751011200"
            },
            {
                "marketCap": 3277754799962.79,
                "volume": 99079141293.34,
                "btcValue": 2128636218812.45,
                "ethValue": 295673893646.93,
                "stableValue": 236081519286.08,
                "otherValue": 617363168217.33,
                "timestamp": "1751014800"
            },
            {
                "marketCap": 3280514738677.41,
                "volume": 99547634051.54,
                "btcValue": 2130447184748.77,
                "ethValue": 297174342073.13,
                "stableValue": 236065722535.69,
                "otherValue": 616827489319.82,
                "timestamp": "1751018400"
            },
            {
                "marketCap": 3275071795492.09,
                "volume": 100199871498.64,
                "btcValue": 2128438433997.88,
                "ethValue": 295412084971.97,
                "stableValue": 236064082503.21,
                "otherValue": 615157194019.03,
                "timestamp": "1751022000"
            },
            {
                "marketCap": 3274338820997.27,
                "volume": 99384270191.94,
                "btcValue": 2127897967776.72,
                "ethValue": 295440524338.20,
                "stableValue": 236056030213.16,
                "otherValue": 614944298669.19,
                "timestamp": "1751025600"
            },
            {
                "marketCap": 3263687321791.74,
                "volume": 97186897795.57,
                "btcValue": 2121830883831.17,
                "ethValue": 293414709833.88,
                "stableValue": 236067066519.84,
                "otherValue": 612374661606.85,
                "timestamp": "1751029200"
            },
            {
                "marketCap": 3268194416515.90,
                "volume": 96980585202.59,
                "btcValue": 2124532335941.46,
                "ethValue": 293242105374.50,
                "stableValue": 236066923199.06,
                "otherValue": 614353052000.88,
                "timestamp": "1751032800"
            },
            {
                "marketCap": 3260173363829.64,
                "volume": 96902876209.70,
                "btcValue": 2119331641737.27,
                "ethValue": 292657619198.07,
                "stableValue": 236074067304.38,
                "otherValue": 612110035589.92,
                "timestamp": "1751036400"
            },
            {
                "marketCap": 3284409871344.20,
                "volume": 96837828707.41,
                "btcValue": 2135159592736.62,
                "ethValue": 294569908872.20,
                "stableValue": 236091894323.93,
                "otherValue": 618588475411.45,
                "timestamp": "1751040000"
            },
            {
                "marketCap": 3289315618145.24,
                "volume": 98066719164.71,
                "btcValue": 2138295350485.33,
                "ethValue": 293874670951.28,
                "stableValue": 236060546391.15,
                "otherValue": 621085050317.48,
                "timestamp": "1751043600"
            },
            {
                "marketCap": 3265906826430.15,
                "volume": 98786844891.16,
                "btcValue": 2126362640033.95,
                "ethValue": 290465207582.44,
                "stableValue": 236080659894.42,
                "otherValue": 612998318919.34,
                "timestamp": "1751047200"
            },
            {
                "marketCap": 3256792214489.33,
                "volume": 99657344691.89,
                "btcValue": 2121951226632.76,
                "ethValue": 289084804795.50,
                "stableValue": 236118960049.61,
                "otherValue": 609637223011.46,
                "timestamp": "1751050800"
            },
            {
                "marketCap": 3268298972701.69,
                "volume": 99537423638.93,
                "btcValue": 2125098776580.05,
                "ethValue": 291472585109.95,
                "stableValue": 236131188657.47,
                "otherValue": 615596422354.22,
                "timestamp": "1751054400"
            },
            {
                "marketCap": 3276696823023.31,
                "volume": 99340209078.75,
                "btcValue": 2130449738971.17,
                "ethValue": 292899077298.42,
                "stableValue": 236120007084.63,
                "otherValue": 617227999669.09,
                "timestamp": "1751058000"
            },
            {
                "marketCap": 3279004393183.86,
                "volume": 97646432586.04,
                "btcValue": 2129810301687.90,
                "ethValue": 292271172440.80,
                "stableValue": 236107586271.94,
                "otherValue": 620815332783.22,
                "timestamp": "1751061600"
            },
            {
                "marketCap": 3280718028422.75,
                "volume": 97567223156.41,
                "btcValue": 2130670524805.33,
                "ethValue": 292618871345.40,
                "stableValue": 236116504333.03,
                "otherValue": 621312127938.99,
                "timestamp": "1751065200"
            },
            {
                "marketCap": 3278624909730.19,
                "volume": 97131729846.71,
                "btcValue": 2129459477970.96,
                "ethValue": 292607485368.77,
                "stableValue": 236112368207.68,
                "otherValue": 620445578182.78,
                "timestamp": "1751068800"
            },
            {
                "marketCap": 3278393931591.36,
                "volume": 96533375614.37,
                "btcValue": 2129893637928.25,
                "ethValue": 292043646614.26,
                "stableValue": 236115479448.78,
                "otherValue": 620341167600.07,
                "timestamp": "1751072400"
            },
            {
                "marketCap": 3280621895519.55,
                "volume": 93704311344.88,
                "btcValue": 2129907656245.31,
                "ethValue": 291969688897.54,
                "stableValue": 236104878423.28,
                "otherValue": 622639671953.42,
                "timestamp": "1751076000"
            },
            {
                "marketCap": 3281980665326.76,
                "volume": 93646622678.45,
                "btcValue": 2130792770163.84,
                "ethValue": 292108182351.58,
                "stableValue": 236107006203.97,
                "otherValue": 622972706607.37,
                "timestamp": "1751079600"
            },
            {
                "marketCap": 3286499017851.51,
                "volume": 92515923698.08,
                "btcValue": 2134423945853.76,
                "ethValue": 292340187550.02,
                "stableValue": 236107922312.99,
                "otherValue": 623626962134.74,
                "timestamp": "1751083200"
            },
            {
                "marketCap": 3283322503518.90,
                "volume": 92176854095.59,
                "btcValue": 2132501886075.36,
                "ethValue": 292343022305.25,
                "stableValue": 236115661553.52,
                "otherValue": 622361933584.77,
                "timestamp": "1751086800"
            },
            {
                "marketCap": 3286885836268.88,
                "volume": 91326018397.19,
                "btcValue": 2134479170617.96,
                "ethValue": 292505656585.13,
                "stableValue": 236128326632.49,
                "otherValue": 623772682433.30,
                "timestamp": "1751090400"
            },
            {
                "marketCap": 3290967950876.85,
                "volume": 90929743670.52,
                "btcValue": 2136652483948.69,
                "ethValue": 293075860302.14,
                "stableValue": 236111464106.41,
                "otherValue": 625128142519.61,
                "timestamp": "1751094000"
            },
            {
                "marketCap": 3294803364600.67,
                "volume": 88953256236.10,
                "btcValue": 2137830574022.98,
                "ethValue": 293668685264.28,
                "stableValue": 236098904347.83,
                "otherValue": 627205200965.58,
                "timestamp": "1751097600"
            },
            {
                "marketCap": 3290450283774.34,
                "volume": 87068135808.10,
                "btcValue": 2136241037461.51,
                "ethValue": 292721832188.53,
                "stableValue": 236108399881.04,
                "otherValue": 625379014243.26,
                "timestamp": "1751101200"
            },
            {
                "marketCap": 3291495734386.62,
                "volume": 85272261486.22,
                "btcValue": 2134678499925.11,
                "ethValue": 293129320523.46,
                "stableValue": 236102874308.85,
                "otherValue": 627585039629.20,
                "timestamp": "1751104800"
            },
            {
                "marketCap": 3289945003995.27,
                "volume": 84418619451.03,
                "btcValue": 2133964807953.98,
                "ethValue": 292953807531.58,
                "stableValue": 236085920414.48,
                "otherValue": 626940468095.23,
                "timestamp": "1751108400"
            },
            {
                "marketCap": 3291865988789.81,
                "volume": 84097207864.81,
                "btcValue": 2135486060151.66,
                "ethValue": 293142628678.37,
                "stableValue": 236079749906.06,
                "otherValue": 627157550053.72,
                "timestamp": "1751112000"
            },
            {
                "marketCap": 3290385066891.97,
                "volume": 82403900371.41,
                "btcValue": 2135059661993.02,
                "ethValue": 293003490914.82,
                "stableValue": 236112286251.75,
                "otherValue": 626209627732.38,
                "timestamp": "1751115600"
            },
            {
                "marketCap": 3284252552323.83,
                "volume": 80445531600.94,
                "btcValue": 2130537726484.00,
                "ethValue": 292570214924.21,
                "stableValue": 236093129354.75,
                "otherValue": 625051481560.87,
                "timestamp": "1751119200"
            },
            {
                "marketCap": 3288489769655.48,
                "volume": 76354654762.60,
                "btcValue": 2132830967335.45,
                "ethValue": 292947983216.12,
                "stableValue": 236128058772.35,
                "otherValue": 626582760331.56,
                "timestamp": "1751122800"
            },
            {
                "marketCap": 3296995085418.49,
                "volume": 73152995998.27,
                "btcValue": 2137301622708.57,
                "ethValue": 294246898483.30,
                "stableValue": 236093335699.81,
                "otherValue": 629353228526.81,
                "timestamp": "1751126400"
            },
            {
                "marketCap": 3293347839352.78,
                "volume": 73004618240.57,
                "btcValue": 2134274672735.36,
                "ethValue": 293916072717.81,
                "stableValue": 236087567860.33,
                "otherValue": 629069526039.28,
                "timestamp": "1751130000"
            },
            {
                "marketCap": 3302875049903.64,
                "volume": 70745159431.17,
                "btcValue": 2137678013702.88,
                "ethValue": 295180696732.41,
                "stableValue": 236088522045.68,
                "otherValue": 633927817422.67,
                "timestamp": "1751133600"
            },
            {
                "marketCap": 3297532108445.74,
                "volume": 70255927859.21,
                "btcValue": 2134371962756.04,
                "ethValue": 294271921618.47,
                "stableValue": 236080597498.12,
                "otherValue": 632807626573.11,
                "timestamp": "1751137200"
            },
            {
                "marketCap": 3294751992209.82,
                "volume": 69087746587.14,
                "btcValue": 2132883637001.84,
                "ethValue": 293873200429.05,
                "stableValue": 236087452158.28,
                "otherValue": 631907702620.65,
                "timestamp": "1751140800"
            },
            {
                "marketCap": 3292905282357.19,
                "volume": 67937935483.42,
                "btcValue": 2132026128085.25,
                "ethValue": 293469161025.00,
                "stableValue": 236083607512.12,
                "otherValue": 631326385734.82,
                "timestamp": "1751144400"
            },
            {
                "marketCap": 3297487268708.09,
                "volume": 66806995795.05,
                "btcValue": 2134645861612.40,
                "ethValue": 294185013816.46,
                "stableValue": 236053166953.59,
                "otherValue": 632603226325.64,
                "timestamp": "1751148000"
            },
            {
                "marketCap": 3300439404266.80,
                "volume": 66829472068.71,
                "btcValue": 2135272643813.48,
                "ethValue": 294665945427.03,
                "stableValue": 236085581341.04,
                "otherValue": 634415233685.25,
                "timestamp": "1751151600"
            },
            {
                "marketCap": 3297877117822.64,
                "volume": 66379128693.18,
                "btcValue": 2134075819300.08,
                "ethValue": 294187283391.36,
                "stableValue": 236086207971.93,
                "otherValue": 633527807159.27,
                "timestamp": "1751155200"
            },
            {
                "marketCap": 3301834639840.14,
                "volume": 66218458775.31,
                "btcValue": 2137676159333.71,
                "ethValue": 294533669302.47,
                "stableValue": 236181240940.35,
                "otherValue": 633443570263.61,
                "timestamp": "1751158800"
            },
            {
                "marketCap": 3296638200075.58,
                "volume": 65853165805.92,
                "btcValue": 2135118319006.65,
                "ethValue": 293396450373.30,
                "stableValue": 236189135067.47,
                "otherValue": 631934295628.16,
                "timestamp": "1751162400"
            },
            {
                "marketCap": 3296230887283.12,
                "volume": 65568737056.01,
                "btcValue": 2134332169970.37,
                "ethValue": 293651749226.00,
                "stableValue": 236182188225.66,
                "otherValue": 632064779861.09,
                "timestamp": "1751166000"
            },
            {
                "marketCap": 3293327073345.80,
                "volume": 65594622706.81,
                "btcValue": 2132778857708.45,
                "ethValue": 293227674974.01,
                "stableValue": 236180518600.76,
                "otherValue": 631140022062.58,
                "timestamp": "1751169600"
            },
            {
                "marketCap": 3294562731012.34,
                "volume": 65545401687.18,
                "btcValue": 2133502453120.56,
                "ethValue": 293419989897.98,
                "stableValue": 236169609367.71,
                "otherValue": 631470678626.09,
                "timestamp": "1751173200"
            },
            {
                "marketCap": 3296642006092.50,
                "volume": 64553341263.29,
                "btcValue": 2134396983556.98,
                "ethValue": 293887484466.72,
                "stableValue": 236166865836.89,
                "otherValue": 632190672231.91,
                "timestamp": "1751176800"
            },
            {
                "marketCap": 3298698213589.80,
                "volume": 64861936359.77,
                "btcValue": 2135536719471.30,
                "ethValue": 294227500258.76,
                "stableValue": 236153933458.35,
                "otherValue": 632780060401.39,
                "timestamp": "1751180400"
            },
            {
                "marketCap": 3299576262481.27,
                "volume": 64844233005.90,
                "btcValue": 2135288950724.69,
                "ethValue": 294558007164.74,
                "stableValue": 236160872475.43,
                "otherValue": 633568432116.41,
                "timestamp": "1751184000"
            },
            {
                "marketCap": 3308905544713.47,
                "volume": 64736446721.41,
                "btcValue": 2142215970614.27,
                "ethValue": 295040292997.20,
                "stableValue": 236171336121.60,
                "otherValue": 635477944980.40,
                "timestamp": "1751187600"
            },
            {
                "marketCap": 3314401205985.59,
                "volume": 65925601584.94,
                "btcValue": 2145662373104.45,
                "ethValue": 295561624697.80,
                "stableValue": 236153232399.55,
                "otherValue": 637023975783.79,
                "timestamp": "1751191200"
            },
            {
                "marketCap": 3320673107094.64,
                "volume": 66638434151.69,
                "btcValue": 2151239349441.74,
                "ethValue": 296662176555.44,
                "stableValue": 236185790046.54,
                "otherValue": 636585791050.92,
                "timestamp": "1751194800"
            },
            {
                "marketCap": 3327754796532.22,
                "volume": 67641029826.74,
                "btcValue": 2157512928858.63,
                "ethValue": 297267680830.36,
                "stableValue": 236174948060.70,
                "otherValue": 636799238782.53,
                "timestamp": "1751198400"
            },
            {
                "marketCap": 3321067651392.59,
                "volume": 69687970242.93,
                "btcValue": 2151677496182.71,
                "ethValue": 296348831982.09,
                "stableValue": 236156923778.98,
                "otherValue": 636884399448.81,
                "timestamp": "1751202000"
            },
            {
                "marketCap": 3316636526433.21,
                "volume": 70188432315.23,
                "btcValue": 2149214614657.57,
                "ethValue": 295499388183.44,
                "stableValue": 236158908406.42,
                "otherValue": 635763615185.78,
                "timestamp": "1751205600"
            },
            {
                "marketCap": 3312300681513.32,
                "volume": 70905967292.17,
                "btcValue": 2146733397280.57,
                "ethValue": 294719393496.51,
                "stableValue": 236147984457.98,
                "otherValue": 634699906278.26,
                "timestamp": "1751209200"
            },
            {
                "marketCap": 3307012416865.13,
                "volume": 70317174809.52,
                "btcValue": 2143379418318.55,
                "ethValue": 294274090718.44,
                "stableValue": 236143884932.87,
                "otherValue": 633215022895.27,
                "timestamp": "1751212800"
            },
            {
                "marketCap": 3303281426405.34,
                "volume": 70445285486.58,
                "btcValue": 2139115630501.59,
                "ethValue": 294521352113.02,
                "stableValue": 236141496236.90,
                "otherValue": 633502947553.83,
                "timestamp": "1751216400"
            },
            {
                "marketCap": 3303529771950.88,
                "volume": 69546854266.01,
                "btcValue": 2138558897739.42,
                "ethValue": 294528183339.26,
                "stableValue": 236135929686.11,
                "otherValue": 634306761186.09,
                "timestamp": "1751220000"
            },
            {
                "marketCap": 3307855550386.06,
                "volume": 70480507158.49,
                "btcValue": 2140905231704.01,
                "ethValue": 294422992035.10,
                "stableValue": 236143254445.29,
                "otherValue": 636384072201.66,
                "timestamp": "1751223600"
            },
            {
                "marketCap": 3301968456699.88,
                "volume": 70420360049.44,
                "btcValue": 2136444077178.25,
                "ethValue": 294330620680.95,
                "stableValue": 236123551692.35,
                "otherValue": 635070207148.33,
                "timestamp": "1751227200"
            },
            {
                "marketCap": 3300667033246.78,
                "volume": 70557985221.48,
                "btcValue": 2136232494492.12,
                "ethValue": 293841446496.11,
                "stableValue": 236157726932.47,
                "otherValue": 634435365326.08,
                "timestamp": "1751230800"
            },
            {
                "marketCap": 3304969813239.51,
                "volume": 71103533877.30,
                "btcValue": 2138904605127.59,
                "ethValue": 293545885521.09,
                "stableValue": 236123532696.64,
                "otherValue": 636395789894.19,
                "timestamp": "1751234400"
            },
            {
                "marketCap": 3336116227399.77,
                "volume": 75583605887.43,
                "btcValue": 2149591324029.72,
                "ethValue": 301876144586.14,
                "stableValue": 236131230106.78,
                "otherValue": 648517528677.13,
                "timestamp": "1751238000"
            },
            {
                "marketCap": 3340390617686.81,
                "volume": 79213143423.58,
                "btcValue": 2155186577908.27,
                "ethValue": 301862861186.54,
                "stableValue": 236139580034.78,
                "otherValue": 647201598557.22,
                "timestamp": "1751241600"
            },
            {
                "marketCap": 3348076721486.55,
                "volume": 82143395604.81,
                "btcValue": 2162304151946.02,
                "ethValue": 304091003717.72,
                "stableValue": 236142401729.24,
                "otherValue": 645539164093.57,
                "timestamp": "1751245200"
            },
            {
                "marketCap": 3341585180462.63,
                "volume": 82614032647.58,
                "btcValue": 2158439634016.75,
                "ethValue": 303182899756.91,
                "stableValue": 236151881867.23,
                "otherValue": 643810764821.74,
                "timestamp": "1751248800"
            },
            {
                "marketCap": 3338604057540.18,
                "volume": 83967604074.03,
                "btcValue": 2157674153179.23,
                "ethValue": 301975023829.72,
                "stableValue": 236143365757.26,
                "otherValue": 642811514773.97,
                "timestamp": "1751252400"
            },
            {
                "marketCap": 3339029165224.41,
                "volume": 84976420279.24,
                "btcValue": 2158532663751.19,
                "ethValue": 301862429093.78,
                "stableValue": 236114202401.99,
                "otherValue": 642519869977.45,
                "timestamp": "1751256000"
            },
            {
                "marketCap": 3332013000239.96,
                "volume": 85586367293.61,
                "btcValue": 2154568646644.96,
                "ethValue": 301371195189.68,
                "stableValue": 236098895353.39,
                "otherValue": 639974263051.93,
                "timestamp": "1751259600"
            },
            {
                "marketCap": 3333835119882.88,
                "volume": 86512138498.76,
                "btcValue": 2153739314140.09,
                "ethValue": 302220305651.09,
                "stableValue": 236546321230.28,
                "otherValue": 641329178861.42,
                "timestamp": "1751263200"
            },
            {
                "marketCap": 3311577194409.59,
                "volume": 87141077231.43,
                "btcValue": 2140116880558.45,
                "ethValue": 297633038162.10,
                "stableValue": 236558759933.46,
                "otherValue": 637268515755.58,
                "timestamp": "1751266800"
            },
            {
                "marketCap": 3316179403370.05,
                "volume": 90244177671.96,
                "btcValue": 2140521418793.78,
                "ethValue": 299515394063.33,
                "stableValue": 236624542590.70,
                "otherValue": 639518047922.24,
                "timestamp": "1751270400"
            },
            {
                "marketCap": 3308921713894.66,
                "volume": 89881196938.31,
                "btcValue": 2138299760247.17,
                "ethValue": 298050945513.15,
                "stableValue": 236634125966.31,
                "otherValue": 635936882168.03,
                "timestamp": "1751274000"
            },
            {
                "marketCap": 3306091115991.02,
                "volume": 90171921320.20,
                "btcValue": 2137788834422.26,
                "ethValue": 296051977546.21,
                "stableValue": 236631010489.01,
                "otherValue": 635619293533.54,
                "timestamp": "1751277600"
            },
            {
                "marketCap": 3308891651573.76,
                "volume": 89685559568.37,
                "btcValue": 2140818337674.25,
                "ethValue": 296613566600.27,
                "stableValue": 236638431720.93,
                "otherValue": 634821315578.31,
                "timestamp": "1751281200"
            },
            {
                "marketCap": 3310192328552.82,
                "volume": 89109175698.04,
                "btcValue": 2140977327975.91,
                "ethValue": 296924862909.46,
                "stableValue": 236623567750.33,
                "otherValue": 635666569917.12,
                "timestamp": "1751284800"
            },
            {
                "marketCap": 3306826091508.72,
                "volume": 89862293067.65,
                "btcValue": 2139912140124.56,
                "ethValue": 297015629613.00,
                "stableValue": 236644489734.45,
                "otherValue": 633253832036.71,
                "timestamp": "1751288400"
            },
            {
                "marketCap": 3306671049137.32,
                "volume": 91007828855.46,
                "btcValue": 2138362687994.65,
                "ethValue": 297270421337.39,
                "stableValue": 236641679021.75,
                "otherValue": 634396260783.53,
                "timestamp": "1751292000"
            },
            {
                "marketCap": 3290098415759.77,
                "volume": 93254433701.66,
                "btcValue": 2124244137057.95,
                "ethValue": 294371284413.68,
                "stableValue": 236783721274.10,
                "otherValue": 634699273014.04,
                "timestamp": "1751295600"
            },
            {
                "marketCap": 3316468184128.97,
                "volume": 99046643474.34,
                "btcValue": 2139632170440.97,
                "ethValue": 298803996818.75,
                "stableValue": 236730588241.90,
                "otherValue": 641301428627.35,
                "timestamp": "1751299200"
            },
            {
                "marketCap": 3319286807593.80,
                "volume": 99058957043.06,
                "btcValue": 2140687431944.41,
                "ethValue": 298898429735.76,
                "stableValue": 236628792265.69,
                "otherValue": 643072153647.94,
                "timestamp": "1751302800"
            },
            {
                "marketCap": 3319005233287.40,
                "volume": 101147356331.08,
                "btcValue": 2137826333796.12,
                "ethValue": 300431536497.80,
                "stableValue": 236695284168.77,
                "otherValue": 644052078824.71,
                "timestamp": "1751306400"
            },
            {
                "marketCap": 3312540129785.09,
                "volume": 101715837716.85,
                "btcValue": 2133307013276.38,
                "ethValue": 300195904356.45,
                "stableValue": 236669377838.92,
                "otherValue": 642367834313.34,
                "timestamp": "1751310000"
            },
            {
                "marketCap": 3336290952971.79,
                "volume": 104331315450.02,
                "btcValue": 2143254306768.30,
                "ethValue": 303938885376.58,
                "stableValue": 236547809525.03,
                "otherValue": 652549951301.88,
                "timestamp": "1751313600"
            },
            {
                "marketCap": 3328527375437.86,
                "volume": 106757407352.55,
                "btcValue": 2139708502965.58,
                "ethValue": 302247821740.98,
                "stableValue": 236552032885.34,
                "otherValue": 650019017845.96,
                "timestamp": "1751317200"
            },
            {
                "marketCap": 3314093171322.38,
                "volume": 106692450533.13,
                "btcValue": 2130711620686.16,
                "ethValue": 300452847243.08,
                "stableValue": 236588171499.22,
                "otherValue": 646340531893.92,
                "timestamp": "1751320800"
            },
            {
                "marketCap": 3312762128615.90,
                "volume": 104283399742.28,
                "btcValue": 2130942339289.83,
                "ethValue": 300843371070.89,
                "stableValue": 236538617656.66,
                "otherValue": 644437800598.52,
                "timestamp": "1751324400"
            },
            {
                "marketCap": 3309726866995.00,
                "volume": 102305812622.83,
                "btcValue": 2131112964568.71,
                "ethValue": 300248242026.63,
                "stableValue": 236518159024.41,
                "otherValue": 641847501375.25,
                "timestamp": "1751328000"
            },
            {
                "marketCap": 3315218863956.63,
                "volume": 100216198550.24,
                "btcValue": 2135899510054.14,
                "ethValue": 301071566819.95,
                "stableValue": 236540922817.04,
                "otherValue": 641706864265.50,
                "timestamp": "1751331600"
            },
            {
                "marketCap": 3311510017652.58,
                "volume": 99121461658.93,
                "btcValue": 2132858939057.38,
                "ethValue": 300505593579.35,
                "stableValue": 236534323025.06,
                "otherValue": 641611161990.79,
                "timestamp": "1751335200"
            },
            {
                "marketCap": 3306262607215.30,
                "volume": 100203143225.06,
                "btcValue": 2130296053043.91,
                "ethValue": 299875192802.81,
                "stableValue": 236523220159.33,
                "otherValue": 639568141209.25,
                "timestamp": "1751338800"
            },
            {
                "marketCap": 3309546507594.68,
                "volume": 101079282999.14,
                "btcValue": 2132369444833.84,
                "ethValue": 300148748900.57,
                "stableValue": 236522091898.52,
                "otherValue": 640506221961.75,
                "timestamp": "1751342400"
            },
            {
                "marketCap": 3296765688304.73,
                "volume": 100252744051.64,
                "btcValue": 2126471013957.15,
                "ethValue": 297199176233.09,
                "stableValue": 236574956275.59,
                "otherValue": 636520541838.90,
                "timestamp": "1751346000"
            },
            {
                "marketCap": 3295383371136.13,
                "volume": 101250917587.18,
                "btcValue": 2127252354561.06,
                "ethValue": 297179072889.12,
                "stableValue": 236544291141.85,
                "otherValue": 634407652544.10,
                "timestamp": "1751349600"
            },
            {
                "marketCap": 3294380113239.53,
                "volume": 100872459568.66,
                "btcValue": 2126099147698.71,
                "ethValue": 297013215340.53,
                "stableValue": 236533455699.01,
                "otherValue": 634734294501.28,
                "timestamp": "1751353200"
            },
            {
                "marketCap": 3301016421052.23,
                "volume": 99953557173.93,
                "btcValue": 2131375422569.78,
                "ethValue": 297668542703.39,
                "stableValue": 236525588604.14,
                "otherValue": 635446867174.92,
                "timestamp": "1751356800"
            },
            {
                "marketCap": 3286972237953.89,
                "volume": 100732242934.36,
                "btcValue": 2122699247031.17,
                "ethValue": 296206234277.02,
                "stableValue": 236540127494.19,
                "otherValue": 631526629151.51,
                "timestamp": "1751360400"
            },
            {
                "marketCap": 3284613099331.66,
                "volume": 100993756693.55,
                "btcValue": 2119606897272.21,
                "ethValue": 296663392299.09,
                "stableValue": 236560510865.89,
                "otherValue": 631782298894.47,
                "timestamp": "1751364000"
            },
            {
                "marketCap": 3282025589271.12,
                "volume": 101140423375.56,
                "btcValue": 2117953676008.65,
                "ethValue": 296555216177.06,
                "stableValue": 236548475746.48,
                "otherValue": 630968221338.93,
                "timestamp": "1751367600"
            },
            {
                "marketCap": 3282235734214.74,
                "volume": 101561471201.61,
                "btcValue": 2120248969716.15,
                "ethValue": 295690028452.23,
                "stableValue": 236545435430.62,
                "otherValue": 629751300615.74,
                "timestamp": "1751371200"
            },
            {
                "marketCap": 3276262133419.48,
                "volume": 102021914376.81,
                "btcValue": 2117073908568.07,
                "ethValue": 294371016097.80,
                "stableValue": 236617250160.67,
                "otherValue": 628199958592.94,
                "timestamp": "1751374800"
            },
            {
                "marketCap": 3285153071580.39,
                "volume": 103401263220.76,
                "btcValue": 2124731620230.21,
                "ethValue": 295090225153.76,
                "stableValue": 236654677955.50,
                "otherValue": 628676548240.92,
                "timestamp": "1751378400"
            },
            {
                "marketCap": 3260826633365.76,
                "volume": 104140286127.77,
                "btcValue": 2106984222760.31,
                "ethValue": 292151452977.91,
                "stableValue": 236654815621.55,
                "otherValue": 625036142005.99,
                "timestamp": "1751382000"
            },
            {
                "marketCap": 3263253318385.46,
                "volume": 101172174719.32,
                "btcValue": 2108463178920.45,
                "ethValue": 292729156590.25,
                "stableValue": 236644126829.62,
                "otherValue": 625416856045.14,
                "timestamp": "1751385600"
            },
            {
                "marketCap": 3265055973379.30,
                "volume": 100495457859.12,
                "btcValue": 2110199103663.09,
                "ethValue": 292759243952.35,
                "stableValue": 236633361155.29,
                "otherValue": 625464264608.57,
                "timestamp": "1751389200"
            },
            {
                "marketCap": 3268597487593.68,
                "volume": 100074123159.34,
                "btcValue": 2113384843047.25,
                "ethValue": 293661046291.77,
                "stableValue": 236648563865.92,
                "otherValue": 624903034388.74,
                "timestamp": "1751392800"
            },
            {
                "marketCap": 3251868530086.93,
                "volume": 97683660684.39,
                "btcValue": 2104086692040.60,
                "ethValue": 291071273780.24,
                "stableValue": 236698160924.03,
                "otherValue": 620012403342.06,
                "timestamp": "1751396400"
            },
            {
                "marketCap": 3244479283689.19,
                "volume": 99331756954.47,
                "btcValue": 2096820713631.09,
                "ethValue": 290450409403.20,
                "stableValue": 236718356760.01,
                "otherValue": 620489803894.89,
                "timestamp": "1751400000"
            },
            {
                "marketCap": 3257697914904.36,
                "volume": 100024292135.74,
                "btcValue": 2107151626384.21,
                "ethValue": 291709677146.12,
                "stableValue": 236698409515.78,
                "otherValue": 622138201858.25,
                "timestamp": "1751403600"
            },
            {
                "marketCap": 3252495279699.68,
                "volume": 96167349296.62,
                "btcValue": 2103902452624.73,
                "ethValue": 290631931802.39,
                "stableValue": 236674927730.07,
                "otherValue": 621285967542.49,
                "timestamp": "1751407200"
            },
            {
                "marketCap": 3249053051549.81,
                "volume": 98141425888.02,
                "btcValue": 2101131790240.74,
                "ethValue": 289906083719.58,
                "stableValue": 236669327219.18,
                "otherValue": 621345850370.31,
                "timestamp": "1751410800"
            },
            {
                "marketCap": 3249064580818.20,
                "volume": 97853901270.09,
                "btcValue": 2101875708723.54,
                "ethValue": 290396347895.81,
                "stableValue": 236663300559.27,
                "otherValue": 620129223639.58,
                "timestamp": "1751414400"
            },
            {
                "marketCap": 3241430523233.02,
                "volume": 96094587747.40,
                "btcValue": 2096201119592.08,
                "ethValue": 289659599490.95,
                "stableValue": 236749891536.27,
                "otherValue": 618819912613.72,
                "timestamp": "1751418000"
            },
            {
                "marketCap": 3252234857805.83,
                "volume": 98916058653.09,
                "btcValue": 2102755457623.95,
                "ethValue": 291042816924.82,
                "stableValue": 236737740542.88,
                "otherValue": 621698842714.18,
                "timestamp": "1751421600"
            },
            {
                "marketCap": 3257280214418.19,
                "volume": 98062209557.06,
                "btcValue": 2106500564399.39,
                "ethValue": 291887006727.10,
                "stableValue": 236727969250.20,
                "otherValue": 622164674041.50,
                "timestamp": "1751425200"
            },
            {
                "marketCap": 3266400330514.84,
                "volume": 99842235171.43,
                "btcValue": 2112040792928.32,
                "ethValue": 293406936966.20,
                "stableValue": 236732600316.37,
                "otherValue": 624220000303.95,
                "timestamp": "1751428800"
            },
            {
                "marketCap": 3273979288324.67,
                "volume": 98483713112.22,
                "btcValue": 2115780573404.29,
                "ethValue": 294510394063.78,
                "stableValue": 236739018854.71,
                "otherValue": 626949302001.89,
                "timestamp": "1751432400"
            },
            {
                "marketCap": 3280547511401.68,
                "volume": 98677325060.63,
                "btcValue": 2120942191099.67,
                "ethValue": 295149002651.18,
                "stableValue": 236752501650.45,
                "otherValue": 627703816000.38,
                "timestamp": "1751436000"
            },
            {
                "marketCap": 3292007567571.60,
                "volume": 101254290627.66,
                "btcValue": 2128772911228.15,
                "ethValue": 296058798605.87,
                "stableValue": 236759870527.57,
                "otherValue": 630415987210.01,
                "timestamp": "1751439600"
            },
            {
                "marketCap": 3293504661320.98,
                "volume": 101091878529.25,
                "btcValue": 2130591651240.09,
                "ethValue": 295517468814.13,
                "stableValue": 236798542451.04,
                "otherValue": 630596998815.72,
                "timestamp": "1751443200"
            },
            {
                "marketCap": 3307419052440.90,
                "volume": 101631270183.15,
                "btcValue": 2143130326264.91,
                "ethValue": 295723875584.53,
                "stableValue": 236811646082.81,
                "otherValue": 631753204508.65,
                "timestamp": "1751446800"
            },
            {
                "marketCap": 3303576089822.76,
                "volume": 102382966666.79,
                "btcValue": 2141098117730.85,
                "ethValue": 295678287761.97,
                "stableValue": 236799499635.74,
                "otherValue": 630000184694.20,
                "timestamp": "1751450400"
            },
            {
                "marketCap": 3309086784589.59,
                "volume": 102393562135.42,
                "btcValue": 2144544319909.37,
                "ethValue": 296168493505.76,
                "stableValue": 236805374503.26,
                "otherValue": 631568596671.20,
                "timestamp": "1751454000"
            },
            {
                "marketCap": 3299477572919.87,
                "volume": 99293162711.01,
                "btcValue": 2137889506699.69,
                "ethValue": 295342734869.26,
                "stableValue": 236792007026.41,
                "otherValue": 629453324324.51,
                "timestamp": "1751457600"
            },
            {
                "marketCap": 3295743600659.17,
                "volume": 103024887677.26,
                "btcValue": 2135908263737.47,
                "ethValue": 294433496138.79,
                "stableValue": 236789762035.34,
                "otherValue": 628612078747.57,
                "timestamp": "1751461200"
            },
            {
                "marketCap": 3308087695483.86,
                "volume": 100705657218.91,
                "btcValue": 2144168624059.87,
                "ethValue": 295831135155.47,
                "stableValue": 236798698322.43,
                "otherValue": 631289237946.09,
                "timestamp": "1751464800"
            },
            {
                "marketCap": 3322358667084.34,
                "volume": 100266648055.51,
                "btcValue": 2151441714611.99,
                "ethValue": 298249565147.65,
                "stableValue": 236864625113.43,
                "otherValue": 635802762211.27,
                "timestamp": "1751468400"
            },
            {
                "marketCap": 3342735154468.13,
                "volume": 102038442792.88,
                "btcValue": 2163302003927.01,
                "ethValue": 301892975443.99,
                "stableValue": 236925706113.89,
                "otherValue": 640614468983.24,
                "timestamp": "1751472000"
            },
            {
                "marketCap": 3374156076352.75,
                "volume": 110305127528.10,
                "btcValue": 2177258491972.37,
                "ethValue": 309276490316.66,
                "stableValue": 236949990470.13,
                "otherValue": 650671103593.59,
                "timestamp": "1751475600"
            },
            {
                "marketCap": 3364067698723.33,
                "volume": 117080089924.43,
                "btcValue": 2170644591243.85,
                "ethValue": 309749347185.21,
                "stableValue": 236978894868.70,
                "otherValue": 646694865425.57,
                "timestamp": "1751479200"
            },
            {
                "marketCap": 3377946498462.26,
                "volume": 119491399486.95,
                "btcValue": 2179306429097.41,
                "ethValue": 311809711849.25,
                "stableValue": 236933194550.70,
                "otherValue": 649897162964.90,
                "timestamp": "1751482800"
            },
            {
                "marketCap": 3385009537042.38,
                "volume": 120095963805.99,
                "btcValue": 2182534781492.37,
                "ethValue": 314731002585.36,
                "stableValue": 236970604098.16,
                "otherValue": 650773148866.49,
                "timestamp": "1751486400"
            },
            {
                "marketCap": 3374116335777.77,
                "volume": 122434481858.84,
                "btcValue": 2171939115525.08,
                "ethValue": 312996140381.23,
                "stableValue": 236973102302.02,
                "otherValue": 652207977569.44,
                "timestamp": "1751490000"
            },
            {
                "marketCap": 3381484733636.55,
                "volume": 124721618279.31,
                "btcValue": 2177490473189.90,
                "ethValue": 313604714906.34,
                "stableValue": 236972271991.54,
                "otherValue": 653417273548.77,
                "timestamp": "1751493600"
            },
            {
                "marketCap": 3373793139141.94,
                "volume": 126550113929.51,
                "btcValue": 2171311863716.90,
                "ethValue": 313280253565.47,
                "stableValue": 236938548773.46,
                "otherValue": 652262473086.11,
                "timestamp": "1751497200"
            },
            {
                "marketCap": 3359230686524.17,
                "volume": 127746350750.45,
                "btcValue": 2164688057806.56,
                "ethValue": 310326278275.26,
                "stableValue": 236919278003.80,
                "otherValue": 647297072438.55,
                "timestamp": "1751500800"
            },
            {
                "marketCap": 3364450605141.57,
                "volume": 129366563150.52,
                "btcValue": 2167194346747.93,
                "ethValue": 310780807250.51,
                "stableValue": 237393147612.20,
                "otherValue": 649082303530.93,
                "timestamp": "1751504400"
            },
            {
                "marketCap": 3369031526796.43,
                "volume": 128622524095.65,
                "btcValue": 2168640863966.88,
                "ethValue": 311656319569.38,
                "stableValue": 237402022051.82,
                "otherValue": 651332321208.35,
                "timestamp": "1751508000"
            },
            {
                "marketCap": 3358946679392.56,
                "volume": 128575693269.28,
                "btcValue": 2163024474483.79,
                "ethValue": 310025955955.25,
                "stableValue": 237279510519.39,
                "otherValue": 648616738434.13,
                "timestamp": "1751511600"
            },
            {
                "marketCap": 3357053196578.43,
                "volume": 128183717747.17,
                "btcValue": 2161333552394.48,
                "ethValue": 309319702361.32,
                "stableValue": 237264945264.24,
                "otherValue": 649134996558.39,
                "timestamp": "1751515200"
            },
            {
                "marketCap": 3362240617565.09,
                "volume": 128203877452.34,
                "btcValue": 2164149214769.33,
                "ethValue": 309886840283.00,
                "stableValue": 237229252654.86,
                "otherValue": 650975309857.90,
                "timestamp": "1751518800"
            },
            {
                "marketCap": 3382850630853.63,
                "volume": 128804816691.75,
                "btcValue": 2175399295150.86,
                "ethValue": 312711248058.57,
                "stableValue": 237226599818.03,
                "otherValue": 657513487826.17,
                "timestamp": "1751522400"
            },
            {
                "marketCap": 3388089905893.09,
                "volume": 130661214961.41,
                "btcValue": 2177945926371.18,
                "ethValue": 313853964852.62,
                "stableValue": 237269086604.61,
                "otherValue": 659020928064.68,
                "timestamp": "1751526000"
            },
            {
                "marketCap": 3385870053533.21,
                "volume": 131052129935.54,
                "btcValue": 2174520706224.22,
                "ethValue": 313988555985.97,
                "stableValue": 237257575604.65,
                "otherValue": 660103215718.37,
                "timestamp": "1751529600"
            },
            {
                "marketCap": 3385719942608.18,
                "volume": 130689372855.94,
                "btcValue": 2176274795790.59,
                "ethValue": 312594684316.12,
                "stableValue": 237287289657.06,
                "otherValue": 659563172844.41,
                "timestamp": "1751533200"
            },
            {
                "marketCap": 3399719434703.58,
                "volume": 133411365541.37,
                "btcValue": 2187171312159.13,
                "ethValue": 313855313256.86,
                "stableValue": 237265112065.92,
                "otherValue": 661427697221.67,
                "timestamp": "1751536800"
            },
            {
                "marketCap": 3394979146411.82,
                "volume": 134342257969.92,
                "btcValue": 2185054317173.03,
                "ethValue": 313703368459.54,
                "stableValue": 237297558208.79,
                "otherValue": 658923902570.46,
                "timestamp": "1751540400"
            },
            {
                "marketCap": 3389270652922.88,
                "volume": 134274529278.66,
                "btcValue": 2180540635670.08,
                "ethValue": 313625567153.40,
                "stableValue": 237252475968.10,
                "otherValue": 657851974131.30,
                "timestamp": "1751544000"
            },
            {
                "marketCap": 3375598017136.22,
                "volume": 136871645853.17,
                "btcValue": 2171786159028.37,
                "ethValue": 312706533778.45,
                "stableValue": 237254300274.91,
                "otherValue": 653851024054.49,
                "timestamp": "1751547600"
            },
            {
                "marketCap": 3410062495101.54,
                "volume": 141886033530.54,
                "btcValue": 2193620947407.89,
                "ethValue": 316903096874.06,
                "stableValue": 237274876276.18,
                "otherValue": 662263574543.41,
                "timestamp": "1751551200"
            },
            {
                "marketCap": 3388494019392.47,
                "volume": 143016395808.14,
                "btcValue": 2183173212916.03,
                "ethValue": 313484860912.87,
                "stableValue": 237289926916.89,
                "otherValue": 654546018646.68,
                "timestamp": "1751554800"
            },
            {
                "marketCap": 3364311125745.64,
                "volume": 141374645363.57,
                "btcValue": 2170999340831.66,
                "ethValue": 310404004357.67,
                "stableValue": 237295219445.76,
                "otherValue": 645612561110.55,
                "timestamp": "1751558400"
            },
            {
                "marketCap": 3374127729846.24,
                "volume": 134481249744.04,
                "btcValue": 2175781383858.62,
                "ethValue": 310772489555.47,
                "stableValue": 237599833891.19,
                "otherValue": 649974022540.96,
                "timestamp": "1751562000"
            },
            {
                "marketCap": 3378561783907.67,
                "volume": 129597189812.53,
                "btcValue": 2179223826143.20,
                "ethValue": 311209838480.62,
                "stableValue": 237564074239.52,
                "otherValue": 650564045044.33,
                "timestamp": "1751565600"
            },
            {
                "marketCap": 3383051472099.44,
                "volume": 127221068994.80,
                "btcValue": 2181365087747.84,
                "ethValue": 312220648157.49,
                "stableValue": 237596594416.26,
                "otherValue": 651869141777.85,
                "timestamp": "1751569200"
            },
            {
                "marketCap": 3386285009699.82,
                "volume": 124483535118.86,
                "btcValue": 2184625533158.92,
                "ethValue": 312293458791.40,
                "stableValue": 237602052667.77,
                "otherValue": 651763965081.73,
                "timestamp": "1751572800"
            },
            {
                "marketCap": 3392644443136.36,
                "volume": 122145306616.14,
                "btcValue": 2187137147683.66,
                "ethValue": 313785898853.86,
                "stableValue": 237663333080.84,
                "otherValue": 654058063518.00,
                "timestamp": "1751576400"
            },
            {
                "marketCap": 3390169432997.38,
                "volume": 119923859503.52,
                "btcValue": 2184427884566.04,
                "ethValue": 313424652960.76,
                "stableValue": 237618891102.20,
                "otherValue": 654698004368.38,
                "timestamp": "1751580000"
            },
            {
                "marketCap": 3387459865322.78,
                "volume": 117835181895.47,
                "btcValue": 2182392934973.78,
                "ethValue": 313194199740.64,
                "stableValue": 237676059195.32,
                "otherValue": 654196671413.04,
                "timestamp": "1751583600"
            },
            {
                "marketCap": 3383128377207.79,
                "volume": 116401514233.00,
                "btcValue": 2180411697924.32,
                "ethValue": 312812671445.23,
                "stableValue": 237734554384.51,
                "otherValue": 652169453453.73,
                "timestamp": "1751587200"
            },
            {
                "marketCap": 3380591541781.66,
                "volume": 113737780040.02,
                "btcValue": 2177924243794.39,
                "ethValue": 312555172762.62,
                "stableValue": 237884846368.70,
                "otherValue": 652227278855.95,
                "timestamp": "1751590800"
            },
            {
                "marketCap": 3382354283087.41,
                "volume": 113248578141.08,
                "btcValue": 2178613061357.94,
                "ethValue": 312801548127.31,
                "stableValue": 237876677878.62,
                "otherValue": 653062995723.54,
                "timestamp": "1751594400"
            },
            {
                "marketCap": 3369543309023.65,
                "volume": 114085630014.21,
                "btcValue": 2172658160950.87,
                "ethValue": 311022390511.46,
                "stableValue": 237900165910.10,
                "otherValue": 647962591651.22,
                "timestamp": "1751598000"
            },
            {
                "marketCap": 3371876189517.83,
                "volume": 113318456604.61,
                "btcValue": 2173418952589.84,
                "ethValue": 311409133750.22,
                "stableValue": 237941156801.13,
                "otherValue": 649106946376.64,
                "timestamp": "1751601600"
            },
            {
                "marketCap": 3363143141554.70,
                "volume": 111759389282.30,
                "btcValue": 2168209120851.57,
                "ethValue": 310465500804.22,
                "stableValue": 237923689555.52,
                "otherValue": 646544830343.39,
                "timestamp": "1751605200"
            },
            {
                "marketCap": 3364762371489.53,
                "volume": 109874467307.38,
                "btcValue": 2168838015194.42,
                "ethValue": 310187488275.87,
                "stableValue": 237911794265.72,
                "otherValue": 647825073753.52,
                "timestamp": "1751608800"
            },
            {
                "marketCap": 3360006979141.85,
                "volume": 111176695933.21,
                "btcValue": 2168669340903.80,
                "ethValue": 308903305224.00,
                "stableValue": 237903506012.57,
                "otherValue": 644530827001.48,
                "timestamp": "1751612400"
            },
            {
                "marketCap": 3346236964799.17,
                "volume": 110100687574.08,
                "btcValue": 2162955091921.10,
                "ethValue": 306175662680.71,
                "stableValue": 237890052819.02,
                "otherValue": 639216157378.34,
                "timestamp": "1751616000"
            },
            {
                "marketCap": 3349561075128.11,
                "volume": 110247719510.42,
                "btcValue": 2163864371297.75,
                "ethValue": 307626356111.62,
                "stableValue": 237901452087.33,
                "otherValue": 640168895631.41,
                "timestamp": "1751619600"
            },
            {
                "marketCap": 3356231596962.74,
                "volume": 108468344837.35,
                "btcValue": 2168372184711.40,
                "ethValue": 308139349839.03,
                "stableValue": 237886452359.48,
                "otherValue": 641833610052.83,
                "timestamp": "1751623200"
            },
            {
                "marketCap": 3352922979555.72,
                "volume": 105302098948.00,
                "btcValue": 2166685104983.25,
                "ethValue": 307666892350.60,
                "stableValue": 237886153582.95,
                "otherValue": 640684828638.92,
                "timestamp": "1751626800"
            },
            {
                "marketCap": 3353373634186.99,
                "volume": 104369500935.76,
                "btcValue": 2166168344994.18,
                "ethValue": 307856578002.37,
                "stableValue": 237869376002.91,
                "otherValue": 641479335187.53,
                "timestamp": "1751630400"
            },
            {
                "marketCap": 3350094284701.59,
                "volume": 100237241708.60,
                "btcValue": 2163302293033.67,
                "ethValue": 307779205608.73,
                "stableValue": 237873325150.32,
                "otherValue": 641139460908.87,
                "timestamp": "1751634000"
            },
            {
                "marketCap": 3329299541426.01,
                "volume": 95989908560.13,
                "btcValue": 2148240822794.37,
                "ethValue": 304983566505.60,
                "stableValue": 237902523887.09,
                "otherValue": 638172628238.95,
                "timestamp": "1751637600"
            },
            {
                "marketCap": 3321968725072.80,
                "volume": 94090254563.28,
                "btcValue": 2145139726396.08,
                "ethValue": 303922074335.15,
                "stableValue": 237915972269.74,
                "otherValue": 634990952071.83,
                "timestamp": "1751641200"
            },
            {
                "marketCap": 3312347324107.94,
                "volume": 94897860926.07,
                "btcValue": 2140423637857.45,
                "ethValue": 301978771569.87,
                "stableValue": 237884217980.58,
                "otherValue": 632060696700.04,
                "timestamp": "1751644800"
            },
            {
                "marketCap": 3308240978055.06,
                "volume": 96746882249.40,
                "btcValue": 2140928404025.43,
                "ethValue": 300319609570.03,
                "stableValue": 237862654828.00,
                "otherValue": 629130309631.60,
                "timestamp": "1751648400"
            },
            {
                "marketCap": 3317863175242.13,
                "volume": 97805612689.83,
                "btcValue": 2146303951665.17,
                "ethValue": 301463275929.93,
                "stableValue": 237870362291.66,
                "otherValue": 632225585355.37,
                "timestamp": "1751652000"
            },
            {
                "marketCap": 3306945352117.26,
                "volume": 98132195055.24,
                "btcValue": 2138256739479.28,
                "ethValue": 299946813773.88,
                "stableValue": 237867795764.98,
                "otherValue": 630874003099.12,
                "timestamp": "1751655600"
            },
            {
                "marketCap": 3304992989109.81,
                "volume": 98577586357.60,
                "btcValue": 2137792224590.23,
                "ethValue": 299742997632.75,
                "stableValue": 237828320325.58,
                "otherValue": 629629446561.25,
                "timestamp": "1751659200"
            },
            {
                "marketCap": 3312597135886.46,
                "volume": 99026597381.15,
                "btcValue": 2142680608426.85,
                "ethValue": 300713950393.64,
                "stableValue": 237818484680.07,
                "otherValue": 631384092385.90,
                "timestamp": "1751662800"
            },
            {
                "marketCap": 3318157546332.64,
                "volume": 97577418334.76,
                "btcValue": 2146632557270.38,
                "ethValue": 301516449584.89,
                "stableValue": 237828610570.32,
                "otherValue": 632179928907.05,
                "timestamp": "1751666400"
            },
            {
                "marketCap": 3331352548109.43,
                "volume": 98983276213.97,
                "btcValue": 2153632862983.70,
                "ethValue": 304366822156.44,
                "stableValue": 237846149327.20,
                "otherValue": 635506713642.09,
                "timestamp": "1751670000"
            },
            {
                "marketCap": 3322183505343.47,
                "volume": 97314083570.83,
                "btcValue": 2148256044644.23,
                "ethValue": 302811047116.22,
                "stableValue": 237823396877.15,
                "otherValue": 633293016705.87,
                "timestamp": "1751673600"
            },
            {
                "marketCap": 3329693283109.69,
                "volume": 98959022830.27,
                "btcValue": 2152393815995.12,
                "ethValue": 303888960701.26,
                "stableValue": 238000871613.24,
                "otherValue": 635409634800.07,
                "timestamp": "1751677200"
            },
            {
                "marketCap": 3323332328077.62,
                "volume": 98112049702.86,
                "btcValue": 2148411820737.40,
                "ethValue": 303622343444.52,
                "stableValue": 238010143027.54,
                "otherValue": 633288020868.16,
                "timestamp": "1751680800"
            },
            {
                "marketCap": 3326562849819.95,
                "volume": 96589544569.74,
                "btcValue": 2149935144849.22,
                "ethValue": 304057303130.93,
                "stableValue": 237998536822.23,
                "otherValue": 634571865017.57,
                "timestamp": "1751684400"
            },
            {
                "marketCap": 3329604520941.37,
                "volume": 97022721454.33,
                "btcValue": 2151869965254.01,
                "ethValue": 304089031679.97,
                "stableValue": 238025028813.83,
                "otherValue": 635620495193.56,
                "timestamp": "1751688000"
            },
            {
                "marketCap": 3327750127202.54,
                "volume": 95458627571.31,
                "btcValue": 2151400772616.59,
                "ethValue": 303878352305.55,
                "stableValue": 238056044086.12,
                "otherValue": 634414958194.28,
                "timestamp": "1751691600"
            },
            {
                "marketCap": 3329201720151.87,
                "volume": 94430675948.20,
                "btcValue": 2151193564581.81,
                "ethValue": 304251714399.99,
                "stableValue": 238056428500.07,
                "otherValue": 635700012670.00,
                "timestamp": "1751695200"
            },
            {
                "marketCap": 3334623080721.89,
                "volume": 93549826759.11,
                "btcValue": 2154021681788.66,
                "ethValue": 305171229841.46,
                "stableValue": 238055955568.81,
                "otherValue": 637374213522.96,
                "timestamp": "1751698800"
            },
            {
                "marketCap": 3327381093965.06,
                "volume": 91261482896.59,
                "btcValue": 2149165678773.12,
                "ethValue": 304359797646.72,
                "stableValue": 238051510401.32,
                "otherValue": 635804107143.90,
                "timestamp": "1751702400"
            },
            {
                "marketCap": 3325275721169.66,
                "volume": 89536490068.00,
                "btcValue": 2149028099867.57,
                "ethValue": 303805030890.37,
                "stableValue": 238047722063.12,
                "otherValue": 634394868348.60,
                "timestamp": "1751706000"
            },
            {
                "marketCap": 3328425687210.60,
                "volume": 88365149260.75,
                "btcValue": 2150557857101.82,
                "ethValue": 304542067982.12,
                "stableValue": 238066334913.53,
                "otherValue": 635259427213.13,
                "timestamp": "1751709600"
            },
            {
                "marketCap": 3328487303022.80,
                "volume": 88713874603.68,
                "btcValue": 2151170226447.13,
                "ethValue": 304169713755.44,
                "stableValue": 238108170966.45,
                "otherValue": 635039191853.78,
                "timestamp": "1751713200"
            },
            {
                "marketCap": 3329458302721.63,
                "volume": 87641700990.62,
                "btcValue": 2151455870258.15,
                "ethValue": 304206527687.27,
                "stableValue": 238073284527.96,
                "otherValue": 635722620248.25,
                "timestamp": "1751716800"
            },
            {
                "marketCap": 3328238823743.26,
                "volume": 86930374616.06,
                "btcValue": 2151384923381.68,
                "ethValue": 304043991529.93,
                "stableValue": 238061214820.51,
                "otherValue": 634748694011.14,
                "timestamp": "1751720400"
            },
            {
                "marketCap": 3326785664799.54,
                "volume": 84606315870.86,
                "btcValue": 2151091894909.80,
                "ethValue": 303619495424.65,
                "stableValue": 238068499839.24,
                "otherValue": 634005774625.85,
                "timestamp": "1751724000"
            },
            {
                "marketCap": 3329731238035.72,
                "volume": 79769015843.85,
                "btcValue": 2152642149265.18,
                "ethValue": 304062798561.58,
                "stableValue": 238063245337.67,
                "otherValue": 634963044871.29,
                "timestamp": "1751727600"
            },
            {
                "marketCap": 3323807558181.98,
                "volume": 76384179468.37,
                "btcValue": 2149665253927.76,
                "ethValue": 302731067653.48,
                "stableValue": 238035423570.15,
                "otherValue": 633375813030.59,
                "timestamp": "1751731200"
            },
            {
                "marketCap": 3323113850685.44,
                "volume": 71592789302.08,
                "btcValue": 2150524830008.12,
                "ethValue": 302530566371.83,
                "stableValue": 238059268212.57,
                "otherValue": 631999186092.92,
                "timestamp": "1751734800"
            },
            {
                "marketCap": 3322545654974.68,
                "volume": 70734750981.45,
                "btcValue": 2150433467271.93,
                "ethValue": 302310670506.13,
                "stableValue": 238035455914.18,
                "otherValue": 631766061282.44,
                "timestamp": "1751738400"
            },
            {
                "marketCap": 3316901220421.51,
                "volume": 69517344870.78,
                "btcValue": 2148610747945.41,
                "ethValue": 301002121541.15,
                "stableValue": 238040330297.17,
                "otherValue": 629248020637.78,
                "timestamp": "1751742000"
            },
            {
                "marketCap": 3323837753427.81,
                "volume": 67374656488.33,
                "btcValue": 2151362870687.79,
                "ethValue": 302576792764.71,
                "stableValue": 238033756476.71,
                "otherValue": 631864333498.60,
                "timestamp": "1751745600"
            },
            {
                "marketCap": 3324336195057.49,
                "volume": 67528899309.65,
                "btcValue": 2150706571205.96,
                "ethValue": 302672409518.29,
                "stableValue": 238062922807.74,
                "otherValue": 632894291525.50,
                "timestamp": "1751749200"
            },
            {
                "marketCap": 3326129227774.97,
                "volume": 67225557027.67,
                "btcValue": 2150379661876.95,
                "ethValue": 303858386585.26,
                "stableValue": 238021376115.22,
                "otherValue": 633869803197.54,
                "timestamp": "1751752800"
            },
            {
                "marketCap": 3329720466100.62,
                "volume": 65737485788.40,
                "btcValue": 2152545891922.33,
                "ethValue": 304190051638.06,
                "stableValue": 238049675365.68,
                "otherValue": 634934847174.55,
                "timestamp": "1751756400"
            },
            {
                "marketCap": 3329243611099.58,
                "volume": 65679146413.27,
                "btcValue": 2152535865265.69,
                "ethValue": 303874194182.40,
                "stableValue": 238083985669.17,
                "otherValue": 634749565982.32,
                "timestamp": "1751760000"
            },
            {
                "marketCap": 3329918614147.70,
                "volume": 64746022669.06,
                "btcValue": 2152772552303.16,
                "ethValue": 304307490268.63,
                "stableValue": 238082155896.18,
                "otherValue": 634756415679.73,
                "timestamp": "1751763600"
            },
            {
                "marketCap": 3328580275471.79,
                "volume": 65045054494.27,
                "btcValue": 2152788762350.84,
                "ethValue": 303968153660.19,
                "stableValue": 238103724203.39,
                "otherValue": 633719635257.37,
                "timestamp": "1751767200"
            },
            {
                "marketCap": 3325950227425.67,
                "volume": 64651799084.73,
                "btcValue": 2151008573579.44,
                "ethValue": 303608784589.91,
                "stableValue": 238118801028.53,
                "otherValue": 633214068227.79,
                "timestamp": "1751770800"
            },
            {
                "marketCap": 3324608501971.49,
                "volume": 64174922495.86,
                "btcValue": 2149625882234.36,
                "ethValue": 303672825452.91,
                "stableValue": 238087892784.21,
                "otherValue": 633221901500.01,
                "timestamp": "1751774400"
            },
            {
                "marketCap": 3322916342097.46,
                "volume": 63613654286.35,
                "btcValue": 2148451178551.07,
                "ethValue": 303363681618.26,
                "stableValue": 238076228374.09,
                "otherValue": 633025253554.04,
                "timestamp": "1751778000"
            },
            {
                "marketCap": 3322719314841.90,
                "volume": 63635794933.66,
                "btcValue": 2148799736237.48,
                "ethValue": 303142251479.65,
                "stableValue": 238074821774.77,
                "otherValue": 632702505350.00,
                "timestamp": "1751781600"
            },
            {
                "marketCap": 3329303683457.83,
                "volume": 63926781023.58,
                "btcValue": 2151340602818.88,
                "ethValue": 304523972397.85,
                "stableValue": 238096398158.43,
                "otherValue": 635342710082.67,
                "timestamp": "1751785200"
            },
            {
                "marketCap": 3326467590355.42,
                "volume": 63841843963.62,
                "btcValue": 2149623821947.60,
                "ethValue": 304016792436.41,
                "stableValue": 238065673885.82,
                "otherValue": 634761302085.59,
                "timestamp": "1751788800"
            },
            {
                "marketCap": 3325893008208.73,
                "volume": 64216137131.58,
                "btcValue": 2148659066366.60,
                "ethValue": 303427371103.87,
                "stableValue": 238116394610.37,
                "otherValue": 635690176127.89,
                "timestamp": "1751792400"
            },
            {
                "marketCap": 3322837711270.28,
                "volume": 63298191695.77,
                "btcValue": 2146028873255.40,
                "ethValue": 302851784872.90,
                "stableValue": 238129500359.57,
                "otherValue": 635827552782.41,
                "timestamp": "1751796000"
            },
            {
                "marketCap": 3327553472267.52,
                "volume": 64812319191.42,
                "btcValue": 2148444669909.59,
                "ethValue": 302880575923.15,
                "stableValue": 238126011232.06,
                "otherValue": 638102215202.72,
                "timestamp": "1751799600"
            },
            {
                "marketCap": 3330119030899.75,
                "volume": 65159627606.00,
                "btcValue": 2149851374493.91,
                "ethValue": 303783331385.48,
                "stableValue": 238109884297.39,
                "otherValue": 638374440722.97,
                "timestamp": "1751803200"
            },
            {
                "marketCap": 3336015627133.78,
                "volume": 65732091878.11,
                "btcValue": 2152746457694.81,
                "ethValue": 304222667993.92,
                "stableValue": 238138528645.14,
                "otherValue": 640907972799.91,
                "timestamp": "1751806800"
            },
            {
                "marketCap": 3359853774684.43,
                "volume": 68629666368.52,
                "btcValue": 2163463713915.66,
                "ethValue": 308847511576.46,
                "stableValue": 238144372630.79,
                "otherValue": 649398176561.52,
                "timestamp": "1751810400"
            },
            {
                "marketCap": 3359041812782.97,
                "volume": 72058888568.44,
                "btcValue": 2166955744419.48,
                "ethValue": 309047227933.21,
                "stableValue": 238111575327.83,
                "otherValue": 644927265102.45,
                "timestamp": "1751814000"
            },
            {
                "marketCap": 3359218684466.87,
                "volume": 72697630850.74,
                "btcValue": 2166161107227.48,
                "ethValue": 308835983596.59,
                "stableValue": 238104231096.88,
                "otherValue": 646117362545.92,
                "timestamp": "1751817600"
            },
            {
                "marketCap": 3359123480254.69,
                "volume": 74251980243.43,
                "btcValue": 2165131845010.19,
                "ethValue": 308109720437.91,
                "stableValue": 238108376182.72,
                "otherValue": 647773538623.87,
                "timestamp": "1751821200"
            },
            {
                "marketCap": 3359257024576.68,
                "volume": 74264359009.72,
                "btcValue": 2166443540263.14,
                "ethValue": 307547397661.25,
                "stableValue": 238105475113.32,
                "otherValue": 647160611538.97,
                "timestamp": "1751824800"
            },
            {
                "marketCap": 3344417636835.37,
                "volume": 74216216126.93,
                "btcValue": 2157364804561.84,
                "ethValue": 305672950323.47,
                "stableValue": 238099941879.32,
                "otherValue": 643279940070.74,
                "timestamp": "1751828400"
            },
            {
                "marketCap": 3348277030084.15,
                "volume": 74124133315.06,
                "btcValue": 2159190409212.30,
                "ethValue": 306782170353.98,
                "stableValue": 238101643766.45,
                "otherValue": 644202806751.42,
                "timestamp": "1751832000"
            },
            {
                "marketCap": 3354902247561.27,
                "volume": 74961910403.18,
                "btcValue": 2162700741419.61,
                "ethValue": 307422000603.47,
                "stableValue": 238104358930.69,
                "otherValue": 646675146607.50,
                "timestamp": "1751835600"
            },
            {
                "marketCap": 3372383689316.55,
                "volume": 78430661492.53,
                "btcValue": 2172983914755.74,
                "ethValue": 312570005883.49,
                "stableValue": 238147572411.41,
                "otherValue": 648682196265.91,
                "timestamp": "1751839200"
            },
            {
                "marketCap": 3373136565587.33,
                "volume": 80201504722.28,
                "btcValue": 2172762589853.28,
                "ethValue": 311756700613.32,
                "stableValue": 238107848974.14,
                "otherValue": 650509426146.59,
                "timestamp": "1751842800"
            },
            {
                "marketCap": 3368903740745.58,
                "volume": 82101595211.89,
                "btcValue": 2172401405519.12,
                "ethValue": 310370530136.54,
                "stableValue": 238128147469.92,
                "otherValue": 648003657620.00,
                "timestamp": "1751846400"
            },
            {
                "marketCap": 3359127899368.30,
                "volume": 83605180719.82,
                "btcValue": 2164975865344.99,
                "ethValue": 309211802904.97,
                "stableValue": 238151196383.36,
                "otherValue": 646789034734.98,
                "timestamp": "1751850000"
            },
            {
                "marketCap": 3363425119250.90,
                "volume": 83994415483.26,
                "btcValue": 2168679033733.99,
                "ethValue": 309461664361.52,
                "stableValue": 238128754022.08,
                "otherValue": 647155667133.31,
                "timestamp": "1751853600"
            },
            {
                "marketCap": 3375606042028.31,
                "volume": 86344674903.12,
                "btcValue": 2175687311512.64,
                "ethValue": 311057858444.77,
                "stableValue": 238116706955.02,
                "otherValue": 650744165115.88,
                "timestamp": "1751857200"
            },
            {
                "marketCap": 3374395786217.67,
                "volume": 86705934960.80,
                "btcValue": 2175775557538.21,
                "ethValue": 311116107404.97,
                "stableValue": 238059322604.28,
                "otherValue": 649444798670.21,
                "timestamp": "1751860800"
            },
            {
                "marketCap": 3367675509090.39,
                "volume": 88134665349.05,
                "btcValue": 2170541948499.72,
                "ethValue": 310692468926.03,
                "stableValue": 238053163144.96,
                "otherValue": 648387928519.68,
                "timestamp": "1751864400"
            },
            {
                "marketCap": 3366283190816.18,
                "volume": 87994631532.86,
                "btcValue": 2169745559343.06,
                "ethValue": 310206932919.58,
                "stableValue": 237949459399.77,
                "otherValue": 648381239153.77,
                "timestamp": "1751868000"
            },
            {
                "marketCap": 3357510507060.96,
                "volume": 89352211676.83,
                "btcValue": 2163811825518.09,
                "ethValue": 309708664378.30,
                "stableValue": 237925775566.60,
                "otherValue": 646064241597.97,
                "timestamp": "1751871600"
            },
            {
                "marketCap": 3367684803941.73,
                "volume": 89627096362.68,
                "btcValue": 2169615313881.99,
                "ethValue": 311304944657.76,
                "stableValue": 237933571943.62,
                "otherValue": 648830973458.36,
                "timestamp": "1751875200"
            },
            {
                "marketCap": 3368010140178.43,
                "volume": 90344183993.30,
                "btcValue": 2168550563468.31,
                "ethValue": 312095379204.02,
                "stableValue": 237910360183.49,
                "otherValue": 649453837322.61,
                "timestamp": "1751878800"
            },
            {
                "marketCap": 3361345237603.14,
                "volume": 89353401177.30,
                "btcValue": 2165257481975.01,
                "ethValue": 310550965918.04,
                "stableValue": 237900961557.24,
                "otherValue": 647635828152.85,
                "timestamp": "1751882400"
            },
            {
                "marketCap": 3357136212005.24,
                "volume": 91683824072.19,
                "btcValue": 2162062612613.35,
                "ethValue": 309011102932.96,
                "stableValue": 237933696200.93,
                "otherValue": 648128800258.00,
                "timestamp": "1751886000"
            },
            {
                "marketCap": 3357315837237.65,
                "volume": 92909388378.92,
                "btcValue": 2161240117901.90,
                "ethValue": 309510634997.80,
                "stableValue": 237963279363.56,
                "otherValue": 648601804974.39,
                "timestamp": "1751889600"
            },
            {
                "marketCap": 3346117467908.92,
                "volume": 93529765093.77,
                "btcValue": 2154883310131.77,
                "ethValue": 307638939307.44,
                "stableValue": 237895718926.44,
                "otherValue": 645699499543.27,
                "timestamp": "1751893200"
            },
            {
                "marketCap": 3356665969779.96,
                "volume": 92029567989.59,
                "btcValue": 2158711848104.09,
                "ethValue": 309797773001.00,
                "stableValue": 237964713393.26,
                "otherValue": 650191635281.61,
                "timestamp": "1751896800"
            },
            {
                "marketCap": 3343773298151.22,
                "volume": 94142187332.75,
                "btcValue": 2152853422534.12,
                "ethValue": 305860123283.05,
                "stableValue": 238017003973.47,
                "otherValue": 647042748360.58,
                "timestamp": "1751900400"
            },
            {
                "marketCap": 3346163260265.17,
                "volume": 95371756849.00,
                "btcValue": 2154261250175.67,
                "ethValue": 305898645781.04,
                "stableValue": 237945959750.44,
                "otherValue": 648057404558.02,
                "timestamp": "1751904000"
            },
            {
                "marketCap": 3334909463346.07,
                "volume": 98485345576.05,
                "btcValue": 2147162611825.80,
                "ethValue": 304696795351.89,
                "stableValue": 237917780777.63,
                "otherValue": 645132275390.75,
                "timestamp": "1751907600"
            },
            {
                "marketCap": 3334135600547.93,
                "volume": 99698289876.52,
                "btcValue": 2146753160464.91,
                "ethValue": 305794805399.11,
                "stableValue": 237953351625.41,
                "otherValue": 643634283058.50,
                "timestamp": "1751911200"
            },
            {
                "marketCap": 3335807709077.11,
                "volume": 99839928616.90,
                "btcValue": 2148148305515.05,
                "ethValue": 307107210101.50,
                "stableValue": 237837002129.20,
                "otherValue": 642715191331.36,
                "timestamp": "1751914800"
            },
            {
                "marketCap": 3338899038088.68,
                "volume": 102753290195.30,
                "btcValue": 2149617234966.27,
                "ethValue": 307123604504.41,
                "stableValue": 237901967176.35,
                "otherValue": 644256231441.65,
                "timestamp": "1751918400"
            },
            {
                "marketCap": 3329015078410.34,
                "volume": 103678067424.36,
                "btcValue": 2146209326548.32,
                "ethValue": 305876145977.02,
                "stableValue": 237901523629.71,
                "otherValue": 639028082255.29,
                "timestamp": "1751922000"
            },
            {
                "marketCap": 3336752204820.55,
                "volume": 101867182470.89,
                "btcValue": 2151483348353.64,
                "ethValue": 306588092122.01,
                "stableValue": 237849366077.93,
                "otherValue": 640831398266.97,
                "timestamp": "1751925600"
            },
            {
                "marketCap": 3332387050219.33,
                "volume": 102137234075.50,
                "btcValue": 2148621716984.82,
                "ethValue": 306165190576.44,
                "stableValue": 237848266265.99,
                "otherValue": 639751876392.08,
                "timestamp": "1751929200"
            },
            {
                "marketCap": 3340490469840.17,
                "volume": 101182692207.58,
                "btcValue": 2153600340877.35,
                "ethValue": 306934830823.74,
                "stableValue": 237843890392.91,
                "otherValue": 642111407746.17,
                "timestamp": "1751932800"
            },
            {
                "marketCap": 3340347536308.54,
                "volume": 101962753823.96,
                "btcValue": 2154175127322.59,
                "ethValue": 306673951997.71,
                "stableValue": 237932865739.75,
                "otherValue": 641565591248.49,
                "timestamp": "1751936400"
            },
            {
                "marketCap": 3324422231698.75,
                "volume": 101298736567.07,
                "btcValue": 2142913426608.61,
                "ethValue": 305073803172.30,
                "stableValue": 237975262468.26,
                "otherValue": 638459739449.58,
                "timestamp": "1751940000"
            },
            {
                "marketCap": 3323288795254.31,
                "volume": 100438784021.17,
                "btcValue": 2143422987255.81,
                "ethValue": 305256916946.97,
                "stableValue": 237935444686.15,
                "otherValue": 636673446365.38,
                "timestamp": "1751943600"
            },
            {
                "marketCap": 3329477227832.54,
                "volume": 102270178674.15,
                "btcValue": 2146300278993.78,
                "ethValue": 306415988778.58,
                "stableValue": 237894824178.77,
                "otherValue": 638866135881.41,
                "timestamp": "1751947200"
            },
            {
                "marketCap": 3332314495493.78,
                "volume": 102048824878.76,
                "btcValue": 2148237363408.16,
                "ethValue": 307031673344.96,
                "stableValue": 237893200564.81,
                "otherValue": 639152258175.85,
                "timestamp": "1751950800"
            },
            {
                "marketCap": 3338218505396.11,
                "volume": 98896591421.32,
                "btcValue": 2152274176334.13,
                "ethValue": 308058438434.12,
                "stableValue": 237890130492.71,
                "otherValue": 639995760135.15,
                "timestamp": "1751954400"
            },
            {
                "marketCap": 3341105450774.66,
                "volume": 101298059648.10,
                "btcValue": 2154018856304.03,
                "ethValue": 308928428488.23,
                "stableValue": 237892853184.31,
                "otherValue": 640265312798.09,
                "timestamp": "1751958000"
            },
            {
                "marketCap": 3345267173792.85,
                "volume": 102202754469.72,
                "btcValue": 2157594682984.53,
                "ethValue": 308189540600.75,
                "stableValue": 237882306948.54,
                "otherValue": 641600643259.03,
                "timestamp": "1751961600"
            },
            {
                "marketCap": 3340882132918.95,
                "volume": 100648854879.49,
                "btcValue": 2153799327172.31,
                "ethValue": 307464382699.86,
                "stableValue": 237902446573.64,
                "otherValue": 641715976473.14,
                "timestamp": "1751965200"
            },
            {
                "marketCap": 3345879348616.52,
                "volume": 103288561550.34,
                "btcValue": 2157151688325.37,
                "ethValue": 308132940061.15,
                "stableValue": 237872705475.27,
                "otherValue": 642722014754.73,
                "timestamp": "1751968800"
            },
            {
                "marketCap": 3357876065066.77,
                "volume": 101951678403.61,
                "btcValue": 2164708911021.77,
                "ethValue": 309731744132.26,
                "stableValue": 237882218393.63,
                "otherValue": 645553191519.11,
                "timestamp": "1751972400"
            },
            {
                "marketCap": 3358722135926.37,
                "volume": 103985217399.85,
                "btcValue": 2163473229810.42,
                "ethValue": 310898693064.85,
                "stableValue": 237873822763.71,
                "otherValue": 646476390287.39,
                "timestamp": "1751976000"
            },
            {
                "marketCap": 3365135078429.11,
                "volume": 103924302335.20,
                "btcValue": 2166876526799.12,
                "ethValue": 311856892139.35,
                "stableValue": 237878992226.97,
                "otherValue": 648522667263.67,
                "timestamp": "1751979600"
            },
            {
                "marketCap": 3369446157929.25,
                "volume": 100629368267.03,
                "btcValue": 2169814090328.12,
                "ethValue": 312666190326.43,
                "stableValue": 237902694182.82,
                "otherValue": 649063183091.88,
                "timestamp": "1751983200"
            },
            {
                "marketCap": 3346779645012.97,
                "volume": 101061720643.18,
                "btcValue": 2155980211002.39,
                "ethValue": 309584235575.53,
                "stableValue": 237893160604.31,
                "otherValue": 643322037830.74,
                "timestamp": "1751986800"
            },
            {
                "marketCap": 3344689158275.39,
                "volume": 101467690393.49,
                "btcValue": 2153630903866.83,
                "ethValue": 309652309453.48,
                "stableValue": 237841287168.15,
                "otherValue": 643564657786.93,
                "timestamp": "1751990400"
            },
            {
                "marketCap": 3351571175060.13,
                "volume": 98495152655.53,
                "btcValue": 2157211957009.04,
                "ethValue": 311064753426.31,
                "stableValue": 237841658045.38,
                "otherValue": 645452806579.40,
                "timestamp": "1751994000"
            },
            {
                "marketCap": 3373437817067.40,
                "volume": 100227589268.00,
                "btcValue": 2167940822518.43,
                "ethValue": 315890651170.19,
                "stableValue": 237849670064.73,
                "otherValue": 651756673314.05,
                "timestamp": "1751997600"
            },
            {
                "marketCap": 3379465741183.35,
                "volume": 100951741785.05,
                "btcValue": 2171329195334.15,
                "ethValue": 316961828566.26,
                "stableValue": 237925574510.94,
                "otherValue": 653249142772.00,
                "timestamp": "1752001200"
            },
            {
                "marketCap": 3367526402105.67,
                "volume": 101628093203.55,
                "btcValue": 2164078243134.18,
                "ethValue": 315179444953.32,
                "stableValue": 237890455614.64,
                "otherValue": 650378258403.53,
                "timestamp": "1752004800"
            },
            {
                "marketCap": 3362188016239.01,
                "volume": 99917215393.89,
                "btcValue": 2161505799524.89,
                "ethValue": 314157318754.00,
                "stableValue": 237884483252.57,
                "otherValue": 648640414707.55,
                "timestamp": "1752008400"
            },
            {
                "marketCap": 3369051435193.79,
                "volume": 100687476042.83,
                "btcValue": 2166210339924.20,
                "ethValue": 315053467641.46,
                "stableValue": 237905383559.32,
                "otherValue": 649882244068.81,
                "timestamp": "1752012000"
            },
            {
                "marketCap": 3370427921751.15,
                "volume": 99922851058.01,
                "btcValue": 2166867803486.12,
                "ethValue": 315243387021.01,
                "stableValue": 237926610864.24,
                "otherValue": 650390120379.78,
                "timestamp": "1752015600"
            },
            {
                "marketCap": 3372141459977.23,
                "volume": 99809526761.02,
                "btcValue": 2167120385637.40,
                "ethValue": 315745693289.03,
                "stableValue": 237929417652.65,
                "otherValue": 651345963398.15,
                "timestamp": "1752019200"
            },
            {
                "marketCap": 3370911328710.01,
                "volume": 98926674833.79,
                "btcValue": 2167279218103.50,
                "ethValue": 315510170115.28,
                "stableValue": 237924005826.49,
                "otherValue": 650197934664.74,
                "timestamp": "1752022800"
            },
            {
                "marketCap": 3365901549813.09,
                "volume": 97789853473.79,
                "btcValue": 2163922200555.42,
                "ethValue": 314536437957.96,
                "stableValue": 237920347964.44,
                "otherValue": 649522563335.27,
                "timestamp": "1752026400"
            },
            {
                "marketCap": 3363709213082.81,
                "volume": 96876377634.80,
                "btcValue": 2160857490267.23,
                "ethValue": 314290083577.70,
                "stableValue": 237923960897.95,
                "otherValue": 650637678339.93,
                "timestamp": "1752030000"
            },
            {
                "marketCap": 3356490851982.44,
                "volume": 97181812116.50,
                "btcValue": 2155966568470.34,
                "ethValue": 312913579387.42,
                "stableValue": 237900305098.18,
                "otherValue": 649710399026.50,
                "timestamp": "1752033600"
            },
            {
                "marketCap": 3362948629029.19,
                "volume": 97539224918.51,
                "btcValue": 2159391190121.34,
                "ethValue": 314175413750.76,
                "stableValue": 237903160180.80,
                "otherValue": 651478864976.29,
                "timestamp": "1752037200"
            },
            {
                "marketCap": 3374396744569.83,
                "volume": 98344162911.01,
                "btcValue": 2163892290337.45,
                "ethValue": 317362257207.70,
                "stableValue": 237877072375.21,
                "otherValue": 655265124649.47,
                "timestamp": "1752040800"
            },
            {
                "marketCap": 3376450006913.78,
                "volume": 97998173531.90,
                "btcValue": 2165301977685.36,
                "ethValue": 317709014951.49,
                "stableValue": 237872477663.41,
                "otherValue": 655566536613.52,
                "timestamp": "1752044400"
            },
            {
                "marketCap": 3373583778234.10,
                "volume": 99296546284.63,
                "btcValue": 2162450142793.09,
                "ethValue": 316901283274.81,
                "stableValue": 237912507178.69,
                "otherValue": 656319844987.51,
                "timestamp": "1752048000"
            },
            {
                "marketCap": 3371240715498.76,
                "volume": 98636557456.47,
                "btcValue": 2161718521731.47,
                "ethValue": 315449643613.47,
                "stableValue": 237867847184.70,
                "otherValue": 656204702969.12,
                "timestamp": "1752051600"
            },
            {
                "marketCap": 3372892055941.48,
                "volume": 99058798642.28,
                "btcValue": 2163420007908.28,
                "ethValue": 315370826038.71,
                "stableValue": 237868883386.81,
                "otherValue": 656232338607.68,
                "timestamp": "1752055200"
            },
            {
                "marketCap": 3377860934627.90,
                "volume": 98852948088.90,
                "btcValue": 2166058218126.44,
                "ethValue": 316051477964.49,
                "stableValue": 237863763086.08,
                "otherValue": 657887475450.89,
                "timestamp": "1752058800"
            },
            {
                "marketCap": 3386363111747.40,
                "volume": 99032226179.96,
                "btcValue": 2169630701453.43,
                "ethValue": 317035723296.06,
                "stableValue": 237864743954.91,
                "otherValue": 661831943043.00,
                "timestamp": "1752062400"
            },
            {
                "marketCap": 3398111546808.21,
                "volume": 102898020251.42,
                "btcValue": 2174944005056.17,
                "ethValue": 321193267543.15,
                "stableValue": 237861959714.24,
                "otherValue": 664112314494.65,
                "timestamp": "1752066000"
            },
            {
                "marketCap": 3392749838921.27,
                "volume": 104210703727.53,
                "btcValue": 2172068994015.13,
                "ethValue": 320533041969.42,
                "stableValue": 237885172340.68,
                "otherValue": 662262630596.04,
                "timestamp": "1752069600"
            },
            {
                "marketCap": 3385767487001.03,
                "volume": 105920401984.46,
                "btcValue": 2166347636624.53,
                "ethValue": 318971740470.83,
                "stableValue": 237946269124.78,
                "otherValue": 662501840780.89,
                "timestamp": "1752073200"
            },
            {
                "marketCap": 3390564368897.13,
                "volume": 107820878386.56,
                "btcValue": 2169814193778.21,
                "ethValue": 320733244678.44,
                "stableValue": 237868177171.47,
                "otherValue": 662148753269.01,
                "timestamp": "1752076800"
            },
            {
                "marketCap": 3400784399962.44,
                "volume": 108026145337.12,
                "btcValue": 2176648439715.88,
                "ethValue": 322085603174.99,
                "stableValue": 237909029515.60,
                "otherValue": 664141327555.97,
                "timestamp": "1752080400"
            },
            {
                "marketCap": 3393009498303.75,
                "volume": 105193868440.77,
                "btcValue": 2171520797108.88,
                "ethValue": 321449566368.42,
                "stableValue": 237880122775.68,
                "otherValue": 662159012050.77,
                "timestamp": "1752084000"
            },
            {
                "marketCap": 3410772335860.88,
                "volume": 107636812666.73,
                "btcValue": 2179217105429.89,
                "ethValue": 328243291335.37,
                "stableValue": 237941554483.37,
                "otherValue": 665370384612.25,
                "timestamp": "1752087600"
            },
            {
                "marketCap": 3469280800394.38,
                "volume": 118933012698.31,
                "btcValue": 2221976077186.31,
                "ethValue": 333513365715.58,
                "stableValue": 238059255414.86,
                "otherValue": 675732102077.63,
                "timestamp": "1752091200"
            },
            {
                "marketCap": 3443700380104.04,
                "volume": 126844365520.11,
                "btcValue": 2202943033853.46,
                "ethValue": 330844541281.10,
                "stableValue": 238129361756.38,
                "otherValue": 671783443213.10,
                "timestamp": "1752094800"
            },
            {
                "marketCap": 3452945261608.61,
                "volume": 130742335527.54,
                "btcValue": 2206199364549.76,
                "ethValue": 332538280413.57,
                "stableValue": 238263600782.17,
                "otherValue": 675944015863.11,
                "timestamp": "1752098400"
            },
            {
                "marketCap": 3468270378901.52,
                "volume": 132577178097.23,
                "btcValue": 2216372861055.46,
                "ethValue": 335748624162.67,
                "stableValue": 238352373734.51,
                "otherValue": 677796519948.88,
                "timestamp": "1752102000"
            },
            {
                "marketCap": 3462715757240.17,
                "volume": 134210140295.09,
                "btcValue": 2213797700000.17,
                "ethValue": 334430433146.30,
                "stableValue": 238450238963.47,
                "otherValue": 676037385130.23,
                "timestamp": "1752105600"
            },
            {
                "marketCap": 3451621250504.46,
                "volume": 136742346167.63,
                "btcValue": 2207172158234.75,
                "ethValue": 333013222854.63,
                "stableValue": 238575931795.65,
                "otherValue": 672859937619.43,
                "timestamp": "1752109200"
            },
            {
                "marketCap": 3465241738990.49,
                "volume": 136775093771.69,
                "btcValue": 2212615055733.64,
                "ethValue": 335044870105.26,
                "stableValue": 238595162278.89,
                "otherValue": 678986650872.70,
                "timestamp": "1752112800"
            },
            {
                "marketCap": 3466714956123.66,
                "volume": 138612540672.93,
                "btcValue": 2212995865809.03,
                "ethValue": 336158189111.09,
                "stableValue": 238613369902.36,
                "otherValue": 678947531301.18,
                "timestamp": "1752116400"
            },
            {
                "marketCap": 3462130985961.51,
                "volume": 139959484781.52,
                "btcValue": 2210189006715.97,
                "ethValue": 335286889990.90,
                "stableValue": 238653483408.22,
                "otherValue": 678001605846.42,
                "timestamp": "1752120000"
            },
            {
                "marketCap": 3465689897108.29,
                "volume": 141507740063.84,
                "btcValue": 2211745483706.86,
                "ethValue": 335595696066.28,
                "stableValue": 238697756614.06,
                "otherValue": 679650960721.09,
                "timestamp": "1752123600"
            },
            {
                "marketCap": 3464897775676.24,
                "volume": 139293542337.93,
                "btcValue": 2211037293161.48,
                "ethValue": 336040605091.42,
                "stableValue": 238740195306.50,
                "otherValue": 679079682116.84,
                "timestamp": "1752127200"
            },
            {
                "marketCap": 3470107392521.55,
                "volume": 140624451236.57,
                "btcValue": 2213703781069.05,
                "ethValue": 337643693615.96,
                "stableValue": 238750180302.24,
                "otherValue": 680009737534.30,
                "timestamp": "1752130800"
            },
            {
                "marketCap": 3469428333410.13,
                "volume": 142621503587.17,
                "btcValue": 2213180632376.32,
                "ethValue": 337140250252.12,
                "stableValue": 238722601961.75,
                "otherValue": 680384848819.94,
                "timestamp": "1752134400"
            },
            {
                "marketCap": 3472101437215.81,
                "volume": 145923348892.19,
                "btcValue": 2213746968770.54,
                "ethValue": 336750670161.97,
                "stableValue": 238705044352.11,
                "otherValue": 682898753931.19,
                "timestamp": "1752138000"
            },
            {
                "marketCap": 3464558748700.63,
                "volume": 146304268580.68,
                "btcValue": 2209497658920.10,
                "ethValue": 335427685237.52,
                "stableValue": 238604893469.18,
                "otherValue": 681028511073.83,
                "timestamp": "1752141600"
            },
            {
                "marketCap": 3466426529629.80,
                "volume": 147390430173.92,
                "btcValue": 2210433397647.46,
                "ethValue": 336323648085.14,
                "stableValue": 238669990487.24,
                "otherValue": 680999493409.96,
                "timestamp": "1752145200"
            },
            {
                "marketCap": 3464073795554.83,
                "volume": 146136505397.32,
                "btcValue": 2209107372461.83,
                "ethValue": 335573746223.33,
                "stableValue": 238654708408.55,
                "otherValue": 680737968461.12,
                "timestamp": "1752148800"
            },
            {
                "marketCap": 3459313214617.85,
                "volume": 144361834072.69,
                "btcValue": 2205846086013.51,
                "ethValue": 335574684915.56,
                "stableValue": 238707341659.93,
                "otherValue": 679185102028.85,
                "timestamp": "1752152400"
            },
            {
                "marketCap": 3456754447851.80,
                "volume": 142201997804.20,
                "btcValue": 2203928914415.42,
                "ethValue": 336086245867.52,
                "stableValue": 238740389145.83,
                "otherValue": 677998898423.03,
                "timestamp": "1752156000"
            },
            {
                "marketCap": 3466821031587.12,
                "volume": 141331078256.21,
                "btcValue": 2213954057959.72,
                "ethValue": 335325648388.16,
                "stableValue": 238728844298.55,
                "otherValue": 678812480940.69,
                "timestamp": "1752159600"
            },
            {
                "marketCap": 3468957819932.26,
                "volume": 142572123844.81,
                "btcValue": 2216798808973.48,
                "ethValue": 334464629173.59,
                "stableValue": 238707764207.36,
                "otherValue": 678986617577.83,
                "timestamp": "1752163200"
            },
            {
                "marketCap": 3506318779698.85,
                "volume": 149366222607.49,
                "btcValue": 2241359980645.79,
                "ethValue": 339043435838.18,
                "stableValue": 238721486268.61,
                "otherValue": 687193876946.27,
                "timestamp": "1752166800"
            },
            {
                "marketCap": 3540133920711.59,
                "volume": 156564774403.69,
                "btcValue": 2263948963873.86,
                "ethValue": 342011022070.03,
                "stableValue": 238845789754.46,
                "otherValue": 695328145013.24,
                "timestamp": "1752170400"
            },
            {
                "marketCap": 3527904338119.33,
                "volume": 156393360582.41,
                "btcValue": 2257403393595.76,
                "ethValue": 339544093525.19,
                "stableValue": 238961296327.96,
                "otherValue": 691995554670.42,
                "timestamp": "1752174000"
            },
            {
                "marketCap": 3528502334107.63,
                "volume": 149944891983.48,
                "btcValue": 2256242818502.67,
                "ethValue": 340352036414.09,
                "stableValue": 239005673135.15,
                "otherValue": 692901806055.72,
                "timestamp": "1752177600"
            },
            {
                "marketCap": 3534579976579.37,
                "volume": 145118030848.37,
                "btcValue": 2259439586230.54,
                "ethValue": 340551207677.08,
                "stableValue": 239025918399.36,
                "otherValue": 695563264272.39,
                "timestamp": "1752181200"
            },
            {
                "marketCap": 3623831921863.58,
                "volume": 178854425345.34,
                "btcValue": 2316214377638.08,
                "ethValue": 358871366852.33,
                "stableValue": 238915628315.26,
                "otherValue": 709830549057.91,
                "timestamp": "1752184800"
            },
            {
                "marketCap": 3617276351934.72,
                "volume": 188784569661.71,
                "btcValue": 2307436432045.70,
                "ethValue": 358919494101.59,
                "stableValue": 238922199480.81,
                "otherValue": 711998226306.62,
                "timestamp": "1752188400"
            },
            {
                "marketCap": 3613640884854.91,
                "volume": 193145116248.24,
                "btcValue": 2306991096410.19,
                "ethValue": 356193627182.80,
                "stableValue": 238916365877.09,
                "otherValue": 711539795384.83,
                "timestamp": "1752192000"
            },
            {
                "marketCap": 3600694063328.59,
                "volume": 195260571002.28,
                "btcValue": 2299298838813.34,
                "ethValue": 354638333055.29,
                "stableValue": 239235611992.26,
                "otherValue": 707521279467.70,
                "timestamp": "1752195600"
            },
            {
                "marketCap": 3616018422765.63,
                "volume": 198759864093.33,
                "btcValue": 2306589146595.81,
                "ethValue": 356803482348.95,
                "stableValue": 239211352838.31,
                "otherValue": 713414440982.56,
                "timestamp": "1752199200"
            },
            {
                "marketCap": 3638000407373.06,
                "volume": 202575709662.97,
                "btcValue": 2320864073587.04,
                "ethValue": 357974555342.00,
                "stableValue": 239222698559.32,
                "otherValue": 719939079884.70,
                "timestamp": "1752202800"
            },
            {
                "marketCap": 3641689217007.36,
                "volume": 205579614147.75,
                "btcValue": 2325014438711.84,
                "ethValue": 358589120090.38,
                "stableValue": 239197685245.91,
                "otherValue": 718887972959.23,
                "timestamp": "1752206400"
            },
            {
                "marketCap": 3643698663943.17,
                "volume": 207280854619.48,
                "btcValue": 2325179775184.93,
                "ethValue": 358573927037.30,
                "stableValue": 239258317705.47,
                "otherValue": 720686644015.47,
                "timestamp": "1752210000"
            },
            {
                "marketCap": 3671659348377.55,
                "volume": 218745799145.40,
                "btcValue": 2344864682758.03,
                "ethValue": 362877248439.43,
                "stableValue": 239288463706.81,
                "otherValue": 724628953473.28,
                "timestamp": "1752213600"
            },
            {
                "marketCap": 3658835791363.76,
                "volume": 223963979303.03,
                "btcValue": 2340352673853.81,
                "ethValue": 360890491693.78,
                "stableValue": 239283607531.66,
                "otherValue": 718309018284.51,
                "timestamp": "1752217200"
            },
            {
                "marketCap": 3655119249843.96,
                "volume": 233123267219.86,
                "btcValue": 2338872673947.47,
                "ethValue": 358688560046.92,
                "stableValue": 239298674786.87,
                "otherValue": 718259341062.70,
                "timestamp": "1752220800"
            },
            {
                "marketCap": 3670545993862.77,
                "volume": 238012683123.76,
                "btcValue": 2347277585378.01,
                "ethValue": 362634086415.79,
                "stableValue": 239253020829.36,
                "otherValue": 721381301239.61,
                "timestamp": "1752224400"
            },
            {
                "marketCap": 3686586049769.62,
                "volume": 242310764083.00,
                "btcValue": 2357076717911.77,
                "ethValue": 363968658103.84,
                "stableValue": 239262896282.75,
                "otherValue": 726277777471.26,
                "timestamp": "1752228000"
            },
            {
                "marketCap": 3677674554703.35,
                "volume": 245649012713.16,
                "btcValue": 2346919389467.18,
                "ethValue": 362534983131.59,
                "stableValue": 239239993796.73,
                "otherValue": 728980188307.85,
                "timestamp": "1752231600"
            },
            {
                "marketCap": 3670384685003.71,
                "volume": 249175966503.59,
                "btcValue": 2344360326423.56,
                "ethValue": 360402635984.77,
                "stableValue": 239225554038.92,
                "otherValue": 726396168556.46,
                "timestamp": "1752235200"
            },
            {
                "marketCap": 3676560100134.57,
                "volume": 252472245081.41,
                "btcValue": 2345057956389.12,
                "ethValue": 360584672355.61,
                "stableValue": 239215597921.32,
                "otherValue": 731701873468.52,
                "timestamp": "1752238800"
            },
            {
                "marketCap": 3694350494695.85,
                "volume": 256268853370.78,
                "btcValue": 2348316926354.55,
                "ethValue": 362689923906.11,
                "stableValue": 239262244206.17,
                "otherValue": 744081400229.02,
                "timestamp": "1752242400"
            },
            {
                "marketCap": 3687931559043.83,
                "volume": 259527520929.03,
                "btcValue": 2344518070505.73,
                "ethValue": 360629805487.19,
                "stableValue": 239237189320.89,
                "otherValue": 743546493730.02,
                "timestamp": "1752246000"
            },
            {
                "marketCap": 3657672722373.64,
                "volume": 265247625774.09,
                "btcValue": 2325276437570.55,
                "ethValue": 355974102316.95,
                "stableValue": 239257253262.81,
                "otherValue": 737164929223.33,
                "timestamp": "1752249600"
            },
            {
                "marketCap": 3674215186987.08,
                "volume": 268801399073.88,
                "btcValue": 2335847493006.94,
                "ethValue": 358476953668.09,
                "stableValue": 239333167905.69,
                "otherValue": 740557572406.36,
                "timestamp": "1752253200"
            },
            {
                "marketCap": 3686895807207.36,
                "volume": 265016298726.93,
                "btcValue": 2340613682011.15,
                "ethValue": 361355041782.97,
                "stableValue": 239525901182.94,
                "otherValue": 745401182230.30,
                "timestamp": "1752256800"
            },
            {
                "marketCap": 3691289063194.55,
                "volume": 262137730300.18,
                "btcValue": 2341539041148.69,
                "ethValue": 361624308702.40,
                "stableValue": 239895453795.05,
                "otherValue": 748230259548.41,
                "timestamp": "1752260400"
            },
            {
                "marketCap": 3700205756835.57,
                "volume": 263287058002.03,
                "btcValue": 2348080134752.75,
                "ethValue": 362829409916.09,
                "stableValue": 239881244108.24,
                "otherValue": 749414968058.49,
                "timestamp": "1752264000"
            },
            {
                "marketCap": 3681892648131.05,
                "volume": 262639321737.58,
                "btcValue": 2341727630497.60,
                "ethValue": 359361889060.09,
                "stableValue": 239966834831.39,
                "otherValue": 740836293741.97,
                "timestamp": "1752267600"
            },
            {
                "marketCap": 3669410536204.79,
                "volume": 222932526553.90,
                "btcValue": 2340216460388.42,
                "ethValue": 358177957389.26,
                "stableValue": 239988909163.50,
                "otherValue": 731027209263.61,
                "timestamp": "1752271200"
            },
            {
                "marketCap": 3660372680069.81,
                "volume": 220033882508.23,
                "btcValue": 2339907332916.83,
                "ethValue": 356339811769.72,
                "stableValue": 239988245594.81,
                "otherValue": 724137289788.45,
                "timestamp": "1752274800"
            },
            {
                "marketCap": 3665570910840.58,
                "volume": 215901360946.25,
                "btcValue": 2337678695084.56,
                "ethValue": 357082149438.91,
                "stableValue": 239902776486.50,
                "otherValue": 730907289830.61,
                "timestamp": "1752278400"
            },
            {
                "marketCap": 3658112656401.72,
                "volume": 212765345277.78,
                "btcValue": 2335407237234.34,
                "ethValue": 356330948504.49,
                "stableValue": 239884314124.42,
                "otherValue": 726490156538.47,
                "timestamp": "1752282000"
            },
            {
                "marketCap": 3679411815101.59,
                "volume": 210411359098.82,
                "btcValue": 2340741199369.56,
                "ethValue": 357310722145.92,
                "stableValue": 239991040195.87,
                "otherValue": 741368853390.24,
                "timestamp": "1752285600"
            },
            {
                "marketCap": 3676988866623.74,
                "volume": 207701480607.93,
                "btcValue": 2340101617010.07,
                "ethValue": 357163041313.84,
                "stableValue": 240006530149.30,
                "otherValue": 739717678150.53,
                "timestamp": "1752289200"
            },
            {
                "marketCap": 3680051275309.05,
                "volume": 203901944877.79,
                "btcValue": 2342402797736.05,
                "ethValue": 357942654204.01,
                "stableValue": 240004532767.69,
                "otherValue": 739701290601.30,
                "timestamp": "1752292800"
            },
            {
                "marketCap": 3670807313269.35,
                "volume": 202141218471.17,
                "btcValue": 2340660554803.97,
                "ethValue": 356315379947.25,
                "stableValue": 240048676804.79,
                "otherValue": 733782701713.34,
                "timestamp": "1752296400"
            },
            {
                "marketCap": 3674199531788.46,
                "volume": 194011753784.74,
                "btcValue": 2341784659116.78,
                "ethValue": 356611272847.98,
                "stableValue": 240044046612.00,
                "otherValue": 735759553211.70,
                "timestamp": "1752300000"
            },
            {
                "marketCap": 3681619133038.33,
                "volume": 188471302013.29,
                "btcValue": 2345256644378.82,
                "ethValue": 357492718951.46,
                "stableValue": 240041211869.71,
                "otherValue": 738828557838.34,
                "timestamp": "1752303600"
            },
            {
                "marketCap": 3675992841134.70,
                "volume": 176946221789.02,
                "btcValue": 2342421585034.88,
                "ethValue": 357838590873.08,
                "stableValue": 240116070078.57,
                "otherValue": 735616595148.17,
                "timestamp": "1752307200"
            },
            {
                "marketCap": 3679859320901.58,
                "volume": 173177617052.22,
                "btcValue": 2346208275169.64,
                "ethValue": 358215283637.16,
                "stableValue": 240388027198.55,
                "otherValue": 735047734896.23,
                "timestamp": "1752310800"
            },
            {
                "marketCap": 3691046056234.01,
                "volume": 170333067366.41,
                "btcValue": 2350611091999.06,
                "ethValue": 359006954774.71,
                "stableValue": 240370014988.81,
                "otherValue": 741057994471.43,
                "timestamp": "1752314400"
            },
            {
                "marketCap": 3691852268750.08,
                "volume": 166501788063.33,
                "btcValue": 2349727634701.15,
                "ethValue": 359356252864.46,
                "stableValue": 240416442434.65,
                "otherValue": 742351938749.82,
                "timestamp": "1752318000"
            },
            {
                "marketCap": 3680069770102.23,
                "volume": 163030027834.74,
                "btcValue": 2344339296936.12,
                "ethValue": 357806585115.30,
                "stableValue": 240404728877.06,
                "otherValue": 737519159173.75,
                "timestamp": "1752321600"
            },
            {
                "marketCap": 3661616498511.38,
                "volume": 164110382580.60,
                "btcValue": 2337983771399.90,
                "ethValue": 355274756444.93,
                "stableValue": 240399433556.49,
                "otherValue": 727958537110.06,
                "timestamp": "1752325200"
            },
            {
                "marketCap": 3658805653837.89,
                "volume": 158530469136.58,
                "btcValue": 2337411565285.92,
                "ethValue": 354784457681.86,
                "stableValue": 240384748100.88,
                "otherValue": 726224882769.23,
                "timestamp": "1752328800"
            },
            {
                "marketCap": 3653756209379.75,
                "volume": 155227621498.16,
                "btcValue": 2335313911737.49,
                "ethValue": 353526014606.30,
                "stableValue": 240418567837.37,
                "otherValue": 724497715198.59,
                "timestamp": "1752332400"
            },
            {
                "marketCap": 3636214601019.35,
                "volume": 149702823755.19,
                "btcValue": 2330035700129.79,
                "ethValue": 351944680807.48,
                "stableValue": 240428092236.86,
                "otherValue": 713806127845.22,
                "timestamp": "1752336000"
            },
            {
                "marketCap": 3644048784754.98,
                "volume": 141106497965.53,
                "btcValue": 2331844089602.85,
                "ethValue": 353107351746.19,
                "stableValue": 240435994849.89,
                "otherValue": 718661348556.05,
                "timestamp": "1752339600"
            },
            {
                "marketCap": 3657571429927.06,
                "volume": 139046026427.65,
                "btcValue": 2337245123049.35,
                "ethValue": 355203477363.66,
                "stableValue": 240406830316.41,
                "otherValue": 724715999197.64,
                "timestamp": "1752343200"
            },
            {
                "marketCap": 3658884179750.60,
                "volume": 136798652407.42,
                "btcValue": 2337488182347.29,
                "ethValue": 355224918498.69,
                "stableValue": 240383649321.36,
                "otherValue": 725787429583.26,
                "timestamp": "1752346800"
            },
            {
                "marketCap": 3660155373127.16,
                "volume": 133835478197.15,
                "btcValue": 2338746666762.55,
                "ethValue": 354970936982.23,
                "stableValue": 240405115741.60,
                "otherValue": 726032653640.78,
                "timestamp": "1752350400"
            },
            {
                "marketCap": 3640742949671.65,
                "volume": 129171025791.34,
                "btcValue": 2329322647015.71,
                "ethValue": 352383756595.61,
                "stableValue": 240424588991.82,
                "otherValue": 718611957068.51,
                "timestamp": "1752354000"
            },
            {
                "marketCap": 3658287677501.46,
                "volume": 127859532478.92,
                "btcValue": 2337107845787.94,
                "ethValue": 354833887980.35,
                "stableValue": 240430136302.22,
                "otherValue": 725915807430.95,
                "timestamp": "1752357600"
            },
            {
                "marketCap": 3656951063884.75,
                "volume": 123487251651.36,
                "btcValue": 2335514576020.18,
                "ethValue": 354696654166.09,
                "stableValue": 240435737826.15,
                "otherValue": 726304095872.33,
                "timestamp": "1752361200"
            },
            {
                "marketCap": 3659383301005.78,
                "volume": 120693905188.58,
                "btcValue": 2336336334293.16,
                "ethValue": 355308333611.89,
                "stableValue": 240434151410.49,
                "otherValue": 727304481690.24,
                "timestamp": "1752364800"
            },
            {
                "marketCap": 3658914729673.90,
                "volume": 119554902451.33,
                "btcValue": 2334454711363.66,
                "ethValue": 355615303512.65,
                "stableValue": 240542866616.39,
                "otherValue": 728301848181.20,
                "timestamp": "1752368400"
            },
            {
                "marketCap": 3667494582113.72,
                "volume": 118790373898.58,
                "btcValue": 2338981133771.84,
                "ethValue": 356216858227.87,
                "stableValue": 240529164258.44,
                "otherValue": 731767425855.57,
                "timestamp": "1752372000"
            },
            {
                "marketCap": 3671292821564.40,
                "volume": 116679268634.96,
                "btcValue": 2340313592445.72,
                "ethValue": 356764269861.60,
                "stableValue": 240530484138.42,
                "otherValue": 733684475118.66,
                "timestamp": "1752375600"
            },
            {
                "marketCap": 3673271007920.16,
                "volume": 118099127571.94,
                "btcValue": 2342989873943.44,
                "ethValue": 356830444075.39,
                "stableValue": 240538029885.21,
                "otherValue": 732912660016.12,
                "timestamp": "1752379200"
            },
            {
                "marketCap": 3679606003820.91,
                "volume": 115779749276.13,
                "btcValue": 2345475946470.38,
                "ethValue": 357272327969.67,
                "stableValue": 240561731497.40,
                "otherValue": 736295997883.46,
                "timestamp": "1752382800"
            },
            {
                "marketCap": 3674270904485.78,
                "volume": 115034653934.92,
                "btcValue": 2342876877628.34,
                "ethValue": 356307775379.95,
                "stableValue": 240542399113.24,
                "otherValue": 734543852364.25,
                "timestamp": "1752386400"
            },
            {
                "marketCap": 3682472923620.35,
                "volume": 115275327820.12,
                "btcValue": 2345848383911.34,
                "ethValue": 357379177942.89,
                "stableValue": 240557734978.04,
                "otherValue": 738687626788.08,
                "timestamp": "1752390000"
            },
            {
                "marketCap": 3686267535422.54,
                "volume": 114611162616.28,
                "btcValue": 2347232309287.11,
                "ethValue": 357760030643.67,
                "stableValue": 240531092507.30,
                "otherValue": 740744102984.46,
                "timestamp": "1752393600"
            },
            {
                "marketCap": 3680737562601.93,
                "volume": 113972535002.84,
                "btcValue": 2346044053660.60,
                "ethValue": 356916820896.13,
                "stableValue": 240514155715.43,
                "otherValue": 737262532329.77,
                "timestamp": "1752397200"
            },
            {
                "marketCap": 3675438017742.96,
                "volume": 112908710568.28,
                "btcValue": 2342559361435.52,
                "ethValue": 355997420483.18,
                "stableValue": 240531209375.03,
                "otherValue": 736350026449.23,
                "timestamp": "1752400800"
            },
            {
                "marketCap": 3675768340702.92,
                "volume": 111030210159.58,
                "btcValue": 2343094690645.44,
                "ethValue": 355976875942.96,
                "stableValue": 240574060051.35,
                "otherValue": 736122714063.17,
                "timestamp": "1752404400"
            },
            {
                "marketCap": 3686358674100.17,
                "volume": 111142352550.46,
                "btcValue": 2348608710835.55,
                "ethValue": 357896133025.79,
                "stableValue": 240529464439.09,
                "otherValue": 739324365799.74,
                "timestamp": "1752408000"
            },
            {
                "marketCap": 3704181052842.13,
                "volume": 108200580614.43,
                "btcValue": 2356448565995.71,
                "ethValue": 360460922131.36,
                "stableValue": 240584263339.42,
                "otherValue": 746687301375.64,
                "timestamp": "1752411600"
            },
            {
                "marketCap": 3710733101918.70,
                "volume": 108638922195.54,
                "btcValue": 2360593140686.78,
                "ethValue": 361074543574.98,
                "stableValue": 240595446593.98,
                "otherValue": 748469971062.96,
                "timestamp": "1752415200"
            },
            {
                "marketCap": 3714158439487.22,
                "volume": 112952462048.61,
                "btcValue": 2362874070007.99,
                "ethValue": 360826988875.10,
                "stableValue": 240585379954.95,
                "otherValue": 749872000649.18,
                "timestamp": "1752418800"
            },
            {
                "marketCap": 3712813866739.17,
                "volume": 113043308406.75,
                "btcValue": 2361677164119.46,
                "ethValue": 361513831087.72,
                "stableValue": 240590441767.89,
                "otherValue": 749032429764.10,
                "timestamp": "1752422400"
            },
            {
                "marketCap": 3705921238775.44,
                "volume": 112545953008.36,
                "btcValue": 2358805981915.38,
                "ethValue": 359377098255.72,
                "stableValue": 240597112215.31,
                "otherValue": 747141046389.03,
                "timestamp": "1752426000"
            },
            {
                "marketCap": 3714639910545.27,
                "volume": 114397925373.60,
                "btcValue": 2361634411929.65,
                "ethValue": 361324665443.89,
                "stableValue": 240559895037.95,
                "otherValue": 751120938133.78,
                "timestamp": "1752429600"
            },
            {
                "marketCap": 3724347349979.14,
                "volume": 115662548888.02,
                "btcValue": 2367531090290.88,
                "ethValue": 361583444606.76,
                "stableValue": 240549818177.87,
                "otherValue": 754682996903.63,
                "timestamp": "1752433200"
            },
            {
                "marketCap": 3723252392806.90,
                "volume": 117492200351.68,
                "btcValue": 2367645834970.58,
                "ethValue": 361091218731.02,
                "stableValue": 240548445422.15,
                "otherValue": 753966893683.15,
                "timestamp": "1752436800"
            },
            {
                "marketCap": 3724382603396.63,
                "volume": 117460543710.92,
                "btcValue": 2369284093690.41,
                "ethValue": 361325158343.93,
                "stableValue": 240527971637.26,
                "otherValue": 753245379725.03,
                "timestamp": "1752440400"
            },
            {
                "marketCap": 3703158555461.46,
                "volume": 118311451538.67,
                "btcValue": 2360058817652.47,
                "ethValue": 358000589417.57,
                "stableValue": 240574014289.44,
                "otherValue": 744525134101.98,
                "timestamp": "1752444000"
            },
            {
                "marketCap": 3701811291187.21,
                "volume": 121422499577.28,
                "btcValue": 2359561103344.73,
                "ethValue": 357566211937.25,
                "stableValue": 240574755515.89,
                "otherValue": 744109220389.34,
                "timestamp": "1752447600"
            },
            {
                "marketCap": 3716211159114.99,
                "volume": 122706827701.24,
                "btcValue": 2369504729933.42,
                "ethValue": 358897741738.68,
                "stableValue": 240592248646.86,
                "otherValue": 747216438796.03,
                "timestamp": "1752451200"
            },
            {
                "marketCap": 3720237170750.97,
                "volume": 123953854759.02,
                "btcValue": 2369479552008.06,
                "ethValue": 359342340332.62,
                "stableValue": 240696195841.70,
                "otherValue": 750719082568.59,
                "timestamp": "1752454800"
            },
            {
                "marketCap": 3723391337961.36,
                "volume": 126437802232.18,
                "btcValue": 2369779509774.27,
                "ethValue": 359188672435.72,
                "stableValue": 240670774929.59,
                "otherValue": 753752380821.78,
                "timestamp": "1752458400"
            },
            {
                "marketCap": 3744250472276.13,
                "volume": 129811576116.08,
                "btcValue": 2381102094430.42,
                "ethValue": 362276608529.11,
                "stableValue": 240660354767.39,
                "otherValue": 760211414549.21,
                "timestamp": "1752462000"
            },
            {
                "marketCap": 3778475932147.50,
                "volume": 140837768201.57,
                "btcValue": 2402391453528.35,
                "ethValue": 366702895733.21,
                "stableValue": 240510032433.81,
                "otherValue": 768871550452.13,
                "timestamp": "1752465600"
            },
            {
                "marketCap": 3797203738635.34,
                "volume": 148209352299.93,
                "btcValue": 2415285228405.83,
                "ethValue": 368737560988.84,
                "stableValue": 240443870258.07,
                "otherValue": 772737078982.60,
                "timestamp": "1752469200"
            },
            {
                "marketCap": 3810926569856.24,
                "volume": 188120190579.62,
                "btcValue": 2436408830982.53,
                "ethValue": 366917469196.40,
                "stableValue": 240445283273.11,
                "otherValue": 767154986404.20,
                "timestamp": "1752472800"
            },
            {
                "marketCap": 3799414475353.66,
                "volume": 195216611276.79,
                "btcValue": 2428542523090.12,
                "ethValue": 365014287505.41,
                "stableValue": 240422910731.46,
                "otherValue": 765434754026.67,
                "timestamp": "1752476400"
            },
            {
                "marketCap": 3824001455737.83,
                "volume": 202935472118.47,
                "btcValue": 2441163957154.63,
                "ethValue": 367546570454.87,
                "stableValue": 240459290073.61,
                "otherValue": 774831638054.72,
                "timestamp": "1752480000"
            },
            {
                "marketCap": 3817311860273.31,
                "volume": 206723658181.38,
                "btcValue": 2438292860520.96,
                "ethValue": 367036034248.30,
                "stableValue": 240423394820.66,
                "otherValue": 771559570683.39,
                "timestamp": "1752483600"
            },
            {
                "marketCap": 3806904284186.39,
                "volume": 210386977853.48,
                "btcValue": 2426355079869.76,
                "ethValue": 367690320092.52,
                "stableValue": 240333519408.05,
                "otherValue": 772525364816.06,
                "timestamp": "1752487200"
            },
            {
                "marketCap": 3809205472097.00,
                "volume": 213657470464.50,
                "btcValue": 2425295263125.15,
                "ethValue": 370184872201.40,
                "stableValue": 240337619256.99,
                "otherValue": 773387717513.46,
                "timestamp": "1752490800"
            },
            {
                "marketCap": 3795511266631.31,
                "volume": 215613594912.73,
                "btcValue": 2416323601797.22,
                "ethValue": 368577288193.24,
                "stableValue": 240277073877.40,
                "otherValue": 770333302763.45,
                "timestamp": "1752494400"
            },
            {
                "marketCap": 3800716850578.67,
                "volume": 218487683183.24,
                "btcValue": 2424863526792.29,
                "ethValue": 367998306135.14,
                "stableValue": 240254168766.71,
                "otherValue": 767600848884.53,
                "timestamp": "1752498000"
            },
            {
                "marketCap": 3802683747364.46,
                "volume": 250599911666.99,
                "btcValue": 2421154407735.39,
                "ethValue": 368980544791.62,
                "stableValue": 240261316490.73,
                "otherValue": 772287478346.72,
                "timestamp": "1752501600"
            },
            {
                "marketCap": 3783406196123.87,
                "volume": 283668097967.76,
                "btcValue": 2410656532904.07,
                "ethValue": 365943523502.80,
                "stableValue": 240275268466.36,
                "otherValue": 766530871250.64,
                "timestamp": "1752505200"
            },
            {
                "marketCap": 3743089548514.58,
                "volume": 285406885014.72,
                "btcValue": 2383478937934.12,
                "ethValue": 363419430541.44,
                "stableValue": 240372720289.05,
                "otherValue": 755818459749.97,
                "timestamp": "1752508800"
            },
            {
                "marketCap": 3762130726015.28,
                "volume": 291196495078.03,
                "btcValue": 2392277998377.43,
                "ethValue": 365444847705.48,
                "stableValue": 240297688384.85,
                "otherValue": 764110191547.52,
                "timestamp": "1752512361"
            }
        ],
        "historicalValues": {
            "now": {
                "marketCap": 3762130726015.282336744410852412
            },
            "yesterday": {
                "marketCap": 3659383301005.780000000000000000
            },
            "lastWeek": {
                "marketCap": 3368903740745.580000000000000000
            },
            "lastMonth": {
                "marketCap": 3303513358182.010000000000000000
            }
        },
        "yearlyPerformance": {
            "high": {
                "marketCap": 3721464308632.090000000000000000,
                "timestamp": "1734393600"
            },
            "low": {
                "marketCap": 1900955521605.020000000000000000,
                "timestamp": "1725667200"
            }
        },
        "thirtyDaysPercentage": 13.88
    },
    "status": {
        "timestamp": "2025-07-14T17:01:05.587Z",
        "error_code": "0",
        "error_message": "SUCCESS",
        "elapsed": "4",
        "credit_count": 0
    }
}
```

## Crypto ETFs Net Flow

Request URL with curl:
```bash
curl 'https://api.coinmarketcap.com/data-api/v3/etf/overview/netflow/chart?category=all&range=30d' \
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
  -H 'x-request-id: 8053725581fd4d8590fa3874162f7029'
```

The response is a JSON object with the following structure:
```json
{
    "data": {
        "points": [
            {
                "value": 455300000,
                "btcValue": 433900000,
                "ethValue": 21400000,
                "timestamp": "1750032000000"
            },
            {
                "value": 225248000,
                "btcValue": 214148000,
                "ethValue": 11100000,
                "timestamp": "1750118400000"
            },
            {
                "value": 409480000,
                "btcValue": 390380000,
                "ethValue": 19100000,
                "timestamp": "1750204800000"
            },
            {
                "value": 0,
                "btcValue": 0,
                "ethValue": 0,
                "timestamp": "1750291200000"
            },
            {
                "value": -4900000,
                "btcValue": 6400000,
                "ethValue": -11300000,
                "timestamp": "1750377600000"
            },
            {
                "value": 428599000,
                "btcValue": 327899000,
                "ethValue": 100700000,
                "timestamp": "1750636800000"
            },
            {
                "value": 659900000,
                "btcValue": 588600000,
                "ethValue": 71300000,
                "timestamp": "1750723200000"
            },
            {
                "value": 608100000,
                "btcValue": 547700000,
                "ethValue": 60400000,
                "timestamp": "1750809600000"
            },
            {
                "value": 200300000,
                "btcValue": 226700000,
                "ethValue": -26400000,
                "timestamp": "1750896000000"
            },
            {
                "value": 578700000,
                "btcValue": 501200000,
                "ethValue": 77500000,
                "timestamp": "1750982400000"
            },
            {
                "value": 133900000,
                "btcValue": 102100000,
                "ethValue": 31800000,
                "timestamp": "1751241600000"
            },
            {
                "value": -301500000,
                "btcValue": -342200000,
                "ethValue": 40700000,
                "timestamp": "1751328000000"
            },
            {
                "value": 405900000,
                "btcValue": 407800000,
                "ethValue": -1900000,
                "timestamp": "1751414400000"
            },
            {
                "value": 750300000,
                "btcValue": 601800000,
                "ethValue": 148500000,
                "timestamp": "1751500800000"
            },
            {
                "value": 0,
                "btcValue": 0,
                "ethValue": 0,
                "timestamp": "1751587200000"
            },
            {
                "value": 278600000,
                "btcValue": 216500000,
                "ethValue": 62100000,
                "timestamp": "1751846400000"
            },
            {
                "value": 122000000,
                "btcValue": 75300000,
                "ethValue": 46700000,
                "timestamp": "1751932800000"
            },
            {
                "value": 410833000,
                "btcValue": 199533000,
                "ethValue": 211300000,
                "timestamp": "1752019200000"
            },
            {
                "value": 1558700000,
                "btcValue": 1175600000,
                "ethValue": 383100000,
                "timestamp": "1752105600000"
            },
            {
                "value": 1234500000,
                "btcValue": 1029600000,
                "ethValue": 204900000,
                "timestamp": "1752192000000"
            }
        ],
        "aggregation": "daily",
        "total": 1234500000,
        "totalBtcValue": 1029600000,
        "totalEthValue": 204900000
    },
    "status": {
        "timestamp": "2025-07-14T17:00:34.161Z",
        "error_code": "0",
        "error_message": "SUCCESS",
        "elapsed": "2",
        "credit_count": 0
    }
}
```