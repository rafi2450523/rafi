package practise;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bootstrap_practise {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.in/2016/08/bootstrap-dropdown-example-for-selenium.html");
		driver.findElement(By.xpath(".//*[@id='menu1']"));
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		List<WebElement>dd_menu=driver.findElements(By.xpath("//ul[@ class='dropdown-menu']//li/a"));
		
		for (WebElement ele : dd_menu) {
			String innerhtml = ele.getAttribute("innerHTML");
			System.out.println("values from dd is"+innerhtml);
			
			
		}

	}

}
