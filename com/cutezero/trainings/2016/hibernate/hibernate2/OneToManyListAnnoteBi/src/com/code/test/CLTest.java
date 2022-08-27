package com.code.test;

import java.util.ArrayList;
import java.util.List;

import com.code.dao.impl.DaoImpl;
import com.code.model.Course;
import com.code.model.Subject;

public class CLTest {

	/**
	 * It creates 3 table (2 entity table and 1 mapping table)
	 * This example with cascadeType.ALL
	 * @param args
	 */
	public static void main(String[] args) {

		Course course= null;
		Subject subject= null;
		DaoImpl dao= null;
		List<Subject> subjects= null;

		course= new Course();
		course.setName("NetDot Package");
		
		subjects= new ArrayList<>();

		subject= new Subject();
		subject.setName("C#");
		subjects.add(subject);
		
		subject= new Subject();
		subject.setName("ASP");
		subjects.add(subject);
		
		course.setSubjects(subjects);
		
		dao= new DaoImpl();
		int result=dao.saveCourse(course);
		
		System.out.println("Result : "+result);

	}

}
