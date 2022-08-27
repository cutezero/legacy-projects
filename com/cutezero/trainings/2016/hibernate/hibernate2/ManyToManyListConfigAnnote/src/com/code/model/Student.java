package com.code.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OrderColumn;
import javax.persistence.Table;

@Entity
@Table(name="STUDENT_1")
public class Student {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="S_ID")
	protected int studentId;
	@Column(name="S_NAME", length=15)
	protected String name;
	@Column(name="S_AGE")
	protected int age;
	
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="STUDENT_COURSE", joinColumns= {@JoinColumn(name="STUDENT_ID")}, inverseJoinColumns= {@JoinColumn(name="COURSE_ID")})
	@OrderColumn(name="C_S_INDEX")		//optional in annotation approach
	protected List<Course> courses;
	
	public List<Course> getCourses() {
		return courses;
	}
	public void setCourses(List<Course> courses) {
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
