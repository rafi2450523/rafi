package com.fb.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class VerifyFB {
	WebDriver driver;
	@FindBy(id="email")WebElement username;
	@FindBy(how=How.ID,using="pass")WebElement password;
	@FindBy(how=How.XPATH,using=".//*[@id='u_0_2']")WebElement login;
	public VerifyFB()
	{
	this.driver=driver;
	}
	public void username()
	{
		username.sendKeys("rafi.alluri@gmail.com");
	}
	public void password()
	{
		password.sendKeys("191214009r");
	}
	public void login()
	{
		login.click();
	}
	
	
	
	
}
