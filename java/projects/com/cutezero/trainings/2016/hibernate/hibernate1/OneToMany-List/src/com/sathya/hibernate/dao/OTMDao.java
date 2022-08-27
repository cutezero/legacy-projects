package com.sathya.hibernate.dao;

import com.sathya.hibernate.model.Patient;

public interface OTMDao 
{
	   void     saveDoctorWithPatients();
	   
	   void     removePatientFromDoctor();
	   
}
