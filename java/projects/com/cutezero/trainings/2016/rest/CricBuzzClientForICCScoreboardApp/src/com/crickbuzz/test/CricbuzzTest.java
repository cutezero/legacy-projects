package com.crickbuzz.test;

import com.crickbuzz.service.ICCScoreBoardInvoker;

public class CricbuzzTest {

	public static void main(String[] args) {
		ICCScoreBoardInvoker boardInvoker= new ICCScoreBoardInvoker("MC2134", 2);
//		int result=boardInvoker.getCurrentScore();
		
		int result=boardInvoker.getCurrentScore2();
		System.out.println("Score is : "+result);
	}
}
