package webDriveMethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findElementsMethods {

	

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");   //to avoid the illegalstateException

	    WebDriver driver = new ChromeDriver();    
		driver.manage().window().maximize();        
		driver.get("https://www.google.com/");
         
		Thread.sleep(2000);
		
		driver.switchTo().activeElement().sendKeys("bike");
		
		Thread.sleep(2000);
		                                          //we need parent xpath of web elements
	    List<WebElement> search = driver.findElements(By.xpath("//div[@class='OBMEnb']"));
		
		/*for(int i=0;i<search.size();i++)
		{
			WebElement find = search.get(i);
			String searchElement = find.getText();
			System.out.println(searchElement);
		}
		*/
	    
	    
	  
		for(WebElement suggestion:search ) 
	    {
	    	String searchs= suggestion.getText();
	    	System.out.println(searchs);
	    
	    
		
		
		
	    }
		
		
		
		
		
		
	}

}
