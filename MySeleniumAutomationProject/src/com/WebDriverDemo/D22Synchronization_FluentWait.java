package com.WebDriverDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class D22Synchronization_FluentWait {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.redbus.in/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		
		FluentWait<WebDriver>wait = new FluentWait<WebDriver>(driver);
		
		//From
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div/div/div[1]/div[1]/div[1]/div/div/div[1]")).click();
		wait.withTimeout(Duration.ofSeconds(10))
		.ignoring(NoSuchElementException.class)
		.pollingEvery(Duration.ofMillis(1))
		.until(ExpectedConditions.visibilityOfElementLocated(By.id("srcDest"))).sendKeys("Kolh");

		wait.withTimeout(Duration.ofSeconds(10))
		.ignoring(NoSuchElementException.class)
		.pollingEvery(Duration.ofMillis(1))
		.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div/div/div[1]/div[1]/div[1]/div[2]/div[4]/div[1]/div[1]/div/div/div"))).click();
		//driver.findElement(By.id("srcDest")).sendKeys("Kolh");
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div/div/div[1]/div[1]/div[1]/div[2]/div[4]/div[1]/div[1]/div/div/div")).click();
		
		//To
		//driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div/div/div[1]/div[2]/div/div/div[1]")).click();
		driver.findElement(By.id("srcDest")).sendKeys("Ban");
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div/div/div[1]/div[2]/div[2]/div[4]/div[1]/div[1]/div/div/div")).click();
		
		//Calender
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div/div/div[1]/div[3]/div[1]/i")).click();
		
		//Date
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div/div/div[1]/div[3]/div[3]/div[2]/div/ul/li[34]/div/div/span")).click();
		
		//Search Bus
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div/button")).click();
		
		//Result Bus
		System.out.println("Bus Available: " + driver.findElement(By.xpath("//*[@id=\"8331995\"]/div[2]/div[3]/div/div[1]/div[1]")).getText());
		
		driver.close();
	}

}
