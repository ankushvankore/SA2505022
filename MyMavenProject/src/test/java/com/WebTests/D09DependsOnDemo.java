package com.WebTests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class D09DependsOnDemo {
	@Test(priority = 1)
	public void login() {
		System.out.println("Testing login test");
		Assert.assertTrue(false);
	}

	@Test(priority = 2, dependsOnMethods = {"login"})
	public void logout() {
		System.out.println("Testing logout test");
	}
}
