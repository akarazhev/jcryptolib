# ByStarter

Your Head Start to Next-Level Web3 Innovations.

## Project Information

Request API with headers:

```text
GET /x-api/spot/api/by-starter/v1/bystarter/overview HTTP/3

Accept: text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8
Accept-Language: en-US,en;q=0.5
Alt-Used: www.bybit.com
Priority: u=0, i
Referer: https://www.bybit.com/en/bystarter
Origin: https://www.bybit.com
Sec-Fetch-Dest: document
Sec-Fetch-Mode: navigate
Sec-Fetch-Site: none
Sec-Fetch-User: ?1
TE: trailers
Upgrade-Insecure-Requests: 1
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10.15; rv:140.0) "Gecko/20100101 Firefox/140.0
```

The response is a JSON object with the following structure:

```json
{
  "ret_code": 0,
  "ret_msg": null,
  "token": null,
  "result": {
    "totalParticipants": 482524,
    "totalInvestment": "73719039",
    "avgGrowth": "337",
    "projectCount": 5
  },
  "success": true
}
```

## Current Events

Request API with headers:

```text
GET /x-api/spot/api/by-starter/v3/project/current HTTP/3

Accept: text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8
Accept-Language: en-US,en;q=0.5
Alt-Used: www.bybit.com
Priority: u=0, i
Referer: https://www.bybit.com/en/bystarter
Origin: https://www.bybit.com
Sec-Fetch-Dest: document
Sec-Fetch-Mode: navigate
Sec-Fetch-Site: none
Sec-Fetch-User: ?1
TE: trailers
Upgrade-Insecure-Requests: 1
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10.15; rv:140.0) "Gecko/20100101 Firefox/140.0
```

The response is a JSON object with the following structure:

```json
{
  "ret_code": 0,
  "ret_msg": null,
  "token": null,
  "result": [
    {
      "projectId": 11,
      "coinIcon": "https://s1.bycsi.com/app/assets/token/59cf762dd85dd240d031650dc8bb13bf.png",
      "coinName": "ZK",
      "projectIntro": "ZKsync leverages ZK Rollup architecture to enhance Ethereum’s scalability and privacy. It facilitates low-cost transactions for ETH and ERC20 tokens by performing computations off-chain while maintaining robust security guarantees on the mainchain. This approach ensures high efficiency and integrity, making ZKsync a pivotal solution for the Ethereum ecosystem.",
      "lockTerms": "No lock-up period",
      "totalSupply": "14700000",
      "participants": "79240",
      "totalInvestment": "7924000",
      "price": "0",
      "minPrice": null,
      "maxPrice": null,
      "amount": "100",
      "minAmount": null,
      "maxAmount": null,
      "currentTime": 1753193677217,
      "projectType": 2,
      "periodList": [
        {
          "periodId": 16,
          "saleStartTime": 1718607600000,
          "saleEndTime": 1721296799000,
          "publishTime": 1721988000000,
          "eligibleParticipants": 1
        }
      ],
      "referralAwardInfo": null,
      "fundingToken": "USDT"
    }
  ],
  "success": true
}
```

## Past Events

Request API with headers:

```text
GET /x-api/spot/api/by-starter/v2/project/previously?limit=100 HTTP/3

Accept: text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8
Accept-Language: en-US,en;q=0.5
Alt-Used: www.bybit.com
Priority: u=0, i
Referer: https://www.bybit.com/en/bystarter
Origin: https://www.bybit.com
Sec-Fetch-Dest: document
Sec-Fetch-Mode: navigate
Sec-Fetch-Site: none
Sec-Fetch-User: ?1
TE: trailers
Upgrade-Insecure-Requests: 1
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10.15; rv:140.0) "Gecko/20100101 Firefox/140.0
```

The response is a JSON object with the following structure:

```json
{
  "ret_code": 0,
  "ret_msg": null,
  "token": null,
  "result": [
    {
      "projectId": 11,
      "coinIcon": "https://s1.bycsi.com/app/assets/token/59cf762dd85dd240d031650dc8bb13bf.png",
      "coinName": "ZK",
      "totalSupply": "14700000",
      "participants": "79240",
      "totalInvestment": "7924000",
      "publishTime": 1721988000000,
      "projectType": 2,
      "avgGrowth": "67.9",
      "totalWinners": 27000,
      "price": "0",
      "minPrice": null,
      "maxPrice": null,
      "eligibleParticipants": "1"
    },
    {
      "projectId": 8,
      "coinIcon": "https://s1.bycsi.com/app/assets/token/5b081d0e833e5e3b4713478615deb473.png",
      "coinName": "TAIKO",
      "totalSupply": "2000000",
      "participants": "68874",
      "totalInvestment": "35471545",
      "publishTime": 1717585200000,
      "projectType": 1,
      "avgGrowth": "74.09",
      "totalWinners": 12315,
      "price": "2",
      "minPrice": null,
      "maxPrice": null,
      "eligibleParticipants": "1"
    },
    {
      "projectId": 7,
      "coinIcon": "https://s1.bycsi.com/app/assets/token/7fb79ae49543daa920a28bb11e45619c.png",
      "coinName": "HLG",
      "totalSupply": "500000000",
      "participants": "82833",
      "totalInvestment": "8283300",
      "publishTime": 1716458400000,
      "projectType": 1,
      "avgGrowth": "193.22",
      "totalWinners": 82833,
      "price": "0",
      "minPrice": null,
      "maxPrice": null,
      "eligibleParticipants": "2"
    },
    {
      "projectId": 5,
      "coinIcon": "https://static.bymj.io/spot/img/9b6628b609f611eebdc72a133fcf998d.svg",
      "coinName": "MNT",
      "totalSupply": "5000000",
      "participants": "195021",
      "totalInvestment": "19502100",
      "publishTime": 1689573600000,
      "projectType": 1,
      "avgGrowth": "119",
      "totalWinners": 14972,
      "price": "0",
      "minPrice": null,
      "maxPrice": null,
      "eligibleParticipants": "1,2"
    },
    {
      "projectId": 3,
      "coinIcon": "https://s1.bycsi.com/app/assets/token/d25ff9e4b3587985e22baf7e4d6b5555.svg",
      "coinName": "SUI",
      "totalSupply": "94000000",
      "participants": "56556",
      "totalInvestment": "2538094",
      "publishTime": 1683093600000,
      "projectType": 1,
      "avgGrowth": "1230",
      "totalWinners": 56526,
      "price": "0.03",
      "minPrice": null,
      "maxPrice": null,
      "eligibleParticipants": "2"
    }
  ],
  "success": true
}
```