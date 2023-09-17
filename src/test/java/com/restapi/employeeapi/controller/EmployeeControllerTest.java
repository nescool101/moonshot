package com.restapi.employeeapi.controller;

/*
import com.restapi.employeeapi.service.EmployeeService;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import java.util.List;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(EmployeeController.class)
class CategoryControllerTest {


    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private EmployeeService service;


    @Mock
    List<CategoryDTO> categoryDTOMock;



    @Test
    public void listAllFailed() throws Exception {
        when(service.listAll()).thenReturn(categoryDTOMock);
        this.mockMvc.perform(get("/api/v1/category/")).andDo(print()).andExpect(status().isInternalServerError())
                .andReturn();

    }
    @Test
    public void findById() throws Exception {
        when(service.listAll()).thenReturn(categoryDTOMock);
        this.mockMvc.perform(get("/api/v1/category/categoryId/{id}",1l)).andDo(print()).andExpect(status().isOk())
                .andReturn();

    }

    @Test
    public void findByLevel() throws Exception {
        when(service.findByLevel(1L)).thenReturn(1L);
        this.mockMvc.perform(get("/api/v1/category/categoryLevel/categoryId/{id}",1l)).andDo(print()).andExpect(status().isOk())
                .andReturn();
    }

}

 */