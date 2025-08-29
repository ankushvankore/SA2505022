package com.WebTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OHRMUtility {
	WebDriver driver;
	
	public OHRMUtility(WebDriver driver) {
		this.driver = driver;
	}



	public void loginToOHRM(String un, String ps)
	{
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(un);
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(ps);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
}
