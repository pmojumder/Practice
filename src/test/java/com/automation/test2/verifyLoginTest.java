package com.automation.test2;

import org.testng.annotations.Test;

import com.automation.pages.LoginPage;
import com.automation.utils.PropertyReader;

public class verifyLoginTest extends BaseTest {
	
	LoginPage login=new LoginPage();
	
	@Test
	
	public void verifyLogin()
	{
		LoginPage login=new LoginPage();

		
		login.enterUserName(PropertyReader.getProperty("logo.username"));
		login.enterPassword(PropertyReader.getProperty("logo.password"));
		login.clickLoginbtn();
		login.loginSuccessful();
	}

}
