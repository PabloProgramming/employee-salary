package com.program.employee.service.mapper;

import com.program.employee.model.Employee;
import com.program.employee.model.dto.EmployeeResponseDto;
import org.springframework.stereotype.Service;

@Service
public class EmployeeMapper {
    public EmployeeResponseDto entityToResponseDto(final Employee employee){
        return EmployeeResponseDto.builder()
                .id(employee.getId())
                .name(employee.getName())
                .salary(employee.getSalary())
                .build();
    }
}
