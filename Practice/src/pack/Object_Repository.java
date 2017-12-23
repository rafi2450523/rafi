package pack;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import library.Propertyconfig;

public class Object_Repository {
	@Test
	public void TestConfig() throws Exception
	{
		
		Propertyconfig p=new Propertyconfig();
		System.setProperty("webdriver.chrome.driver",p.getchromepath());
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(p.geturl());
	}

}
