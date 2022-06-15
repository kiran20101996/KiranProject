package qsp;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChromeBrowser2 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");   //to avoid the illegalstateException

		ChromeDriver driver = new ChromeDriver();    //open the chrome browser
		driver.manage().window().maximize();        //maximize the browser
		
		driver.get("https://www.flipcart.com");
		driver.get("https://www.amazon.com");
	    Thread.sleep(10000);                      //provide delay of 10 sec
		driver.close();                          //close the browser
		
	}

}
 