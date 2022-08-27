package com.sathya.hibernate.model;

import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;
@Entity
public class Doctor 
{
	@Id
	@Column(name="drid")
	private    int    doctorId;
	@Column(name="drname",  length=10)
	private   String   doctorName;
	@Column(name="qlf",  length=10)
	private   String   qualification;
	
	@OneToMany(cascade=CascadeType.ALL, orphanRemoval=true)
	@JoinColumn(name="drid_fk",  referencedColumnName="drid")
	@OrderColumn(name="pat_order")
	private   List<Patient>        patients;
	
	
	public int getDoctorId() {
		return doctorId;
	}
	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}
	public String getDoctorName() {
		return doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public    List<Patient>  getPatients() {
		return patients;
	}
	public void setPatients(List<Patient>   patients) {
		this.patients = patients;
	}
	
}
