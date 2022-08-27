package com.cfn.app;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.MailException;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

@Service
public class MailSendBean {

	@Autowired
	private JavaMailSenderImpl mailSender;
	
	public void sendMail(){
		try {
			MimeMessage msg=mailSender.createMimeMessage();
			MimeMessageHelper helper= new MimeMessageHelper(msg, true);
			helper.setTo("srikanta.ydon@live.com");
			helper.setSubject("whoa what a subject line");
			helper.setText("Oh Come on it can't be a Body text");
			FileSystemResource file= new FileSystemResource("G:/demo.jpeg");
			helper.addAttachment("Hello.png", file);
			mailSender.send(msg);
			System.out.println("Sent Succesfully");
		} catch (MailException e) {
			System.out.println(" Error in sending mail");
			e.printStackTrace();
		} catch (MessagingException e) {
			System.out.println(" Could not send mail");
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
