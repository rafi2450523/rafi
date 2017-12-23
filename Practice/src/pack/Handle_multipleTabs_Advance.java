package pack;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle_multipleTabs_Advance {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://seleniumpractise.blogspot.in/2017/07/multiple-window-examples.html");
		String parent_window = driver.getWindowHandle();
		System.out.println("parent window id is ="+parent_window);
		Set<String> child_windows = driver.getWindowHandles();
		ArrayList<String> tabs= new ArrayList<>(child_windows);
		driver.switchTo().window(tabs.get(0));
		driver.close();
		driver.switchTo().window(tabs.get(1));
		driver.close();
		
	}

}
