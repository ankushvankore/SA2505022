package com.RunnerClass;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/MyCucumberProject/MyCucumberProject/F04DemoQARegistration.feature",
					glue = "com.StepDef",
					publish = true, 
					plugin = {"json:Reports/Cucumber-json.json", 
								"junit:Reports/xmlReport.xml"})
public class R05DemoQARegistration {

}
