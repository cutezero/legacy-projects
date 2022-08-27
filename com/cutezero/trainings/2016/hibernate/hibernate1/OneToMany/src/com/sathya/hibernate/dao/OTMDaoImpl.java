package com.sathya.hibernate.dao;

import java.util.Scanner;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.sathya.hibernate.model.Doctor;
import com.sathya.hibernate.model.Patient;
import com.sathya.hibernate.util.HibernateUtil;

public class OTMDaoImpl implements OTMDao 
{
	private SessionFactory factory;
	private Session session;
	public OTMDaoImpl() {
		factory=HibernateUtil.getSessionFactory();
	}

	public void saveDoctorWithPatients(Doctor doctor) {
		session=factory.openSession();
		Transaction tx=session.beginTransaction();
		session.save(doctor);
		tx.commit();
		session.close();
	}
	public void addPatientToDoctor(Patient  p) {
		session=factory.openSession();
		Doctor doctor=(Doctor)session.get(Doctor.class,1101);
		Set<Patient> patients = doctor.getPatients();
		Transaction tx = session.beginTransaction();
		patients.add(p);
		tx.commit();
		session.close();
	}
	public void removePatientFromDoctor(int doctorId, int patientId) {
		session=factory.openSession();
		Doctor doctor=(Doctor)session.get(Doctor.class, doctorId);
		Set<Patient> patients = doctor.getPatients();
		Patient p =(Patient)session.get(Patient.class, patientId);		
		Transaction   tx = session.beginTransaction();
		patients.remove(p);
		tx.commit();
		session.close();
	}
	public void removeDoctor(int  doctorId) {
		session=factory.openSession();
		Doctor doctor=(Doctor)session.get(Doctor.class, doctorId);
		Transaction tx = session.beginTransaction();
		session.delete(doctor);
		tx.commit();
		session.close();
	}
}
