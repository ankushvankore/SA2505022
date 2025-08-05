package com.Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A13EchoechoCheckBox {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://echoecho.com/htmlforms09.htm");

		//List<WebElement>checkBoxes = driver.findElements(By.cssSelector("input[name^=\"option\"]"));
		List<WebElement>checkBoxes = driver.findElements(By.xpath("/html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td/input"));
		
		for(WebElement cb : checkBoxes)
		{
			System.out.println("Before...");
			System.out.println(cb.getDomAttribute("value") + " Selected: " + cb.isSelected());
			System.out.println(cb.getAttribute("value") + " Enabled : " + cb.isEnabled());
			System.out.println(cb.getAttribute("value") + " Visible : " + cb.isDisplayed());

			if (cb.isSelected() == false)
				cb.click();

			System.out.println("\nAfter...");
			System.out.println(cb.getAttribute("value") + " Selected: " + cb.isSelected());
			System.out.println(cb.getAttribute("value") + " Enabled : " + cb.isEnabled());
			System.out.println(cb.getAttribute("value") + " Visible : " + cb.isDisplayed());
		}
		
		
		
		
	}

}
