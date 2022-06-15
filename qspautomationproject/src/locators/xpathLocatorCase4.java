package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathLocatorCase4   

{
	// using multiple attribute

	public static void main(String[] args) throws InterruptedException 

	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");   //to avoid the illegalstateException

	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.selenium.dev/");
	    
	    Thread.sleep(4000);        /* add thread is import*/
	    
	    driver.findElement(By.xpath("//a[contains(@class,'webdriver ') or contains(@class,'ide ') or contains(@class,'grid ')]")).click();
	    Thread.sleep(4000);
	    driver.navigate().back();
	    
	    
	    driver.findElement(By.xpath("//a[contains(@id,'navbarDropdown') and contains(@data-toggle,'dropdown')]")).click();
	    Thread.sleep(4000);
	    
	    
	    driver.findElement(By.xpath("//a[contains(@class,'grid ') or contains(@class,'ide ')]")).click();
	    Thread.sleep(4000);
	    driver.navigate().back();
	   
}
}
