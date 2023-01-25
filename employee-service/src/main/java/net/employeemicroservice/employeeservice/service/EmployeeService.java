package net.employeemicroservice.employeeservice.service;

import lombok.extern.java.Log;
import net.employeemicroservice.employeeservice.dto.EmployeeDto;
import net.employeemicroservice.employeeservice.entity.Employee;

public interface EmployeeService {
    EmployeeDto saveEmployee(EmployeeDto employeeDto);
    EmployeeDto getEmployeeByID(Long employeeId);
}
