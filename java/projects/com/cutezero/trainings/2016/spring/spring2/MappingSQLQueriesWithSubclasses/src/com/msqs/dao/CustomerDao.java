package com.msqs.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.MappingSqlQuery;
import org.springframework.jdbc.object.SqlUpdate;

import com.msqs.bo.CustomerBo;

public class CustomerDao {

	private final String SQL_GET_CUSTOMERS_BY_FIRST_NM= "select cus_no, first_name, last_name, mobile, email from customers where first_name like ?";
	private final String SQL_GET_CUSTOMERS_BY_MOBILE= "select cus_no, first_name, last_name, mobile, email from customers where mobile= ?";
	private final String SQL_UPDATE_CUSTOMER_BY_MOBILE= "UPDATE customers SET cus_no=?, first_name=?, last_name=?, email=? WHERE mobile= ?";
//	private final String SQL_UPDATE_CUSTOMER_BY_MOBILE= "UPDATE customers SET FIRST_NAME=?, MOBILE='8895749052', `EMAIL`='panigrahybadri@gmail.com' WHERE `CUS_NO`='16';";
//	private final String SQL_UPDATE_CUSTOMER_FIRST_NAME_BY_MOBILE= "update customers(cus_no, first_name, last_name, mobile, email) values (?,?,?,?,?) where mobile= ?";
	
	private DataSource dataSource;
	GetCustomersByFirstName customersByFirstName= null;
	public CustomerDao(DataSource dataSource) {
		super();
		this.dataSource = dataSource;
		customersByFirstName= new GetCustomersByFirstName(dataSource); 
	}
	
	public List<CustomerBo> getCustomersByFirstName(String firstName){		//#1
		return customersByFirstName.execute(new Object[]{firstName});
	}
	
	public CustomerBo findCustomerByMobileNo(String mobileNo){
		return new FindCustomerByMobile().findObject(mobileNo);
	}
	
	public int updateCustomerByMobileNo(CustomerBo customer){
		return new UpdateCustomerByMobile().update(new Object[]{customer.getCustomerNo(), customer.getFirstName(), customer.getLastName(), customer.getEmailAddress(), customer.getMobile()});
	}
	
	private final class GetCustomersByFirstName extends MappingSqlQuery<CustomerBo>{	//#1
		public GetCustomersByFirstName(DataSource dataSource) {
			super(dataSource, SQL_GET_CUSTOMERS_BY_FIRST_NM);
			super.declareParameter(new SqlParameter(Types.VARCHAR));
			compile();
		}
		@Override
		protected CustomerBo mapRow(ResultSet rs, int rowIndex) throws SQLException {
			CustomerBo customer= null;
//			if(rs.next()){	//Dont check the condition it will return an extra null as a result
				customer= new CustomerBo();
				customer.setCustomerNo(rs.getInt(1));
				customer.setFirstName(rs.getString(2));
				customer.setLastName(rs.getString(3));
				customer.setMobile(rs.getString(4));
				customer.setEmailAddress(rs.getString(5));
			return customer;
		}
		
	}
	
	private final class FindCustomerByMobile extends MappingSqlQuery<CustomerBo>{
		@Override
		protected CustomerBo mapRow(ResultSet rs, int rowIndex) throws SQLException {
			CustomerBo customer= null;
			customer= new CustomerBo();
			customer.setCustomerNo(rs.getInt(1));
			customer.setFirstName(rs.getString(2));
			customer.setLastName(rs.getString(3));
			customer.setMobile(rs.getString(4));
			customer.setEmailAddress(rs.getString(5));
			return customer;
		}

		public FindCustomerByMobile() {
			super(dataSource, SQL_GET_CUSTOMERS_BY_MOBILE);
			SqlParameter mobile= new SqlParameter(Types.VARCHAR);
			super.declareParameter(mobile);
			compile();
		}
	}
	private final class UpdateCustomerByMobile extends SqlUpdate{
		public UpdateCustomerByMobile() {
			super(dataSource, SQL_UPDATE_CUSTOMER_BY_MOBILE);
			SqlParameter customerNo= new SqlParameter(Types.INTEGER);
			SqlParameter firstName= new SqlParameter(Types.VARCHAR);
			SqlParameter lastName= new SqlParameter(Types.VARCHAR);
			SqlParameter emailAddress= new SqlParameter(Types.VARCHAR);
			SqlParameter mobile= new SqlParameter(Types.VARCHAR);
			super.declareParameter(customerNo);;
			super.declareParameter(firstName);;
			super.declareParameter(lastName);;
			super.declareParameter(emailAddress);;
			super.declareParameter(mobile);;
			compile();
		}
	}
}
