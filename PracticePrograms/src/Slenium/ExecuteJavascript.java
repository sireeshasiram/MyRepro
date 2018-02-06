package Slenium;

import java.util.ArrayList;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ExecuteJavascript {
	
 WebDriver driver;

 @BeforeTest
 public void start(){
  driver = new FirefoxDriver();
 }
 
 @Test
 public void javaScriptExec(){
  
  driver.get("http://duckduckgo.com/");
  JavascriptExecutor js=(JavascriptExecutor) driver;
  
  String readyState=(String)js.executeScript("return document.readyState");
  System.out.println("readyState  : "+readyState);

  String title=(String)js.executeScript("return document.title");
  System.out.println("title  : "+title);
		  
  String domain=(String)js.executeScript("return document.domain");
  System.out.println("domain  : "+domain);
		  
  
  String lastModified=(String)js.executeScript("return document.lastModified");
  System.out.println("lastModified  : "+lastModified);
		  
  String URL=(String)js.executeScript("return document.URL");
  System.out.println("Full URL  : "+URL);

 String error=(String) ((JavascriptExecutor) driver).executeScript("return window.jsErrors");
  System.out.println("Windows js errors  :   "+error);
		   
   }

@AfterTest
 public void stop(){
 driver.quit();
 }

}
