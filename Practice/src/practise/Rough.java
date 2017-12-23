package practise;
import org.testng.annotations.BeforeMethod;

import org.testng.annotations.AfterMethod;

import org.testng.annotations.Test;

import static org.testng.Assert.*;


import java.util.concurrent.TimeUnit;

import java.util.Date;
import java.io.File;

import org.openqa.selenium.support.ui.Select;

import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.*;

import static org.openqa.selenium.OutputType.*;


public class Rough {
    FirefoxDriver wd;

@BeforeMethod
    
public void setUp() throws Exception {
 System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe")  ;     
wd = new FirefoxDriver();
        
wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

    }
    
    
@Test
    
public void fb () {
        wd.get("https://www.google.co.in/search?q=facebook&ie=utf-8&oe=utf-8&client=firefox-b-ab&gfe_rd=cr&dcr=0&ei=6ZQnWvruDcLDoAPsqYz4BQ");
        
wd.findElement(By.linkText("Facebook - Log In or Sign Up")).click();

    }
    
    
@AfterMethod
    
public void tearDown() {
        
wd.quit();
   
 }
    
    
public static boolean isAlertPresent(FirefoxDriver wd) {
        
try {
           
 wd.switchTo().alert();
           
 return true;
       
 } catch (NoAlertPresentException e) {
           
 return false;
    
    }
    }
}
