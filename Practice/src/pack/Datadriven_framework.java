package pack;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Datadriven_framework {
	WebDriver driver;
	@Test(dataProvider="wordpressData")
	public void Framework(String username,String password) throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	driver.get("https://wordpress.com/log-in");
	driver.findElement(By.xpath(".//*[@id='usernameOrEmail']")).sendKeys(username);
	driver.findElement(By.xpath(".//*[@id='password']")).sendKeys(password);
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	Thread.sleep(3000);
	System.out.println(driver.getTitle());
	Assert.assertTrue(driver.getTitle().contains("Following ‹ Reader — WordPress.com"));
	
	}
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
	@DataProvider(name="wordpressData")
	public Object[][] passdata(){
		Object[][] data=new Object[3][2];
		data[0][0]="rafi.alluri@123gmail.com";
		data[0][1]="moulali@213";
		data[1][0]="rafi.alluri@gmail.com";
		data[1][1]="moulali@123";
		data[2][0]="rafi.allri@gmail.com";
		data[2][1]="moulali@123";
		return data;
		
	}
}	

