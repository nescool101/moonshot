package com.restapi.employeeapi.service;

import com.restapi.employeeapi.dto.Add;
import com.restapi.employeeapi.dto.EmployeeDTO;
import com.restapi.employeeapi.entity.Employee;
import com.restapi.employeeapi.exception.EmployeeNotFoundException;
import com.restapi.employeeapi.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restapi.employeeapi.dto.Result;
import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private SoapClient soapClient;

    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    public Employee findById(Long id) {
        return employeeRepository.findById(id).orElse(null);
    }

    public Employee save(EmployeeDTO savedEmployeeDTO) {


        // TODO Creating SOAP request object
        Add soapRequest = new Add();
        // Set the necessary fields of soapRequest object based on savedEmployeeDTO

        // TODO Calling the SOAP service
        Result soapResponse = soapClient.callSoapService(soapRequest);
        Employee employee = employeeService.save(savedEmployeeDTO);
        return employeeRepository.save(employee);
    }

    public void deleteById(Long id) {
        employeeRepository.deleteById(id);
    }
}
