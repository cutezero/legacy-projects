package com.cfn.dao;

import java.util.List;

import com.cfn.dto.Employee;

public interface EmpDao {
	void saveOrUpdateEmployee(Employee e);
	void deleteEmployee(int empId);
	List selectEmployees();
}
