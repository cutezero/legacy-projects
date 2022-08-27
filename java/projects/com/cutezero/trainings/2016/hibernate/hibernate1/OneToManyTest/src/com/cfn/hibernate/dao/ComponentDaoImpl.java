package com.cfn.hibernate.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.cfn.hibernate.model.Employee;
import com.cfn.hibernate.util.HibernateUtil;

public class ComponentDaoImpl implements ComponentDao {
	private SessionFactory factory;
	public ComponentDaoImpl()
	{
		factory=HibernateUtil.getSessionFactory();
	}

	@Override
	public void saveEmp(Employee emp) {
		Session session=factory.openSession();
		Transaction tx= session.beginTransaction();
		session.save(emp);
		tx.commit();
		session.close();
	}

	@Override
	public Employee readEmp(int empNumber) {
		Session session=factory.openSession();
		Employee e=(Employee)session.get(Employee.class, empNumber);
		System.out.println("Emp NO : "+e.getEmployeeNumber());
		System.out.println("Emp Name: "+e.getEmployeeName());
		System.out.println("House No: "+e.getAddr().getHno());
		System.out.println("Street: "+e.getAddr().getStreet());
		System.out.println("City: "+e.getAddr().getCity());
		session.close();
		return e;
	
	}

}
