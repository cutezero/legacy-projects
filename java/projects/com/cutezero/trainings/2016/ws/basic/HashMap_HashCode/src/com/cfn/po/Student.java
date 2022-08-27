package com.cfn.po;

public class Student {

	private int studentRollNo;
	private String studentname;

	public Student(int studentRollNo) {
		super();
		this.studentRollNo = studentRollNo;
	}
	
	




	public Student(int studentRollNo, String studentname) {
		super();
		this.studentRollNo = studentRollNo;
		this.studentname = studentname;
	}






	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + studentRollNo;
		result = prime * result
				+ ((studentname == null) ? 0 : studentname.hashCode());
		return result;
		//return studentRollNo;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (studentRollNo != other.studentRollNo)
			return false;
		if (studentname == null) {
			if (other.studentname != null)
				return false;
		} else if (!studentname.equals(other.studentname))
			return false;
		return true;
	}
	
}
