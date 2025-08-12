package com.WebDriverDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D25HandlingFileUpload {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://demoqa.com/automation-practice-form");
		
		((JavascriptExecutor)driver).executeScript("window.scrollBy(0, 400)", "");
		
		driver.findElement(By.id("firstName")).sendKeys("Shabana");
		driver.findElement(By.id("lastName")).sendKeys("Nayab");
		driver.findElement(By.id("userEmail")).sendKeys("shabana@gmail.com");
		WebElement gn = driver.findElement(By.id("gender-radio-2"));
		((JavascriptExecutor)driver).executeScript("arguments[0].click()", gn);
		driver.findElement(By.id("userNumber")).sendKeys("8787878787");
		driver.findElement(By.id("dateOfBirthInput")).sendKeys(Keys.CONTROL + "A");
		driver.findElement(By.id("dateOfBirthInput")).sendKeys("01 Jan 2001");
		
		driver.findElement(By.id("uploadPicture")).sendKeys("D:\\AViIT\\Demos\\Selenium_13\\Notes.docx");
		
		((JavascriptExecutor)driver).executeScript("window.scrollBy(0, 400)", "");
		driver.findElement(By.xpath("//*[@id=\"state\"]/div/div[2]/div")).click();
		driver.findElement(By.xpath("//*[@id=\"react-select-3-option-2\"]")).click();
	}

}
