package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class nameLocatorNetflix {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");   //to avoid the illegalstateException

	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.netflix.com/in/Login");
	    driver.findElement(By.name("userLoginId")).sendKeys("9876543210");
	    driver.findElement(By.name("password")).sendKeys("9876543210");
	    driver.findElement(By.className("btn login-button btn-submit btn-small")).click();
	    

	}

}
