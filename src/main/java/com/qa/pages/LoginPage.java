package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.TestBase;

public class LoginPage extends TestBase {
	
	//page factory 
		@FindBy(name="email")
		WebElement username;
		
		@FindBy(name="password")
		WebElement password;
		
		@FindBy(xpath="//div[@class='ui fluid large blue submit button']")
		WebElement loginButton;
		
		@FindBy(xpath="//a[contains(text(),'Sign Up')]")
		WebElement signUp;
		
		@FindBy(xpath="//div[@class='header']")
		WebElement message;
		
		//creating the methods
		
		//initialize page factory elements (username.password,loginpage,signup)
		
		public LoginPage()
		{
			PageFactory.initElements(driver, this);
			
		}

public String validateLoginPageTitle()
{
	
	return driver.getTitle();
	
}

public HomePage login(String un,String pswd)
{
	
	username.sendKeys(un);
	password.sendKeys(pswd);
	loginButton.click();
	
	return new HomePage();
	
	
}
}
