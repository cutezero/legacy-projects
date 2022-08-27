package com.dt.controller;

import com.dt.commands.JobDetailsCommand;
import com.dt.exceptions.JobCompanyNotFoundException;
import com.dt.service.JobService;

public class JobController {

	private JobService jobService;
	
	public void setJobService(JobService jobService) {
		this.jobService = jobService;
	}

	public void execute(JobDetailsCommand jDCommand) throws JobCompanyNotFoundException{
		jobService.postJob(jDCommand);
	}
}
