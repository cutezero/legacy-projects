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
import javax.persistence.Table;

@Entity
@Table(name="COURSE_1")
public class Course {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="COURSE_ID")
	protected int courseId;
	@Column(name="COURSE_NAME")
	protected String name;
	
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="COURSE_STUDENT", joinColumns= {@JoinColumn(name="COURSE_ID")}, inverseJoinColumns= {@JoinColumn(name="S_ID")})
	protected List<Student> students;
	
	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
