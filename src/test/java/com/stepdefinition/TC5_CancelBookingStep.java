package com.stepdefinition;

import org.testng.Assert;

import com.base.BaseClass1;
import com.pagemanager.PageObjectManager;

import io.cucumber.java.en.Then;

public class TC5_CancelBookingStep extends BaseClass1{

	PageObjectManager pom = new PageObjectManager();


	/**
	 * Description: User should Navigate to Booked Itinerary and Cancel Order Id
	 * Author : Najimunisa Begum
	 * Date:21-08-2022
	 */
	@Then("User should Navigate to Booked Itinerary and Cancel Order Id")
	public void userShouldNavigateToBookedItineraryAndCancelOrderId() {	

		pom.getCancelBookingPage().cancelOrderId(pom.getBookingConfirmaPage().getorderid());


	} 
	/**
	 * Description: User should verify after Cancel Order Id 
	 * Author : Najimunisa Begum
	 * Date:21-08-2022
	 * @param bookingcancelled
	 */

	@Then("User should verify after Cancel Order Id {string}")
	public void userShouldVerifyAfterCancelOrderId(String bookingcancelled) {


		/*pom.getCancelBookingPage().getBookingcancelMsg();

		Assert.assertEquals("Verify booking cancel Msg",bookingcancelled,getAttributeValue(pom.getCancelBookingPage().getBookingcancelMsg()));
*/
	}

	/**
	 * Description: User should Navigate to Booked Itinerary and Cancel existing order id 
	 * Author : Najimunisa Begum
	 * Date:21-08-2022
	 * @param existingorderId
	 */
	
	@Then("User should Navigate to Booked Itinerary and Cancel existing order id {string}")
	public void userShouldNavigateToBookedItineraryAndCancelExistingOrderId(String existingorderId) {
		pom.getCancelBookingPage().cancelOrderId(existingorderId);
		
	

	}

	/**
	 * Description: User should verify after Cancel existing Order Id message in Booked Itinerary page
	 * Author : Najimunisa Begum
	 * Date:21-08-2022
	 * @param existingorderidcancelMsg
	 */
	@Then("User should verify after Cancel existing Order Id message in Booked Itinerary page as {string}")
	public void userShouldVerifyAfterCancelExistingOrderIdMessageInBookedItineraryPageAs(String existingorderidcancelMsg) {
		
		
		Assert.assertEquals("verify the existing id booking has been canceled",existingorderidcancelMsg,getAttributeValue(pom.getCancelBookingPage().getBookingcancelMsg()));


	}


}
