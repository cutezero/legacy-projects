package com.dscl.initializers;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.XmlWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

//	public class ApplicationInitializer implements ServletContainerInitializer{	//for J2EE environment
public class ApplicationInitializer implements WebApplicationInitializer{	//for Spring environment

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		XmlWebApplicationContext rootWebApplicationContext= null;
		ContextLoaderListener contextLoaderListener= null;
		XmlWebApplicationContext mvcWebApplicationContext= null;
		DispatcherServlet dispatcherServlet= null;
		ServletRegistration.Dynamic dynamic=null;	//Inner interface presented in ServletRegistration interface
		
		//register the ContextLoaderListener by providing business level spring bean config file
		rootWebApplicationContext= new XmlWebApplicationContext();
		rootWebApplicationContext.setConfigLocation("WEB-INF/application-context.xml");
		contextLoaderListener= new ContextLoaderListener(rootWebApplicationContext);
		servletContext.addListener(contextLoaderListener);
		
		//register the DispatcherServlet by providing mvc level spring bean config file
		mvcWebApplicationContext= new XmlWebApplicationContext();
		mvcWebApplicationContext.setConfigLocation("WEB-INF/dispatcher-servlet.xml");
		dispatcherServlet= new DispatcherServlet(mvcWebApplicationContext);
		dynamic=servletContext.addServlet("dispatcher", dispatcherServlet);
		dynamic.setLoadOnStartup(2);
		dynamic.addMapping("*.htm");
		
		
	}

	
}
