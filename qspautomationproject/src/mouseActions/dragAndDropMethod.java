package mouseActions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragAndDropMethod 
{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");   //to avoid the illegalstateException

	    WebDriver driver = new ChromeDriver();    
		driver.manage().window().maximize();       
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.get("https://demo.guru99.com/test/drag_drop.html");
         
		Thread.sleep(4000);
		
		
	
		WebElement source= driver.findElement(By.xpath("//a[.=' BANK ']"));
		
		WebElement target= driver.findElement(By.xpath("//ol[@id='bank']"));
		
		Actions act = new Actions(driver);
		act.dragAndDrop(source, target).perform();

}
	}
