package pack;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class Scroll_into_view {
	
	@Test
	public void Scroll(){
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://manos.malihu.gr/repository/custom-scrollbar/demo/examples/complete_examples.html");
	WebElement element=driver.findElement(By.xpath(".//*[@id='mCSB_3_container']/p[9]/textarea"));
	JavascriptExecutor je=(JavascriptExecutor)driver;

	je.executeScript("arguments[0].scrollIntoView(true);",element);


	}
}
