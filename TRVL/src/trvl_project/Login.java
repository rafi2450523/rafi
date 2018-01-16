package trvl_project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Login {
	@Test
	public void loginto()
	{
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe")	;
	WebDriver d=new ChromeDriver();	
	d.manage().window().maximize();
	d.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	d.get("https://trvl.com/");
	d.findElement(By.xpath("(//input[@name='destination'])[2]")).sendKeys("Australia");
	d.findElement(By.xpath("(//div)[14]")).click();
	d.findElement(By.xpath("(//td)[6]")).click();
	d.findElement(By.xpath("(//td)[47]")).click();
	d.findElement(By.xpath("(//button[contains(@class,'min')])[2]")).click();
	//d.findElement(By.xpath("(//button[@type='submit'])[1]")).click();
	}

}
