package com.code.test;

import java.util.ArrayList;
import java.util.List;

import com.code.dao.impl.DaoImpl;
import com.code.model.Course;
import com.code.model.Student;

public class CLTest {

	/**
	 * Not working Need to review 
	 * @param args
	 */
	public static void main(String[] args) {

		Course course= null;
		DaoImpl dao= null;
		List<Course> courses= null;
		List<Student> students= null;
		Student student= null;
		students= new ArrayList<>();
		courses= new ArrayList<>();
		int result=0;
		
		student= new Student()		//the whole program is not working
		student.setName("Jaggu");
		student.setAge(26);
		students.add(student);
		
		course= new Course();
		course.setName("Python Package");
		course.setStudents(students);
		
		
		course= new Course();
		course.setName("Java Package");
		course.setStudents(students);
		courses.add(course);

		course= new Course();
		course.setName("Python Package");
		course.setStudents(students);
		courses.add(course);
	
		student.setCourses(courses);
		
		dao= new DaoImpl();
		result=dao.saveCourse(course);
		System.out.println("Result : "+result);

//		result=dao.saveStudent(student);
//		System.out.println("Stu Result : "+result);
	}

}
