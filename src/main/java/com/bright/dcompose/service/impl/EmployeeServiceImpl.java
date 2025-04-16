package com.bright.dcompose.service.impl;

import com.bright.dcompose.dto.request.EmployeeRequestDto;
import com.bright.dcompose.dto.response.EmployeeResponseDto;
import com.bright.dcompose.model.Employee;
import com.bright.dcompose.repository.EmployeeRepository;
import com.bright.dcompose.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;


    @Override
    public Optional<EmployeeResponseDto> addEmployee(EmployeeRequestDto employeeRequestDto) {
        Employee employee = new Employee(
                employeeRequestDto.firstName(),
                employeeRequestDto.lastName()
        );
        Employee savedEmployee = employeeRepository.save(employee);
        return Optional.of(
                new EmployeeResponseDto(
                        savedEmployee.getId(),
                    savedEmployee.getFirstName(),
                    savedEmployee.getLastName()
                )
        );
    }

    @Override
    public List<EmployeeResponseDto> getEmployees() {
        return employeeRepository.findAll()
                .stream()
                .map(employee -> new EmployeeResponseDto(employee.getId(), employee.getFirstName(), employee.getLastName()))
                .toList();
    }
}
