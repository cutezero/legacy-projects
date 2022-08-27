package com.cfn.beans.courier;


import com.cfn.model.Address;
import com.cfn.model.AmazonOrder;

public interface ICourier {

	String ship(AmazonOrder order, Address address);
}
