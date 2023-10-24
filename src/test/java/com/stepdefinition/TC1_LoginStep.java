package com.stepdefinition;

import java.awt.AWTException;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.base.BaseClass1;
import com.pagemanager.PageObjectManager;
import com.pages.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC1_LoginStep extends BaseClass1 {

	PageObjectManager pom =new PageObjectManager();
	
	//LoginPage log = new LoginPage();

	/**
	 * Description:User is on Adactin Page
	 * Date: 21-08-2022
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	/*@Given("User is on Adactin Page")
	public void userIsOnAdactinPage() throws FileNotFoundException, IOException {

		getDriver(getPropertyFileValue("browserName"));		
		launchurl(getPropertyFileValue("url"));
		maximize();	
       
	}*/
	/**
	 * Description:User should Login
	 * Date: 21-08-2022
	 * @param username
	 * @param password 
	 */
	@When("User should Login {string},{string}")
	public void userShouldLogin(String username, String password) {

		pom.getLoginpage().login(username,password);
		//log.login(username, password);
	}

	/**
	 * Description: User should Login with enter key
	 * Date: 21-08-2022
	 * @param username
	 * @param password
	 * @throws AWTException
	 */

	@When("User should Login  {string},{string} with enter key")
	public void userShouldLoginWithEnterKey(String username, String password) throws AWTException {

		pom.getLoginpage().loginWithEnter(username, password);
	}

/**
 * Description: User should Login with Invalid Credential
 * Author : Najimunisa Begum
 * Date:21-08-2022
 * @param username
 * @param password
 */

	@When("User should Login with Invalid Credential {string},{string}")
	public void userShouldLoginWithInvalidCredential(String username, String password) {

		pom.getLoginpage().login(username, password);

	}
	/**
	 * Description:User should verify after Login contains error message
	 * Author : Najimunisa Begum
	 * Date:21-08-2022
	 * @param ExpectedErrorMessage
	 */
	@Then("User should verify after Login contains error message {string}")
	public void userShouldVerifyAfterLoginContainsErrorMessage(String ExpectedErrorMessage) {

		WebElement txtErrorMessage = pom.getLoginpage().getTxtErrorMessage();
		Assert.assertTrue(txtErrorMessage.getText().contains(ExpectedErrorMessage));
		//Assert.assertTrue(false, "everyafterscenario");

	}
 



}
