package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathLocatorCase1
{
	//unique attribute

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");   //to avoid the illegalstateException

	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.instagram.com");
	    
	    Thread.sleep(4000);        /* add thread is import*/
	    
	    driver.findElement(By.xpath("//input[@name='username']")).sendKeys("1234567890");
	    driver.findElement(By.xpath("//input[@name='password']")).sendKeys("1234567890");
	    driver.findElement(By.xpath("//button[@class='sqdOP  L3NKy   y3zKF     ']")).click();

	    	}

}
