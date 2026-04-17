# 🚀 User Management API

A simple and clean REST API built using Spring Boot for managing users.  
This project demonstrates backend development concepts like layered architecture, validation, and exception handling.

---

## 🛠 Tech Stack

- Java 
- Spring Boot
- Spring Data JPA
- H2 In-Memory Database
- Maven

---

## 📂 Project Structure


in.scalive
├── controller
├── service
├── repository
├── model
├── exception
└── config


---

## ✨ Features

- Get all users (GET /users)
- Create new user (POST /users)
- Input validation using @Valid
- Global exception handling
- Duplicate email check
- In-memory database (H2)

---

## 🔗 API Endpoints

### 🔹 Get all users

GET /users


### 🔹 Create user

POST /users

#### Sample Request:
```json
{
  "name": "Somya",
  "email": "somya123@gmail.com"
}
```
⚠️ Error Handling
400 → Validation errors
409 → Duplicate email
500 → Internal server error

🧪 Run Locally
Clone the repository
git clone https://github.com/YOUR_USERNAME/user-management-api.git
Navigate to project folder
cd user-management-api
Run the application
mvn spring-boot:run

🌐 Base URL
http://localhost:8081

🧠 Learnings
REST API design
Spring Boot architecture
Exception handling
Backend debugging
Git & GitHub workflow

📌 Author
Somya Saxena
