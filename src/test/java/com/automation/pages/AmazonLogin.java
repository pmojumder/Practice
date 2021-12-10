package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AmazonLogin extends BasePage {
	
	@FindBy(xpath="//input[@type='email']")
	private WebElement txtEmail;
	
	@FindBy(xpath="//input[@id='continue']")
	private WebElement btnContinue;
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement txtPassword;
	
	@FindBy(xpath="//input[@id='signInSubmit']")
	private WebElement btnSignIn;
	
	public void enterUserName(String UserNAME) {
		txtEmail.sendKeys(UserNAME);
	}
	
	public void clickContinue() {
		btnContinue.click();
	}
	
	public void enterPassword(String Password) {
		txtPassword.sendKeys(Password);
	}

	public void clickLogin() {
		btnSignIn.click();
	}

	
}
