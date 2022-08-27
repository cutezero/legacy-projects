package com.javaconfig.initializers;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.support.AbstractDispatcherServletInitializer;
import org.w3c.dom.views.AbstractView;

import com.javaconfig.config.MvcConfig;
import com.javaconfig.config.RootConfig;

public class JavaConfigAppIntializer extends AbstractDispatcherServletInitializer{

	
	@Override
	protected WebApplicationContext createServletApplicationContext() {
		AnnotationConfigWebApplicationContext webContext=null;
		webContext= new AnnotationConfigWebApplicationContext();
		webContext.register(MvcConfig.class);
		return webContext;
	}

	@Override
	protected String[] getServletMappings() {
		return new String[]{"*.htm"};
	}

	@Override
	protected WebApplicationContext createRootApplicationContext() {
		AnnotationConfigWebApplicationContext rootContext=null;
		rootContext= new AnnotationConfigWebApplicationContext();
		rootContext.register(RootConfig.class);
		return rootContext;
	}
}
