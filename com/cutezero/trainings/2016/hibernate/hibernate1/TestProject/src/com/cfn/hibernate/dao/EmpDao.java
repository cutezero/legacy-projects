package com.cfn.hibernate.dao;

import com.cfn.hibernate.model.Employee;

public interface EmpDao {
	void saveEmployee(Employee e);
	Employee readEmployee(int empNumber);

}
