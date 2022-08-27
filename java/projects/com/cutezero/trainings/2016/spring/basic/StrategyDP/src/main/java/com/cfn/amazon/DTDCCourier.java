package com.cfn.amazon;

public class DTDCCourier implements ICourier {


	public String doParcel(String item, String zip) {

		return item+" has deliverid by DTDC to :"+zip;
	}
	
}
