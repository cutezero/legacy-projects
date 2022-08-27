package com.sb.bootapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

import com.sb.config.JavaConfig;

@SpringBootApplication(scanBasePackages = { "com.sb.dao", "com.sb.controller", "com.sb.service" })
@Import(JavaConfig.class)
@ImportResource("classpath:security-beans.xml")
public class SecondBootApp {

	public static void main(String[] args) throws Exception {
		// ApplicationContext context=
		SpringApplication.run(SecondBootApp.class, args);
		/**
		 * The following lines was written to work with spring jdbc as a core
		 * application
		 */
		/*
		 * ContactDao contactDao=context.getBean("contactDao",
		 * ContactDao.class); List<ContactBo> contact=
		 * contactDao.getContactsByMobile(); for(ContactBo bo : contact){
		 * System.out.println(bo.getContactName()); }
		 */
	}

}
