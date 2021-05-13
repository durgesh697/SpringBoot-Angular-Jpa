package com.dt.SpringBootAngularJpa.repo;

import com.dt.SpringBootAngularJpa.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.Id;
import java.util.Optional;

public interface EmployeeRepo extends JpaRepository<Employee, Id> {
    Employee deleteEmployeeById(Long id);

    Optional<Employee> findEmployeeById(Long id);
}
