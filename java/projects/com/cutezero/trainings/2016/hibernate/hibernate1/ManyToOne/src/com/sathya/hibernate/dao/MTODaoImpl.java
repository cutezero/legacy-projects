package com.sathya.hibernate.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.sathya.hibernate.model.Doctor;
import com.sathya.hibernate.model.Patient;
import com.sathya.hibernate.util.HibernateUtil;

public class MTODaoImpl implements MTODao
{
	private    SessionFactory    factory;
	public MTODaoImpl() {
		factory=HibernateUtil.getSessionFactory();
	}

	@Override
	public void savePatientWithDoctor() 
	{
		Doctor   doctor=new  Doctor();
		doctor.setDoctorId(1101);
		doctor.setDoctorName("PANKAJ");
		doctor.setQualification("MS");
		
		Patient   p1 = new   Patient(9001,"A","HYD");
		Patient   p2 = new   Patient(9002,"B","Delhi");
		Patient   p3 = new   Patient(9003,"C","Delhi");
		p1.setDoctor(doctor);
		p2.setDoctor(doctor);
		p3.setDoctor(doctor);
		Session    session=factory.openSession();
		Transaction   tx = session.beginTransaction();
		//session.save(p1);
	 	session.save(p2);
		session.save(p3);
		tx.commit();
		session.close();
	}
	@Override
	public void removePatient(int patientId) 
	{
		Session    session=factory.openSession();
		Patient   patient=(Patient)session.get(Patient.class, patientId);
		Transaction    tx = session.beginTransaction();
		session.delete(patient);
		tx.commit();
		session.close();
	}
}
