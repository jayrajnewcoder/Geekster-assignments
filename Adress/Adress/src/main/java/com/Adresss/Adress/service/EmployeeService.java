package com.Adresss.Adress.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Adresss.Adress.DAO.EmployeeDao;
import com.Adresss.Adress.model.Employee;
import com.Adresss.Adress.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	public 	List<Employee> getAllEmployee(){
		return employeeRepository.findAll();
	}
	
	public Employee getEmployee(Long id) {
		return employeeRepository.findById(id).get();
	}
	
	public Employee addEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}
	
	public Employee updateEmployee(Long id,Employee employee) {
		Employee previousEmployee = employeeRepository.findById(id).get();
		previousEmployee.setAdress(employee.getAdress());
		previousEmployee.setFirstName(employee.getFirstName());
		previousEmployee.setLastName(employee.getLastName());
		return previousEmployee;
	}
	
	public void deleteEmployee(Long id) {
		 employeeRepository.deleteById(id);
	}
	

}
