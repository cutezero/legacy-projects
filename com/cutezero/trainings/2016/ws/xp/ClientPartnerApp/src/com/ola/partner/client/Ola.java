package com.ola.partner.client;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Ola extends Remote {

	RideDetails bookRide(Trip trip, Passenger passenger)throws RemoteException;
}
