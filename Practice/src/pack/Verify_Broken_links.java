package pack;

import java.io.IOException; 
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.apache.http.protocol.HTTP;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_Broken_links {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Total links are "+ links.size());
		for (int i = 0; i < links.size(); i++) {
			WebElement ele=links.get(i);
			String url = ele.getAttribute("href");
			VerifyLinkActive(url);
		}}

	public static void VerifyLinkActive(String linkurl)   {
		try {
			URL url = new URL(linkurl);
			HttpURLConnection httpurlconnect=(HttpURLConnection)url.openConnection();
			httpurlconnect.setConnectTimeout(3000);
			httpurlconnect.connect();
			if (httpurlconnect.getResponseCode()==200)
			{
			System.out.println(linkurl+"-"+httpurlconnect.getResponseMessage());	
			}
			if(httpurlconnect.getResponseCode()==HttpURLConnection.HTTP_NOT_FOUND);
			{
		System.out.println(linkurl+"-"+httpurlconnect.getResponseMessage()+"-"+HttpURLConnection.HTTP_NOT_FOUND);
		}
			}
			catch (Exception e) {
			
			
		}
		}}
		
	
	