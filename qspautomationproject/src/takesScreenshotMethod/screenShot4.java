package takesScreenshotMethod;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.tracing.EventAttributeValue;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.google.common.io.Files;

public class screenShot4 
{
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");   //to avoid the illegalstateException

	     WebDriver driver = new ChromeDriver();    
		driver.manage().window().maximize();       
	    driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.get("https://integrator.actitime.com/auth/at");
         
	   EventFiringWebDriver efwd = new EventFiringWebDriver(driver);
		File src = efwd.getScreenshotAs(OutputType.FILE);
        File dest = new File("./screenshots/screenshot4.png");
        Files.copy(src, dest);
        
        
        
}

}
