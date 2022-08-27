package com.mvc.annot.initializers;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

//public class AppInitializer implements ServletContainerInitializer{	//for J2EE (spring internally implemented it
public class AppInitializer implements WebApplicationInitializer{

	public void onStartup(ServletContext servletContext) throws ServletException {
		
		WebApplicationContext webApplicationContext= null;
		DispatcherServlet dispatcherServlet= null;
		
		webApplicationContext= new XmlWebApplicationContext();
//		webApplicationContext.
		dispatcherServlet= new DispatcherServlet(webApplicationContext);
		dispatcherServlet.setContextConfigLocation("WEB-INF/dispatcher-servlet.xml");
		
		ServletRegistration.Dynamic dynamic= servletContext.addServlet("dispatcher", dispatcherServlet);
		dynamic.setLoadOnStartup(1);
		dynamic.addMapping("*.htm");
		
	}

	
}
