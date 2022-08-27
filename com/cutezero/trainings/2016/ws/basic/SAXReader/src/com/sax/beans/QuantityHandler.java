package com.sax.beans;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class QuantityHandler extends DefaultHandler{
	
	private int itemCounter;
	public void startDocument() throws SAXException {
		itemCounter=0;
		System.out.println("Document is reading ...");
	}
	public void startElement(String arg0, String arg1, String arg2,
			Attributes arg3) throws SAXException {
		if(arg2 =="item"){
			itemCounter++;
		}
	}
	public void characters(char[] arg0, int arg1, int arg2) throws SAXException {
		String data= new String(arg0, arg1, arg2);
		//System.out.println(data);
	}
	public void endElement(String arg0, String arg1, String arg2)
			throws SAXException {
	}
	public void endDocument() throws SAXException {
		System.out.println("Total items : "+ itemCounter);
		System.out.println("End of the Document");
	}
}
