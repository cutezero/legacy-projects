package com.cfn.hibernate.model;

public class Employee {
	private int empNumber;
	private String empName;
	private int empSalary;
	private int deptNumber;
	
	
	public int getDeptNumber() {
		return deptNumber;
	}
	public void setDeptNumber(int deptNumber) {
		this.deptNumber = deptNumber;
	}
	public int getEmpNumber() {
		return empNumber;
	}
	public void setEmpNumber(int empNumber) {
		this.empNumber = empNumber;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(int empSalary) {
		this.empSalary = empSalary;
	}
	public String toString()
	{
		return "]"+empNumber+"\t"+empName+"\t"+empSalary+"]";
	}
}

