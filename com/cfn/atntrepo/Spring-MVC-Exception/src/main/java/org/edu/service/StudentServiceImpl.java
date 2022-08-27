package org.edu.service;

import java.util.List;

import javax.transaction.Transactional;

import org.edu.dao.StudentDao;
import org.edu.entities.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	private StudentDao studentDao;
	
	@Transactional
	public void saveStudent(Student student) {
		studentDao.saveStudent(student);
	}

	@Transactional
	public List<Student> getAllStudents() {
		
		return studentDao.getAllStudents();
	}
	
	
}