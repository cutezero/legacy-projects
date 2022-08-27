package com.wrox.provider.service;

import java.rmi.RemoteException;
import java.sql.SQLException;

public class BookInfoImpl implements BookInfo{

	public float getBookPrice(String isbn) throws RemoteException {
		
		
/*		float price=0;
		if (isbn==null || isbn.equals("") || isbn.length()<=0){
			throw new RemoteException(" Invalid isbn number");
		}
		try{
		//JDBC Logic or similar type of logic
		if (isbn == "isbn100"){
			price= 100;
		}
		else if (isbn == "isbn135"){
			price= 135;
		}
		else if (isbn == "isbn200"){
			price= 250;
		}
		else{
			price= 3500;
		}
		}catch (Exception e){
			throw new RemoteException("Wrong input");
		}
*/
		
		
		float price=0.0f;
		if (isbn.equals("isbn100"))
			price=100;
		else if (isbn.equals("isbn135"))
			price=135;
		else if (isbn.equals("isbn200"))
			price=250;
		
		else
			price=4500;
		return price;
	}	
}