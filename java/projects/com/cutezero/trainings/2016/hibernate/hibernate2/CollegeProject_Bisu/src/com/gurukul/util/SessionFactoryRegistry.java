package com.gurukul.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class SessionFactoryRegistry {

	private static SessionFactory sessionFactory;
	
	private SessionFactoryRegistry()
	{}
	public synchronized static SessionFactory getSessionFactory()
	{
		if(sessionFactory==null)
		{
			Configuration conf=new Configuration();
			conf.configure();
			ServiceRegistry registry = new StandardServiceRegistryBuilder().applySettings(conf.getProperties()).build();
			sessionFactory=conf.buildSessionFactory(registry);
		}
		return sessionFactory;
	}
	public static void closeSessionFactory()
	{
		if(sessionFactory!=null)
		{
			sessionFactory.close();
		}
		sessionFactory=null;
	}
}
