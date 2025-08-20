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



**OUTPUTS**

---Database >>>>

<img width="1440" height="900" alt="Screenshot 2025-08-20 at 8 35 32 PM" src="https://github.com/user-attachments/assets/0e1ce632-02a4-423b-b211-2798bf654550" />





---Intellij >>>

![WhatsApp Image 2025-08-20 at 20 48 37](https://github.com/user-attachments/assets/b65e7239-cc41-4182-9c54-1fdc3fd3c2a5)

![WhatsApp Image 2025-08-20 at 20 47 59](https://github.com/user-attachments/assets/be241e2c-a13e-493f-bac5-e6a1f579478c)


