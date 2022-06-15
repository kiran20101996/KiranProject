package stale;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class actitimelogin 
{
	public static void main(String[] args) throws InterruptedException, IOException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");   //to avoid the illegalstateException

    WebDriver driver = new ChromeDriver();    
	driver.manage().window().maximize();       
    driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
	driver.get("http://127.0.0.1/login.do;jsessionid=7n8lcf9uo1ko3");
	
	Thread.sleep(4000);
	WebElement user = driver.findElement(By.name("username"));
	WebElement pass = driver.findElement(By.name("pwd"));
	user.sendKeys("admin");
	pass.sendKeys("admin");

	
	
	driver.navigate().refresh();
	Thread.sleep(4000);
	
	user.sendKeys("name");
	}
	    
	}
