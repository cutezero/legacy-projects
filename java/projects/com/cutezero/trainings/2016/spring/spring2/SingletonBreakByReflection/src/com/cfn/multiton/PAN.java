package com.cfn.multiton;

import java.io.Serializable;

//make abstract  to the class to avoid reflaction API.			//#1
//public class PAN implements Cloneable, Serializable{		//#2
public abstract class PAN implements Cloneable, Serializable { // #1

	private static PAN instance;
	private static int instances;

	private PAN() {
		super();
		// TODO Auto-generated constructor stub
	}

	public static PAN getInstance() {
		if (instances <= 2) {
			
			// instance= new PAN(); //#2
			// annonymous inner class will call private constructor //#1
			instance = new PAN() {
			}; // #1
			instances++;
		}
		return instance;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {		//#3
		throw new CloneNotSupportedException("OOPS You cant do it");
		// return super.clone();
	}

	public Object readResolve() {		//#4
		PAN instance = null;
		if (instance == null) {
			return PAN.getInstance();
		}
		return instance;
	}

}
