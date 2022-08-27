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
	
	
	public void sendMail(String to, String sub, String text){
		try {
			SimpleMailMessage mail= new SimpleMailMessage();
			mail.setTo(to);
			mail.setSubject(sub);
			mail.setText(text);
			mailSender.send(mail);
			System.out.println("Your mail sent succesfully");
		} catch (MailException e) {
			System.out.println("Error in Mail sending process");
			e.printStackTrace();
		}
	}
}
