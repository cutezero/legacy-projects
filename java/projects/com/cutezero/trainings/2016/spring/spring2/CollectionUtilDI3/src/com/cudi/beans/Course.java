package com.cudi.beans;

import java.util.List;
import java.util.Set;

public class Course {

	private List<String> subjects;
	private Set<String> faculties;
	
	public Course(List<String> subjects, Set<String> faculties) {
		super();
		this.subjects = subjects;
		this.faculties = faculties;
	}

	@Override
	public String toString() {
		return "Course [subjects=" + subjects + ", faculties=" + faculties + "]";
	}
	
}
