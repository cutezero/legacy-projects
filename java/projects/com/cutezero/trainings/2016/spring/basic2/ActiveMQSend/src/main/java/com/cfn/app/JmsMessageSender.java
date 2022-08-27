package com.cfn.app;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Service;

@Service
public class JmsMessageSender {

	@Autowired
	private JmsTemplate jmsTemplate;
	
	public void send(final String text){
		this.jmsTemplate.send(new MessageCreator(){
			public Message createMessage(Session session) throws JMSException{
				Message message=session.createTextMessage(text);
				return message;
			}			
		});
	}
}
