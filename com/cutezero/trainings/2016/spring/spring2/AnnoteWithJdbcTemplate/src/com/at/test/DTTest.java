package com.at.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.at.commands.JobDetailsCommand;
import com.at.config.RootAppConfig;
import com.at.controller.JobController;
import com.at.exceptions.JobPostFailedException;

public class DTTest {

	public static void main(String[] args) throws JobPostFailedException {
		JobDetailsCommand jDCommand= null;

		ApplicationContext context= new AnnotationConfigApplicationContext(RootAppConfig.class);
		JobController controller=context.getBean("jobController", JobController.class);
		
		jDCommand= new JobDetailsCommand();
		jDCommand.setCompanyId(131);
		jDCommand.setCompanyLocation("Ameerpet");
		jDCommand.setCompanyName("TCS, Hyd");
		jDCommand.setCompanyServiceType("IT and Software");
		jDCommand.setJobNo(1031);
		jDCommand.setJobTitle("Senior Software Lead");
		jDCommand.setJobQualification("B Tech");
		jDCommand.setJobExperience(2);
		jDCommand.setJobDescription("Need good communication skills");

		controller.execute(jDCommand);
		System.out.println("Job has been posted");
	}

}
