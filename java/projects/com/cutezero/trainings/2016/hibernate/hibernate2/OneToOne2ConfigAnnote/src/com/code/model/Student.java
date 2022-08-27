package com.code.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="STUDENT_1")
public class Student {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="S_ID")
	protected int studentId;
	@Column(name="S_NAME", length=15)
	protected String name;
	@Column(name="S_AGE")
	protected int age;
	
	/**
	 * The following mapping works with both 
	 * @OneToOne or @ManyToOne(with unique as join column)
	 */
	@OneToOne(cascade=CascadeType.ALL)
//	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="ADDR_ID_FK", unique=true, referencedColumnName="ADDR_ID")
	protected Address address;
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
