package Slenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement; 
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.firefox.FirefoxDriver; 
import org.openqa.selenium.support.ui.WebDriverWait;

public class Lufthansalogin {
	
    public static void main(String[] args) {

         WebDriver driver = new FirefoxDriver(); 
         driver.get("http://www.flipkart.com/"); 
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
         driver.findElement(By.linkText("Log In")).click();
      
      
   WebElement element =driver.findElement(By.xpath("//div[@class='fk-input login-form-input user-email']"));
		   
   element.sendKeys("siri.siram@gmail.com");
     
      driver.findElement(By.xpath("//div[@class='fk-input login-form-input user-pwd']"));   
      driver.quit();
    }
    
    
    
}