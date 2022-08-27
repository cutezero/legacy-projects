package com.at.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.at.commands.JobDetailsCommand;
import com.at.exceptions.JobPostFailedException;
import com.at.service.JobService;

@Controller
public class JobController {

	@Autowired
	private JobService jobService;
	
	public void setJobService(JobService jobService) {
		this.jobService = jobService;
	}

	public void execute(JobDetailsCommand jDCommand) throws JobPostFailedException{
		jobService.postJob(jDCommand);
	}
}
