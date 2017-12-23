package pack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Handle_Webtable_calender {
	@Test
	public void handle(){
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/?gclid=EAIaIQobChMI0NLphKXX1wIVlx0rCh1UEgRzEAAYASAAEgI2HPD_BwE");
		List<WebElement> dates = driver.findElements(By.xpath(".//*[@id='rb-calendar_onward_cal']/table/tbody/tr/td"));
				for (int i = 0; i < dates.size(); i++) {
					 String s = dates.get(i).getText();
				
		if (s.equals("30")) {
			((WebElement) dates).click();
				break;	
					
				}}
		
			
			
		}
	
	
	
	}


