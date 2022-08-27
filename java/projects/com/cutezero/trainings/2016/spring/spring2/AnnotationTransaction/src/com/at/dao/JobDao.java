package com.at.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.at.bo.JobBo;

@Repository
public class JobDao {

	private final String SQL_INSERT_JOB="insert into job(job_no, title, description, qualification, experience, company_id) values(:jobNo, :title, :description, :qualification, :experience, :companyId) ";
	@Autowired
	private NamedParameterJdbcTemplate npJdbcTemplate;
	
	public int saveJob(JobBo jobBo){
		BeanPropertySqlParameterSource paramSource= null;
		paramSource= new BeanPropertySqlParameterSource(jobBo);
		return npJdbcTemplate.update(SQL_INSERT_JOB, paramSource);
	}
}
