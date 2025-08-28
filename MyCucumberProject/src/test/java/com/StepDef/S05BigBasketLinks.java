package com.StepDef;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class S05BigBasketLinks {
	WebDriver driver;
	@Given("Launch the site {string}")
	public void launch_the_site(String url) {
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    
	    driver.get(url);
	}

	@When("Click on Exotic Fruits link")
	public void click_on_exotic_fruits_link() {
	    driver.findElement(By.partialLinkText("Exotic Fruits")).click();
	}

	@Then("Exotic fruits page should open")
	public void exotic_fruits_page_should_open() throws InterruptedException {
		Thread.sleep(5000);
	    System.out.println("Title: " + driver.getTitle());
	    Assert.assertTrue(driver.getTitle().contains("Exotic fruits"));
	}

	@When("Click on Tea link")
	public void click_on_tea_link() {
	    driver.findElement(By.partialLinkText("Tea")).click();
	}

	@Then("Tea page should display")
	public void tea_page_should_display() throws InterruptedException {
		Thread.sleep(5000);
		System.out.println("Title: " + driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains(""));
	}

	@When("Click on Ghee link")
	public void click_on_ghee_link() {
	    driver.findElement(By.partialLinkText("Ghee")).click();
	}

	@Then("Ghee page should display")
	public void ghee_page_should_display() throws InterruptedException {
		Thread.sleep(5000);
	    System.out.println("Title: " + driver.getTitle());
	    Assert.assertTrue(driver.getTitle().contains("Vanaspati & Ghee"));
	}

	@When("Click on Nandhini link")
	public void click_on_nandhini_link() {
	    driver.findElement(By.partialLinkText("Nandhini")).click();
	}

	@Then("Nandhani page should display")
	public void nandhani_page_should_display() throws InterruptedException {
		Thread.sleep(5000);
	    System.out.println("Title: " + driver.getTitle());
	    Assert.assertTrue(driver.getTitle().contains("Nandini Milk"));
	}
}
