package Slenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import src.ExcelUtils.ExcelUtils;

public class DataProviderWithExcel_002 {

	private String sTestCaseName;

	private int iTestCaseRow;

	WebDriver driver;

@BeforeTest

  public void beforeMethod() throws Exception {

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

  driver = new FirefoxDriver(profile);

 // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

  driver.get("https://www.facebook.com/"); 

  }	

  @Test(dataProvider = "Authentication")

  public void f(String sUserName, String sPassword) {

	

  //  driver.findElement(By.xpath(".//*[@id='account']/a")).click();

    // Argument passed will be used here as String Variable

    driver.findElement(By.id("email")).sendKeys(sUserName);

    driver.findElement(By.id("pass")).sendKeys(sPassword);

    driver.findElement(By.id("u_0_l")).click();

    //driver.findElement(By.xpath(".//*[@id='account_logout']/a")).click();

    driver.quit();


  }

  @AfterTest

  public void afterMethod() {

	   driver.close();

  }

  @DataProvider(name = "Authentication")

  public Object[][] Authentication() throws Exception{

	    // Setting up the Test Data Excel file

	 	ExcelUtils.setExcelFile("D://siri workspace//Selenium//PracticePrograms//TestData.xlsx","Sheet1");

	 	sTestCaseName = this.toString();

	  	// From above method we get long test case name including package and class name etc.

	  	// The below method will refine your test case name, exactly the name use have used

	  	sTestCaseName = ExcelUtils.getTestCaseName(this.toString());

	    // Fetching the Test Case row number from the Test Data Sheet

	    // Getting the Test Case name to get the TestCase row from the Test Data Excel sheet

	 	iTestCaseRow = ExcelUtils.getRowContains(sTestCaseName,0);

	    Object[][] testObjArray = ExcelUtils.getTableArray("D://siri workspace//Selenium//PracticePrograms//TestData.xlsx","Sheet1",iTestCaseRow);

	    	return (testObjArray);

		}

}