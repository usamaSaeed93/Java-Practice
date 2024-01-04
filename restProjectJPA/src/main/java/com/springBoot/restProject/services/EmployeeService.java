package com.springBoot.restProject.services;

import com.springBoot.restProject.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List <Employee> findAll();
    Employee findById(int id);

    Employee save(Employee employee);
//    Employee update(Employee employee);
//    Boolean delete(int Id);
}
