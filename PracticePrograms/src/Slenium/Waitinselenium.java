package Slenium;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.dev.XSSFDump;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.Set;


public class Waitinselenium {

	public static void main(String[]args) throws InterruptedException, IOException
	{
	FirefoxDriver driver=new FirefoxDriver();
	
	driver.get("https://www.google.com");
	//webdriver different waits
	driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
	WebDriverWait wait=new WebDriverWait(driver,60);
	wait.until(ExpectedConditions.elementToBeSelected(driver.findElement(By.xpath(null))));
	WebDriverWait wait1=new WebDriverWait(driver,60);
	wait.pollingEvery(54,TimeUnit.SECONDS);
	wait.until(ExpectedConditions.elementToBeSelected(driver.findElement(By.xpath(null))));
	
	WebElement wait3=new FluentWait<WebDriver>(driver).withTimeout(60,TimeUnit.SECONDS).pollingEvery(5,TimeUnit.SECONDS)
	.ignoring(NoSuchElementException.class)
	.until(ExpectedConditions.elementToBeClickable(driver.findElementByXPath("")));
	wait3.click();
	
	Thread.sleep(2000);
	driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	
	driver.findElementById("").getAttribute("class").contains("checked");
	driver.findElementsByTagName("//a").size();
	
	//Handling with multiple windows
	
 Set<String> windowsId=driver.getWindowHandles();

	Iterator<String> itr=windowsId.iterator();
	
	ArrayList<String> Ids=new ArrayList();
	
	while(itr.hasNext())
	{
		Ids.add(itr.next());
		
		
	}
	
	driver.switchTo().window(Ids.get(1));
	driver.switchTo().window(Ids.get(0));
	
	Point dim=driver.manage().window().getPosition();
dim.getX();
dim.getY();
//Actions Class & actions methods

Actions action = new Actions(driver);
action.moveToElement(driver.findElementById("")).build().perform();

WebElement source=driver.findElementByClassName("");
WebElement target=driver.findElementByClassName("");
action.dragAndDrop(source, target).build().perform();
//Handling Alerts
Alert alert = driver.switchTo().alert();
alert.accept();
alert.getText();
alert.equals("");


//work with properties file

Properties User = new Properties();

File file = new File(System.getProperty("user.dir")+"/Slenium/User.properties");

try {
	FileInputStream input = new FileInputStream(file);
User.load(input);
System.out.println("Getting property:"+User.getProperty("UserName"));
} catch (FileNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}


	}
}
