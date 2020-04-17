# declaratie
Declaratie pe proprie raspundere

## Build
mvn clean package && docker build --tag=statement-service . && docker run -it -p 8080:8080 -p 8787:8787 statement-service

## Run
docker run -it -p 8080:8080 statement-service