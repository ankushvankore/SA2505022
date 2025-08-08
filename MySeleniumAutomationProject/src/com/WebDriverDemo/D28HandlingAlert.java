package com.WebDriverDemo;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D28HandlingAlert {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://demoqa.com/alerts");
		
		Alert alt;
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("window.scrollBy(0, 100)", "");
		
		driver.findElement(By.id("alertButton")).click();
		alt = driver.switchTo().alert();
		System.out.println(alt.getText());
		Thread.sleep(2000);
		alt.accept();			//Will Click on Ok button
		
		WebElement btn2 = driver.findElement(By.id("timerAlertButton"));
		js.executeScript("arguments[0].click()", btn2);	//Clicks on the button which is hidden by ad
		Thread.sleep(5000);
		alt = driver.switchTo().alert();
		System.out.println(alt.getText());
		alt.accept();
		
		WebElement btn3 = driver.findElement(By.xpath("//*[@id=\"confirmButton\"]"));
		js.executeScript("arguments[0].click()", btn3);
		alt = driver.switchTo().alert();
		System.out.println(alt.getText());
		alt.dismiss();				//Click on Cancel button
		System.out.println(driver.findElement(By.xpath("//span[@id='confirmResult']")).getText());
		
		WebElement btn4 = driver.findElement(By.id("promtButton"));
		js.executeScript("arguments[0].click()", btn4);
		alt = driver.switchTo().alert();
		alt.sendKeys("Prajakta");		//Enter text on prompt box
		alt.accept();
		System.out.println(driver.findElement(By.id("promptResult")).getText());
	}

}
