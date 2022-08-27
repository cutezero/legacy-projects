package com.javaconfig.config;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerMapping;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.handler.SimpleUrlHandlerMapping;
import org.springframework.web.servlet.mvc.Controller;
import org.springframework.web.servlet.mvc.ParameterizableViewController;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
public class MvcConfig {

	@Bean
	public HandlerMapping simpleUrlHandlerMapping(){
		SimpleUrlHandlerMapping handlerMapping= null;
		
		handlerMapping=new SimpleUrlHandlerMapping();
		Properties mappings= new Properties();
		mappings.put("/careers.htm", "viewCareersController");
		handlerMapping.setMappings(mappings);
		
		return handlerMapping;
	}
	
	@Bean
	public ViewResolver internalResourseViewResolver(){
		InternalResourceViewResolver viewResolver= null;
		viewResolver= new InternalResourceViewResolver();
		viewResolver.setPrefix("/WEB-INF/jsp/");
		viewResolver.setSuffix(".jsp");
		
		return viewResolver;
	}
	
	@Bean("viewCareersController")
	public Controller viewCareersController(){
		ParameterizableViewController viewController= null;
		
		viewController= new ParameterizableViewController();
		viewController.setViewName("careers");
		return viewController;
	}
}
