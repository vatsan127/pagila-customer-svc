# Pagila Customer SVC

## Endpoints

- swagger

```html 
                localhost:8080/pagila-customer-svc/v1/swagger-ui/index.html 
```

## Sample Request Body
```json
{
    "firstName": "srivatsan",
    "lastName": "n",
    "email": "srivatsan@mail.org",
    "address": {
        "district": "chennai",
        "address": "tiruvallur",
        "postalCode": "602001",
        "phone": "9876543210"
    },
    "rental": [
        {
            "storeName": "Pagila",
            "filmName": "Fast And Furious"
        },
        {
            "storeName": "Pagila",
            "filmName": "Need For Speed"
        }
    ]
}
```

- actuator

```html 
                localhost:8080/pagila-customer-svc/v1/actuator
```

## Pagila Database SetUP

```sql
CREATE DATABASE pagila;
```

```sql 
psql -d "postgresql://[user]:[password]@[hostname]/pagila" -f pagila.sql
```

```sql
psql postgresql://[user]:[password]@[hostname]/pagila
```
