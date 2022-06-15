package webDriveMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class QuitMethod2
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");   //to avoid the illegalstateException

	    WebDriver driver = new EdgeDriver();   
		driver.manage().window().maximize();      
		driver.get("https://omayo.spot.com");   //launch the web app
		driver.findElement(By.linkText("open a popup window")).click();
		Thread.sleep(10000);
	    driver.quit();


	}

}
