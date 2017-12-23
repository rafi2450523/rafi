package pack;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;


public class Phantomdemo {

	public static void main(String[] args) {
		File src=new File("C:\\Users\\alluri\\Desktop\\selenium\\phantomjs-2.1.1-windows\\bin\\phantomjs.exe");
	System.setProperty("phantomjs.binary.path",src.getAbsolutePath() );
		WebDriver driver=new PhantomJSDriver();
	driver.get("http:www.facebook.com");
	System.out.println(driver.getTitle());

	}

}
