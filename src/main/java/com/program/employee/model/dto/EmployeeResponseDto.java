package com.program.employee.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeResponseDto {
    private Long id;
    private String name;
    private String surname;
    private int age;
    private double salary;
    private String joiningDate;
    private double salaryRaise = salary + salary*0.05;
}
