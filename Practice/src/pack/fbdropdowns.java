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
import org.testng.annotations.Test;

public class fbdropdowns {

	@Test
	public void selectDDValues()throws InterruptedException, Exception{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement month_dropdown=driver.findElement(By.id("month"));
		Select month_dd=new Select(month_dropdown);
		month_dd.selectByIndex(3);
	TakesScreenshot ts = (TakesScreenshot)driver;
	File source = ts.getScreenshotAs(OutputType.FILE);
	FileUtils.copyDirectory(source, new File("./Screenshot/facebook.png"));
	System.out.println("screenshot taken");
		//library.Utility.capturescreenshot(driver, "month");
		Thread.sleep(3000);
		month_dd.selectByValue("4");
		Thread.sleep(3000);
		month_dd.selectByVisibleText("Aug");
		
		
		
		driver.quit();
	}

}

