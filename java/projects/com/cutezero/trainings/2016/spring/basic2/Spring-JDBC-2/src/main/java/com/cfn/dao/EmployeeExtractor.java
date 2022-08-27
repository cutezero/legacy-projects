package com.cfn.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;

import org.springframework.jdbc.core.ResultSetExtractor;

public class EmployeeExtractor implements ResultSetExtractor {
	public Object extractData(ResultSet rs) throws SQLException{
		Set set= new HashSet();
		int count=1;
		while(rs.next())
		{
			if (count==1||count==3||count==7)
			{
				Employee e= new Employee();
				e.setEmpNo(rs.getInt(1));
				e.setEmpName(rs.getString(2));
				e.setSal(rs.getInt(3));
				e.setDeptno(rs.getInt(4));
				set.add(e);
			}
			count++;
		}
		return set;
	}
}
