package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass1;

public class CancelBookingPage extends BaseClass1{


	public CancelBookingPage() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//a[text()='Booked Itinerary']")
	private WebElement BookedItinerary;

	@FindBy(id="order_id_text")
	private WebElement txtSearchBox;

	@FindBy(id="search_hotel_id")
	private WebElement goButtonclick;  


	@FindBy(xpath="(//input[contains(@value,'Cancel')])[1]")
	private WebElement clickcancelorderid;

	@FindBy(xpath="//input[@value='Cancel Selected']")
	private WebElement cancelSelected;
	
	@FindBy(id="search_result_error")
	private WebElement bookingcancelMsg;



	public WebElement getBookedItinerary() {
		return BookedItinerary;
	}


	public WebElement getBookingcancelMsg() {
		return bookingcancelMsg;
	}


	public WebElement getCancelSelected() {
		return cancelSelected;
	}


	

	public WebElement getTxtSearchBox() {
		return txtSearchBox;
	}


	public WebElement getGoButtonclick() {
		return goButtonclick;
	}


	public WebElement getClickcancelorderid() {
		return clickcancelorderid;
	}


	public void cancelOrderId(String orderId) {

		buttonclick(getBookedItinerary());
		textSend(getTxtSearchBox(),orderId);
		buttonclick(getGoButtonclick());
		buttonclick(getClickcancelorderid());
		confirmAlert();

	}




}
