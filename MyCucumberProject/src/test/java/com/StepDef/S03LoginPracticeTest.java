package com.StepDef;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class S03LoginPracticeTest {
	WebDriver driver;

	@Given("Open Practice Test Page")
	public void open_practice_test_page() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://practicetestautomation.com/practice-test-login/");
	}

	@When("Enter valid username")
	public void enter_valid_username() {
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("student");
	}

	@When("Enter valid password")
	public void enter_valid_password() {
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Password123");
	}

	@When("Click on Submit button")
	public void click_on_submit_button() {
		driver.findElement(By.xpath("//button[@id='submit']")).click();
	}

	@Then("Login should successful")
	public void login_should_successful() {
		Assert.assertTrue(driver.getCurrentUrl().contains("logged-in-successfully"));
	}


	@When("Enter invalid username and invalid password")
	public void enter_invalid_username_and_invalid_password() {
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("jainal");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("jainal123");
	}

	@When("Click on Submit")
	public void click_on_submit() {
		driver.findElement(By.xpath("//button[@id='submit']")).click();
	}

	@Then("Error message should display")
	public void error_message_should_display() {
		Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"error\"]")).getText().contains("invalid"));
	}
}
