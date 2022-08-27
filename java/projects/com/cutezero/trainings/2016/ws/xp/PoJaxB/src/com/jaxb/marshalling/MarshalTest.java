package com.jaxb.marshalling;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import in.ebay.sales.products.ItemsType;
import in.ebay.sales.products.PurchaseOrderType;
import in.ebay.sales.products.ShippingAddressType;

public class MarshalTest {

	public static void main(String[] args) throws JAXBException {
		ShippingAddressType addressType=new ShippingAddressType();
		addressType.setAddressType("address1");
		addressType.setCity("HYD");
		addressType.setState("Odisha");
		ItemsType itemsType=new ItemsType();
		itemsType.setItemCode("hdsk");
		itemsType.setQuantity("89");
		PurchaseOrderType orderType=new PurchaseOrderType();
		orderType.setItems(itemsType);
		orderType.setShippingAddress(addressType);
		JAXBContext context=JAXBContext.newInstance("in.ebay.sales.products");
		Marshaller marshaller=context.createMarshaller();
		marshaller.marshal(orderType, System.out);
	}
}
