package com.sathya.hibernate.dao;

import com.sathya.hibernate.model.Doctor;
import com.sathya.hibernate.model.Patient;

public interface OTMDao 
{
	   void     saveDoctorWithPatients(Doctor doctor);
	   void     addPatientToDoctor(Patient  p);
	   void     removePatientFromDoctor(int doctorId, int patientId);
	   void     removeDoctor(int    doctorId);
}
