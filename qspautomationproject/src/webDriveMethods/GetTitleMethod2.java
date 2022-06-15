package webDriveMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class GetTitleMethod2 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");   //to avoid the illegalstateException

	    WebDriver driver = new EdgeDriver();   
		driver.manage().window().maximize();        
		driver.get("https://www.myntra.com/");
		
		String titleOfLoginPage = driver.getTitle();
		System.out.println(titleOfLoginPage);

	}

}
