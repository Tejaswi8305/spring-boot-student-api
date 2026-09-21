# Student API

A simple RESTful API built with Spring Boot to manage student records using CRUD operations and a layered architecture.

## 🚀 Features

* Create a student
* Get all students
* Get a student by ID
* Update a student
* Delete a student
* Layered architecture using Controller, Service, and Repository
* In-memory data storage using ArrayList

## 🛠️ Technologies Used

* Java
* Spring Boot
* Spring Web
* Maven
* REST API
* Postman

## 🏗️ Project Structure

```text
src/main/java/com/example/student_api/
│
├── Controller/
│   └── StudentController.java
│
├── Service/
│   └── StudentService.java
│
├── model/
│   └── Student.java
│
└── repository/
    └── StudentRepository.java
```

## 🔗 API Endpoints

| Method | Endpoint         | Description       |
| ------ | ---------------- | ----------------- |
| GET    | `/students`      | Get all students  |
| GET    | `/students/{id}` | Get student by ID |
| POST   | `/students`      | Add a new student |
| PUT    | `/students/{id}` | Update a student  |
| DELETE | `/students/{id}` | Delete a student  |

## 📌 Sample Student

```json
{
  "id": 1,
  "name": "Tejaswi",
  "email": "tejaswi@gmail.com",
  "course": "Data Science"
}
```

## ▶️ How to Run

1. Clone the repository.
2. Open the project in IntelliJ IDEA or VS Code.
3. Run `StudentApiApplication.java`.
4. The application starts on:

```text
http://localhost:8080
```

5. Use Postman or another API client to test the endpoints.

## 📚 What I Learned

This project helped me understand:

* Spring Boot REST APIs
* HTTP methods: GET, POST, PUT, DELETE
* `@RestController`
* `@GetMapping`, `@PostMapping`, `@PutMapping`, `@DeleteMapping`
* `@RequestBody`
* `@PathVariable`
* Dependency Injection
* Controller → Service → Repository architecture
* CRUD operations
* In-memory data storage

## 🔮 Future Improvements

Database persistence will be introduced in the next project of this Spring Boot learning series using MySQL and JPA/Hibernate.
