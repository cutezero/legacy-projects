package com.code.test;

import java.util.HashMap;
import java.util.Map;

import com.code.dao.impl.DaoImpl;
import com.code.model.Course;
import com.code.model.Subject;

public class CLTest {

	public static void main(String[] args) {

		Course course= null;
		Subject subject= null;
		DaoImpl dao= null;
		Map<String, Subject> subjects= null;

		course= new Course();
		course.setName("NetDot Package");
		
		subjects= new HashMap<>();

		subject= new Subject();
		subject.setName("C#");
		subjects.put("sub1", subject);
		
		subject= new Subject();
		subject.setName("ASP");
		subjects.put("sub2", subject);
		
		course.setSubjects(subjects);
		
		dao= new DaoImpl();
		int result=dao.saveCourse(course);
		System.out.println("Result : "+result);

	}

}
