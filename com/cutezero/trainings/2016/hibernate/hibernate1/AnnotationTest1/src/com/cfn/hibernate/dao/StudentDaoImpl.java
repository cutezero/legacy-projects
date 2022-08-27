package com.cfn.hibernate.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.cfn.hibernate.model.Student;
import com.cfn.hibernate.util.HibernateUtil;

public class StudentDaoImpl implements StudentDao {
	
	private SessionFactory factory;
	public StudentDaoImpl()
	{
		factory=HibernateUtil.getSessionFactory();
	}
	@Override
	public void persistStudent(Student student) {
		
		Session session= factory.openSession();
		Transaction tx=session.beginTransaction();
		session.save(student);
		tx.commit();
	}

	@Override
	public Student findStudent(int studentId) {
		Session session=factory.openSession();
		Student s=(Student)session.get(Student.class, studentId);
		session.close();
		return s;
	}

}
