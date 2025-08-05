package com.WebDriverDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D19Synchronization_ThreadSleep {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.redbus.in/");
		
		//From
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div/div/div[1]/div[1]/div[1]/div/div/div[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("srcDest")).sendKeys("Kolh");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div/div/div[1]/div[1]/div[1]/div[2]/div[4]/div[1]/div[1]/div/div/div")).click();
		
		//To
		//driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div/div/div[1]/div[2]/div/div/div[1]")).click();
		driver.findElement(By.id("srcDest")).sendKeys("Ban");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div/div/div[1]/div[2]/div[2]/div[4]/div[1]/div[1]/div/div/div")).click();
		
		//Calender
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div/div/div[1]/div[3]/div[1]/i")).click();
		
		//Date
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div/div/div[1]/div[3]/div[3]/div[2]/div/ul/li[34]/div/div/span")).click();
		
		//Search Bus
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div/button")).click();
		
		//Result Bus
		System.out.println("Bus Available: " + driver.findElement(By.xpath("//*[@id=\"8331995\"]/div[2]/div[3]/div/div[1]/div[1]")).getText());
		
		driver.close();
	}

}
