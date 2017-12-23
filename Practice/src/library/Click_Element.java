package library;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Click_Element {

	public static void ClickId(WebDriver ldriver,String lid) {
		WebElement ele = ldriver.findElement(By.id("persistent"));
		Actions act=new Actions(ldriver);
		act.moveToElement(ele).click().build().perform();
	}

}
