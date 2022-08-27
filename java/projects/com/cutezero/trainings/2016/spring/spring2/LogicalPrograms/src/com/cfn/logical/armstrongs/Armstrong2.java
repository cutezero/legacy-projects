package com.cfn.logical.armstrongs;

import java.util.Scanner;

public class Armstrong2 {

	public static void main(String[] args) {
		int input= 0;
		int result= 0;
		int inputCopy= 0;
		int cubes=0;
		int rem=0;
		String inputString=null;
		int cubeLength=0;
		
		
		Scanner s= new Scanner(System.in);
		System.out.println("Please Enter a value to check Armstrong : ");

		//for String type length calculation
		inputString= s.nextLine();
		cubeLength=inputString.length();
		
		//for Integer type count
/*		while(){
			
		}
		*/
		
		input= Integer.parseInt(inputString);
		inputCopy= input;
		
		
		while(input>0){
			cubes=1;
			rem=input%10;
			for(int j=1; j<=cubeLength; j++){
				cubes= cubes*rem;
				System.out.println(cubes);
			}
			result=result+cubes;
			input= (input-rem)/10;
		}
		System.out.println("Result : "+result);
		if(inputCopy==result)
			System.out.println("Yes");
		else 
		System.out.println("No");

	}

}
