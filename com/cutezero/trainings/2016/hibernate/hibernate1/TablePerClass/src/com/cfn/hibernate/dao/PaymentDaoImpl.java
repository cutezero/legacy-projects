package com.cfn.hibernate.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.cfn.hibernate.model.Card;
import com.cfn.hibernate.model.Cheque;
import com.cfn.hibernate.util.HibernateUtil;

public class PaymentDaoImpl implements PaymentDao {
	private SessionFactory factory;
	public PaymentDaoImpl()
	{
		factory=HibernateUtil.getSessionFactory();
	}
	@Override
	public void saveCard(Card card) {
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		session.save(card);
		tx.commit();
		session.close();
	}

	@Override
	public void saveCheque(Cheque cheque) {
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		session.save(cheque);
		tx.commit();
		session.close();
	}

}
