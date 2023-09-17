package com.restapi.employeeapi.service;


import com.restapi.employeeapi.dto.Add;
import com.restapi.employeeapi.dto.EmployeeDTO;
import com.restapi.employeeapi.entity.Employee;
import com.restapi.employeeapi.repository.EmployeeRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;
import java.util.Optional;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.springframework.test.util.AssertionErrors.*;
@ExtendWith(MockitoExtension.class)
class EmployeeServiceTest {

    @InjectMocks
    private EmployeeService employeeService;

    @Mock
    private EmployeeRepository employeeRepository;

    @Mock
    private SoapClient soapClient;


    @BeforeEach
    public void setup(){


        Employee employeeSenior = getEmployeeSenior();
        employeeSenior.setSalary(1000.0);

        var employeeSeniorDto= new EmployeeDTO();
        employeeSeniorDto.setId(1L);
        employeeSeniorDto.setPosition("javita");
        employeeSeniorDto.setName("nescao");
        employeeSeniorDto.setSalary(1000.0);

        var employeeJuniorDto= new EmployeeDTO();
        employeeJuniorDto.setId(2L);
        employeeJuniorDto.setPosition("javita2");
        employeeJuniorDto.setName("nescao2");
        employeeJuniorDto.setSalary(100.0);
    }

    @Test
    void listAll() {

        Employee employeeSenior = getEmployeeSenior();
        employeeSenior.setSalary(1000.0);

        var employeeList= List.of(employeeSenior);

        when(employeeRepository.findAll()).thenReturn(employeeList);
        var values = employeeService.findAll();

        assertNotNull("failed assertion assertNotNull",values.get(0).getName());
        assertEquals("failed assertion","nescao", values.get(0).getName());
    }

    @Test
    void findByIdOK() {
        Employee employeeSenior = getEmployeeSenior();
        employeeSenior.setSalary(1000.0);
        when(employeeRepository.findById(1L)).thenReturn(Optional.of(employeeSenior));

        Employee values = employeeService.findById(1L);

        assertNotNull("failed assertion assertNotNull",values.getName());
        assertEquals("failed assertion","nescao", values.getName());
    }


    @Test
    void testSave() {
        EmployeeDTO employeeDTO = new EmployeeDTO();
        employeeDTO.setId(1L);
        employeeDTO.setName("Test Name");
        employeeDTO.setPosition("Test Position");
        employeeDTO.setSalary(1000.0);

        Add addResponse = new Add();
        addResponse.setArg0(1);
        addResponse.setArg1(1000);

        when(soapClient.add(any(Add.class))).thenReturn(1);

        Employee employee = new Employee();
        employee.setId(employeeDTO.getId());
        employee.setName(employeeDTO.getName());
        employee.setPosition(employeeDTO.getPosition());
        employee.setSalary(employeeDTO.getSalary());
        when(employeeRepository.save(any(Employee.class))).thenReturn(employee);

        Employee savedEmployee = employeeService.save(employeeDTO);

        assertEquals("getId",employeeDTO.getId(), savedEmployee.getId());
        assertEquals("getName",employeeDTO.getName(), savedEmployee.getName());
        assertEquals("getPosition",employeeDTO.getPosition(), savedEmployee.getPosition());
        assertEquals("getSalary",employeeDTO.getSalary(), savedEmployee.getSalary());
    }

    @Test
    void testDeleteById() {
        Long id = 1L;
        employeeService.deleteById(id);
        verify(employeeRepository).deleteById(id);
    }


    private static Employee getEmployeeSenior() {
        var employeeSenior= new Employee();
        employeeSenior.setId(1L);
        employeeSenior.setPosition("javita");
        employeeSenior.setName("nescao");
        return employeeSenior;
    }

}
