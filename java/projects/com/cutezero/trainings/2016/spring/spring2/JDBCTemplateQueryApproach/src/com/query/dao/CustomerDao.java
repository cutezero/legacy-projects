package com.query.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;

import com.query.bo.CustomerBo;
import com.query.bo.CustomerJobSheetBo;
import com.query.bo.JobSheetBo;

public class CustomerDao {

	private final String SQL_GET_NO_OF_CUSTOMER = "select count(1) from customers";	
	private final String SQL_FIND_CUSTOMER_FIRSTNAME_BY_MOBILE = "select first_name from customers where mobile= ?";
	private final String SQL_FIND_CUSTOMER_BY_CUSTOMERNO_PK = "select cus_no, first_name, last_name, mobile, email from customers where cus_no= ?";
	private final String SQL_GET_ALL_CUSTOMERS= "select cus_no, first_name, last_name, mobile, email from customers ";
	
	protected final String SQL_GET_CUSTOMERS_WITH_JOBSHEETS = "select c.cus_no, c.first_name, c.last_name, c.mobile, c.email, js.job_sheet_no, js.job_sheet_type, js.opened_date, js.petrol_level, js.kilometer, js.engine_no from customers c inner join job_sheet js on c.cus_no= js.fk_cus_js;";
	protected final String SQL_GET_ALL_JOBSHEET_BY_PAGINATION = "select js.job_sheet_no, js.job_sheet_type, js.opened_date, js.petrol_level, js.kilometer, js.engine_no from job_sheet js ORDER BY js.opened_date DESC";

	private final String SQL_SAVE_CUSTOMER="insert into customers(cus_no, first_name, last_name, mobile, email) values(?,?,?,?,?)";
	private final String SQL_AUTOGEN_PK_SAVE_CUSTOMER="insert into customers(first_name, last_name, mobile, email) values(?,?,?,?)";
	protected JdbcTemplate jdbcTemplate;

	public CustomerDao(JdbcTemplate jdbcTemplate) {
		super();
		this.jdbcTemplate = jdbcTemplate;
	}

	//premitive(only int) single value result
	public int getNoOfCustomer() {						//#1
//		 Deprecated in later versions(after spring-3.3)
		int count = jdbcTemplate.queryForInt(SQL_GET_NO_OF_CUSTOMER); 
		return count;
	}

	// premitive and single value result output from resultset
	public String findCustomerFirstName(String mobile) { 		//#2
		return jdbcTemplate.queryForObject(SQL_FIND_CUSTOMER_FIRSTNAME_BY_MOBILE, String.class,
				new Object[] { mobile });
	}

	// Userdefined calss type and single record result output from resultset
	public CustomerBo findCustomerByNo(int customerNo) {		//#3
		return jdbcTemplate.queryForObject(SQL_FIND_CUSTOMER_BY_CUSTOMERNO_PK, new CustomerRowMapper(),
				new Object[] { customerNo });
	}
	public List<CustomerBo> getAllCustomers() {					//#4
		return jdbcTemplate.query(SQL_GET_ALL_CUSTOMERS, new CustomerRowMapper());
	}
	
	public List<CustomerJobSheetBo> getCustomersWithJobsheets(){			//#5
		return jdbcTemplate.query(SQL_GET_CUSTOMERS_WITH_JOBSHEETS, new CustomerWithJobSheetResultSetExtractor());
	}

	@SuppressWarnings("unchecked")
	public List<JobSheetBo> getAllJobsheets(int recordsPerPage, int pageNo) {	//#6
		//go to implementation CustomerPagination.java 
		return (List<JobSheetBo>) jdbcTemplate.query(SQL_GET_ALL_JOBSHEET_BY_PAGINATION, new JobSheetPaginationExtractor(recordsPerPage, pageNo));
	}
	
	public int saveCustomer(CustomerBo customerBo){					//#7
		return jdbcTemplate.update(SQL_SAVE_CUSTOMER, new Object[]{customerBo.getCustomerNo(), 
				customerBo.getFirstName(), customerBo.getLastName(), customerBo.getMobileNo(), customerBo.getEmailAddress()
				});
	}
	public long autoGenSaveCustomer(CustomerBo customerBo){			//#8
		GeneratedKeyHolder generatedKeys= new GeneratedKeyHolder();
		jdbcTemplate.update( new PreparedStatementCreator(){
			@Override
			public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
				PreparedStatement pstmt= null;
				pstmt= con.prepareStatement(SQL_AUTOGEN_PK_SAVE_CUSTOMER, new String[]{"CUS_NO"});
				pstmt.setString(1, customerBo.getFirstName());
				pstmt.setString(2, customerBo.getLastName());
				pstmt.setString(3, customerBo.getMobileNo());
				pstmt.setString(4, customerBo.getEmailAddress());
				return pstmt;
			}
			
		}, generatedKeys);
		
/*		System.out.println(generatedKeys.getKeyList());
		System.out.println(generatedKeys.getKeys());
*/
		long key=(long) generatedKeys.getKey();
		return key;
		
	}
	private final class CustomerRowMapper implements RowMapper<CustomerBo> {		//#3 && #4

		@Override
		public CustomerBo mapRow(ResultSet rs, int rowIndex) throws SQLException {
			CustomerBo customerBo = null;
			customerBo = new CustomerBo();
			// if(rs.next()){ 
			//Dont check condition it will not work for required program flow
			customerBo.setCustomerNo(rs.getInt(1));
			customerBo.setFirstName(rs.getString(2));
			customerBo.setLastName(rs.getString(3));
			customerBo.setMobileNo(rs.getString(4));
			customerBo.setEmailAddress(rs.getString(5));

			//iteration will be done by JDBCTemplate
			return customerBo;
		}
	}

	private final class CustomerWithJobSheetResultSetExtractor implements ResultSetExtractor<List<CustomerJobSheetBo>> {	//#5
		
		@Override
		public List<CustomerJobSheetBo> extractData(ResultSet rs) throws SQLException, DataAccessException {
			CustomerBo customerBo = null;
			JobSheetBo jobSheetBo = null;
			CustomerJobSheetBo bo = null;
			Map<Integer, CustomerJobSheetBo> customersMap = null;
			int customerNo;
			List<JobSheetBo> jobSheets = null;
			List<CustomerJobSheetBo> customersWithJobsheets = null;
			customersMap = new HashMap<>();
			while (rs.next()) {
				customerNo = rs.getInt(1);
				if (customersMap.containsKey(customerNo)==false) {
					customerBo = new CustomerBo();
					customerBo.setCustomerNo(rs.getInt(1));
					customerBo.setFirstName(rs.getString(2));
					customerBo.setLastName(rs.getString(3));
					customerBo.setMobileNo(rs.getString(4));
					customerBo.setEmailAddress(rs.getString(5));

					jobSheetBo = new JobSheetBo();
					jobSheetBo.setJobSheetNo(rs.getInt(6));
					jobSheetBo.setJobSheetType(rs.getString(7));
					jobSheetBo.setOpenedDate(rs.getDate(8));
					jobSheetBo.setPetrolLevel(rs.getInt(9));
					jobSheetBo.setKilometer(rs.getInt(10));
					jobSheetBo.setEngineNo(rs.getString(11));

					jobSheets = new ArrayList<>();
					jobSheets.add(jobSheetBo);

					bo = new CustomerJobSheetBo();
					bo.setCustomerBo(customerBo);
					bo.setJobSheets(jobSheets);
				} else {
					jobSheetBo = new JobSheetBo();
					jobSheetBo.setJobSheetNo(rs.getInt(6));
					jobSheetBo.setJobSheetType(rs.getString(7));
					jobSheetBo.setOpenedDate(rs.getDate(8));
					jobSheetBo.setPetrolLevel(rs.getInt(9));
					jobSheetBo.setKilometer(rs.getInt(10));
					jobSheetBo.setEngineNo(rs.getString(11));

					bo = customersMap.get(customerNo);
					jobSheets = bo.getJobSheets();
					jobSheets.add(jobSheetBo);
				}
				customersMap.put(customerNo, bo);
			}
			Set<Integer> keys = customersMap.keySet();
			customersWithJobsheets = new ArrayList<>();
			for (int key : keys) {
				customersWithJobsheets.add(customersMap.get(key));
			}

			return customersWithJobsheets;
		}// end of extractData

	}//end of CustomerWithJobSheetResultSetExtractor
	
	
	private final class JobSheetPaginationExtractor extends AbstractPaginationResultsetExtractor{
		public JobSheetPaginationExtractor(int pageSize, int pageNo) {			//#6
			super(pageSize, pageNo);
			// TODO Auto-generated constructor stub
		}

		JobSheetBo jobSheetBo= null;
		
		@Override
		public Object mapRow(ResultSet rs) throws SQLException {
			jobSheetBo = new JobSheetBo();
			jobSheetBo.setJobSheetNo(rs.getInt(1));
			jobSheetBo.setJobSheetType(rs.getString(2));
			jobSheetBo.setOpenedDate(rs.getDate(3));
			jobSheetBo.setPetrolLevel(rs.getInt(4));
			jobSheetBo.setKilometer(rs.getInt(5));
			jobSheetBo.setEngineNo(rs.getString(6));
			
			return jobSheetBo;
		}
	}
	
/*	private final class AutoGenCustomerCreator implements PreparedStatementCreator{

		@Override
		public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
			PreparedStatement pstmt= null;
			pstmt.executeUpdate(SQL_AUTOGEN_PK_SAVE_CUSTOMER, new String[]{"CUS_NO"});
			pstmt.setString(1, x);
			return null;
		}
		
	}*/

}//end of CustomerDao
