package com.np.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.np.components.Person;

public class NPTest {

	/**This program demonstrates that how we can pass null value 
	 * to a String as a value to our dependency 
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		BeanFactory beanFactory= new XmlBeanFactory(new ClassPathResource("com/np/common/application-context.xml"));
		Person person=beanFactory.getBean("person", Person.class);
		System.out.println(person);
		
	}
}
