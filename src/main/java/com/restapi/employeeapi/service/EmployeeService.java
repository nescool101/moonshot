package com.restapi.employeeapi.service;

import com.restapi.employeeapi.dto.Add;
import com.restapi.employeeapi.dto.EmployeeDTO;
import com.restapi.employeeapi.entity.Employee;
import com.restapi.employeeapi.exception.SoapConnectionException;
import com.restapi.employeeapi.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.remoting.soap.SoapFaultException;
import org.springframework.stereotype.Service;

import java.util.List;

import com.restapi.employeeapi.exception.DatabaseConnectionException;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private SoapClient soapClient;

    public List<Employee> findAll() {
        try {
            return employeeRepository.findAll();
        } catch (Exception e) {
            throw new DatabaseConnectionException("Database connection error while fetching all employees");
        }
    }

    public Employee findById(Long id) {
        try {
            return employeeRepository.findById(id).orElse(null);
        } catch (Exception e) {
            throw new DatabaseConnectionException("Database connection error while finding employee by id");
        }
    }

    public Employee save(EmployeeDTO employeeDTO)  {
        try {
            var add =new Add();
            var bonus = 1000;
            add.setArg0(1);
            add.setArg1(bonus);
            var returnedInt = soapClient.add(add);

            var employee= new Employee();
            employee.setId(employeeDTO.getId());
            employee.setPosition(employeeDTO.getPosition());
            employee.setName(employeeDTO.getName());
            employee.setSalary((double) returnedInt);
            return employeeRepository.save(employee);
        } catch (SoapFaultException e) {
            throw new SoapConnectionException("SOAP connection error while saving employee");
        } catch (Exception e) {
            throw new DatabaseConnectionException("Database connection error while saving employee");
        }
    }

    public void deleteById(Long id) {
        try {
            employeeRepository.deleteById(id);
        } catch (Exception e) {
            throw new DatabaseConnectionException("Database connection error while deleting employee by id");
        }
    }
}

