package com.qa.stepDefination;

import com.qa.util.TestBase;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import junit.framework.Assert;

import com.qa.pages.*;

public class HomePageSteps extends TestBase {
	
	LoginPage lp;
	HomePage hp;
	
	@Given("user opens browser")
	public void user_opens_browser() {
		TestBase.init();
	    
	}
	//@SuppressWarnings("deprecation")
	@Then("user is on login page")
	public void user_is_on_login_page() {
	lp=new LoginPage();
	String title=lp.validateLoginPageTitle();
	Assert.assertEquals(title,"Cogmento CRM");
	    
	}
	@Then("user enters username and password")
	public void user_enters_username_and_password() {
		hp=lp.login(prop.getProperty("username"), prop.getProperty("password"));
	    
	}
	
	
	@Then("validate home page title")
	public void validate_home_page_title() {
		String title1=hp.verifyHomePageTitle();
		Assert.assertEquals(title1,"Cogmento CRM");
	}
	@Then("validate logged in user name")
	public void validate_logged_in_user_name() {
		hp.verifyCorrectUserName();
	   
	}



	
	
	

}
