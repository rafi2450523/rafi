package pack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import library.Utility;

public class Handle_checkbox_radiobutton {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.in/2016/08/how-to-automate-radio-button-in.html");
		List<WebElement> radio=driver.findElements(By.xpath("//input[@name='lang'][@type='radio']"));
//		for (int i = 0; i <radio.size(); i++) {
//			WebElement local_radio = radio.get(i);
//			String value = local_radio.getAttribute("id");
//			System.out.println("values from radio button are "+ value);
//			if (value.equalsIgnoreCase("python")) {
//				local_radio.click();
//				
//			}
		for (WebElement ele : radio) {
			String local_radio = ele.getAttribute("id");
			System.out.println("id are"+local_radio);
			if (local_radio.equalsIgnoreCase("python")) {
			ele.click();
			}
			Utility.capturescreenshot(driver, "rafi");
			List<WebElement> radio1=driver.findElements(By.xpath("//input[@type='checkbox']"));
			for (WebElement ele1 : radio1) {
				String local = ele1.getAttribute("id");
				System.out.println("id are "+ local);
				if (local.equalsIgnoreCase("sing")) {
					ele1.click();
					
				}
				
			}
			
		
			
			
			
		}
		
	}}


