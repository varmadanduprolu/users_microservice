package com.varma.department.service;


import com.varma.department.entity.Department;
import com.varma.department.repository.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DepartmentService {
    @Autowired
    private DepartmentRepository departmentRepository;

    public void saveDepartment(Department department) {
        log.info("Inside saveDepartment method of department service");
         departmentRepository.save(department);
    }

    public Department findDepartmentById(Long departmentId) {
        log.info("Inside findDepartmentById method of department service");
        return departmentRepository.findById(departmentId).get();
    }
}
