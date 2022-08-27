package com.cfn.dao;

import java.util.List;

public interface EmpDao {
	int updateEmp(int empno, int sal);
	List findEmps(int deptno);
}
