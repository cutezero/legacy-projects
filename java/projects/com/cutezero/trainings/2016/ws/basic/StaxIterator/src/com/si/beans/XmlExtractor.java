package com.si.beans;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.XMLEvent;

public class XmlExtractor {

	public List<Product> extractXml(String inPath)
			throws FileNotFoundException, XMLStreamException {
		List<Product> products = null;
		Product product = null;
		String tag = null;
		//String data = null;

		XMLInputFactory factory = XMLInputFactory.newFactory();
		XMLEventReader eventReader = factory
				.createXMLEventReader(new FileInputStream(new File(inPath)));
		while (eventReader.hasNext()) {
			XMLEvent event = eventReader.nextEvent();
			/*
			if (event.isStartElement()) {
				// tag=eventReader.getElementText();
				tag = event.asStartElement().getName().getLocalPart();
				if (tag.equals("products")) {
					products = new ArrayList<Product>();
					System.out.println(tag);
				} else if (tag.equals("product")) {
					product = new Product();
					System.out.println("<" + tag + ">");
				} else {
					// tag=event.asStartElement().getName().getLocalPart();
					event = eventReader.nextEvent();
					System.out.print("<" + tag + ">");

					if (tag.equals("product-code")) {
						data = event.asCharacters().getData();
						product.setProductCode(data);
					} else if (tag.equals("product-name")) {
						data = event.asCharacters().getData();
						product.setProductName(data);
					} else if (tag.equals("product-description")) {
						data = event.asCharacters().getData();
						product.setProductDescription(data);
					} else if (tag.equals("product-price")) {
						data = event.asCharacters().getData();
						product.setPrice(data);
					}
					System.out.print(data);
				}
			}

			else if (event.isEndElement()) {
				tag = event.asEndElement().getName().getLocalPart();
				if (tag.equals("product")) {
					products.add(product);
				}
				System.out.println("</" + tag + ">");
			}
		}
			 */
			if (event.isStartElement()){
				tag=event.asStartElement().getName().getLocalPart();
				switch (tag) {
				case "products":
					products=new ArrayList<Product>();
					break;
				case "product":
					product=new Product();
					break;
				default:
					event=eventReader.nextEvent();
					switch (tag) {
					case "product-code":
						product.setProductCode(event.asCharacters().getData());
						//break;
					case "product-name":
						product.setProductName(event.asCharacters().getData());
						//break;
					case "product-description":
						product.setProductDescription(event.asCharacters().getData());
						//break;
					case "product-price":
						product.setPrice(event.asCharacters().getData());
						//break;
					default:
						break;
					}

					break;
				}
			}
			else if(event.isEndElement()){
				tag=event.asEndElement().getName().getLocalPart();
				if(tag.equals("product")){
					products.add(product);
				}
			}
		}
		return products;
	}
}
