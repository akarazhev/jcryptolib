# jcryptolib

[![Build Status](https://img.shields.io/badge/build-passing-brightgreen.svg)](https://github.com/akarazhev/jcryptolib)
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)

Java cryptocurrency utility library with reactive programming, HTTP support, and modular design that allows easy
integration into Java-based trading, analytics, or data ingestion systems.

---

## Features

- **Reactive Streams** via RxJava 3
- **JSON Serialization/Deserialization** with Jackson
- **Logging** with SLF4J and Logback
- **Bybit Exchange Streaming** support
- Java Platform Module System (JPMS) enabled (`module-info.java`)
- Production-ready resilience (circuit breaker, rate limiting, health checks)
- MIT License

---

## Getting Started

### Requirements

- Java 23+ (or update `pom.xml` for Java 21 LTS)
- Maven 3.8+

### Installation

Add the dependency to your Maven project:

```xml

<dependency>
    <groupId>com.github.akarazhev.jcryptolib</groupId>
    <artifactId>jcryptolib</artifactId>
    <version>0.0.1</version>
</dependency>
```

---

## Usage

### Example: Subscribing to Data Consumer

```java
final var consoleHandler = new DataHandler<Map<String, Object>>() {
  @Override
  public void handle(final Payload<Map<String, Object>> payload) {
    LOGGER.info("{}", payload);
  }

  @Override
  public void close() {
    LOGGER.info("Closing producer...");
  }

  @Override
  public void error(Throwable t) {
    LOGGER.error("Error in producer", t);
  }
};

try (final var client = Clients.newHttpClient()) {
  final var subscriber = BybitSubscriber.create(consoleHandler);
  final var config = new DataConfig.Builder()
        .streamType(StreamType.PTST)
        .topic(Topic.ORDER_BOOK_1_BTC_USDT)
        .topic(Topic.PUBLIC_TRADE_BTC_USDT)
        .topic(Topic.TICKERS_BTC_USDT)
        .topic(Topic.KLINE_1_BTC_USDT)
        .build();
  final var publicTestnetSpot = DataStreams.ofBybit(client, config)
        .filter(BybitFilter.ofFilter())
        .subscribe(subscriber.onNext(), subscriber.onError(), subscriber.onComplete());
  
   Runtime.getRuntime().addShutdownHook(new Thread(() -> {
     LOGGER.info("Shutting down jcryptolib test...");
     publicTestnetSpot.dispose();
     consoleHandler.close();
   }));
} catch (final Exception e) {
  throw new RuntimeException(e);
}
```

### Configuration

You can provide application settings in `src/main/resources/application.properties`.

#### Bybit Resilience Settings

The following properties are available for tuning connection resilience:
```properties
bybit.circuit.breaker.threshold=5         # Number of consecutive failures before opening the circuit
bybit.circuit.breaker.timeout.ms=30000    # Time (ms) to keep the circuit open before retrying
bybit.reconnect.rate.limit.ms=1000        # Minimum interval (ms) between reconnect attempts
```
These settings enable production-grade circuit breaking, rate limiting, and robust reconnection for Bybit data streams.

---

## Development

### Build

```sh
mvn clean install
```

### Run Tests

```sh
mvn test
```

---

## Project Structure

```
doc/
  integration/
    bybit/
      airdrop-hunt.md
      by-starter.md
      by-votes.md
      launch-pad.md
      launch-pool.md
      mega-drop.md
    cmc/
      altcoin-season-index.md
      bitcoin-dominance.md
      cmc-100-index.md
      derivatives-market.md
      fear-and-greed-index.md
      global-metrics.md
      market-cycle-indicator.md
      market-overview.md
      spot-market.md
src/
  main/
    java/
      module-info.java
      com/github/akarazhev/jcryptolib/
        bybit/
          config/
          stream/
        cmc/
          config/
          stream/
        config/
        resilience/
        stream/
        util/
        package-info.java
    resources/
      application.properties
      logback.xml
  test/
    java/
      com/github/akarazhev/jcryptolib/
        bybit/
          stream/
        cmc/
          stream/
        util/  
    resources/
      application.properties
```

---

## Versions

- [0.0.1](https://github.com/jcryptolib/jcryptolib/releases/tag/v0.0.1) - Initial release that provides a basic set of
  utilities for working with cryptocurrencies:
    - CMC Market Data:
        - Altcoin Season Index, Bitcoin Dominance, CoinMarketCap 100 Index, Derivatives Market, Fear and Greed Index,
          Global Metrics, Market Cycle Indicator, Market Overview, Spot Market.
    - Bybit Activities:
        - Airdrop Hunt, ByStarter, ByVotes, Launchpad, Launchpool, Megadrop.
    - Bybit Trading Data:
        - Orderbook, Trade, Ticker, Kline, All Liquidation, Insurance Pool, Order Price Limit, Spread Trading.

---

## License

This project is licensed under the [MIT License](https://opensource.org/licenses/MIT).

---

## Author

**Andrey Karazhev**  
[GitHub](https://github.com/akarazhev)

---

## Contributing

Pull requests and issues are welcome!
