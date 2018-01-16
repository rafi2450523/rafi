
package practise;

import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;

public class Seleniumreporting_practise {
	@Test
	public void Rafi(){
		ExtentReports logger=ExtentReports.get(Seleniumreporting_practise.class);
		logger.init("C:\\Users\\alluri\\Desktop\\selenium\\uppsc1.html",true);
		logger.startTest("verify page title");
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		logger.log(LogStatus.INFO, "browser is running");
		driver.get("https://www.google.co.in");
		logger.log(LogStatus.INFO, "App is running");
		String title = driver.getTitle();
		logger.log(LogStatus.INFO, "title is captured");
		Assert.assertTrue(title.contains("Google"));
		logger.log(LogStatus.PASS, "title is verified");
		logger.attachScreenshot("C:\\Users\\alluri\\Pictures\\uppsc IES.png");
		logger.endTest();
		driver.quit();
				
	}
	

}
