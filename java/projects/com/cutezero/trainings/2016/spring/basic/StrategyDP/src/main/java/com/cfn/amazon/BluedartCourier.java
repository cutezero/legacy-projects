package com.cfn.amazon;

public class BluedartCourier implements ICourier {

	public String doParcel(String item, String zip) {
		return item+" has deliverid by Bluedart to :"+zip;
	}

}
