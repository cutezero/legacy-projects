package com.cfn.spring.mvc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.cfn.spring.mvc.model.Employee;

@Repository
public class EmpDaoImpl implements IEmpDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	public void addEmployee(Employee employee) {
		hibernateTemplate.saveOrUpdate(employee);
	}

	public List<Employee> listEmployeess() {
		List<Employee> list=hibernateTemplate.loadAll(Employee.class);
		return list;
	}

	public void deleteEmployee(Employee employee) {
		hibernateTemplate.delete(employee);
	}

}
