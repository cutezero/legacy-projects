package com.jdbctemplate.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jdbctemplate.bo.CustomerBo;
import com.jdbctemplate.dao.CustomerDao;

public class SJTest {

	public static void main(String[] args) {
		List<CustomerBo> customers = null;

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/jdbctemplate/common/application-context.xml");
		CustomerDao customerDao = context.getBean("customerDao", CustomerDao.class);
		customers = customerDao.getCustomers("sri");
		for (CustomerBo customer : customers)
			System.out.println(customer);
		
//		System.out.println(customers);	//#5
		System.out.println("DONE");

	}

}
