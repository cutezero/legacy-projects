package com.cfn.hibernate.dao;

import java.util.List;

public interface EmployeeDao {
	int getEmployeeCount();
	List getEmployeeList(int start);
}
