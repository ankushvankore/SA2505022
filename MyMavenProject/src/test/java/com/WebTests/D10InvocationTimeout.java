package com.WebTests;

import org.testng.annotations.Test;

public class D10InvocationTimeout {
  @Test(invocationTimeOut = 3000)
  public void myTest() throws InterruptedException {
	  System.out.println("Test started!!!");
	  Thread.sleep(5000);
	  System.out.println("Test ends!!!");
  }
}
