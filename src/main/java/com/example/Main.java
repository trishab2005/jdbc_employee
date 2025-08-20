package com.example;

import com.example.dao.DAO;
import com.example.dao.impl.DAOimpl;
import com.example.entity.Department;
import com.example.entity.Employee;

public class Main {
    public static void main(String[] args) {
        DAO dao = new DAOimpl();
        Department department = Department.builder().
                departmentId(1).
                departmentName("Accounts").
                departHead("Ramesh").
                departmentDescription("Accounts dept").
                build();

        System.out.println("department details is stored in database ");
        dao.storeDepartmentDetails(new Department(1,"Accounts","Ramesh","Accounts dept"));
        dao.storeDepartmentDetails(new Department(2,"Admin","Vijay","Admin dept"));
        dao.storeDepartmentDetails(new Department(3,"Sales","Vinod","Sales dept"));
        dao.storeDepartmentDetails(new Department(4,"HR","Mahesh","HR dept"));

        Employee employee = Employee.builder().
                employeeId(1).
                employeeName("Ramesh").
                employeeSalary(12000.00).
                employeeAddress("Address1").
                employeeContactNo(9896747627L).
                departmentId(2).
                build();
        dao.storeEmployeeDetails(new Employee(87,"Vikram",12000.0,"Address1",9896747627L,2));
        dao.storeEmployeeDetails(new Employee(110,"Ajay",18000.0,"Address2",7098705959L,1));
        dao.storeEmployeeDetails(new Employee(98,"Rajesh",11000.0,"Address3",9896754728L,4));
        dao.storeEmployeeDetails(new Employee(67,"Ram",19000.0,"Address4",8989675489L,3));
        dao.storeEmployeeDetails(new Employee(45,"Vinal",27000.0,"Address5",9898575858L,4));
        dao.storeEmployeeDetails(new Employee(987,"Kiran",21000.0,"Address6",7778585797L,2));

        System.out.println("employee details is stored in database ");

        dao.calculatePF(87);
    }
}
