package com.cfn;

public class TestCloning {
	public static void main(String...args) throws CloneNotSupportedException{
		Department hr= new Department(10, "HR");
		Employee original= new Employee(1, "ANIL", hr);
		Employee cloned= (Employee)original.clone();
		//let change the dept name in cloned object and print original object to verify
		cloned.getDepartment().setName("Finance");
		System.out.println(original.getDepartment().getName());
		//let change the value of empNo in  cloned object and print both to verify
		cloned.setEmpNo(2);
		System.out.println(original.getEmpNo());
	}

}
