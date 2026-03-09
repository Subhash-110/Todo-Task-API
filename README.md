# Todo List API

A simple **Spring Boot REST API** that allows users to **register, login, and manage their todo tasks**. Each user can create, view, update, and delete their own todo items.

This project demonstrates basic **REST API development, authentication logic, and CRUD operations using Spring Boot and JPA**.

---

# Features

* User Registration
* User Login
* Create Todo
* View All Todos
* Update Todo
* Delete Todo
* Todos linked to specific users

---

# Tech Stack

* Java
* Spring Boot
* Spring Web
* Spring Data JPA
* MySQL / H2 Database
* Maven

---

# Project Structure

```
src
 └─ main
     ├─ java
     │   └─ org.example
     │        ├─ controller
     │        │     AuthController.java
     │        │     TodoController.java
     │        │
     │        ├─ model
     │        │     User.java
     │        │     Todo.java
     │        │
     │        ├─ repository
     │        │     UserRepository.java
     │        │     TodoRepository.java
     │        │
     │        └─ service
     │              UserService.java
     │              TodoService.java
     │
     └─ resources
           application.properties
```

---

# API Endpoints

## User APIs

### Register User

```
POST /auth/register
```

Request Body

```json
{
  "username": "subhash",
  "password": "1234"
}
```

Response

```
User registered successfully
```

---

### Login User

```
POST /auth/login
```

Request Body

```json
{
  "username": "subhash",
  "password": "1234"
}
```

Response

```
Login successful
```

---

# Todo APIs

### Create Todo

```
POST /todos
```

Request Body

```json
{
  "title": "Complete Spring Boot project",
  "completed": false,
  "userId": 1
}
```

---

### Get Todos of a User

```
GET /todos/user/{userId}
```

Example

```
GET /todos/user/1
```

---

### Update Todo

```
PUT /todos/{todoId}
```

Request Body

```json
{
  "title": "Update project",
  "completed": true
}
```

---

### Delete Todo

```
DELETE /todos/{todoId}
```

Example

```
DELETE /todos/3
```

---

# How to Run the Project

### 1 Clone the repository

```
git clone https://github.com/your-username/todo-api.git
```

### 2 Navigate to the project

```
cd todo-api
```

### 3 Run the application

```
mvn spring-boot:run
```

Or run the main class in your IDE.

---

# Database Configuration

Example for **MySQL** in `application.properties`

```
spring.datasource.url=jdbc:mysql://localhost:3306/tododb
spring.datasource.username=root
spring.datasource.password=yourpassword

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

---

# Example Workflow

1. Register a user
2. Login with credentials
3. Create todos using userId
4. View todos for that user
5. Update or delete todos

---

# Future Improvements

* JWT Authentication
* Password Encryption
* User Authorization
* Pagination for todos
* Swagger API documentation
