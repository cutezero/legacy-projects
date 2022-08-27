package com.cfn.model;

public class AmazonOrder {

	private String orderId;
	private String orderedItemName;
	private double ordervalue;
	private String refNO;
	
	public String getRefNO() {
		return refNO;
	}
	public void setRefNO(String refNO) {
		this.refNO = refNO;
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getOrderedItemName() {
		return orderedItemName;
	}
	public void setOrderedItemName(String orderedItemName) {
		this.orderedItemName = orderedItemName;
	}
	public double getOrdervalue() {
		return ordervalue;
	}
	public void setOrdervalue(double ordervalue) {
		this.ordervalue = ordervalue;
	}
	
}
