package com.ifmi.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.ifmi.beans.ICICIStockFinder;

public class IFMITest {

	/**
	 * If there is an external application, and we want to call a method on that application 
	 * to get a business functionality. So in this scenario we may go for an example like 
	 * BSEStockTrade is an EJB application which have all the information about the stock price 
	 * of each company and we want the stock price of a company then we need to approach BSE App
	 * So here we can use of a tricky concept called Instance factory method instantiation
	 * @param args
	 */
	public static void main(String[] args) {
		
		//logic without IOC container
/*		ICICIStockFinder finder=new ICICIStockFinder();
		double price= finder.getStockPrice("cipla");
		System.out.println(price);
		System.out.println("DONE");
*/	
		BeanFactory factory=new XmlBeanFactory(new ClassPathResource("com/ifmi/commons/application-context.xml"));
		ICICIStockFinder stockFinder=factory.getBean("iCICIStockFinder", ICICIStockFinder.class);
		double price=stockFinder.getStockPrice("jio");
		System.out.println(price);
	
	}

}
