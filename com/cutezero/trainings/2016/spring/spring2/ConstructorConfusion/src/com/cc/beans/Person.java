package com.cc.beans;

public class Person {

	private String name;
	private int no;
	
	public Person(String name, int no) {
		super();
		this.name = name;
		this.no = no;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", no=" + no + "]";
	}
	
	
}
