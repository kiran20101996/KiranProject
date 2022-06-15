package webDriveMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class QuitMethod1
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");   //to avoid the illegalstateException

	    WebDriver driver = new FirefoxDriver();   
		driver.manage().window().maximize();      
		driver.get("https://omayo.spot.com");   //launch the web app
		driver.findElement(By.linkText("open a popup window")).click();
		Thread.sleep(10000);
	    driver.quit();
	


	}

}
