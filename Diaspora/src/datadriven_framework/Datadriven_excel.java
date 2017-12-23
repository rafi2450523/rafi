package datadriven_framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Datadriven_excel {
	WebDriver driver;
	@Test(dataProvider="Facebook")
	public void framework(String uname,String pwd) throws InterruptedException 
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
public Object[][] getdata()
{	
	Datadriven_library config=new Datadriven_library("C:\\Users\\alluri\\Desktop\\excel\\fb.xlsx");
	int rows=config.getrowcount(0);
	Object[][] datas=new Object[rows][2];
	for (int i = 0; i < rows; i++) 
	{
		datas[i][0]=config.getdata(0, i,0);
		datas[i][1]=config.getdata(0, i, 1);
	}
	return datas;


}

}
