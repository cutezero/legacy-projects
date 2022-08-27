package com.bpp.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.bpp.beans.Book;
import com.bpp.beans.EBook;
import com.bpp.beans.LibraryStatistics;
import com.bpp.beans.Videos;
import com.bpp.helper.BookPostProcessor;

public class BPPAppContextTest {
	
	/**
	 * Using BeanFactor as IOC Container
	 * @param args
	 */
/*	public static void main(String[] args) {	
		BeanFactory factory= new XmlBeanFactory(new ClassPathResource("com/bpp/common/application-context.xml"));
//		BeanPostProcessor postProcessor=factory.getBean("bookPostprocessor", BeanPostProcessor.class);
		BookPostProcessor postProcessor=factory.getBean("bookPostProcessor", BookPostProcessor.class);
		((ConfigurableListableBeanFactory) factory).addBeanPostProcessor(postProcessor);
		System.out.println("Intialy counter: "+LibraryStatistics.getInstanceCounterInt());
		
		Book book=factory.getBean("book", Book.class);
		Book book2=factory.getBean("book", Book.class);
		Book book3=factory.getBean("book", Book.class);
		System.out.println("Finally counter after cretign 3 book: "+LibraryStatistics.getInstanceCounterInt());
		EBook eBook=factory.getBean("eBook", EBook.class);
		EBook eBook2=factory.getBean("eBook", EBook.class);
		EBook eBook3=factory.getBean("eBook", EBook.class);
		System.out.println("Finally counter after creating 3 ebook: "+LibraryStatistics.getInstanceCounterInt());
		Videos videos=factory.getBean("videos", Videos.class);
//		System.out.println(book+"\n "+eBook+"\n "+videos);
		System.out.println("Finally counter: "+LibraryStatistics.getInstanceCounterInt());
	}
*/
	/**
	 * Using ApplicationContext as IOC Container
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("============From ApplicationContext==============");
		ApplicationContext context= new ClassPathXmlApplicationContext("com/bpp/common/application-context.xml");
		System.out.println("Initial counter : "+LibraryStatistics.getInstanceCounterInt());
		context.getBean("book", Book.class);	//4 is the initial value Ex- already 4 book has provided off line
		context.getBean("book", Book.class);	//prototype bean
		context.getBean("book", Book.class);
		context.getBean("eBook", EBook.class);	//singleton Bean
		context.getBean("videos");
		context.getBean("eBook", EBook.class); 	//singleton reference will be returned 
		context.getBean("eBook", EBook.class); 
		context.getBean("eBook", EBook.class);
		System.out.println("Total counter : "+LibraryStatistics.getInstanceCounterInt());
		System.out.println("Number of Book : "+LibraryStatistics.getBookCounterInt());	//4 is the initial value Ex- already 4 book has provided off line
		System.out.println("Number of EBook : "+LibraryStatistics.getEBookCounterInt());	
		System.out.println("Number of Videos : "+LibraryStatistics.getVideosCounterInt());	
	}
}
