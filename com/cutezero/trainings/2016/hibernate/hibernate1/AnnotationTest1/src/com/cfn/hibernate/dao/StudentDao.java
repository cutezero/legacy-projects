package com.cfn.hibernate.dao;

import com.cfn.hibernate.model.Student;

public interface StudentDao {
	public void persistStudent(Student student);
	public Student findStudent(int studentId);

}
