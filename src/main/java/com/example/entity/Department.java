package com.example.entity;

import lombok.*;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class Department {
    private Integer departmentId;
    private String departmentName;
    private String departHead;
    private String departmentDescription;

}
