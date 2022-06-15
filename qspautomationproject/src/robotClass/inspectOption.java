package robotClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class inspectOption 
{
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");   //to avoid the illegalstateException

	    WebDriver driver = new ChromeDriver();    
		driver.manage().window().maximize();       
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.get("https://www.selenium.dev");
       
		Actions act = new Actions(driver);
		
		
		act.contextClick().perform();
		Thread.sleep(6000);
	    Robot robot = new Robot();

	    for(int i=0;i<=9;i++)
	    {
	    	robot.keyPress(KeyEvent.VK_DOWN);
	    	robot.keyRelease(KeyEvent.VK_DOWN);
	    	Thread.sleep(4000);
	    }
	    
	    robot.keyPress(KeyEvent.VK_ENTER);
    	robot.keyRelease(KeyEvent.VK_ENTER);

}}
