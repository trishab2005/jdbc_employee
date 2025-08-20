package com.example.entity;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class Employee {
    private Integer employeeId;
    private String employeeName;
    private Double employeeSalary;
    private String employeeAddress;
    private Long employeeContactNo;
    private Integer departmentId;
}
