package webDriveMethods;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class NevigateMethod2 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");   //to avoid the illegalstateException

	    WebDriver driver = new EdgeDriver();    //open the chrome browser
		driver.manage().window().maximize();        //maximize the browser
		driver.navigate().to("https://www.google.com");
		driver.switchTo().activeElement().sendKeys("fifa",Keys.ENTER);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().refresh();

	}

}
