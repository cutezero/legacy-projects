package com.ba.beans;

import java.util.List;

public class Order {

	private String orderId;
	private List<String> items;
	private double orderValue;
	
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public void setItems(List<String> items) {
		this.items = items;
	}
	public void setOrderValue(double orderValue) {
		this.orderValue = orderValue;
	}
	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", items=" + items + ", orderValue=" + orderValue + "]";
	}
}
