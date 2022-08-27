package com.cdi.beans;

import java.util.List;
import java.util.Set;

public class Meeting {

	private List<String> todo;
	private Set<String> participents;
	public Meeting(Set<String> participents) {
		super();
		this.participents = participents;
	}
	
	public void setTodo(List<String> todo) {
		this.todo = todo;
	}

	@Override
	public String toString() {
		return "Meeting [todo=" + todo + ", participents=" + participents + "]";
	}
	
		
}
