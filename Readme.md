# Highway Ticket Management System

This project is a Highway Ticket Management System designed to manage users, vehicles, tickets, and payments. It is built using a microservices architecture with Spring Boot and communicates through REST APIs.

## Features

- **User Management**: Create, update, delete, and view users.
- **Vehicle Management**: Manage vehicle information and associate vehicles with users.
- **Ticket Management**: Issue, update, and manage traffic tickets.
- **Payment Management**: Handle payments for issued tickets.

## Project Structure

The project is divided into several microservices, each responsible for a specific domain:

1. **User Service**: Manages user information.
2. **Vehicle Service**: Handles vehicle data.
3. **Ticket Service**: Manages tickets issued to vehicles and users.
4. **Payment Service**: Handles payments for tickets.

## Technologies Used

- **Spring Boot**
- **Spring Cloud (Eureka, Config Server)**
- **MySQL** for database
- **Postman** for API testing

## Getting Started

### Prerequisites

- Java 11 or higher
- Maven
- MySQL

### API Documentation

You can import the Postman collection to test the APIs. [Download the Postman collection](https://www.postman.com/satellite-geologist-59329391/workspace/work-space/collection/32546540-b30e9008-cb34-4216-8987-2530a30a32d2?action=share&creator=32546540).

### Example Requests

#### User Management

- **Create a User**:

    ```http
    POST /users
    Content-Type: application/json

    {
        "userId": "1",
        "name": "John Doe",
        "email": "john.doe@example.com",
        "password": "password123",
        "role": "USER"
    }
    ```

- **Get All Users**:

    ```http
    GET /users
    ```

- **Update a User**:

    ```http
    PUT /users/1
    Content-Type: application/json

    {
        "name": "John Doe Updated",
        "email": "john.doe.updated@example.com",
        "password": "newpassword123",
        "role": "USER"
    }
    ```

- **Delete a User**:

    ```http
    DELETE /users/1
    ```

#### Vehicle Management

- **Create a Vehicle**:

    ```http
    POST /vehicles
    Content-Type: application/json

    {
        "vehicleId": "V123",
        "licensePlate": "ABC-123",
        "model": "Toyota Camry",
        "userId": "1"
    }
    ```

- **Get All Vehicles**:

    ```http
    GET /vehicles
    ```

#### Ticket Management

- **Create a Ticket**:

    ```http
    POST /tickets
    Content-Type: application/json

    {
        "ticketId": "T123",
        "vehicleId": "V123",
        "userId": "1",
        "issueDate": "2024-06-26T00:00:00Z",
        "status": "Open"
    }
    ```

- **Get All Tickets**:

    ```http
    GET /tickets
    ```

#### Payment Management

- **Create a Payment**:

    ```http
    POST /payments
    Content-Type: application/json

    {
        "paymentId": "P123",
        "ticketId": "T123",
        "userId": "1",
        "amount": 100.00,
        "paymentDate": "2024-06-26T00:00:00Z",
        "status": "Paid"
    }
    ```

- **Get All Payments**:

    ```http
    GET /payments
    ```

## ER Diagram
          +------------------+      +-------------------+      +------------------+      +------------------+
          |      User        |      |      Vehicle      |      |      Ticket      |      |     Payment      |
          +------------------+      +-------------------+      +------------------+      +------------------+
          | *userId (PK)     |1    M| *vehicleId (PK)   |1    M| *ticketId (PK)   |1    1| *paymentId (PK)  |
          |  name            +------+  licensePlate     +------+  vehicleId (FK)  +------+  ticketId (FK)   |
          |  email           |      |  model            |      |  userId (FK)     |      |  userId (FK)     |
          |  password        |      |  userId (FK)      |      |  issueDate       |      |  amount          |
          |  role            |      +-------------------+      |  status          |      |  paymentDate     |
          +------------------+                                 +------------------+      +------------------+


## Contributing

Contributions are welcome! Please fork the repository and create a pull request with your changes.

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.
