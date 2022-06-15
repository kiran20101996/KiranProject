package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class cssSelectorLocator1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");   //to avoid the illegalstateException

	    WebDriver driver = new FirefoxDriver();
	    driver.manage().window().maximize();
	    driver.get("https://twitter.com/i/flow/login");
	    
	    Thread.sleep(4000);        /* add thread is import*/
	    
	    
	    driver.findElement(By.cssSelector("input[class*='r-30o5oe']")).sendKeys("1234567890");
	    driver.findElement(By.cssSelector("div[class*='css-901oao']")).click();

	    	}

}
