package com.cfn.xsds;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

public class EmployeeMarshalleing {

	public static void main(String[] args) {
		Employee emp= new Employee();
		emp.setEid(12);
		emp.setEname("QWWE");
		emp.setEsal(23.45);
		try{
			JAXBContext c= JAXBContext.newInstance(Employee.class);
			Marshaller m= c.createMarshaller();
			m.marshal(emp, new File("G:/Others/emp.xml"));
			System.out.println("done");
		}catch(Exception e){}
	}
}
