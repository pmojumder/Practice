package com.automation.Stepdef;

import java.util.List;

import org.openqa.selenium.By;

import com.automation.pages.LoginPage;
import com.automation.utils.DriverUtils;
import com.automation.utils.PropertyReader;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class VerifyLogin {
	
	LoginPage login=new LoginPage();
	
	@Given("enter valid username")
	public void enter_valid_username() {
		login.enterUserName(PropertyReader.getProperty("logo.username"));
	    
	}

	@Given("enter password")
	public void enter_password() {
		login.enterPassword(PropertyReader.getProperty("logo.password"));

	}

	@When("clickon LoginButton")
	public void clickon_login_button() {
	   login.clickLoginbtn();
	}

	@Then("Login successful")
	public void login_successful() {
	   login.loginSuccessful();
	}

	@Given("user open demo website")
	public void user_open_demo_website() {
	    DriverUtils.getDriver().get("http://the-internet.herokuapp.com/tables");
	}

	@Then("verify table data matches with below table")
	public void verify_table_data_matches_with_below_table(DataTable dataTable) {
	  login.verifyTableData(dataTable);
	}

	
	@When("enter below username")
	public void enter_below_username(io.cucumber.datatable.DataTable dataTable) {
		  List<List<String>> data=dataTable.asLists();

	   DriverUtils.getDriver().findElement(By.id("txtUsername")).sendKeys(data.get(0).get(0));

	}
	//txtPassword

	@When("enter below password")
	public void enter_below_password(io.cucumber.datatable.DataTable dataTable) {
		  List<List<String>> data=dataTable.asLists();
		   DriverUtils.getDriver().findElement(By.id("txtPassword")).sendKeys(data.get(0).get(0));

	}

	@When("Click Login")
	public void click_login() {
	    login.clickLoginbtn();
	}


	





}
