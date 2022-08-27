package com.sax.test;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;

import com.sax.beans.PrintHandler1;

public class PHTest {

	public static void main(String[] args) throws SAXException, IOException, ParserConfigurationException {
		// TODO Auto-generated method stub

		SAXParserFactory factory=SAXParserFactory.newInstance();
		SAXParser parser=factory.newSAXParser();
		PrintHandler1 handler=new PrintHandler1();
		//parser.parse(new File("G:\\SRIMAN_1\\Workspace\\SAXReader\\resources\\purchaseOrder.xml"), handler);
		parser.parse(new File("G:\\SRIMAN_1\\Workspace\\SAXReader\\resources\\purchaseOrder.xml"), handler);
		
	}

}
