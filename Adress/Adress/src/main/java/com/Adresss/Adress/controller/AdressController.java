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
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.Adresss.Adress.DAO.AdressDao;
import com.Adresss.Adress.DAO.EmployeeDao;
import com.Adresss.Adress.model.Adress;
import com.Adresss.Adress.model.Employee;
import com.Adresss.Adress.repository.AdressRepository;
import com.Adresss.Adress.service.AdressService;

@RestController
@RequestMapping("/adress")
public class AdressController {
	
	
	@Autowired
	private AdressService adressService;
	
	@GetMapping
	private ResponseEntity<List<Adress>> getAllAdress(){
		return new ResponseEntity<List<Adress>>(adressService.getAllAdress(),HttpStatus.OK);

	}
	
	@GetMapping("/{id}")
	private ResponseEntity<Adress> getAdress(@PathVariable("id") Long id){
		return new ResponseEntity<Adress>(adressService.getAdress(id),HttpStatus.OK);

	}
	
	@PostMapping
	private ResponseEntity<Adress> addAdress(@RequestBody Adress adress){
		return new ResponseEntity<Adress>(adressService.addEmployee(adress),HttpStatus.OK);

	}
	
	
	@PutMapping("/{id}")
	private  ResponseEntity<Adress> updateAdress(@PathVariable("id") Long id,@RequestBody Adress adress){
		return new ResponseEntity<Adress>(adressService.updateEmployee(id, adress),HttpStatus.OK);
	}
	
	
	@DeleteMapping("/{id}")
	private  ResponseEntity<String> deleteAdress(@PathVariable("id") Long id){
		adressService.deleteEmployee(id);
		return new ResponseEntity<String>("Success",HttpStatus.OK);
	}
	

}
