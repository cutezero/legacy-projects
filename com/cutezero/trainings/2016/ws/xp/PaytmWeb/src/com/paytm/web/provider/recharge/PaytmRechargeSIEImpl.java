package com.paytm.web.provider.recharge;

import java.rmi.RemoteException;
import java.util.Arrays;
import java.util.List;

public class PaytmRechargeSIEImpl implements PaytmRechargeSIE{

	public String recharge(long mobileNo) throws RemoteException {
		String response=null;
		if (mobileNo>=90000000 && mobileNo<=99999999)
			response="Success";
		else 
			response="Failed";
			
		return response;
	}

	public List recharge(long mobileNo, String operator, String circle)
			throws RemoteException {
		List list=Arrays.asList(mobileNo, operator, circle);
		return list;
	}
}
