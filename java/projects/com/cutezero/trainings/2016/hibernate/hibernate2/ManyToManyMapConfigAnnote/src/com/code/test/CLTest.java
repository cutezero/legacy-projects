package com.code.test;

import java.util.HashMap;
import java.util.Map;

import com.code.dao.impl.DaoImpl;
import com.code.model.Course;
import com.code.model.Student;

public class CLTest {

	public static void main(String[] args) {

		Course course= null;
		DaoImpl dao= null;
		Map<String, Course> courses= null;
		Student student= null;
		
		student= new Student();
		student.setName("Maria");
		student.setAge(23);
		
		courses= new HashMap<>();
		course= new Course();
		course.setName("Net Package");
		courses.put("course3", course);
		
		course= new Course();
		course.setName("BigData Package");
		courses.put("course1", course);

		course= new Course();
		course.setName("UI Package");
		courses.put("course2", course);
		
		student.setCourses(courses);
		dao= new DaoImpl();
		int result=dao.saveCourse(course, student);
		System.out.println("Result : "+result);

	}

}
