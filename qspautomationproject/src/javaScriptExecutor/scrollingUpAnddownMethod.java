package javaScriptExecutor;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrollingUpAnddownMethod 
{
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");   //to avoid the illegalstateException

	     WebDriver driver = new ChromeDriver();    
		driver.manage().window().maximize();       
	    driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.get("https://www.selenium.dev/");
		
		Thread.sleep(4000);
		JavascriptExecutor jre = (JavascriptExecutor)driver;
		jre.executeScript("window.scrollBy(0,1000);");
		
		Thread.sleep(4000);
		jre.executeScript("window.scrollBy(0,-100);");


}
}