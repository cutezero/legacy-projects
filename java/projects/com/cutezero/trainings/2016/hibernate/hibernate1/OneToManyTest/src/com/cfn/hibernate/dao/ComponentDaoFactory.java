package com.cfn.hibernate.dao;

public class ComponentDaoFactory {
	private static ComponentDao dao;
	private ComponentDaoFactory()
	{}
	public static synchronized ComponentDao getInsstance()
	{
		if (dao==null)
		{
			dao=new ComponentDaoImpl();
		}
		return dao;
	}
	
}
