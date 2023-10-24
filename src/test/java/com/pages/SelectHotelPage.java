package com.pages;

import java.sql.Driver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass1;

public class SelectHotelPage extends BaseClass1 {

	public SelectHotelPage() {

		PageFactory.initElements(driver, this);

	}
	
	@FindBy(id="radiobutton_0")
	private WebElement btnClickRadio;

	@FindBy(id="continue")
	private WebElement btnClickContinue;
	

	@FindBy(xpath="//td[text()='Book A Hotel']")
	private WebElement txtConfirmBookHotelMessage;

	@FindBy(id="radiobutton_span")
	private WebElement txtSelectHotelErrorMessage;
	

	public WebElement getBtnClickRadio() {
		return btnClickRadio;
	}

	public WebElement getBtnClickContinue() {
		return btnClickContinue;
	}

	public WebElement getTxtConfirmBookHotelMessage() {
		return txtConfirmBookHotelMessage;
	}

	public WebElement getTxtSelectHotelErrorMessage() {
		return txtSelectHotelErrorMessage;
	}

	//Login page by select hotel and verify Book A Hotel


	public void selecthotel() {

		buttonclick(getBtnClickRadio());
		buttonclick(getBtnClickContinue());

	}

	//Login page by without select hotel and verify error message

	public void clickcontinue() {

		buttonclick(getBtnClickContinue());

	}


}
