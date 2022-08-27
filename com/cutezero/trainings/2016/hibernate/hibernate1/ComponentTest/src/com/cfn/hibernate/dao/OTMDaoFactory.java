package com.cfn.hibernate.dao;

public class OTMDaoFactory {
	public static OTMDao dao;
	private OTMDaoFactory(){}
	public static synchronized OTMDao getInstance()
	{
		if (dao==null)
		{
			dao= new OTMDaoImpl();
		}
		return dao;
	}
}
