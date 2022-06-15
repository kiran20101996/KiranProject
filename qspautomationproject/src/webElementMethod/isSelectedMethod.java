package webElementMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isSelectedMethod 
{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");   //to avoid the illegalstateException

	    WebDriver driver = new ChromeDriver();    
		driver.manage().window().maximize();       
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.get("http://laptop-smc8hiai/login.do");
		
		WebElement checkboxkeepmeloggedin = driver.findElement(By.id("keepLoggedInCheckBox"));
		boolean status = checkboxkeepmeloggedin .isSelected();
		System.out.println(status);
		Thread.sleep(4000);
		checkboxkeepmeloggedin.click();

		boolean status2 = checkboxkeepmeloggedin .isSelected();
		System.out.println(status2);

		
		
}
}