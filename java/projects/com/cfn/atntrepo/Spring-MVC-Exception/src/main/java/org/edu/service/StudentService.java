package org.edu.service;

import java.util.List;

import org.edu.entities.Student;
import org.edu.entities.User;

public interface StudentService {

	void saveStudent(Student student);
	List<Student> getAllStudents();

}
