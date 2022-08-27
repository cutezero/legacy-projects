package com.cfn.test;

import com.cfn.beans.IMessageConverter;
import com.cfn.beans.MessageWriter;
import com.cfn.util.AppClassesFactory;
import com.cfn.util.MessageConverterFactory;

public class MessageTest {
	public static void main(String[] args) {
		IMessageConverter messageConverter=(IMessageConverter) AppClassesFactory.createObject("messageConverter.class");
		MessageWriter messageWriter=(MessageWriter) AppClassesFactory.createObject("messageWriter.class");
		messageWriter.setMessageConverter(messageConverter);
		messageWriter.writeMessage("Hello");
	}

}
