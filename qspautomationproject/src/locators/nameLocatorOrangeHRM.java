package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class nameLocatorOrangeHRM 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");   //to avoid the illegalstateException

	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	    driver.findElement(By.name("txtUsername")).sendKeys("Admin");
	    driver.findElement(By.name("txtPassword")).sendKeys("admin123");
	    driver.findElement(By.name("Submit")).click();
	    

	}

}
