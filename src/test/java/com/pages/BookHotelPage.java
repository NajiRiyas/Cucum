package com.pages;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass1;

public class BookHotelPage extends BaseClass1 {

	public BookHotelPage() {

		PageFactory.initElements(driver, this);

	}

	@FindBy(id="first_name")
	private WebElement txtFirstName;	

	@FindBy(id="last_name")
	private WebElement txtLastName;

	@FindBy(id="address")
	private WebElement txtAddress;

	@FindBy(id="cc_num")
	private WebElement txtCCNum;

	@FindBy(id="cc_type")
	private WebElement txtCCType;

	@FindBy(id="cc_exp_month")
	private WebElement expMonth;

	@FindBy(id="cc_exp_year")
	private WebElement expYear;

	@FindBy(id="cc_cvv")
	private WebElement txtCVV;

	@FindBy(id="book_now")
	private WebElement btnClickBookNow;

	@FindBy(id="first_name_span")
	private WebElement PlsEnterFirstNameErrorMessage;

	@FindBy(id="last_name_span")
	private WebElement PlsEnterLastNameErrorMessage;

	@FindBy(id="address_span")
	private WebElement PlsEnterAddressErrorMessage;

	@FindBy(id="cc_num_span")
	private WebElement PlsEnterCCNumErrorMessage;

	@FindBy(id="cc_type_span")
	private WebElement PlsEnterCCTypeErrorMessage;

	
	@FindBy(id="cc_expiry_span")
	private WebElement PlsEnterExpMonandYearErrorMessage;

	@FindBy(id="cc_cvv_span")	
	private WebElement PlsEnterCVVErrorMessage;

	public WebElement getTxtFirstName() {
		return txtFirstName;
	}

	public WebElement getTxtLastName() {
		return txtLastName;
	}

	public WebElement getTxtAddress() {
		return txtAddress;
	}

	public WebElement getTxtCCNum() {
		return txtCCNum;
	}

	public WebElement getTxtCCType() {
		return txtCCType;
	}

	public WebElement getExpMonth() {
		return expMonth;
	}

	public WebElement getExpYear() {
		return expYear;
	}

	public WebElement getTxtCVV() {
		return txtCVV;
	}

	public WebElement getBtnClickBookNow() {
		return btnClickBookNow;
	}

	public WebElement getPlsEnterFirstNameErrorMessage() {
		return PlsEnterFirstNameErrorMessage;
	}

	public WebElement getPlsEnterLastNameErrorMessage() {
		return PlsEnterLastNameErrorMessage;
	}

	public WebElement getPlsEnterAddressErrorMessage() {
		return PlsEnterAddressErrorMessage;
	}

	public WebElement getPlsEnterCCNumErrorMessage() {
		return PlsEnterCCNumErrorMessage;
	}

	public WebElement getPlsEnterCCTypeErrorMessage() {
		return PlsEnterCCTypeErrorMessage;
	}

	
	
	public WebElement getPlsEnterExpMonandYearErrorMessage() {
		return PlsEnterExpMonandYearErrorMessage;
	}

	public WebElement getPlsEnterCVVErrorMessage() {
		return PlsEnterCVVErrorMessage;
	}


	//By select all fields and verify Booking Confirmation
	

public void bookhotel(String firstName, String lastName, String address, io.cucumber.datatable.DataTable dataTable) {
    
		textSend(getTxtFirstName(), firstName);	
		textSend(getTxtLastName(), lastName);
		textSend(getTxtAddress(), address);
		List<Map<String, String>> l = dataTable.asMaps();	
		Map<String, String> map = l.get(0);
		String cardNo = map.get("Credit_Card_No");
		String cardType = map.get("Credit_Card_Type");
		String expMonth = map.get("Expiry_Month");
		String expYear = map.get("Expiry_Year");
		String cvv = map.get("CVV_Number");
		
		
		
		
		
		textSend(getTxtCCNum(), cardNo);
		SelectOptionsByText(getTxtCCType(), cardType);
		SelectOptionsByText(getExpMonth(), expMonth);
		SelectOptionsByText(getExpYear(), expYear);
		textSend(getTxtCVV(), cvv);
		buttonclick(btnClickBookNow);
		
	

	}

//Login page and verify 7 error messages by without entering any fields

	public void BookHotel() {
		
		buttonclick(getBtnClickBookNow());
		

	}







}
