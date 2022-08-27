package com.tourmanager.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlType
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="new-package")
public class NewPackage {

	@XmlElement(name="order-id")
	protected String orderId;
	@XmlElement(name="package-name")
	protected String pacakgeName;
	@XmlElement(type=Float.class)
	protected float amount;
	protected String comments;
	protected String status;
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getPacakgeName() {
		return pacakgeName;
	}
	public void setPacakgeName(String pacakgeName) {
		this.pacakgeName = pacakgeName;
	}
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
		
	
	
}
