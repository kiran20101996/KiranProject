package keywordDrivenFramework;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.rules.Timeout;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest implements IAutoConstant
{
	
	 	static WebDriver driver;
	
	public void openBrowser() throws IOException 
	{
		flib flib = new flib();
		
		String browserValue = flib.readproperties("./data/config.properties", "browser");
		
		String url1 = flib.readproperties("./data/config.properties", "url");

		if(browserValue.equalsIgnoreCase("chrome"))
		{
			System.setProperty(chrome_key,chrome_value);   //to avoid the illegalstateException

		    driver = new ChromeDriver();    
			driver.manage().window().maximize();       
		    driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
			driver.get(url1);
		}
		
		
		else if(browserValue.equalsIgnoreCase("firefox"))
		{
			System.setProperty(gecko_key, gecko_value);
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(40 ,TimeUnit.SECONDS);
			driver.get(url1);
		}
		
		
		else if(browserValue.equalsIgnoreCase("edge"))
		{
			System.setProperty(edge_key,edge_value);
			driver = new EdgeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(40 ,TimeUnit.SECONDS);
			driver.get(url1);
		}
		
		else
		{
			System.out.println("Add valid input");
			
		}
		
	}
	
    public void closeBrowser() 
    {
		driver.quit();
	}

}
