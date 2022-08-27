package com.quickboot.initializers;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;
import org.springframework.web.servlet.support.AbstractDispatcherServletInitializer;

public class AppInitializer extends AbstractDispatcherServletInitializer{

	@Override
	protected WebApplicationContext createServletApplicationContext() {
		XmlWebApplicationContext webApplicationContext= null;
		
		webApplicationContext= new XmlWebApplicationContext();
		webApplicationContext.setConfigLocation("/WEB-INF/root-application-context.xml");
		return webApplicationContext;
	}

	@Override
	protected String[] getServletMappings() {
		return new String[]{"*.mvc"};
	}

	@Override
	protected WebApplicationContext createRootApplicationContext() {
		XmlWebApplicationContext webApplicationContext=null;
		
		webApplicationContext= new XmlWebApplicationContext();
		webApplicationContext.setConfigLocation("/WEB-INF/web-beans.xml");
		// TODO Auto-generated method stub
		return webApplicationContext;
	}

	
}
