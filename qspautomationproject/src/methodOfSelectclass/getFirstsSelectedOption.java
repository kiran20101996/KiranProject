package methodOfSelectclass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class getFirstsSelectedOption 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");   //to avoid the illegalstateException

	    WebDriver driver = new FirefoxDriver();
	    driver.manage().window().maximize();
	    driver.get("file:///C:/Users/LENOVO/Desktop/html/dropdown/multiselectdropdown.html");
	    Thread.sleep(4000);
	    
	    WebElement dropdown = driver.findElement(By.name("menu"));
	    
         Select sel = new Select(dropdown);
         
         for(int i=0;i<6;i++)
         {
        	 sel.selectByIndex(i);
         }
         
         WebElement first= sel.getFirstSelectedOption();
         String firstops = first.getText();
        System.out.println(firstops);
	    	    
	    
	    

	}

	
	
	
	
	

}
