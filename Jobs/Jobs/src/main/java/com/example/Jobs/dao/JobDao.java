package com.example.Jobs.dao;

import java.time.Instant;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.example.Jobs.enumaration.JobType;

public class JobDao {

	private Long id;

	private String tittle;

	private String description;

	private String location;

	private Double salary;

	private String companyName;

	private String employeeName;

	private JobType jobType;

	private Instant appliedDate;
	
	

	public JobDao() {
		super();
		// TODO Auto-generated constructor stub
	}



	public JobDao(Long id, String tittle, String description, String location, Double salary, String companyName,
			String employeeName, JobType jobType, Instant appliedDate) {
		super();
		this.id = id;
		this.tittle = tittle;
		this.description = description;
		this.location = location;
		this.salary = salary;
		this.companyName = companyName;
		this.employeeName = employeeName;
		this.jobType = jobType;
		this.appliedDate = appliedDate;
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTittle() {
		return tittle;
	}

	public void setTittle(String tittle) {
		this.tittle = tittle;
	}
	

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public JobType getJobType() {
		return jobType;
	}

	public void setJobType(JobType jobType) {
		this.jobType = jobType;
	}

	public Instant getAppliedDate() {
		return appliedDate;
	}

	public void setAppliedDate(Instant appliedDate) {
		this.appliedDate = appliedDate;
	}
	
}
