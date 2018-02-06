package Slenium;
import java.awt.AWTException;
import java.awt.Robot;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TooltipText {
    
    @Test
    public void gettooltiptext() throws InterruptedException
    {
     String tooltiptext=null;   
     WebDriver driver=new FirefoxDriver();
     driver.get("http://www.flipkart.com");
     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
WebElement we=driver.findElement(By.xpath(".//*[@id='fk-mainhead-id']/div[1]/div/div[1]/a/img"));
tooltiptext=driver.findElement(By.xpath(".//*[@id='fk-mainhead-id']/div[1]/div/div[1]/a/img")).getAttribute("title");
     Point coordinates = we.getLocation();
     Robot robot=null;
    try {
        robot = new Robot();
    } catch (AWTException e) {
        e.printStackTrace();
    }
robot.mouseMove(coordinates.getX(), coordinates.getY() + 70); // Here This Number Can Vary According to Element
     Thread.sleep(3000);
    
     System.out.println("ToolTipText="+tooltiptext);
     driver.close();
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TooltipText t=new TooltipText();
		
	try {
		t.gettooltiptext();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	}

}