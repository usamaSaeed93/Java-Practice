package com.springBoot.restProject.dao;

import com.springBoot.restProject.entity.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class EmployeeDAOImplementation implements EmployeeDAO {
    private EntityManager entityManager;
    @Autowired
    public EmployeeDAOImplementation(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
    @Override
    public List<Employee> findAll(){
        TypedQuery<Employee> typedQuery = entityManager.createQuery(" FROM Employee ", Employee.class);
        List <Employee > employees= typedQuery.getResultList();
        return employees;
    }

    @Override
    public Employee findById(int id) {
        Employee employee = entityManager.find(Employee.class,id);
        return employee;
    }

    @Override
    public Employee save(Employee employee) {
        Employee theEmployee = entityManager.merge(employee);
        return theEmployee;
    }

    @Override
    public Employee update(Employee employee) {
        Employee theEmployee = entityManager.merge(employee);
        return theEmployee;
    }

    @Override
    public Boolean delete(int id) {
        Employee theEmployee = entityManager.find(Employee.class, id);
        if (theEmployee != null) {
            try {
                entityManager.remove(theEmployee);
                return true;
            } catch (Exception e) {
                return false;
            }
        }
        return false;
    }

}


