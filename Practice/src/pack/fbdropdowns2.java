package pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(listners.TestngListners.class)
public class fbdropdowns2 {
	@Test
	public void selectDDValues()throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement month_dropdown=driver.findElement(By.id("month"));
		Select month_dd=new Select(month_dropdown);
		WebElement selected_values=month_dd.getFirstSelectedOption();
		System.out.println("before selected values is "+ selected_values.getText());
		month_dd.selectByIndex(3);
		WebElement selected_values1=month_dd.getFirstSelectedOption();
		System.out.println("after select values is "+ selected_values1.getText());
		
		
		
		driver.quit();
	}

}
