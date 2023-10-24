package com.stepdefinition;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.base.BaseClass1;
import com.pagemanager.PageObjectManager;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.it.Date;

public class TC2_SearchHotelStep extends BaseClass1 {

	PageObjectManager pom =new PageObjectManager();
	/**
	 * Description:User should Search hotel
	 * Author : Najimunisa Begum
	 * Date: 21-08-2022
	 * @param Location
	 * @param Hotel
	 * @param RoomType
	 * @param NosRooms
	 * @param checkInDate
	 * @param checkOutDate
	 * @param AdultperRoom
	 * @param ChildrenPerRoom
	 * @throws FileNotFoundException
	 * @throws IOException
	 */



	@When("User should Search hotel {string},{string},{string},{string},{string},{string},{string} and {string}")
	public void userShouldSearchHotelAnd(String Location, String Hotel, String RoomType, String NosRooms, String checkInDate, String checkOutDate, String AdultperRoom, String ChildrenPerRoom) throws FileNotFoundException, IOException {

		pom.getSearchHotelPage().searchhotel(Location, Hotel, RoomType, NosRooms, checkInDate, checkOutDate, AdultperRoom, ChildrenPerRoom);

	}
	/** Description: User should verify after search
	 * Author : Najimunisa Begum
	 * Date: 21-08-2022
	 * 
	 * @param expectedMessage
	 */


	@Then("User should verify after search {string}")
	public void userShouldVerifyAfterSearch(String expectedMessage) {

		/*String actMessage = getText(pom.getSearchHotelPage().getTxtConfirmationMessage());


	   Assert.assertEquals(expectedMessage, actMessage,"Verify after search message is present");	
		 */


	}


	/**
	 * Description:User should Search hotel only mandatory fields
	 * Author : Najimunisa Begum
	 * Date: 21-08-2022
	 * @param Location
	 * @param NosRooms
	 * @param checkInDate
	 * @param checkOutDate
	 * @param AdultperRoom
	 */


	@When("User should Search hotel only mandatory fields {string},{string},{string},{string} and {string}")
	public void userShouldSearchHotelOnlyMandatoryFieldsAnd(String Location, String NosRooms, String checkInDate,String checkOutDate, String AdultperRoom) {

		pom.getSearchHotelPage().Searchhotel(Location, NosRooms, checkInDate, checkOutDate, AdultperRoom);
	}

	/**
	 * Date: 21-08-2022
	 * Description: User should verify the error message after selecting the incorrect date
	 * Author : Najimunisa Begum
	 * @param Location
	 * @param Hotel
	 * @param RoomType
	 * @param NosRooms
	 * @param checkInDate
	 * @param checkOutDate
	 * @param AdultperRoom
	 * @param ChildrenPerRoom
	 */
	@When("User should Search hotel by selecting invalid date {string},{string},{string},{string},{string},{string},{string} and {string}")
	public void userShouldSearchHotelBySelectingInvalidDateAnd(String Location, String Hotel, String RoomType, String NosRooms, String checkInDate, String checkOutDate, String AdultperRoom, String ChildrenPerRoom) {

		pom.getSearchHotelPage().Searchhotel(Location, NosRooms, checkInDate, checkOutDate, AdultperRoom);

	}
	/**
	 * Description: User should verify after search exact two error message in Date Checking
	 * Author : Najimunisa Begum
	 * Date: 21-08-2022
	 * @param DateCheckIn
	 * @param DateCheckOut
	 */

	@Then("User should verify after search exact two error message in Date Checking {string},{string}")
	public void userShouldVerifyAfterSearchExactTwoErrorMessageInDateChecking(String DateCheckIn, String DateCheckOut) {

		Assert.assertEquals("Verify after Datacheckin error message is present", DateCheckIn,getAttributeValue(pom.getSearchHotelPage().getTxtdatechINErrorMessage()));
		Assert.assertEquals("Verify after DatacheckOut error message is present", DateCheckOut,getAttributeValue(pom.getSearchHotelPage().getTxtdatechOUTErrorMessage()));

	}

	/**
	 * Description: User should Search hotel without selecting any fields
	 * Author : Najimunisa Begum
	 * Date: 21-08-2022
	 */
	@When("User should Search hotel without selecting any fields")
	public void userShouldSearchHotelWithoutSelectingAnyFields() {

		pom.getSearchHotelPage().searhotel();


	}
	/**
	 * Description: User should verify after search exact error message
	 * AAuthor : Najimunisa Begum
	 * Date: 21-08-2022
	 * @param errorMessage
	 */

	@Then("User should verify after search exact error message {string}")
	public void userShouldVerifyAfterSearchExactErrorMessage(String errorMessage) {

		WebElement txtselectLocationErrorMessage = pom.getSearchHotelPage().getTxtselectLocationErrorMessage();
		Assert.assertTrue(txtselectLocationErrorMessage.getText().contains(errorMessage));

		/*	Assert.assertEquals("Verify after search error message is present", errorMessage,getAttributeValue(pom.getSearchHotelPage().getTxtselectLocationErrorMessage()));

		 */

	}}



