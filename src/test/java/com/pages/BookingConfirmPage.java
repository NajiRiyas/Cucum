 package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass1;

public class BookingConfirmPage extends BaseClass1 {

	public BookingConfirmPage() {
 
		PageFactory.initElements(driver, this);

	}

	@FindBy(id="order_no")
	private WebElement orderID;
	
	@FindBy(xpath="//td[text()='Booking Confirmation']")
	private WebElement txtBookingconfirmation;
	
	
	
	public WebElement getOrderID() {
		return orderID;
	}

	public WebElement getTxtBookingconfirmation() {
		return txtBookingconfirmation;
	}
	
	
	
	//Booking Confirmation text Locator
	//order id locator
	public String getorderid() {
		
		String attributeValue = getAttributeValue(getOrderID());
		return attributeValue;

		
	}


}
