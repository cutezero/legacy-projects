package com.ds.test;

import com.ds.stacks.MyStackImpl;

public class StackTest {

	public static void main(String[] args) throws Exception {
		
		MyStackImpl stack;
		stack = new MyStackImpl(5);
		try {
			stack.push(24);
			stack.push(36);
			stack.push(566);
			stack.push(390);
			int entry=stack.peek();
			System.out.println("Top Element : "+entry);
			entry=stack.pop();
			System.out.println("Top Element 390 : "+entry);
			stack.push(76);
			stack.push(76);
			stack.push(76);
			stack.push(76);
			System.out.println("Top Element 76: "+entry);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try{
			stack.pop();
			stack.pop();
			stack.pop();
			stack.pop();
			stack.pop();
			stack.pop();
			stack.pop();
			stack.pop();
		}catch(Exception exception){
			exception.printStackTrace();
			System.err.println(exception.getMessage());
		}
	}

}
