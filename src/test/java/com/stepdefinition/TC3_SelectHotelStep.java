package com.stepdefinition;

import org.testng.Assert;

import com.base.BaseClass1;
import com.pagemanager.PageObjectManager;

import io.cucumber.java.en.Then;

public class TC3_SelectHotelStep extends BaseClass1 {

	PageObjectManager pom =new PageObjectManager();
	
	
	/**
	 * Description: User should click any one hotel
	 * Author : Najimunisa Begum
	 * Date:21-08-2022
	 * @throws InterruptedException
	 */
	
	@Then("User should click any one hotel")
	public void userShouldClickAnyOneHotel() throws InterruptedException {
        
		pom.getSelectHotelPage().selecthotel();


	}
	
	/**
	 * Description: User should verify after Select Hotel
	 * Author : Najimunisa Begum
	 * Date:21-08-2022
	 * @param bookHotelMessage
	 */
	@Then("User should verify after Select Hotel {string}")
	public void userShouldVerifyAfterSelectHotel(String bookHotelMessage) {
		
		/*String text = getText(pom.getSelectHotelPage().getTxtConfirmBookHotelMessage());
		//String trim = text.trim();
		Assert.assertEquals("verify after selectHotel book hotel message is present", bookHotelMessage,text);
	
	*/
	
	}

/**
 * Description: User should click continue without select any hotels 
 * Author : Najimunisa Begum
 * Date:21-08-2022
 */
	@Then("User should click continue without select any hotels")
	public void userShouldClickContinueWithoutSelectAnyHotels() {

		pom.getSelectHotelPage().clickcontinue();
	}
	/**
	 * Description:User should verify exact error message after click continue
	 * Author : Najimunisa Begum
	 * Date:21-08-2022
	 * @param PleaseSelectHotelError
	 */
	@Then("User should verify exact error message after click continue as {string}")
	public void userShouldVerifyExactErrorMessageAfterClickContinueAs(String PleaseSelectHotelError) {

		Assert.assertEquals("verify after click continue in selecthotel page error message is present", PleaseSelectHotelError,getAttributeValue(pom.getSelectHotelPage().getTxtSelectHotelErrorMessage()));
	
	}



}
