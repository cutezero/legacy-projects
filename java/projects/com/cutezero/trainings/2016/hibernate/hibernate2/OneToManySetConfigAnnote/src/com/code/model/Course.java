package com.code.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
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
	
	/**
	 * if 3rd table required then use @JoinTable as below
	 * 	@JoinTable(name="COURSE_SUB_1", joinColumns= {@JoinColumn(name="COURSE_ID")}, inverseJoinColumns={@JoinColumn(name="SUBJECT_ID")})
	 */
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="COURSE_ID")		//Both side @JoinColumn should have same name
	protected Set<Subject> subjects;
	
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
	public Set<Subject> getSubjects() {
		return subjects;
	}
	public void setSubjects(Set<Subject> subjects) {
		this.subjects = subjects;
	}
}
