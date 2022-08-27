package com.code.model;

import java.util.Map;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.MapKeyColumn;
import javax.persistence.Table;

@Entity
@Table(name="STUDENT_1")
public class Student {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="S_ID")
	protected int studentId;
	@Column(name="S_NAME", length=15)
	protected String name;
	@Column(name="S_AGE")
	protected int age;
	
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="COURSE_STUDENT", joinColumns= {@JoinColumn(name="STUDENT_ID")}, inverseJoinColumns= {@JoinColumn(name="COURSE_ID")})
	@MapKeyColumn(name="S_C_INDEX")
	protected Map<String, Course> courses;

	public Map<String, Course> getCourses() {
		return courses;
	}
	public void setCourses(Map<String, Course> courses) {
		this.courses = courses;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	
}
