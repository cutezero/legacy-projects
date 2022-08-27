package com.cfn.spring.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class EmployeeMapper implements RowMapper {

	public Object mapRow(ResultSet arg0, int arg1) throws SQLException {
		Employee e=new Employee();
		e.setEmpno(arg0.getInt(1));
		e.setEname(arg0.getString(2));
		e.setSal(arg0.getInt(3));
		e.setDeptno(arg0.getInt(4));
		return e;
	}

	
}
