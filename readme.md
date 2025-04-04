E-Commerce Application

Overview

This is a full-stack e-commerce application built using Spring Boot for the backend. It provides functionalities for adding, retrieving, updating, and deleting products.

Features

Product Management (CRUD operations)

Category Management

User Authentication & Authorization

Order Processing

Database Integration with MySQL

REST API Implementation

Spring Security for Secure Access

Swagger API Documentation

Technologies Used

Backend: Spring Boot, Spring Data JPA, Spring Security, Hibernate

Database: MySQL

API Testing: Postman, Swagger

Version Control: Git, GitHub

Installation

Prerequisites

Java 17+

Spring Boot 3+

MySQL Database

Postman (Optional for testing API)

Git

Steps to Setup the Project

Clone the repository:

git clone https://github.com/yourusername/ecommerce-springboot.git

Navigate to the project directory:

cd ecommerce-springboot

Configure the MySQL database:

Open application.properties or application.yml in src/main/resources/

Update database configurations:

spring.datasource.url=jdbc:mysql://localhost:3306/ecommerce_db
spring.datasource.username=root
spring.datasource.password=yourpassword

Run the application:

mvn spring-boot:run

Access the API at http://localhost:8080

API Endpoints

Method

Endpoint

Description

GET

/products

Get all products

POST

/products

Add a new product

PUT

/products/{id}

Update a product

DELETE

/products/{id}

Delete a product

Contributing

Fork the repository

Create a feature branch (git checkout -b feature-branch)

Commit your changes (git commit -m "Add new feature")

Push to the branch (git push origin feature-branch)

Open a Pull Request