package com.StepDef;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class S04DemoQARegistration {
	WebDriver driver;
	@Given("Launch DemoQA site")
	public void launch_demo_qa_site() {
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    
	    driver.get("https://demoqa.com/automation-practice-form");
	}

	@When("Enter valid firstName as {string}")
	public void enter_valid_first_name_as(String fn) {
	    driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys(fn);
	}

	@When("Enter valid LastName as {string}")
	public void enter_valid_last_name_as(String ln) {
	    driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys(ln);
	}

	@When("Enter valid EmailID as {string}")
	public void enter_valid_email_id_as(String email) {
	    driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys(email);
	}

	@Then("Registration ends")
	public void registration_ends() {
	    System.out.println("Thanks for registration!!!");
	}

	@When("Enter invalid firstName as {string}")
	public void enter_invalid_first_name_as(String fn) {
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys(fn);
	}


	@When("Enter invalid LastName as {string}")
	public void enter_invalid_last_name_as(String ln) {
	    driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys(ln);
	}

	@When("Enter invalid EmailID as {string}")
	public void enter_invalid_email_id_as(String email) {
	    driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys(email);
	}

	@Then("Registration fail")
	public void registration_fail() {
	    System.out.println("Sorry registration fail");
	}
}
