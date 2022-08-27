package com.code.test;

import java.util.HashSet;
import java.util.Set;

import com.code.dao.impl.DaoImpl;
import com.code.model.Course;
import com.code.model.Subject;

public class CLTest {

	/**
	 * It works with both annotation and config 
	 * just check at hibernate config before executing 
	 * @param args
	 */
	public static void main(String[] args) {

		Course course= null;
		Subject subject= null;
		DaoImpl dao= null;
		Set<Subject> subjects= null;

		course= new Course();
		course.setName("Java Package");
		
		subjects= new HashSet<>();

		subject= new Subject();
		subject.setName("Spring");
		subject.setCourse(course);
		subjects.add(subject);
		
		subject= new Subject();
		subject.setName("MySQL");
		subject.setCourse(course);
		subjects.add(subject);
		
		course.setSubjects(subjects);
		
		dao= new DaoImpl();
		int result=dao.saveCourse(course);
		System.out.println("Result : "+result);

	}

}
