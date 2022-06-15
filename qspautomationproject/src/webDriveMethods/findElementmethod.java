package webDriveMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findElementmethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");   //to avoid the illegalstateException

	    WebDriver driver = new ChromeDriver();    //open the chrome browser
		driver.manage().window().maximize();        //maximize the browser
		driver.get("https://integrator.actitime.com/auth/at");
         
		Thread.sleep(2000);

		
		WebElement actitimeurl = driver.findElement(By.name("actiTimeUrl"));
		actitimeurl.sendKeys("actitime");
		
		Thread.sleep(2000);
		
		WebElement username = driver.findElement(By.name("username"));
		username.sendKeys("actitime");
		
		Thread.sleep(2000);
		
		WebElement passward = driver.findElement(By.name("password"));
		passward.sendKeys("actitime");
		
		
		WebElement login = driver.findElement(By.xpath("//button[.='Login']"));
		login.click();
		
		
		
		
		
	}

}
