package trvl_project;
import java.util.concurrent.TimeUnit; 

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Flyus {
	@Test
	public void Test() throws Exception
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe")	;
		WebDriver d=new ChromeDriver();	
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		d.get("https://www.flyus.com/");
		d.findElement(By.xpath(".//*[@id='flys-search']/div[1]/ul/li[2]/a")).click();
		RemoteWebDriver r=(RemoteWebDriver)d;
		String str = "document.getElementById('flys-dpt-0').value='Madras, India - Chennai Intl (MAA)'"	;	
		r.executeScript(str);
		Thread.sleep(3000);
		//RemoteWebDriver r1=(RemoteWebDriver)d;
		String str1="document.getElementById('flys-arr-0').value='Dubai, United Arab Emirates - Dubai Intl (DXB)'";
		r.executeScript(str1);
		
	}

}
