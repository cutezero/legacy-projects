package com.code.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
@Table(name="ADDRESS_1")
public class Address {

	@Id
	@GenericGenerator(name="ADDR_FK", strategy="foreign", parameters=@Parameter(name="property", value="student"))
	@GeneratedValue(generator="ADDR_FK")			//Should not apply for OneToOne PrimaryJoinColumn
	@Column(name="ADDR_ID")
	protected int addressId;
	@Column(name="AREA")
	protected String area;
	@Column(name="CITY")
	protected String city;
	@Column(name="STATE")
	protected String state;
	@Column(name="ZIP_CODE")
	protected String zipCode;
	
	@OneToOne
	@PrimaryKeyJoinColumn()
	protected Student student;
	
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public int getAddressId() {
		return addressId;
	}
	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	
}
