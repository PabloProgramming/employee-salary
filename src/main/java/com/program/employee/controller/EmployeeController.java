package com.program.employee.controller;

import com.program.employee.model.Employee;
import com.program.employee.model.dto.EmployeeResponseDto;
import com.program.employee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @PostMapping
    private ResponseEntity<Employee> saveEmployee(@RequestBody final Employee employee) {

        return ResponseEntity.ok(employeeService.saveEmployee(employee));
    }

    @GetMapping ("/{id}")
    private ResponseEntity<EmployeeResponseDto> getEmployeeById(@PathVariable final Long id){
        return ResponseEntity.ok(employeeService.getEmployeeById(id));
    }

    @PutMapping
    private ResponseEntity<Employee> changeSalary(@RequestBody final Employee employee){
        return ResponseEntity.ok(employeeService.changeSalary(employee));
    }

}

