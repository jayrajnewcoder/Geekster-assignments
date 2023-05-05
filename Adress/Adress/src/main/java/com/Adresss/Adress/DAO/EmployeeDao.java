package com.Adresss.Adress.DAO;

import java.io.Serializable;

import org.springframework.boot.autoconfigure.security.ConditionalOnDefaultWebSecurity;

import com.Adresss.Adress.model.Adress;

public class EmployeeDao implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Long id;
	
	private String firstName;
	
	private String lastName;
	
	private Adress adress;

	public EmployeeDao() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EmployeeDao(Long id, String firstName, String lastName, Adress adress) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.adress = adress;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Adress getAdress() {
		return adress;
	}

	public void setAdress(Adress adress) {
		this.adress = adress;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "EmployeeDao [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", adress=" + adress
				+ "]";
	}
	
	

}
