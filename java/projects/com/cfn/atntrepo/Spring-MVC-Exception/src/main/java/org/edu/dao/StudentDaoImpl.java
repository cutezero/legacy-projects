package org.edu.dao;

import java.util.List;

import javax.annotation.Resource;
import javax.persistence.Query;

import org.edu.entities.Student;
import org.edu.entities.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDaoImpl implements StudentDao{

	@Autowired
	private HibernateTemplate hibernateTemplate;

	
	public void saveStudent(Student student) {
		hibernateTemplate.save(student);
	}

	public List<Student> getAllStudents() {
		
		return hibernateTemplate.loadAll(Student.class);
	}
	
}
	
	
	

