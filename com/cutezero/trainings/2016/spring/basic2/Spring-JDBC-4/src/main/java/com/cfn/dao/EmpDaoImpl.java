package com.cfn.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;
@Repository
public class EmpDaoImpl implements EmpDao {
	@Autowired
	private NamedParameterJdbcTemplate npjt;
	
	public int updateEmp(int empno, int sal) {
		Map<String, Integer> map=new HashMap<String, Integer>();
		map.put("p1", sal);
		map.put("p2", empno);
		int k=npjt.update("update emp set sal= :p1 where empno=:p2", map);
		return k;
	}

	public List findEmps(int deptno) {
		Map<String, Object> m=new HashMap<String, Object>();
		m.put("dno", deptno);
		List list=npjt.queryForList("select * from emp where deptno=:dno", m);
		return list;
	}

}
