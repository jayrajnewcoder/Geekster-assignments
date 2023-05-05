package com.Adresss.Adress.DAO;

import java.io.Serializable;

public class AdressDao implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Long id;
	
	private String adress;
	
	private String city;
	
	private String zipCode;

	public AdressDao(Long id, String adress, String city, String zipCode) {
		super();
		this.id = id;
		this.adress = adress;
		this.city = city;
		this.zipCode = zipCode;
	}

	public AdressDao() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	@Override
	public String toString() {
		return "AdressDao [id=" + id + ", adress=" + adress + ", city=" + city + ", zipCode=" + zipCode + "]";
	}
	
	

}
