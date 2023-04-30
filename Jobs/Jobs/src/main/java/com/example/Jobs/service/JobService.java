package com.example.Jobs.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Jobs.Domain.Job;
import com.example.Jobs.dao.JobDao;
import com.example.Jobs.mapper.JobMapper;
import com.example.Jobs.repository.JobRepository;

@Service
public class JobService {
	
	@Autowired
	private JobRepository jobRepository;
	
	@Autowired
	private JobMapper jobMapper;
	
	
	private final String safeSpecialCharacter = "^[a-zA-Z0-9\\s\\-_\\.]*$";
	
	public JobDao getJob(Long id) {
		Job job =jobRepository.findById(id).get();
		return (jobMapper.toDto(job));
	}
	
	public Job addJob(Job job) {
		return jobRepository.save(job);
		
	}
	
	
	public Job updatedJob(Job job) {
		Optional<Job> jobOptional = jobRepository.findById(job.getId());
		if (jobOptional.isEmpty()) {
			return null;
		}
		Job updatedJob = jobOptional.get();
		
		updatedJob.setAppliedDate(job.getAppliedDate());
		updatedJob.setCompanyName(job.getCompanyName());
		updatedJob.setDescription(job.getDescription());
		updatedJob.setEmployeeName(job.getEmployeeName());
		updatedJob.setJobType(job.getJobType());
		updatedJob.setLocation(job.getLocation());
		updatedJob.setSalary(job.getSalary());
		updatedJob.setTittle(job.getTittle());
		return updatedJob;
		
	}
	
	public String deleteJob(Long id) {
		Optional<Job> jobOptional = Optional.of(jobRepository.findById(id).get());
		jobRepository.delete(jobOptional.get());
		return "SUCCESS";
	}

	
}
