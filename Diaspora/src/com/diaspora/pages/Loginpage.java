package com.diaspora.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Loginpage {
	WebDriver driver;
	public Loginpage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	@FindBy(id="user_username")WebElement username;
	@FindBy(how=How.ID,using="user_password")WebElement password;
	@FindBy(how=How.XPATH,using="//input[@value='Sign in']")WebElement signup;
	
	public void Signup(String uid,String pwd)
	{
		username.sendKeys(uid);
		password.sendKeys(pwd);
		signup.click();
	}
	public void username()
	{
		username.sendKeys("rafi");
	}
	public void password()
	{
		password.sendKeys("191214009r");
	}
	public void singup()
	{
		signup.click();
	}
}
