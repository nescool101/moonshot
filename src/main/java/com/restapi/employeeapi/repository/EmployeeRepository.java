package com.restapi.employeeapi.repository;

import com.restapi.employeeapi.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
