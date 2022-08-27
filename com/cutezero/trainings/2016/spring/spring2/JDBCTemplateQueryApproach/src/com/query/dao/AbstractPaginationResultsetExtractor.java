package com.query.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

public abstract class AbstractPaginationResultsetExtractor implements ResultSetExtractor<List<?>>{
	protected  int pageSize;
	protected int pageNo;

	public AbstractPaginationResultsetExtractor(int pageSize, int pageNo) {
		super();
		this.pageSize = pageSize;
		this.pageNo = pageNo;
	}

	@Override
	public List<?> extractData(ResultSet rs) throws SQLException, DataAccessException {
		int startIndex= 0;
		int endIndex= 0;
		List<Object> objects= null;
		startIndex=(pageSize*(pageNo-1))+1;
		endIndex= (startIndex+pageSize)-1;
		int rowIndex= 1;
		
		objects= new ArrayList<Object>();
		while(rs.next() && rowIndex<=endIndex){
			if(rowIndex>=startIndex && rowIndex<=endIndex){
				Object type=mapRow(rs);
				objects.add(type);
				System.out.println("abstract pagination");
			}
			rowIndex++;
		}
		return objects;
	}

	public abstract Object mapRow(ResultSet rs) throws SQLException;
	
}
