package com.cfn;

public class Main {

	public static void main(String[] args) {
		ICard c1= new ICard("A", 111, IntrinsicFactory.getInstance("COMP"));
		ICard c2= new ICard("B", 112, IntrinsicFactory.getInstance("COMP"));
		ICard c3= new ICard("C", 113, IntrinsicFactory.getInstance("FIN"));
		ICard c4= new ICard("D", 114, IntrinsicFactory.getInstance("ACC"));
		c1.print();
		c2.print();
		c3.print();
		c4.print();
		IntrinsicImpl.showCount();
	}

}
