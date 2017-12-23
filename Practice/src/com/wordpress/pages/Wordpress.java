package com.wordpress.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Wordpress {
	WebDriver driver;
		By username=By.id("usernameOrEmail");
		By password=By.name("password");
		By login=By.xpath("//button[@type='submit']");
		
		public Wordpress(WebDriver driver)
		{
		this.driver=driver;	
		}
		public void logintowordpress(String uid,String pass)
		{
			driver.findElement(username).sendKeys(uid);
			driver.findElement(password).sendKeys(pass);
			driver.findElement(login).click();
		}
		public void username()
		{
			driver.findElement(username).sendKeys("rafi.alluri@gmail.com");
		}
		public void password()
		{
			driver.findElement(password).sendKeys("moulali@123");
		}
		public void login()
		{
			driver.findElement(login).click();
		}
		
		
		
	}


