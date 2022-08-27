package com.si.test;

import java.io.FileNotFoundException;
import java.util.List;

import javax.xml.stream.XMLStreamException;

import com.si.beans.Product;
import com.si.beans.XmlExtractor;

public class SITest {

	public static void main(String[] args) throws FileNotFoundException, XMLStreamException {
		XmlExtractor extractor=new XmlExtractor();
		List<Product> products=extractor.extractXml("G:\\SRIMAN_1\\Workspace\\StaxIterator\\resources\\products.xml");
		System.out.println(products);
		System.out.println("DONE");
	}
}
