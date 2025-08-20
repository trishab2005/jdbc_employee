package com.example.dao.impl;

import com.example.config.Utility;
import com.example.dao.DAO;
import com.example.entity.Department;
import com.example.entity.Employee;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class DAOimpl implements DAO {
    @Override
    public boolean storeDepartmentDetails(Department department) {
        boolean status = false;
        try (Connection con = Utility.makeCon()) {
            con.setAutoCommit(false);
            PreparedStatement ps = con.prepareStatement(" INSERT INTO department Values (?,?,?,?)");
            ps.setInt(1, department.getDepartmentId());
            ps.setString(2, department.getDepartmentName());
            ps.setString(3, department.getDepartHead());
            ps.setString(4, department.getDepartmentDescription());
            int rowsAffected = ps.executeUpdate();
            if (rowsAffected > 0) {
                con.commit();
                status = true;
            } else {
                status = false;
            }

        } catch (SQLException e) {
            System.out.println("Could not insert department details. " + e.getMessage());
        }
        return status;
    }

    @Override
    public boolean storeEmployeeDetails(Employee employee) {
        boolean status = false;
        try (Connection con = Utility.makeCon()) {
            con.setAutoCommit(false);
            // Inside the storeEmployeeDetails method
            PreparedStatement ps = con.prepareStatement(" INSERT INTO employee (employeeid, employeeName, employeeSalary, employeeAddress, employeeContactNo, departmentId) VALUES (?,?,?,?,?,?)");
            ps.setInt(1, employee.getEmployeeId());
            ps.setString(2, employee.getEmployeeName());
            ps.setDouble(3, employee.getEmployeeSalary());
            ps.setString(4, employee.getEmployeeAddress());
            ps.setLong(5, employee.getEmployeeContactNo());
            ps.setInt(6, employee.getDepartmentId());
            int rowsAffected = ps.executeUpdate();
            if (rowsAffected > 0) {
                con.commit();
                status = true;
            } else {
                status = false;
            }
        } catch (SQLException e) {
            System.out.println("Could not insert employee details. " + e.getMessage());
        }
        return status;
    }

    @Override
    public Employee retrieveEmployeeDetails(Integer id) {
        Employee emp = null;
        try (Connection con = Utility.makeCon()) {
            PreparedStatement ps = con.prepareStatement("SELECT * FROM employee WHERE employeeId= ?");
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                emp = new Employee(rs.getInt("employeeId"),
                        rs.getString("employeeName"),
                        rs.getDouble("employeeSalary"),
                        rs.getString("employeeAddress"),
                        rs.getLong("employeeContactNo"),
                        rs.getInt("departmentId")
                );
                System.out.println("Employee details: " + emp);
            } else {
                System.out.println("Employee not found");
            }

        } catch (SQLException e) {
            System.out.println("Could not insert employee details. " + e.getMessage());
        }
        return emp;
    }

    @Override
    public double calculatePF(Integer employeeId) {
        double pfAmount = 0.0;
        try (Connection con = Utility.makeCon()) {
            PreparedStatement ps = con.prepareStatement("SELECT employeeName, employeeSalary FROM employee WHERE employeeId = ?");
            ps.setInt(1, employeeId);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                double salary = rs.getDouble("employeeSalary");
                String name = rs.getString("employeeName");
                if (salary >=1000 && salary <= 10000) {
                    pfAmount = salary * 0.05;
                }else if (salary >= 10000 && salary <= 100000) {
                    pfAmount = salary * 0.06;
                } else if (salary >= 10000) {
                    pfAmount = salary * 0.07;
                }
                System.out.println("PF amount for "+ name + "(ID : "+employeeId+"): " + pfAmount);
            }else{
                System.out.println("employee not found");
            }

        } catch (SQLException e) {
            System.out.println("Could not insert employee details. " + e.getMessage());
        }
        return pfAmount;
    }
}