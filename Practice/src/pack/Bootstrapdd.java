package pack;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bootstrapdd {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://seleniumpractise.blogspot.in/2016/08/bootstrap-dropdown-example-for-selenium.html");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath(".//*[@id='menu1']"));
		List<WebElement> dd_menu=driver.findElements(By.xpath("//ul[@ class='dropdown-menu']//li/a"));
		for (int i = 0; i < dd_menu.size(); i++) {
			WebElement ele = dd_menu.get(i);
			String innerhtml = ele.getAttribute("innerHTML");
			System.out.println("vales from dd is==="+innerhtml);
			
			
		}

	}

}
