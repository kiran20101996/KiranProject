package methodOfSelectclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class isMultipleMethod 
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
	    sel.selectByVisibleText("poha");
        boolean result = sel.isMultiple();
        Thread.sleep(4000);
       System.out.println(result);
	
	   driver.close();
	}


}
