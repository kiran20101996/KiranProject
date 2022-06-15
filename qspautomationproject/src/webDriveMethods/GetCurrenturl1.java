package webDriveMethods;


import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class GetCurrenturl1 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");   //to avoid the illegalstateException

	    WebDriver driver = new FirefoxDriver(); 
		driver.manage().window().maximize();        //maximize the browser
		driver.get("https://www.google.com/");
		
		String Currenturl= driver.getCurrentUrl();
		System.out.println(Currenturl);
		
	

	}

}
