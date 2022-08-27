package com.junit.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class TestCaseForMatchCalculation {
	static MathCalulation cal=null;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		cal=new MathCalulation();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		cal=null;
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("setUp method");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("tearDown method");
	}

	@Test
	public void test() {
		int result=cal.sum(100,200);
		assertEquals(300, result);
		
	}
	
	@Test(expected=ArithmeticException.class)
	public void test2() {
		float rs=cal.div(100, 0);
		assertEquals(30, 4500, 0.5);
		
		
	}

}
