package net.employeemicroservice.employeeservice.repository;

import net.employeemicroservice.employeeservice.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {
}
