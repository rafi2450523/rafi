package com.wordpress.pages;

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
	@FindBy(id="usernameOrEmail")WebElement username;
	@FindBy(how=How.ID,using="password")WebElement password;
	@FindBy(how=How.XPATH,using="//button[@type='submit']")WebElement submitbutton;
	
	public void logintowordpress(String uid,String pass)
	{
		username.sendKeys(uid);
		password.sendKeys(pass);
		submitbutton.click(); 
	}
	public void username()
	{
		username.sendKeys("rafi.alluri@gmail.com");
	}
	public void password()
	{
		password.sendKeys("moulali@123");
	}
	public void login()
	{
		submitbutton.click(); 
	}

}
