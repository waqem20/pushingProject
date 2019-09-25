package com.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"src\\test\\resources\\features"},
				 glue = {"src\\test\\java\\com\\stepDefinitions\\LoginPageStep.java"},
				 dryRun = true,
				 monochrome = true,
				 tags = {"@Login"},
				 plugin = {"pretty",
						   "html:target/cucumber-default-reports",
						   "json:targer/cucumber.json",
						   "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"
							
				}		 
				 
				)
public class TestRunner {
	

}
 