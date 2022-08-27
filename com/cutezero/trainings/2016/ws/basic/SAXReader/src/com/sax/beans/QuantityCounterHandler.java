package com.sax.beans;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class QuantityCounterHandler extends DefaultHandler {

	private String recentElemnt;
	private int quantity;
	
	public void startDocument() throws SAXException {
		System.out.println("Document reading started ...");
		recentElemnt=null;
		quantity=0;
	}
	public void startElement(String arg0, String arg1, String arg2,
			Attributes arg3) throws SAXException {
		recentElemnt=arg2;
	}
	public void characters(char[] arg0, int arg1, int arg2) throws SAXException {
		if (recentElemnt!=null && recentElemnt.equals("quantity")){
			quantity= quantity+Integer.parseInt(new String(arg0, arg1, arg2));
		}
	}
	public void endElement(String arg0, String arg1, String arg2)
			throws SAXException {
		recentElemnt=null;
		
	}
	public String getRecentElemnt() {
		return recentElemnt;
	}
	public void setRecentElemnt(String recentElemnt) {
		this.recentElemnt = recentElemnt;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	/*public void endDocument() throws SAXException {
		System.out.println("Quantity : "+quantity);
		System.out.println("Document end reached");
	}*/
}
