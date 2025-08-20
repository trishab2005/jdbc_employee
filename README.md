**EMPLOYEE MANAGEMENT SYSTEM**

This is a simple Java-based Employee Management System that interacts with an Oracle SQL database. The project demonstrates core CRUD (Create, Read, Update, Delete) operations using JDBC to manage employee and department data.

**Key Features:**

* **Database Connectivity:** Uses the Oracle JDBC driver to establish and manage database connections.
* **Data Models:** Simple POJOs (`Employee` and `Department`) are used to represent the data entities.
* **DAO Layer:** The Data Access Object (`DAO`) pattern is implemented to separate the business logic from the data persistence logic.
* **Transaction Management:** Demonstrates basic transaction handling with `commit` and `rollback` for data integrity.
* **Business Logic:** Includes a function to calculate an employee's Provident Fund (PF) based on their salary.

**Technologies Used:**

* **Java**
* **JDBC (Java Database Connectivity)**
* **Oracle SQL**
* **Lombok:** Used for reducing boilerplate code in data models (e.g., getters, setters, constructors).

**How to Run:**

1.  Set up an Oracle database instance with the `c##scott` user and a `tiger` password.
2.  Create the `employee` and `department` tables with the appropriate schema.
3.  Update the database connection URL, username, and password in the `Utility.java` file.
4.  Run the `Main.java` file to execute the program.
