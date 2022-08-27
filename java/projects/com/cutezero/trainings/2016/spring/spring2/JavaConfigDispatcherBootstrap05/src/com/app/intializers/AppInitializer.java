package com.app.intializers;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;
import org.springframework.web.servlet.support.AbstractDispatcherServletInitializer;

public class AppInitializer extends AbstractDispatcherServletInitializer{

	@Override
	protected WebApplicationContext createServletApplicationContext() {
		XmlWebApplicationContext servletApplication= null;
		servletApplication= new XmlWebApplicationContext();
		servletApplication.setConfigLocation("/WEB-INF/servlet-config.xml");
		return servletApplication;
	}

	@Override
	protected String[] getServletMappings() {
		return new String[]{"*.action"};
	}

	@Override
	protected WebApplicationContext createRootApplicationContext() {
		XmlWebApplicationContext rootApplicationContext= null;
		rootApplicationContext= new XmlWebApplicationContext();
		rootApplicationContext.setConfigLocation("/WEB-INF/root-config.xml");
		return rootApplicationContext;
	}
}
