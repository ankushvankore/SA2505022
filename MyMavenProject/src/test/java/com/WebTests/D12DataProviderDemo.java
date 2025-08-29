package com.WebTests;

import org.testng.annotations.Test;

public class D12DataProviderDemo {
  @Test(dataProvider = "myData", dataProviderClass = com.WebTests.MyClass.class)
  public void myTest(int no, String nm) {
	  System.out.println(no + " --> " + nm);
  }
}
