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
		student.setName("Bala");
		student.setAge(26);
		
		courses= new ArrayList<>();
		course= new Course();
		course.setName("Testing Package");
		
		course= new Course();
		course.setName("Hadoop Package");
		courses.add(course);

		course= new Course();
		course.setName("Net Package");
		courses.add(course);
		
		student.setCourses(courses);
		dao= new DaoImpl();
		int result=dao.saveStudent(student);
		System.out.println("Result : "+result);

	}

}
