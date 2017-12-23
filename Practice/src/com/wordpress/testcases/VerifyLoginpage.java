package com.wordpress.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.wordpress.pages.Loginpage;

import Helper.BrowserFactory;

public class VerifyLoginpage {


@Test
	public void Verify()
	{
	WebDriver driver = BrowserFactory.StartBrowser("chrome","https://wordpress.com/log-in?redirect_to=https%3A%2F%2Fwordpress.com%2F");
	
	Loginpage log = PageFactory.initElements(driver,Loginpage.class);
	log.username();
	log.password();
	log.login();
	//log.logintowordpress("rafi.alluri@gmail.com", "moulali@123");
	driver.quit();
	
	
	
	
	
	}
}
