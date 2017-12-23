package com.diaspora.testcases;


import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.diaspora.pages.Loginpage;

import demo.Test1;

public class DiasporaTest {
	@Test
	public void demo11()
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://pubpod.alqualonde.org/users/sign_in");	
		Loginpage log=PageFactory.initElements(driver, Loginpage.class);
		
		log.Signup("rafi","191214009r");
//		log.username();
//		log.password();
//		log.singup();
		

//	WebDriver driver=Test1.Startbrowser("chrome","https://pubpod.alqualonde.org/users/sign_in");
//	Loginpage log=PageFactory.initElements(driver, Loginpage.class);
//	log.username();
//	log.password();
//	log.singup();
//	driver.quit();
	}

}
