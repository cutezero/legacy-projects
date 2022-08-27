package com.cfn.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.cfn.service.User;

@SuppressWarnings("rawtypes")
public class UserMapper implements RowMapper{

	public Object mapRow(ResultSet rs, int index){
		User u= new User();
		try {
			u.setId(rs.getInt(1));
			u.setName(rs.getString(2));
		} catch (SQLException e) {
			System.out.println("Some problem occured internally");
			e.printStackTrace();
		}
		return u;
	}
}
