package webDriveMethods;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.edge.EdgeDriver;

public class GetCurrenturl2 
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");   //to avoid the illegalstateException

	    WebDriver driver = new EdgeDriver();    //open the chrome browser
		driver.manage().window().maximize();        //maximize the browser
		driver.get("https://www.swigi.com/");
		
		String Currenturl= driver.getCurrentUrl();
		System.out.println(Currenturl);
	}

}
