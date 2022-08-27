package com.cfn;

public class TTTest {

	public static void main(String[] args) {
		ThreeTon tt=ThreeTon.getInstance();
		System.out.println("TT 1 :"+tt.hashCode());
		ThreeTon tt2=ThreeTon.getInstance();
		System.out.println("TT 2 :"+tt2.hashCode());
		ThreeTon tt3=ThreeTon.getInstance();
		System.out.println("TT 3 :"+tt3.hashCode());
		ThreeTon tt4=ThreeTon.getInstance();
		System.out.println("TT 4 : "+tt4.hashCode());
		tt4=ThreeTon.getInstance();
		System.out.println("TT 4 : "+tt4.hashCode());
		tt4=ThreeTon.getInstance();
		System.out.println("TT 4 : "+tt4.hashCode());
		tt4=ThreeTon.getInstance();
		System.out.println("TT 4 : "+tt4.hashCode());

		
		tt4=ThreeTon.getInstance().getInstance();
		System.out.println("Mine is priority");
		System.out.println("TT 6 : "+tt4.hashCode());


	}
}
