package com.WebDriverDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class D17HandlingDropdownList {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		
		WebElement drpList = driver.findElement(By.id("country"));
		Select countries = new Select(drpList);
		//All the operations on the drop down list can be performed only via
		//this object of Select class
		System.out.println("Selected Country: " + countries.getFirstSelectedOption().getText());
		
		List<WebElement>allCountries = countries.getOptions();
		//This object is just get a list of options
		System.out.println("Total Countries: " + allCountries.size());
		
		for(WebElement c : allCountries)
		{
			System.out.println(c.getText());
		}
		
		//countries.selectByContainsVisibleText("Polan");
		//countries.selectByVisibleText("Poland");
		countries.selectByValue("169");
		System.out.println("Selected Country: " + countries.getFirstSelectedOption().getText());
		
	}

}
