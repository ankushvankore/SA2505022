package com.Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A31RevenueCalculator {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.fitpeo.com/revenue-calculator");
		
		//Actions act = new Actions(driver);
		WebElement slider = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div/div/span[1]/span[3]/input"));
		((JavascriptExecutor)driver).executeScript("window.scrollBy(0, 400)", "");
		
		//act.dragAndDropBy(slider, slider.getLocation().x+10, slider.getLocation().y).perform();
		
		for(int i = 0; i < 50; i++)
			slider.sendKeys(Keys.RIGHT);
	}

}
