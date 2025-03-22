package com.springboot.projects.postgres_setup.controller;

import com.springboot.projects.postgres_setup.entity.Employee;
import com.springboot.projects.postgres_setup.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @PostMapping("/employee")
    Employee postEmployee(@RequestBody Employee employee){
        return employeeService.addEmployee(employee);
    }
}
