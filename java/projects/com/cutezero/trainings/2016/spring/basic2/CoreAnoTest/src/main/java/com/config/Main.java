package com.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.pack.MovieLister;

public class Main {

	public static void main(String[] args) 
	{
		ApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		MovieLister lister=(MovieLister)ctx.getBean("movieLister");
		lister.printMoviesByYear();
	}

}
