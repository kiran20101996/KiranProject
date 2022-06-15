package mouseActions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class doubleClickMethod 
{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");   //to avoid the illegalstateException

	    WebDriver driver = new ChromeDriver();    
		driver.manage().window().maximize();       
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
         
		Thread.sleep(4000);
		
		
	
		WebElement doubleclick= driver.findElement(By.xpath("//button[contains(.,'Double')]"));
		
		Actions act = new Actions(driver);
		act.doubleClick(doubleclick).perform();
		
		
		
	}


}
