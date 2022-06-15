package webElementMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class getRectangleMethod 
{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");   //to avoid the illegalstateException

	    WebDriver driver = new FirefoxDriver();    
		driver.manage().window().maximize();       
	//	driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.get("https://integrator.actitime.com/auth/at");
         
		
		WebElement actitimeurl = driver.findElement(By.name("actiTimeUrl"));
		actitimeurl.sendKeys("actitime");
		
		Rectangle rect1 = actitimeurl.getRect();
		int height1 = rect1.getHeight();
		int width1 = rect1.getWidth();
		
		System.out.println(height1);
		System.out.println(width1);
		
		
		
		WebElement username = driver.findElement(By.name("username"));
		username.sendKeys("actitime");

		Rectangle rect2 = actitimeurl.getRect();
		int height2 = rect2.getHeight();
		int width2 = rect2.getWidth();
		
		System.out.println(height2);
		System.out.println(width2);
		
		
		
		WebElement passward = driver.findElement(By.name("password"));
		passward.sendKeys("actitime");

		Rectangle rect3 = actitimeurl.getRect();
		int height3 = rect3.getHeight();
		int width3 = rect3.getWidth();
		
		System.out.println(height3);
		System.out.println(width3);
		
		
		
		WebElement login = driver.findElement(By.xpath("//button[.='Login']"));
		login.click();

		Rectangle rect4 = actitimeurl.getRect();
		int height4 = rect4.getHeight();
		int width4 = rect4.getWidth();
		
		System.out.println(height4);
		System.out.println(width4);
		
		
		
		
		
		
	}



}
