package com.pe.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.pe.beans.Book;

public class PETest {

	public static void main(String[] args) {
		BeanFactory factory=new XmlBeanFactory(new ClassPathResource("com/pe/common/application-context.xml"));
		Book book=factory.getBean("book", Book.class);
		System.out.println("ISBN : "+book.getIsbn());
		System.out.println("Title : "+book.getTitle());
		System.out.println("PublishedDate : "+book.getPublishedDate());
		System.out.println("Website : "+book.getWebsite());
		System.out.println("Authors : "+book.getAuthors());
		System.out.println("file Location : "+book.getDocument());
	}

}
