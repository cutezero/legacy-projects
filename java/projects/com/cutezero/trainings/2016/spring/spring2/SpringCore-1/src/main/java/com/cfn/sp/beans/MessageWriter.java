package com.cfn.sp.beans;

public class MessageWriter {

	protected IMessageConverter messageConverter;
	public void writeMessage(String message){
	
		String convertedMessage=null;
		convertedMessage=messageConverter.convert(message);
		System.out.println(convertedMessage);
	}
	public void setMessageConverter(IMessageConverter messageConverter) {
		this.messageConverter = messageConverter;
	}
	
	
}