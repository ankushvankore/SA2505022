package com.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A05EchotrakLogin_ClassName {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.echotrak.com/Login.aspx?ReturnUrl=%2f");
		
		driver.findElement(By.className("form-control")).sendKeys("prajakta");
		driver.findElement(By.name("txtPassword")).sendKeys("prajakta@123");
		driver.findElement(By.className("btn-primary")).click();
		
		//WebElement errMsg = driver.findElement(By.id("lblMsg"));
		//String msg = errMsg.getText();
		//System.out.println("Error Message: " + msg);
		
		//String msg = driver.findElement(By.id("lblMsg")).getText();
		//System.out.println("Error Message: " + msg);
		
		//System.out.println(driver.findElement(By.id("lblMsg")).getText());
		System.out.println("Error Message: " + driver.findElement(By.id("lblMsg")).getText());
		
		driver.close();
	}

}
