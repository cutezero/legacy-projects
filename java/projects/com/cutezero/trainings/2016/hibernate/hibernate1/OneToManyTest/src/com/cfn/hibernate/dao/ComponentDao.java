package com.cfn.hibernate.dao;

import com.cfn.hibernate.model.Employee;

public interface ComponentDao {
	void saveEmp(Employee emp);
	Employee readEmp(int empNumber);
}
