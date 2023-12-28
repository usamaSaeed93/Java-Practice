package com.springBoot.restProject.dao;

import com.springBoot.restProject.entity.Employee;
import jakarta.persistence.EntityManager;

import java.util.List;

public interface EmployeeDAO {
 List <Employee> findAll();

 Employee findById(int id);

 Employee save(Employee employee);
 Employee update(Employee employee);
 Boolean delete(int Id);
}
