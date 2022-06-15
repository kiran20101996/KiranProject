package qsp;

import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFirefoxBowser 
{
	
	static
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\LENOVO\\Desktop\\wcsm7\\geckodriver.exe");
	}

	public static void main(String[] args) throws InterruptedException 
	{
		
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com");
	    Thread.sleep(10000);
	    driver.close();

	}

}
