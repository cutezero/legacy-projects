package com.cfn.hibernate.dao;

public interface EmployeeDao {
	void findAllEmps();
	void findEmpsByDeptno( int deptno);
	void updateEmpsByDeptno(int deptno);
}
