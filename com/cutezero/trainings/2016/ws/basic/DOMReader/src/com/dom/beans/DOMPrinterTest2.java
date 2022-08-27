package com.dom.beans;

import java.io.IOException;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class DOMPrinterTest2 {

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		DocumentBuilderFactory factory=DocumentBuilderFactory.newInstance();
		DocumentBuilder builder=factory.newDocumentBuilder();
		Document document= builder.parse("G:\\SRIMAN_1\\Workspace\\DOMReader\\resources\\purchaseOrder.xml");
		//readDom(document);
		parseSomething(document.getFirstChild());
	}
	
	/*
	private static void readDom(Node node){
		switch (node.getNodeType()) {
		case Node.DOCUMENT_NODE:
			Node rootNode=node.getFirstChild();
			System.out.println("<"+rootNode.getNodeName()+">");
			readDom(rootNode);
			break;
			
		case Node.ELEMENT_NODE:
			System.out.print("<"+node.getNodeName()+">");
			NodeList children=node.getChildNodes();
			for(int i=0;i<children.getLength();i++){
				Node child=children.item(i);
				//System.out.print("<"+child.getNodeName()+">");
				readDom(child);
			}
			System.out.println("</"+node.getNodeName()+">");
			
			break;
			
		case Node.TEXT_NODE:
			System.out.print(node.getNodeValue());
			break;
			
		default:
			break;
		}
	}
	*/
	
	
	private static void parseSomething(Node node){
		System.out.print("<"+node.getNodeName()+">");
		NodeList childern=node.getChildNodes();
		for(int i=0;i<childern.getLength();i++){
			Node child=childern.item(i);
			//System.out.println("<"+child.getNodeName()+">");
			
			if(child.getNodeType()==Node.ELEMENT_NODE)
				parseSomething(child);
			else if(child.getNodeType()==Node.TEXT_NODE)
				System.out.print(child.getNodeValue());
		}
		System.out.println("</"+node.getNodeName()+">");
	}

	
}
