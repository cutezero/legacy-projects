package com.sax.beans;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;


public class PrintHandler1 extends DefaultHandler{

	public void characters(char[] arg0, int arg1, int arg2) throws SAXException {
		String data= new String(arg0, arg1, arg2);
		System.out.print(data);
	}

	public void endDocument() throws SAXException {
		System.out.println("The given Document has been read completely");
	}

	public void endElement(String arg0, String arg1, String arg2)
			throws SAXException {
		System.out.println("</"+arg2+">");
	}

	public void startDocument() throws SAXException {
		System.out.println("The given Document has been started reading");
	}

	public void startElement(String arg0, String arg1, String arg2,
			Attributes arg3) throws SAXException {
		System.out.print("<"+arg2+">");
	}
	
}
