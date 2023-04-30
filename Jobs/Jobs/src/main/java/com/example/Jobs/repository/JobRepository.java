package com.example.Jobs.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.example.Jobs.Domain.Job;
import com.example.Jobs.enumaration.JobType;

public interface JobRepository extends CrudRepository<Job, Long>{
	
	Optional<Job> findByIdAndCompanyNameAndEmployeeNameAndJobType(Long id,String companyName,String employeeName,JobType job);

}
