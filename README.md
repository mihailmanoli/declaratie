# declaratie
Declaratie pe proprie raspundere

## Build
mvn clean package && docker build --tag=statement-service . && docker run -it -p 8080:8080 -p 8787:8787 statement-service

## Run
docker run -it -p 8080:8080 statement-service

## Payload
```
curl --location --request POST 'http://localhost:8080/statement-service/rest/statement' \
--header 'Content-Type: application/json' \
--data-raw '{
	"fullName": "Manoli Mihail",
	"address": "<address here>",
	"birthDate": "<date here>",
	"location": "Carrefour Felicia",
	"recipientEmail": "email@gmail.com",
	"configuration": {
        "work": false,
        "shopping": false,
        "med": false,
        "help": false,
        "running": true,
        "agricole": false,
        "blood": false,
        "voluntariat": false,
        "market": false,
        "goods": false
    },
	"signatureDate": "20.04.2020",
	"signature": "<base64 -w 0 sematura-200width.jpg>"
}'
```