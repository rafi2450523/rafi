package com.diaspora.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class Verify_logipage {
	WebDriver driver;
		By username=By.id("user_username");
		By password=By.name("user[password]");
		By login=By.xpath("//input[@value='Sign in']");

	public Verify_logipage(WebDriver driver)
	{
		this.driver=driver;
	}
	public void username()
	{
		driver.findElement(username).sendKeys("rafi");
	}
	public void password()
	{
		driver.findElement(password).sendKeys("191214009r");
	}
	public void login()
	{
		driver.findElement(login).click();
	}
	public void login_to_diaspora()
	{
		driver.findElement(username).sendKeys("rafi");
		driver.findElement(password).sendKeys("191214009r");
		driver.findElement(login).click();
	}
	}
