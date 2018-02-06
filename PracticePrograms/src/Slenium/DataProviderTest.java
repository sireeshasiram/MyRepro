package Slenium;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
 
import org.openqa.selenium.WebDriver;
 
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
 
import org.testng.annotations.DataProvider;
 
import org.testng.annotations.Test;
public class DataProviderTest {

	private static WebDriver driver;
	

		
	 
	  @DataProvider(name = "Authentication")
	 
	  public static Object[][] credentials() {
	 
	        // The number of times data is repeated, test will be executed the same no. of times
	 
	        // Here it will execute two times
	 
	        return new Object[][] { { "testuser_1", "Test@123" }, { "testuser_1", "Test@123" }};
	 
	  }
	 
	  // Here we are calling the Data Provider object with its Name
	 
	  @Test(dataProvider = "Authentication")
	 
	  public void test(String sUsername, String sPassword) {
		  
		  System.out.println("setting FireFox profile");
			
			FirefoxProfile profile = new FirefoxProfile(); 
			
			profile.setPreference("network.proxy.type", 2);
			
			profile.setPreference("network.proxy.autoconfig_url", "http://10.203.193.52/Zscaler.pac");
	        profile.setPreference("network.proxy.no_proxies_on", "localhost");
		//	profile.setPreference("browser.download.folderList", 2);     

	    //  profile.setAssumeUntrustedCertificateIssuer(true);
	    // profile.setAcceptUntrustedCertificates(true);
	   //  profile.setPreference("webdriver_accept_untrusted_certs", true);
	     //profile.setPreference("webdriver_assume_untrusted_issuer", true);

	     
	     System.out.println("Done with firefox setting");
	 
	      driver = new FirefoxDriver();
	 
	     // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 
	      driver.get("https://www.facebook.com/");
	 
	    //  driver.findElement(By.xpath(".//*[@id='account']/a")).click();
	 
	      // Argument passed will be used here as String Variable
	 
	      driver.findElement(By.id("email")).sendKeys(sUsername);
	 
	      driver.findElement(By.id("pass")).sendKeys(sPassword);
	 
	      driver.findElement(By.id("u_0_l")).click();
	 
	      //driver.findElement(By.xpath(".//*[@id='account_logout']/a")).click();
	 
	      driver.quit();
	 
	  }
	 
 static
	  {
		  DataProviderTest d=new DataProviderTest();
		  d.test(null, null);
		  
		  
	  }
	  
	}
