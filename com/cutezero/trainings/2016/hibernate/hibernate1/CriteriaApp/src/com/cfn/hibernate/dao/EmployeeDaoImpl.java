package com.cfn.hibernate.dao;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
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
	public void findAllEmps()
	{
		Session session=factory.openSession();
		Criteria crit= session.createCriteria(Employee.class);
		List list= crit	.list();
		for (Object o: list)
		{
			Employee e= (Employee)o;
			System.out.println(e);
		}
		session.close();
	}
	public void readPartialEmps()
	{
		Session session=factory.openSession();
		Criteria crit= session.createCriteria(Employee.class);
		Projection p1=Projections.property("empName");
		Projection p2=Projections.property("empSalary");
		ProjectionList plist=Projections.projectionList();
		plist.add(p1);
		plist.add(p2);
		crit.setProjection(plist);
		List list= crit.list();
		Iterator it=list.iterator();
		while (it.hasNext())
		{
			Object[] result= (Object[])it.next();
			System.out.println(result[0]+"\t"+result[1]);
		}
		session.close();
	}
	@Override
	public void readAggregate(){
		Session session=factory.openSession();
		Criteria crit= session.createCriteria(Employee.class);
		Projection p1=Projections.rowCount();
		Projection p2=Projections.sum("empSalary");
		Projection p3=Projections.avg("empSalary");
		ProjectionList plist=Projections.projectionList();
		plist.add(p1);
		plist.add(p2);
		plist.add(p3);
		crit.setProjection(plist);
		
		List list= crit.list();		
		Object[] result= (Object[])list.get(0);
		System.out.println(result[0]+"\t"+result[1]+"\t"+result[2]);
		session.close();
	}
	
}
