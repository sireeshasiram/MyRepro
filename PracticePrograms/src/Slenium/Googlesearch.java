package Slenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement; 
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.firefox.FirefoxDriver; 
import org.openqa.selenium.support.ui.WebDriverWait;

public class Googlesearch {
	
    public static void main(String[] args) {

       //System.setProperty("webdriver.firefox.driver","C:\\Program Files\\Mozilla Firefox\\firefox.exe");
         WebDriver driver = new FirefoxDriver(); 
         driver.get("http://www.google.com"); 
         driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
         WebElement element = driver.findElement(By.name("q"));
         element.sendKeys("seleniumhq!");
         element.submit();

         driver.close();
    }

}