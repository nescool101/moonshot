package com.restapi.employeeapi.service;

import com.restapi.employeeapi.dto.Add;
import com.restapi.employeeapi.dto.EmployeeDTO;
import com.restapi.employeeapi.entity.Employee;
import com.restapi.employeeapi.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private SoapClient soapClient;

    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    public Employee findById(Long id) {
        return employeeRepository.findById(id).orElse(null);
    }

    public Employee save(EmployeeDTO employeeDTO) {
        Add add =new Add();
        var bonus = 1000;
        add.setArg0(1);
        add.setArg1(bonus);
        int returnedInt = soapClient.add(add);

        var employee= new Employee();
        employee.setId(employeeDTO.getId());
        employee.setPosition(employeeDTO.getPosition());
        employee.setName(employeeDTO.getName());
        employee.setSalary(Double.valueOf(returnedInt));
        return employeeRepository.save(employee);
    }

    public void deleteById(Long id) {
        employeeRepository.deleteById(id);
    }
}
