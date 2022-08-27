package com.cfn;

public class Employee implements Cloneable{
	private int empNo;
	private String empName;
	private Department department;
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	public Employee(int empNo, String empName, Department department) {
		super();
		this.empNo = empNo;
		this.empName = empName;
		this.department = department;
	}
	@Override
	public Object clone() throws CloneNotSupportedException{
		Employee cloned=(Employee)super.clone();
		Department d =cloned.getDepartment();
		Department clonedD=(Department) d.cloneDepartment();
		cloned.setDepartment(clonedD);
		
		
		return cloned;
	}
}
