package com.program.employee.service.mapper;

import com.program.employee.model.Employee;
import com.program.employee.model.dto.EmployeeResponseDto;
import org.springframework.stereotype.Service;

@Service
public class EmployeeMapper {
    public EmployeeResponseDto entityToResponseDto(Employee employee){
        EmployeeResponseDto employeeResponseDto = new EmployeeResponseDto();
        employeeResponseDto.setId(employee.getId());
        employeeResponseDto.setName(employee.getName());
        employeeResponseDto.setSalary(employee.getSalary());
        employeeResponseDto.setSalaryRaise(employee.getSalary() + employee.getSalary()*0.05);
        return employeeResponseDto;
    }
}
