package com.StepDef;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class S02GoogleSearch {
	WebDriver driver;
	@Given("I Open Google")
	public void i_open_google() {
		driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    
	    driver.get("https://www.google.com");
	}

	@When("Enter keyword to search")
	public void enter_keyword_to_search() {
	    driver.findElement(By.name("q")).sendKeys("Cucumber");
	}

	@When("Hit Enter")
	public void hit_enter() {
	    driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	}

	@Then("Valid search result should display")
	public void valid_search_result_should_display() {
	    Assert.assertTrue(driver.getCurrentUrl().contains("Cucumber"));
	}

}
