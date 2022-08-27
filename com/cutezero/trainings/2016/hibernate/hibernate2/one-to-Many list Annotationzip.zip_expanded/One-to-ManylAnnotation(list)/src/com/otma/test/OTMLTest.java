package com.otma.test;
import java.util.Date;

import java.util.HashSet;
import java.util.Set;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.otma.entites.Project;
import com.otma.entites.Resource;
import com.otma.util.SessionFactoryRegistry;

public class OTMLTest {
	public static void main(String[] args) {
		SessionFactory sessionFactory=null;
		Session session=null;
		Transaction transaction=null;
		boolean flag=false;
		Project project=null;
		Resource resource=null;
		Resource resource1=null;
		Set<Resource> resources=null;
		sessionFactory=SessionFactoryRegistry.getSessionFactory();
		session=sessionFactory.getCurrentSession();
		transaction=session.beginTransaction();
		
		try {
			project=new Project();
			project.setProject_no(10);
			project.setTitale("brain");
			project.setDescription("tumor");
			project.setDuration(65);
			session.save(project);
			resources = new HashSet<Resource>();
			resource=new Resource();
			resource.setResource_no(01);
			resource.setRole("vital");
			resource.setOpeningDate(new Date());
			resource.setEndingDate(new Date());
			session.save(resource);
			resources.add(resource);
			resource1=new Resource();
			resource1.setResource_no(01);
			resource1.setRole("vital");
			resource1.setOpeningDate(new Date());
			resource1.setEndingDate(new Date());
			session.save(resource1);
			flag=true;
			project=(Project)session.get(Project.class, 2);
			System.out.println(project);
		}finally {
			if(transaction!=null) {
			if(flag) {
				transaction.commit();
			}else {
				transaction.rollback();
			}
		}
		SessionFactoryRegistry.closeSessionFactory();
	}

	}
}
