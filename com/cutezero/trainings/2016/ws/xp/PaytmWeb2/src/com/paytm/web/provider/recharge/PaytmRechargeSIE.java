package com.paytm.web.provider.recharge;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface PaytmRechargeSIE extends Remote{

	String recharge(long mobileNo)throws RemoteException;
	List recharge(long mobileNo, String operator, String circle)throws RemoteException;
}
