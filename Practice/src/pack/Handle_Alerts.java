package pack;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Handle_Alerts {
	@Test
	public void Alerts() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ksrtc.in/oprs-web/");	
		driver.findElement(By.xpath(".//*[@id='searchBtn']")).click();
		Thread.sleep(3000);
//		Alert alt=driver.switchTo().alert();
//		alt.accept();
		String Actual_msg = driver.switchTo().alert().getText();
		String Expected_msg = "Please select start place.";
		driver.switchTo().alert().accept();
		Assert.assertEquals(Actual_msg, Expected_msg);
		//driver.quit();
	
	
	
	}

}
