package Slenium;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CaptchaAutomated {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://www.indianrail.gov.in/pnr_Enq.html");
        String captchaValue = driver.findElement(By.xpath("//span[@id='txtCaptchaDiv']")).getText();  //this will read the captcha
        System.out.println(captchaValue);
        driver.findElement(By.xpath("//input[@id='txtInput']")).sendKeys(captchaValue);
    }
}
