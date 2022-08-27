package com.sax2.test;

import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;

import com.sax2.beans.Send2DBHandler;


public class SRTest {

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException, ClassNotFoundException {
		SAXParserFactory factory=SAXParserFactory.newInstance();
		SAXParser parser=factory.newSAXParser();
		Send2DBHandler handler=new Send2DBHandler();
		parser.parse(new File("G:\\SRIMAN_1\\Workspace\\SAXReader2DB\\resources\\purchaseOrder.xml"), handler);
		
		
		/*System.out.println("Total Price = "+(quantity*price1));*/
		System.out.println("DONE");
	}

}
