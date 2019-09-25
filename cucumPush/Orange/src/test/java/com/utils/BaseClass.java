package com.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {
	
	public static WebDriver driver;
	public static Properties prop;
	
	public static void browsers() {
		initProperties(Constants.propertiesFile);
		String browserName = prop.getProperty("browser");
		
		if(browserName.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\waqem.haq\\Desktop\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if(browserName.equalsIgnoreCase("FireFox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\waqem.haq\\eclipse-workspace\\Orange\\src\\test\\resources\\drivers\\geckodriver.exe");
			driver =new FirefoxDriver();
		}
		
		
		
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
	}
	
	public static void tearDown() {
		driver.quit();
	}
	
	public static void initProperties(String filePath) {
		
		prop = new Properties();
		
		FileInputStream fis ;
			try {
				fis = new FileInputStream(filePath);
				prop.load(fis);
			}catch(FileNotFoundException e) {
				e.getMessage();
			}catch(IOException e) {
				e.getMessage();
			}
		
				
	}

}
