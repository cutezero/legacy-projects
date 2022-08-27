package com.cfn.hibernate.dao;

import com.cfn.hibernate.model.Patient;

public interface OTMDao {
	void saveDoctorWithPatients();
	void addPatientToDoctor(Patient p);
	void removePatientFromDoctor(int patientId);
	void removeDoctor(int doctorId);
}
