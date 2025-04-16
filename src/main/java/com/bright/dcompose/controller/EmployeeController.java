package com.bright.dcompose.controller;

import com.bright.dcompose.dto.request.EmployeeRequestDto;
import com.bright.dcompose.dto.response.EmployeeResponseDto;
import com.bright.dcompose.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/api/v1/employees")
@RequiredArgsConstructor
public class EmployeeController {

    private final EmployeeService employeeService;

    @GetMapping
    public ResponseEntity<List<EmployeeResponseDto>> getEmployees() {
        return ResponseEntity.ok(employeeService.getEmployees());
    }

    @PostMapping
    public ResponseEntity<EmployeeResponseDto> createEmployee(@RequestBody EmployeeRequestDto employeeRequestDto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(employeeService.addEmployee(employeeRequestDto).orElseThrow(() -> new ResponseStatusException(HttpStatus.BAD_REQUEST)));
    }
}
