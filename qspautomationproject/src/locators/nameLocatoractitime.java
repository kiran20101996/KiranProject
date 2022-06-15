package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class nameLocatoractitime {


		public static void main(String[] args) {
		    System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");   //to avoid the illegalstateException
            WebDriver driver = new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.get("http://desktop-ej6ug3v/login.do");
		    
		    driver.findElement(By.name("username")).sendKeys("admin");
		    driver.findElement(By.name("pwd")).sendKeys("manager");
		    driver.findElement(By.id("loginButton")).click();
		    

		}


	

}
