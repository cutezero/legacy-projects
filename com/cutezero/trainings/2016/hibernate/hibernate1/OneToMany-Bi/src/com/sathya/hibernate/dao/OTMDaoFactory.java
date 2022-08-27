package com.sathya.hibernate.dao;

public class OTMDaoFactory {
	private static OTMDao dao;
	private OTMDaoFactory (){}
	public synchronized static OTMDao getInstance()
	{
		if (dao==null)
		{
			dao= new OTMDaoImpl();
		}
		return dao;
	}

}
