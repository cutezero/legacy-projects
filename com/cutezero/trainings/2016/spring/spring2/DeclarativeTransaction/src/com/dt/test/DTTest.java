package com.dt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dt.commands.JobDetailsCommand;
import com.dt.controller.JobController;
import com.dt.exceptions.JobCompanyNotFoundException;

public class DTTest {

	public static void main(String[] args) throws JobCompanyNotFoundException {
		JobDetailsCommand jDCommand= null;

		ApplicationContext context= new ClassPathXmlApplicationContext("com/dt/common/application-context.xml");
		JobController controller=context.getBean("jobController", JobController.class);
		
		jDCommand= new JobDetailsCommand();
		jDCommand.setCompanyId(129);
		jDCommand.setCompanyLocation("Ameerpet");
		jDCommand.setCompanyName("TCS, Hyd");
		jDCommand.setCompanyServiceType("IT and Software");
		jDCommand.setJobNo(1029);
		jDCommand.setJobTitle("Senior Software Lead");
		jDCommand.setJobQualification("B Tech");
		jDCommand.setJobExperience(2);
		jDCommand.setJobDescription("Need good communication skills");

		controller.execute(jDCommand);
		System.out.println("Job has been posted");
	}

}
