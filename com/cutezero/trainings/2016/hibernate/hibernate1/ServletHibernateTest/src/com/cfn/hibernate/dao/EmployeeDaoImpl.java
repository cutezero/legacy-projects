package com.cfn.hibernate.dao;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;

import com.cfn.hibernate.model.Employee;
import com.cfn.hibernate.util.HibernateUtil;



public class EmployeeDaoImpl implements EmployeeDao {
	private SessionFactory factory;
	public EmployeeDaoImpl()
	
	{
		factory=HibernateUtil.getSessionFactory();
	}
	
	@Override
	public int getEmployeeCount() {
		Session session=factory.openSession();
		Criteria crit= session.createCriteria(Employee.class);
		Projection p1=Projections.rowCount();
		crit.setProjection(p1);
		List list= crit	.list();
		int count=(int)(long)list.get(0);
		session.close();
		return count;
	}
	@Override
	public List getEmployeeList(int start) {
		Session session=factory.openSession();
		Criteria crit= session.createCriteria(Employee.class);
		crit.setFirstResult(start);
		crit.setMaxResults(3);
		List list= crit.list();
		session.close();
		return list;
	}
	
}
