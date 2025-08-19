package com.TestNGDemo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;

public class D09KeywordDrivenFramework {
	File file;
	FileInputStream fis;
	Properties prop;
	WebDriver driver;
	
	@Test
	public void login() {
		driver.findElement(By.id(prop.getProperty("unTxID"))).sendKeys("practice");
		driver.findElement(By.xpath(prop.getProperty("psTxXP"))).sendKeys("SuperSecretPassword!");
		//driver.findElement(By.cssSelector(prop.getProperty("logBtnCss"))).submit();
		driver.findElement(By.cssSelector(prop.getProperty("logBtnCss"))).sendKeys(Keys.ENTER);
	}

	@BeforeTest
	public void beforeTest() throws IOException {
		file = new File("src/com/TestNGDemo/MyData.properties");
		fis = new FileInputStream(file);
		prop = new Properties();
		prop.load(fis);		//Load all the properties in an object prop.
		
		//System.out.println(prop.getProperty("url"));
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get(prop.getProperty("url"));
	}

	@AfterTest
	public void afterTest() throws InterruptedException {
		Thread.sleep(2000);
		driver.close();
	}

}
