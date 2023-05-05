package com.Adresss.Adress.model;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "EMPLOYEE")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name = "")
	private String firstName;

	@Column(name = "")
	private String lastName;
	
	@Column(name="ADRESS_ID")
	@OneToOne
	private Employee adress;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(Long id, String firstName, String lastName, Employee adress) {
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

	public Employee getAdress() {
		return adress;
	}

	public void setAdress(Employee adress) {
		this.adress = adress;
	}

	@Override
	public String toString() {
		return "Adress [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", adress=" + adress + "]";
	}
	
	

}
