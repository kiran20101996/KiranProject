package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathLocatorCase2
{
      //text function
	
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");   //to avoid the illegalstateException

	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://twitter.com/");
	    
	    Thread.sleep(4000);        /* add thread is import*/
	    
	    driver.findElement(By.xpath("//span[text()='Sign up with phone or email']")).click();
	    
	    //driver.findElement(By.xpath("//span[.='Sign up with phone or email']")).click();
	    
       

	    	}

}
