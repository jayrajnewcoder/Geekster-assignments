package com.Adresss.Adress.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Adresss.Adress.DAO.EmployeeDao;
import com.Adresss.Adress.model.Employee;
import com.Adresss.Adress.service.EmployeeService;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	
	@GetMapping
	private ResponseEntity<List<Employee>> getAllEmployees(){
		return new ResponseEntity<List<Employee>>(employeeService.getAllEmployee(),HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	private ResponseEntity<Employee> getEmployees(@PathVariable("id") Long id){
		return new ResponseEntity<Employee>(employeeService.getEmployee(id),HttpStatus.OK);

	}
	
	@PostMapping
	private ResponseEntity<Employee> addEmployee(@RequestBody Employee employee){
		return new ResponseEntity<Employee>(employeeService.addEmployee(employee),HttpStatus.OK);

	}
	
	
	@PutMapping("/{id}")
	private  ResponseEntity<Employee> updateEmployee(@PathVariable("id") Long id,@RequestBody Employee employee){
		return new ResponseEntity<Employee>(employeeService.updateEmployee(id,employee),HttpStatus.OK);

	}
	
	
	@DeleteMapping("/{id}")
	private  ResponseEntity<String> deleteEmployee(@PathVariable("id") Long id){
		employeeService.deleteEmployee(id);
		return new ResponseEntity<String>("Success",HttpStatus.OK);
	}
	

}

	
