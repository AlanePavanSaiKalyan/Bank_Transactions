# 🎓 Student Management System (JDBC Project)

A simple Java JDBC project to learn real-world backend architecture using Java, JDBC, and MySQL.

---

# 📌 Features

- Add Student
- View Students
- Delete Student
- MySQL Database Integration
- DAO Pattern Implementation
- Layered Architecture

---

# 🛠️ Technologies Used

- Java
- JDBC
- MySQL
- IntelliJ IDEA / Eclipse

---

# 📂 Project Structure

```txt
student-management/
│
├── config/
│     └── DbConnection.java
│
├── model/
│     └── Student.java
│
├── dao/
│     ├── StudentDAO.java
│     └── StudentDAOImpl.java
│
└── Main.java
```

---

# 🧠 Project Architecture

```txt
Main
 ↓
DAO Layer
 ↓
JDBC
 ↓
MySQL Database
```

---

# 🗄️ Database Setup

## Create Database

```sql
create database school_db;
```

## Use Database

```sql
use school_db;
```

## Create Table

```sql
create table students(
    id int primary key auto_increment,
    name varchar(100),
    marks int
);
```

---

# 🔌 MySQL JDBC Dependency

## Maven Dependency

```xml
<dependency>
    <groupId>mysql</groupId>
    <artifactId>mysql-connector-j</artifactId>
    <version>9.2.0</version>
</dependency>
```

---

# ⚙️ Configure Database Connection

Update database credentials inside `DbConnection.java`

```java
return DriverManager.getConnection(
    "jdbc:mysql://localhost:3306/school_db",
    "root",
    "password"
);
```

---

# 🚀 How to Run

1. Clone the repository

```bash
git clone <repository-url>
```

2. Open project in IntelliJ IDEA or Eclipse

3. Create database and table in MySQL

4. Update database username and password

5. Run `Main.java`

---

# 📸 Sample Output

```txt
===== STUDENT MANAGEMENT =====

1. Add Student
2. View Students
3. Delete Student
4. Exit
```

---

# 📚 Concepts Learned

- JDBC Basics
- CRUD Operations
- PreparedStatement
- ResultSet
- DAO Pattern
- Layered Architecture
- Database Connectivity

---

# 🔥 Future Improvements

- Update Student
- Search Student By ID
- Login System
- Swing GUI
- Spring Boot Version

---

# 👨‍💻 Author

Pavan Sai Kalyan

---

# ⭐ Learning Goal

This project is created to understand how real-world Java backend applications are structured using JDBC.