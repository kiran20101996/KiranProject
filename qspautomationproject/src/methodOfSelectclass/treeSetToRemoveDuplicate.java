package methodOfSelectclass;

import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class treeSetToRemoveDuplicate 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");   //to avoid the illegalstateException

	    WebDriver driver = new FirefoxDriver();
	    driver.manage().window().maximize();
	    driver.get("file:///C:/Users/LENOVO/Desktop/html/dropdown/multiselectdropdown.html");
	    Thread.sleep(4000);
	    
	    WebElement dropdown = driver.findElement(By.name("menu"));
	    
         Select sel= new Select(dropdown);
         List<WebElement> opt = sel.getOptions();
         
         
         TreeSet<String> hash = new TreeSet<String>();   //to remove duplicate 
         
         for(int i=0;i<opt.size();i++)
         {
        	 WebElement list = opt.get(i);
        	 String text = list.getText();
        	 
        	 
        	 hash.add(text);
         }
         
         
         for(String str:hash)
         {
        	 System.out.println(str); 
         }
         
         

         
}

}
