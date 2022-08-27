package com.sathya.hibernate.dao;


import java.util.HashSet;

import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.sathya.hibernate.model.Author;
import com.sathya.hibernate.model.Book;
import com.sathya.hibernate.util.HibernateUtil;

public class MTMDaoImpl implements MTMDao 
{
	private    SessionFactory   factory;
	
	public MTMDaoImpl() {
		factory = HibernateUtil.getSessionFactory();
	}
	@Override
	public void saveBooksWithAuthors() 
	{
		Book   b1= new  Book(1,"java");
		Book   b2 =new  Book(2,"oracle");
		Author   a1 = new  Author(911, "James");
		Author   a2 = new  Author(912, "King");
		Author   a3 = new  Author(913, "Codd");
		
		Set<Author>   collection1 = new  HashSet<Author>();
		collection1.add(a1);
		collection1.add(a2);
		collection1.add(a3);
		
		Set<Author>   collection2 = new  HashSet<Author>();
		collection2.add(a1);
		collection2.add(a3);
		
		b1.setAuthors(collection1);
		b2.setAuthors(collection2);
		
		Session    session=factory.openSession();
		Transaction  tx = session.beginTransaction();
		session.save(b1);
		session.save(b2);
		tx.commit();
		session.close();
	}
}
