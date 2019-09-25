package com.utils;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonMethod extends BaseClass {
	
	public static void enterValue(WebElement element, String value) {
		element.clear();
		element.sendKeys(value);
		
	}
	
	public static WebElement waiting(WebElement element) {
		WebDriverWait wait =new WebDriverWait(driver, 3);
		return wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	public static void clickValue(WebElement element) {
		WebElement elm = waiting(element);
		elm.click();
	}
	

}
