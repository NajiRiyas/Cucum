package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        
        /*tags=("@Cancel"),
        dryRun=false,
        monochrome=true,
        publish=true,
        stepNotifications=true,snippets=SnippetType.CAMELCASE,
        plugin= {"pretty","html:target\\login.html",
        "junit:target\\login.xml",
        "json:target\\login.json"},*/
        features= {"@C:\\Users\\User\\eclipse-workspace\\OMRBranchAdctinAutomation\\target\\rerun.txt"},glue= {"com.stepdefinition"})
public class FailedRunnerClass {
}

