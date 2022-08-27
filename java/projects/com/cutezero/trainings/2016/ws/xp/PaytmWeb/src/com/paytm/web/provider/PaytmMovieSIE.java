package com.paytm.web.provider;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface PaytmMovieSIE extends Remote{

	String bookMovieTicket(String theater, String movie) throws RemoteException;
	String cancelTicket(String ticketNo) throws RemoteException;
}
