package com.sc.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;

import com.sc.beans.Address;

public class SCtest {

	public static void main(String[] args) throws FileNotFoundException,
			XMLStreamException {
		String tag = null;
		String tagData = null;
		Address address = null;
		XMLInputFactory inputFactory = XMLInputFactory.newFactory();
		XMLStreamReader reader = inputFactory
				.createXMLStreamReader(new FileInputStream(
						new File(
								"G:\\SRIMAN_1\\Workspace\\StaxCursor\\resources\\address.xml")));
		address = new Address();
		while (reader.hasNext()) {
			int event = reader.next();
			/*
			if (event == XMLStreamReader.START_ELEMENT) {
				tag = reader.getLocalName();
				System.out.println(tag);
				tagData = getTag(reader);
				if (tag.equals("addressLine1")) {
					address.setAddressLine1(tagData);
				} else if (tag.equals("addressLine2")) {
					address.setAddressLine2(tagData);
				} else if (tag.equals("city")) {
					address.setCity(tagData);
				} else if (tag.equals("state")) {
					address.setState(tagData);
				} else if (tag.equals("zip")) {
					address.setZip(tagData);
				} else if (tag.equals("country")) {
					address.setCountry(tagData);
				}
			}
			*/
			switch (event) {
			case XMLStreamReader.START_ELEMENT:
				tag=reader.getLocalName();
				System.out.print(tag+" : ");
				tagData=getTag(reader);
				switch (tag) {
				case "addressLine1":
					address.setAddressLine1(tagData);
					break;

				case "addressLine2":
					address.setAddressLine2(tagData);
					break;
				case "city":
					address.setCity(tagData);
					break;
				case "state":
					address.setCity(tagData);
					break;
				case "zip":
					address.setZip(tagData);
					break;
				case "country":
					address.setCountry(tagData);
					break;
				default:
					//System.out.println("1st Default");
					break;
				}
				System.out.println(tagData);
				break;
			case XMLStreamReader.NAMESPACE:
				System.out.println(reader.getNamespaceURI());
				break;
			case XMLStreamReader.START_DOCUMENT:
				System.out.println("-----------Start of Document-------------");
				break;
			case XMLStreamReader.END_DOCUMENT:
				System.out.println("----------End of Document------------");
				break;
			default:
				//System.out.println("2nd Default");
				break;
			}
		}
		System.out.println(address);
	}

	private static String getTag(XMLStreamReader reader)
			throws XMLStreamException {
		reader.next();
		String tagData = reader.getText();
		return tagData;
	}
}
