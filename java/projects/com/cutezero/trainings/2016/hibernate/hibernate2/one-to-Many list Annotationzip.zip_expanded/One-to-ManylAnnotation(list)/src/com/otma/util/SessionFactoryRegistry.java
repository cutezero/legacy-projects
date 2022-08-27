package com.otma.util;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class SessionFactoryRegistry {
	public static SessionFactory sessionFactory;
	public static SessionFactory getSessionFactory() {
		try {
			if(sessionFactory==null) {
				Configuration configuration=new Configuration().configure();
				StandardServiceRegistry registry=new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
				sessionFactory=configuration.buildSessionFactory(registry);
			}
		}catch(HibernateException e) {
			e.printStackTrace();
		}
		return sessionFactory;
		
	}
	public static void closeSessionFactory() {
		if(sessionFactory!=null) {
			sessionFactory.close();
			sessionFactory=null;
		}
		
	}

}
