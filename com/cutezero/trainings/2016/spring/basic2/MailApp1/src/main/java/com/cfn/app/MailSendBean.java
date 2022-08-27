package com.cfn.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class MailSendBean {

	@Autowired
	private JavaMailSenderImpl mailSender;
	
	@Scheduled(cron= "0 47 18 * * ?")
	public void sendMail(){
		try {
			SimpleMailMessage mail= new SimpleMailMessage();
			mail.setTo("srikanta.ydon@live.com");
			mail.setSubject("Hi this is your Subject Line");
			mail.setText("Hey This is your Body text area ");
			mailSender.send(mail);
			System.out.println("Your mail sent succesfully");
		} catch (MailException e) {
			System.out.println("Error in Mail sending process");
			e.printStackTrace();
		}
	}
}
