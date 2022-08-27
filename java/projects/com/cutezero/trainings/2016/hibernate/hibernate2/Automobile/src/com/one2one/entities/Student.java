package com.one2one.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;


@Entity
@Table(name="STUDENT")
public class Student implements Serializable{

	@Id
	@Column(name="REG_NO")
//	@GeneratedValue(strategy=GenerationType.AUTO)
	protected String studentRegNo;
	@Column(name="FIRST_NAME")
	protected String firstName;
	@Column(name="LAST_NAME")
	protected String lastName;
	@Column(name="MOBILE_NO")
	protected String mobileNumber;
	@Column(name="EMAIL_ID")
	protected String email;

	public String getStudentRegNo() {
		return studentRegNo;
	}
	public void setStudentRegNo(String studentRegNo) {
		this.studentRegNo = studentRegNo;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result
				+ ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result
				+ ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result
				+ ((mobileNumber == null) ? 0 : mobileNumber.hashCode());
		result = prime * result
				+ ((studentRegNo == null) ? 0 : studentRegNo.hashCode());
		return result;
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
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (mobileNumber == null) {
			if (other.mobileNumber != null)
				return false;
		} else if (!mobileNumber.equals(other.mobileNumber))
			return false;
		if (studentRegNo == null) {
			if (other.studentRegNo != null)
				return false;
		} else if (!studentRegNo.equals(other.studentRegNo))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Student [studentRegNo=" + studentRegNo + ", firstName="
				+ firstName + ", lastName=" + lastName + ", mobileNumber="
				+ mobileNumber + ", email=" + email + "]";
	}
	
	
	
	
}
