package com.code.dao.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class CustomSessionFactory {

	private static SessionFactory factory= null;
	
	private CustomSessionFactory() {
		//private Cunstructor on behalf of singleton
	}
	public static synchronized SessionFactory getSessionFactory() {
		if(factory== null) {
			Configuration configuration= new Configuration();
			configuration.configure();
//			factory=configuration.buildSessionFactory(new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build());
			ServiceRegistry registry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
			factory=configuration.buildSessionFactory(registry);
		}
		return factory;
	}
	
	public static void closeSessionFactory() {
		if (factory==null) {
			factory.close();
		}
		factory=null;
	}
}
