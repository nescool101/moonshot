package com.restapi.employeeapi.controller;

import com.restapi.employeeapi.entity.Employee;
import com.restapi.employeeapi.exception.EmployeeNotFoundException;
import com.restapi.employeeapi.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@GetMapping
	public List<Employee> findAll() {
		return employeeService.findAll();
	}

	@GetMapping("/{id}")
	public Employee findById(@PathVariable Long id) throws EmployeeNotFoundException {
		return employeeService.findById(id);
	}

	@PostMapping
	public Employee save(@RequestBody Employee employee) {
		return employeeService.save(employee);
	}

	@DeleteMapping("/{id}")
	public void deleteById(@PathVariable Long id) {
		employeeService.deleteById(id);
	}
}
