package com.cfn.hibernate.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Doctor {
	@Id
	@Column(name="drid")
	private int doctorId;
	@Column(name="drname", length=10)
	private String doctorName;
	@Column(name="qlf", length=10)
	private String qualification;
	@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.LAZY, orphanRemoval=true)
	@JoinColumn(name="drid_fk", referencedColumnName="drid")
	private Set<Patient> patients;
	public Doctor() {
		
	}
	public Doctor(int doctorId, String doctorName, String qualification, Set<Patient> patients) {
		super();
		this.doctorId = doctorId;
		this.doctorName = doctorName;
		this.qualification = qualification;
		this.patients = patients;
	}
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
	public Set<Patient> getPatients() {
		return patients;
	}
	public void setPatients(Set<Patient> patients) {
		this.patients = patients;
	}
	
}
