 package com.stepdefinition;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.base.BaseClass1;
import com.pagemanager.PageObjectManager;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;


public class HooksClass extends BaseClass1 {
	
	
	@Before
	public void beforeScenario() throws FileNotFoundException, IOException {
		
		getDriver(getPropertyFileValue("browserName"));		
		launchurl(getPropertyFileValue("url"));
		maximize();
		
	}
	
	@After
	
	public void afterScenario(Scenario scenario) {
		
		// if scenario failed -true, else false
		if (scenario.isFailed()) {
			
			TakesScreenshot screenshot = (TakesScreenshot)driver;
			byte[] b  = screenshot.getScreenshotAs(OutputType.BYTES);
			
			scenario.attach(b, "png", "EveryAfterScenario");
			
			//scenario.embed method used to takesscreenShot
			
		} 	
		

		Quit();
		

	}}

