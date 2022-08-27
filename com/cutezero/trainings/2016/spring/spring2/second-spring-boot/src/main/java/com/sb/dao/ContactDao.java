package com.sb.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class ContactDao {

	private final String GET_QUERY_BY_MOBILE="select * from contacts c where mobile_no=?";
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public List<ContactBo> getContactsByMobile(){
		List<ContactBo> contact=jdbcTemplate.query(new PreparedStatementCreator() {
			
			@Override
			public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
				PreparedStatement statement= con.prepareStatement(GET_QUERY_BY_MOBILE);
				statement.setString(1, "8895749052");
				return statement;
			}
		}, new RowMapper<ContactBo>() {

			@Override
			public ContactBo mapRow(ResultSet rs, int rowNum) throws SQLException {
				ContactBo bo= new ContactBo();
				bo.setContactId(String.valueOf(rs.getInt(1)));
				bo.setContactName(rs.getString(2));
				bo.setMobile(rs.getString(3));
				bo.setEmailId(rs.getString(4));
				System.out.println(bo.getContactId());
				return bo;
			}
		});
		return contact;
	}
}
