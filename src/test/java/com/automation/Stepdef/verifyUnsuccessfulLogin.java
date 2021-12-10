package com.automation.Stepdef;

import com.automation.pages.LoginPage;
import com.automation.utils.PropertyReader;

import io.cucumber.java.en.Given;

public class verifyUnsuccessfulLogin {
	LoginPage login=new LoginPage();
	@Given("enter invalid <{string}>")
	public void enter_invalid(String username) {
	  login.enterUserName(PropertyReader.getProperty("login.invalidusername"));
	}

	@Given("enter valid <{string}>")
	public void enter_valid(String password) {
		  login.enterPassword(PropertyReader.getProperty("login.validpassword"));

	}


}
