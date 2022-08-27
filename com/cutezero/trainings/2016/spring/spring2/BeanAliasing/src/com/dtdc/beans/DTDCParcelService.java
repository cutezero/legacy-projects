package com.dtdc.beans;

import com.ba.beans.Address;
import com.ba.beans.Order;

public class DTDCParcelService {

	public String parcel(Order order, Address address){
		return "DTDC has parceled your service";
	}
}
