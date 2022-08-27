package com.cfn.hibernate.dao;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.cfn.hibernate.model.Employee;
import com.cfn.hibernate.util.HibernateUtil;

public class EmpDaoImpl implements EmpDao {
	private SessionFactory factory;
	public EmpDaoImpl()
	{
		factory= HibernateUtil.getSessionFactory();
	}
	@Override
	public void saveEmployee(Employee e) {
		Session session= factory.openSession();
		Transaction tx= session.beginTransaction();
		session.save(e);
		tx.commit();
		session.close();
	}

	@Override
	public Employee readEmployee(int empNumber) {
		Session session= factory.openSession();
		Employee e= (Employee)session.get(Employee.class, empNumber);
		session.close();
		return e;
	}

}
