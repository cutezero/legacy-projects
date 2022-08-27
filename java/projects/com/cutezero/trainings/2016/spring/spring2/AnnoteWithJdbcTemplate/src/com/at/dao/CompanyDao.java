package com.at.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.at.bo.CompanyBo;

@Repository
public class CompanyDao {

	private final String SQL_INSERT_COMPANY="insert into company(company_id, name, service_type, location) values(?,?,?,?)";

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public int saveCompany(CompanyBo companyBo){
		return jdbcTemplate.update(SQL_INSERT_COMPANY, companyBo.getCompanyId(), companyBo.getName(), companyBo.getServiceType(), companyBo.getLocation());
	}
}
