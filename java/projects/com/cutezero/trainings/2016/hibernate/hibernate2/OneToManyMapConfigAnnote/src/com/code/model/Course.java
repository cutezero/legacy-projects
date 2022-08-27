package com.code.model;

import java.util.Map;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapKeyColumn;
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
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="COURSE_ID")
	@MapKeyColumn(name="C_S_INDEX", nullable=true)
	protected Map<String, Subject> subjects;
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
	public Map<String, Subject> getSubjects() {
		return subjects;
	}
	public void setSubjects(Map<String, Subject> subjects) {
		this.subjects = subjects;
	}
	
}
