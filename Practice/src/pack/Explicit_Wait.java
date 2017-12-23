package pack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit_Wait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		driver.get("");
		WebDriverWait wait=new WebDriverWait(driver,50);
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("")));
		boolean status=element.isDisplayed();
		if (status) {
System.out.println("Element is displayed");			
		}
		else
		{
			System.out.println("Element is not displayed");
		}

}}
