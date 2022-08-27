package com.aop.vendor.pojo;

import java.util.Date;

public class StockInfo {

	protected String stockName;
	protected double stockPrice;
	protected Date lastAccessedTime;
	
	protected long lastAccessTimeInMillis;
	
	
	public StockInfo() {
	}
	public StockInfo(String stockName, double stockPrice, long lastAccessTimeInMillis) {
		super();
		this.stockName = stockName;
		this.stockPrice = stockPrice;
		this.lastAccessTimeInMillis = lastAccessTimeInMillis;
	}
	public long getLastAccessTimeInMillis() {
		return lastAccessTimeInMillis;
	}
	public void setLastAccessTimeInMillis(long lastAccessTimeInMillis) {
		this.lastAccessTimeInMillis = lastAccessTimeInMillis;
	}
	public String getStockName() {
		return stockName;
	}
	public void setStockName(String stockName) {
		this.stockName = stockName;
	}
	public double getStockPrice() {
		return stockPrice;
	}
	public void setStockPrice(double stockPrice) {
		this.stockPrice = stockPrice;
	}
	public Date getLastAccessedTime() {
		return lastAccessedTime;
	}
	public void setLastAccessedTime(Date lastAccessedTime) {
		this.lastAccessedTime = lastAccessedTime;
	}
	@Override
	public String toString() {
		return "StockInfo [stockName=" + stockName + ", stockPrice=" + stockPrice + ", lastAccessedTime="
				+ lastAccessedTime + "]";
	}
	
	
}
