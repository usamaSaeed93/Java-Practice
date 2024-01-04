package com.springBoot.restProject.services;


import com.springBoot.restProject.dao.EmployeeRepository;
import com.springBoot.restProject.entity.Employee;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImplementation implements EmployeeService {
    private EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeServiceImplementation(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee findById(int id) {
        Optional<Employee> byId = employeeRepository.findById(id);
        Employee employee=null;
        if(byId.isPresent()){
            employee = byId.get();
        }
        else{
            throw new RuntimeException("This is not working");
        }
        return employee;
    }

    @Override

    public Employee save(Employee employee) {
        return employeeRepository.save(employee);
    }

//    @Override
//
//
//    public Employee update(Employee employee) {
//        return employeeRepository.update(employee);
//    }

//    @Override
//
//    public Boolean delete(int Id) {
//        return employeeRepository.delete(Id);
//    }
}
