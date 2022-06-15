package qsp;

import org.openqa.selenium.edge.EdgeDriver;

public class LaunchEdgeBrowser2 
{

	public static void main(String[] args) throws InterruptedException 
	{
	 System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
		
		
	 EdgeDriver driver = new EdgeDriver();
	 driver.manage().window().minimize();
	 driver.get("https://www.instagram.com");
     Thread.sleep(1000);
		 

	}

}
