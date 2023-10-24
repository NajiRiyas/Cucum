package com.stepdefinition;

import javax.lang.model.element.Element;

import org.testng.Assert;

import com.base.BaseClass1;
import com.pagemanager.PageObjectManager;

import io.cucumber.java.en.Then;

public class CommonStep extends BaseClass1 {
	
	PageObjectManager pom =new PageObjectManager();
	
	/**
	 * Description: User should verify after Login success message
	 * Author : Najimunisa Begum
	 * Date:21-08-2022
	 * @param expWelcomeLoginMsg
	 */
	@Then("User should verify after Login success message {string}")
	public void userShouldVerifyAfterLoginSuccessMessage(String expWelcomeLoginMsg) {
		
		Assert.assertEquals(getAttributeValue(pom.getSearchHotelPage().getTxtLoginSuccessMessage()), 
				expWelcomeLoginMsg,"Verify after login welcome message is present");
		
		
	}
	

	


}
