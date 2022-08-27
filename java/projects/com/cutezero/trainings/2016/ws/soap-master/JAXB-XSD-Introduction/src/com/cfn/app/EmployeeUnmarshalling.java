package com.cfn.app;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import com.cfn.xsds.Employee;

public class EmployeeUnmarshalling {

	public static void main(String[] args) {
		try{
			JAXBContext c= JAXBContext.newInstance(Employee.class);
			Unmarshaller m= c.createUnmarshaller();
			Object o=m.unmarshal(new File("G:/Others/emp.xml"));
			Employee emp= (Employee)o;
			System.out.println("Emp Id: " +emp.getEid());
			System.out.println("Emp Name: " +emp.getEname());
			System.out.println("Emp Salary: " +emp.getEsal());
			System.out.println("done");
		}catch(Exception e){}


	}

}
