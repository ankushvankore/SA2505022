package com.TestNGDemo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

public class D10POMClient{
	WebDriver driver;
	RediffUtility r1;
	@Test
	public void registration1() {
		r1.enterFullName("Vrushika Hingu");
		r1.enterRediffId("vrushika");
		r1.enterPassword("Vrushika123");
		r1.selectBirthDate("30", "NOV", "2001");
		r1.selectGender("Female");
		r1.checkAvailablity();
	}
	@Test
	public void registration2() {
		r1.enterFullName("Ankita Kabra");
		r1.enterRediffId("ankitakabra2025");
		r1.enterPassword("Ankita@123");
		r1.selectBirthDate("17", "MAR", "2001");
		r1.selectGender("Female");
		r1.checkAvailablity();
	}
	@Test
	public void registration3() {
		r1.enterFullName("Rajesh Gupta");
		r1.enterRediffId("rajeshgupta");
		r1.enterPassword("Rajesh@123");
		r1.selectBirthDate("05", "DEC", "2001");
		r1.selectGender("Male");
		r1.checkAvailablity();
	}
	
	@BeforeMethod
	public void refreshPage() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.navigate().refresh();
	}

	@BeforeTest
	public void beforeTest() {
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		
		r1 = new RediffUtility(driver);
	}

	@AfterTest
	public void afterTest() {
		driver.close();
	}

}
