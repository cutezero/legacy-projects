package com.cfn.beans;

import java.util.List;

import com.cfn.beans.courier.ICourier;
import com.cfn.model.Address;
import com.cfn.model.AmazonOrder;

public class AmazonTransportManager {

	private String trackingId=null;
	private ICourier courier;

	public void setCourier(ICourier courier) {
		this.courier = courier;
	}
	public AmazonTransportManager(ICourier courier) {
		super();
		this.courier = courier;
	}
	public String transport(List<String> itemList, Address address ){
		AmazonOrder order2=new AmazonOrder();
		order2.setOrderedItemName("Coolpad Mobile");
		order2.setOrderId("AO1234");
		order2.setOrdervalue(8999);
		order2.setRefNO("AORF7890");
		trackingId=courier.ship(order2, address);
		return trackingId;
	}
}
