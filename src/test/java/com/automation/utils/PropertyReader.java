package com.automation.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader {
	static Properties prop=new Properties();

	public static void initializeProperty() throws FileNotFoundException, IOException
	{
		prop.load(new FileInputStream("C:\\Users\\PC\\eclipse-workspace\\Practice\\src\\test\\resources\\Config\\config.properties"));
		
			
		
		
	}
	
	public static String getProperty(String key) {
		return prop.getProperty(key);
	}

	

}
