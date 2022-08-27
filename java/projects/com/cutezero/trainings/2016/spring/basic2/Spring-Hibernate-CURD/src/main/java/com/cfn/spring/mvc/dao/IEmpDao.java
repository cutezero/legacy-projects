package com.cfn.spring.mvc.dao;

import java.util.List;

import com.cfn.spring.mvc.model.Employee;

public interface IEmpDao {

	void addEmployee(Employee employee);	
	List<Employee> listEmployeess();
	void deleteEmployee(Employee employee);
}
