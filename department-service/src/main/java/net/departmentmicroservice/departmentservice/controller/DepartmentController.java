package net.departmentmicroservice.departmentservice.controller;

import lombok.AllArgsConstructor;
import net.departmentmicroservice.departmentservice.dto.DepartmentDto;
import net.departmentmicroservice.departmentservice.service.DepartmentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/departments")
@AllArgsConstructor
public class DepartmentController {

    private DepartmentService departmentService;

    // Build save department REST API
    @PostMapping
    public ResponseEntity<DepartmentDto> saveDepartment(@RequestBody DepartmentDto departmentDto){
        DepartmentDto savedDepartment = departmentService.saveDepartment(departmentDto);
        return  new ResponseEntity<>(savedDepartment, HttpStatus.CREATED);
    }

    // Build save department REST API
    @GetMapping("{department-code}")
    public ResponseEntity<DepartmentDto> getDepartmentByCode(@PathVariable("department-code") String departmentCode){
        DepartmentDto savedDepartment = departmentService.getDepartMentByCode(departmentCode);
        return  new ResponseEntity<>(savedDepartment, HttpStatus.OK);
    }
}
