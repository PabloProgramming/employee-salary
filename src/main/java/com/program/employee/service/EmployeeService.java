package com.program.employee.service;

import com.program.employee.model.Employee;
import com.program.employee.model.dto.EmployeeResponseDto;
import com.program.employee.repository.EmployeeRepository;
import com.program.employee.service.mapper.EmployeeMapper;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;
    @Autowired
    EmployeeMapper employeeMapper;

    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }
    @SneakyThrows
    public EmployeeResponseDto getEmployeeById(Long id) {
        Optional<Employee> employee = employeeRepository.findById(id);
        if (employee.isPresent()) {
            return employeeMapper.entityToResponseDto(employee.get());
        }
        throw new Exception("Id not found");
    }



    public Employee changeSalary(Employee employee) {
        Optional<Employee> employee1 = employeeRepository.findById(employee.getId());
        if (employee1.isPresent()) {
            return employeeRepository.save(employee);
        }
        return null;
    }
}
