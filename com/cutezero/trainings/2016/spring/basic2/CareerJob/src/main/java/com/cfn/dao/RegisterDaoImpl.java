package com.cfn.dao;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.cfn.models.RegisterPerson;

@Repository
public class RegisterDaoImpl implements IRegisterDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public void register(RegisterPerson register, HttpServletRequest request) {
		String tableName="candidate";
		
		String UpdateSql="insert into "+tableName+" values("+register.getEmail()+","+register.getPassword()+")";
		
		register= (RegisterPerson) request.getAttribute("register");
		
		jdbcTemplate.execute(UpdateSql);		
		
	}

}
