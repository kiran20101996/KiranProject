package mouseActions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class rightClickMethod 
{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");   //to avoid the illegalstateException

	    WebDriver driver = new ChromeDriver();    
		driver.manage().window().maximize();       
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
         
		Thread.sleep(4000);
		
		
	
		WebElement rightclick= driver.findElement(By.xpath("//span[.='right click me']"));
		
		Actions act = new Actions(driver);
		act.contextClick(rightclick).perform();
		
		
		
	}


}
