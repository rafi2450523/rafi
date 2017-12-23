package pack;

import java.io.File; 
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import library.Utility;

@Listeners(listners.TestngListners.class)

public class fbpractice {
	@Test
	
	public void selectDDValues()throws InterruptedException, Exception{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		//WebElement month_dropdown=driver.findElement(By.id("month"));
		Select month_dd=new Select(driver.findElement(By.id("moonth")));
//		month_dd.selectByIndex(3);
//		Thread.sleep(3000);
//		month_dd.selectByValue("4");
//		Thread.sleep(3000);
		month_dd.selectByVisibleText("Aug");
		Select day_dd=new Select(driver.findElement(By.id("day")));
		day_dd.selectByIndex(3);
		Select month=new Select(driver.findElement(By.id("year")));
		month.selectByVisibleText("2016");
		
		
		//driver.quit();
	

}}
