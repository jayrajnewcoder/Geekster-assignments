package com.example.Jobs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.Jobs.Domain.Job;
import com.example.Jobs.dao.JobDao;
import com.example.Jobs.service.JobService;

@RestController
@RequestMapping("/api")
public class JobController {

	@Autowired
	private JobService jobService;
	
	@PostMapping("/addJob")
	private ResponseEntity<Job> addJob(@RequestBody Job job){
		Job addedJob = jobService.addJob(job);
		return new ResponseEntity<>(addedJob,HttpStatus.OK);
	}
	
	@GetMapping(path = "/addJob")
	private JobDao getJob(@PathVariable("id") Long id) {
		return jobService.getJob(id); 
	}
	
	@PutMapping("/updateJob")
	private ResponseEntity<Job> updateJob(@RequestBody Job job){
		Job job2 = jobService.updatedJob(job);
		return new ResponseEntity<>(job2,HttpStatus.OK);
		
	}
	
	@DeleteMapping("/deleteJob")
	private String deleteJob(@PathVariable("id") Long id){
		return jobService.deleteJob(id);
	}
	
	
	
	
}
