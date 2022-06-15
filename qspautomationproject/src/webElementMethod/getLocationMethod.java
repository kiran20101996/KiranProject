package webElementMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class getLocationMethod 
{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");   //to avoid the illegalstateException

	    WebDriver driver = new FirefoxDriver();    
		driver.manage().window().maximize();       
	//	driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.get("https://integrator.actitime.com/auth/at");
         
		
		WebElement actitimeurl = driver.findElement(By.name("actiTimeUrl"));
		actitimeurl.sendKeys("actitime");
		Point loc1 = actitimeurl.getLocation();
		int x1 = loc1.getX();
		int y1 = loc1.getY();
		System.out.println(x1);
		System.out.println(y1);
		
		
		
		
		WebElement username = driver.findElement(By.name("username"));
		username.sendKeys("actitime");
		Point loc2 = actitimeurl.getLocation();
		int x2 = loc2.getX();
		int y2 = loc2.getY();
		System.out.println(x2);
		System.out.println(y2);
		
		
		WebElement passward = driver.findElement(By.name("password"));
		passward.sendKeys("actitime");
		Point loc3 = actitimeurl.getLocation();
		int x3 = loc3.getX();
		int y3 = loc3.getY();
		System.out.println(x3);
		System.out.println(y3);
		
		WebElement login = driver.findElement(By.xpath("//button[.='Login']"));
		login.click();
		Point loc4 = actitimeurl.getLocation();
		int x4 = loc4.getX();
		int y4 = loc4.getY();
		System.out.println(x4);
		System.out.println(y4);
		
		
		
		
		
	}



}
