package com.cfn.hibernate.dao;

public class EmployeeDaoFactory {
	private static EmployeeDao dao;
	private EmployeeDaoFactory()
	{}
	public synchronized static EmployeeDao getInstance()
	{
		if (dao==null)
		{
			dao=new EmployeeDaoImpl();
		}
		return dao;
	}
}
