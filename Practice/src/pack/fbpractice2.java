package pack;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.sun.corba.se.impl.util.Utility;

public class fbpractice2 {
	@Test
	public void selectDDValues() throws Exception{
		System.setProperty("webdriver.chrome.driver",".//drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement day_dropdown=driver.findElement(By.id("day"));
		Select day_dd=new Select(day_dropdown);
		WebElement selected_values = day_dd.getFirstSelectedOption();
		System.out.println("before selected value"+selected_values.getText());
		day_dd.selectByVisibleText("21");
		WebElement select_values1 = day_dd.getFirstSelectedOption();
		System.out.println("After selected value"+select_values1.getText());
		Select month_dd=new Select(driver.findElement(By.id("month")));
		month_dd.selectByIndex(10);
		Select year_dd=new Select(driver.findElement(By.id("year")));
		year_dd.selectByValue("1994");
//		TakesScreenshot ts=(TakesScreenshot)driver;
//		File source = ts.getScreenshotAs(OutputType.FILE);
//		FileUtils.copyFile(source,new File("./Screenshot/fb.png"));
		List<WebElement> year_list=year_dd.getOptions();
		int total_years=year_list.size();
		System.out.println("total years is"+total_years);
		for (WebElement ele : year_list) {
			String year_name = ele.getText();
			System.out.println("years name==="+year_name);
		}
		driver.quit();
		
	}
		
		
	
}
