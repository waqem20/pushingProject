package com.stepDefinitions;

import org.junit.After;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.utils.BaseClass;

import cucumber.api.Scenario;
import cucumber.api.java.Before;

public class Hooks {
	@Before
	public void start() {
		BaseClass.browsers();
	}
	
	@After
	public void end(Scenario scenario) {
		//if scenario failes
		if(scenario.isFailed()) {
			TakesScreenshot pic=(TakesScreenshot)BaseClass.driver;
			byte[] picture = pic.getScreenshotAs(OutputType.BYTES);
			//attach to the report
			scenario.embed(picture, "image/png");
		}
		BaseClass.tearDown();
	}

}
