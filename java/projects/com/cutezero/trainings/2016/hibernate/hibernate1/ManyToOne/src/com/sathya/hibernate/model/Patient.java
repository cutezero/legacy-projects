package com.sathya.hibernate.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Patient 
{
	@Id
	@Column(name="patid")
	private    int        patientId;
	@Column(name="patname",  length=10)
	private   String   patientName;
	@Column(name="loc",  length=10)
	private   String   location;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="drid_fk" , nullable=true)
	private    Doctor   doctor;
	
	
	public Doctor getDoctor() {
		return doctor;
	}
	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}
	public     Patient()
	{   }
	public    Patient(int    patientId,  String   patientName, String  location)
	{
		this.patientId=patientId;
		this.patientName=patientName;
		this.location=location;
	}
	public int getPatientId() {
		return patientId;
	}
	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}

}
