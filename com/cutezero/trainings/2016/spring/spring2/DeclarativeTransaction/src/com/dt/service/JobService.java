package com.dt.service;

import org.springframework.dao.DataAccessException;

import com.dt.bo.CompanyBo;
import com.dt.bo.JobBo;
import com.dt.commands.JobDetailsCommand;
import com.dt.dao.CompanyDao;
import com.dt.dao.JobDao;
import com.dt.exceptions.JobCompanyNotFoundException;

public class JobService {

	private JobDao jobDao;
	private CompanyDao companyDao;

	public void setJobDao(JobDao jobDao) {
		this.jobDao = jobDao;
	}

	public void setCompanyDao(CompanyDao companyDao) {
		this.companyDao = companyDao;
	}

	public void postJob(JobDetailsCommand jDCommand) throws JobCompanyNotFoundException {
		JobBo jobBo = null;
		CompanyBo companyBo = null;
		int result = 0;
		try {
			companyBo = new CompanyBo();
			companyBo.setCompanyId(jDCommand.getCompanyId());
			companyBo.setName(jDCommand.getCompanyName());
			companyBo.setServiceType(jDCommand.getCompanyServiceType());
			companyBo.setLocation(jDCommand.getCompanyLocation());
			result = companyDao.saveCompany(companyBo);
			System.out.println(result + " no of Company Inserted");

			jobBo = new JobBo();
			jobBo.setJobNo(jDCommand.getJobNo());
			jobBo.setTitle(jDCommand.getJobTitle());
			jobBo.setDescription(jDCommand.getJobDescription());
			jobBo.setQualification(jDCommand.getJobQualification());
			jobBo.setExperience(jDCommand.getJobExperience());
			// jobBo.setCompanyId(jDCommand.getCompanyId());
			jobBo.setCompanyId(567);

			result = jobDao.saveJob(jobBo);
			System.out.println(result + " no of Job Inserted");
		} catch (DataAccessException e) {
			throw new JobCompanyNotFoundException("The Parent company for this job is not found", e);
		}
	}
}
