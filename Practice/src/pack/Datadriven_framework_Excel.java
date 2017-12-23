package pack;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import library.Exceldataconfig;

public class Datadriven_framework_Excel {
	WebDriver driver;
	@Test(dataProvider="wordpressData")
	public void Framework(String username,String password) throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("https://wordpress.com/log-in");
	driver.findElement(By.xpath(".//*[@id='usernameOrEmail']")).sendKeys(username);
	driver.findElement(By.xpath(".//*[@id='primary']/div/main/div/div[1]/div/form/div[1]/div[2]/button")).click();
	driver.findElement(By.xpath(".//*[@id='password']")).sendKeys(password);
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	Thread.sleep(3000);
	System.out.println(driver.getTitle());
	//Assert.assertTrue(driver.getTitle().contains("Following ‹ Reader — WordPress.com"));
	
	}
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
	@DataProvider(name="wordpressData")
	public Object[][] passdata(){
		Exceldataconfig config=new Exceldataconfig("D:\\neon\\Practice\\Testdata\\wordpress.xlsx");
		int rows = config.getrowcount(0);
		Object[][] data=new Object[rows][2];
		for (int i = 0; i < rows; i++) 
		{
			data[i][0]=config.getdata(0, i, 0);
			data[i][1]=config.getdata(0, i, 1); 
		}
		return data;
		
		
	}
}	

