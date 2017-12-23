package datadriven_framework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class Data1 {
	WebDriver driver;
	@Test(dataProvider="Facebook")
	public void framework(String uname,String pwd) throws Exception
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath(".//*[@id='email']"));
		driver.findElement(By.xpath(".//*[@id='pass']"));
		driver.findElement(By.xpath(".//*[@id='u_0_2']"));
		Thread.sleep(3000);
		Assert.assertTrue(driver.getTitle().contains("Facebook"));
}

@AfterMethod
public void teardown()
{
	driver.quit();
	}
@DataProvider(name="Facebook")
public Object[][] data()
{
	Object[][] d=new Object[2][2];
	d[0][0]="rafi.alllri@gmail.com";
	d[0][1]="191214009";
	d[1][0]="rafi.alluri@gmail.com";
	d[1][1]="191214009r";
	return d;

}
}