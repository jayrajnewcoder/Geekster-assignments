package com.example.Jobs.Domain;

import java.time.Instant;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Pattern;

import com.example.Jobs.enumaration.JobType;

@Entity
public class Job {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name ="JOB_ID")
	private Long id;
	
	@Column(name ="TITTLE")	
	@Pattern(regexp = "^[a-zA-Z0-9\\s\\-_\\.]*$")
	private String tittle;
	
	@Column(name ="DESCRIPTION")
	@Pattern(regexp = "^[a-zA-Z0-9\\s\\-_\\.]*$")
	private String description;
	
	@Column(name ="LOCATION")
	@Pattern(regexp = "^[a-zA-Z0-9\\s,.-]+$")
	private String location;
	
	@Column(name ="SALARY")
	@Pattern(regexp = "^[0-9]+$")
	private Double salary;

	@Column(name ="COMPANY_NAME")
	@Pattern(regexp = "^[a-zA-Z0-9\\s\\-_\\.]*$")
	private String companyName;
	
	@Column(name ="EMPLOYEE_NAME")
	@Pattern(regexp = "^[a-zA-Z0-9\\s\\-_\\.]*$")
	private String employeeName;
	
	@Column(name ="JOB_TPYE")
	@Enumerated(EnumType.STRING)
	private JobType jobType;
	
	@Column(name ="APPLIED_DATE")
	@Pattern(regexp = "^[-+]?[0-9]+(\\\\.[0-9]{1,9})?([Ee][-+]?[0-9]+)?[sS]*$")
	private Instant appliedDate;

	public Job() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Job(Long id, String tittle, String description, String location, Double salary, String companyName,
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

	@Override
	public String toString() {
		return "Job [id=" + id + ", tittle=" + tittle + ", description=" + description + ", location=" + location
				+ ", salary=" + salary + ", companyName=" + companyName + ", employeeName=" + employeeName
				+ ", jobType=" + jobType + ", appliedDate=" + appliedDate + "]";
	}
	
	
}
