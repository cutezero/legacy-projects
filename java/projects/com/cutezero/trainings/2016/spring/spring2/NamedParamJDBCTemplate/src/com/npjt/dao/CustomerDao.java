package com.npjt.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;

import com.npjt.bo.CustomerBo;

public class CustomerDao {

	private final String SQL_GET_CUSTOMER_BY_NAME="select cus_no, first_name, last_name, mobile, email from customers where first_name like :firstName and last_name like :lastName";
	private final String SQL_UPDATE_CUSTOMER_MOBILE_BY_CUSTOMER_NO="update customers set mobile= :mobile where cus_no = :customerNo";
	private final String SQL_SAVE_CUSTOMER="insert into customers(cus_no, first_name, last_name, mobile, email) values (:customerNo, :firstName, :lastName, :mobile, :emailAddress)";
	
	private DataSource dataSource;
	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	private SimpleJdbcInsert simpleJdbcInsert;
	private SimpleJdbcCall simpleJdbcCall; 
	
	public CustomerDao(DataSource dataSource) {
		this.dataSource = dataSource;
		namedParameterJdbcTemplate= new NamedParameterJdbcTemplate(dataSource);
		simpleJdbcInsert= new SimpleJdbcInsert(dataSource);
		simpleJdbcInsert.setTableName("customers"); 	//this simpleJdbcInsert works only for specific table
		
		simpleJdbcCall= new SimpleJdbcCall(dataSource);
	}
	
	public int updateCustomer(CustomerBo cBo){
		
		Map<String, Object> paramsMap= null;
		paramsMap= new HashMap<>();
		paramsMap.put("customerNo", cBo.getCustomerNo());
		paramsMap.put("mobile", cBo.getMobile());
		return  namedParameterJdbcTemplate.update(SQL_UPDATE_CUSTOMER_MOBILE_BY_CUSTOMER_NO, paramsMap);
	}
	
	public List<CustomerBo> getCustomerByName(String firstName, String lastName){
		MapSqlParameterSource parameterSource= new MapSqlParameterSource();
		parameterSource.addValue("firstName", firstName);
		parameterSource.addValue("lastName", lastName);
		return namedParameterJdbcTemplate.query(SQL_GET_CUSTOMER_BY_NAME, parameterSource, new CustomerRowMapper());
		
	}
	public void insertCustomer(CustomerBo cBo){
		BeanPropertySqlParameterSource parameterSource= new BeanPropertySqlParameterSource(cBo);
		namedParameterJdbcTemplate.update(SQL_SAVE_CUSTOMER, parameterSource);
		
	}
	public void saveCustomer(CustomerBo cBo){
		BeanPropertySqlParameterSource parameterSource= new BeanPropertySqlParameterSource(cBo);
		simpleJdbcInsert.execute(parameterSource);
		
	}
	
	public void callProcedure(){
		simpleJdbcCall.setProcedureName("select_count");
		Map<String, Object> result=simpleJdbcCall.execute(new Object[]{null});
		for (String key: result.keySet()){
			System.out.println(key+" : "+result.get(key));
		}
	}
	
	private final class CustomerRowMapper implements RowMapper<CustomerBo>{

		@Override
		public CustomerBo mapRow(ResultSet rs, int rowIndex) throws SQLException {
			CustomerBo cBo= new CustomerBo();
			cBo.setCustomerNo(rs.getInt(1));
			cBo.setFirstName(rs.getString(2));
			cBo.setLastName(rs.getString(3));
			cBo.setMobile(rs.getString(4));
			cBo.setEmailAddress(rs.getString(5));
			
			return cBo;
		}
		
	}
	
}
