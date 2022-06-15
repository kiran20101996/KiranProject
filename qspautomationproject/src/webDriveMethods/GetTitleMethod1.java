package webDriveMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetTitleMethod1 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");   //to avoid the illegalstateException

	    WebDriver driver = new FirefoxDriver();   
		driver.manage().window().maximize();        
	    driver.get("https://www.amazon.com/");
		
		String titleOfLoginPage = driver.getTitle();
		System.out.println(titleOfLoginPage);

	}

}
