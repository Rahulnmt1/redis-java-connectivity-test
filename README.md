# Redis Java Connectivity Self-Test

Minimal Maven/Java project to verify connectivity to Redis Enterprise or Redis Cloud using Jedis.

## Contents

- [`src/`](src/)

## Configuration & secrets

Confidential files (`.env`, credentials, keys) are kept out of this repository in the owner's private vault. Link them into a fresh clone with:

```bash
export DEMO_SECRETS_DIR=~/Documents/RWork/secrets   # default location
./link-secrets.sh
```
