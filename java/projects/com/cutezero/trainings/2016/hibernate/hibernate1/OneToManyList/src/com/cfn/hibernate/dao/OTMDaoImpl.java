package com.cfn.hibernate.dao;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.cfn.hibernate.model.Doctor;
import com.cfn.hibernate.model.Patient;
import com.cfn.hibernate.util.HibernateUtil;

public class OTMDaoImpl implements OTMDao {
	private SessionFactory factory;
	public OTMDaoImpl()
	{
		factory=HibernateUtil.getSessionFactory();
	}

	@Override
	public void saveDoctorWithPatients() {
		Doctor doctor= new Doctor();
		doctor.setDoctorId(1001);
		doctor.setDoctorName("Rajani");
		doctor.setQualification("MCA");
		
		Patient p1= new Patient(2001,"Siri","USA");
		Patient p2= new Patient(2002,"Cortana", "WDC");
		Patient p3= new Patient(2003, "Google", "MVW");
		
		Set<Patient> patients= new HashSet<Patient>();
		
		patients.add(p1);
		patients.add(p2);
		patients.add(p3);
		
		doctor.setPatients(patients);
		
		Session session= factory.openSession();
		Transaction tx= session.beginTransaction();
		session.save(doctor);
		tx.commit();
		session.close();
		
	}

	@Override
	public void addPatientToDoctor(Patient p) {
		Session session=factory.openSession();
		Doctor d1=(Doctor) session.get(Doctor.class,1001);
		Set<Patient> patients= d1.getPatients();
		Transaction tx=session.beginTransaction();
		patients.add(p);
		tx.commit();
		session.close();
		
	}

	@Override
	public void removePatientFromDoctor(int patientId) {
		Session session=factory.openSession();
		Doctor d1=(Doctor) session.get(Doctor.class,1001);
		Set<Patient> patients= d1.getPatients();
		Patient p=(Patient)session.get(Patient.class, patientId);
		Transaction tx=session.beginTransaction();
		patients.remove(p);
		tx.commit();
		session.close();
		
	}

	@Override
	public void removeDoctor(int doctorId) {
		Session session=factory.openSession();
		Doctor d1=(Doctor) session.get(Doctor.class,1001);
		Transaction tx=session.beginTransaction();
		session.delete(d1);
		tx.commit();
		session.close();
	}

}
