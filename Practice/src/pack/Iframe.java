package pack;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Iframe {
	@Test
	public void frame() {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/alluri/Desktop/p.html");
		driver.switchTo().frame("selenium");
		driver.findElement(By.xpath(".//*[@id='pull']")).click();
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("html/body/a")).click();
		driver.quit();
		
	}

}
