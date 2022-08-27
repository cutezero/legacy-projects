package com.msqs.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.msqs.bo.CustomerBo;
import com.msqs.dao.CustomerDao;

public class MSQSTest {

	public static void main(String[] args) {

		ApplicationContext context= new ClassPathXmlApplicationContext("com/msqs/common/application-context.xml");
		CustomerDao customerDao= context.getBean("customerDao", CustomerDao.class);
		List<CustomerBo> customers= null;
		CustomerBo customer= null;
		
/*		customers=customerDao.getCustomersByFirstName("%a%");
		for(CustomerBo customer : customers){
			System.out.println(customer);
		}
*/		
		
/*		customer= customerDao.findCustomerByMobileNo("7381267320");
		System.out.println(customer);
*/	

		customer= new CustomerBo();
		customer.setCustomerNo(25);
		customer.setFirstName("Madhu");
		customer.setLastName("JOshi");
		customer.setMobile("889574905");
		customer.setEmailAddress("madhu@live.com");
		
		int result=customerDao.updateCustomerByMobileNo(customer);
		System.out.println("Result : "+result);
	
	}

}
