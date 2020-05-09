#!/usr/bin/env bash

docker stop quarkus-postgres
docker rm quarkus-postgres
docker run --name quarkus-postgres -e POSTGRES_PASSWORD=postgres -p 5432:5432 -d postgres
