package com.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.reports.Reporting;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(tags = "@BookHotel",stepNotifications = true, dryRun = false,snippets=SnippetType.CAMELCASE,monochrome=true,
publish=true,plugin= {"pretty","json:target/output3.json", "rerun:target/output3.text"},
features= {"src\\test\\resources"},glue= {"com.stepdefinition"}
)  


 
public class TestRunnerClass {
	
	
	@AfterClass  
	
	public static void afterclass() {

		Reporting.generateJvmReport("C:\\Users\\user\\eclipse-workspace\\OMRBranchAdactinAutomation\\target\\output3.json");
		
	}	
	
	
			
	}
	
	
	
	
	
	
	
	
	

	































