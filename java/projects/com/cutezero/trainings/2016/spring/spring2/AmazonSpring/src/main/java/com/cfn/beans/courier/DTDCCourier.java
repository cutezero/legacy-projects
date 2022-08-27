package com.cfn.beans.courier;

import com.cfn.model.Address;
import com.cfn.model.AmazonOrder;

public class DTDCCourier implements ICourier {

	public String ship(AmazonOrder order, Address address) {
		String trackingId="DTDC_ID";
		return trackingId;
	}

}
