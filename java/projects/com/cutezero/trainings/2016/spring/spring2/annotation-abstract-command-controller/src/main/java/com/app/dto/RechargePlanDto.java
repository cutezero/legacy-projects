package com.app.dto;

public class RechargePlanDto {

	protected String planName;
	protected float rechargePrice;
	protected float rechargeValue;
	protected int validity;
	protected String moreInfo;
	
	public RechargePlanDto() {
		//Default Constructor
	}
	
	public RechargePlanDto(String planName, float rechargePrice, float rechargeValue, int validity, String moreInfo) {
		super();
		this.planName = planName;
		this.rechargePrice = rechargePrice;
		this.rechargeValue = rechargeValue;
		this.validity = validity;
		this.moreInfo = moreInfo;
	}
	public String getPlanName() {
		return planName;
	}
	public void setPlanName(String planName) {
		this.planName = planName;
	}
	public float getRechargePrice() {
		return rechargePrice;
	}
	public void setRechargePrice(float rechargePrice) {
		this.rechargePrice = rechargePrice;
	}
	public float getRechargeValue() {
		return rechargeValue;
	}
	public void setRechargeValue(float rechargeValue) {
		this.rechargeValue = rechargeValue;
	}
	public int getValidity() {
		return validity;
	}
	public void setValidity(int validity) {
		this.validity = validity;
	}
	public String getMoreInfo() {
		return moreInfo;
	}
	public void setMoreInfo(String moreInfo) {
		this.moreInfo = moreInfo;
	}
	
	
}
