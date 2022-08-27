package com.dt.dao;

import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import com.dt.bo.CompanyBo;

public class CompanyDao {

	private final String SQL_INSERT_COMPANY="insert into company(company_id, name, service_type, location) values(:companyId, :name, :serviceType, :location)";
	private NamedParameterJdbcTemplate npJdbcTemplate;

	public void setNpJdbcTemplate(NamedParameterJdbcTemplate npJdbcTemplate) {
		this.npJdbcTemplate = npJdbcTemplate;
	}
	
	public int saveCompany(CompanyBo companyBo){
		BeanPropertySqlParameterSource paramSource= null;
		paramSource= new BeanPropertySqlParameterSource(companyBo);
		return npJdbcTemplate.update(SQL_INSERT_COMPANY, paramSource);
	}
}
