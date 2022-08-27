package com.cfn.dao;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
@Repository("dao")
public class EmpDaoImpl implements EmpDao {
	@Autowired
	private JdbcTemplate jt;
	
	public int updateEmp(int empid, int sal) {
		int i=jt.update("update emp set sal=? where empno=?", sal,empid);
		return i;
	}

	public Map findEmpById(int empid) {
		Map m=jt.queryForMap("select * from emp where empno=?", empid);
		return m;
	}

	public List findAllEmps() {
		List list=jt.queryForList("select * from emp");
		return list;
	}

}
