package com.sax.test;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;

import com.sax.beans.QuantityCounterHandler;

public class QCHTest {

	public static void main(String[] args) throws SAXException, IOException, ParserConfigurationException {
		SAXParserFactory factory=SAXParserFactory.newInstance();
		SAXParser parser=factory.newSAXParser();
		QuantityCounterHandler handler=new QuantityCounterHandler();
		parser.parse(new File("G:\\SRIMAN_1\\Workspace\\SAXReader\\resources\\purchaseOrder2.xml"),handler );
		System.out.println("Quantity : "+handler.getQuantity());
		System.out.println("DONE");
	}

}
