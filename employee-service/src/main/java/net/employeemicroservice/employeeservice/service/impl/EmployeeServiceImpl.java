package net.employeemicroservice.employeeservice.service.impl;

import lombok.AllArgsConstructor;
import net.employeemicroservice.employeeservice.dto.EmployeeDto;
import net.employeemicroservice.employeeservice.entity.Employee;
import net.employeemicroservice.employeeservice.repository.EmployeeRepository;
import net.employeemicroservice.employeeservice.service.EmployeeService;
import org.springframework.stereotype.Service;


@Service
@AllArgsConstructor
public class EmployeeServiceImpl  implements EmployeeService {
    public EmployeeRepository employeeRepository;

    @Override
    public EmployeeDto saveEmployee(EmployeeDto employeeDto) {
        Employee employee = new Employee(
                employeeDto.getId(),
                employeeDto.getFirstName(),
                employeeDto.getLastName(),
                employeeDto.getEmail()
                );

        Employee savedEmployee = employeeRepository.save(employee);

        EmployeeDto savedEmployeeDto = new EmployeeDto(
                savedEmployee.getId(),
                savedEmployee.getFirstName(),
                savedEmployee.getLastName(),
                savedEmployee.getEmail()
        );
        return  savedEmployeeDto;

    }

    @Override
    public EmployeeDto getEmployeeByID(Long employeeId) {
        Employee savedEmployee = employeeRepository.findById(employeeId).get();

        EmployeeDto savedEmployeeDto = new EmployeeDto(
                savedEmployee.getId(),
                savedEmployee.getFirstName(),
                savedEmployee.getLastName(),
                savedEmployee.getEmail()
        );

        return  savedEmployeeDto;
    }
}
