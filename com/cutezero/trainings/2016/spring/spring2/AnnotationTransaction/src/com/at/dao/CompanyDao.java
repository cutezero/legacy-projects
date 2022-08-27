package com.at.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.at.bo.CompanyBo;

@Repository
public class CompanyDao {

	private final String SQL_INSERT_COMPANY="insert into company(company_id, name, service_type, location) values(:companyId, :name, :serviceType, :location)";

	@Autowired
	private NamedParameterJdbcTemplate npJdbcTemplate;
	
	public int saveCompany(CompanyBo companyBo){
		BeanPropertySqlParameterSource paramSource= null;
		paramSource= new BeanPropertySqlParameterSource(companyBo);
		return npJdbcTemplate.update(SQL_INSERT_COMPANY, paramSource);
	}
}
