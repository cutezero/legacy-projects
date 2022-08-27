package com.one2one.test;


import java.util.Random;
import java.util.UUID;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.cfn.util.SessionFactoryRegistry;
import com.one2one.entities.ReportSheet;
import com.one2one.entities.Student;

public class OTOTest {

	public static void main(String[] args) {
		
		SessionFactory sessionFactory= null;
		Session session= null;
		Transaction transaction= null;
		boolean flag= false;
		Student student= null;
		ReportSheet reportSheet= null;
		
		try {
			sessionFactory= SessionFactoryRegistry.getSessionFactory();
			session= sessionFactory.getCurrentSession();
			transaction= session.beginTransaction();
			
			student= new Student();
			student.setStudentRegNo(UUID.randomUUID().toString().substring(1,6).replace("-", ""));
			student.setFirstName("Badri");
			student.setLastName("Pradhan");
			student.setEmail("bisu@gmail.com");
			student.setMobileNumber("7267320");
			session.save(student);	//required in case of bidirectional
			
			
			reportSheet= new ReportSheet();
			reportSheet.setReportNo("RN8778");	//NOT PK
			reportSheet.setComments("Comment4");
			reportSheet.setRating("Rating4");
			reportSheet.setStudent(student);
			session.save(reportSheet);

			flag=true;
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			if (transaction!=null){
				if(flag) 
					transaction.commit();
				else
					transaction.rollback();
			}
			SessionFactoryRegistry.closeSessionFactory();
		}
	}
}
