package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class nameLocatorInstagram {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");   //to avoid the illegalstateException

	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.instagram.com");
	    
	    Thread.sleep(4000);
	    
	    driver.findElement(By.cssSelector("input[name='username']")).sendKeys("1234567890");
	    driver.findElement(By.cssSelector("input[name='password']")).sendKeys("1234567890");
	    driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[3]")).click();

	    	}

}
