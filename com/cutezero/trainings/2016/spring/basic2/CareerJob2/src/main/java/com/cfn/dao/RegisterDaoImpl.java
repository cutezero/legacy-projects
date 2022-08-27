package com.cfn.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.cfn.models.RegisterPerson;

@Repository
public class RegisterDaoImpl implements IRegisterDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public int register(RegisterPerson register) {
		String tableName="candidate";
		String UpdateSql="insert into "+tableName+"values("+register.getEmail()+","+register.getPassword();
		int result= jdbcTemplate.update(UpdateSql);		
		return result;
	}

}
