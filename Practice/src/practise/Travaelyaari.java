package practise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Travaelyaari {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.travelyaari.com/");
	driver.findElement(By.xpath("//input[@Id='from-city']"));
	List<WebElement> list = driver.findElements(By.xpath(".//*[@id='search-form']/div[1]/div[1]/ul/li[3]"));
	((WebElement) list).click();
}
}
