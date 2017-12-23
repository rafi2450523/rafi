package pack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import library.Utility;

public class Adavance_seleniumReporting {
	ExtentReports report;
	ExtentTest logger;
	WebDriver driver;
	@Test
	public void VerifyTitle(){
		report=new ExtentReports("C:\\Users\\alluri\\Desktop\\selenium\\rafiii.html");
		logger=report.startTest("verify title");
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		logger.log(LogStatus.INFO, "Browser is running");
		driver.get("https://www.google.co.in");
		logger.log(LogStatus.INFO, "App is running");
		String title = driver.getTitle();
		logger.log(LogStatus.INFO, "Title is captured");
		Assert.assertTrue(title.contains("selenium"));
		logger.log(LogStatus.PASS, "Title is verified");
	
	}
@AfterMethod
public void teardown(ITestResult result){
	if (result.getStatus()==ITestResult.FAILURE) {
	 Utility.capturescreenshot(driver,result.getName());
	}
	report.endTest(logger);
	report.flush();
	driver.get("C:\\Users\\alluri\\Desktop\\selenium\\rafiii.html");
	}}
