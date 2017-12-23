package com.fb.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.fb.pages.Fb_login;

public class Verifyfb {
	@Test
	public void FB(){
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	Fb_login fb=new Fb_login(driver);
//	fb.typeusername("rafi.alluri@gmail.com");
//	fb.typepassword("191214009r");
//	fb.typelogin();
	fb.Logintofb("rafi.alluri@gmail.com","191214009r");
	
	
	
	driver.quit();
	
	
	
	
	}
	}
