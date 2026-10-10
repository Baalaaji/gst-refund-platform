# Week 1 – 9 Oct 2026

## What I built
- refund-api (Spring Boot 3.5, Java 21) with POST and GET /api/refunds
- PostgreSQL 16 running in Docker; refund saved with status PENDING
- Validation: bad GSTIN returns 400

## What broke and how I fixed it
1. Docker engine not running -> installed WSL 2 (Docker needs a Linux engine on Windows)
2. "Unable to determine Dialect" -> real cause was hidden in an earlier WARN:
   Java sent timezone "Asia/Calcutta", Postgres only knows "Asia/Kolkata".
   Fixed with TimeZone.setDefault in main(). Lesson: always find the FIRST error.
3. 415 Unsupported Media Type -> Postman sent Text; set Content-Type to JSON

## What I can now explain
Controller -> validation -> entity -> repository -> Hikari pool -> PostgreSQL in Docker