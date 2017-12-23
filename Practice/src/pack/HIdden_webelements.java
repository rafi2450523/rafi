package pack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HIdden_webelements {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://seleniumpractise.blogspot.in/2016/08/how-to-automate-radio-button-in.html");
		List<WebElement> radio = driver.findElements(By.id("male"));
		
		int x=driver.findElement(By.id("male")).getLocation().getX();
		int y=driver.findElement(By.id("male")).getLocation().getY();
		System.out.println(x +"---"+ y);
		int count=radio.size();
		
		System.out.println(count);
		for (int i = 0; i < count; i++) {
			WebElement ele = radio.get(i);
			//int x=ele.getLocation().getX();
			
			if (x!=0) {
				ele.click();
				break;
			}
			
		}
	}

}
