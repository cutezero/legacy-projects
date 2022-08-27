package com.wrox.provider.service;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface BookInfo extends Remote{

	//java 1.5 should be used
	float getBookPrice(String isbn) throws RemoteException;
}
