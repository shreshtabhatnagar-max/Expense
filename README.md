💰 Expense Tracker – Spring Boot Application

A full-stack Expense Tracker application built using Spring Boot, Spring Data JPA, MySQL, and JavaScript.
This project allows users to add, view, update, and delete expenses through REST APIs with a simple frontend interface.

The application follows a clean layered architecture (Controller → Service → Repository → Database) which is commonly used in enterprise Java backend development.

🚀 Features

Add new expenses

View all expenses

View expense by ID

Update existing expenses

Delete expenses

RESTful API design

MySQL database integration

Simple frontend using HTML & JavaScript

Cross-Origin support for frontend communication

🌐 Live API

The application is deployed on Render and accessible here:

🔗 https://expense-859c.onrender.com

Example API endpoint:

GET https://expense-859c.onrender.com/api/expenses

You can test the APIs using Postman or directly in your browser.

🧰 Tech Stack
Backend

Java 17

Spring Boot

Spring Web MVC

Spring Data JPA

Hibernate ORM

Lombok

Maven

Database

MySQL

Frontend

HTML

CSS

JavaScript (Fetch API)

Tools

Git & GitHub

Postman

IntelliJ / VS Code

Maven

🏗️ Project Architecture

The project follows a Layered Architecture Pattern.

Client (Browser / Postman)
        │
        ▼
Controller Layer
(Handles HTTP Requests)
        │
        ▼
Service Layer
(Business Logic)
        │
        ▼
Repository Layer
(Database Operations using JPA)
        │
        ▼
Database (MySQL)
Layer Explanation
1️⃣ Controller Layer

Handles incoming HTTP requests and sends responses back to the client.

ExpenseController.java

Endpoints are defined using:

@RestController

@RequestMapping

@GetMapping

@PostMapping

@PutMapping

@DeleteMapping

2️⃣ Service Layer

Contains business logic of the application.

ExpenseService.java
ExpenseServiceImpl.java

Responsibilities:

Process expense data

Call repository methods

Handle application logic

3️⃣ Repository Layer

Handles database interaction using Spring Data JPA.

ExpenseRepository.java

Uses:

JpaRepository<Expense, Long>

Spring automatically provides:

save()

findAll()

findById()

deleteById()

4️⃣ Entity Layer

Represents the database table structure.

Expense.java

Uses JPA annotations like:

@Entity
@Id
@GeneratedValue
📂 Project Structure
Expense_Tracker2
│
├── Controller
│   └── ExpenseController.java
│
├── Service
│   ├── ExpenseService.java
│   └── ExpenseServiceImpl.java
│
├── Repository
│   └── ExpenseRepository.java
│
├── Entity
│   └── Expense.java
│
├── resources
│   ├── application.properties
│   └── static
│        ├── index.html
│        └── script.js
│
└── ExpenseTracker2Application.java
🔗 REST API Endpoints
1️⃣ Add Expense

POST /api/expenses

{
  "title": "Food",
  "amount": 500,
  "category": "Daily",
  "date": "2025-03-01"
}
2️⃣ Get All Expenses

GET /api/expenses

Returns all saved expenses.

3️⃣ Get Expense By ID

GET /api/expenses/{id}

Example:

/api/expenses/1
4️⃣ Update Expense

PUT /api/expenses/{id}

5️⃣ Delete Expense

DELETE /api/expenses/{id}

🗄️ Database Configuration

Update your application.properties:

spring.datasource.url=jdbc:mysql
spring.datasource.username=root
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.database-platform=org.hibernate.dialect.MySQLDialect
▶️ How to Run the Project
1️⃣ Clone the repository
https://github.com/shreshtabhatnagar-max/Expense
2️⃣ Navigate to project folder
cd expense-tracker
3️⃣ Run the application
mvn spring-boot:run
4️⃣ Open in browser
📸 Application UI

The frontend interface allows users to:

Add expenses

View expense list

Manage expense records

Built using HTML + JavaScript with Fetch API.

