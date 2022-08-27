package com.si.beans;

public class Product {
	protected String productCode;
	protected String productName;
	protected String productDescription;
	protected String price;
	@Override
	public String toString() {
		return "Product [productCode=" + productCode + ", productName="
				+ productName + ", productDescription=" + productDescription
				+ ", price=" + price + "]";
	}
	public String getProductCode() {
		return productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductDescription() {
		return productDescription;
	}
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}

}
