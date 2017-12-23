package com.diaspora.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.diaspora.pages.Verify_logipage;

public class Testdiaspora {
	@Test
	public void Test1(){
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://pubpod.alqualonde.org/users/sign_in");
		Verify_logipage v=new Verify_logipage(driver);
//		v.username();
//		v.password();
//		v.login();
		v.login_to_diaspora();
		
		
		
	}

}
