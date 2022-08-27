package com.dom.beans;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;

public class DOMPrinterTest {

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		DocumentBuilderFactory builderFactory= DocumentBuilderFactory.newInstance();
		DocumentBuilder builder=builderFactory.newDocumentBuilder();
		Document document=builder.parse(new File("G:\\SRIMAN_1\\Workspace\\DOMReader\\resources\\purchaseOrder.xml"));
		Node rootNode=document.getFirstChild();
		Node node=document.getFirstChild().getFirstChild().getNextSibling();
		System.out.println(node.getNodeName());
		System.out.println(rootNode.getNodeName());
		
		Node itemCodeNode=rootNode.getFirstChild().getNextSibling().getFirstChild().getNextSibling().getFirstChild().getNextSibling();
		Node quantityNode=rootNode.getFirstChild().getNextSibling().getFirstChild().getNextSibling().getFirstChild().getNextSibling().getFirstChild().getParentNode().getNextSibling().getNextSibling();
		System.out.println(quantityNode.getTextContent());
	}

}
