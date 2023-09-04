package com.example.Aws.Assignment.service;

import com.example.Aws.Assignment.model.Employee;
import com.example.Aws.Assignment.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    private final EmployeeRepo employeeRepo;

    public EmployeeService(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

    public  void SaveStudent(){
        Employee employee = new Employee();
        employee.setEmployeeId(1);
        employee.setName("Herry");
        employee.setDepartment("IT");

        employeeRepo.save(employee);
    }

}
