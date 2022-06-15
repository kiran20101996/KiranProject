package webDriveMethods;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class GetPageSource1
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");   //to avoid the illegalstateException

	    WebDriver driver = new FirefoxDriver();    //open the chrome browser
		driver.manage().window().maximize();        //maximize the browser
		driver.get("https://www.instagram.com");
	    String sourceCodeOfTheWebPage = driver.getPageSource();
	    System.out.println(sourceCodeOfTheWebPage);
	    
	}

}
