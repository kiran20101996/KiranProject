package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alltags 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");   //to avoid the illegalstateException

	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.selenium.dev/");
	    
	    driver.findElement(By.id("navbarDropdown")).click();
	    Thread.sleep(4000);
        
        
        driver.findElement(By.linkText("Documentation")).click();
	    Thread.sleep(4000);
        driver.navigate().back();	   

        
        driver.findElement(By.tagName("input")).sendKeys("selenium",Keys.ENTER);
	    Thread.sleep(6000);
        driver.navigate().back();	  

        
        driver.findElement(By.partialLinkText("Projects")).click();
	    Thread.sleep(4000);
        driver.navigate().back();	   

        
        driver.findElement(By.cssSelector("a[class='selenium-button selenium-webdriver text-uppercase font-weight-bold']")).click();
	    Thread.sleep(4000);
        driver.navigate().back();	   

        
        driver.findElement(By.xpath("//a[@class='selenium-button selenium-ide text-uppercase font-weight-bold']")).click();
	    Thread.sleep(2000);
        driver.navigate().back();	   

        
        driver.findElement(By.xpath("//a[contains(@class,'grid')]")).click();
	    Thread.sleep(4000);
        driver.navigate().back();	   

        
        driver.findElement(By.xpath("//small[text()='© 2022 Software Freedom Conservancy All Rights Reserved']")).click();
	    Thread.sleep(4000);
        driver.navigate().back();	   


	}


}
