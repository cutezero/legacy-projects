package com.query.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.query.bo.CustomerBo;
import com.query.bo.CustomerJobSheetBo;
import com.query.bo.JobSheetBo;

public class CustomerDaoOptimized extends CustomerDao {

	public CustomerDaoOptimized(JdbcTemplate jdbcTemplate) {
		super(jdbcTemplate);
		// TODO Auto-generated constructor stub
	}

	public List<CustomerJobSheetBo> getCustomersWithJobsheets() {
		return jdbcTemplate.query(SQL_GET_CUSTOMERS_WITH_JOBSHEETS, new CustomerWithJobSheetResultSetExtractor());
	}

	private final class CustomerWithJobSheetResultSetExtractor implements ResultSetExtractor<List<CustomerJobSheetBo>> {

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
				bo = new CustomerJobSheetBo();
				jobSheets = new ArrayList<>();
				if (customersMap.containsKey(customerNo) == false) {
					customerBo = new CustomerBo();
					customerBo.setCustomerNo(rs.getInt(1));
					customerBo.setFirstName(rs.getString(2));
					customerBo.setLastName(rs.getString(3));
					customerBo.setMobileNo(rs.getString(4));
					customerBo.setEmailAddress(rs.getString(5));

					bo.setCustomerBo(customerBo);
				} else { // still we can avoid the else block
					bo = customersMap.get(customerNo);
					jobSheets = bo.getJobSheets();
				}
				
				jobSheetBo = new JobSheetBo();
				jobSheetBo.setJobSheetNo(rs.getInt(6));
				jobSheetBo.setJobSheetType(rs.getString(7));
				jobSheetBo.setOpenedDate(rs.getDate(8));
				jobSheetBo.setPetrolLevel(rs.getInt(9));
				jobSheetBo.setKilometer(rs.getInt(10));
				jobSheetBo.setEngineNo(rs.getString(11));
				jobSheets.add(jobSheetBo);

				bo.setJobSheets(jobSheets);
				customersMap.put(customerNo, bo);
			}
			Set<Integer> keys = customersMap.keySet();
			customersWithJobsheets = new ArrayList<>();
			for (int key : keys) {
				customersWithJobsheets.add(customersMap.get(key));
			}

			return customersWithJobsheets;
		}// end of extractData

	}// end of CustomerWithJobSheetResultSetExtractor

}
