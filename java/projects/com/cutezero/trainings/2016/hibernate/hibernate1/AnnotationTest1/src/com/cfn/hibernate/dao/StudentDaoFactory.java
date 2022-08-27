package com.cfn.hibernate.dao;

public class StudentDaoFactory {
	private static StudentDao dao;
	private StudentDaoFactory(){}
	public synchronized static StudentDao getInstance()
	{
		if (dao==null)
		{
			dao=new StudentDaoImpl();
		}
		return dao;
	}
}
