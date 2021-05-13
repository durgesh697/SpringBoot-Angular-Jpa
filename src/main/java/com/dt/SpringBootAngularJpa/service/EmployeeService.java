package com.dt.SpringBootAngularJpa.service;

import com.dt.SpringBootAngularJpa.exception.UserNotFondException;
import com.dt.SpringBootAngularJpa.model.Employee;
import com.dt.SpringBootAngularJpa.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class EmployeeService {

    @Autowired
    private final EmployeeRepo employeeRepo;

    public EmployeeService(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }
    public Employee addEmployee(Employee employee){
        employee.setEmployeeCode(UUID.randomUUID().toString());
        return  employeeRepo.save(employee);
    }

    public List<Employee> findAllEmployees(){
      return employeeRepo.findAll();
    }

    public Employee updateEmployee(Employee employee){
        return employeeRepo.save(employee);
    }

    public Employee findEmployeeById(Long id){
      return  employeeRepo.findEmployeeById(id)
              .orElseThrow(() -> new UserNotFondException("User by id" + id + "was not found"));
    }

    public Employee deleteEmployee(Long id){
      return employeeRepo.deleteEmployeeById(id);
    }
}
