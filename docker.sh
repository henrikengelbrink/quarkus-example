mvn package -Pnative -Dquarkus.native.container-build=true
docker build -f src/main/docker/Dockerfile.native -t quarkus/app .
docker stop qurakus-example
docker rm qurakus-example
docker run -i -n qurakus-example --rm -p 9080:8080 quarkus/app
