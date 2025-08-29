package com.WebTests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OHRM_Client {
	WebDriver driver;
	OHRMUtility o1;
	@Test
	public void login() {
		o1.loginToOHRM("admin", "admin123");
	}
	
	@BeforeTest
	public void setup()
	{
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		o1 = new OHRMUtility(driver);
	}
	
	@AfterTest()
	public void tearDown() {
		driver.close();
	}
}
