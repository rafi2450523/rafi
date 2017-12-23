package pack;

import java.io.File;

import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import library.Utility;

public class fb_Screenshot_failure {
	WebDriver driver;
	@Test

	public void capturescreenshot() throws Exception{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath(".//*[@id='emmail']")).sendKeys("rafi");
		TakesScreenshot ts=(TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source, new File("./Screenshot/111.png"));
		System.out.println("screenshot taken");
		driver.quit();
		
		
	}

@AfterMethod
public void teardown(ITestResult result){
	if (ITestResult.FAILURE==result.getStatus()) {
	 Utility.capturescreenshot(driver,result.getName());
		
	
	

}}}