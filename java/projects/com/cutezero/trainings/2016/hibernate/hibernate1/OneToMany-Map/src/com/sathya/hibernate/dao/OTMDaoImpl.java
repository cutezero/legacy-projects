package com.sathya.hibernate.dao;

import java.util.HashMap;
import java.util.Map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.sathya.hibernate.model.Doctor;
import com.sathya.hibernate.model.Patient;
import com.sathya.hibernate.util.HibernateUtil;

public class OTMDaoImpl implements OTMDao 
{
	private      SessionFactory    factory;
	public OTMDaoImpl() 
	{
		factory=HibernateUtil.getSessionFactory();
	}

	@Override
	public void saveDoctorWithPatients() 
	{
		Doctor   doctor=new  Doctor();
		doctor.setDoctorId(1101);
		doctor.setDoctorName("PANKAJ");
		doctor.setQualification("MS");
		
		Patient   p1 = new   Patient(9001,"A","HYD");
		Patient   p2 = new   Patient(9002,"B","Delhi");
		Patient   p3 = new   Patient(9003,"C","Delhi");
		
		Map<String,Patient>   patients = new  HashMap<String,Patient>();
		patients.put("p1",p1);
		patients.put("p2",p2);
		patients.put("p3",p3);
		
		doctor.setPatients(patients);
		Session     session=factory.openSession();
		Transaction   tx=session.beginTransaction();
		session.save(doctor);
		tx.commit();
		session.close();
	}
	
	
	
}
