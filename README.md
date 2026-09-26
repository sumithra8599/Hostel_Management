
# 🏨 Hostel Management System

A backend Hostel Management System built with Java, Spring Boot, Spring Security, and MySQL.This application simplifies hostel administration by managing students, rooms, attendance, login, counting, and emergency alerts through secure REST APIs.

## 📌 Overview

This system provides a centralized backend to handle:

- 👨‍🎓 Student information

- 🏠 Room details

- 📋 Attendance records

- 🚨 Emergency alerts (simple message view, not stored in DB)

- 🔐 Authentication & authorization

- 👤 Admin management

## 🚀 Features

- Student CRUD operations

- Room management with occupancy details

- Attendance tracking and reporting

- Counting module for hostel/student statistics

- Emergency alert messages (temporary, only viewable, not stored in DB)

- Secure login with Spring Security (HTTP Basic Authentication)

## 🛠️ Tech Stack

- Java 17 – Core language

- Spring Boot – Backend framework

- Spring Security – Authentication & authorization

- Spring Data JPA / Hibernate – Database access

- MySQL – Relational database

- Maven – Build & dependency management

- REST API – Client-server communication

- Postman – API testing


## 🏗️ Architecture
Flow:
  
Client → Spring Security → Controller → Service → Repository → MySQL Database


## 📂 Project Structure

- config → Spring Security, authentication and user details configuration

- controller → Handles HTTP/API requests

- service → Contains business logic

- Repository → Database operations using Spring Data JPA

- Entity → Database entity classes

- model → DTO classes for transferring data

- resources → Application configuration, templates and static files

- pom.xml → Maven dependencies and project configuration

- application.properties → MySQL and Spring Boot configuration


## 🔄 CRUD Operations

| Operation | Method | Purpose |
| --- | --- | --- |
| Create | POST | Add new data |
| Read | GET | Retrieve data |
| Update | PUT | Modify existing data |
| Delete | DELETE | Remove data |


## 🔐 Security

The project uses Spring Security with HTTP Basic Authentication.
Users must provide valid credentials to access protected APIs.
## 📊 Controllers

| Controller | Responsibility |
| --- | --- |
| ``admincon`` | Admin management |
| ``attendancecon`` | Attendance management |
| ``countcon`` | Counting operations |
| ``logincon`` | Login/authentication |
| ``roomcon`` | Room management |
| ``emergencycon`` | Emergency alerts (simple message view) |

## ⚙️ How to Run the Project

Prerequisites 

- Java 17+

- Maven

- MySQL

- IDE (IntelliJ/Eclipse/VS Code)

- Git & Postman

Step 1: Clone the Repository

- git clone https://github.com/sumithra8599/hostel-management.git

- cd hostel-management

Step 2: Create MySQL Database

- CREATE DATABASE hostel_management;

Step 3: Configure Database

 spring.datasource.url=${DB_URL}

 spring.datasource.username=${DB_USERNAME}

 spring.datasource.password=${DB_PASSWORD}

 spring.jpa.hibernate.ddl-auto=update             

 spring.jpa.show-sql=true

Step 4: Build the Project

- mvn clean install

Step 5: Run the Application

- mvn spring-boot:run

## 📈 Future Enhancements

- JWT-based authentication

- Role-based access control

- Automatic room allocation

- Attendance analytics & reports

- Real-time emergency notifications

- Email/SMS alerts

- Frontend integration (React/Angular)

- Swagger/OpenAPI documentation

- Cloud deployment & Docker
  
## 🎯 Learning Outcomes

Through this project, I gained practical experience in:

- Java backend development

- Spring Boot & Spring Security

- REST API design

- CRUD operations with JPA/Hibernate

- MySQL integration

- Authentication configuration

- API testing with Postman

- Layered architecture design
  
## Author

Sumithra  
Java | Spring Boot | Backend Developer

