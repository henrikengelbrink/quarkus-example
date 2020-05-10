#!/usr/bin/env bash

#mvn package -Pnative -Dquarkus.native.container-build=true
#docker build -f src/main/docker/Dockerfile.native -t quarkus/app .
docker run -i --rm -p 8080:8080 \
 -e POSTGRES_USER=postgres \
 -e POSTGRES_PASSWORD=postgres \
 -e POSTGRES_URL=jdbc:postgresql://docker.for.mac.host.internal:5432/postgres \
 quarkus/app
