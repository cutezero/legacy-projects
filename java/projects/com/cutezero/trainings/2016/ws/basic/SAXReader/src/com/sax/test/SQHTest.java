package com.sax.test;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;

import com.sax.beans.QuantityHandler;


public class SQHTest {

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		SAXParserFactory factory= SAXParserFactory.newInstance();
		SAXParser parser=factory.newSAXParser();
		System.out.println("First XML parsing data");
		parser.parse(new File("G:\\SRIMAN_1\\Workspace\\SAXReader\\resources\\purchaseOrder.xml"), new QuantityHandler());
		System.out.println("2nd XML parsing data");
		parser.parse(new File("G:\\SRIMAN_1\\Workspace\\SAXReader\\resources\\purchaseOrder2.xml"), new QuantityHandler());
		System.out.println("Completed.");
	}

}
