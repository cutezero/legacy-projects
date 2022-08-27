package com.cfn.hibernate.dao;

public class EmpDaoFactory {
	private static EmpDao dao;
	private EmpDaoFactory()
	{}
	public synchronized static EmpDao getInstance()
	{
		if (dao==null)
		{
			dao=new EmpDaoImpl();
		}
		return dao;
	}
}
