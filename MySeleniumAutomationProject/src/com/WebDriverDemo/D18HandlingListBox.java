package com.WebDriverDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class D18HandlingListBox {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://omayo.blogspot.com/");

		// WebElement lstBox =
		// driver.findElement(By.xpath("//*[@id=\"multiselect1\"]"));
		// Select cars = new Select(lstBox);
		Select cars = new Select(driver.findElement(By.xpath("//*[@id=\"multiselect1\"]")));

		List<WebElement> carList = cars.getOptions();
		System.out.println("Cars in the list are");

		for (WebElement c : carList)
			System.out.println(c.getText());

		if (cars.isMultiple()) {
			cars.selectByIndex(1);
			cars.selectByIndex(3);

			List<WebElement> selectedCars = cars.getAllSelectedOptions();

			System.out.println("\nSelected Cars");
			for (WebElement sc : selectedCars)
				System.out.println(sc.getText());
		}
		//cars.deselectAll();
		//cars.deselectByIndex(3);
		//cars.deselectByValue("audix");
		//cars.deSelectByContainsVisibleText("Au");
		cars.deselectByVisibleText("Audi");
	}

}
