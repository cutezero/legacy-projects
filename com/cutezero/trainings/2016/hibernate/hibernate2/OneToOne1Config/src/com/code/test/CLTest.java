package com.code.test;

import com.code.dao.impl.DaoImpl;
import com.code.model.Address;
import com.code.model.Student;

public class CLTest {

	public static void main(String[] args) {

		Student student=null;
		Address address=null;
		
		DaoImpl dao= null;
		student= new Student();
		student.setName("Srikanta");
		student.setAge(24);
		
		address= new Address();
		address.setArea("SR Nagar");
		address.setCity("HYD");
		address.setState("AP");
		address.setZipCode("500509");
		
		student.setAddress(address);
		address.setStudent(student);
		dao= new DaoImpl();
		int result=dao.saveStudent(student, address);
		System.out.println("Result : "+result);

	}

}
