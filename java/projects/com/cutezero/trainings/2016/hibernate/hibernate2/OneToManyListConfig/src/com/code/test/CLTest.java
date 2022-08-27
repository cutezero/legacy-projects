package com.code.test;

import java.util.ArrayList;
import java.util.List;

import com.code.dao.impl.DaoImpl;
import com.code.model.Course;
import com.code.model.Subject;

public class CLTest {

	public static void main(String[] args) {

		Course course= null;
		Subject subject= null;
		DaoImpl dao= null;
		List<Subject> subjects= null;
		int result=0;
		
		dao= new DaoImpl();
		
		course= new Course();
		course.setName("NetDot Package");
		
		subjects= new ArrayList<>();

		subject= new Subject();
		subject.setName("C#");
		subject.setCourse(course);
		subjects.add(subject);
		
		
		subject= new Subject();
		subject.setName("ASP");
		subject.setCourse(course);
		subjects.add(subject);
		
		course.setSubjects(subjects);

		result=dao.saveCourse(course);
		System.out.println("Result : "+result);
		
	}

}
