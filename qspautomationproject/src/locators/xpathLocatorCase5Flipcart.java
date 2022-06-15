package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathLocatorCase5Flipcart 
{
	public static void main(String[] args) throws InterruptedException 

	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");   //to avoid the illegalstateException

	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.flipkart.com/");
	    
	    Thread.sleep(4000);        /* add thread is import*/
	    
	    driver.findElement(By.xpath("//button[text()='✕']")).click();
	    Thread.sleep(4000);
	    
	    driver.findElement(By.xpath("//input[@name='q']")).sendKeys("iphone 13");
	    Thread.sleep(4000);
	    
	    driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
	    Thread.sleep(4000);
	    
	   driver.findElement(By.xpath("//div[@class='_4rR01T']/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='_30jeq3 _1_WHN1']")).click();
	   

}
}
