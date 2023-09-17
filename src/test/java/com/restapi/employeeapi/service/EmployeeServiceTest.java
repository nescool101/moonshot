package com.restapi.employeeapi.service;

/*
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.restapi.employeeapi.exception.CategoryNotFoundException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;

import java.util.List;
import java.util.Optional;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import static org.springframework.test.util.AssertionErrors.*;
@WebMvcTest(CategoryServiceTest.class)
class CategoryServiceTest {


    @Mock
    List<CategoryDTO> categoryDTOMock;

    @InjectMocks
    private CategoryService categoryService;

    @Mock
    CategoryRepository categoryRepository;

    @Mock
    KeywordRepository keywordRepository;


    Category category = new Category();

    Category category1 = new Category();

    @BeforeEach
    public void setup(){


        CategoryDTO categoryParent = CategoryDTO.builder()
                .categoryId(1L)
                .keyword("Applience")
                .name("Garden")
                .subcategories(null)
                .hierarchyLevel(1L)
                .build();

        CategoryDTO categorySon = CategoryDTO.builder()
                .categoryId(1L)
                .keyword("Applience")
                .name("Garden")
                .subcategories(null)
                .hierarchyLevel(2L)
                .build();

        category = new Category().builder()
                .categoryId(1L)
                .name("name")
                .build();

        category1 = new Category().builder()
                .categoryId(2L)
                .name("name 2")
                .build();

    }
    @Test
    void listAll() {

        categoryService.listAll();
    }

    @Test
    void findByIdOK() throws CategoryNotFoundException, JsonProcessingException {
        Keyword keyword = new Keyword();
        keyword.setKeywords("Lawn2, Garden2, GardeningTools2");
        when(categoryRepository.findByCategory(1L)).thenReturn(Optional.of(category));
       // when(keywordRepository.findByCategoryId(1L)).thenReturn(keyword);

        ObjectMapper mapper = new ObjectMapper();

        String values = categoryService.findById(1L);

        assertNotNull("",values);
        assertEquals("",values, "Lawn2, Garden2, GardeningTools2");
    }

    @Test
    void findByIdForFailedPath() throws CategoryNotFoundException, JsonProcessingException {
        when(categoryRepository.findByCategory(1L)).thenReturn(Optional.of(category));
        //when(keywordRepository.findByCategoryId(1L)).thenReturn(null);

        ObjectMapper mapper = new ObjectMapper();

        String values = categoryService.findById(1L);

        assertNotNull("",values);
        assertEquals("",values, "Lawn, Garden, GardeningTools");
    }


    @Test
    void findByLevel1() throws CategoryNotFoundException {
        Keyword keyword = new Keyword();
        keyword.setKeywords("Lawn2, Garden2, GardeningTools2");
      //  when(keywordRepository.findByCategoryId(1L)).thenReturn(keyword);
        ObjectMapper mapper = new ObjectMapper();
        Long level = categoryService.findByLevel(1L);
        assertEquals("",1L, level);
    }
    @Test
    void findByLevel2() throws CategoryNotFoundException {
       // when(keywordRepository.findByCategoryId(1L)).thenReturn(null);
        ObjectMapper mapper = new ObjectMapper();
        Long level = categoryService.findByLevel(1L);
        assertEquals("",2L, level);
    }
}

 */