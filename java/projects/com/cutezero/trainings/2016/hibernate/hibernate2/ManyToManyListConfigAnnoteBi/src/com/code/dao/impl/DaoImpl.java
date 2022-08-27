package com.code.dao.impl;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.code.dao.util.CustomSessionFactory;
import com.code.model.Course;
import com.code.model.Student;

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
	public int saveStudent(Student student) {
		int result=0;
		try {
			sessionFactory=CustomSessionFactory.getSessionFactory();
			session= sessionFactory.getCurrentSession();
			tx= session.beginTransaction();
			result= (int) session.save(student);
			System.out.println("Result : "+result);
			 
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
