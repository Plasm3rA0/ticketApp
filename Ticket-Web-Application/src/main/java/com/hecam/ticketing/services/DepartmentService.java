package com.hecam.ticketing.services;

import com.hecam.ticketing.models.Department;
import com.hecam.ticketing.repositories.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DepartmentService {
    @Autowired
    DepartmentRepository departmentRepository;

    public List<Department> getAllDepartments() {
        return departmentRepository.findAll();
    }

    public Optional<Department> getDepartment(Long id) {
        return departmentRepository.findById(id);
    }

    public void saveOrUpdate(Department department) {
        departmentRepository.save(department);
    }

    public boolean deleteDepartment(Long id) {
        //! Change to Error Numbers
        if(getDepartment(id).isEmpty()) return false;
        departmentRepository.deleteById(id);
        if(getDepartment(id).isEmpty()) return true;
        return false;
    }
}
