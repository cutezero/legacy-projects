package com.code.dao.impl;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.code.dao.util.CustomSessionFactory;
import com.code.model.Course;
import com.code.model.Subject;

public class DaoImpl {

	private SessionFactory sessionFactory=null;
	private Session session=null;
	private Transaction tx= null;
	private boolean flag= false;
	
	public int saveCourse(Course course) {
		int result=0;
		try {
			sessionFactory=CustomSessionFactory.getSessionFactory();
			session= sessionFactory.getCurrentSession();
			tx= session.beginTransaction();
			result= (int) session.save(course);
			System.out.println("Result : "+result);
/*			result= (int) session.save(subjects.get(0));
			System.out.println("Result 2: "+result);
			result= (int) session.save(subjects.get(1));
			System.out.println("Result 2: "+result);
*/			flag= true;
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(sessionFactory!=null) {
				if (flag) {
					tx.commit();
				}else {
					tx.rollback();
				}
			}
		}
		return result;
	}
	public int saveSubject(Subject subject) {
		int result=0;
		try {
			sessionFactory=CustomSessionFactory.getSessionFactory();
			session= sessionFactory.getCurrentSession();
			tx= session.beginTransaction();
			result= (int) session.save(subject);
			System.out.println("Result 2: "+result);
			
			flag= true;
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(sessionFactory!=null) {
				if (flag) {
					tx.commit();
				}else {
					tx.rollback();
				}
			}
		}
		return result;
	}

	/*public void getStudents() {
		sessionFactory= CustomSessionFactory.getSessionFactory();
		session= sessionFactory.getCurrentSession();
		Query query= session.createQuery("Select * from student s");
	}
*/
	
}
