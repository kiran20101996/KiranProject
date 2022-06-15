package javaScriptExecutor;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class disableMethod 
{
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");   //to avoid the illegalstateException

	     WebDriver driver = new ChromeDriver();    
		driver.manage().window().maximize();       
	    driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.get("file:///C:/Users/LENOVO/Desktop/html/text.html");
		JavascriptExecutor jre = (JavascriptExecutor)driver;
		jre.executeScript("document.getElementById(\"i1\").value=\"admin\";");

		driver.findElement(By.id("i2")).sendKeys("manager");
		
		jre.executeScript("document.getElementById(\"i3\").value=\"admim123\";");
		
		driver.findElement(By.id("i4")).sendKeys("manager123");

		
		
		
		
		
		
}
}