package com.qa.util;

import java.util.Properties;
import java.util.concurrent.TimeUnit;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	public  static EventFiringWebDriver e_driver;
	//public static WebEventListener eventListener;
	
	public TestBase()
	{
		try {
			prop=new Properties();
			FileInputStream f=new FileInputStream("C:\\QA\\cucumber_workspace\\CucumberPOM\\src\\main\\java\\com\\qa\\config\\config.properties");
			prop.load(f);
		}
		
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}	

	
	public static void init()
	{
		String browserName=prop.getProperty("browser");
		System.out.println(browserName);
		 //driver=new FirefoxDriver();
		
		 if(browserName.equals("fireFox")) {
			 
		 driver = new FirefoxDriver(); 
		 }
		 else if(browserName.equals("Chrome")) {
		// System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Downloads\\chromedriver_win32"); 
		 driver = new ChromeDriver(); 
		 }
		 else { 
			 driver = new SafariDriver(); 
			 }
		
		
		
		 
		//maximise window
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.page_load_timeout, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.implicit_wait, TimeUnit.SECONDS);
		
		//launch url
		driver.get(prop.getProperty("url"));
	}
	
	
	
	

}
