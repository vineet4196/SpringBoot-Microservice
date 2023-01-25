package net.employeemicroservice.employeeservice.controller;


import lombok.AllArgsConstructor;
import net.employeemicroservice.employeeservice.dto.EmployeeDto;
import net.employeemicroservice.employeeservice.service.EmployeeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/employees")
@AllArgsConstructor
public class EmployeeController {
    private EmployeeService employeeService;

    //Build post Employee API
    @PostMapping
    public ResponseEntity<EmployeeDto> saveEmployee(@RequestBody EmployeeDto employeeDto){
        EmployeeDto savedEmployee = employeeService.saveEmployee(employeeDto);
        return  new ResponseEntity<>(savedEmployee, HttpStatus.CREATED);
    }


    //Build get Employee API
    @GetMapping("{id}")
    public ResponseEntity<EmployeeDto> getEmployee(@PathVariable("id") Long employeeId){
        EmployeeDto savedEmployee = employeeService.getEmployeeByID(employeeId);
        return  new ResponseEntity<>(savedEmployee, HttpStatus.OK);
    }
}
