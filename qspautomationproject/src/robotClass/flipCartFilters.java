package robotClass;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipCartFilters 
{
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");   //to avoid the illegalstateException

	    WebDriver driver = new ChromeDriver();    
		driver.manage().window().maximize();       
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(4000); 
		driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("laptop");
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@class='_24_Dny']")).click();
		Thread.sleep(4000);
	//	driver.findElement(By.xpath("//div[@class='_24_Dny']/ancestor::label[@class='_2iDkf8 t0pPfW']")).click();
	//	Thread.sleep(4000);
	//	driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();

		


}

}
