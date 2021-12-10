package com.automation.Stepdef;

import com.automation.pages.AmazonLogin;
import com.automation.utils.PropertyReader;

import io.cucumber.java.en.Given;

public class Unsuccessfulchk {
	AmazonLogin Login=new AmazonLogin();
	@Given("verify enter emailId <{string}>")
	public void verify_enter_email_id(String emailId) {
	    Login.enterUserName(emailId);
	}

	@Given("Enter Password <{string}>")
	public void enter_password(String Password) {
	   Login.enterPassword(Password);
	}

}
