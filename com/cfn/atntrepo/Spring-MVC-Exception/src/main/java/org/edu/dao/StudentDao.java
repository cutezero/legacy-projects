package org.edu.dao;

import java.util.List;

import org.edu.entities.Student;
import org.edu.entities.User;

public interface StudentDao {
	
	void saveStudent(Student student);
	List<Student> getAllStudents();
	
}
