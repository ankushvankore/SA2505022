package com.StepDef;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class S08RediffRegistration {
	WebDriver driver;
	@Given("Launch Rediff registration page")
	public void launch_rediff_registration_page() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}

	@When("I Enter fullName as {string}")
	public void i_enter_full_name_as(String fullName) {
	    driver.findElement(By.xpath("(//input[contains(@name, \"name\")])[1]")).sendKeys(fullName);
	}

	@When("I Enter rediff id {string}")
	public void i_enter_rediff_id(String rid) {
		driver.findElement(By.xpath("//input[contains(@name, \"login\")]")).sendKeys(rid);
	}

	@When("I Enter password and confirm password as {string}")
	public void i_enter_password_and_confirm_password_as(String ps) {
	    driver.findElement(By.xpath("//input[@id='newpasswd']")).sendKeys(ps);
	    driver.findElement(By.xpath("//*[@id=\"newpasswd1\"]")).sendKeys(ps);
	}

	@When("I Select gender as {string}")
	public void i_select_gender_as(String gn) {
	    if(gn.equals("Male"))
	    	driver.findElement(By.xpath("//input[@value=\"m\"]")).click();
	    else
	    	driver.findElement(By.xpath("//input[@value=\"f\"]")).click();
	}

	@When("I click on Check availablity")
	public void i_click_on_check_availablity() {
	    driver.findElement(By.xpath("//input[contains(@name, \"btnchkavail\")]")).click();
	}

	@Then("Rediff id available message should display")
	public void rediff_id_available_message_should_display() {
	    String msg = driver.findElement(By.xpath("//*[@id=\"check_availability\"]/div/span")).getText();
	    Assert.assertTrue(msg.contains("available"));
	}
}
