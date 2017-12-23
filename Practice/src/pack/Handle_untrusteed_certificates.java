package pack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class Handle_untrusteed_certificates {
@Test
public void Handle_certificates(){
	DesiredCapabilities cap=new DesiredCapabilities();
	cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe" );
	WebDriver driver=new ChromeDriver(cap);
	driver.manage().window().maximize();
	driver.get("https://www.cacert.org/");
}
}
