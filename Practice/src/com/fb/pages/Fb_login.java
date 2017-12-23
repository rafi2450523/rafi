package com.fb.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Fb_login {
	
	WebDriver driver;
	By username=By.id("email");
	By password=By.id("pass");
	By login=By.id("u_0_2");
	
	public Fb_login(WebDriver driver)
	{
	this.driver=driver;	
	}
	public void Logintofb(String uid,String pass)
	{
		driver.findElement(username).sendKeys(uid);
		driver.findElement(password).sendKeys(pass);
		driver.findElement(login).click();
	}
	public void  typeusername(String uid)
	{
		driver.findElement(username).sendKeys(uid);
	}
	public void typepassword(String pass)
	{
		driver.findElement(password).sendKeys(pass);
	}
	public void typelogin()
	{
		driver.findElement(login).click();
	}
}
