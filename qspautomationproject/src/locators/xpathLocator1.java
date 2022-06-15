package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class xpathLocator1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");   //to avoid the illegalstateException

	    WebDriver driver = new FirefoxDriver();
	    driver.manage().window().maximize();
	    driver.get("https://twitter.com/i/flow/login");
	    
	    Thread.sleep(4000);        /* add thread delay is import*/
	    
	    driver.findElement(By.xpath("//input[@class='r-30o5oe r-1niwhzg r-17gur6a r-1yadl64 r-deolkf r-homxoj r-poiln3 r-7cikom r-1ny4l3l r-t60dpp r-1dz5y72 r-fdjqy7 r-13qz1uu']")).sendKeys("1234567890");
	    
	    driver.findElement(By.xpath("//div[@class='css-901oao r-1awozwy r-6koalj r-18u37iz r-16y2uox r-37j5jr r-a023e6 r-b88u0q r-1777fci r-rjixqe r-bcqeeo r-q4m81j r-qvutc0']")).click();

	    	}

}
