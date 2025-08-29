package com.WebTests;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class D11InvocationCount {
	/*@Test(dataProvider = "dp")
	public void test1(Integer n) {
		System.out.println("Executing test1");
	}

	@DataProvider
	public Object[][] dp() {
		return new Object[][] {
			new Object[] { 1 },
			new Object[] { 2 },
			new Object[] { 2},
			new Object[] { 2},
		};
	}*/
	
	@Test(invocationCount = 5)
	public void myTest()
	{
		System.out.println("Executing myTest");
	}
}
