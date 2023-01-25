package net.departmentmicroservice.departmentservice.service;

import net.departmentmicroservice.departmentservice.dto.DepartmentDto;

public interface DepartmentService {
    DepartmentDto saveDepartment(DepartmentDto departmentDto);
    DepartmentDto getDepartMentByCode(String departmentCode);
}
