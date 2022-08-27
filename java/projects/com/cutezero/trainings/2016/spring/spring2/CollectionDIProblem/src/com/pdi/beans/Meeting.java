package com.pdi.beans;

import java.util.List;

public class Meeting {

	private List<String> todos;

	public List<String> getTodos() {
		return todos;
	}

	public void setTodos(List<String> todos) {
		this.todos = todos;
	}

	@Override
	public String toString() {
		return "Meeting [todos=" + todos + "]";
	}
	

}
