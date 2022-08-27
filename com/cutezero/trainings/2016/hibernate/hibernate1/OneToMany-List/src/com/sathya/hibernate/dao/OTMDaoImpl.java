package com.sathya.hibernate.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

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
		
		List<Patient>   patients = new  ArrayList<Patient>();
		patients.add(p1);
		patients.add(p2);
		patients.add(p3);
		
		doctor.setPatients(patients);
		Session     session=factory.openSession();
		Transaction   tx=session.beginTransaction();
		session.save(doctor);
		tx.commit();
		session.close();
	}
	
	@Override
	public void removePatientFromDoctor() 
	{
		Session    session=factory.openSession();
		Doctor     doctor=(Doctor)session.get(Doctor.class, 1101);
		List<Patient>    patients = doctor.getPatients();
		Patient    p =(Patient)session.get(Patient.class,9002);		
		Transaction   tx = session.beginTransaction();
		patients.remove(p);
		tx.commit();
		session.close();
	}
	
}
