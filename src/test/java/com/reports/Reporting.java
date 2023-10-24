package com.reports;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;



public class Reporting {
	
	public static void generateJvmReport(String jsonfile) {
		
		
		File file = new File("C:\\Users\\user\\eclipse-workspace\\OMRBranchAdactinAutomation\\target");
		
		Configuration configuration = new Configuration(file, "OMRBranchAdactinAutomation");
		configuration.addClassifications("Browser", "Chrome");
		configuration.addClassifications("BrowserVersion", "104");
		configuration.addClassifications("OS", "WIN10");
		configuration.addClassifications("Sprint", "34");
		
		List<String> jsonfiles = new ArrayList<String>();
		
		jsonfiles.add(jsonfile);
		
		ReportBuilder builder = new ReportBuilder(jsonfiles,configuration);
		builder.generateReports();
		
		
				
				

		
	}
	
	

}
