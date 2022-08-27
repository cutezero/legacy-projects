package com.validate.test;

import java.io.File;
import java.io.IOException;

import javax.xml.XMLConstants;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;

import org.xml.sax.SAXException;

import com.validate.sax.beans.SAXPrintHandler;

public class ValidationWhileParse {

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		SchemaFactory schemaFactory=SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
		Schema schema=schemaFactory.newSchema(new StreamSource(new File("G:\\SRIMAN_1\\Workspace\\Validation\\src\\META-INF\\purchaseOrder2.xsd")));
		
		SAXParserFactory factory=SAXParserFactory.newInstance();
		factory.setSchema(schema);
		//factory.setValidating(true);
		//factory.setSchema(new StreamSource(new File("G:\\SRIMAN_1\\Workspace\\Validation\\src\\META-INF\\purchaseOrder2.xsd")));
		SAXParser parser=factory.newSAXParser();
		parser.parse(new File("G:\\SRIMAN_1\\Workspace\\Validation\\resources\\purchaseOrderWithXsd.xml"), new SAXPrintHandler());
	}
}
