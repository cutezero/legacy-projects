package com.sathya.hibernate.dao;

import java.util.HashSet;
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
		doctor.setDoctorName("PANKAJ2");
		doctor.setQualification("MS");
		
		Patient   p1 = new   Patient(9001,"D","HYD");
		Patient   p2 = new   Patient(9002,"E","Delhi");
		Patient   p3 = new   Patient(9003,"F","Delhi");
		
		p1.setDoctor(doctor);
		p2.setDoctor(doctor);
		p3.setDoctor(doctor);
		
		Set<Patient>   patients = new  HashSet<Patient>();
		patients.add(p1);
		patients.add(p2);
		patients.add(p3);
		
		doctor.setPatients(patients);
		Session     session=factory.openSession();
		Transaction   tx=session.beginTransaction();
		session.save(p3);
		tx.commit();
		session.close();
	}
}
