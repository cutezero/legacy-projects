package com.jaxb.unmarshalling;

//import com.ebaysales.products.ObjectFactory;
import com.ebaysales.products.ItemsType;
import com.ebaysales.products.ShippingAddressType;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;


import com.ebaysales.products.PurchaseOrderType;

public class UMTest2 {

	/**
	 * @param args
	 * @throws JAXBException 
	 */
	public static void main(String[] args) throws JAXBException {
		//JAXBContext context=JAXBContext.newInstance("com.ebaysales.products");
		//JAXBContext context=JAXBContext.newInstance(ObjectFactory.class);
		//JAXBContext context=JAXBContext.newInstance(ObjectFactory.class, ShippingAddressType.class);
		//JAXBContext context=JAXBContext.newInstance(ShippingAddressType.class);
		//JAXBContext context=JAXBContext.newInstance(PurchaseOrderType.class);//1
		//JAXBContext context=JAXBContext.newInstance(ShippingAddressType.class);//2
		JAXBContext context=JAXBContext.newInstance(ItemsType.class);//3
		Unmarshaller unmarshaller=context.createUnmarshaller();
		//Object object= unmarshaller.unmarshal(new File("C:\\Others\\WS_Workspace\\PoJaxB\\resources\\purchaseOrder2.xml"));
		Object object= unmarshaller.unmarshal(new File("C:\\Others\\WS_Workspace\\PoJaxB\\resources\\purchaseOrder3.xml"));//2
		//JAXBElement<PurchaseOrderType> poElement= (JAXBElement<PurchaseOrderType>) object;
		//PurchaseOrderType poElement= (PurchaseOrderType) object; //1
		//ShippingAddressType poElement= (ShippingAddressType) object;//2
		ItemsType poElement= (ItemsType) object;//3
		/*
		System.out.println("Item Code :"+poElement.getValue().getItems().getItemCode());
		System.out.println("Quanity :"+poElement.getValue().getItems().getQuantity());
		System.out.println("Address City :" +poElement.getValue().getShippingAddress().getCity());
		System.out.println("ZIP :"+poElement.getValue().getShippingAddress().getZip());
		System.out.println("Address Type :"+poElement.getValue().getShippingAddress().getAddressType());
		*/
		/*
		System.out.println("Item Code :"+poElement.getItems().getItemCode());//1
		System.out.println("Quanity :"+poElement.getItems().getQuantity());//1
		System.out.println("Address City :" +poElement.getShippingAddress().getCity());//1
		System.out.println("ZIP :"+poElement.getShippingAddress().getZip());//1
		System.out.println("Address Type :"+poElement.getShippingAddress().getAddressType());//1
	*/	 
		
		/*System.out.println("Address City :" +poElement.getCity());//2
		System.out.println("ZIP :"+poElement.getZip());//2
		System.out.println("Address Type :"+poElement.getAddressType());//2
		*/ 	 
		System.out.println("Item Code :"+poElement.getItemCode());//3
		System.out.println("Quanity :"+poElement.getQuantity());//3
		  	 
	}

}
