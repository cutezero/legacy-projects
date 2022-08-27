package com.code.test;

import java.util.ArrayList;
import java.util.List;

import com.code.dao.impl.DaoImpl;
import com.code.model.Course;
import com.code.model.Student;

public class CLTest {

	public static void main(String[] args) {

		Course course= null;
		DaoImpl dao= null;
		List<Course> courses= null;
		Student student= null;
		
		student= new Student();
		student.setName("Jaggu");
		student.setAge(26);
		
		course= new Course();
		course.setName("Python Package");
		
		courses= new ArrayList<>();
		course= new Course();
		course.setName("Java Package");
		courses.add(course);

		course= new Course();
		course.setName("Python Package");
		courses.add(course);
		
		student.setCourses(courses);
		dao= new DaoImpl();
		int result=dao.saveCourse(course, student);
		System.out.println("Result : "+result);

	}

}
