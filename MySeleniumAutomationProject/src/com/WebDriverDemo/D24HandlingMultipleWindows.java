package com.WebDriverDemo;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D24HandlingMultipleWindows {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.naukri.com/");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("window.scrollBy(0, 400)", "");
		driver.findElement(By.xpath("//span[@title=\"Remote\"]")).click();
		
		System.out.println("Title: " + driver.getTitle());
		
		Set<String>windows = driver.getWindowHandles();
		Iterator<String>itr = windows.iterator();
		//Interface which is used to iterate / read the elements from Set<>
		String win1 = itr.next();	//Will read 1st element from Set<>
		String win2 = itr.next();	//Will read 2nd element
		
		driver.switchTo().window(win2);
		Thread.sleep(5000);
		System.out.println("Title: " + driver.getTitle());
		
		driver.findElement(By.xpath("//*[@id=\"search-result-container\"]/div[1]/div[1]/div/div/div[2]/div[1]/div[2]/div[1]/label/i")).click();
	
		Thread.sleep(2000);
		
		driver.switchTo().window(win1);
		
		driver.findElement(By.linkText("Login")).click();
		
		driver.quit();
	}

}
