package com.code.test;

import com.code.dao.impl.DaoImpl;
import com.code.model.Course;
import com.code.model.Subject;

public class CLTest {

	public static void main(String[] args) {

		Course course= null;
		Subject subject= null;
		DaoImpl dao= null;
		int result=0;

		
		dao= new DaoImpl();
		subject= new Subject();
		subject.setName("C#2");
		result=dao.saveSubject(subject);
		System.out.println("Result : "+result);
		
		subject= new Subject();
		subject.setName("ASP2");
//		result=dao.saveSubject(subject);
//		System.out.println("Result : "+result);
		
		
		course= new Course();
		course.setName("perl Package");
		course.setSubject(subject);
		result=dao.saveCourse(course);
		System.out.println("Result : "+result);

	}

}
