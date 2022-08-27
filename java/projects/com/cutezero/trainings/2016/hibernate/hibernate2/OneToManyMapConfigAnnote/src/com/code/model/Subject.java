package com.code.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="SUBJECT_1")
public class Subject {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="SUBJECT_ID")
	protected int subjectId;
	@Column(name="SUBJECT_NAME")
	protected String name;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="COURSE_ID")
	protected Course course;
	
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	public int getSubjectId() {
		return subjectId;
	}
	public void setSubjectId(int subjectId) {
		this.subjectId = subjectId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
