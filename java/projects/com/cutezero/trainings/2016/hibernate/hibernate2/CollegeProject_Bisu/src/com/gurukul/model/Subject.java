package com.gurukul.model;

public class Subject {

	protected int subjectId;
	protected String name;
	public Subject() {
		super();
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
