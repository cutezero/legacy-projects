package com.dt.dao;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import com.dt.bo.CompanyBo;

public class CompanyDao {

	private final String SQL_INSERT_COMPANY="insert into company(company_id, name, service_type, location) values(?, ?, ?, ?)";
	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public int saveCompany(CompanyBo companyBo){
		return jdbcTemplate.update(SQL_INSERT_COMPANY, companyBo.getCompanyId(), companyBo.getName(), companyBo.getServiceType(), companyBo.getLocation());
	}
}
