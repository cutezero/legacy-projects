package com.bpp.helper;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import com.bpp.beans.Book;
import com.bpp.beans.EBook;
import com.bpp.beans.LibraryStatistics;
import com.bpp.beans.Videos;

public class BookPostProcessor implements BeanPostProcessor {


	@Override
	public Object postProcessBeforeInitialization(Object object, String beanName) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("From postProcessBeforeInitialization : ");
		return object;
	}
	
	@Override
	public Object postProcessAfterInitialization(Object object, String beanName) throws BeansException {
		System.out.println("From postProcessAfterInitialization : \n Object : "+object+"\n Bean Name : "+beanName);
		if (object instanceof Book || object instanceof EBook || object instanceof Videos)
			LibraryStatistics.increment();
		if (object instanceof Book)
			LibraryStatistics.incrementBook();
		if (object instanceof EBook)
			LibraryStatistics.incrementEBook();
		if (object instanceof Videos)
			LibraryStatistics.incrementVideos();
		return object;
	}


	
}
