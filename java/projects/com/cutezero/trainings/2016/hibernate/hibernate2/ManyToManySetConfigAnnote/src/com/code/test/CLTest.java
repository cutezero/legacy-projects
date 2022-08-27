package com.code.test;

import java.util.HashSet;
import java.util.Set;

import com.code.dao.impl.DaoImpl;
import com.code.model.Course;
import com.code.model.Student;

public class CLTest {

	public static void main(String[] args) {

		Course course= null;
		DaoImpl dao= null;
		Set<Course> courses= null;
		Student student= null;
		
		student= new Student();
		student.setName("Madhu");
		student.setAge(26);
		
		courses= new HashSet<>();
		course= new Course();
		course.setName("Java Package");
		
		course= new Course();
		course.setName("PHP Package");
		courses.add(course);

		course= new Course();
		course.setName("Scala Package");
		courses.add(course);
		
		student.setCourses(courses);
		dao= new DaoImpl();
		int result=dao.saveStudent(student);
		System.out.println("Result : "+result);

	}

}
