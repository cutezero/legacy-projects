package com.jaxb.unmarshalling;

import in.ebay.sales.products.PurchaseOrderType;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class UMTest {

	public static void main(String[] args) throws JAXBException, FileNotFoundException {
		JAXBContext jContext=JAXBContext.newInstance("in.ebay.sales.products");
		Unmarshaller unmarshaller=jContext.createUnmarshaller();
		//Object element=unmarshaller.unmarshal(new File("C:\\Others\\WS_Workspace\\PoJaxB\\resources\\purchaseOrder.xml"));
		//JAXBElement<PurchaseOrderType>element=(JAXBElement<PurchaseOrderType>) unmarshaller.unmarshal(new File("C:\\Others\\WS_Workspace\\PoJaxB\\resources\\purchaseOrder.xml"));
		JAXBElement<PurchaseOrderType>element=(JAXBElement<PurchaseOrderType>) unmarshaller.unmarshal(new FileInputStream(new File("C:\\Others\\WS_Workspace\\PoJaxB\\resources\\purchaseOrder.xml")));
		System.out.println(element.getValue().getItems().getItemCode());
		
	}
}
