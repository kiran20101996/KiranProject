package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class cssSelectorLocator2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");   //to avoid the illegalstateException

	    WebDriver driver = new EdgeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.instagram.com");
	    
	    Thread.sleep(4000);        /* add thread is import*/
	    
	    driver.findElement(By.cssSelector("input[name='username']")).sendKeys("1234567890");
	    driver.findElement(By.cssSelector("input[name='password']")).sendKeys("1234567890");
	    driver.findElement(By.cssSelector("button[class='sqdOP  L3NKy   y3zKF     ']")).click();

	    	}

}
