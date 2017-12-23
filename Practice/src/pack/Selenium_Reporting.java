package pack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;

public class Selenium_Reporting {
	@Test
	public void verifyTitle(){
		ExtentReports logger=ExtentReports.get(Selenium_Reporting.class);
		logger.init("C:\\Users\\alluri\\Desktop\\selenium\\advancereport.html",true);
		logger.startTest("verify page title");
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		logger.log(LogStatus.INFO, "Browser is up and running");
		driver.get("http://learn-automation.com");
		logger.log(LogStatus.INFO, "Application is up and running");
		String title=driver.getTitle();
		logger.log(LogStatus.INFO, "Title captured");
		Assert.assertTrue(title.contains("Selenium"));
		logger.log(LogStatus.PASS,"Title is verified");
		logger.attachScreenshot("D:\\RAFI\\photos\\12 12 2014\\srisalam trip\\IMG_3029.png");
		logger.endTest();
		
	}

}
