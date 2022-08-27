package com.cfn;

public class ICard {
	private String empName;
	public ICard(String empName, int empNo, IIntrinsic intr) {
		super();
		this.empName = empName;
		this.empNo = empNo;
		this.intr = intr;
	}
	@Override
	public String toString() {
		return "ICard [empName=" + empName + ", empNo=" + empNo + ", intr=" + intr + ", getEmpName()=" + getEmpName()
				+ ", getEmpNo()=" + getEmpNo() + ", getIntr()=" + getIntr() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	public void print(){
		System.out.println("Emp Name :"+empName);
		System.out.println("Emp No :"+empNo);
		System.out.println("COMP Name :"+intr.getCompName());
		System.out.println("division Name :"+intr.getDivision());
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public IIntrinsic getIntr() {
		return intr;
	}
	public void setIntr(IIntrinsic intr) {
		this.intr = intr;
	}
	private int empNo;
	private IIntrinsic intr;
	
}
