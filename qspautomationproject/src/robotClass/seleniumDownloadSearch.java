package robotClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import webElementMethod.clickMethod;

public class seleniumDownloadSearch 
{
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");   //to avoid the illegalstateException

	    WebDriver driver = new ChromeDriver();    
		driver.manage().window().maximize();       
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.get("https://www.selenium.dev/");
		driver.findElement(By.xpath("//a[.='Downloads']")).click();
		Thread.sleep(4000);
		
         Actions act = new Actions(driver);
         WebElement target = driver.findElement(By.xpath("//h1[.='Downloads']"));
         act.doubleClick(target).perform();
         Thread.sleep(4000);
         
         Robot robot = new Robot();
         robot.keyPress(KeyEvent.VK_CONTROL);
         robot.keyPress(KeyEvent.VK_C);
         robot.keyPress(KeyEvent.VK_C);
         robot.keyPress(KeyEvent.VK_CONTROL);
         Thread.sleep(4000);
         
         driver.findElement(By.xpath("//input[@type='search']")).click();
         Thread.sleep(4000);
         
         
         
         robot.keyPress(KeyEvent.VK_CONTROL);
         robot.keyPress(KeyEvent.VK_V);
         robot.keyPress(KeyEvent.VK_V);
         robot.keyPress(KeyEvent.VK_CONTROL);
         Thread.sleep(4000);
         
         
}
	

}
