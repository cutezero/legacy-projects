package com.ba.beans;

import com.dtdc.beans.DTDCParcelService;

public class DtdcCourierServiceImpl implements ICourierService {

	@Override
	public String deliver(Order order, Address address) {
		return new DTDCParcelService().parcel(order, address);
	}

}
