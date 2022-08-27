package com.cfn.hibernate.model;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class Employee {
	@Id
	private int employeeNumber;
	@Column(length=10)
	private String employeeName;
	@Embedded
	private Address addr;
	public Employee()
	{}
	public Employee(int employeeNumber, String employeeName, Address addr) {
		super();
		this.employeeNumber = employeeNumber;
		this.employeeName = employeeName;
		this.addr = addr;
	}
	public int getEmployeeNumber() {
		return employeeNumber;
	}
	public void setEmployeeNumber(int employeeNumber) {
		this.employeeNumber = employeeNumber;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public Address getAddr() {
		return addr;
	}
	public void setAddr(Address addr) {
		this.addr = addr;
	}
	
}
