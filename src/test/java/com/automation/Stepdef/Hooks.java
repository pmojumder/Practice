package com.automation.Stepdef;

import java.io.FileNotFoundException;
import java.io.IOException;

import com.automation.utils.DriverUtils;

import io.cucumber.java.Before;

public class Hooks {
	@Before
	public void setUpUITest() throws FileNotFoundException, IOException {
		DriverUtils.CreateDriver();
		//DriverUtils.getDriver().get("https://opensource-demo.orangehrmlive.com/");
        com.automation.utils.PropertyReader.initializeProperty();
	}
	

	
}
