 
package com.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass1;

public class LoginPage extends BaseClass1 {


	public LoginPage() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(id="username")
	private WebElement txtUserName;

	@FindBy(id="password")
	private WebElement txtPassWord;

	@FindBy(id="login")
	private WebElement buttonClick;

	@FindBy(xpath="//div[@class='auth_error']")
	private WebElement txtErrorMessage;

	

	public WebElement getTxtUserName() {
		return txtUserName;
	}

	public WebElement getTxtPassWord() {
		return txtPassWord;
	}

	public WebElement getButtonClick() {
		return buttonClick;
	}

	public WebElement getTxtErrorMessage() {
		return txtErrorMessage;
	}

	

	//Login Page with Valid Credential
	//Login Page with InValid Credential with error message
	public void login(String username, String password) {

		textsendkeys(getTxtUserName(), username);
		textsendkeys(getTxtPassWord(), password);
		buttonclick(getButtonClick());
 
	}

	//Login Page with Valid Credential by using enter key
	public void loginWithEnter(String username, String password) throws AWTException {

		textsendkeys(getTxtUserName(), username);
		textsendkeys(getTxtPassWord(), password);


		Robot robot = new Robot();

		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);

		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);

		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

	}









}
