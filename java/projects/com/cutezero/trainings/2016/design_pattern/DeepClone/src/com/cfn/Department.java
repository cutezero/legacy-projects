package com.cfn;

public class Department implements Cloneable{
	private int id;
	private String name;
	public Department(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Object cloneDepartment() throws CloneNotSupportedException{
		return super.clone();
	}
}
