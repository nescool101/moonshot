package com.restapi.employeeapi.controller;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.restapi.employeeapi.dto.EmployeeDTO;
import com.restapi.employeeapi.entity.Employee;
import com.restapi.employeeapi.service.EmployeeService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import java.util.List;

@WebMvcTest(EmployeeController.class)
class EmployeeControllerTest {

    public static final String API_V_1_EMPLOYEE = "/api/employees/";
    public static final String API_V_1_EMPLOYEE_wrong = "/api/v1/employee/";
    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private EmployeeService employeeService;


    @Test
    void listAll() throws Exception {
        Employee newEmployee = new Employee();
        newEmployee.setSalary(new Double(2.22));
        newEmployee.setPosition("javita");
        newEmployee.setId(1L);
        List<Employee> newEmployeeList = List.of(newEmployee);
        when(employeeService.findAll()).thenReturn(newEmployeeList);
        this.mockMvc.perform(get(API_V_1_EMPLOYEE))
                .andDo(print())
                .andExpect(status().isOk())
                .andReturn();
    }

    @Test
    void listAllFailedWrongUrl() throws Exception {
        Employee newEmployee = new Employee();
        newEmployee.setSalary(new Double(2.22));
        newEmployee.setPosition("javita");
        newEmployee.setId(1L);
        List<Employee> newEmployeeList = List.of(newEmployee);
        when(employeeService.findAll()).thenReturn(newEmployeeList);
        this.mockMvc.perform(get(API_V_1_EMPLOYEE_wrong))
                .andDo(print())
                .andExpect(status().isNotFound())
                .andReturn();
    }

    @Test
    void findById() throws Exception {
        Employee newEmployee = new Employee();
        when(employeeService.findById(1L)).thenReturn(newEmployee);
        this.mockMvc.perform(get(API_V_1_EMPLOYEE+"/{id}", 1L))
                .andDo(print())
                .andExpect(status().isOk())
                .andReturn();
    }


    @Test
    void deleteById() throws Exception {
        doNothing().when(employeeService).deleteById(1L);

        this.mockMvc.perform(delete(API_V_1_EMPLOYEE+"/{id}", 1L))
                .andDo(print())
                .andExpect(status().isOk())
                .andReturn();
    }

    @Test
    void save() throws Exception {
        Employee newEmployee = new Employee();
        when(employeeService.save(any(EmployeeDTO.class))).thenReturn(newEmployee);

        this.mockMvc.perform(post(API_V_1_EMPLOYEE)
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(new ObjectMapper().writeValueAsString(newEmployee)))
                .andDo(print())
                .andExpect(status().isOk())
                .andReturn();
    }

}
