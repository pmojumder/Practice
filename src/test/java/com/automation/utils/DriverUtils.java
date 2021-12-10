package com.automation.utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverUtils {
	private static WebDriver driver;
	public static void CreateDriver()
	{
		System.setProperty("webdriver.chrome.driver","src//test//resources//Drivers//chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com");
		driver.manage().window().maximize();
	}
	
	public static WebDriver  getDriver()
	
	{
		return driver;
	}
}
