package com.app.i18n.test;

import java.util.Locale;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.MessageSource;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class I18NTest {

	public static void main(String[] args) {
/*		BeanFactory beanFactory=new XmlBeanFactory(new ClassPathResource("com/app/i18n/common/application-context.xml"));
		MessageSource messageSource=beanFactory.getBean("messageSource", MessageSource.class);
		
		//the 2nd parameter takes Object[] args from {0}, {1}(comes from messageBundle) to filled by some content at development time
		String s=messageSource.getMessage("home.header", null, Locale.getDefault());
		System.out.println("Home header : "+s);
		String s2=messageSource.getMessage("error.header", null, Locale.getDefault());
		System.out.println("Error Header : "+s2);
		
		//The below lines are same one is using place-holder from ResourceBundle and another is direct value
		String errorEmail=messageSource.getMessage("error.email",null, Locale.getDefault());
		String errorEmail2=messageSource.getMessage("error.field",new Object[]{"Email"}, Locale.getDefault());
		String errorContact=messageSource.getMessage("error.field",new Object[]{"Contact"}, Locale.getDefault());
		String errorRollNO=messageSource.getMessage("error.field",new Object[]{"RollNo"}, Locale.getDefault());
		String errorPasswordMatch=messageSource.getMessage("error.field2",new Object[]{"Password ", "Confirm Password "}, Locale.getDefault());
		System.out.println("errorEmail : "+errorEmail+"\n errorEmail2 : "+errorEmail+"\n errorContact : "+errorContact);
		System.out.println("errorROllNO : "+errorRollNO+"\n errorPasswordMatch: "+errorPasswordMatch+"\n errorContact : "+errorContact);
		
		System.out.println("DONE");
*/

		//By accessing with different name as id for the ResourceBundleMessageSource	//#2
/*		BeanFactory beanFactory=new XmlBeanFactory(new ClassPathResource("com/app/i18n/common/application-context.xml"));	//#2
		MessageSource messageSource=beanFactory.getBean("messageSource2", MessageSource.class);
		
		String s=messageSource.getMessage("home.header", null, Locale.getDefault());
		System.out.println("Home header : "+s);
*/		
/*		ApplicationContext context=new ClassPathXmlApplicationContext("com/app/i18n/common/application-context.xml");	//#3
		MessageSource messageSource=context.getBean("messageSource", MessageSource.class);
		
		String s=messageSource.getMessage("home.header", null, Locale.getDefault());
		System.out.println("Home header : "+s);
		*/
		ApplicationContext context=new ClassPathXmlApplicationContext("com/app/i18n/common/application-context.xml");	//#3
		
//		String s=context.getMessage("home.header", null, Locale.getDefault());
		String s=context.getMessage("home.header", null, Locale.CANADA);
//		String s=context.getMessage("error.header", null, Locale.CANADA);
		
		System.out.println("Home header : "+s);
		Locale localeS=Locale.CANADA;
		System.out.println("Locale : "+localeS);
	}
}