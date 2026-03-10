Expense Tracker Application
Overview
The Expense Tracker Application is a full-stack web application that allows users to manage their daily expenses. Users can add, update, delete, and view expenses through a simple web interface.

The backend is built using Spring Boot REST APIs, while the frontend is implemented using HTML, JavaScript, and REST calls.

This project follows a layered architecture to maintain clean separation of concerns between the controller, business logic, and data access layers.

Features

Add a new expense

View all expenses

View expense by ID

Update expense details

Delete an expense

RESTful API architecture

MySQL database integration

Simple frontend interface

Tech Stack
Backend

Java 17

Spring Boot

Spring MVC

Spring Data JPA

Hibernate ORM

Maven

Lombok

Frontend

HTML

JavaScript

Fetch API

Database

MySQL

Tools

IntelliJ IDEA / VS Code

Postman (for API testing)

Git & GitHub
Project Architecture

This project follows a Layered Architecture.
Client (Browser / Frontend)
        |
        v
Controller Layer
(Handles HTTP Requests)
        |
        v
Service Layer
(Business Logic)
        |
        v
Repository Layer
(Data Access using JPA)
        |
        v
Database (MySQL)
Layer Explanation
Controller Layer

Handles incoming HTTP requests and sends responses to the client.

Example:

ExpenseController

Endpoints like:

POST /api/expenses
GET /api/expenses
PUT /api/expenses/{id}
DELETE /api/expenses/{id}
Service Layer

Contains the business logic of the application.

Example:

ExpenseService
ExpenseServiceImpl

Responsibilities:

Process business rules

Communicate with repository layer

Repository Layer

Handles database operations using Spring Data JPA.

Example:

ExpenseRepository

Responsibilities:

CRUD operations

Data persistence

Entity Layer

Represents the database table structure.

Example:

Expense

Fields:

id
title
amount
category
date
Database Schema

Expense Table

Column	Type
id	Long
title	String
amount	Double
category	String
date	LocalDate
REST API Endpoints
Add Expense
POST /api/expenses

Request Body

{
  "title": "Food",
  "amount": 250,
  "category": "Daily",
  "date": "2026-03-10"
}
Get All Expenses
GET /api/expenses
Get Expense By ID
GET /api/expenses/{id}

Example

GET /api/expenses/1
Update Expense
PUT /api/expenses/{id}

Request Body

{
  "title": "Groceries",
  "amount": 500,
  "category": "Food",
  "date": "2026-03-10"
}
Delete Expense
DELETE /api/expenses/{id}
Project Structure
Expense_Tracker2
│
├── Controller
│   └── ExpenseController
│
├── Service
│   ├── ExpenseService
│   └── ExpenseServiceImpl
│
├── Repository
│   └── ExpenseRepository
│
├── Entity
│   └── Expense
│
├── resources
│   ├── application.properties
│   └── static
│        ├── index.html
│        └── script.js
How to Run the Project
1 Clone the repository
git clone https://github.com/your-username/Expense-Tracker.git
2 Navigate to project
cd Expense-Tracker
3 Configure MySQL Database

Update application.properties

spring.datasource.url=jdbc:mysql://localhost:3306/expense_db
spring.datasource.username=root
spring.datasource.password=yourpassword

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
4 Run the application

Using Maven

mvn spring-boot:run

Or run the main class

ExpenseTracker2Application.java
5 Access Application

Frontend

http://localhost:8080/index.html

API Base URL

http://localhost:8080/api/expenses
