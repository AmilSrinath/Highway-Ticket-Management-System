
        +------------------+      +-------------------+      +------------------+      +------------------+
        |      User        |      |      Vehicle      |      |      Ticket      |      |     Payment      |
        +------------------+      +-------------------+      +------------------+      +------------------+
        | *userId (PK)     |1    M| *vehicleId (PK)   |1    M| *ticketId (PK)   |1    1| *paymentId (PK)  |
        |  name            +------+  licensePlate     +------+  vehicleId (FK)  +------+  ticketId (FK)   |
        |  email           |      |  model            |      |  userId (FK)     |      |  userId (FK)     |
        |  password        |      |  userId (FK)      |      |  issueDate       |      |  amount          |
        |  role            |      +-------------------+      |  status          |      |  paymentDate     |
        +------------------+                                 +------------------+      +------------------+




<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Highway Ticket Management System</title>
</head>
<body>
    <h1>Highway Ticket Management System</h1>
    <p>This project is a Highway Ticket Management System designed to manage users, vehicles, tickets, and payments. It is built using a microservices architecture with Spring Boot and communicates through REST APIs.</p>

    <h2>Features</h2>
    <ul>
        <li><strong>User Management</strong>: Create, update, delete, and view users.</li>
        <li><strong>Vehicle Management</strong>: Manage vehicle information and associate vehicles with users.</li>
        <li><strong>Ticket Management</strong>: Issue, update, and manage traffic tickets.</li>
        <li><strong>Payment Management</strong>: Handle payments for issued tickets.</li>
    </ul>

    <h2>Project Structure</h2>
    <p>The project is divided into several microservices, each responsible for a specific domain:</p>
    <ul>
        <li><strong>User Service</strong>: Manages user information.</li>
        <li><strong>Vehicle Service</strong>: Handles vehicle data.</li>
        <li><strong>Ticket Service</strong>: Manages tickets issued to vehicles and users.</li>
        <li><strong>Payment Service</strong>: Handles payments for tickets.</li>
    </ul>

    <h2>Technologies Used</h2>
    <ul>
        <li><strong>Spring Boot</strong></li>
        <li><strong>Spring Cloud (Eureka, Config Server)</strong></li>
        <li><strong>MySQL</strong> for database</li>
        <li><strong>Postman</strong> for API testing</li>
    </ul>

    <h2>Getting Started</h2>

    <h3>Prerequisites</h3>
    <ul>
        <li>Java 11 or higher</li>
        <li>Maven</li>
        <li>MySQL</li>
    </ul>

    <h3>Installation</h3>
    <ol>
        <li>Clone the repository:
            <pre><code>git clone https://github.com/your-username/highway-ticket-management-system.git
cd highway-ticket-management-system
            </code></pre>
        </li>
        <li>Configure MySQL database in <code>application.properties</code> for each microservice:
            <pre><code>spring.datasource.url=jdbc:mysql://localhost:3306/YourDatabaseName?createDatabaseIfNotExist=true
spring.datasource.username=root
spring.datasource.password=yourpassword
            </code></pre>
        </li>
        <li>Build and run the microservices:
            <pre><code>cd user-service
mvn spring-boot:run

cd ../vehicle-service
mvn spring-boot:run

cd ../ticket-service
mvn spring-boot:run

cd ../payment-service
mvn spring-boot:run
            </code></pre>
        </li>
    </ol>

    <h3>API Documentation</h3>
    <p>You can import the Postman collection to test the APIs. <a href="https://www.postman.com/collections/your-collection-link">Download the Postman collection</a>.</p>

    <h3>Example Requests</h3>

    <h4>User Management</h4>
    <p><strong>Create a User</strong>:</p>
    <pre><code>POST /users
Content-Type: application/json

{
    "userId": "1",
    "name": "John Doe",
    "email": "john.doe@example.com",
    "password": "password123",
    "role": "USER"
}
    </code></pre>

    <p><strong>Get All Users</strong>:</p>
    <pre><code>GET /users
    </code></pre>

    <p><strong>Update a User</strong>:</p>
    <pre><code>PUT /users/1
Content-Type: application/json

{
    "name": "John Doe Updated",
    "email": "john.doe.updated@example.com",
    "password": "newpassword123",
    "role": "USER"
}
    </code></pre>

    <p><strong>Delete a User</strong>:</p>
    <pre><code>DELETE /users/1
    </code></pre>

    <h4>Vehicle Management</h4>
    <p><strong>Create a Vehicle</strong>:</p>
    <pre><code>POST /vehicles
Content-Type: application/json

{
    "vehicleId": "V123",
    "licensePlate": "ABC-123",
    "model": "Toyota Camry",
    "userId": "1"
}
    </code></pre>

    <p><strong>Get All Vehicles</strong>:</p>
    <pre><code>GET /vehicles
    </code></pre>

    <h4>Ticket Management</h4>
    <p><strong>Create a Ticket</strong>:</p>
    <pre><code>POST /tickets
Content-Type: application/json

{
    "ticketId": "T123",
    "vehicleId": "V123",
    "userId": "1",
    "issueDate": "2024-06-26T00:00:00Z",
    "status": "Open"
}
    </code></pre>

    <p><strong>Get All Tickets</strong>:</p>
    <pre><code>GET /tickets
    </code></pre>

    <h4>Payment Management</h4>
    <p><strong>Create a Payment</strong>:</p>
    <pre><code>POST /payments
Content-Type: application/json

{
    "paymentId": "P123",
    "ticketId": "T123",
    "userId": "1",
    "amount": 100.00,
    "paymentDate": "2024-06-26T00:00:00Z",
    "status": "Paid"
}
    </code></pre>

    <p><strong>Get All Payments</strong>:</p>
    <pre><code>GET /payments
    </code></pre>

    <h2>Contributing</h2>
    <p>Contributions are welcome! Please fork the repository and create a pull request with your changes.</p>

    <h2>License</h2>
    <p>This project is licensed under the MIT License. See the <a href="LICENSE">LICENSE</a> file for details.</p>
</body>
</html>
