# Uniswap V3 Liquidity Adapter (Test)

This project provides a simple Spring Boot REST API for interacting with Uniswap V3 on an Ethereum testnet. It demonstrates how to create and close liquidity pools using Web3j wrappers.

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

- `POST /api/pools` – create a new pool.
- `POST /api/pools/{poolAddress}/close` – close an existing pool.

Configuration such as RPC URL and private key can be found in `application.properties`.
