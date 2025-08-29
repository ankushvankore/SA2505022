package com.StepDef;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import com.Hooks.MyHooks;

import io.cucumber.java.en.*;

public class S06TricentisVehicleApp{

	WebDriver driver = com.Hooks.MyHooks.driver;
	@Given("Launch Tricentis Vehicle App")
	public void launch_tricentis_vehicle_app() {
		
	}
	

	@When("Click on Automobile Link")
	public void click_on_automobile_link() {
	    driver.findElement(By.partialLinkText("Auto")).click();
	}

	@When("Select Automobile Make")
	public void select_automobile_make() {
	    new Select(driver.findElement(By.id("make"))).selectByVisibleText("Audi");;
	}

	@When("Enter Automobile Engine Performance")
	public void enter_automobile_engine_performance() {
	    driver.findElement(By.id("engineperformance")).sendKeys("2000");
	}

	@When("Enter Automobile DOM")
	public void enter_automobile_dom() {
	    driver.findElement(By.id("dateofmanufacture")).sendKeys("08/04/2025");
	}

	@When("Click on Truck Link")
	public void click_on_truck_link() {
		driver.findElement(By.partialLinkText("Truck")).click();
	}

	@When("Select Truck Make")
	public void select_truck_make() {
		new Select(driver.findElement(By.id("make"))).selectByVisibleText("Audi");;
	}

	@When("Enter Truck Engine Performance")
	public void enter_truck_engine_performance() {
		driver.findElement(By.id("engineperformance")).sendKeys("2000");
	}
	@When("Enter Truck DOM")
	public void enter_truck_dom() {
		driver.findElement(By.id("dateofmanufacture")).sendKeys("08/04/2025");
	}

	@When("Click on Motorcycle Link")
	public void click_on_motorcycle_link() {
	    driver.findElement(By.partialLinkText("Motor")).click();
	}

	@When("Select Motorcycle Make")
	public void select_motorcycle_make() {
		new Select(driver.findElement(By.id("make"))).selectByVisibleText("Audi");;
	}

	@When("Enter Motorcycle Engine Performance")
	public void enter_motorcycle_engine_performance() {
		driver.findElement(By.id("engineperformance")).sendKeys("2000");
	}

	@When("Enter Motorcycle DOM")
	public void enter_motorcycle_dom() {
		driver.findElement(By.id("dateofmanufacture")).sendKeys("08/04/2025");
	}

	@When("Click on Camper Link")
	public void click_on_camper_link() {
	    driver.findElement(By.partialLinkText("Camp")).click();
	}

	@When("Select Camper Make")
	public void select_camper_make() {
		new Select(driver.findElement(By.id("make"))).selectByVisibleText("Audi");;
	}

	@When("Enter Camper Engine Performance")
	public void enter_camper_engine_performance() {
		driver.findElement(By.id("engineperformance")).sendKeys("2000");
	}

	@When("Enter Camper DOM")
	public void enter_camper_dom() {
		driver.findElement(By.id("dateofmanufacture")).sendKeys("08/04/2025");
	}

}
