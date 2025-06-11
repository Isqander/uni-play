# Uniswap V3 Liquidity Adapter (Test)

This project provides a simple Spring Boot REST API for interacting with Uniswap V3 on an Ethereum testnet. It demonstrates how to open and close liquidity positions in an existing pool using Web3j wrappers.

## Building

```bash
./gradlew build
```

## Running

```bash
./gradlew bootRun
```

The API will be available at `http://localhost:8080`.

## Endpoints

- `POST /api/positions/open` – open a liquidity position.
- `POST /api/positions/close` – close an open position.

Configuration such as RPC URL and private key can be found in `application.properties`.
