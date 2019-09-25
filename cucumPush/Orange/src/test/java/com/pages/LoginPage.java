package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utils.BaseClass;
import com.utils.CommonMethod;

public class LoginPage extends BaseClass{
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
				
		
	}
	
	@FindBy(xpath="//img[contains(@src,'logo')]")
	public WebElement logo;
	
	@FindBy(xpath="//input[@name='txtUsername']")
	public WebElement username;
	
	@FindBy(id="txtPassword")
	public WebElement password;
	
	@FindBy(id="btnLogin")
	public WebElement click;
	
	@FindBy(id="spamMessage")
	public WebElement errorMessage;
	
	public void login(String userName,String passWord) {
		CommonMethod.enterValue(username, userName);
		CommonMethod.enterValue(password, passWord);
		CommonMethod.clickValue(click);
		
	}

}
