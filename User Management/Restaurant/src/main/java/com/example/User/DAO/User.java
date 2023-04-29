package com.example.User.DAO;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;

@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long userId;
	
	@Pattern(regexp = "^[a-zA-Z]+$" ,message = "Invalid User Name")
	private String userName;
	
	@Pattern(regexp = "^\\d{4}-\\d{2}-\\d{2}$",message = "Invalid Date of Birth")
	private String dateOfBirth;
	
	@Email
	private String email;
	
	@Length(max = 12) 
	@Pattern(regexp = "^91\\d{10}$", message = "Invalid phone number")
	private String phoneNumber;
	
	private String date;
	
	private String time;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(Long userId, String userName, String dateOfBirth, String email, String phoneNumber, String date,
			String time) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.dateOfBirth = dateOfBirth;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.date = date;
		this.time = time;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", dateOfBirth=" + dateOfBirth + ", email=" + email
				+ ", phoneNumber=" + phoneNumber + ", date=" + date + ", time=" + time + "]";
	}
	
	
	
	
}
