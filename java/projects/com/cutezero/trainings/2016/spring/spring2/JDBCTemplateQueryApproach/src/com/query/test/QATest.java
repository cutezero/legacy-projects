package com.query.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.query.bo.CustomerBo;
import com.query.bo.CustomerJobSheetBo;
import com.query.bo.JobSheetBo;
import com.query.dao.CustomerDao;

public class QATest {

	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("com/query/common/application-context.xml");
		CustomerDao customerDao=context.getBean("customerDao", CustomerDao.class);
		
//		CustomerDao customerDao2=context.getBean("customerDaoOptimized", CustomerDao.class);
		CustomerDao customerDao3=context.getBean("customerDaoPagination", CustomerDao.class);
/*		int result= customerDao.getNoOfCustomer();
		System.out.println("Result: "+result);
*/		

/*		String result=customerDao.findCustomerFirstName("8895749052");
		System.out.println("FIrstName BY Mobile- Result: "+result);
*/		
		
/*		CustomerBo bo= customerDao.findCustomerByNo(2);
		System.out.println("Customer BY ID- Result: "+bo);
*/	
/*		List<CustomerBo> customers=customerDao.getAllCustomers();
		for(CustomerBo c: customers)
			System.out.println(c);
*/	
/*		List<CustomerJobSheetBo> customersWithJobsheets=customerDao.getCustomersWithJobsheets();
		for(CustomerJobSheetBo c: customersWithJobsheets)
			System.out.println(c);
*/		
/*		List<CustomerJobSheetBo> customersWithJobsheets2=customerDao2.getCustomersWithJobsheets();
		for(CustomerJobSheetBo c: customersWithJobsheets2){
			System.out.println("Cust NO: "+c.getCustomerBo().getCustomerNo());
			for(JobSheetBo j: c.getJobSheets())
				System.out.println("JOB Sheet NO: "+j.getJobSheetNo());
			System.out.println("--------------------------------------");
		}
*/	
/*		List<JobSheetBo> Jobsheets=customerDao3.getAllJobsheets(3, 1);
		System.out.println("---------Latest Data by Descending order-----------------------");
		for(JobSheetBo j: Jobsheets){
			System.out.println("JOB Sheet NO: "+j.getJobSheetNo());
			System.out.println("JOB Sheet : "+j);
		}
*/
/*		List<JobSheetBo> Jobsheets=customerDao.getAllJobsheets(2, 3);
		System.out.println("---------Latest Data by Descending order-----------------------");
		for(JobSheetBo j: Jobsheets){
			System.out.println("JOB Sheet NO: "+j.getJobSheetNo());
			System.out.println("JOB Sheet : "+j);
		}
*/		 	

/*		CustomerBo customerBo = null;
		customerBo = new CustomerBo();
		customerBo.setCustomerNo(8);
		customerBo.setFirstName("Srikanta");
		customerBo.setLastName("Panigrahy");
		customerBo.setMobileNo("8895749052");
		customerBo.setEmailAddress("srikanta@gmail.com");
		int result= customerDao.saveCustomer(customerBo);
		System.out.println("Records inserted : "+result);
*/
	
		
		CustomerBo customerBo = null;
		customerBo = new CustomerBo();
//		customerBo.setCustomerNo(8);
		customerBo.setFirstName("Jagu2");
		customerBo.setLastName("Panigrahy");
		customerBo.setMobileNo("8895749052");
		customerBo.setEmailAddress("srikanta@gmail.com");
		
		long result= customerDao.autoGenSaveCustomer(customerBo);
		System.out.println("Customer No : "+result);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
