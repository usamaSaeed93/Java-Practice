package com.springBoot.restProject.restController;


import com.springBoot.restProject.entity.Employee;
import com.springBoot.restProject.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {

    private EmployeeService employeeService;

    @Autowired
    public EmployeeRestController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/employees")
    public List<Employee> findAll() {
        return employeeService.findAll();
    }

    @GetMapping("/employee/{employeeId}")
    public Employee findById(@PathVariable int employeeId) {
        Employee employee = employeeService.findById(employeeId);
        if (employee == null) {
            throw new RuntimeException("Employee Not Found" + employeeId);
        }
        return employee;
    }

    @PostMapping("/employees")
    public Employee createEmployee(@RequestBody Employee employee) {
        return employeeService.save(employee);
    }
//    @PutMapping("/employees")
//    public Employee updateEmployee(@RequestBody Employee employee) {
//        return employeeService.update(employee);
//    }
//    @DeleteMapping("/employee/{employeeId}")
//    public Boolean deleteEmployee(@PathVariable int employeeId){
//        return employeeService.delete(employeeId);
//    }
}

