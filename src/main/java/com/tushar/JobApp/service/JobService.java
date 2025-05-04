package com.tushar.JobApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tushar.JobApp.model.JobPost;
import com.tushar.JobApp.repo.JobRepo;

@Service
public class JobService {

	@Autowired
	private JobRepo repo;
	
	public void addJob(JobPost jobpost) {
		repo.addJob(jobpost);
	}
	
	public List<JobPost>getAllJobs(){
		return repo.getAllJobs();
	}
}
