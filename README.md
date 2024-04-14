# HTTP REST API - Spring Boot

## Overview
A Spring Boot application with a few REST APIs. 
Contains a persistent database using SQLite contained within the repository.

- Endpoints:
  - `GET /customers`: Returns all customer data.
  - `GET /customers?city="San Antonio"`: Returns customers living in the specified city.
  - `GET /customers/{customerId}`: Returns customer data for the specified customer ID.
  - `POST /customers`: Creates a new customer with the provided data and returns the customer data along with its identifier.
- Includes Swagger documentation accessible at [localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html).
- Built with a persistent local database file using SQLite. (databasefile.db)

## Getting Started

### Prerequisites

Before starting the application, ensure that you have the following installed:

- Java Development Kit (JDK)
  - I built this using Java 17
- Gradle
- IntelliJ
  - This project was built using IntelliJ and is the recommended IDE.

### Running the Application

To start the application:

1. Clone this repository to your local machine.
2. Open the project in IntelliJ IDE.
3. Build and run the application from within IntelliJ IDE.
4. Test endpoints at  [localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html).

### Database Configuration
If you have issues with connecting to the SQLite database, you might need to install the SQLite drivers. 
Double-click the `databasefile.db` file, a modal will pop up that says Datasources & Drivers, 
navigate to the Drivers tab and install the SQLite Driver File, Xerial JDBC
