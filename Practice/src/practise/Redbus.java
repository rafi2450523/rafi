package practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class Redbus {
	@Test
	public void Red() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
//		driver.findElement(By.cssSelector("#src")).sendKeys("Bangalore");
//		driver.findElement(By.cssSelector("#dest")).sendKeys("Chennai");
//		driver.findElement(By.xpath("(//span)[17]")).click();
//		driver.findElement(By.xpath("(//td)[82]")).click();
//		driver.findElement(By.cssSelector("#search_btn")).click();
		driver.findElement(By.xpath("(//span)[14]")).click();
		System.out.println("clicked on span");
		Thread.sleep(3000);
		driver.findElement(By.xpath("")).click();
		System.out.println("clicked on Bangalore");

	}

}
