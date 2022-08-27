package com.cfn.hibernate.dao;

public class PaymentDaoFactory {
	private static PaymentDao dao;
	public synchronized static PaymentDao getInstance(){
		if (dao==null)
		{
			dao=new PaymentDaoImpl();
		}
		return dao;
	}
}
