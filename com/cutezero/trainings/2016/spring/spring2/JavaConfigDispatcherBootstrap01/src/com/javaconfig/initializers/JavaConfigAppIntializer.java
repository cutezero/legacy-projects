package com.javaconfig.initializers;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import com.javaconfig.config.MvcConfig;
import com.javaconfig.config.RootConfig;

public class JavaConfigAppIntializer implements WebApplicationInitializer{

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		AnnotationConfigWebApplicationContext rootContext=null;
		AnnotationConfigWebApplicationContext webContext=null;
		ContextLoaderListener contextLoaderListener= null;
		DispatcherServlet dispatcherServlet= null;
		
		rootContext= new AnnotationConfigWebApplicationContext();
		rootContext.register(RootConfig.class);
		contextLoaderListener = new ContextLoaderListener(rootContext);
		servletContext.addListener(contextLoaderListener);
		
		webContext= new AnnotationConfigWebApplicationContext();
		webContext.register(MvcConfig.class);
		dispatcherServlet= new DispatcherServlet(webContext);
		ServletRegistration.Dynamic dynamic= servletContext.addServlet("dispatcher", dispatcherServlet);
		dynamic.setLoadOnStartup(2);;
		dynamic.addMapping("*.htm");
		
	}
}
