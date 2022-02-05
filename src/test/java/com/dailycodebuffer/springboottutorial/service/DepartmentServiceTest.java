package com.dailycodebuffer.springboottutorial.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.dailycodebuffer.springboottutorial.entity.Department;
import com.dailycodebuffer.springboottutorial.repository.DepartmentRepository;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class DepartmentServiceTest {
        @Autowired
        private DepartmentService departmentService;

        @MockBean
        private DepartmentRepository departmentRepository;

        @BeforeEach
        void setUp() {
                Department department = Department.builder()
                                .departmentName("IT")
                                .departmentAddress("Ahmedabad")
                                .departmentCode("IT-06")
                                .departmentId(4L)
                                .build();
                Mockito.when(departmentRepository.findByDepartmentNameIgnoreCase("IT"))

                                .thenReturn(department);

        }

        @Test
        @DisplayName("Get Data based on Valida Department Name")
        public void whenValidDepartmentName_thenDepartmentShouldFound() {
                String departmentName = "IT";
                Department found = departmentService.fetchDepartmentByName(departmentName);

                assertEquals(departmentName, found.getDepartmentName());

        }
}
