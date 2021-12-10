package com.automation.test2;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.automation.utils.DriverUtils;

public class BaseTest {
	WebDriver driver;
	@BeforeMethod
	public void setUp() throws FileNotFoundException, IOException
	{
		DriverUtils.CreateDriver();
		 DriverUtils.getDriver().get("https://opensource-demo.orangehrmlive.com/");
		 com.automation.utils.PropertyReader.initializeProperty();
	}
	
	@AfterMethod
	public void clean()
	{
	}

}
