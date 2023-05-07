package com.Adresss.Adress.model;

import javax.annotation.Generated;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ADRESS")
public class Adress {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column(name = "NAME")
	private String name;
	
	@Column(name = "LANDMARK")
	private String landmark;
	
	@Column(name = "PHONE_NUMBER")
	private String phoneNumber;
	
	@Column(name = "ZIP_CODE")
	private String zipCode;
	
	@Column(name = "STATE")
	private String state;
	
	@OneToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinColumn(name = "fk_user_id")
	private User user;

	public Adress() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Adress(Integer id, String name, String landmark, String phoneNumber, String zipCode, String state,
			User user) {
		super();
		this.id = id;
		this.name = name;
		this.landmark = landmark;
		this.phoneNumber = phoneNumber;
		this.zipCode = zipCode;
		this.state = state;
		this.user = user;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLandmark() {
		return landmark;
	}

	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Adress [id=" + id + ", name=" + name + ", landmark=" + landmark + ", phoneNumber=" + phoneNumber
				+ ", zipCode=" + zipCode + ", state=" + state + ", user=" + user + "]";
	}
	
	

}
