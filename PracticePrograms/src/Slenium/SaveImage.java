package Slenium;

import java.awt.AWTException;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.interactions.Actions;

public class SaveImage {
    public static void main(String[] args) throws AWTException, IOException, InterruptedException {
        FirefoxProfile profile = new FirefoxProfile();
        profile.setPreference("browser.download.folderList", 2);
        profile.setPreference( "browser.download.dir", "D:\\images");
        @SuppressWarnings("deprecation")
		WebDriver driver = new FirefoxDriver((Capabilities) profile);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       
       
        driver.get("http://www.urbanspoon.com/rph/1/662659/seattle-cascina-spinasse-restaurant-photos");
        List<WebElement> imgs = driver.findElements(By.xpath("//ul[contains(@id,'collection')]//img"));
        Actions act = new Actions(driver);
       
        for(int i=0; i<imgs.size(); i++){
            act.moveToElement(imgs.get(i)).contextClick().sendKeys("W").perform();
            Iterator<String> windowsAdd = driver.getWindowHandles().iterator();
            String parent = windowsAdd.next();
            String child = windowsAdd.next();
            driver.switchTo().window(child);
           
            act.moveToElement(driver.findElement(By.xpath("//div[@class='image']//img"))).contextClick().sendKeys("v").perform(); //this will by default save in default folder
            Thread.sleep(2000);
           
            Runtime.getRuntime().exec("C:\\selenium\\AutoIT\\enter.exe"); 
            Thread.sleep(2000);
            driver.close();
            driver.switchTo().window(parent);
        }
    }
}