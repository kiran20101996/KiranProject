package methodOfSelectclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class deselectAllMethod 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");   //to avoid the illegalstateException

	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    
	   // driver.get("file:///C:/Users/LENOVO/Desktop/html/dropdown/singleselecteddropdown.html");
	    
	    driver.get("file:///C:/Users/LENOVO/Desktop/html/dropdown/multiselectdropdown.html");
	    Thread.sleep(4000);
	    
	    WebElement dropdown = driver.findElement(By.name("menu"));
	    Select sel = new Select(dropdown);
        
	    
	    for(int i=1;i<=6;i++)
	    {
	    	sel.selectByIndex(i);
	    	Thread.sleep(2000);
	    	
	    }
	    
	    
	    sel.deselectAll();
	    
	
	
	}


}
