# JDBC Project

A Java application developed as part of my studies in Java, following the **Java COMPLETO course by Nelio Alves on Udemy**.

The project was created for educational purposes to practice **Object-Oriented Programming, JDBC, MySQL, SQL, and the DAO design pattern**.

## About

This project demonstrates how a Java application can communicate with a relational database using **JDBC (Java Database Connectivity)**.

The application manages **sellers and departments** and implements database operations through the **DAO (Data Access Object)** pattern.

This repository represents a stage of my learning journey, where I practiced connecting a Java application to a MySQL database and implementing CRUD operations.

> **Educational project:** This project was developed while following the lessons and exercises from the Java course by Nelio Alves on Udemy.

## Technologies

* Java
* JDBC
* MySQL
* SQL
* Object-Oriented Programming (OOP)
* DAO Pattern
* Eclipse IDE

## Project Structure

```text
src/
├── application/
│   ├── Program.java
│   └── Program2.java
│
├── db/
│   ├── DB.java
│   ├── DbException.java
│   └── DbIntegrityException.java
│
└── model/
    ├── dao/
    │   ├── DaoFactory.java
    │   ├── DepartmentDao.java
    │   ├── SellerDao.java
    │   └── impl/
    │
    └── entities/
        ├── Department.java
        └── Seller.java
```

## Features

### Seller

* Insert sellers
* Update seller information
* Delete sellers
* Find a seller by ID
* Find all sellers
* Find sellers by department

### Department

* Access department data through the DAO layer
* Manage department information
* Establish relationships between departments and sellers

## Database Integration

The application uses **JDBC** to establish communication between Java and MySQL.

The database layer is responsible for:

* Opening database connections
* Executing SQL statements
* Using `PreparedStatement`
* Processing query results with `ResultSet`
* Handling database exceptions
* Closing database resources

## DAO Pattern

The project uses the **DAO (Data Access Object)** pattern to separate database access logic from the application's entities and other components.

The main flow is:

```text
Application
     ↓
DaoFactory
     ↓
DAO
     ↓
JDBC
     ↓
MySQL
```

This separation makes the application more organized and allows database operations to remain concentrated in the DAO layer.

## Concepts Practiced

During the development of this project, I practiced:

* Java Object-Oriented Programming
* Classes and objects
* Interfaces
* Polymorphism
* Collections
* Generics
* JDBC
* SQL
* MySQL
* `Connection`
* `PreparedStatement`
* `ResultSet`
* CRUD operations
* Database relationships
* Exception handling
* DAO Pattern
* Layered application structure

## How to Run

### 1. Clone the repository

```bash
git clone https://github.com/joaopascoal1v-sudo/Projeto-jdbc.git
```

### 2. Configure MySQL

Create the required database and tables in MySQL.

### 3. Configure the database connection

Configure the database connection according to your local MySQL environment.

Do not commit real passwords or sensitive database credentials to the repository.

### 4. Run the application

Open the project in Eclipse and run the application classes located in:

```text
src/application/
```

## Learning Purpose

This project is part of my learning journey in Java and database integration.

The main objective was to understand how a Java application communicates with a relational database and how different layers of an application can be organized.

Through this project, I practiced concepts such as **JDBC, SQL, CRUD operations, DAO, object-oriented programming, and database relationships**.

## Course Reference

This project was developed while following the **Java COMPLETO Programação Orientada a Objetos + Projetos** course by **Nelio Alves**, available on Udemy.

The project is published here for **educational and portfolio purposes**, representing my practical learning process.

## Future Improvements

As I continue developing my skills, this project may be extended with additional features and improvements, such as:

* Input validation
* Better exception handling
* Automated tests
* Search and filtering improvements
* Additional business rules
* REST API integration
* Docker configuration
* Improved documentation

## Author

**João Pascoal**

GitHub:
https://github.com/joaopascoal1v-sudo
