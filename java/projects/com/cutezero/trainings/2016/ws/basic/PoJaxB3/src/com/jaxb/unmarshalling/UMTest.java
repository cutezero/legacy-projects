package com.jaxb.unmarshalling;

import java.io.File;

import javax.xml.XMLConstants;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;

import org.xml.sax.SAXException;

public class UMTest {

	public static void main(String[] args) throws JAXBException, SAXException {
		SchemaFactory factory=SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
//		Schema schema=factory.newSchema(new File("C:\\Others\\WS_Workspace\\PoJaxB2\\resources\\purchaseOrder.xsd"));
		Schema schema=factory.newSchema(new File("G:\\SRIMAN_1\\Workspace\\PoJaxB3\\resources\\purchaseOrder.xsd"));
		
		JAXBContext context=JAXBContext.newInstance("in.ebay.sales.products");
		Unmarshaller unmarshaller=context.createUnmarshaller();
		unmarshaller.setSchema(schema);
//		JAXBElement<PurchaseOrderType> element=(JAXBElement<PurchaseOrderType>) unmarshaller.unmarshal(new File("C:\\Others\\WS_Workspace\\PoJaxB2\\resources\\purchaseOrder.xml"));
		@SuppressWarnings("unchecked")
		JAXBElement<in.ebay.sales.products.PurchaseOrderType> element=(JAXBElement<in.ebay.sales.products.PurchaseOrderType>) unmarshaller.unmarshal(new File("G:\\SRIMAN_1\\Workspace\\PoJaxB3\\resources\\purchaseOrder.xml"));
		System.out.println("Item Code :"+element.getValue().getItems().getItem().get(0).getItemCode());
		System.out.println("Quanity :"+element.getValue().getItems().getItem().get(0).getQuantity());
		System.out.println("Address City :" +element.getValue().getShippingAddress().getCity());
		System.out.println("ZIP :"+element.getValue().getShippingAddress().getZip());
		System.out.println("Address Type :"+element.getValue().getShippingAddress().getAddressType());
		
	}
}
