package pack;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Handle_multiple_windows {
	@Test
	public void Multiple_Windows() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		String parent_window = driver.getWindowHandle();
		System.out.println("Before Switching title is = " +driver.getTitle());
		driver.findElement(By.xpath(".//*[@id='terms-link']")).click();
		Set<String> s1 = driver.getWindowHandles();
		Iterator<String> i1 = s1.iterator();
		while (i1.hasNext()) {
			String child_window = i1.next();
			if (!parent_window.equalsIgnoreCase(child_window)) {
				driver.switchTo().window(child_window);
				Thread.sleep(3000);
				System.out.println("after switching title is = " +driver.getTitle());	
				driver.close();
				}}
		driver.switchTo().window(parent_window);
		System.out.println("Back to parent window =" +driver.getTitle() );
	}}
