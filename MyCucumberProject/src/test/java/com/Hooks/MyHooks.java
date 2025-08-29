package com.Hooks;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class MyHooks {
	public static WebDriver driver;

	//@Before
	public void launchBrowser() {
		System.out.println("Before");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://sampleapp.tricentis.com/101/index.php");
	}

	//@After
	public void closeBrowser() {
		driver.close();
	}
}
