package com.gurukul.dao;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.gurukul.model.Address;
import com.gurukul.model.Course;
import com.gurukul.util.SessionFactoryRegistry;

public class GurukulDaoImpl {

	private SessionFactory sessionFactory;
	private Session session=null;
	private Transaction tx;
	private boolean flag=false;
	
	public void save(Address address,Course course)
	{
		try {
			sessionFactory=SessionFactoryRegistry.getSessionFactory();
			session=sessionFactory.getCurrentSession();
			tx=session.beginTransaction();
			session.save(course);
			session.save(address);
			flag=true;
		}finally {
			if(sessionFactory!=null) {
				
				if(flag) {
					tx.commit();
				}else {
					tx.rollback();
				}
			}
		}
	}
	
	public void load()
	{
		sessionFactory=SessionFactoryRegistry.getSessionFactory();
		session=sessionFactory.getCurrentSession();
		Query q=session.createQuery("select s from Student s ");
	}
}
