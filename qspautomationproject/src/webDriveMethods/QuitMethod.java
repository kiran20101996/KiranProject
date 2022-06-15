package webDriveMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitMethod 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");   //to avoid the illegalstateException

	    WebDriver driver = new ChromeDriver();    //open the chrome browser
		driver.manage().window().maximize();        //maximize the browser
		driver.get("https://omayo.biogspot.com");   //launch the web app
		driver.findElement(By.linkText("open a popup window")).click();
		Thread.sleep(10000);
	    driver.quit();
	

	}

}
