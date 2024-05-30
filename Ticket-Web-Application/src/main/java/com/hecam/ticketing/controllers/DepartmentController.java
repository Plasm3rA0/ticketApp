package com.hecam.ticketing.controllers;

import com.hecam.ticketing.models.Department;
import com.hecam.ticketing.services.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/departments")
public class DepartmentController {

    @Autowired
    DepartmentService departmentService;

    @GetMapping
    public List<Department> getAll() {
        return departmentService.getAllDepartments();
    }

    @GetMapping("/{depId}")
    public Optional<Department> getById(@PathVariable Long depId) {
        return departmentService.getDepartment(depId);
    }

    @PostMapping
    public void addDepartment(@RequestBody Department department) {
        departmentService.saveOrUpdate(department);
    }

    @DeleteMapping("/{depId}")
    public boolean deleteDepartment(@PathVariable Long depId) {
        return departmentService.deleteDepartment(depId);
    }
}
