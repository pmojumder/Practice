package com.automation.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import io.cucumber.datatable.DataTable;

public class LoginPage extends BasePage {

	@FindBy(id="txtUsername")
	private WebElement txtFieldUsername;
	
	@FindBy(id="txtPassword")
	private WebElement txtFieldPassword;
	
	@FindBy(id="btnLogin")
	private WebElement buttonLogin;
	
	@FindBy(id = "branding")
	private WebElement logo;
	
	@FindBy(xpath = "//table[@id='table1']/tbody/tr")
	private List<WebElement> rowList;

	final String XPATH_TABLE_DATA = "//table[@id='table1']/tbody/tr[%s]/td[not(./a)]";

	public void openWebsite()
	{
		
	}
	
	public void enterUserName(String Username)
	{
		txtFieldUsername.sendKeys(Username);
	}
	
	public void enterPassword(String Password)
	{
		txtFieldPassword.sendKeys(Password);
	}
	
	public void clickLoginbtn()
	{
		buttonLogin.click();
	}
	
	public void loginSuccessful()
	{
		Assert.assertEquals("login not successful", logo.isDisplayed());
	}
	
	public void verifyTableData(DataTable dataTable) {
		List<List<String>> expDataList = dataTable.asLists();

		for (int i = 0; i < expDataList.size(); i++) {

			String finalLoc = String.format(XPATH_TABLE_DATA, i + 1);
			List<WebElement> dataList = driver.findElements(By.xpath(finalLoc));

			for (int j = 0; j < expDataList.get(i).size(); j++) {
				String expData = expDataList.get(i).get(j);
				String actData = dataList.get(j).getText();
				Assert.assertTrue(expData.equals(actData));
			}

			System.out.println();
		}
	}
}
