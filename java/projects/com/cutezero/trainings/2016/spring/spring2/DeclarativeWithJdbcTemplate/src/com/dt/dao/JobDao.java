package com.dt.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.dt.bo.JobBo;

public class JobDao {

	private final String SQL_INSERT_JOB="insert into job(job_no, title, description, qualification, experience, company_id) values(?, ?, ?, ?, ?, ?) ";
	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public int saveJob(JobBo jobBo){
		return jdbcTemplate.update(SQL_INSERT_JOB, jobBo.getJobNo(), jobBo.getTitle(), jobBo.getDescription(), jobBo.getQualification(), jobBo.getExperience(), jobBo.getCompanyId());
	}
}
