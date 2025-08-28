package com.RunnerClass;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/MyCucumberProject/MyCucumberProject/F05BigBasketLinks.feature",
					glue = "com.StepDef",
					publish = true,
					tags = "@AllScenarios")
public class R05BigBasketLinks {
	/*
	 * Execute Single Scenario:		tags = "@SanityTest"
	 * Execute Multiple Scenarios:	tags = "@SanityTest or @PerformanceTest"
	 * Skip Single Scenario:		tags = "not @UsabilityTest"
	 * Skip Multiple Scenarios:		tags = "not @UsabilityTest and not @SmokeTest")
	 * Execute All Scenarios:		tags = "@AllScenarios"
	 */
}
