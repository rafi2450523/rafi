package practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Yatra {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.yatra.com/bus-booking");
		driver.findElement(By.cssSelector("#BE_bus_from_station")).sendKeys("Bangalore");
		driver.findElement(By.cssSelector("#BE_bus_to_station")).sendKeys("Chennai");
		driver.findElement(By.cssSelector("#BE_bus_depart_date")).click();
		driver.findElement(By.xpath("(.//*[@id='a_2017_12_29']/span)[4]")).click();
		driver.findElement(By.xpath(".//*[@id='BE_bus_seats_msdd']/div[1]/span[2]")).click();
		//driver.findriver.findElement(By.cssSelector("#BE_bus_search_btn")).click();
	driver.findElement(By.xpath(".//*[@id='BE_bus_search_btn']")).click();
	}

}
