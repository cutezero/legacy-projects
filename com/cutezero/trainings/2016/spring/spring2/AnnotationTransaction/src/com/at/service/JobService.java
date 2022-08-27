package com.at.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.at.bo.CompanyBo;
import com.at.bo.JobBo;
import com.at.commands.JobDetailsCommand;
import com.at.dao.CompanyDao;
import com.at.dao.JobDao;
import com.at.exceptions.JobPostFailedException;

@Service
public class JobService {

	@Autowired
	private JobDao jobDao;
	@Autowired
	private CompanyDao companyDao;

	/**
	 * Transactional Aspects rolls-back only uncheckedException(RuntimeException)
	 * It doesn't rolls back any transaction for CheckedException
	 * To make it roll-back for CheckedExceptions We neet to provide the 
	 * "rollbackFor" attribute for each transactional annotation
	 * @param jDCommand
	 * @throws JobPostFailedException
	 */
	@Transactional(readOnly=false, rollbackFor=com.at.exceptions.JobPostFailedException.class)
	public void postJob(JobDetailsCommand jDCommand) throws JobPostFailedException{
		JobBo jobBo= null;
		CompanyBo companyBo= null;
		int result=0;

		try{
		companyBo= new CompanyBo();
		companyBo.setCompanyId(jDCommand.getCompanyId());
		companyBo.setName(jDCommand.getCompanyName());
		companyBo.setServiceType(jDCommand.getCompanyServiceType());
		companyBo.setLocation(jDCommand.getCompanyLocation());
		result=companyDao.saveCompany(companyBo);
		System.out.println(result+" no of Company Inserted");
		
		jobBo= new JobBo();
		jobBo.setJobNo(jDCommand.getJobNo());
		jobBo.setTitle(jDCommand.getJobTitle());
		jobBo.setDescription(jDCommand.getJobDescription());
		jobBo.setQualification(jDCommand.getJobQualification());
		jobBo.setExperience(jDCommand.getJobExperience());
		jobBo.setCompanyId(jDCommand.getCompanyId());
//		jobBo.setCompanyId(568);
		
		result=jobDao.saveJob(jobBo);
		System.out.println(result+" no of Job Inserted");
		}catch (DataAccessException e) {
			throw new JobPostFailedException("Your Job can't be posted", e);
		}
	}
}
