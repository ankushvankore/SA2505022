package com.StepDef;

import java.util.List;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class S07Registration {
	@Given("Launch registration page")
	public void launch_registration_page() {
	    System.out.println("Launching registration pae");
	}

	@When("I enter following data")
	public void i_enter_following_data(io.cucumber.datatable.DataTable dataTable) {
	    System.out.println(dataTable);
	    
	    List<List<String>>data = dataTable.asLists();
	    System.out.println(data);
	    for(List<String>d : data) {
	    	for(String d1 : d)
	    		System.out.println(d1);
	    }
	}

	@Then("Registration should successful")
	public void registration_should_successful() {
	    System.out.println("Registration success");
	}
}
