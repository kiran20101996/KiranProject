 package webDriveMethods;

 import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

 public class setSizeMethod 
 {


	 public static void main (String[] args)
     {
	   System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	
	   WebDriver driver = new ChromeDriver();
	   Dimension targetsize = new Dimension(250,450);
	   driver.manage().window().setSize(targetsize);
    	System.out.println(targetsize);
	
  
     }
	
 }

