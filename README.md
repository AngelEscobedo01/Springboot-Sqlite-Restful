# HTTP REST API - Spring Boot

## Features

- Provides four endpoints to manage customer data:
    - `GET /customers`: Returns all customer data.
    - `GET /customers?city="San Antonio"`: Returns customers living in the specified city.
    - `GET /customers/{customerId}`: Returns customer data for the specified customer ID.
    - `POST /customers`: Creates a new customer with the provided data and returns the customer data along with its identifier.
- Includes Swagger documentation accessible at [localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html).
- Persistent local database file using SQLite.

## How to start
