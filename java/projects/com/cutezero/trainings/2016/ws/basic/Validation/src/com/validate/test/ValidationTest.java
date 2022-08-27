package com.validate.test;

import java.io.File;
import java.io.IOException;

import javax.xml.XMLConstants;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;

import org.xml.sax.SAXException;

public class ValidationTest {

	public static void main(String[] args) throws SAXException, IOException {

		SchemaFactory sFactory = SchemaFactory
				.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
		// Schema poSchema=sFactory.newSchema(new
		// File("G:\\SRIMAN_1\\Workspace\\Validation\\resources\\purchaseOrder2.xsd"));
		// Schema
		// poSchema=sFactory.newSchema(ValidationTest.class.getClassLoader().getResource("META-INF/purchaseOrder2.xsd"));
		Schema poSchema = sFactory
				.newSchema(new StreamSource(
						new File(
								"G:\\SRIMAN_1\\Workspace\\Validation\\src\\META-INF\\purchaseOrder2.xsd")));
		Validator sValidator = poSchema.newValidator();
		sValidator.validate(new StreamSource(new File("G:\\SRIMAN_1\\Workspace\\Validation\\resources\\purchaseOrderWithXsd.xml")));
		System.out.println("valid!!!!");
	}

}
