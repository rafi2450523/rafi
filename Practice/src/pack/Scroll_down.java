package pack;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;




public class Scroll_down {
@Test
	public  void Scroll() throws Throwable {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.goibibo.com/flights/?utm_source=google&utm_medium=cpc&utm_campaign=DF-Brand-Misspell&utm_content=Misspellings&gclid=EAIaIQobChMI0tLnoPzE1wIVRgwrCh2VgQCBEAAYASAAEgI8ffD_BwE");
 		((JavascriptExecutor)driver).executeScript("scroll(0,800)");
 		Thread.sleep(3000);
 		((JavascriptExecutor)driver).executeScript("scroll(0,-800)");
	}

}
