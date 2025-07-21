# ByStarter

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
      "currentTime": 1753106130077,
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