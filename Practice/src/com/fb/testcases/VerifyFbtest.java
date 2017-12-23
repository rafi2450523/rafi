package com.fb.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.fb.pages.VerifyFB;

import Helper.BrowserFactory;
import practise.Rough;

public class VerifyFbtest {
@Test
	public void Testcasefb(){
	
	WebDriver driver = BrowserFactory.StartBrowser("chrome", "https://www.facebook.com/");
	VerifyFB fb = PageFactory.initElements(driver, VerifyFB.class);
	fb.username();
	fb.password();
	fb.login();
	
	
	
}
}
