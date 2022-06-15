package webElementMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getAttributeMethod 
{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");   //to avoid the illegalstateException

	    WebDriver driver = new ChromeDriver();    
		driver.manage().window().maximize();       
	//	driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.get("https://integrator.actitime.com/auth/at");
         
		
		WebElement actitimeurl = driver.findElement(By.name("actiTimeUrl"));
		actitimeurl.sendKeys("actitime");
		WebElement username = driver.findElement(By.name("username"));
		username.sendKeys("actitime");
		WebElement passward = driver.findElement(By.name("password"));
		passward.sendKeys("actitime");
		WebElement login = driver.findElement(By.cssSelector("button[class='_2m183 _2E5C_']"));
		
		
		
		String value1 = actitimeurl.getAttribute("value");
		String value2 = username.getAttribute("type");
		String value3 = passward.getAttribute("type");
		
        System.out.println(value1);
        System.out.println(value2);
        System.out.println(value3);

        login.click();
}


}
