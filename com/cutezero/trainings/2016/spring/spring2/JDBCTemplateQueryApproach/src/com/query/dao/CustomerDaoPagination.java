package com.query.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.query.bo.JobSheetBo;

public class CustomerDaoPagination extends CustomerDao {

	

	public CustomerDaoPagination(JdbcTemplate jdbcTemplate) {
		super(jdbcTemplate);
		// TODO Auto-generated constructor stub
	}

	public List<JobSheetBo> getAllJobsheets(int recordsPerPage, int pageNo) {
		return jdbcTemplate.query(SQL_GET_ALL_JOBSHEET_BY_PAGINATION,
				new JobsheetPaginationExtractor(recordsPerPage, pageNo));
	}

	/**
	 * The generic type depends on the programmer whether he wants a list to be
	 * returned or a single object he wants
	 * 
	 * @author Srikanta.ydon
	 *
	 */
	private final class JobsheetPaginationExtractor implements ResultSetExtractor<List<JobSheetBo>> {
		// This class is not optimized one, Use abstract pagination to avoid duplicate code(watch CustomerDao inner class which implements from AbstractPagination) 
		
		private int recordsPerPage;
		private int pageNo;

		public JobsheetPaginationExtractor(int recordsPerPage, int pageNo) {
			super();
			this.recordsPerPage = recordsPerPage;	//or simply called pageSize 
			this.pageNo = pageNo;
		}

		@Override
		public List<JobSheetBo> extractData(ResultSet rs) throws SQLException, DataAccessException {
			JobSheetBo jobSheet = null;
			List<JobSheetBo> jobSheets= null;
			int rowIndex = 1;	//or rs.getRow() both same
			int startIndex = 0;
			int endIndex = 0;
			startIndex= (recordsPerPage*(pageNo-1))+1;
			endIndex= startIndex+(recordsPerPage-1);
			jobSheets= new ArrayList<>();
			while (rs.next() && rowIndex<=endIndex) {
				if (rowIndex >= startIndex && rowIndex <= endIndex) {
					jobSheet = new JobSheetBo();
					jobSheet.setJobSheetNo(rs.getInt(1));
					jobSheet.setJobSheetType(rs.getString(2));
					jobSheet.setOpenedDate(rs.getDate(3));
					jobSheet.setPetrolLevel(rs.getInt(4));
					jobSheet.setKilometer(rs.getInt(5));
					jobSheet.setEngineNo(rs.getString(6));
//					System.out.println("RS ROW Index : "+rs.getRow() );
					jobSheets.add(jobSheet);
				}
				rowIndex++;
				
			}
			return jobSheets;
		}

	}
}
