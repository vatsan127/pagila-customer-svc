# Pagila Customer SVC

## Endpoints

- swagger

```html 
                localhost:8080/pagila-customer-svc/v1/swagger-ui/index.html 
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
