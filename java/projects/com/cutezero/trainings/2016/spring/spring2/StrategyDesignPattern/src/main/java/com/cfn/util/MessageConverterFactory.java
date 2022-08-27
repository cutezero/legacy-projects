package com.cfn.util;

import com.cfn.beans.HTMLMessageConverter;
import com.cfn.beans.IMessageConverter;
import com.cfn.beans.PDFMessageConverter;

public class MessageConverterFactory {

	private static IMessageConverter messageConverter;

	public static IMessageConverter getMessageConverter(String type) {
		if (type.equalsIgnoreCase("html")) {
			messageConverter = new HTMLMessageConverter();
		} else if (type.equalsIgnoreCase("pdf")) {
			messageConverter = new PDFMessageConverter();
		}
		return messageConverter;
	}
}
