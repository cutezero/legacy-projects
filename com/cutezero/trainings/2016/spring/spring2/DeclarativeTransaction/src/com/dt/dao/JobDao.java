package com.dt.dao;

import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import com.dt.bo.JobBo;

public class JobDao {

	private final String SQL_INSERT_JOB="insert into job(job_no, title, description, qualification, experience, company_id) values(:jobNo, :title, :description, :qualification, :experience, :companyId) ";
	private NamedParameterJdbcTemplate npJdbcTemplate;

	public void setNpJdbcTemplate(NamedParameterJdbcTemplate npJdbcTemplate) {
		this.npJdbcTemplate = npJdbcTemplate;
	}
	
	public int saveJob(JobBo jobBo){
		BeanPropertySqlParameterSource paramSource= null;
		paramSource= new BeanPropertySqlParameterSource(jobBo);
		return npJdbcTemplate.update(SQL_INSERT_JOB, paramSource);
	}
}
