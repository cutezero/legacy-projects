package com.cfn.app;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.TextMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

@Service
public class JmsMessageReceiver {

	@Autowired
	private JmsTemplate jmsTemplate;
	
	public void receive() throws JMSException{
		Message message= jmsTemplate.receive();
		
		if (message instanceof Message){
			TextMessage textMessage= (TextMessage)message;
			System.out.println("Received :" +textMessage.getText());
		}
	}
}
