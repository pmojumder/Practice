package com.automation.Stepdef;

import java.util.List;

import org.openqa.selenium.By;

import com.automation.pages.AmazonLogin;
import com.automation.utils.DriverUtils;

import groovy.beans.PropertyReader;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class VerifyLogincheck {
AmazonLogin Login=new AmazonLogin();
	@Given("Open Browser")
	public void open_browser() {
	    
		DriverUtils.getDriver().get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3F_encoding%3DUTF8%26ref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
	}

	
	@Given("verify enter emailId {string}")
	public void verify_enter_email_id(String emailId) {
	   Login.enterUserName(com.automation.utils.PropertyReader.getProperty("login.validusername"));
	}

	@Given("Click on Continue")
	public void click_on_continue() {
	   Login.clickContinue();
	}

	@Given("Enter Password {string}")
	public void enter_password(String Password) {
		Login.enterPassword(com.automation.utils.PropertyReader.getProperty("login.invalidpassword"));
	}

	@When("Click on Sign")
	public void click_on_sign() {
	    Login.clickLogin();
	}

	@Then("Login Successful")
	public void login_successful() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("verify enter below emailId")
	public void verify_enter_below_email_id(DataTable dataTable) {
		  List<List<String>> data=dataTable.asLists();
	      DriverUtils.getDriver().findElement(By.xpath("//input[@type='email']")).sendKeys(data.get(0).get(0));
	}

	@Given("Enter below Password")
	public void enter_below_password(DataTable dataTable) {
		  List<List<String>> data=dataTable.asLists();

	      DriverUtils.getDriver().findElement(By.xpath("//input[@type='password']")).sendKeys(data.get(0).get(0));

	}


}
