package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class idLocator 
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");   //to avoid the illegalstateException

	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("file:///C:/Users/LENOVO/Desktop/html/text.html");
	    
	    driver.findElement(By.id("i1")).sendKeys("admin");
	    driver.findElement(By.id("i2")).sendKeys("passward");
	    driver.findElement(By.id("i3")).sendKeys("special id");
	    driver.findElement(By.id("i4")).sendKeys("passward id");

	}

}
