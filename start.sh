#!/bin/bash

echo "Stopping Running Container: $(docker stop pagila-customer-svc)"
echo "Deleting Existing Container: $(docker rm pagila-customer-svc)"

mvn clean install -DskipTests
mkdir -p target/dependency
cd target/dependency && jar -xf ../*.jar && cd -

TIMESTAMP=$(date +"%Y%m%d%H%M%S")
echo "Tagging Old Binary with: $TIMESTAMP"

docker tag pagila-customer-svc:latest pagila-customer-svc:$TIMESTAMP
docker build -t pagila-customer-svc:latest .

#docker run --name transaction -p 8080:8080 -e DB_HOST=postgres --network database -d pagila-customer-svc
docker run --name pagila-customer-svc --network=host -d pagila-customer-svc