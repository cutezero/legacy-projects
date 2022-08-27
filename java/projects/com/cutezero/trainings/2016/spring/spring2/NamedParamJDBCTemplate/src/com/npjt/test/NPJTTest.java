package com.npjt.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.npjt.bo.CustomerBo;
import com.npjt.dao.CustomerDao;

public class NPJTTest {

	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("com/npjt/common/application-context.xml");
		CustomerDao customerDao= context.getBean("customerDao", CustomerDao.class);
		
		CustomerBo cBo= new CustomerBo();
		cBo.setCustomerNo(26);
		cBo.setFirstName("Bhabani");
		cBo.setLastName("Panigrahy");
		cBo.setMobile("90456723");
		cBo.setEmailAddress("luckyk12@hotmail.com");
		
		
		
/*		int result= customerDao.updateCustomer(cBo);
		System.out.println("Result : "+result);
*/
	
		/*List<CustomerBo> customers= customerDao.getCustomerByName("%a", "%p%");
		for(CustomerBo c: customers)
			System.out.println(c.getFirstName());
		*/
		
//		customerDao.saveCustomer(cBo);
/*		customerDao.insertCustomer(cBo);
		System.out.println("Inserted");
		System.out.println(" Obj :"+cBo);
*/	
		customerDao.callProcedure();
		
	}

}
