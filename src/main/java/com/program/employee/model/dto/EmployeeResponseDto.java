package com.program.employee.model.dto;

import lombok.*;

@Builder //Creation Design Pattern (All constructor combinations)
@Getter
@RequiredArgsConstructor
public class EmployeeResponseDto {
    private final Long id;
    private final String name;
    private final String surname;
    private final int age;
    private final double salary;
    private final String joiningDate;
    private final double salaryRaise;
}
