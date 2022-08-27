package com.cfn.hibernate.dao;

import java.util.List;


import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.cfn.hibernate.model.Employee;
import com.cfn.hibernate.util.HibernateUtil;

public class EmployeeDaoImpl implements EmployeeDao {
	private SessionFactory factory;
	public EmployeeDaoImpl()
	
	{
		factory=HibernateUtil.getSessionFactory();
	}
	public void findAllEmps()
	{
		Session session=factory.openSession();
		Query query= session.createQuery("from Employee e");
		List list= query.list();
		for (Object o: list)
		{
			Employee e= (Employee)o;
			System.out.println(e);
		}
		session.close();
	}
	public void updateEmpsByDeptno(int deptno)
	{
		Session session=factory.openSession();
		Query query= session.createQuery("update Employee e set e.empSalary=8499 where e.deptNumber=?");
		query.setParameter(0, deptno);
		Transaction tx= session.beginTransaction();
		int i= query.executeUpdate();
		tx.commit();
		System.out.println(i+" row(s) updated");
		session.close();
	}
	@Override
	public void findEmpsByDeptno(int deptno) {
		Session session=factory.openSession();
		Query query= session.createQuery("from Employee e where e.deptNumber=?");
		query.setParameter(0, deptno);
		List list= query.list();
		for (Object o: list)
		{
			Employee e= (Employee)o;
			System.out.println(e);
		}
		session.close();
	}
	
}
