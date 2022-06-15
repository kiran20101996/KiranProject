package qsp;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RunTimePolymorphism 
{

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver;
	
    
	Scanner sn= new Scanner(System.in);
	System.out.println("Enter the browser which you want open");
	String browserValue=sn.nextLine();
	
	
	if (browserValue.equalsIgnoreCase("chrome") )
	{
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");   //to avoid the illegalstateException

	    driver = new ChromeDriver();    //open the chrome browser
		driver.manage().window().maximize();        //maximize the browser
		driver.get("https://www.instagram.com");   //launch the web app
		Thread.sleep(10000);
	    driver.close();
	    
	}
	
	
	else if (browserValue.equalsIgnoreCase("firefox")) 
	   {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\LENOVO\\Desktop\\wcsm7\\geckodriver.exe");
	   
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com");
		Thread.sleep(10000);
	    driver.close();

		
	  }
		
	else if (browserValue.equalsIgnoreCase("EDGE"))
		{
		
		System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
		
		
		 driver = new EdgeDriver();
		 driver.manage().window().minimize();
		 driver.get("https://www.instagram.com");
		 Thread.sleep(10000);
		 driver.close();
			
		}
	
	else
	
	{
		System.out.println("this is not browser");
		
	}
	
	
		


	}

}
