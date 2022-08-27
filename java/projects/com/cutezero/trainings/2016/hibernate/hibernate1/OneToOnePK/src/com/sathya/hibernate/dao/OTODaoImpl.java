package com.sathya.hibernate.dao;

import java.text.SimpleDateFormat;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.sathya.hibernate.model.Passport;
import com.sathya.hibernate.model.Person;
import com.sathya.hibernate.util.HibernateUtil;

public class OTODaoImpl implements OTODao 
{
	private  SessionFactory   factory;
	public OTODaoImpl() {
		factory = HibernateUtil.getSessionFactory();
	}
	@Override
	public void savePassportWithPerson()
	{
		Person  person = new  Person();
		person.setPersionId(1011012);
		person.setPersonName("Pankaj");
		
		Passport   passport = new  Passport();
		//passport.setPassportNumber(2020334);
		try
		{
			SimpleDateFormat   sdf =new  SimpleDateFormat("dd-MMM-yy");
			java.util.Date  expireDate = sdf.parse("21-DEC-19");
			passport.setExpireDate(expireDate);
		}
		catch(Exception  e)
		{   }
		
		passport.setPerson(person);
		Session  session = factory.openSession();
		session.beginTransaction();
		session.save(passport);
		session.getTransaction().commit();
		session.close();
	}
}
