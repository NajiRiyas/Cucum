package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass1;

public class SearchHotelPage extends BaseClass1{

	public SearchHotelPage() {

		PageFactory.initElements(driver, this); 

	}


	@FindBy(id="username_show")
	private WebElement txtLoginSuccessMessage;

	@FindBy(id="location")
	private WebElement txtLocation;

	@FindBy(id="hotels")
	private WebElement txtHotel;

	@FindBy(id="room_type")
	private WebElement txtroomtype;

	@FindBy(id="room_nos")
	private WebElement txtroomnos;

	@FindBy(id="datepick_in")
	private WebElement txtdatepickin;

	@FindBy(id="datepick_out")
	private WebElement txtdatepickout;

	@FindBy(id="adult_room")
	private WebElement txtadultroom;

	@FindBy(id="child_room")
	private WebElement txtchildroom;

	@FindBy(id="Submit")
	private WebElement btnSearch;

	@FindBy(xpath="//td[text()='Select Hotel ']")
	public WebElement txtConfirmationMessage;

	@FindBy(id="checkin_span")
	private WebElement txtdatechINErrorMessage;

	@FindBy(id="datepick_out")
	private WebElement txtdatechOUTErrorMessage;

	@FindBy(id="location_span")
	private WebElement txtselectLocationErrorMessage;


	public WebElement getTxtLoginSuccessMessage() {
		return txtLoginSuccessMessage;
	}
	public WebElement getTxtLocation() {
		return txtLocation;
	}
	public WebElement getTxtHotel() {
		return txtHotel;
	}

	public WebElement getTxtroomtype() {
		return txtroomtype;
	}

	public WebElement getTxtroomnos() {
		return txtroomnos;
	}

	public WebElement getTxtdatepickin() {
		return txtdatepickin;
	}

	public WebElement getTxtdatepickout() {
		return txtdatepickout;
	}

	public WebElement getTxtadultroom() {
		return txtadultroom;
	}

	public WebElement getTxtchildroom() {
		return txtchildroom;
	}

	public WebElement getBtnSearch() {
		return btnSearch;
	}

	public WebElement getTxtConfirmationMessage() {
		return txtConfirmationMessage;
	}

	public WebElement getTxtdatechINErrorMessage() {
		return txtdatechINErrorMessage;
	}

	public WebElement getTxtdatechOUTErrorMessage() {
		return txtdatechOUTErrorMessage;
	}

	public WebElement getTxtselectLocationErrorMessage() {
		return txtselectLocationErrorMessage;
	}


	//Login page by selecting all fields
	//Login page by selecting invalid date two error

	public void searchhotel(String Location, String Hotel, String RoomType, String NosRooms, String checkInDate, String checkOutDate, String AdultperRoom, String ChildrenPerRoom) {

		SelectOptionsByText(getTxtLocation(), Location);
		SelectOptionsByText(getTxtHotel(), Hotel);
		SelectOptionsByText(getTxtroomtype(), RoomType);
		SelectOptionsByText(getTxtroomnos(), NosRooms);
		txtclear(getTxtdatepickin());
//		SelectOptionsByText(getTxtdatepickin(),checkInDate);
		textsendkeys(getTxtdatepickin(), checkInDate);
		txtclear(getTxtdatepickout());
		textsendkeys(getTxtdatepickout(), checkOutDate);
//		SelectOptionsByText(getTxtdatepickout(), checkOutDate);
		SelectOptionsByText(getTxtadultroom(), AdultperRoom);
		SelectOptionsByText(getTxtchildroom(), ChildrenPerRoom);
		buttonclick(getBtnSearch());

	}

	//Login page by entering only mandatory fields

	public void Searchhotel(String Location, String NosRooms, String checkInDate,String checkOutDate, String AdultperRoom) {

		SelectOptionsByText(getTxtLocation(), Location);
		SelectOptionsByText(getTxtroomnos(), NosRooms);
		txtclear(getTxtdatepickin());
		textsendkeys(getTxtdatepickin(), checkInDate);
		txtclear(getTxtdatepickout());
		textsendkeys(getTxtdatepickout(), checkOutDate);
		SelectOptionsByText(getTxtadultroom(),AdultperRoom);
		buttonclick(getBtnSearch());
	}

	//Login page by without entering any fields

	public void searhotel() {

		buttonclick(getBtnSearch());

	}



}
