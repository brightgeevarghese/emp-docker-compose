package com.bright.dcompose.service;

import com.bright.dcompose.dto.request.EmployeeRequestDto;
import com.bright.dcompose.dto.response.EmployeeResponseDto;
import com.bright.dcompose.model.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {
    Optional<EmployeeResponseDto> addEmployee(EmployeeRequestDto employeeRequestDto);
    List<EmployeeResponseDto> getEmployees();
}
