package com.cfn.hibernate.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.cfn.hibernate.model.Doctor;
import com.cfn.hibernate.util.HibernateUtil;

public class OTMDaoImpl implements OTMDao {
	private SessionFactory factory;
	
	public OTMDaoImpl(){
		factory=HibernateUtil.getSessionFactory();
	}

	@Override
	public void savePatientDoctor(Doctor d) {
		Session session= factory.openSession();
		Transaction tx=session.beginTransaction();
		session.save(d);
		tx.commit();
		session.close();
	}

}
