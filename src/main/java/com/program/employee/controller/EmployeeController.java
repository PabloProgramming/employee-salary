package com.program.employee.controller;

import com.program.employee.model.Employee;
import com.program.employee.model.dto.EmployeeResponseDto;
import com.program.employee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @PostMapping
    private ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee) {

        return ResponseEntity.ok(employeeService.saveEmployee(employee));
    }

    @GetMapping ("/{id}")
    private ResponseEntity<EmployeeResponseDto> getEmployeeById(@PathVariable Long id){
        return ResponseEntity.ok(employeeService.getEmployeeById(id));
    }

    @PutMapping
    private ResponseEntity<Employee> changeSalary(@RequestBody Employee employee){
        return ResponseEntity.ok(employeeService.changeSalary(employee));
    }

}

