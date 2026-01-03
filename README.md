# Student Management System – Backend

This is a backend application developed using Spring Boot that provides RESTful APIs to manage student information. 
The application allows users to perform basic CRUD (Create, Read, Update, Delete) operations on student records 
stored in a MySQL database using JDBC.

## 🚀 Features
- Add new student details
- View all students
- View student by ID
- Update student information
- Delete student records

## 🧩 Student Fields
- ID
- Name
- Email
- Course
- Phone

## 🛠️ Technologies & Concepts Used
- Java
- Spring Boot
- REST Controller
- Spring Data JDBC
- MySQL Database
- Postman for API testing

## 📌 API Endpoints
| Method | Endpoint | Description |
|------|---------|-------------|
| POST | /students | Add a new student |
| GET | /students | Get all students |
| GET | /students/{id} | Get student by ID |
| PUT | /students/{id} | Update student details |
| DELETE | /students/{id} | Delete student |

## 🧪 Testing
All APIs were tested using Postman to verify correct request and response handling.

## 📂 Project Architecture
The project follows a layered architecture:
- Controller Layer
- Service Layer
- Repository Layer
- Model Layer

## 🗄️ Database
- MySQL is used as the relational database.
- Student data is stored and managed using JDBC.

## 🔮 Future Enhancements

- Add user authentication and role-based access control.
- Implement input validation and global exception handling.
- Add Swagger for REST API documentation.
- Improve APIs with pagination, sorting, and search features.

---

## 👨‍💻 Author

**Kumaran**  
Java Full Stack Developer (Fresher) | Currently learning and building real-world projects  

Developed as a learning project to strengthen backend development skills using Spring Boot, REST APIs, and database integration.
