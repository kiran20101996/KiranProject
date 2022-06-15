package methodOfSelectclass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class getOptionsMethod
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");   //to avoid the illegalstateException

	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("file:///C:/Users/LENOVO/Desktop/html/dropdown/multiselectdropdown.html");
	    Thread.sleep(4000);
	    
	    WebElement dropdown = driver.findElement(By.name("menu"));
	    Select sel = new Select(dropdown);
	    
        List<WebElement> opts= sel.getOptions();
        Thread.sleep(4000);
       
        for(int i=0;i<opts.size();i++)
        {
        	WebElement option = opts.get(i);
        	String str = option.getText();
        	System.out.println(str);
        	
        }
        
        
      /*  for(WebElement option:opts)
        {
        	String str = option.getText();
        	System.out.println(str);
        	
        }*/
        
	   driver.close();
	}




}
