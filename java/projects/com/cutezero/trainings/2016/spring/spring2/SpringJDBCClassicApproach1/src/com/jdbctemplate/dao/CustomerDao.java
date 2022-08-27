package com.jdbctemplate.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ConnectionCallback;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.StatementCallback;

import com.jdbctemplate.bo.CustomerBo;

public class CustomerDao {

	private JdbcTemplate jdbcTemplate;
	
	//global params for all inner classes
	String sqlQuery=null;
	ResultSet rs= null;
	List<CustomerBo> customers= null;
	CustomerBo customer= null;
	
	public CustomerDao(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public List<CustomerBo> getCustomers(String param){
		/**
		 * There are several type we can execute our queries with jdbcTemplate and 
		 * all the combinations we can see in execute() as overloaded method
		 */
		CustomerPreparedStatementCreator psc= new CustomerPreparedStatementCreator(param);	//#1.1
		CustomerPreparedStatementCallback action= new CustomerPreparedStatementCallback();	//#1.2
		return jdbcTemplate.execute(psc, action);											//#1

//		return jdbcTemplate.execute(new CustomerStatementCallback());	//#2
//		return jdbcTemplate.execute(new CustomerConnectionCallbck());	//#3
		
/*		sqlQuery="select * from customers";
		return jdbcTemplate.execute(sqlQuery, new CustomerPreparedStatementCallback());	//#4
*/		
/*		sqlQuery="create table dummy1 (col1 varchar(5), col2 varchar(5))";	//#5 see at Test.java
		jdbcTemplate.execute(sqlQuery);										
		return null;
*/	
		
	}
	
	//common result set extracting logic for every query executed in this class
	public List<CustomerBo> resultSetExtractor(ResultSet rs) throws SQLException{
		customers= new ArrayList<>();
		while (rs.next()){
			customer= new CustomerBo();
			customer.setCustomerNo(rs.getInt("CUS_NO"));
			customer.setFirstName(rs.getString("FIRST_NAME"));
			customer.setLastName(rs.getString("LAST_NAME"));
			customer.setMobile(rs.getString("MOBILE"));
			customer.setEmailAddress(rs.getString("EMAIL"));
			customers.add(customer);
		}
		return customers;
	}
	
	private final class CustomerPreparedStatementCreator implements PreparedStatementCreator{
		PreparedStatement pstmt= null;									//#1.1
		String param;
		
		public CustomerPreparedStatementCreator(String param) {
			super();
			this.param = param;
		}

		@Override
		public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
			sqlQuery="select * from customers where first_name like ?";
			pstmt= con.prepareStatement(sqlQuery);
			pstmt.setString(1, "%"+param+"%");
			return pstmt;
		}
	}
	private final class CustomerPreparedStatementCallback implements PreparedStatementCallback<List<CustomerBo>>{
		@Override
		public List<CustomerBo> doInPreparedStatement(PreparedStatement pstmt) throws SQLException, DataAccessException {
			rs=pstmt.executeQuery();												//#1.2
			//go to resultsetExtractor()
			return resultSetExtractor(rs);
		}
	}
	
	private final class CustomerStatementCallback implements StatementCallback<List<CustomerBo>>{

		@Override
		public List<CustomerBo> doInStatement(Statement stmt) throws SQLException, DataAccessException {
			sqlQuery= "select * from customers";							//#2
			rs=stmt.executeQuery(sqlQuery);
			//go to resultsetExtractor()
			return resultSetExtractor(rs);
		}
		
	}
	
	private final class CustomerConnectionCallbck implements ConnectionCallback<List<CustomerBo>>{

		@Override
		public List<CustomerBo> doInConnection(Connection con) throws SQLException, DataAccessException {
			Statement stmt=null;									//#3
			PreparedStatement pstmt=null;
			List<CustomerBo> customers= null;
			sqlQuery= "select * from customers";
			
			//for statement related queries
			stmt=con.createStatement();
			rs=stmt.executeQuery(sqlQuery);
			customers= new ArrayList<>();
			customers.addAll(resultSetExtractor(rs));

			//for pstmt related quries
			sqlQuery="select * from customers where first_name like ?";
			pstmt= con.prepareStatement(sqlQuery);
			pstmt.setString(1, "%"+"Sri"+"%");
			rs=pstmt.executeQuery();
			//go to resultsetExtractor()
			customers.addAll(resultSetExtractor(rs));
			
			//it will return 2 list merged into one list of customers
			return customers;
		}
	}
	
	
	
	
	
	
}
