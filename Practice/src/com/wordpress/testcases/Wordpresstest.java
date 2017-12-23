package com.wordpress.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.wordpress.pages.Wordpress;

public class Wordpresstest {
@Test
	public void test(){
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://wordpress.com/log-in?redirect_to=https%3A%2F%2Fwordpress.com%2F");
	Wordpress press=new Wordpress(driver);
//	press.username();
//	press.password();
//	press.login();
	press.logintowordpress("rafi.alluri@gmail.com", "moulali@123");
	driver.quit();
	


}
}
