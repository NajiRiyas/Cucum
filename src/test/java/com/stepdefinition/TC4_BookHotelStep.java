package com.stepdefinition;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;

import com.base.BaseClass1;
import com.pagemanager.PageObjectManager;

import io.cucumber.java.en.Then;

public class TC4_BookHotelStep extends BaseClass1{

	PageObjectManager pom = new PageObjectManager();


	/**
	 * 
	 * Description: User should Book by Select all fields
	 * Author : Najimunisa Begum
	 * Date:21-08-2022
	 * @param firstName
	 * @param lastName
	 * @param address
	 * @param dataTable
	 */
	@Then("User should Book by Select all fields {string},{string} and {string}")
	public void userShouldBookBySelectAllFieldsAnd(String firstName, String lastName, String address, io.cucumber.datatable.DataTable dataTable) {
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		/*List<Map<String, String>> asMaps = dataTable.asMaps();

		textSend(pom.getBookHotelPage().getTxtCCNum(), asMaps.get(0).get("Credit_Card_No"));	
		textSend(pom.getBookHotelPage().getTxtCCType(), asMaps.get(0).get("Credit_Card_Type"));
		textSend(pom.getBookHotelPage().getExpMonth(), asMaps.get(0).get("Expiry_Month"));
		textSend(pom.getBookHotelPage().getExpYear(), asMaps.get(0).get("Expiry_Year"));
		textSend(pom.getBookHotelPage().getTxtCVV(), asMaps.get(0).get("CVV_Number"));
		 */

		pom.getBookHotelPage().bookhotel(firstName, lastName, address, dataTable);		
	}
	/**
	 * Description: User should verify after Book Hotel 
	 * Author : Najimunisa Begum
	 * Date:21-08-2022
	 * @param bookHotelMsg
	 */

	@Then("User should verify after Book Hotel {string}")
	public void userShouldVerifyAfterBookHotel(String bookHotelMsg) {

		/*	Assert.assertEquals("Verify after click Book now bookHotelMsg msg is present", bookHotelMsg,getAttributeValue(pom.getBookingConfirmaPage().getTxtBookingconfirmation()));
		 */
	}
	/**
	 * Description: User should Book without entering any fields
	 * Author : Najimunisa Begum
	 * Date:21-08-2022
	 * @param string
	 * @param string2
	 * @param string3
	 */
	@Then("User should Book without entering any fields {string},{string} and {string}")
	public void userShouldBookWithoutEnteringAnyFieldsAnd(String string, String string2, String string3) {

		pom.getBookHotelPage().getBtnClickBookNow();
	}

	/**
	 * Description: User should verify after Book Hotel exact Seven error messages
	 * Author : Najimunisa Begum
	 * Date:21-08-2022
	 * @param expectedFirstNameErrorMsg
	 * @param expectedLastNameErrorMsg
	 * @param expectedAddressErrorMsg
	 * @param expectedccNumErrorMsg
	 * @param expectedccTypeErrorMsg
	 * @param expectedExpMonthErrorMsg
	 * @param expectedCVVErrorMsg
	 */
	@Then("User should verify after Book Hotel exact Seven error messages {string}, {string}, {string}, {string}, {string}, {string} and {string}")
	public void userShouldVerifyAfterBookHotelExactSevenErrorMessagesAnd(String expectedFirstNameErrorMsg, String expectedLastNameErrorMsg, String expectedAddressErrorMsg, String expectedccNumErrorMsg, String expectedccTypeErrorMsg, String expectedExpMonthErrorMsg, String expectedCVVErrorMsg) {

		Assert.assertEquals("Verify expectedFirstNameErrorMsg is present", expectedFirstNameErrorMsg,getAttributeValue(pom.getBookHotelPage().getPlsEnterFirstNameErrorMessage()));










	}




}
