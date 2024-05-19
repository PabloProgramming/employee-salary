package com.program.employee.model.dto;

import lombok.*;

@AllArgsConstructor //Creation Design Pattern (All constructor combinations)
@Builder
@RequiredArgsConstructor
public class BossResponseDto{
    private  Long id;
    private  String name;
    private  String surname;
    private  int age;
    private  double salary;
    private  String joiningDate;
    private  double salaryRaise;
    private  double incentive;
    }

