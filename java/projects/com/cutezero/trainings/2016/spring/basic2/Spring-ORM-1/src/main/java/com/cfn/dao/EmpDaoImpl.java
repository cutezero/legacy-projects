package com.cfn.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cfn.dto.Employee;
@Repository
@Transactional
public class EmpDaoImpl implements EmpDao {
	@Autowired
	private HibernateTemplate ht;
	public void saveOrUpdateEmployee(Employee e) {
		ht.saveOrUpdate(e);
		System.out.println("object updated");
	}

	public void deleteEmployee(int empId) {
		Employee e=(Employee)ht.get(Employee.class, empId);
		ht.delete(e);
		System.out.println("object delted");

	}

	public List selectEmployees() {
		List list=ht.find("from Employee e");
		return list;
	}

}
