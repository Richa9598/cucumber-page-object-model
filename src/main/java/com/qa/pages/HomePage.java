package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.interactions.Actions;
import com.qa.util.TestBase;

public class HomePage extends TestBase {

	@FindBy(xpath="//span[@class='user-display']")
	@CacheLookup  //add element to cache memory so that you dont need to go to the browser every time to fire a query
	WebElement user;
	
	@FindBy(xpath="//span[contains(text(),'Contacts')]")
	
	WebElement contact;
	
	@FindBy(xpath="//span[contains(text(),'Deals')]")
	
	WebElement deals;
	
	@FindBy(xpath="//span[contains(text(),'Tasks')]")

	WebElement tasks;
	
	@FindBy(xpath="//body/div[@id='ui']/div[@class='ui fluid container']/div[@id='main-nav']/div[3]/button[1]")
	
	WebElement addNewContact;
	
	//creating the constructor
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	//checking the title
	
	public String verifyHomePageTitle()
	{
		return driver.getTitle();
		
	}
	
//	public ContactsPage clickOnContactLink() {
//		contact.click();
//		return new ContactsPage();
//	}
//	
//	public DealsPage clickOnDealsLink() {
//		deals.click();
//		return new DealsPage();
//	}
//	
//	public TasksPage clickOnTaskLink() {
//		tasks.click();
//		return new TasksPage();
//	}
	
	public boolean verifyCorrectUserName()
	{
		return user.isDisplayed();
	}
	
	//click on add new contact
	public void clickOnaddNewContact() throws InterruptedException {
		Actions action=new Actions(driver);
		action.moveToElement(contact).build().perform();
		//Thread.sleep(2000);
		addNewContact.click();
		driver.navigate().refresh();
	}

}

