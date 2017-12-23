package pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import library.Click_Element;

public class Not_clickable {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe" );
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://login.yahoo.com/config/login?.src=fpctx&.intl=in&.lang=en-IN&.done=https%3A%2F%2Fin.yahoo.com");
	WebElement ele = driver.findElement(By.id("persistent"));
	//Click_Element.ClickId(driver, "persistent");
	Click_Element.ClickId(driver, "persistent");
//	Actions act=new Actions(driver);
//	act.moveToElement(ele).click().build().perform();
}
}
