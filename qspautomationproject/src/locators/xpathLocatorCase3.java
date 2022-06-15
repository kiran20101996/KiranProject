package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathLocatorCase3       
{

	//using contain function

	public static void main(String[] args) throws InterruptedException 


	{
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");   //to avoid the illegalstateException

    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://twitter.com/");
    
    Thread.sleep(4000);        /* add thread is import*/
    
    driver.findElement(By.xpath("//span[contains(text(),'Sign up with phone or email')]")).click();
    
    //driver.findElement(By.xpath("//span[contains(text(),'Sign up with phone or email')]")).click();
    
    Thread.sleep(4000);  
    
    driver.findElement(By.xpath("//input[contains(@name,'name')]")).sendKeys("rocky");
    driver.findElement(By.xpath("//input[contains(@name,'phone_number')]")).sendKeys("1234567890");
    driver.findElement(By.xpath("//select[contains(@id,'SELECTOR_4')]")).sendKeys("jan");
    driver.findElement(By.xpath("//select[contains(@id,'SELECTOR_5')]")).sendKeys("sunday");
    driver.findElement(By.xpath("//select[contains(@id,'SELECTOR_6')]")).sendKeys("2020");
    driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
    
}
	

}
