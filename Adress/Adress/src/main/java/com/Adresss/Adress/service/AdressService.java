package com.Adresss.Adress.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Adresss.Adress.model.Adress;
import com.Adresss.Adress.model.Employee;
import com.Adresss.Adress.repository.AdressRepository;
import com.Adresss.Adress.repository.EmployeeRepository;

@Service
public class AdressService {

	
	@Autowired
	private AdressRepository adressRepository;
	
	public 	List<Adress> getAllAdress(){
		return adressRepository.findAll();
	}
	
	public Adress getAdress(Long id) {
		return adressRepository.findById(id).get();
	}
	
	public Adress addEmployee(Adress adress) {
		return adressRepository.save(adress);
	}
	
	public Adress updateEmployee(Long id,Adress adress) {
		Adress previousAdress = adressRepository.findById(id).get();
		previousAdress.setCity(adress.getCity());
		previousAdress.setState(adress.getState());
		previousAdress.setZipCode(adress.getZipCode());
		return previousAdress;
	}
	
	public void deleteEmployee(Long id) {
		 adressRepository.deleteById(id);
	}
}
