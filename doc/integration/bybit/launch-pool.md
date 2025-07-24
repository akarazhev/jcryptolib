# Launchpool

Earn new tokens by staking crypto on Bybit.

## Project Information

Request API with headers:

```text
GET /x-api/spot/api/launchpool/v1/home HTTP/3

Accept: text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8
Accept-Language: en-US,en;q=0.5
Alt-Used: www.bybit.com
Priority: u=0, i
Referer: https://www.bybit.com/en/trade/spot/launchpool
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
    "totalPrizePool": "60558456",
    "totalUsers": 5364504,
    "totalProjects": 53,
    "list": []
  },
  "success": true
}
```

## Current Events

Request API with headers:

```text
POST /x-api/spot/api/launchpool/v1/history HTTP/3

User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10.15; rv:140.0) Gecko/20100101 Firefox/140.0
Accept: application/json, text/plain, */*
Accept-Language: en
Content-Type: application/json
Lang: en
Sec-Fetch-Dest: empty
Sec-Fetch-Mode: cors
Sec-Fetch-Site: same-origin
Alt-Used: www.bybit.com
Referer: https://www.bybit.com/en/trade/spot/launchpool
Origin: https://www.bybit.com
Priority: u=1, i

[Request body here, e.g. {"pageSize":3,"current":1}]
```

The response is a JSON object with the following structure:

```json
{
  "ret_code": 0,
  "ret_msg": null,
  "token": null,
  "result": {
    "current": 1,
    "pageSize": 3,
    "total": 53,
    "list": [
      {
        "code": "20250603061458",
        "returnCoin": "CUDIS",
        "returnCoinIcon": "https://s1.bycsi.com/app/assets/token/6e7dcf95513188bc1cda333dad184eb1.png",
        "desc": "CUDIS is the World’s first rewarding Longevity protocol for everyone, powered by real human data to enhance your energy, cognition, and overall well-being. As one of the most popular and iconic projects on Solana with the most active community, CUDIS leads the Crypto Wearable and Longevity sector with more than 20,000 devices delivered and $6+ million revenue generated, and has onboarded more than 200,000 application users from 103+ countries over the past 12 months. Through the integration of the CUDIS Ring, an AI-powered Longevity Hub, and a blockchain-driven Super App, users gain full ownership of their health data, real-time longevity insights, and economic incentives for optimizing their biological health. CUDIS is building a new longevity ecosystem with realistic and effective products, programs and services with partners around the world.\n",
        "website": "https://www.cudis.xyz",
        "whitepaper": "https://whitepaper.cudis.xyz",
        "rules": "https://announcements.bybit.com/en/article/bybit-launchpool-stake-cudis-bbsol-or-usdt-to-earn-a-share-of-4-000-000-cudis--blt5981b15c8998058e/",
        "totalPoolAmount": "4000000.00000000",
        "aprHigh": "536.2147626",
        "stakeBeginTime": 1749124800000,
        "stakeEndTime": 1749643200000,
        "tradeBeginTime": 1749124800000,
        "feTimeStatus": 1,
        "referralCoin": null,
        "referralCoinAmount": null,
        "signUpStatus": 0,
        "createdAt": null,
        "stakeSort": null,
        "onlineTime": null,
        "openWarmingUpPledge": 1,
        "stakePoolList": [
          {
            "stakePoolCode": "202506030614581",
            "stakeCoin": "CUDIS",
            "stakeCoinIcon": "https://s1.bycsi.com/app/assets/token/5f303729653b65f35ee6699f6ca8897e.png",
            "poolAmount": "800000.00000000",
            "minStakeAmount": "1000.00000000",
            "maxStakeAmount": "50000.00000000",
            "apr": "536.21476260",
            "aprVip": "536.21476260",
            "totalUser": 1459,
            "totalAmount": "7779398.9691",
            "samePeriod": 0,
            "stakeBeginTime": 1749124800000,
            "stakeEndTime": 1749643200000,
            "vipAdd": 0,
            "minVipAmount": null,
            "maxVipAmount": "75000.00000000",
            "vipPercent": "50",
            "poolTag": 1,
            "useNewUserFunction": 1,
            "useNewVipFunction": 1,
            "openWarmingUpPledge": 0,
            "newVipPercent": "80",
            "minNewVipAmount": "1000",
            "maxNewVipAmount": "90000",
            "newVipValidateDays": 30,
            "minNewUserAmount": "1000",
            "maxNewUserAmount": "60000",
            "newUserValidateDays": 7,
            "newUserPercent": "20",
            "myTotalYield": "0",
            "poolLoanConfig": 0,
            "leverage": null,
            "maxStakeLimit": "0",
            "dailyIncomeAmt": "0",
            "newUserTag": 0,
            "newVipUserTag": 0
          },
          {
            "stakePoolCode": "202506030614582",
            "stakeCoin": "BBSOL",
            "stakeCoinIcon": "https://s1.bycsi.com/app/assets/token/9a8b4ef85375be14a412e480bbfe7c54.png",
            "poolAmount": "1200000.00000000",
            "minStakeAmount": "0.60000000",
            "maxStakeAmount": "60.00000000",
            "apr": "26.46452303",
            "aprVip": "26.46452303",
            "totalUser": 5128,
            "totalAmount": "148932.4939",
            "samePeriod": 0,
            "stakeBeginTime": 1749124800000,
            "stakeEndTime": 1749643200000,
            "vipAdd": 0,
            "minVipAmount": null,
            "maxVipAmount": "120.00000000",
            "vipPercent": "100",
            "poolTag": 1,
            "useNewUserFunction": 1,
            "useNewVipFunction": 1,
            "openWarmingUpPledge": 1,
            "newVipPercent": "140",
            "minNewVipAmount": "0.6",
            "maxNewVipAmount": "144",
            "newVipValidateDays": 30,
            "minNewUserAmount": "0.6",
            "maxNewUserAmount": "72",
            "newUserValidateDays": 7,
            "newUserPercent": "20",
            "myTotalYield": "0",
            "poolLoanConfig": 2,
            "leverage": null,
            "maxStakeLimit": "0",
            "dailyIncomeAmt": "0",
            "newUserTag": 0,
            "newVipUserTag": 0
          },
          {
            "stakePoolCode": "202506030614583",
            "stakeCoin": "USDT",
            "stakeCoinIcon": "https://s1.bycsi.com/app/assets/token/170314b1e124e4f11ac58e456264a1b7.svg",
            "poolAmount": "2000000.00000000",
            "minStakeAmount": "100.00000000",
            "maxStakeAmount": "2000.00000000",
            "apr": "17.00937205",
            "aprVip": "17.00937205",
            "totalUser": 51492,
            "totalAmount": "66730606.5487",
            "samePeriod": 0,
            "stakeBeginTime": 1749124800000,
            "stakeEndTime": 1749643200000,
            "vipAdd": 0,
            "minVipAmount": null,
            "maxVipAmount": "3000.00000000",
            "vipPercent": "50",
            "poolTag": 1,
            "useNewUserFunction": 1,
            "useNewVipFunction": 1,
            "openWarmingUpPledge": 1,
            "newVipPercent": "80",
            "minNewVipAmount": "100",
            "maxNewVipAmount": "3600",
            "newVipValidateDays": 30,
            "minNewUserAmount": "100",
            "maxNewUserAmount": "2400",
            "newUserValidateDays": 7,
            "newUserPercent": "20",
            "myTotalYield": "0",
            "poolLoanConfig": 2,
            "leverage": null,
            "maxStakeLimit": "0",
            "dailyIncomeAmt": "0",
            "newUserTag": 0,
            "newVipUserTag": 0
          }
        ]
      },
      ...
      {
        "code": "20250422041349",
        "returnCoin": "DOLO",
        "returnCoinIcon": "https://s1.bycsi.com/app/assets/token/541a9169e99950f9587f4e5e158a8b7f.png",
        "desc": "Dolomite is a decentralized money market and trading protocol that offers capital-efficient lending, borrowing, and trading solutions. Unlike traditional DeFi lending platforms, Dolomite empowers users to retain the utility of their assets while using them as collateral, thanks to its Dynamic Collateral system. Meaning, users can stake, vote, and earn rewards while still leveraging their assets for borrowing.\n\nDolomite's ecosystem is powered by DOLO, an ERC-20 token deployed on Berachain, Ethereum, Arbitrum, and other networks. DOLO has the same token address across all networks and is made cross-chain native using Chainlink’s CCIP technology. DOLO serves as the foundation for governance, incentives, and liquidity provisioning. The token model is designed to align incentives, increase the DAO’s treasury, and drive long-term growth. The ecosystem includes three tokens:\n\nDOLO: The primary token that users may trade on exchanges.\nveDOLO: A time-locked governance token that unlocks voting power, protocol revenue sharing, and deeper participation benefits. Users may elect to break the lock prematurely, for a penalty.\noDOLO: An incentive token distributed to liquidity providers, which can be converted into veDOLO at a discount.",
        "website": "https://dolomite.io/",
        "whitepaper": "https://dolomite.io/Dolomite-v2-Protocol-Whitepaper-v2.0.pdf",
        "rules": "https://announcements.bybit.com/article/bybit-launchpool-stake-dolo-mnt-or-usdt-to-earn-a-share-of-4-000-000-dolo-blt8a74d32b127f1571/",
        "totalPoolAmount": "4000000.00000000",
        "aprHigh": "370.98339273",
        "stakeBeginTime": 1745499600000,
        "stakeEndTime": 1746104400000,
        "tradeBeginTime": 1745499600000,
        "feTimeStatus": 1,
        "referralCoin": null,
        "referralCoinAmount": null,
        "signUpStatus": 0,
        "createdAt": null,
        "stakeSort": null,
        "onlineTime": null,
        "openWarmingUpPledge": 1,
        "stakePoolList": [
          {
            "stakePoolCode": "202504220413491",
            "stakeCoin": "DOLO",
            "stakeCoinIcon": "https://s1.bycsi.com/app/assets/token/541a9169e99950f9587f4e5e158a8b7f.png",
            "poolAmount": "800000.00000000",
            "minStakeAmount": "1000.00000000",
            "maxStakeAmount": "50000.00000000",
            "apr": "370.98339273",
            "aprVip": "370.98339273",
            "totalUser": 1093,
            "totalAmount": "9838715.3482",
            "samePeriod": 0,
            "stakeBeginTime": 1745499600000,
            "stakeEndTime": 1746104400000,
            "vipAdd": 0,
            "minVipAmount": null,
            "maxVipAmount": "75000.00000000",
            "vipPercent": "50",
            "poolTag": 1,
            "useNewUserFunction": 1,
            "useNewVipFunction": 1,
            "openWarmingUpPledge": 0,
            "newVipPercent": "80",
            "minNewVipAmount": "1000",
            "maxNewVipAmount": "90000",
            "newVipValidateDays": 30,
            "minNewUserAmount": "1000",
            "maxNewUserAmount": "60000",
            "newUserValidateDays": 7,
            "newUserPercent": "20",
            "myTotalYield": "0",
            "poolLoanConfig": 0,
            "leverage": null,
            "maxStakeLimit": "0",
            "dailyIncomeAmt": "0",
            "newUserTag": 0,
            "newVipUserTag": 0
          },
          {
            "stakePoolCode": "202504220413492",
            "stakeCoin": "MNT",
            "stakeCoinIcon": "https://s1.bycsi.com/app/assets/token/af537f7b5c0066f8f53e38a30707689b.svg",
            "poolAmount": "1200000.00000000",
            "minStakeAmount": "100.00000000",
            "maxStakeAmount": "10000.00000000",
            "apr": "11.37136155",
            "aprVip": "11.37136155",
            "totalUser": 15069,
            "totalAmount": "37363536.8349",
            "samePeriod": 0,
            "stakeBeginTime": 1745499600000,
            "stakeEndTime": 1746104400000,
            "vipAdd": 0,
            "minVipAmount": null,
            "maxVipAmount": "20000.00000000",
            "vipPercent": "100",
            "poolTag": 1,
            "useNewUserFunction": 1,
            "useNewVipFunction": 1,
            "openWarmingUpPledge": 1,
            "newVipPercent": "140",
            "minNewVipAmount": "100",
            "maxNewVipAmount": "24000",
            "newVipValidateDays": 30,
            "minNewUserAmount": "100",
            "maxNewUserAmount": "12000",
            "newUserValidateDays": 7,
            "newUserPercent": "20",
            "myTotalYield": "0",
            "poolLoanConfig": 1,
            "leverage": null,
            "maxStakeLimit": "0",
            "dailyIncomeAmt": "0",
            "newUserTag": 0,
            "newVipUserTag": 0
          },
          {
            "stakePoolCode": "202504220413493",
            "stakeCoin": "USDT",
            "stakeCoinIcon": "https://s1.bycsi.com/app/assets/token/170314b1e124e4f11ac58e456264a1b7.svg",
            "poolAmount": "2000000.00000000",
            "minStakeAmount": "100.00000000",
            "maxStakeAmount": "2000.00000000",
            "apr": "8.43218418",
            "aprVip": "8.43218418",
            "totalUser": 46304,
            "totalAmount": "61791522.6416",
            "samePeriod": 0,
            "stakeBeginTime": 1745499600000,
            "stakeEndTime": 1746104400000,
            "vipAdd": 0,
            "minVipAmount": null,
            "maxVipAmount": "3000.00000000",
            "vipPercent": "50",
            "poolTag": 1,
            "useNewUserFunction": 1,
            "useNewVipFunction": 1,
            "openWarmingUpPledge": 1,
            "newVipPercent": "80",
            "minNewVipAmount": "100",
            "maxNewVipAmount": "3600",
            "newVipValidateDays": 30,
            "minNewUserAmount": "100",
            "maxNewUserAmount": "2400",
            "newUserValidateDays": 7,
            "newUserPercent": "20",
            "myTotalYield": "0",
            "poolLoanConfig": 1,
            "leverage": null,
            "maxStakeLimit": "0",
            "dailyIncomeAmt": "0",
            "newUserTag": 0,
            "newVipUserTag": 0
          }
        ]
      }
    ]
  },
  "success": true
}
```