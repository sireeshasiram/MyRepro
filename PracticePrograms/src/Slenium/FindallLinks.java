package Slenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindallLinks {


	public static void main(String[] args) {
		

		WebDriver driver = new FirefoxDriver();

		driver.get("http://www.toolsqa.com/");
		
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		java.util.List<WebElement> links = driver.findElements(By.tagName("a"));

		System.out.println(links.size());
try {
	

		for (int i = 1; i<links.size(); i=i+1)

		{

			System.out.println(links.get(i).getText());

		}
		driver.findElement(By.xpath("//div[@id='container']"));
		
		driver.close();
	}


catch (ArithmeticException e)
{
	
	System.out.println(e);
	
}



	}	
	
	
}
