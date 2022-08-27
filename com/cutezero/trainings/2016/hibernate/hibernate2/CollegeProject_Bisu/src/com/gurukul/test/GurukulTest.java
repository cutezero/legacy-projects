package com.gurukul.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.gurukul.dao.GurukulDaoImpl;
import com.gurukul.model.Address;
import com.gurukul.model.Course;
import com.gurukul.model.Student;
import com.gurukul.model.Subject;
import com.gurukul.util.SessionFactoryRegistry;

public class GurukulTest {

	public static void main(String[] args) {
       
		GurukulDaoImpl dao=new GurukulDaoImpl();
		
		Subject sbj1=new Subject();
		sbj1.setSubjectId(104);
		sbj1.setName("java");
		
		Subject sbj2=new Subject();
		sbj2.setSubjectId(105);
		sbj2.setName("C");
		
		Subject sbj3=new Subject();
		sbj3.setSubjectId(106);
		sbj3.setName("C++");
	
		List<Subject> sublist=Arrays.asList(sbj1,sbj2,sbj3);
		
		Student sd1=new Student();
		sd1.setName("Nadu");
		sd1.setAge(25);
		
		Student sd2=new Student();
		sd2.setName("Nadu");
		sd2.setAge(25);
		
		Student sd3=new Student();
		sd3.setName("Nadu");
		sd3.setAge(25);
		
		List<Student> stdlist=Arrays.asList(sd1,sd2,sd3);
		
		Course crs=new Course();
		crs.setCourseId(301);
		crs.setCourseName("Mech");
		crs.setFee(5000);
		crs.setStudent(stdlist);
		crs.setSubject(sublist);
		
		Address adr=new Address();
		adr.setState("Odisha");
		adr.setPin(123456);
		adr.setPhNo(917364825);
		adr.setStudent(sd1);
		
		dao.save(adr, crs);
		SessionFactoryRegistry.closeSessionFactory();
	}

}
