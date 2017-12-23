package pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Verify_error_msgs1 {
	@Test
	public  void myTest()throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://accounts.google.com");
		driver.findElement(By.xpath(".//*[@id='identifierNext']/content/span")).click();
		Thread.sleep(2000);
		String actual_error=driver.findElement(By.xpath(".//*[@id='view_container']/form/div[2]/div/div[1]/div[1]/div/div[2]/div[2]")).getAttribute("innerHTML");
		String expected_result="Enter an email or phone number";
		//Type 1 we can use this below method
		Assert.assertEquals(actual_error,expected_result);
		//type2 we can use this also
		Assert.assertTrue(actual_error.contains("Enter an email or phone number"));
		System.out.println("test completed");
		
	}

}
