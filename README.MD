# 🎓 Student Management System (JDBC Project)

A simple Java JDBC project to learn real-world backend architecture using:

- Java
- JDBC
- MySQL
- DAO Pattern
- Layered Architecture

This project helps beginners understand how large applications are structured internally.

---

# 📌 Features

✅ Add Student  
✅ View Students  
✅ Delete Student  
✅ MySQL Database Integration  
✅ JDBC Connection Handling  
✅ DAO Pattern Implementation

---

# 🛠️ Technologies Used

| Technology | Purpose |
|---|---|
| Java | Backend Logic |
| JDBC | Database Connectivity |
| MySQL | Database |
| IntelliJ / Eclipse | IDE |

---

# 📂 Project Structure

student-management/
│
├── config/
│ └── DbConnection.java
│
├── model/
│ └── Student.java
│
├── dao/
│ ├── StudentDAO.java
│ └── StudentDAOImpl.java
│
└── Main.java

---

# 🧠 Project Architecture

Main
↓
DAO Layer
↓
JDBC
↓
MySQL Database

---

# 🗄️ Database Setup

## Step 1 — Create Database

```sql
create database school_db;