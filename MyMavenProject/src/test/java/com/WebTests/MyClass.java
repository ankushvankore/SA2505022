package com.WebTests;

import org.testng.annotations.DataProvider;

public class MyClass {
	
	@DataProvider(indices = {1,3})
	public Object[][] myData()
	{
		return new Object[][] {
			new Object[] { 1, "Satish"},
			new Object[] { 2, "Renuka" },
			new Object[] { 3, "Kajal"},
			new Object[] { 4, "Vrushika"},
			new Object[] { 5, "Pavitra"},
		};
	}

}
